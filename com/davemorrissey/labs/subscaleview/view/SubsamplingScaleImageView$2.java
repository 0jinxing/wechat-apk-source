package com.davemorrissey.labs.subscaleview.view;

import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SubsamplingScaleImageView$2
  implements Handler.Callback
{
  SubsamplingScaleImageView$2(SubsamplingScaleImageView paramSubsamplingScaleImageView)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(115640);
    if ((paramMessage.what == 1) && (SubsamplingScaleImageView.b(this.aKO) != null))
    {
      SubsamplingScaleImageView.c(this.aKO);
      SubsamplingScaleImageView.a(this.aKO, SubsamplingScaleImageView.b(this.aKO));
      this.aKO.performLongClick();
      SubsamplingScaleImageView.d(this.aKO);
    }
    AppMethodBeat.o(115640);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.2
 * JD-Core Version:    0.6.2
 */