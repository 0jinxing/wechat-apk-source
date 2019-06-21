package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.lucky.ui.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsCommentDetailUI$30
  implements View.OnClickListener
{
  SnsCommentDetailUI$30(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38813);
    if (!m.Xx(this.rhJ.cqU()))
    {
      a.f(this.rqN.mController.ylL, this.rqN.rqJ.DT(0));
      AppMethodBeat.o(38813);
      return;
    }
    SnsCommentDetailUI.c(this.rqN).setCommentInfo(null);
    SnsCommentDetailUI.c(this.rqN).setCommentFlag(0);
    SnsCommentDetailUI.c(this.rqN).setCommentHint(this.rqN.getString(2131303840));
    SnsCommentDetailUI.c(this.rqN).setCommentInfo(new cat());
    SnsCommentDetailUI.c(this.rqN).lj(true);
    if ((this.rhJ.DI(32)) && ((this.rhJ.cqu().xfI.wbL & 0x8) != 0))
      SnsCommentDetailUI.c(this.rqN).lk(true);
    while (true)
    {
      SnsCommentDetailUI.E(this.rqN).setVisibility(8);
      SnsCommentDetailUI.z(this.rqN);
      AppMethodBeat.o(38813);
      break;
      SnsCommentDetailUI.c(this.rqN).lk(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.30
 * JD-Core Version:    0.6.2
 */