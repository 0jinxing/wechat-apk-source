package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class WxImageView$1
  implements Runnable
{
  WxImageView$1(WxImageView paramWxImageView, long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107097);
    long l = System.currentTimeMillis();
    float f1 = Math.min(this.yzr, (float)(l - this.fEG));
    float f2 = this.yzs;
    float f3 = this.yzt;
    this.yBh.k(f2 + f3 * f1, this.cjZ, this.cka);
    if (f1 < this.yzr)
      this.yBh.mHandler.post(this);
    AppMethodBeat.o(107097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.WxImageView.1
 * JD-Core Version:    0.6.2
 */