package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

final class LuckyMoneyPickEnvelopeUI$a$2
  implements View.OnLongClickListener
{
  LuckyMoneyPickEnvelopeUI$a$2(LuckyMoneyPickEnvelopeUI.a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(42917);
    if (LuckyMoneyPickEnvelopeUI.o(this.ogZ.ogX))
    {
      LuckyMoneyPickEnvelopeUI.m(this.ogZ.ogX);
      int i = LuckyMoneyEnvelopeTouchRecyclerView.bo(paramView);
      LuckyMoneyPickEnvelopeUI.d(this.ogZ.ogX);
      Object localObject = com.tencent.mm.plugin.luckymoney.scaledLayout.a.h(LuckyMoneyPickEnvelopeUI.c(this.ogZ.ogX));
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "delete pos: %s", new Object[] { Integer.valueOf(i) });
      if ((i >= 0) && (i < LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX).size()) && (paramView == localObject))
      {
        localObject = (LuckyMoneyPickEnvelopeUI.b)LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX).get(i);
        if ((localObject != null) && (((LuckyMoneyPickEnvelopeUI.b)localObject).nZq != null))
        {
          paramView = new d(this.ogZ.ogX.mController.ylL, 1, true);
          TextView localTextView = new TextView(this.ogZ.ogX.mController.ylL);
          localTextView.setPadding(0, 0, 0, com.tencent.mm.bz.a.fromDPToPix(this.ogZ.ogX.mController.ylL, 9));
          localTextView.setMinHeight(com.tencent.mm.bz.a.al(this.ogZ.ogX.mController.ylL, 2131427515));
          localTextView.setTextSize(14.0F);
          localTextView.setTextColor(this.ogZ.ogX.getResources().getColor(2131690155));
          localTextView.setText(2131305916);
          localTextView.setGravity(81);
          paramView.F(localTextView, true);
          paramView.rBl = new LuckyMoneyPickEnvelopeUI.a.2.1(this);
          paramView.rBm = new LuckyMoneyPickEnvelopeUI.a.2.2(this, (LuckyMoneyPickEnvelopeUI.b)localObject);
          paramView.cpD();
        }
      }
    }
    AppMethodBeat.o(42917);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.a.2
 * JD-Core Version:    0.6.2
 */