package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.lucky.ui.a;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.widget.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsCommentDetailUI$15
  implements SnsCommentFooter.b
{
  SnsCommentDetailUI$15(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn)
  {
  }

  public final void Zr(String paramString)
  {
    int i = 8;
    AppMethodBeat.i(38794);
    if (!m.Xx(this.rhJ.cqU()))
    {
      if (this.rqN.rqJ.DT(0) != null)
        a.f(this.rqN.mController.ylL, this.rqN.rqJ.DT(0));
      AppMethodBeat.o(38794);
      return;
    }
    if (this.rhJ.DI(32));
    for (int j = SnsCommentDetailUI.c(this.rqN).getCommentFlag(); ; j = 0)
    {
      if (d.fF(j, 8))
      {
        paramString = paramString.substring(SnsCommentDetailUI.c(this.rqN).getCommentAtPrefix().length());
        ab.i("MicroMsg.SnsCommentDetailUI", "send atFriend ad detail comment");
        am.a.a(this.rhJ, 16, paramString, SnsCommentDetailUI.c(this.rqN).getCommentInfo(), j, SnsCommentDetailUI.f(this.rqN));
        SnsCommentDetailUI.c(this.rqN).setText("");
        SnsCommentDetailUI.c(this.rqN).lj(false);
        ab.i("MicroMsg.SnsCommentDetailUI", "comment send imp!");
        SnsCommentDetailUI.x(this.rqN);
        AppMethodBeat.o(38794);
        break;
      }
      ab.i("MicroMsg.SnsCommentDetailUI", "send detail comment");
      n localn = this.rhJ;
      if (this.rhJ.DI(32));
      while (true)
      {
        am.a.a(localn, i, paramString, SnsCommentDetailUI.c(this.rqN).getCommentInfo(), j, SnsCommentDetailUI.f(this.rqN));
        break;
        i = 2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.15
 * JD-Core Version:    0.6.2
 */