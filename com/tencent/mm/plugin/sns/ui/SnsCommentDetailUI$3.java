package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.model.ae;

final class SnsCommentDetailUI$3 extends com.tencent.mm.plugin.sns.ui.d.b
{
  SnsCommentDetailUI$3(SnsCommentDetailUI paramSnsCommentDetailUI, int paramInt, Activity paramActivity, ae paramae)
  {
    super(paramInt, paramActivity, paramae);
  }

  public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void cp(Object paramObject)
  {
    AppMethodBeat.i(38775);
    SnsCommentDetailUI.g(this.rqN);
    SnsCommentDetailUI.p(this.rqN).t((View)paramObject, 2, SnsCommentDetailUI.f(this.rqN));
    AppMethodBeat.o(38775);
  }

  public final void crE()
  {
  }

  public final void crF()
  {
    AppMethodBeat.i(38777);
    SnsCommentDetailUI.q(this.rqN).crv();
    AppMethodBeat.o(38777);
  }

  public final void dG(View paramView)
  {
  }

  public final void dH(View paramView)
  {
  }

  public final void dI(View paramView)
  {
  }

  public final void dJ(View paramView)
  {
  }

  public final void dK(View paramView)
  {
    AppMethodBeat.i(38776);
    SnsCommentDetailUI.q(this.rqN).dF(paramView);
    AppMethodBeat.o(38776);
  }

  public final void dL(View paramView)
  {
    AppMethodBeat.i(38778);
    Intent localIntent = new Intent();
    localIntent.putExtra("result_finish", true);
    this.rqN.setResult(-1, localIntent);
    if ((paramView.getTag() != null) && (SnsCommentDetailUI.r(this.rqN) != null))
    {
      paramView = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
      SnsCommentDetailUI.r(this.rqN).j(paramView.position, paramView.cwT, 2);
    }
    this.rqN.finish();
    AppMethodBeat.o(38778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.3
 * JD-Core Version:    0.6.2
 */