package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadConfigView$9
  implements View.OnClickListener
{
  SnsUploadConfigView$9(SnsUploadConfigView paramSnsUploadConfigView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39696);
    paramView = this.rCy;
    if (SnsUploadConfigView.f(this.rCy));
    for (boolean bool = false; ; bool = true)
    {
      SnsUploadConfigView.c(paramView, bool);
      if (SnsUploadConfigView.f(this.rCy))
        SnsUploadConfigView.g(this.rCy);
      SnsUploadConfigView.h(this.rCy);
      AppMethodBeat.o(39696);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.9
 * JD-Core Version:    0.6.2
 */