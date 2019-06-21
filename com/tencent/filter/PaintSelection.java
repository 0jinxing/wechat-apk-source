package com.tencent.filter;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PaintSelection
{
  private final long bCj;
  private boolean bCk;
  private QImage bMP;

  public static native void FormatAlphaBitmap(Bitmap paramBitmap);

  public static native boolean HasAlphaBitmap(Bitmap paramBitmap);

  public static native void ProcessBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2);

  private native void nativeAddRound(long paramLong, int paramInt1, int paramInt2, double paramDouble);

  private native void nativeDispose(long paramLong);

  private native byte[] nativeGetResult(long paramLong, int paramInt);

  private native int[] nativeGetSelectRect(long paramLong);

  private native int nativeGetcurrentUndoMark(long paramLong);

  private native void nativeInpaint(long paramLong);

  private native long nativePaintSection(QImage paramQImage);

  private native void nativeRedo(long paramLong);

  private native void nativeReverseSelected(long paramLong);

  private native void nativeRmRound(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble);

  private native void nativeSetSelectionMode(long paramLong, int paramInt);

  private native void nativeTouchBegin(long paramLong, int paramInt1, int paramInt2);

  private native void nativeTouchMove(long paramLong, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2);

  private native void nativeUndo(long paramLong);

  private native void nativeUpdateUndoMark(long paramLong);

  public static native void reverseBitmapAlpha(Bitmap paramBitmap);

  private native void touchBegin1(int paramInt1, int paramInt2);

  protected void finalize()
  {
    AppMethodBeat.i(86386);
    if (this.bCk)
    {
      nativeDispose(this.bCj);
      this.bMP.Dispose();
      this.bMP = null;
      this.bCk = false;
    }
    super.finalize();
    AppMethodBeat.o(86386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.PaintSelection
 * JD-Core Version:    0.6.2
 */