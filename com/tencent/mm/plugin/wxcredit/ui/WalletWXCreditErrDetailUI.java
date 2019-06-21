package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletWXCreditErrDetailUI extends WalletBaseUI
{
  private Bankcard thJ;
  private TextView uZA;
  private TextView uZB;
  private String uZz;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971188;
  }

  public final void initView()
  {
    AppMethodBeat.i(48739);
    this.thJ = ((Bankcard)this.mBundle.getParcelable("key_bankcard"));
    this.uZz = this.mBundle.getString("key_repayment_url");
    if (this.thJ == null)
    {
      AppMethodBeat.o(48739);
      return;
    }
    this.uZA = ((TextView)findViewById(2131829094));
    this.uZA.setOnClickListener(new WalletWXCreditErrDetailUI.1(this));
    this.uZB = ((TextView)findViewById(2131828673));
    this.uZB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(48737);
        a.j(WalletWXCreditErrDetailUI.this, WalletWXCreditErrDetailUI.this.mBundle);
        AppMethodBeat.o(48737);
      }
    });
    boolean bool = this.mBundle.getBoolean("key_can_unbind", true);
    TextView localTextView = this.uZB;
    if (bool);
    for (int i = 0; ; i = 8)
    {
      localTextView.setVisibility(i);
      AppMethodBeat.o(48739);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48738);
    super.onCreate(paramBundle);
    setMMTitle(2131304599);
    initView();
    AppMethodBeat.o(48738);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI
 * JD-Core Version:    0.6.2
 */