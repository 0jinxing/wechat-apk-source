package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.f;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class PayURemittanceResendMsgUI extends RemittanceResendMsgUI
{
  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48564);
    if ((paramm instanceof f))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.bQ(this, getString(2131302457));
        finish();
        AppMethodBeat.o(48564);
      }
    while (true)
    {
      return bool;
      h.bQ(this, paramString);
      finish();
      AppMethodBeat.o(48564);
      continue;
      bool = false;
      AppMethodBeat.o(48564);
    }
  }

  public final void f(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(48563);
    a(new f(paramString1, getIntent().getIntExtra("total_fee", 0), getIntent().getStringExtra("fee_type"), paramString3, paramInt1), true, true);
    AppMethodBeat.o(48563);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48562);
    super.onCreate(paramBundle);
    AppMethodBeat.o(48562);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceResendMsgUI
 * JD-Core Version:    0.6.2
 */