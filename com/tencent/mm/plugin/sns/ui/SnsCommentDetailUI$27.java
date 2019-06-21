package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.storage.ad;

final class SnsCommentDetailUI$27
  implements View.OnClickListener
{
  SnsCommentDetailUI$27(SnsCommentDetailUI paramSnsCommentDetailUI, n paramn, ad paramad)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38809);
    i.a(new SnsAdClick(SnsCommentDetailUI.f(this.rqN), 2, this.rhJ.field_snsId, 24, 0));
    SnsCommentDetailUI.c(this.rqN).setCommentFlag(1);
    SnsCommentDetailUI.c(this.rqN).setCommentHint(this.emj.Oj());
    SnsCommentDetailUI.c(this.rqN).lj(true);
    SnsCommentDetailUI.E(this.rqN).setVisibility(8);
    SnsCommentDetailUI.z(this.rqN);
    AppMethodBeat.o(38809);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.27
 * JD-Core Version:    0.6.2
 */