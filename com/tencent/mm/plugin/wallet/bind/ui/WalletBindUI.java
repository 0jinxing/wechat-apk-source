package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.c.z;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class WalletBindUI extends WalletBaseUI
{
  private com.tencent.mm.plugin.wallet_core.ui.s onl;
  private PayInfo pGr;
  private boolean tmf;
  private String tmg;
  private int tmh;
  private com.tencent.mm.plugin.wallet_core.c.a tmi;
  private boolean tmj;
  com.tencent.mm.sdk.b.c tmk;
  private String token;

  public WalletBindUI()
  {
    AppMethodBeat.i(45803);
    this.pGr = new PayInfo();
    this.tmf = false;
    this.tmh = -1;
    this.token = null;
    this.tmi = null;
    this.tmj = false;
    this.onl = new com.tencent.mm.plugin.wallet_core.ui.s();
    this.tmk = new WalletBindUI.3(this);
    AppMethodBeat.o(45803);
  }

  private void He(int paramInt)
  {
    AppMethodBeat.i(45806);
    ab.i("MicroMsg.WalletBindUI", "doBindCardForOtherScene " + bo.dpG().toString());
    Bundle localBundle = this.mBundle;
    localBundle.putParcelable("key_pay_info", this.pGr);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putString("key_custom_bind_tips", getIntent().getStringExtra("key_custom_bind_tips"));
    com.tencent.mm.plugin.wallet.a.s.cNC();
    if (com.tencent.mm.plugin.wallet.a.s.cND().cQl())
    {
      ab.i("MicroMsg.WalletBindUI", "user status invalid");
      if (paramInt == 4)
      {
        a(new y(null, 20), true, false);
        AppMethodBeat.o(45806);
      }
    }
    while (true)
    {
      return;
      a(new y(null, 12), true, false);
      AppMethodBeat.o(45806);
      continue;
      com.tencent.mm.plugin.wallet.a.s.cNC();
      if (!com.tencent.mm.plugin.wallet.a.s.cND().cQg())
        break;
      ab.i("MicroMsg.WalletBindUI", "user status reg");
      this.tmf = true;
      this.pGr.cIg = this.tmh;
      localBundle.putInt("key_bind_scene", this.pGr.cIg);
      if (!bo.isNullOrNil(this.token))
        localBundle.putString("kreq_token", this.token);
      com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, null);
      AppMethodBeat.o(45806);
    }
    ab.i("MicroMsg.WalletBindUI", "user status unreg");
    this.tmf = true;
    if (this.tmh >= 0);
    for (this.pGr.cIg = this.tmh; ; this.pGr.cIg = 1)
    {
      localBundle.putInt("key_bind_scene", this.pGr.cIg);
      com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, null);
      AppMethodBeat.o(45806);
      break;
    }
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(45816);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = getString(2131305389);
    h.a(this, str, null, false, new WalletBindUI.7(this));
    AppMethodBeat.o(45816);
  }

  private void cNx()
  {
    AppMethodBeat.i(45805);
    this.pGr.cIg = this.tmh;
    this.mBundle.putParcelable("key_pay_info", this.pGr);
    if (this.tmh == 2)
      if (!bo.isNullOrNil(this.tmg))
      {
        ab.d("MicroMsg.WalletBindUI", "importKey " + this.tmg);
        a(new com.tencent.mm.plugin.wallet.bind.a.c(this.tmg, this.pGr), true, false);
        AppMethodBeat.o(45805);
      }
    while (true)
    {
      return;
      JN("");
      AppMethodBeat.o(45805);
      continue;
      if (this.tmh == 4)
      {
        x.QN(4);
        if (getIntent() == null)
        {
          JN("");
          AppMethodBeat.o(45805);
        }
        else
        {
          String str1 = getIntent().getStringExtra("appId");
          String str2 = getIntent().getStringExtra("timeStamp");
          String str3 = getIntent().getStringExtra("nonceStr");
          String str4 = getIntent().getStringExtra("packageExt");
          String str5 = getIntent().getStringExtra("signtype");
          String str6 = getIntent().getStringExtra("paySignature");
          String str7 = getIntent().getStringExtra("url");
          int i = getIntent().getIntExtra("pay_channel", 0);
          if (this.tmh == 6);
          for (this.tmi = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, str5, str6, str7, 2, "getBrandWCPayCreateCreditCardRequest", i); ; this.tmi = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, str5, str6, str7, 1, "getBrandWCPayBindCardRequest", i))
          {
            a(this.tmi, true, false);
            AppMethodBeat.o(45805);
            break;
          }
        }
      }
      else if (this.tmh == 6)
      {
        cNy();
        AppMethodBeat.o(45805);
      }
      else
      {
        He(this.tmh);
        AppMethodBeat.o(45805);
      }
    }
  }

  private void cNy()
  {
    int i = 0;
    AppMethodBeat.i(45807);
    com.tencent.mm.plugin.wallet.a.s.cNC();
    if (com.tencent.mm.plugin.wallet.a.s.cND().cQl())
    {
      a(new y(null, 12), true, false);
      AppMethodBeat.o(45807);
    }
    while (true)
    {
      return;
      Object localObject1 = getIntent().getStringExtra("packageExt");
      Object localObject2 = ((String)localObject1).split("&");
      if ((!bo.isNullOrNil((String)localObject1)) && (localObject2.length >= 2))
      {
        int j = localObject2.length;
        String str = null;
        localObject1 = null;
        Object localObject4;
        if (i < j)
        {
          Object localObject3 = localObject2[i];
          if (localObject3.startsWith("bankType="))
            localObject4 = localObject3.replace("bankType=", "");
          while (true)
          {
            i++;
            localObject1 = localObject4;
            break;
            localObject4 = localObject1;
            if (localObject3.startsWith("bankName="))
            {
              str = localObject3.replace("bankName=", "");
              localObject4 = localObject1;
            }
          }
        }
        if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil((String)localObject1)))
        {
          com.tencent.mm.plugin.wallet.a.s.cNC();
          if (com.tencent.mm.plugin.wallet.a.s.cND().acC((String)localObject1))
          {
            localObject4 = new Bundle();
            localObject2 = new Bankcard();
            ((Bankcard)localObject2).field_bankName = str;
            ((Bankcard)localObject2).field_bankcardType = ((String)localObject1);
            ((Bundle)localObject4).putParcelable("key_bankcard", (Parcelable)localObject2);
            ((Bundle)localObject4).putString("key_bank_type", ((Bankcard)localObject2).field_bankcardType);
            com.tencent.mm.wallet_core.a.a(this, "WXCreditOpenProcess", (Bundle)localObject4, null);
            AppMethodBeat.o(45807);
          }
        }
      }
      else
      {
        finish();
        AppMethodBeat.o(45807);
      }
    }
  }

  public final boolean bNf()
  {
    return false;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45812);
    if ((paramm instanceof com.tencent.mm.plugin.wallet.bind.a.c))
      this.tmf = true;
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof y))
        if (this.tmh == 6)
        {
          cNy();
          AppMethodBeat.o(45812);
          bool = true;
        }
    while (true)
    {
      return bool;
      cNx();
      break;
      if ((paramm instanceof com.tencent.mm.plugin.wallet.bind.a.c))
      {
        paramm = (com.tencent.mm.plugin.wallet.bind.a.c)paramm;
        Bundle localBundle = this.mBundle;
        localBundle.putBoolean("key_is_import_bind", true);
        if ((paramm.tgB != null) && (paramm.tgB.size() > 0))
        {
          paramString = (Bankcard)paramm.tgB.get(0);
          if (!paramString.txb)
          {
            localBundle.putBoolean("key_need_bind_response", true);
            localBundle.putString("kreq_token", paramm.token);
            localBundle.putString("key_bank_username", paramm.tli);
            localBundle.putString("key_recommand_desc", paramm.tlj);
            localBundle.putParcelable("key_import_bankcard", paramString);
            this.tmf = true;
            localBundle.putInt("key_bind_scene", 2);
            com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, new WalletBindUI.4(this));
          }
        }
        while (true)
        {
          AppMethodBeat.o(45812);
          bool = true;
          break;
          h.a(this, 2131304680, 0, false, new WalletBindUI.5(this));
          continue;
          paramm = paramString;
          if (bo.isNullOrNil(paramString))
            paramm = getString(2131304614);
          h.a(this, paramm, null, false, new WalletBindUI.6(this));
        }
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        if ((this.tmi != null) && (this.tmi.equals(paramm)))
        {
          f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
          this.token = ((com.tencent.mm.plugin.wallet_core.c.a)paramm).getToken();
          He(4);
          AppMethodBeat.o(45812);
          bool = true;
        }
        else
        {
          x.dNV();
        }
      }
      else
      {
        AppMethodBeat.o(45812);
        bool = false;
        continue;
        JN(paramString);
        AppMethodBeat.o(45812);
        bool = true;
      }
    }
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
    AppMethodBeat.i(45811);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        this.onl.bNo();
        AppMethodBeat.o(45811);
      }
    while (true)
    {
      return;
      this.onl.cancel();
      finish();
      AppMethodBeat.o(45811);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = -1;
    AppMethodBeat.i(45804);
    super.onCreate(paramBundle);
    nf(580);
    this.onl.tLw = new WalletBindUI.1(this);
    this.tmg = getIntent().getStringExtra("key_import_key");
    this.tmh = getIntent().getIntExtra("key_bind_scene", -1);
    if (getIntent() != null)
      i = getIntent().getIntExtra("key_bind_scene", 13);
    paramBundle = new uq();
    if (i == 4);
    for (paramBundle.cQP.scene = 20; ; paramBundle.cQP.scene = 13)
    {
      paramBundle.callback = new WalletBindUI.2(this);
      com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      com.tencent.mm.sdk.b.a.xxA.c(this.tmk);
      z.hL(6, 0);
      AppMethodBeat.o(45804);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45810);
    ng(580);
    com.tencent.mm.sdk.b.a.xxA.d(this.tmk);
    super.onDestroy();
    AppMethodBeat.o(45810);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(45815);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.WalletBindUI", "onNewIntent intent null");
      setResult(0);
      finish();
      AppMethodBeat.o(45815);
      return;
    }
    super.onNewIntent(paramIntent);
    ab.v("MicroMsg.WalletBindUI", "onNewIntent");
    setIntent(paramIntent);
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false)))
    {
      ab.d("MicroMsg.WalletBindUI", "pay done... errCode:" + paramIntent.getBooleanExtra("intent_bind_end", false));
      setResult(-1, getIntent());
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(45815);
      break;
      ab.i("MicroMsg.WalletBindUI", "pay cancel");
      setResult(0);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(45809);
    super.onPause();
    this.onl.onPause();
    AppMethodBeat.o(45809);
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(45814);
    super.onRestoreInstanceState(paramBundle);
    this.tmf = paramBundle.getBoolean("key_is_jump", false);
    AppMethodBeat.o(45814);
  }

  public void onResume()
  {
    AppMethodBeat.i(45808);
    if (this.tmf)
      finish();
    super.onResume();
    this.onl.onResume();
    AppMethodBeat.o(45808);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(45813);
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("key_is_jump", this.tmf);
    AppMethodBeat.o(45813);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI
 * JD-Core Version:    0.6.2
 */