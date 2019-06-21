package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.luckymoney.model.ao;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;

final class SnsLuckyMoneyPrepareUI$16
  implements View.OnClickListener
{
  SnsLuckyMoneyPrepareUI$16(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42526);
    h.pYm.e(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(this.obN)), Integer.valueOf(4) });
    if (this.obN.obC.bKW() != 0)
    {
      t.makeText(this.obN.mController.ylL, 2131304579, 0).show();
      AppMethodBeat.o(42526);
    }
    while (true)
    {
      return;
      int i = this.obN.nTd.getInput();
      double d = this.obN.obC.getInput();
      long l1 = 0L;
      long l2;
      label158: String str;
      if (SnsLuckyMoneyPrepareUI.a(this.obN) == 1)
      {
        l2 = com.tencent.mm.wallet_core.ui.e.H(d);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(356354, Integer.valueOf(i));
        str = this.obN.nTf.getInput();
        paramView = str;
        if (bo.isNullOrNil(str))
          paramView = this.obN.getString(2131301090);
        str = this.obN.getIntent().getStringExtra("key_username");
        if ((!SnsLuckyMoneyPrepareUI.e(this.obN)) || (bo.isNullOrNil(str)))
          break label343;
      }
      label343: for (paramView = new ao(i, l2, l1, SnsLuckyMoneyPrepareUI.a(this.obN), paramView, x.bLC(), str, x.mI(str), r.Yz(), r.YB(), SnsLuckyMoneyPrepareUI.f(this.obN), ""); ; paramView = new ao(i, l2, l1, SnsLuckyMoneyPrepareUI.a(this.obN), paramView, x.bLC(), null, null, r.Yz(), r.YB(), SnsLuckyMoneyPrepareUI.f(this.obN), ""))
      {
        this.obN.b(paramView, false);
        if (this.obN.gII == null)
          break label387;
        this.obN.gII.show();
        AppMethodBeat.o(42526);
        break;
        l2 = com.tencent.mm.wallet_core.ui.e.H(i * d);
        l1 = com.tencent.mm.wallet_core.ui.e.H(d);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(356353, Integer.valueOf(i));
        break label158;
      }
      label387: this.obN.gII = com.tencent.mm.wallet_core.ui.g.a(this.obN.mController.ylL, true, new SnsLuckyMoneyPrepareUI.16.1(this));
      AppMethodBeat.o(42526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.16
 * JD-Core Version:    0.6.2
 */