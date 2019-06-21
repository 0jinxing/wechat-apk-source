package com.davemorrissey.labs.subscaleview.view;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SubsamplingScaleImageView$7
  implements Runnable
{
  SubsamplingScaleImageView$7(SubsamplingScaleImageView paramSubsamplingScaleImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115649);
    if ((SubsamplingScaleImageView.u(this.aKO) != null) && (!SubsamplingScaleImageView.u(this.aKO).isRecycled()))
    {
      ab.i(SubsamplingScaleImageView.l(this.aKO), "alvinluo rotateAndScale fullImageBitmap");
      SubsamplingScaleImageView.a(this.aKO, this.aKO.a(SubsamplingScaleImageView.u(this.aKO), SubsamplingScaleImageView.t(this.aKO)));
    }
    this.aKO.post(new SubsamplingScaleImageView.7.1(this));
    AppMethodBeat.o(115649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.7
 * JD-Core Version:    0.6.2
 */