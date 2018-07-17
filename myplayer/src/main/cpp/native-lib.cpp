#include <jni.h>
#include <string>
#include <android/log.h>

extern "C"
{
#include <libavformat/avformat.h>
}

#define LOGI(FORMAT,...) __android_log_print(ANDROID_LOG_INFO,"hjwtest",FORMAT,##__VA_ARGS__);

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_example_myplayer_Demo_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {

    av_register_all();
    AVCodec *tmp = av_codec_next(NULL);

    while(tmp != NULL){

        switch (tmp->type){
            case AVMEDIA_TYPE_VIDEO:
                LOGI("[VIDEO]:%s",tmp->name);
                break;
            case AVMEDIA_TYPE_AUDIO:
                LOGI("[AUDIO]:%s",tmp->name);
                break;
            default:
                LOGI("[OTHERS]:%s",tmp->name);
                break;
        }
        tmp = tmp->next;

    }
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
