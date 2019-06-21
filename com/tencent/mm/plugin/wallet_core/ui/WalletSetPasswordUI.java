package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(19)
public class WalletSetPasswordUI extends WalletBaseUI
{
  private TextView iDT;
  private TextView kiF;
  protected EditHintPasswdView nrZ;

  private boolean cRu()
  {
    AppMethodBeat.i(47669);
    boolean bool = this.mBundle.getBoolean("key_is_forgot_process", false);
    AppMethodBeat.o(47669);
    return bool;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971169;
  }

  public final void initView()
  {
    AppMethodBeat.i(47667);
    this.iDT = ((TextView)findViewById(2131824899));
    this.kiF = ((TextView)findViewById(2131828754));
    if ((cRu()) && (!bo.isNullOrNil(this.mBundle.getString("key_identity"))) && (this.mBundle.getInt("key_id_type", -1) != -1) && (!bo.isNullOrNil(this.mBundle.getString("key_true_name"))))
      this.kiF.setVisibility(4);
    if ((dOD() != null) && ("ModifyPwdProcess".equals(dOD().bxP())))
      this.iDT.setText(2131305018);
    if (this.mBundle.getInt("key_err_code", 0) == -1002)
    {
      TextView localTextView = (TextView)findViewById(2131829059);
      localTextView.setVisibility(0);
      localTextView.setText(ae.it(this));
      this.mBundle.putInt("key_err_code", 0);
    }
    this.nrZ = ((EditHintPasswdView)findViewById(2131824902));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.nrZ);
    findViewById(2131826507).setVisibility(8);
    this.nrZ.setOnInputValidListener(new WalletSetPasswordUI.2(this));
    e(this.nrZ, 0, false);
    AppMethodBeat.o(47667);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47666);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    initView();
    d.a(this, this.mBundle, 5);
    findViewById(2131828753).setOnClickListener(new WalletSetPasswordUI.1(this));
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(getResources().getColor(2131690310));
      if (Build.VERSION.SDK_INT >= 23)
        paramBundle.getDecorView().setSystemUiVisibility(8192);
    }
    this.mController.contentView.setFitsSystemWindows(true);
    AppMethodBeat.o(47666);
  }

  public void onResume()
  {
    AppMethodBeat.i(47668);
    this.nrZ.requestFocus();
    super.onResume();
    AppMethodBeat.o(47668);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI
 * JD-Core Version:    0.6.2
 */