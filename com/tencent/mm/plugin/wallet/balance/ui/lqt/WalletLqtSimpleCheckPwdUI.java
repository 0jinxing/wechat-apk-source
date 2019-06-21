package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(1)
public class WalletLqtSimpleCheckPwdUI extends WalletBaseUI
{
  private EditHintPasswdView nrZ;
  private com.tencent.mm.plugin.wallet_core.c.r tlb;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45712);
    ab.d("MicroMsg.WalletLqtSimpleCheckPwdUI", "scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.r))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.nrZ.getText();
        paramm = new Intent();
        paramm.putExtra("lqt_enc_pwd", paramString);
        setResult(-1, paramm);
        finish();
        AppMethodBeat.o(45712);
      }
    while (true)
    {
      return bool;
      if (this.nrZ != null)
        this.nrZ.cey();
      AppMethodBeat.o(45712);
      bool = false;
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971123;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45711);
    super.onCreate(paramBundle);
    if (com.tencent.mm.model.r.YM());
    for (paramBundle = getString(2131304746); ; paramBundle = getString(2131304745))
    {
      setMMTitle(paramBundle);
      setBackBtn(new WalletLqtSimpleCheckPwdUI.1(this));
      ((TextView)findViewById(2131828577)).setText(2131304743);
      this.nrZ = ((EditHintPasswdView)findViewById(2131824902));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.nrZ);
      this.nrZ.setOnInputValidListener(new WalletLqtSimpleCheckPwdUI.2(this));
      e(this.nrZ, 0, false);
      AppMethodBeat.o(45711);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(45713);
    super.wU(paramInt);
    if (this.nrZ != null)
      this.nrZ.cey();
    AppMethodBeat.o(45713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSimpleCheckPwdUI
 * JD-Core Version:    0.6.2
 */