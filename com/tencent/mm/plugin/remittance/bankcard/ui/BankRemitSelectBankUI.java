package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class BankRemitSelectBankUI extends BankRemitBaseUI
{
  private BankRemitSortView pOd;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44669);
    if ((paramm instanceof h))
    {
      paramString = (h)paramm;
      paramString.a(new BankRemitSelectBankUI.4(this, paramString)).b(new BankRemitSelectBankUI.3(this, paramString)).c(new BankRemitSelectBankUI.2(this, paramString));
    }
    AppMethodBeat.o(44669);
    return false;
  }

  public final int getLayoutId()
  {
    return 2130968825;
  }

  public final void initView()
  {
    AppMethodBeat.i(44668);
    this.pOd = ((BankRemitSortView)findViewById(2131821687));
    this.pOd.setOnItemClickListener(new BankRemitSelectBankUI.1(this));
    AppMethodBeat.o(44668);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44667);
    super.onCreate(paramBundle);
    setMMTitle(2131297479);
    nf(1399);
    initView();
    ab.i("MicroMsg.BankRemitSelectBankUI", "do fetch data");
    paramBundle = new h();
    paramBundle.o(this);
    a(paramBundle, true, true);
    AppMethodBeat.o(44667);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44670);
    super.onDestroy();
    ng(1399);
    AppMethodBeat.o(44670);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI
 * JD-Core Version:    0.6.2
 */