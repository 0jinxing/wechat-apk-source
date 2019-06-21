package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.g;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.c.z;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@com.tencent.mm.ui.base.a(2)
public class WalletBalanceSaveUI extends WalletBaseUI
{
  protected Button gHn;
  private final int gnS;
  private View jcl;
  protected WalletFormView kGa;
  protected double pQV;
  private HashMap<String, Integer> pas;
  private ArrayList<Bankcard> tgB;
  protected Bankcard tgC;
  private String tgD;
  protected LinearLayout tgF;

  public WalletBalanceSaveUI()
  {
    AppMethodBeat.i(45479);
    this.gnS = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 270);
    this.pas = new HashMap();
    AppMethodBeat.o(45479);
  }

  private void cfk()
  {
    AppMethodBeat.i(45481);
    s.cNC();
    Object localObject = s.cND();
    this.tgB = ((ak)localObject).cQD();
    this.tgC = ((ak)localObject).a(this.tgB, null, false, true);
    if ((this.tgC != null) && (bo.isNullOrNil(this.tgC.field_forbidWord)))
      this.tgC = null;
    for (int i = 0; ; i++)
      if (i < this.tgB.size())
      {
        if ((this.tgB.get(i) != null) && (bo.isNullOrNil(((Bankcard)this.tgB.get(i)).field_forbidWord)))
          this.tgC = ((Bankcard)this.tgB.get(i));
      }
      else
      {
        if ((this.tgC != null) && (!bo.isNullOrNil(this.tgC.field_forbidWord)))
          this.tgC = null;
        localObject = this.tgB;
        if (localObject == null)
          break;
        for (i = 0; i < ((ArrayList)localObject).size(); i++)
          com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.WalletBalanceSaveUI", "pos %s word %s", new Object[] { Integer.valueOf(i), ((Bankcard)((ArrayList)localObject).get(i)).field_forbidWord });
      }
    AppMethodBeat.o(45481);
  }

  private void cu()
  {
    AppMethodBeat.i(45484);
    final ImageView localImageView;
    Object localObject;
    if (this.tgF != null)
      if (this.tgC != null)
      {
        localImageView = (ImageView)this.tgF.findViewById(2131828609);
        localObject = "";
        com.tencent.mm.plugin.wallet_core.model.e locale = b.i(this, this.tgC.field_bankcardType, this.tgC.cPb());
        if (locale != null)
          localObject = locale.oRi;
        localImageView.setImageBitmap(null);
        if (this.tgC.cPc())
        {
          localImageView.setBackgroundResource(2130840657);
          ((TextView)this.tgF.findViewById(2131828610)).setText(getString(2131304572, new Object[] { this.tgC.field_bankName, this.tgC.field_bankcardTail }));
          ((TextView)this.tgF.findViewById(2131820694)).setText(this.tgC.field_bankcardTypeName);
          if (bo.isNullOrNil(this.tgC.field_avail_save_wording))
            break label265;
          ((TextView)this.tgF.findViewById(2131828611)).setText(this.tgC.field_avail_save_wording);
          AppMethodBeat.o(45484);
        }
      }
    while (true)
    {
      return;
      localObject = x.a(new c((String)localObject));
      x.a(new x.a()
      {
        public final void m(String paramAnonymousString, Bitmap paramAnonymousBitmap)
        {
          AppMethodBeat.i(45478);
          al.d(new WalletBalanceSaveUI.7.1(this, paramAnonymousBitmap));
          AppMethodBeat.o(45478);
        }
      });
      if ((localObject == null) || (localObject == null))
        break;
      localImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, getResources().getDimensionPixelOffset(2131428760), getResources().getDimensionPixelOffset(2131428760), true, false));
      break;
      label265: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
      ((TextView)this.tgF.findViewById(2131828611)).setText("");
      AppMethodBeat.o(45484);
      continue;
      ((TextView)this.tgF.findViewById(2131828610)).setText(this.tgD);
      ((TextView)this.tgF.findViewById(2131828611)).setText("");
      ((ImageView)this.tgF.findViewById(2131828609)).setImageBitmap(null);
      ((TextView)this.tgF.findViewById(2131820694)).setText(getString(2131304571));
      AppMethodBeat.o(45484);
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45480);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wallet.balance.a.e))
      {
        paramString = (com.tencent.mm.plugin.wallet.balance.a.e)paramm;
        boolean bool;
        if ("1".equals(paramString.cRb))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
          paramString.putString("realname_verify_process_jump_plugin", "wallet");
          bwP();
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, null, 0);
        }
        while (bool)
        {
          AppMethodBeat.o(45480);
          return false;
          if ("2".equals(paramString.cRb))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
            bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString.cRc, paramString.cRf, paramString.cRd, paramString.cRe, bwP(), null);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + paramString.cRb);
            bool = false;
          }
        }
        paramm = ((com.tencent.mm.plugin.wallet.balance.a.e)paramm).cBT;
        ad.o(11, paramm, paramInt2);
        if (this.tgC == null)
        {
          paramString = "";
          label215: com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, paramm, "", 11, 1);
        }
      }
    while (true)
    {
      AppMethodBeat.o(45480);
      break;
      paramString = this.tgC.field_bindSerial;
      break label215;
      if ((paramm instanceof y))
      {
        cfk();
        cu();
        continue;
        if ((paramm instanceof com.tencent.mm.plugin.wallet.balance.a.e))
          ad.o(11, "", paramInt2);
      }
    }
  }

  protected void cNd()
  {
    AppMethodBeat.i(45485);
    if (this.tgC != null)
    {
      a(new com.tencent.mm.plugin.wallet.balance.a.e(this.pQV, "CNY", this.tgC.field_bindSerial, this.tgC.field_bankcardType), true, true);
      AppMethodBeat.o(45485);
    }
    while (true)
    {
      return;
      g localg = g.cPl();
      if (localg.aFF())
      {
        com.tencent.mm.ui.base.h.b(this, localg.pbp, getString(2131297061), true);
        AppMethodBeat.o(45485);
      }
      else
      {
        a(new com.tencent.mm.plugin.wallet.balance.a.e(this.pQV, "CNY", "", ""), true, true);
        AppMethodBeat.o(45485);
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971053;
  }

  public final void initView()
  {
    AppMethodBeat.i(45483);
    setMMTitle(2131304580);
    this.jcl = findViewById(2131828642);
    this.kGa = ((WalletFormView)findViewById(2131822842));
    com.tencent.mm.wallet_core.ui.formview.a.f(this.kGa);
    this.kGa.getTitleTv().setText(ae.dOd());
    e(this.kGa, 2, false);
    this.gHn = ((Button)findViewById(2131822846));
    this.gHn.setOnClickListener(new WalletBalanceSaveUI.1(this));
    this.tgF = ((LinearLayout)findViewById(2131828607));
    if (this.tgF != null)
      this.tgF.setOnClickListener(new WalletBalanceSaveUI.2(this));
    this.obM = new WalletBalanceSaveUI.3(this);
    AppMethodBeat.o(45483);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45482);
    super.onCreate(paramBundle);
    if (!r.YM())
      a(new com.tencent.mm.plugin.wallet_core.c.ab(), false, false);
    cfk();
    this.tgD = getString(2131304574);
    initView();
    cu();
    z.hL(3, 0);
    AppMethodBeat.o(45482);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI
 * JD-Core Version:    0.6.2
 */