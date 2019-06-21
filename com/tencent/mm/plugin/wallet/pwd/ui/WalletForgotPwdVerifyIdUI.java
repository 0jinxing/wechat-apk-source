package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pwd.a.q;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.b;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

@com.tencent.mm.ui.base.a(3)
public class WalletForgotPwdVerifyIdUI extends WalletBaseUI
  implements View.OnLayoutChangeListener
{
  private TextView gsf;
  private int iev = 0;
  private View iym;
  private int keyHeight = 0;
  private boolean trE;
  private MMEditText trJ;
  private TextView trK;
  private WalletFormView trL;
  private Button trM;
  private TextView trN;
  private LinearLayout trO;
  ViewGroup.MarginLayoutParams trP;
  ViewGroup.MarginLayoutParams trQ;
  private View trR;
  private boolean trS = false;
  private boolean trT = false;
  private boolean trU = false;
  private boolean trV = false;

  private void cOD()
  {
    AppMethodBeat.i(46316);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " setChangParams()");
    new ak().postDelayed(new WalletForgotPwdVerifyIdUI.3(this), 100L);
    AppMethodBeat.o(46316);
  }

  private void cu()
  {
    AppMethodBeat.i(46314);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "updateView");
    int i = r.cPE().cRh().field_cre_type;
    String str1 = r.cPE().cRh().field_cre_name;
    String str2 = r.cPE().cRh().field_true_name;
    this.trJ.setHint(getString(2131304720, new Object[] { e.att(str2) }));
    if (!bo.isNullOrNil(str1))
    {
      this.trK.setText(str1);
      if (i != 1)
        break label119;
      com.tencent.mm.wallet_core.ui.formview.a.d(this.trL);
      e(this.trL, 1, false);
      AppMethodBeat.o(46314);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.WalletForgotPwdVerifyIdUI", "creName is null");
      break;
      label119: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "no need tenpay keyboard");
      AppMethodBeat.o(46314);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46315);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " errCode: %s errMsg: %s  scene: %s", new Object[] { Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof y))
        break label67;
      cu();
      AM(0);
    }
    while (true)
    {
      AppMethodBeat.o(46315);
      return false;
      label67: if ((paramm instanceof q))
      {
        paramm = (q)paramm;
        this.mBundle.putInt("key_is_support_face", paramm.tqK);
        this.mBundle.putInt("key_face_action_scene", paramm.scene);
        this.mBundle.putString("key_face_action_package", paramm.packageName);
        this.mBundle.putString("key_face_action_package_sign", paramm.cKT);
        if (paramm.tqL == 1)
        {
          com.tencent.mm.wallet_core.c.ab.dNZ();
          paramString = com.tencent.mm.wallet_core.c.ab.dNY();
          b.dNJ();
          if (!b.isCertExist(paramString))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "checkInstallCert, crt not installed");
            a(new n(paramm.tqI, paramm.tqJ, paramm.cQY), true, false);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "already install cert, go to next process");
            dOD().a(this, 0, this.mBundle);
          }
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "verify realname info finish, go to next process");
          dOD().a(this, 0, this.mBundle);
        }
      }
      else if ((paramm instanceof n))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "install cert finish, go to next process");
        dOD().a(this, 0, this.mBundle);
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971100;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46313);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", "onCreate");
    xE(Color.parseColor("#FFFFFF"));
    dyb();
    MY(8);
    this.trR = findViewById(2131825792);
    this.iev = getWindowManager().getDefaultDisplay().getHeight();
    this.keyHeight = (this.iev / 3);
    this.trR.addOnLayoutChangeListener(this);
    this.trE = this.mBundle.getBoolean("key_is_force_bind", false);
    if (!this.trE)
    {
      a(new y(null, 6), true, true);
      AM(4);
    }
    this.trJ = ((MMEditText)findViewById(2131828805));
    this.trK = ((TextView)findViewById(2131828806));
    this.trL = ((WalletFormView)findViewById(2131828720));
    this.trM = ((Button)findViewById(2131822846));
    this.trN = ((TextView)findViewById(2131828808));
    this.iym = findViewById(2131820987);
    this.gsf = ((TextView)findViewById(2131820678));
    this.trO = ((LinearLayout)findViewById(2131823731));
    this.trL.setEnabled(false);
    this.trL.setFocusable(false);
    this.trM.setOnClickListener(new WalletForgotPwdVerifyIdUI.1(this));
    this.trN.setOnClickListener(new WalletForgotPwdVerifyIdUI.2(this));
    cu();
    this.obM = new WalletForgotPwdVerifyIdUI.6(this);
    this.trJ.setOnFocusChangeListener(new WalletForgotPwdVerifyIdUI.7(this));
    this.trJ.addTextChangedListener(new WalletForgotPwdVerifyIdUI.4(this));
    this.trL.a(new WalletForgotPwdVerifyIdUI.5(this));
    AppMethodBeat.o(46313);
  }

  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(46317);
    if ((paramInt8 != 0) && (paramInt4 != 0) && (paramInt8 - paramInt4 > this.keyHeight))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " up");
      cOD();
      AppMethodBeat.o(46317);
    }
    while (true)
    {
      return;
      if ((paramInt8 != 0) && (paramInt4 != 0) && (paramInt4 - paramInt8 > this.keyHeight))
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " down");
      AppMethodBeat.o(46317);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI
 * JD-Core Version:    0.6.2
 */