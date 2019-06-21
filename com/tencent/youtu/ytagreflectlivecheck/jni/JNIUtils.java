package com.tencent.youtu.ytagreflectlivecheck.jni;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.DataPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.FaceFrame;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.PersonLive;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.PersonLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class JNIUtils
{
  private static final String TAG = "LightLiveCheck";

  public static Timeval getTimeval()
  {
    AppMethodBeat.i(123169);
    long l = System.nanoTime() / 1000L;
    Timeval localTimeval = new Timeval(l / 1000000L, (int)(l % 1000000L));
    AppMethodBeat.o(123169);
    return localTimeval;
  }

  private static ColorImgData translation(RawImgData paramRawImgData)
  {
    AppMethodBeat.i(123174);
    ColorImgData localColorImgData = new ColorImgData();
    localColorImgData.setImage(new String(Base64.encode(paramRawImgData.frameBuffer, 2)));
    localColorImgData.setCapture_time(paramRawImgData.captureTime);
    localColorImgData.setX(paramRawImgData.x);
    localColorImgData.setY(paramRawImgData.y);
    AppMethodBeat.o(123174);
    return localColorImgData;
  }

  private static FaceFrame translation(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123172);
    FaceFrame localFaceFrame = new FaceFrame();
    localFaceFrame.setImage(new String(Base64.encode(paramArrayOfByte, 2)));
    AppMethodBeat.o(123172);
    return localFaceFrame;
  }

  private static PersonLive translation(DataPack paramDataPack, byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(123171);
    PersonLive localPersonLive = new PersonLive();
    localPersonLive.setReflect_data(translation(paramDataPack, 0));
    localPersonLive.setColor_data(paramString);
    localPersonLive.setPlatform(2);
    paramDataPack = new ArrayList();
    paramDataPack.add(translation(paramArrayOfByte));
    localPersonLive.setFrames(paramDataPack);
    AppMethodBeat.o(123171);
    return localPersonLive;
  }

  public static PersonLiveReq translation(FullPack paramFullPack, String paramString)
  {
    AppMethodBeat.i(123170);
    PersonLiveReq localPersonLiveReq = new PersonLiveReq();
    localPersonLiveReq.setApp_id("starimeliu");
    localPersonLiveReq.setBusiness_name("starimeliu");
    localPersonLiveReq.setPerson_id("starimeliu");
    localPersonLiveReq.setLivedata(translation(paramFullPack.AGin, paramFullPack.frames, paramString));
    localPersonLiveReq.setLive_type(2);
    localPersonLiveReq.setReq_type("live");
    AppMethodBeat.o(123170);
    return localPersonLiveReq;
  }

  private static ReflectColorData translation(DataPack paramDataPack, int paramInt)
  {
    AppMethodBeat.i(123173);
    ReflectColorData localReflectColorData = new ReflectColorData();
    Object localObject = new ArrayList();
    for (paramInt = 0; paramInt < paramDataPack.videoData.length; paramInt++)
      ((ArrayList)localObject).add(translation(paramDataPack.videoData[paramInt]));
    localReflectColorData.setImages_data((ArrayList)localObject);
    localReflectColorData.setBegin_time(paramDataPack.beginTime);
    localReflectColorData.setChangepoint_time(paramDataPack.changePointTime);
    localReflectColorData.setOffset_sys(paramDataPack.offsetSys);
    localReflectColorData.setFrame_num(paramDataPack.frameNum);
    localReflectColorData.setLandmark_num(paramDataPack.landMarkNum);
    localReflectColorData.setWidth(paramDataPack.width);
    localReflectColorData.setHeight(paramDataPack.height);
    try
    {
      localObject = new java/lang/String;
      ((String)localObject).<init>(paramDataPack.log, "UTF-8");
      localReflectColorData.setLog((String)localObject);
      label132: localReflectColorData.setConfig_begin(paramDataPack.config_begin);
      AppMethodBeat.o(123173);
      return localReflectColorData;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label132;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.jni.JNIUtils
 * JD-Core Version:    0.6.2
 */