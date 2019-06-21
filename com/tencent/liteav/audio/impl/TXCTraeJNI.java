package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.liteav.audio.TXCLiveBGMPlayer;
import com.tencent.liteav.audio.d;
import com.tencent.liteav.audio.impl.Play.TXCAudioBasePlayController;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.lang.ref.WeakReference;

public class TXCTraeJNI
{
  private static Context mContext;
  private static WeakReference<d> mTraeRecordListener;

  static
  {
    AppMethodBeat.i(66566);
    b.e();
    nativeCacheClassForNative();
    AppMethodBeat.o(66566);
  }

  public static void InitTraeEngineLibrary(Context paramContext)
  {
    AppMethodBeat.i(66562);
    if (paramContext == null)
    {
      TXCLog.e("TXCAudioJNI", "nativeInitTraeEngine failed, context is null!");
      AppMethodBeat.o(66562);
    }
    while (true)
    {
      return;
      try
      {
        Object localObject1 = paramContext.getApplicationInfo();
        paramContext = ((ApplicationInfo)localObject1).nativeLibraryDir;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((ApplicationInfo)localObject1).dataDir + "/lib";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("/data/data/");
        localObject1 = ((ApplicationInfo)localObject1).packageName + "/lib";
        nativeAppendLibraryPath("add_libpath:".concat(String.valueOf(paramContext)));
        nativeAppendLibraryPath("add_libpath:".concat(String.valueOf(localObject2)));
        nativeAppendLibraryPath("add_libpath:".concat(String.valueOf(localObject1)));
        AppMethodBeat.o(66562);
      }
      catch (UnsatisfiedLinkError paramContext)
      {
        AppMethodBeat.o(66562);
      }
    }
  }

  public static void SetAudioMode(int paramInt)
  {
    AppMethodBeat.i(66561);
    a.a().a(paramInt);
    AppMethodBeat.o(66561);
  }

  public static native void nativeAppendLibraryPath(String paramString);

  public static native void nativeCacheClassForNative();

  public static boolean nativeCheckTraeEngine(Context paramContext)
  {
    AppMethodBeat.i(66563);
    boolean bool;
    if (paramContext == null)
    {
      TXCLog.e("TXCAudioJNI", "nativeCheckTraeEngine failed, context is null!");
      AppMethodBeat.o(66563);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.getApplicationInfo();
      String str1 = paramContext.nativeLibraryDir;
      String str2 = paramContext.dataDir + "/lib";
      String str3 = "/data/data/" + paramContext.packageName + "/lib";
      String str4 = b.f();
      paramContext = str4;
      if (str4 == null)
        paramContext = "";
      if (new File(str1 + "/libtraeimp-rtmp-armeabi-v7a.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(str2 + "/libtraeimp-rtmp-armeabi-v7a.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(str3 + "/libtraeimp-rtmp-armeabi-v7a.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(paramContext + "/libtraeimp-rtmp-armeabi-v7a.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(str1 + "/libtraeimp-rtmp-armeabi.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(str2 + "/libtraeimp-rtmp-armeabi.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(str3 + "/libtraeimp-rtmp-armeabi.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else if (new File(paramContext + "/libtraeimp-rtmp-armeabi.so").exists())
      {
        AppMethodBeat.o(66563);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(66563);
        bool = false;
      }
    }
  }

  public static native void nativeSetAudioMode(int paramInt);

  public static native void nativeSetTraeConfig(String paramString);

  public static native boolean nativeTraeIsPlaying();

  public static native boolean nativeTraeIsRecording();

  public static native void nativeTraeSetChangerType(int paramInt1, int paramInt2);

  public static native void nativeTraeSetRecordMute(boolean paramBoolean);

  public static native void nativeTraeSetRecordReverb(int paramInt);

  public static native void nativeTraeSetVolume(float paramFloat);

  public static native void nativeTraeStartPlay(Context paramContext);

  public static native void nativeTraeStartRecord(Context paramContext, int paramInt1, int paramInt2, int paramInt3);

  public static native void nativeTraeStopPlay();

  public static native void nativeTraeStopRecord(boolean paramBoolean);

  public static void onRecordEncData(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66559);
    if ((mTraeRecordListener != null) && (mTraeRecordListener.get() != null))
      ((d)mTraeRecordListener.get()).b(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(66559);
  }

  public static void onRecordError(int paramInt, String paramString)
  {
    AppMethodBeat.i(66560);
    if ((mTraeRecordListener != null) && (mTraeRecordListener.get() != null))
      ((d)mTraeRecordListener.get()).a(paramInt, paramString);
    AppMethodBeat.o(66560);
  }

  public static void onRecordPcmData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66558);
    if ((mTraeRecordListener != null) && (mTraeRecordListener.get() != null))
      ((d)mTraeRecordListener.get()).a(paramArrayOfByte, TXCTimeUtil.getTimeTick(), paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(66558);
  }

  public static void onRecordRawPcmData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66557);
    if ((mTraeRecordListener != null) && (mTraeRecordListener.get() != null))
      ((d)mTraeRecordListener.get()).a(paramArrayOfByte, TXCTimeUtil.getTimeTick(), paramInt1, paramInt2, paramInt3, false);
    AppMethodBeat.o(66557);
  }

  public static void setContext(Context paramContext)
  {
    mContext = paramContext;
  }

  public static void setTraeRecordListener(WeakReference<d> paramWeakReference)
  {
    mTraeRecordListener = paramWeakReference;
  }

  public static boolean traeStartPlay(Context paramContext)
  {
    AppMethodBeat.i(66564);
    boolean bool;
    if ((!TXCAudioBasePlayController.nativeIsTracksEmpty()) || (TXCLiveBGMPlayer.getInstance().isPlaying()))
    {
      InitTraeEngineLibrary(paramContext);
      nativeTraeStartPlay(paramContext);
      bool = true;
      AppMethodBeat.o(66564);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66564);
    }
  }

  public static boolean traeStopPlay()
  {
    AppMethodBeat.i(66565);
    boolean bool;
    if ((TXCAudioBasePlayController.nativeIsTracksEmpty()) && (!TXCLiveBGMPlayer.getInstance().isPlaying()))
    {
      nativeTraeStopPlay();
      bool = true;
      AppMethodBeat.o(66565);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66565);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.TXCTraeJNI
 * JD-Core Version:    0.6.2
 */