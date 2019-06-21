package com.davemorrissey.labs.subscaleview.view;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SubsamplingScaleImageView$5
  implements Runnable
{
  SubsamplingScaleImageView$5(SubsamplingScaleImageView paramSubsamplingScaleImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115645);
    if (this.val$bitmap != null)
    {
      long l1 = System.currentTimeMillis();
      SubsamplingScaleImageView.a(this.aKO, this.aKO.a(this.val$bitmap, SubsamplingScaleImageView.t(this.aKO)));
      long l2 = System.currentTimeMillis();
      ab.i(SubsamplingScaleImageView.l(this.aKO), "alvinluo rotate and scale fullImageBitmap cost: %d", new Object[] { Long.valueOf(l2 - l1) });
    }
    AppMethodBeat.o(115645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.5
 * JD-Core Version:    0.6.2
 */