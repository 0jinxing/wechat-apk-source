package com.tencent.youtu.android.segmenter;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SegmenterLib
{
  private static boolean sLoadOpenclSuccess;
  private int mErrorCode;
  private int mErrorType;
  private long nativePtr;

  // ERROR //
  static
  {
    // Byte code:
    //   0: ldc 20
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: putstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   9: invokestatic 34	com/tencent/ttpic/manager/FeatureManager:isSegmentationReady	()Z
    //   12: ifeq +238 -> 250
    //   15: ldc 36
    //   17: invokestatic 42	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   20: ldc 44
    //   22: invokestatic 42	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   25: getstatic 49	com/tencent/ttpic/fabby/FabbyManager:sChooseGPU_Segment	Z
    //   28: ifne +35 -> 63
    //   31: ldc 51
    //   33: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   36: iconst_0
    //   37: putstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   40: getstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   43: ifne +207 -> 250
    //   46: getstatic 49	com/tencent/ttpic/fabby/FabbyManager:sChooseGPU_Segment	Z
    //   49: ifeq +201 -> 250
    //   52: ldc 51
    //   54: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   57: ldc 20
    //   59: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: return
    //   63: ldc 57
    //   65: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   68: iconst_1
    //   69: putstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   72: goto -32 -> 40
    //   75: astore_0
    //   76: aload_0
    //   77: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   80: getstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   83: ifne +167 -> 250
    //   86: getstatic 49	com/tencent/ttpic/fabby/FabbyManager:sChooseGPU_Segment	Z
    //   89: ifeq +161 -> 250
    //   92: ldc 51
    //   94: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   97: ldc 20
    //   99: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: goto -40 -> 62
    //   105: astore_0
    //   106: aload_0
    //   107: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   110: ldc 20
    //   112: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: goto -53 -> 62
    //   118: astore_0
    //   119: aload_0
    //   120: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   123: ldc 20
    //   125: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: goto -66 -> 62
    //   131: astore_0
    //   132: aload_0
    //   133: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   136: getstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   139: ifne +111 -> 250
    //   142: getstatic 49	com/tencent/ttpic/fabby/FabbyManager:sChooseGPU_Segment	Z
    //   145: ifeq +105 -> 250
    //   148: ldc 51
    //   150: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   153: ldc 20
    //   155: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: goto -96 -> 62
    //   161: astore_0
    //   162: aload_0
    //   163: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   166: ldc 20
    //   168: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -109 -> 62
    //   174: astore_0
    //   175: aload_0
    //   176: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   179: getstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   182: ifne +68 -> 250
    //   185: getstatic 49	com/tencent/ttpic/fabby/FabbyManager:sChooseGPU_Segment	Z
    //   188: ifeq +62 -> 250
    //   191: ldc 51
    //   193: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   196: ldc 20
    //   198: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: goto -139 -> 62
    //   204: astore_0
    //   205: aload_0
    //   206: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   209: ldc 20
    //   211: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: goto -152 -> 62
    //   217: astore_1
    //   218: getstatic 28	com/tencent/youtu/android/segmenter/SegmenterLib:sLoadOpenclSuccess	Z
    //   221: ifne +14 -> 235
    //   224: getstatic 49	com/tencent/ttpic/fabby/FabbyManager:sChooseGPU_Segment	Z
    //   227: ifeq +8 -> 235
    //   230: ldc 51
    //   232: invokestatic 52	com/tencent/ttpic/manager/FeatureManager:loadLibrary	(Ljava/lang/String;)V
    //   235: ldc 20
    //   237: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: aload_1
    //   241: athrow
    //   242: astore_0
    //   243: aload_0
    //   244: invokestatic 63	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   247: goto -12 -> 235
    //   250: ldc 20
    //   252: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: goto -193 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   15	40	75	java/lang/UnsatisfiedLinkError
    //   63	72	75	java/lang/UnsatisfiedLinkError
    //   52	57	105	java/lang/Exception
    //   92	97	118	java/lang/Exception
    //   15	40	131	java/lang/RuntimeException
    //   63	72	131	java/lang/RuntimeException
    //   148	153	161	java/lang/Exception
    //   15	40	174	java/lang/Exception
    //   63	72	174	java/lang/Exception
    //   191	196	204	java/lang/Exception
    //   15	40	217	finally
    //   63	72	217	finally
    //   76	80	217	finally
    //   132	136	217	finally
    //   175	179	217	finally
    //   230	235	242	java/lang/Exception
  }

  public SegmenterLib(String paramString1, String paramString2)
  {
    AppMethodBeat.i(84506);
    this.mErrorCode = 0;
    this.mErrorType = 0;
    initWithProto(paramString1, paramString2);
    this.mErrorCode = getInitErrorCode();
    this.mErrorType = getInitErrorType();
    AppMethodBeat.o(84506);
  }

  private native boolean getGPUSupportOpenCL();

  private native int getInitErrorCode();

  private native int getInitErrorType();

  private native boolean initWithProto(String paramString1, String paramString2);

  public native void clearSegmentBuffer();

  public native int compileKernel();

  public native int copyBufferToTexture(int paramInt1, int paramInt2, int paramInt3);

  public native int copyTextureToBuffer(int paramInt1, int paramInt2, int paramInt3);

  public native void destroy();

  public int getErrorCode()
  {
    return this.mErrorCode;
  }

  public int getErrorType()
  {
    return this.mErrorType;
  }

  public long getNativePtr()
  {
    return this.nativePtr;
  }

  public boolean isGPUSupportOpenCL()
  {
    AppMethodBeat.i(84505);
    boolean bool;
    if (sLoadOpenclSuccess)
    {
      bool = getGPUSupportOpenCL();
      AppMethodBeat.o(84505);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84505);
    }
  }

  public boolean isInitSuccess()
  {
    if ((this.mErrorCode == 0) && (this.mErrorType == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public native Bitmap segment(Bitmap paramBitmap);

  public native void segmentOnBit(Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public native void segmentOnBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public native int segmentOnTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6);

  public native int segmentOnTextureV2(int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public void setNativePtr(long paramLong)
  {
    this.nativePtr = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.android.segmenter.SegmenterLib
 * JD-Core Version:    0.6.2
 */