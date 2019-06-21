package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.z;

@com.tencent.mm.ui.base.a(7)
public class WalletBrandUI extends MMActivity
  implements f
{
  private String appId;
  private String cIe;
  private int cQO;
  private Dialog gII;
  private boolean tRO;
  private WalletBrandUI.b tRP;
  private String tRQ;
  private m tRR;
  private c tRS;
  private c tRT;

  public WalletBrandUI()
  {
    AppMethodBeat.i(48260);
    this.tRO = false;
    this.gII = null;
    this.tRR = null;
    this.tRS = new c()
    {
    };
    this.tRT = new WalletBrandUI.3(this);
    AppMethodBeat.o(48260);
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
    AppMethodBeat.i(48269);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.WalletBrandUI", "onActivityResultresultCode : " + paramInt2 + " requestCode: " + paramInt1);
    if (paramInt2 == -1)
      switch (paramInt1)
      {
      default:
      case 1:
      }
    while (true)
    {
      finish();
      AppMethodBeat.o(48269);
      return;
      ab.i("MicroMsg.WalletBrandUI", "get result to callback? " + paramIntent.getStringExtra("test"));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48261);
    super.onCreate(paramBundle);
    if ((Build.VERSION.SDK_INT >= 21) && (getWindow() != null))
    {
      getWindow().addFlags(-2147483648);
      getWindow().setStatusBarColor(0);
    }
    this.cQO = getIntent().getIntExtra("pay_scene", 3);
    this.tRQ = getIntent().getStringExtra("intent_app_brand_from_scene");
    z.dNW();
    ab.i("MicroMsg.WalletBrandUI", "onCreate");
    int i = getIntent().getIntExtra("pay_for_wallet_type", 1);
    ab.i("MicroMsg.WalletBrandUI", "onCreate payForWalletType is ".concat(String.valueOf(i)));
    if (r.YM())
    {
      ab.i("MicroMsg.WalletBrandUI", "hy: do pay with payu");
      this.tRP = new WalletBrandUI.c(this);
    }
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.c(this.tRS);
      com.tencent.mm.sdk.b.a.xxA.c(this.tRT);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(this.tRP.cSY(), this);
      AppMethodBeat.o(48261);
      return;
      if (i == 2)
      {
        ab.i("MicroMsg.WalletBrandUI", "hy: do pay with h5");
        this.tRP = new WalletBrandUI.a(this);
      }
      else if (i == 3)
      {
        ab.i("MicroMsg.WalletBrandUI", "do pay with mall");
        this.tRP = new WalletBrandUI.e(this);
      }
      else
      {
        ab.i("MicroMsg.WalletBrandUI", "hy: do pay with tenpay");
        this.tRP = new WalletBrandUI.d(this);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48262);
    ab.i("MicroMsg.WalletBrandUI", "onDestroy");
    super.onDestroy();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(this.tRP.cSY(), this);
    com.tencent.mm.sdk.b.a.xxA.d(this.tRS);
    com.tencent.mm.sdk.b.a.xxA.d(this.tRT);
    AppMethodBeat.o(48262);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(48265);
    boolean bool;
    if (paramInt == 4)
    {
      finish();
      bool = true;
      AppMethodBeat.o(48265);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(48265);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(48263);
    ab.i("MicroMsg.WalletBrandUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(48263);
  }

  public void onResume()
  {
    AppMethodBeat.i(48264);
    ab.i("MicroMsg.WalletBrandUI", "onResume");
    super.onResume();
    ab.i("MicroMsg.WalletBrandUI", "Handler jump intercept = %b,taskid = %d,parentName = %s", new Object[] { Boolean.valueOf(this.tRO), Integer.valueOf(getTaskId()), getCallingActivity() });
    if (!this.tRO)
    {
      this.tRO = true;
      this.tRR = this.tRP.cSZ();
      if (this.gII != null)
      {
        this.gII.dismiss();
        this.gII = null;
      }
      this.gII = com.tencent.mm.wallet_core.ui.g.g(this, new WalletBrandUI.1(this));
    }
    AppMethodBeat.o(48264);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48268);
    ab.i("MicroMsg.WalletBrandUI", "hy: brandui on scene end. errType: %d, errCode: %d, errMsg:%s scene %s _scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm, this.tRR });
    if ((paramm.getType() != this.tRP.cSY()) || (paramm != this.tRR))
      AppMethodBeat.o(48268);
    while (true)
    {
      return;
      this.tRP.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(48268);
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(48266);
    super.onStart();
    AppMethodBeat.o(48266);
  }

  public void onStop()
  {
    AppMethodBeat.i(48267);
    super.onStop();
    if (this.gII != null)
    {
      this.gII.dismiss();
      this.gII = null;
    }
    AppMethodBeat.o(48267);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI
 * JD-Core Version:    0.6.2
 */