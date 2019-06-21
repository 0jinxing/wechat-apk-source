package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.gq;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@com.tencent.mm.ui.base.a(7)
public class WalletOfflineEntranceUI extends WalletBaseUI
{
  private int gOW;
  private int gwj;
  boolean paU;
  private boolean paV;
  private c<gq> paW;

  public WalletOfflineEntranceUI()
  {
    AppMethodBeat.i(43634);
    this.paU = true;
    this.gwj = -1;
    this.paV = false;
    this.paW = new WalletOfflineEntranceUI.1(this);
    AppMethodBeat.o(43634);
  }

  private void bYa()
  {
    AppMethodBeat.i(43636);
    ab.v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onCreate()");
    k.Hp(1);
    e.QS(30);
    bYc();
    this.gOW = getIntent().getIntExtra("key_from_scene", 0);
    Intent localIntent;
    String str1;
    String str2;
    String str3;
    String str4;
    Object localObject;
    String str5;
    int i;
    if ((!getIntent().getBooleanExtra("is_offline_create", false)) && ((this.gOW == 6) || (this.gOW == 7)))
    {
      ab.i("MicroMsg.WalletOfflineEntranceUI", "from h5 or wxapp check sign: %s", new Object[] { Integer.valueOf(this.gOW) });
      localIntent = getIntent();
      str1 = localIntent.getStringExtra("appId");
      str2 = localIntent.getStringExtra("timeStamp");
      str3 = localIntent.getStringExtra("nonceStr");
      str4 = localIntent.getStringExtra("packageExt");
      localObject = localIntent.getStringExtra("signtype");
      str5 = localIntent.getStringExtra("paySignature");
      i = localIntent.getIntExtra("pay_channel", 0);
      if (this.gOW == 6)
      {
        localObject = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, (String)localObject, str5, localIntent.getStringExtra("url"), 16, "openOfflinePayView", i);
        nf(580);
        a((m)localObject, true, false);
        this.paU = false;
        AppMethodBeat.o(43636);
      }
    }
    while (true)
    {
      return;
      localObject = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, (String)localObject, str5, 16, localIntent.getStringExtra("wxapp_username"), localIntent.getStringExtra("wxapp_path"), "openOfflinePayView", i);
      break;
      init();
      this.paU = false;
      AppMethodBeat.o(43636);
    }
  }

  private void bYb()
  {
    int i = 3;
    AppMethodBeat.i(43638);
    Intent localIntent = getIntent();
    int j;
    if ((localIntent != null) && (localIntent.hasExtra("key_from_scene")))
    {
      j = localIntent.getIntExtra("key_from_scene", 0);
      if (j != 1)
        break label78;
      this.gwj = 1;
      i = 2;
    }
    while (true)
    {
      h.pYm.e(14021, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
      AppMethodBeat.o(43638);
      return;
      label78: if (j == 2)
      {
        this.gwj = 2;
        i = 1;
      }
      else if (j == 3)
      {
        this.gwj = 3;
      }
      else if (j == 4)
      {
        this.gwj = 4;
        i = 6;
      }
      else if (j == 5)
      {
        this.gwj = 8;
        i = 4;
      }
      else if (j == 6)
      {
        this.gwj = 10;
        i = 7;
      }
      else if (j == 7)
      {
        this.gwj = 11;
        i = 8;
      }
      else if (j == 8)
      {
        this.gwj = 12;
        i = 9;
      }
      else
      {
        this.gwj = 0;
        ab.i("MicroMsg.WalletOfflineEntranceUI", "unknown scene: %d", new Object[] { Integer.valueOf(j) });
        i = 1;
      }
    }
  }

  private void bYc()
  {
    AppMethodBeat.i(43644);
    int i;
    if (getIntent() != null)
    {
      i = getIntent().getIntExtra("key_from_scene", 0);
      ab.i("MicroMsg.WalletOfflineEntranceUI", "parserCardData(), scene is ".concat(String.valueOf(i)));
      if (i == 3)
      {
        com.tencent.mm.plugin.offline.c.a.pbe = i;
        i = getIntent().getIntExtra("key_expire_time", 0);
        long l = getIntent().getLongExtra("key_begin_time", 0L);
        boolean bool = getIntent().getBooleanExtra("key_is_mark", false);
        ab.i("MicroMsg.WalletOfflineEntranceUI", "expire_time:" + i + " beginTime:" + l + " isMark:" + bool);
        com.tencent.mm.plugin.offline.c.a.pbf = i;
        com.tencent.mm.plugin.offline.c.a.pbg = l;
        com.tencent.mm.plugin.offline.c.a.pbh = bool;
        com.tencent.mm.plugin.offline.c.a.kaE = getIntent().getStringExtra("key_card_id");
        com.tencent.mm.plugin.offline.c.a.pbi = getIntent().getStringExtra("key_user_card_id");
        com.tencent.mm.plugin.offline.c.a.pbj = getIntent().getStringExtra("key_card_code");
        AppMethodBeat.o(43644);
      }
    }
    while (true)
    {
      return;
      if ((i == 1) || (i == 2) || (i == 4))
      {
        com.tencent.mm.plugin.offline.c.a.pbe = i;
        com.tencent.mm.plugin.offline.c.a.pbf = 0;
        com.tencent.mm.plugin.offline.c.a.pbg = 0L;
        com.tencent.mm.plugin.offline.c.a.pbh = false;
        com.tencent.mm.plugin.offline.c.a.kaE = "";
        com.tencent.mm.plugin.offline.c.a.pbi = "";
        com.tencent.mm.plugin.offline.c.a.pbj = "";
      }
      AppMethodBeat.o(43644);
    }
  }

  private void init()
  {
    AppMethodBeat.i(43639);
    bYb();
    if (r.cPI().cQl())
    {
      ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isDataInvalid()");
      a(new y(null, 8), true, false);
      this.paU = false;
      AppMethodBeat.o(43639);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("key_entry_scene", this.gwj);
      localIntent.putExtra("key_from_scene", this.gOW);
      String str = getIntent().getStringExtra("key_business_attach");
      if (!bo.isNullOrNil(str))
        localIntent.putExtra("key_business_attach", str);
      localIntent.putExtra("is_offline_create", getIntent().getBooleanExtra("is_offline_create", false));
      localIntent.putExtra("key_appid", getIntent().getStringExtra("key_appid"));
      d.b(this.mController.ylL, "offline", ".ui.WalletOfflineCoinPurseUI", localIntent, 1);
      AppMethodBeat.o(43639);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(43642);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
        f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        init();
        if ((this.gOW == 6) || (this.gOW == 7))
        {
          paramString = new Intent();
          if (this.paV)
          {
            paramString.putExtra("key_callback", "return");
            setResult(-1, paramString);
          }
        }
        else
        {
          AppMethodBeat.o(43642);
        }
      }
    while (true)
    {
      return bool;
      paramString.putExtra("key_callback", "ok");
      break;
      ab.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((this.gOW == 6) || (this.gOW == 7))
      {
        paramString = new Intent();
        paramString.putExtra("key_callback", "fail");
        setResult(0, paramString);
      }
      finish();
      AppMethodBeat.o(43642);
      continue;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
        init();
        AppMethodBeat.o(43642);
      }
      else
      {
        ab.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        init();
        ab.e("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd FAIL");
        finish();
        AppMethodBeat.o(43642);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43641);
    if ((paramInt1 == 1) && (paramInt2 == -1))
      ab.i("MicroMsg.WalletOfflineEntranceUI", "do not finish");
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(43641);
      return;
      finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43635);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.clearFlags(67108864);
      paramBundle.getDecorView().setSystemUiVisibility(1280);
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(0);
    }
    while (true)
    {
      b.dNJ();
      b.init(getApplicationContext());
      this.paW.dnU();
      bYa();
      AppMethodBeat.o(43635);
      return;
      if (Build.VERSION.SDK_INT >= 19)
        getWindow().addFlags(67108864);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43637);
    super.onDestroy();
    this.paW.dead();
    AppMethodBeat.o(43637);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43643);
    if (paramInt == 4)
      finish();
    AppMethodBeat.o(43643);
    return true;
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(43645);
    ab.i("MicroMsg.WalletOfflineEntranceUI", "onNewIntent");
    if ((paramIntent != null) && (paramIntent.hasExtra("is_offline_create")))
    {
      this.paU = true;
      this.paV = true;
      setIntent(paramIntent);
      bYa();
      AppMethodBeat.o(43645);
    }
    while (true)
    {
      return;
      this.paU = false;
      this.paV = true;
      setIntent(paramIntent);
      bYa();
      AppMethodBeat.o(43645);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(43640);
    super.onResume();
    ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onResume()");
    if (this.paU)
    {
      ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is true , finish activity");
      if (com.tencent.mm.plugin.offline.c.a.bYd())
      {
        ab.v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() true");
        Intent localIntent = new Intent();
        localIntent.putExtra("key_entry_scene", this.gwj);
        localIntent.putExtra("key_from_scene", 0);
        AppMethodBeat.o(43640);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() false");
      AppMethodBeat.o(43640);
      continue;
      ab.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is false , not finish activity");
      this.paU = true;
      AppMethodBeat.o(43640);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI
 * JD-Core Version:    0.6.2
 */