package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.c.p;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

public class WalletSwitchWalletCurrencyUI extends WalletBaseUI
  implements View.OnClickListener
{
  private ListView tKR;
  private ArrayList<aa> tKS = null;
  private r tKT = null;
  private aa tKU;
  private aa tKV;

  private void nq(boolean paramBoolean)
  {
    AppMethodBeat.i(47684);
    ab.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = ".concat(String.valueOf(paramBoolean)));
    a(new l(), paramBoolean, false);
    AppMethodBeat.o(47684);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(47683);
    if ((paramm instanceof l))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet succ and update view");
        this.tKS = com.tencent.mm.plugin.wallet_core.model.r.cPL().cRg();
        this.tKT.mData = this.tKS;
        this.tKT.notifyDataSetChanged();
        AppMethodBeat.o(47683);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet error");
      if (this.tKS == null)
      {
        ab.e("MicroMsg.WalletSwitchWalletCurrencyUI", "wallet list is null in cache");
        AppMethodBeat.o(47683);
        bool = false;
      }
      else
      {
        ab.e("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache wallet list data");
        AppMethodBeat.o(47683);
        continue;
        if (((paramm instanceof p)) && (paramInt1 == 0) && (paramInt2 == 0))
        {
          this.tKU.field_wallet_selected = 1;
          ab.i("MicroMsg.WalletSwitchWalletCurrencyUI", "set user wallet succ. current wallet type = " + this.tKU.field_wallet_type + " " + this.tKU.field_wallet_tpa_country_mask);
          an.dhQ().reset();
          com.tencent.mm.plugin.wallet_core.model.r.cPL().c(this.tKU, new String[0]);
          paramString = this.tKT.tKX;
          if (paramString != null)
          {
            paramString.field_wallet_selected = 0;
            com.tencent.mm.plugin.wallet_core.model.r.cPL().c(paramString, new String[0]);
          }
          g.RQ();
          g.RP().Ry().set(339975, Integer.valueOf(this.tKU.field_wallet_type));
          g.RQ();
          g.RP().Ry().set(ac.a.xNQ, Integer.valueOf(this.tKU.field_wallet_tpa_country_mask));
          if (com.tencent.mm.model.r.YN())
          {
            com.tencent.mm.plugin.wallet_core.model.r.cPD();
            com.tencent.mm.plugin.wallet_core.model.r.B(this, null);
          }
          setResult(-1);
          finish();
          AppMethodBeat.o(47683);
        }
        else
        {
          AppMethodBeat.o(47683);
          bool = false;
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130971176;
  }

  public final void initView()
  {
    AppMethodBeat.i(47682);
    this.tKR = ((ListView)findViewById(2131829072));
    this.tKT = new r(this, this.tKS);
    this.tKR.setAdapter(this.tKT);
    if ((this.tKS != null) && (this.tKS.size() > 0))
    {
      this.tKT.mData = this.tKS;
      this.tKT.notifyDataSetChanged();
    }
    this.tKR.setOnItemClickListener(new WalletSwitchWalletCurrencyUI.1(this));
    AppMethodBeat.o(47682);
  }

  public void onClick(View paramView)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47681);
    super.onCreate(paramBundle);
    setMMTitle(2131305381);
    g.RQ();
    g.RP().Ry().set(ac.a.xML, Boolean.TRUE);
    getIntent().getIntExtra("switch_wallet_scene", 0);
    this.tKS = com.tencent.mm.plugin.wallet_core.model.r.cPL().cRg();
    if ((this.tKS == null) || (this.tKS.size() == 0))
    {
      ab.i("MicroMsg.WalletSwitchWalletCurrencyUI", "not data cache,do NetSceneQueryUserWallet");
      nq(true);
    }
    while (true)
    {
      initView();
      setResult(0);
      AppMethodBeat.o(47681);
      return;
      ab.i("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache data first, and do NetSceneQueryUserWallet for update cache");
      nq(false);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSwitchWalletCurrencyUI
 * JD-Core Version:    0.6.2
 */