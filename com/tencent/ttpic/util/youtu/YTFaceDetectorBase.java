package com.tencent.ttpic.util.youtu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.device.DeviceUtils;
import com.tencent.ttpic.util.ResourcePathMapper;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.util.i;
import java.io.File;

public enum YTFaceDetectorBase
{
  private static final String TAG;
  public static String YT_MODEL_DIR;
  public static String YT_MODEL_DIR_BACKUP;
  private volatile boolean faceTrackInited;
  private volatile boolean picFaceDetectInited;

  static
  {
    AppMethodBeat.i(84406);
    INSTANCE = new YTFaceDetectorBase("INSTANCE", 0);
    $VALUES = new YTFaceDetectorBase[] { INSTANCE };
    TAG = YTFaceDetectorBase.class.getSimpleName();
    YT_MODEL_DIR = null;
    YT_MODEL_DIR_BACKUP = null;
    AppMethodBeat.o(84406);
  }

  public static YTFaceDetectorBase getInstance()
  {
    return INSTANCE;
  }

  private int initFaceTrackModel(String paramString)
  {
    AppMethodBeat.i(84403);
    int i = nativeInitFaceTrack(paramString);
    AppMethodBeat.o(84403);
    return i;
  }

  private int initModel(String paramString)
  {
    AppMethodBeat.i(84402);
    int i = nativeInit(paramString);
    AppMethodBeat.o(84402);
    return i;
  }

  private int initPicFaceDetectModel(String paramString)
  {
    AppMethodBeat.i(84404);
    int i = nativeInitPicFaceDetect(paramString);
    AppMethodBeat.o(84404);
    return i;
  }

  private native void nativeDestructor();

  public final void destroy()
  {
    AppMethodBeat.i(84405);
    nativeDestructor();
    this.faceTrackInited = false;
    this.picFaceDetectInited = false;
    AppMethodBeat.o(84405);
  }

  public final int initFaceTrack()
  {
    int i = 0;
    AppMethodBeat.i(84400);
    int j;
    if (this.faceTrackInited)
    {
      AppMethodBeat.o(84400);
      j = i;
    }
    while (true)
    {
      return j;
      String str1 = YT_MODEL_DIR;
      String str2 = str1;
      if (!DeviceUtils.canWriteFile(str1))
        str2 = YT_MODEL_DIR_BACKUP;
      DeviceUtils.canWriteFile(str2);
      int k = 0;
      j = 1;
      while (k < 6)
      {
        str1 = new String[] { "net_1_bin.rpnproto", "net_1.rpnmodel", "net_2_bin.rpnproto", "net_2.rpnmodel", "net_3_bin.rpnproto", "net_3.rpnmodel" }[k];
        if (!FileUtils.copyAssets(VideoGlobalContext.getContext(), "detector/".concat(String.valueOf(str1)), str2 + File.separator + str1))
          j = 0;
        k++;
      }
      for (k = 0; k < 11; k++)
      {
        str1 = new String[] { "align.stb", "align583.rpdm", "align583_bin.rpdc", "eye.rpdm", "eye_bin.rpdc", "eyebrow.rpdm", "eyebrow_bin.rpdc", "mouth.rpdm", "mouth_bin.rpdc", "refine1.rmd", "refine2.rmd" }[k];
        if (!FileUtils.copyAssets(VideoGlobalContext.getContext(), "align/".concat(String.valueOf(str1)), str2 + File.separator + str1))
          j = 0;
      }
      for (k = 0; k < 2; k++)
      {
        str1 = new String[] { "meshBasis.bin", "rotBasis.bin" }[k];
        if (!FileUtils.copyAssets(VideoGlobalContext.getContext(), "poseest/".concat(String.valueOf(str1)), str2 + File.separator + str1))
          j = 0;
      }
      if (j == 0)
      {
        j = -1000;
        AppMethodBeat.o(84400);
      }
      else if (initFaceTrackModel(str2 + File.separator) != 0)
      {
        i.m(TAG, "nativeInit failed");
        j = -1002;
        AppMethodBeat.o(84400);
      }
      else
      {
        nativeSetRefine(false);
        this.faceTrackInited = true;
        AppMethodBeat.o(84400);
        j = i;
      }
    }
  }

  public final int initPicFaceDetect()
  {
    int i = 0;
    AppMethodBeat.i(84401);
    int j;
    if (this.picFaceDetectInited)
    {
      AppMethodBeat.o(84401);
      j = i;
    }
    while (true)
    {
      return j;
      String str1 = YT_MODEL_DIR;
      String str2 = str1;
      if (!DeviceUtils.canWriteFile(str1))
        str2 = YT_MODEL_DIR_BACKUP;
      int k = 0;
      j = 1;
      if (k < 13)
      {
        String str3 = new String[] { "pictrack_align521_16.rpdm", "pictrack_align521_bin.rpdc", "pictrack_contour_16.rpdm", "pictrack_contour_bin.rpdc", "pictrack_eye_16.rpdm", "pictrack_eye_bin.rpdc", "pictrack_eyebrow_16.rpdm", "pictrack_eyebrow_bin.rpdc", "pictrack_FacePicAlignRunner_bin.md5", "pictrack_mouth_16.rpdm", "pictrack_mouth_bin.rpdc", "pictrack_nose_16.rpdm", "pictrack_nose_bin.rpdc" }[k];
        str1 = ResourcePathMapper.getModelResPath(str3);
        LogUtils.e(TAG, "resPath = ".concat(String.valueOf(str1)));
        if ((str1 != null) && (!str1.startsWith("assets://")))
          if (!FileUtils.copyFile(str1 + str3, str2 + File.separator + str3))
          {
            LogUtils.e(TAG, "copyFile failed");
            j = 0;
          }
        while (true)
        {
          k++;
          break;
          if (!FileUtils.copyAssets(VideoGlobalContext.getContext(), "ufa/".concat(String.valueOf(str3)), str2 + File.separator + str3))
          {
            LogUtils.e(TAG, "copyAssets failed");
            j = 0;
          }
        }
      }
      if (j == 0)
        LogUtils.e(TAG, "copy pic face align model failed!");
      if (initPicFaceDetectModel(str2 + File.separator) != 0)
      {
        i.m(TAG, "nativeInit failed");
        j = -1002;
        AppMethodBeat.o(84401);
      }
      else
      {
        nativeSetRefine(false);
        this.picFaceDetectInited = true;
        AppMethodBeat.o(84401);
        j = i;
      }
    }
  }

  public final native int nativeInit(String paramString);

  public final native int nativeInitFaceTrack(String paramString);

  public final native int nativeInitPicFaceDetect(String paramString);

  public final native void nativeSetRefine(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.YTFaceDetectorBase
 * JD-Core Version:    0.6.2
 */