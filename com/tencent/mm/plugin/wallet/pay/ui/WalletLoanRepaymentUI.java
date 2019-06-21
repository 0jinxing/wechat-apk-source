package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.c;
import com.tencent.mm.plugin.wallet_core.c.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ah;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.n;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletLoanRepaymentUI extends WalletBaseUI
{
  private String desc;
  private String gEk;
  private double pPz;
  private String pcl = "CNY";
  protected q toD;
  private String toP;
  private String toQ;
  private String toR;
  private String toS;
  private String toT;
  private String toU;
  private String toV;
  private String toW;
  private int toX;
  private String token;

  private void a(Bankcard paramBankcard, double paramDouble, String paramString)
  {
    AppMethodBeat.i(46001);
    WalletLoanRepaymentUI.1 local1 = new WalletLoanRepaymentUI.1(this);
    WalletLoanRepaymentUI.2 local2 = new WalletLoanRepaymentUI.2(this);
    WalletLoanRepaymentUI.3 local3 = new WalletLoanRepaymentUI.3(this);
    this.toW = paramBankcard.field_bindSerial;
    this.toD = q.a(this, this.desc, paramDouble, paramString, paramBankcard, local1, local2, local3);
    AppMethodBeat.o(46001);
  }

  private void act(String paramString)
  {
    AppMethodBeat.i(45999);
    a(new c(paramString), true, false);
    AppMethodBeat.o(45999);
  }

  private void cNS()
  {
    AppMethodBeat.i(46002);
    ab.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard");
    startActivityForResult(new Intent(this, WalletChangeLoanRepayBankcardUI.class), 1);
    AppMethodBeat.o(46002);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46000);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        this.token = ((com.tencent.mm.plugin.wallet_core.c.a)paramm).getToken();
        act(this.token);
        AppMethodBeat.o(46000);
        bool = true;
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof c))
      {
        paramString = (c)paramm;
        this.pcl = paramString.pcl;
        this.pPz = paramString.pPz;
        this.desc = paramString.desc;
        paramString = r.cPJ();
        if (paramString.cPU())
        {
          paramString = paramString.cPV();
          if ((paramString != null) && (bo.isNullOrNil(paramString.field_forbidWord)))
            a(paramString, this.pPz, this.pcl);
        }
        while (true)
        {
          AppMethodBeat.o(46000);
          bool = true;
          break;
          cNS();
          continue;
          h.d(this, getResources().getString(2131304874), "", getString(2131305157), getString(2131296868), new WalletLoanRepaymentUI.4(this), new WalletLoanRepaymentUI.5(this));
        }
      }
      if ((paramm instanceof s))
      {
        paramString = (s)paramm;
        if (paramString.cOT())
        {
          ab.i("MicroMsg.WalletLoanRepaymentUI", "need free sms");
          paramm = new Bundle();
          paramm.putString("key_pwd1", this.gEk);
          paramm.putString("key_jsapi_token", this.token);
          paramm.putString("key_relation_key", paramString.tul);
          paramm.putInt("key_verify_scene", 8);
          paramm.putString("key_mobile", paramString.tuk);
          com.tencent.mm.wallet_core.a.a(this, n.class, paramm);
        }
        while (true)
        {
          AppMethodBeat.o(46000);
          bool = true;
          break;
          paramm = new Intent();
          paramm.putExtra("token", paramString.tui);
          paramm.putExtra("bind_serial", this.toW);
          setResult(-1, paramm);
          finish();
        }
      }
      bool = false;
      AppMethodBeat.o(46000);
    }
  }

  protected final void cNT()
  {
    AppMethodBeat.i(46003);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_bind_scene", 8);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putString("kreq_token", this.token);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.loan.a.class, localBundle, new WalletLoanRepaymentUI.6(this));
    AppMethodBeat.o(46003);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46005);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        paramInt1 = paramIntent.getIntExtra("ret", -1000);
        if (paramInt1 == -1003)
        {
          ab.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new card");
          cNT();
          AppMethodBeat.o(46005);
        }
      }
    while (true)
    {
      return;
      if (paramInt1 == 0)
      {
        ab.i("MicroMsg.WalletLoanRepaymentUI", "change card ok");
        paramIntent = r.cPJ().acB(paramIntent.getStringExtra("bindSerial"));
        if (paramIntent == null)
        {
          ab.e("MicroMsg.WalletLoanRepaymentUI", "bankcard is null by getBankcardBySerialNo");
          finish();
          AppMethodBeat.o(46005);
        }
        else
        {
          a(paramIntent, this.pPz, this.pcl);
          AppMethodBeat.o(46005);
        }
      }
      else
      {
        ab.e("MicroMsg.WalletLoanRepaymentUI", "activity return unknow error");
        AppMethodBeat.o(46005);
        continue;
        paramIntent = r.cPJ();
        if (paramIntent.cPU())
        {
          paramIntent = paramIntent.cPV();
          if ((paramIntent != null) && (bo.isNullOrNil(paramIntent.field_forbidWord)))
          {
            a(paramIntent, this.pPz, this.pcl);
            AppMethodBeat.o(46005);
          }
          else
          {
            finish();
            AppMethodBeat.o(46005);
          }
        }
        else
        {
          ab.e("MicroMsg.WalletLoanRepaymentUI", "onActivityResult hasRepaymentBankcard is false");
          AppMethodBeat.o(46005);
          continue;
          super.onActivityResult(paramInt1, paramInt2, paramIntent);
          AppMethodBeat.o(46005);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45997);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.toU = paramBundle.getStringExtra("appId");
    this.toP = paramBundle.getStringExtra("timeStamp");
    this.toQ = paramBundle.getStringExtra("nonceStr");
    this.toR = paramBundle.getStringExtra("packageExt");
    this.toS = paramBundle.getStringExtra("signtype");
    this.toT = paramBundle.getStringExtra("paySignature");
    this.toV = paramBundle.getStringExtra("url");
    this.toX = paramBundle.getIntExtra("pay_channel", 0);
    nf(580);
    a(new com.tencent.mm.plugin.wallet_core.c.a(this.toU, this.toP, this.toQ, this.toR, this.toS, this.toT, this.toV, 7, "getWebPayCheckoutCounterRequst", this.toX), true, false);
    AppMethodBeat.o(45997);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(46004);
    Object localObject = paramIntent.getExtras();
    ab.i("MicroMsg.WalletLoanRepaymentUI", "onNewIntent");
    if (((Bundle)localObject).containsKey("intent_bind_end"))
    {
      ab.i("MicroMsg.WalletLoanRepaymentUI", "back from bind card");
      act(this.token);
      AppMethodBeat.o(46004);
    }
    while (true)
    {
      return;
      if (((Bundle)localObject).containsKey("jsapi_verifycode_process_end"))
      {
        ab.i("MicroMsg.WalletLoanRepaymentUI", "back from verify code");
        localObject = new Intent();
        ((Intent)localObject).putExtra("token", paramIntent.getStringExtra("token"));
        ((Intent)localObject).putExtra("bind_serial", this.toW);
        setResult(-1, (Intent)localObject);
        finish();
        AppMethodBeat.o(46004);
      }
      else
      {
        ab.i("MicroMsg.WalletLoanRepaymentUI", "need to deal with,finish");
        finish();
        AppMethodBeat.o(46004);
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(45998);
    super.onResume();
    AppMethodBeat.o(45998);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI
 * JD-Core Version:    0.6.2
 */