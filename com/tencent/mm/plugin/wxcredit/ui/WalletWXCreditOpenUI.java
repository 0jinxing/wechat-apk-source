package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditOpenUI extends WalletBaseUI
{
  private Button gHn;
  private Bankcard tmw;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971191;
  }

  public final void initView()
  {
    AppMethodBeat.i(48754);
    setMMTitle(2131305507);
    ((CheckBox)findViewById(2131828739)).setOnCheckedChangeListener(new WalletWXCreditOpenUI.1(this));
    findViewById(2131826067).setOnClickListener(new WalletWXCreditOpenUI.2(this));
    this.gHn = ((Button)findViewById(2131822846));
    this.gHn.setOnClickListener(new WalletWXCreditOpenUI.3(this));
    AppMethodBeat.o(48754);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48753);
    super.onCreate(paramBundle);
    this.tmw = ((Bankcard)this.mBundle.getParcelable("key_bankcard"));
    initView();
    AppMethodBeat.o(48753);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI
 * JD-Core Version:    0.6.2
 */