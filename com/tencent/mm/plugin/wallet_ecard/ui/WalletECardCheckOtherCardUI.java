package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

public class WalletECardCheckOtherCardUI extends WalletECardBaseUI
  implements WalletFormView.a
{
  private Button gHn;
  private String kGE;
  private WalletFormView pMi;
  private WalletFormView tQF;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130969309;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(48137);
    ab.d("MicroMsg.WalletECardCheckOtherCardUI", "is valid: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.pMi.asa()) && (this.tQF.asa()))
    {
      this.gHn.setEnabled(true);
      this.gHn.setClickable(true);
      AppMethodBeat.o(48137);
    }
    while (true)
    {
      return;
      this.gHn.setEnabled(false);
      this.gHn.setClickable(false);
      AppMethodBeat.o(48137);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(48135);
    this.pMi = ((WalletFormView)findViewById(2131823363));
    this.tQF = ((WalletFormView)findViewById(2131823364));
    this.gHn = ((Button)findViewById(2131823365));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.pMi);
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.tQF);
    if (!bo.isNullOrNil(this.kGE))
      this.pMi.setHint(getString(2131298975, new Object[] { this.kGE }));
    while (true)
    {
      this.tQF.setHint(getString(2131298977));
      this.pMi.setOnInputValidChangeListener(this);
      this.tQF.setOnInputValidChangeListener(this);
      e(this.pMi, 0, false);
      e(this.tQF, 0, false);
      this.gHn.setEnabled(false);
      this.gHn.setClickable(false);
      this.gHn.setOnClickListener(new WalletECardCheckOtherCardUI.1(this));
      AppMethodBeat.o(48135);
      return;
      this.pMi.setHint(getString(2131298976));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48134);
    super.onCreate(paramBundle);
    this.kGE = this.mBundle.getString(com.tencent.mm.plugin.wallet_ecard.a.a.tPY, "");
    setMMTitle(getString(2131298978));
    this.Ahr.nf(385);
    initView();
    AppMethodBeat.o(48134);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48136);
    super.onDestroy();
    this.Ahr.ng(385);
    AppMethodBeat.o(48136);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI
 * JD-Core Version:    0.6.2
 */