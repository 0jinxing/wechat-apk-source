package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.mm.plugin.wallet_payu.security_question.model.d;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUSecurityQuestionSettingUI extends WalletBaseUI
{
  private Button gHn;
  private WalletPayUSecurityQuestionView tUN;
  private WalletFormView tUO;
  private k tUS;
  private String tUT = "";
  private WalletPayUSecurityQuestionSettingUI.a tUU;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48592);
    if (((paramm instanceof d)) && (this.tUS.isShowing()))
      this.tUS.dismiss();
    AppMethodBeat.o(48592);
    return false;
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970355;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48590);
    super.onCreate(paramBundle);
    this.tUS = new k(this);
    this.tUS.qR(true);
    this.tUS.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(48582);
        paramAnonymousl.clear();
        ArrayList localArrayList = WalletPayUSecurityQuestionSettingUI.a(WalletPayUSecurityQuestionSettingUI.this);
        if (localArrayList != null)
          for (int i = 0; i < localArrayList.size(); i++)
            paramAnonymousl.add(((PayUSecurityQuestion)localArrayList.get(i)).desc);
        AppMethodBeat.o(48582);
      }
    };
    this.tUS.rBm = new WalletPayUSecurityQuestionSettingUI.2(this);
    this.tUU = new WalletPayUSecurityQuestionSettingUI.a(this);
    this.tUN = ((WalletPayUSecurityQuestionView)findViewById(2131826511));
    this.tUO = ((WalletFormView)findViewById(2131826512));
    com.tencent.mm.wallet_core.ui.formview.a.g(this.tUO);
    this.gHn = ((Button)findViewById(2131826513));
    this.tUN.setOnClickListener(new WalletPayUSecurityQuestionSettingUI.3(this));
    this.tUO.setOnInputValidChangeListener(new WalletPayUSecurityQuestionSettingUI.4(this));
    this.gHn.setOnClickListener(new WalletPayUSecurityQuestionSettingUI.5(this));
    WalletPayUSecurityQuestionSettingUI.a.a(this.tUU);
    AppMethodBeat.o(48590);
  }

  public void onResume()
  {
    AppMethodBeat.i(48591);
    super.onResume();
    AppMethodBeat.o(48591);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI
 * JD-Core Version:    0.6.2
 */