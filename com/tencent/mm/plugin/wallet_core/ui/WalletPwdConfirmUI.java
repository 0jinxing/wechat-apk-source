package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uy;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(19)
public class WalletPwdConfirmUI extends WalletBaseUI
{
  private com.tencent.mm.sdk.b.c ecA;
  private TextView iDT;
  private TextView kiF;
  protected EditHintPasswdView nrZ;
  private PayInfo pVL;
  private TextView tJu;
  private boolean tJv;
  private ap tJw;

  public WalletPwdConfirmUI()
  {
    AppMethodBeat.i(47545);
    this.tJv = false;
    this.tJw = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(47542);
        if (WalletPwdConfirmUI.c(WalletPwdConfirmUI.this))
        {
          WalletPwdConfirmUI.d(WalletPwdConfirmUI.this);
          WalletPwdConfirmUI.e(WalletPwdConfirmUI.this);
        }
        AppMethodBeat.o(47542);
        return false;
      }
    }
    , false);
    this.ecA = new WalletPwdConfirmUI.6(this);
    AppMethodBeat.o(47545);
  }

  private void cRL()
  {
    AppMethodBeat.i(47550);
    Bundle localBundle = this.mBundle;
    localBundle.putBoolean("intent_bind_end", true);
    com.tencent.mm.wallet_core.a.j(this, localBundle);
    AppMethodBeat.o(47550);
  }

  public final boolean bwQ()
  {
    return true;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47551);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.mBundle.putString("key_pwd1", this.nrZ.getText());
      if ((paramm instanceof y))
      {
        if (!this.tJv)
          cRL();
        AppMethodBeat.o(47551);
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      if ((com.tencent.mm.wallet_core.a.aE(this) != null) && (com.tencent.mm.wallet_core.a.aE(this).c(this, null)))
      {
        if (this.pVL != null);
        for (paramString = this.pVL.czZ; ; paramString = "")
        {
          a(new y(paramString, 22), true, false);
          paramString = new uy();
          if (com.tencent.mm.sdk.b.a.xxA.av(paramString.getClass()))
          {
            this.tJv = true;
            com.tencent.mm.sdk.b.a.xxA.m(paramString);
          }
          this.tJw.ae(10000L, 10000L);
          break;
        }
      }
      com.tencent.mm.wallet_core.a.j(this, this.mBundle);
      break;
      AppMethodBeat.o(47551);
    }
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
    AppMethodBeat.i(47547);
    this.iDT = ((TextView)findViewById(2131824899));
    this.kiF = ((TextView)findViewById(2131828754));
    if ((dOD() != null) && ("ModifyPwdProcess".equals(dOD().bxP())))
      this.iDT.setText(2131305018);
    this.kiF.setText(2131305358);
    this.tJu = ((TextView)findViewById(2131829060));
    if (!bo.ac(dOF()))
      this.tJu.setText(2131305363);
    while (true)
    {
      this.tJu.setVisibility(0);
      this.tJu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(47539);
          Object localObject = WalletPwdConfirmUI.this.mBundle.getString("key_new_pwd1");
          String str1 = WalletPwdConfirmUI.this.nrZ.getMd5Value();
          paramAnonymousView = WalletPwdConfirmUI.this.mBundle.getString("kreq_token");
          String str2 = WalletPwdConfirmUI.this.mBundle.getString("key_verify_code");
          ab.d("Micromsg.WalletPwdConfirmUI", "mPayInfo " + WalletPwdConfirmUI.a(WalletPwdConfirmUI.this) + " vertifyCode: " + str2);
          if ((localObject != null) && (((String)localObject).equals(str1)))
          {
            localObject = new s();
            ((s)localObject).guu = WalletPwdConfirmUI.this.nrZ.getText();
            ((s)localObject).pGr = WalletPwdConfirmUI.a(WalletPwdConfirmUI.this);
            ((s)localObject).token = paramAnonymousView;
            ((s)localObject).tCi = str2;
            ((s)localObject).tCj = WalletPwdConfirmUI.this.mBundle.getBoolean("key_is_bind_bankcard", true);
            if (!com.tencent.mm.wallet_core.a.aE(WalletPwdConfirmUI.this).cRY())
            {
              ((s)localObject).flag = "1";
              paramAnonymousView = (FavorPayInfo)WalletPwdConfirmUI.this.mBundle.getParcelable("key_favor_pay_info");
              if (paramAnonymousView != null)
              {
                ((s)localObject).twn = paramAnonymousView.tze;
                ((s)localObject).two = paramAnonymousView.tzb;
              }
              WalletPwdConfirmUI.this.dOE().p(new Object[] { localObject });
              AppMethodBeat.o(47539);
            }
          }
          while (true)
          {
            return;
            ((s)localObject).flag = "4";
            break;
            com.tencent.mm.wallet_core.a.o(WalletPwdConfirmUI.this, -1002);
            AppMethodBeat.o(47539);
          }
        }
      });
      this.tJu.setEnabled(false);
      this.tJu.setClickable(false);
      this.nrZ = ((EditHintPasswdView)findViewById(2131824902));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.nrZ);
      this.nrZ.setEditTextMaxLength(6);
      this.nrZ.setOnInputValidListener(new WalletPwdConfirmUI.3(this));
      findViewById(2131826507).setVisibility(8);
      e(this.nrZ, 0, false);
      this.obM = new WalletPwdConfirmUI.4(this, (ScrollView)findViewById(2131820884));
      AppMethodBeat.o(47547);
      return;
      this.tJu.setText(2131296944);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47546);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
    initView();
    d.a(this, this.mBundle, 6);
    findViewById(2131828753).setOnClickListener(new WalletPwdConfirmUI.1(this));
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(getResources().getColor(2131690310));
      if (Build.VERSION.SDK_INT >= 23)
        paramBundle.getDecorView().setSystemUiVisibility(8192);
    }
    this.mController.contentView.setFitsSystemWindows(true);
    AppMethodBeat.o(47546);
  }

  public void onPause()
  {
    AppMethodBeat.i(47549);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.ecA);
    AppMethodBeat.o(47549);
  }

  public void onResume()
  {
    AppMethodBeat.i(47548);
    this.nrZ.requestFocus();
    super.onResume();
    com.tencent.mm.sdk.b.a.xxA.c(this.ecA);
    AppMethodBeat.o(47548);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI
 * JD-Core Version:    0.6.2
 */