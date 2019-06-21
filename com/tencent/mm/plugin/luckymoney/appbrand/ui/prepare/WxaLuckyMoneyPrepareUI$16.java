package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;

final class WxaLuckyMoneyPrepareUI$16
  implements View.OnClickListener
{
  WxaLuckyMoneyPrepareUI$16(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, ArrayList paramArrayList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42072);
    paramView = new b(this.nTo.mController.ylL, this.nHl);
    paramView.Qq(WxaLuckyMoneyPrepareUI.f(this.nTo));
    paramView.zSq = new WxaLuckyMoneyPrepareUI.16.1(this, paramView);
    paramView.Qp(a.fromDPToPix(this.nTo.mController.ylL, 288));
    paramView.show();
    AppMethodBeat.o(42072);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.16
 * JD-Core Version:    0.6.2
 */