package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MultiTouchImageView$1
  implements Runnable
{
  MultiTouchImageView$1(MultiTouchImageView paramMultiTouchImageView, long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106973);
    long l = System.currentTimeMillis();
    float f1 = Math.min(this.yzr, (float)(l - this.fEG));
    float f2 = this.yzs;
    float f3 = this.yzt;
    this.yzu.k(f2 + f3 * f1, this.cjZ, this.cka);
    if (f1 < this.yzr)
      this.yzu.mHandler.post(this);
    AppMethodBeat.o(106973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MultiTouchImageView.1
 * JD-Core Version:    0.6.2
 */