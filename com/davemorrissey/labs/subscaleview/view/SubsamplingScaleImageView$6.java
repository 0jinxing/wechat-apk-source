package com.davemorrissey.labs.subscaleview.view;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SubsamplingScaleImageView$6
  implements Runnable
{
  SubsamplingScaleImageView$6(SubsamplingScaleImageView paramSubsamplingScaleImageView, int paramInt, Bitmap paramBitmap, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115647);
    long l1 = System.currentTimeMillis();
    if (this.aKP != 0)
      SubsamplingScaleImageView.b(this.aKO, this.aKO.a(this.val$bitmap, this.aKP));
    long l2 = System.currentTimeMillis();
    ab.i(SubsamplingScaleImageView.l(this.aKO), "alvinluo onImageLoaded rotaeAndScaleBitmap %d", new Object[] { Long.valueOf(l2 - l1) });
    this.aKO.post(new SubsamplingScaleImageView.6.1(this));
    AppMethodBeat.o(115647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.6
 * JD-Core Version:    0.6.2
 */