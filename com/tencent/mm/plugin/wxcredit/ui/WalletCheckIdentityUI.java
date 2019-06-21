package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.a;

public class WalletCheckIdentityUI extends WalletBaseUI
{
  private WalletFormView tEq;
  private WalletFormView trX;
  private String uYV;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971185;
  }

  public final void initView()
  {
    AppMethodBeat.i(48683);
    setMMTitle(2131304732);
    this.tEq = ((WalletFormView)findViewById(2131828681));
    a.e(this, this.tEq);
    this.trX = ((WalletFormView)findViewById(2131828720));
    a.c(this.trX);
    e(this.trX, 1, false);
    String str = this.mBundle.getString("key_pre_name");
    this.uYV = this.mBundle.getString("key_pre_indentity");
    if (!bo.isNullOrNil(str))
    {
      this.tEq.getPrefilledTv().setText(str);
      this.tEq.setHint(getString(2131304721));
    }
    if (!bo.isNullOrNil(this.uYV))
    {
      this.trX.setMaxInputLength(4);
      this.trX.getPrefilledTv().setText(this.uYV);
      this.trX.setHint(getString(2131304675));
    }
    findViewById(2131822846).setOnClickListener(new WalletCheckIdentityUI.1(this));
    AppMethodBeat.o(48683);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48682);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(48682);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI
 * JD-Core Version:    0.6.2
 */