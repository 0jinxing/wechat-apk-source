package com.davemorrissey.labs.subscaleview.view;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SubsamplingScaleImageView$6$1
  implements Runnable
{
  SubsamplingScaleImageView$6$1(SubsamplingScaleImageView.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115646);
    if ((this.aKS.aKQ) || (this.aKS.aKR))
    {
      this.aKS.aKO.invalidate();
      this.aKS.aKO.requestLayout();
    }
    AppMethodBeat.o(115646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.6.1
 * JD-Core Version:    0.6.2
 */