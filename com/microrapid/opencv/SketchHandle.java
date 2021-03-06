package com.microrapid.opencv;

import android.graphics.Bitmap;
import com.tencent.filter.MRect;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SketchHandle
{
  private final long bCj;
  private boolean bCk;

  public SketchHandle()
  {
    AppMethodBeat.i(86268);
    this.bCk = false;
    this.bCj = nativeBokehProcess();
    this.bCk = true;
    AppMethodBeat.o(86268);
  }

  private static native void nativeAutobodyCut(long paramLong, Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  private static native void nativeAutobodyCut2(long paramLong, Bitmap paramBitmap1, Bitmap paramBitmap2, MRect paramMRect1, MRect paramMRect2, MRect paramMRect3);

  private static native long nativeBokehProcess();

  private static native void nativeDispose(long paramLong);

  public static native int nativeGetHandleWidth();

  private static native void nativeLanderBitmap(long paramLong, Bitmap paramBitmap);

  private static native void nativeProcessBitmap(long paramLong, Bitmap paramBitmap);

  private static native void nativeSetFaceFeatures(long paramLong, int[][] paramArrayOfInt);

  private static native void nativeSetFemale(long paramLong, boolean paramBoolean);

  private static native void nativeTestProcessBitmap(long paramLong, Bitmap paramBitmap, String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.microrapid.opencv.SketchHandle
 * JD-Core Version:    0.6.2
 */