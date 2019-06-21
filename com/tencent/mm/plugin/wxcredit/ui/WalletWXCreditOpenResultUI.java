package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(19)
public class WalletWXCreditOpenResultUI extends WalletBaseUI
{
  private CheckBox uZE;

  private void ari()
  {
    AppMethodBeat.i(48747);
    dOE().p(new Object[] { Boolean.valueOf(this.uZE.isChecked()) });
    AppMethodBeat.o(48747);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971190;
  }

  public final void initView()
  {
    AppMethodBeat.i(48746);
    setMMTitle(2131305501);
    TextView localTextView = (TextView)findViewById(2131829095);
    this.uZE = ((CheckBox)findViewById(2131829096));
    Bankcard localBankcard = (Bankcard)this.mBundle.getParcelable("key_bankcard");
    if (localBankcard != null)
    {
      this.uZE.setText(getString(2131305503, new Object[] { localBankcard.field_bankName }));
      localTextView.setText(2131305504);
    }
    ((Button)findViewById(2131822846)).setOnClickListener(new WalletWXCreditOpenResultUI.1(this));
    AppMethodBeat.o(48746);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48745);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().set(196658, Boolean.TRUE);
    r.cPI().tDa = bo.anT();
    initView();
    AppMethodBeat.o(48745);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(48748);
    boolean bool;
    if (paramInt == 4)
    {
      ari();
      bool = true;
      AppMethodBeat.o(48748);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(48748);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI
 * JD-Core Version:    0.6.2
 */