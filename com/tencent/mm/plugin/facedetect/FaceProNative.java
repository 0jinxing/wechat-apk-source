package com.tencent.mm.plugin.facedetect;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class FaceProNative
{
  public static final int ROTFLIPHOR = 3;
  public static final int ROTFLIPLEFT = 4;
  public static final int ROTFLIPRIGHT = 5;
  public static final int ROTLEFT = 1;
  public static final int ROTRIGHT = 2;
  public static final int ROTSTABLE = 0;
  private static final String TAG = "MicroMsg.FaceProNative";
  private static final long TIMEOUT_CHECKER = 3600000L;
  private static String[] cachedStr;
  public static volatile boolean hasDetectInit;
  private static long lastCheckTime;
  private long nativePtr;

  static
  {
    AppMethodBeat.i(49);
    hasDetectInit = false;
    k.a("FacePro", FaceProNative.class.getClassLoader());
    k.a("wechatvoicereco", FaceProNative.class.getClassLoader());
    k.a("wechatxlog", FaceProNative.class.getClassLoader());
    nativeInit();
    cachedStr = null;
    lastCheckTime = -1L;
    AppMethodBeat.o(49);
  }

  public FaceProNative()
  {
    AppMethodBeat.i(44);
    NativeConstructor();
    AppMethodBeat.o(44);
  }

  private native void NativeConstructor();

  private native void NativeDestructor();

  public static void checkInitDetectFace()
  {
    AppMethodBeat.i(47);
    try
    {
      ab.c("MicroMsg.FaceProNative", "checkInitDetectFace, hasDetectInit: %s", new Object[] { Boolean.valueOf(hasDetectInit) });
      FaceProNative.1 local1 = new com/tencent/mm/plugin/facedetect/FaceProNative$1;
      local1.<init>();
      al.d(local1);
      return;
    }
    finally
    {
      AppMethodBeat.o(47);
    }
  }

  public static int detectFaceCnt(String paramString)
  {
    return 0;
  }

  public static native int engineVersion();

  @Keep
  public static String[] getDynamicValue(String paramString)
  {
    AppMethodBeat.i(48);
    Object localObject;
    if (System.currentTimeMillis() - lastCheckTime >= 3600000L)
    {
      lastCheckTime = System.currentTimeMillis();
      localObject = ((a)g.K(a.class)).Nu().getValue(paramString);
      if (bo.isNullOrNil((String)localObject));
    }
    try
    {
      paramString = new org/json/JSONArray;
      paramString.<init>((String)localObject);
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(5);
      int i = paramString.length();
      for (int j = 0; j < i; j++)
        ((ArrayList)localObject).add(paramString.getString(j));
      cachedStr = new String[i];
      ((ArrayList)localObject).toArray(cachedStr);
      paramString = cachedStr;
      AppMethodBeat.o(48);
      return paramString;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FaceProNative", paramString, "hy: array resolve failed", new Object[0]);
    }
  }

  public static native int nativeFacedetectInitBin(byte[] paramArrayOfByte);

  public static native void nativeFacedetectRelease();

  public static native int nativeFacedetectWithBitmap(Object paramObject);

  public static native boolean nativeInit();

  public void destroy()
  {
    AppMethodBeat.i(45);
    NativeDestructor();
    AppMethodBeat.o(45);
  }

  public native FaceProNative.FaceStatus engineFaceProcess(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public native int[] engineGetAllMotions();

  public native int engineGetCurrMotion();

  public native String engineGetCurrMotionData();

  public native int engineGroupChange();

  public native int engineInit(String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3);

  public native int engineNextMotion();

  public native int engineRelease();

  public native int engineReleaseCurrMotion();

  public native FaceProNative.FaceResult engineReleaseOut();

  public native int engineSetVoiceData(byte[] paramArrayOfByte);

  public native int engineStartRecord();

  protected void finalize()
  {
    AppMethodBeat.i(46);
    super.finalize();
    NativeDestructor();
    AppMethodBeat.o(46);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.FaceProNative
 * JD-Core Version:    0.6.2
 */