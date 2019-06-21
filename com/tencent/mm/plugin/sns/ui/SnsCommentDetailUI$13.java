package com.tencent.mm.plugin.sns.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.lucky.ui.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsCommentDetailUI$13
  implements SnsCommentFooter.a
{
  SnsCommentDetailUI$13(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn)
  {
  }

  public final void ctc()
  {
    AppMethodBeat.i(38792);
    if (!m.Xx(this.rhJ.cqU()))
      if ((SnsCommentDetailUI.y(this.rqN) != null) && (SnsCommentDetailUI.y(this.rqN).isShowing()))
        AppMethodBeat.o(38792);
    while (true)
    {
      return;
      SnsCommentDetailUI.a(this.rqN, a.f(this.rqN.mController.ylL, this.rqN.rqJ.DT(0)));
      AppMethodBeat.o(38792);
      continue;
      if ((this.rqN.mController.ymc == 1) || (SnsCommentDetailUI.c(this.rqN).cte()))
      {
        AppMethodBeat.o(38792);
      }
      else
      {
        SnsCommentDetailUI.z(this.rqN);
        AppMethodBeat.o(38792);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.13
 * JD-Core Version:    0.6.2
 */