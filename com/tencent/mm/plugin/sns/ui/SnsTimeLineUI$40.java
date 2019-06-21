package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.k.c.b;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.vending.app.a;

final class SnsTimeLineUI$40
  implements View.OnClickListener
{
  SnsTimeLineUI$40(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39514);
    if ((SnsTimeLineUI.g(this.rzs) != null) && (SnsTimeLineUI.g(this.rzs).rhn != null))
      SnsTimeLineUI.g(this.rzs).rhn.qMn.kN(true);
    paramView = (c.b)this.rzs.SK().x(c.b.class);
    com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.lY(725);
    localb.mb(paramView.rNt);
    localb.ajK();
    paramView = new Intent();
    paramView.setClass(this.rzs, SnsMsgUI.class);
    this.rzs.startActivityForResult(paramView, 13);
    AppMethodBeat.o(39514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.40
 * JD-Core Version:    0.6.2
 */