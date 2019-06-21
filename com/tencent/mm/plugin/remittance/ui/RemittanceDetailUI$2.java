package com.tencent.mm.plugin.remittance.ui;

import android.text.SpannableString;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.a;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceDetailUI$2
  implements Runnable
{
  RemittanceDetailUI$2(RemittanceDetailUI paramRemittanceDetailUI, NetSceneTenpayRemittanceQuery paramNetSceneTenpayRemittanceQuery)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44997);
    int i = RemittanceResultNewUI.n(this.pVw, this.pVz.pQm.fBg, RemittanceDetailUI.j(this.pVw).getWidth());
    if (!bo.gW(i, this.pVz.pQm.fBg.length()))
    {
      Object localObject1 = this.pVw.getString(2131296809);
      String str = this.pVz.pQm.fBg.substring(0, i) + "... ";
      SpannableString localSpannableString = new SpannableString(str + (String)localObject1);
      Object localObject2 = new com.tencent.mm.plugin.order.c.a(this.pVw);
      ((com.tencent.mm.plugin.order.c.a)localObject2).peT = new RemittanceDetailUI.2.1(this);
      localSpannableString.setSpan(localObject2, str.length(), str.length() + ((String)localObject1).length(), 33);
      RemittanceDetailUI.k(this.pVw).setOnTouchListener(a.cfs());
      RemittanceDetailUI.k(this.pVw).setText(localSpannableString);
      localObject2 = this.pVw.getString(2131296805);
      str = this.pVz.pQm.fBg + "  ";
      localSpannableString = new SpannableString(str + (String)localObject2);
      localObject1 = new com.tencent.mm.plugin.order.c.a(this.pVw);
      ((com.tencent.mm.plugin.order.c.a)localObject1).peT = new RemittanceDetailUI.2.2(this);
      int j = str.length();
      i = str.length();
      localSpannableString.setSpan(localObject1, j, ((String)localObject2).length() + i, 33);
      RemittanceDetailUI.l(this.pVw).setOnTouchListener(a.cfs());
      RemittanceDetailUI.l(this.pVw).setText(localSpannableString);
    }
    while (true)
    {
      RemittanceDetailUI.k(this.pVw).setVisibility(0);
      RemittanceDetailUI.l(this.pVw).setVisibility(8);
      RemittanceDetailUI.m(this.pVw).setOnLongClickListener(RemittanceDetailUI.g(this.pVw));
      RemittanceDetailUI.m(this.pVw).setOnTouchListener(RemittanceDetailUI.i(this.pVw));
      AppMethodBeat.o(44997);
      return;
      RemittanceDetailUI.k(this.pVw).setText(this.pVz.pQm.fBg);
      RemittanceDetailUI.l(this.pVw).setText(this.pVz.pQm.fBg);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.2
 * JD-Core Version:    0.6.2
 */