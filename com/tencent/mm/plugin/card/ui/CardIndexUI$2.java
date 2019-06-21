package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.protocal.protobuf.oc;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class CardIndexUI$2
  implements View.OnClickListener
{
  CardIndexUI$2(CardIndexUI paramCardIndexUI, oc paramoc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88522);
    ab.i("MicroMsg.CardIndexUI", "click header view: %s", new Object[] { Integer.valueOf(this.kma.vTH) });
    if (this.kma.vTH == 1)
    {
      b.a(this.klZ, this.kma.vTI, 0);
      AppMethodBeat.o(88522);
    }
    while (true)
    {
      return;
      if (this.kma.vTH == 2)
      {
        paramView = new se();
        paramView.cOf.userName = this.kma.vTJ.tzW;
        paramView.cOf.cOh = bo.bc(this.kma.vTJ.ttg, "");
        paramView.cOf.scene = 1028;
        a.xxA.m(paramView);
      }
      AppMethodBeat.o(88522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardIndexUI.2
 * JD-Core Version:    0.6.2
 */