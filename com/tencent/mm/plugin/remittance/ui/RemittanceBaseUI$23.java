package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.view.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.b;

final class RemittanceBaseUI$23
  implements View.OnClickListener
{
  RemittanceBaseUI$23(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44853);
    this.pRX.aoB();
    RemittanceBaseUI.cfO();
    h.pYm.e(12689, new Object[] { Integer.valueOf(9), Integer.valueOf(1) });
    Object localObject;
    if ((this.pRX.gOW == 1) || (this.pRX.gOW == 6))
    {
      localObject = this.pRX.getString(2131302359);
      paramView = this.pRX.getString(2131302384);
      h.pYm.e(14074, new Object[] { Integer.valueOf(1) });
      a.a(this.pRX, (String)localObject, this.pRX.eeO, paramView, 20, new h.b()
      {
        public final boolean s(CharSequence paramAnonymousCharSequence)
        {
          AppMethodBeat.i(44850);
          if (!bo.isNullOrNil(paramAnonymousCharSequence.toString()))
          {
            RemittanceBaseUI.23.this.pRX.eeO = paramAnonymousCharSequence.toString();
            RemittanceBaseUI.d(RemittanceBaseUI.23.this.pRX);
          }
          while (true)
          {
            AppMethodBeat.o(44850);
            return true;
            RemittanceBaseUI.23.this.pRX.eeO = null;
            RemittanceBaseUI.d(RemittanceBaseUI.23.this.pRX);
          }
        }
      }
      , new RemittanceBaseUI.23.4(this));
      AppMethodBeat.o(44853);
    }
    while (true)
    {
      return;
      String str1 = this.pRX.getString(2131302358);
      String str2 = this.pRX.getString(2131302364);
      localObject = str1;
      paramView = str2;
      if (!bo.gW(RemittanceBaseUI.a(this.pRX), 0))
        break;
      localObject = str1;
      paramView = str2;
      if (!this.pRX.pRa)
        break;
      a.a(this.pRX, str1, this.pRX.eeO, str2, this.pRX.pRt, this.pRX.mName, this.pRX.pdC, this.pRX.pRs, new RemittanceBaseUI.23.1(this), new RemittanceBaseUI.23.2(this));
      AppMethodBeat.o(44853);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.23
 * JD-Core Version:    0.6.2
 */