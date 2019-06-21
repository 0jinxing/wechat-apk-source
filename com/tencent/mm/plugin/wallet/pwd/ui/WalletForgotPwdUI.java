package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletForgotPwdUI extends WalletBaseUI
  implements WalletFormView.a
{
  private LinearLayout eol;
  private Button gEZ;
  private ListView gKd;
  private ArrayList<Bankcard> tlM;
  com.tencent.mm.sdk.b.c tmk;
  private WalletFormView trA;
  private WalletFormView trB;
  private int trC;
  private boolean trD;
  private boolean trE;
  com.tencent.mm.sdk.b.c trF;
  private List<ElementQuery> trx;
  private Bankcard jdField_try;
  private WalletForgotPwdUI.a trz;

  public WalletForgotPwdUI()
  {
    AppMethodBeat.i(46289);
    this.tlM = new ArrayList();
    this.trx = new LinkedList();
    this.trC = 1;
    this.trD = false;
    this.trE = false;
    this.trF = new WalletForgotPwdUI.7(this);
    this.tmk = new WalletForgotPwdUI.8(this);
    AppMethodBeat.o(46289);
  }

  private boolean arW()
  {
    boolean bool = false;
    AppMethodBeat.i(46298);
    if ((this.gKd.getVisibility() == 0) || ((this.trB.asa()) && (this.trA.asa())))
    {
      this.gEZ.setEnabled(true);
      this.gEZ.setClickable(true);
      AppMethodBeat.o(46298);
      bool = true;
    }
    while (true)
    {
      return bool;
      this.gEZ.setEnabled(false);
      this.gEZ.setClickable(false);
      AppMethodBeat.o(46298);
    }
  }

  private void ari()
  {
    AppMethodBeat.i(46296);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_is_reset_with_new_card", this.mBundle.getBoolean("key_is_reset_with_new_card", false));
    cOC();
    if ((this.jdField_try == null) && (!this.trD))
    {
      a(new t(null, this.trA.getText(), null), true, true);
      AppMethodBeat.o(46296);
    }
    Object localObject;
    while (true)
    {
      return;
      if (!this.trD)
        break;
      localObject = r.cPE().cRh();
      if (!bo.isNullOrNil(((aj)localObject).field_find_passwd_url))
      {
        ab.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new bankcard. start to url");
        e.n(this, ((aj)localObject).field_find_passwd_url, false);
        AppMethodBeat.o(46296);
      }
      else
      {
        localBundle.putBoolean("key_is_force_bind", true);
        localBundle.putBoolean("key_is_reset_with_new_card", true);
        if (dOD() != null)
          dOD().a(this, 0, localBundle);
        AppMethodBeat.o(46296);
      }
    }
    com.tencent.mm.wallet_core.c localc = com.tencent.mm.wallet_core.a.aE(this);
    localBundle.putParcelable("key_bankcard", this.jdField_try);
    ElementQuery localElementQuery = new ElementQuery();
    Iterator localIterator = this.trx.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localObject = (ElementQuery)localIterator.next();
      ab.i("MicroMsg.WalletForgotPwdUI", "helios:::" + ((ElementQuery)localObject).pbn);
    }
    while ((bo.isNullOrNil(((ElementQuery)localObject).pbn)) || (bo.isNullOrNil(this.jdField_try.field_bankcardType)) || (!((ElementQuery)localObject).pbn.trim().equals(this.jdField_try.field_bankcardType.trim())));
    while (true)
    {
      localBundle.putParcelable("elemt_query", (Parcelable)localObject);
      if (localc != null)
        localc.a(this, 0, localBundle);
      AppMethodBeat.o(46296);
      break;
      localObject = localElementQuery;
    }
  }

  private void cOC()
  {
    AppMethodBeat.i(46295);
    this.mBundle.remove("elemt_query");
    this.mBundle.remove("key_bankcard");
    this.mBundle.remove("bank_name");
    this.mBundle.remove("key_card_id");
    AppMethodBeat.o(46295);
  }

  private void update()
  {
    AppMethodBeat.i(46293);
    s.cNC();
    this.tlM = s.cND().cQB();
    if ((this.tlM == null) || (this.tlM.size() == 0) || (this.trE))
    {
      ab.i("MicroMsg.WalletForgotPwdUI", "No bound bankcard process %s", new Object[] { Boolean.valueOf(this.trE) });
      this.tlM = new ArrayList();
      this.eol.setVisibility(0);
      this.gKd.setVisibility(8);
      setMMTitle(2131304785);
      ((TextView)findViewById(2131828798)).setText(getString(2131305098));
      WalletFormView localWalletFormView = this.trB;
      s.cNC();
      localWalletFormView.setText(e.atv(s.cND().bhp()));
      AppMethodBeat.o(46293);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletForgotPwdUI", "domestic process!");
      if (com.tencent.mm.wallet_core.a.aE(this) != null)
        a(new t(), true, false);
      this.eol.setVisibility(8);
      this.gEZ.setVisibility(8);
      findViewById(2131828804).setVisibility(0);
      this.trz = new WalletForgotPwdUI.a(this, this);
      this.gKd.setAdapter(this.trz);
      this.trz.items = this.tlM;
      this.trz.notifyDataSetChanged();
      AppMethodBeat.o(46293);
    }
  }

  public final boolean bNf()
  {
    return true;
  }

  public final boolean bwP()
  {
    boolean bool = false;
    AppMethodBeat.i(46300);
    if ((this.tlM == null) || (this.tlM.size() == 0))
    {
      aj localaj = r.cPE().cRh();
      if ((bo.isNullOrNil(localaj.field_find_passwd_url)) && (bo.isNullOrNil(localaj.field_forget_passwd_url)))
        AppMethodBeat.o(46300);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(46300);
      continue;
      AppMethodBeat.o(46300);
    }
  }

  public final boolean bwQ()
  {
    AppMethodBeat.i(46301);
    if (bwP());
    for (int i = 4; ; i = 0)
    {
      AM(i);
      AppMethodBeat.o(46301);
      return true;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46297);
    ab.i("MicroMsg.WalletForgotPwdUI", " errCode: %s errMsg :  scene: ", new Object[] { Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof t))
        break label336;
      paramm = (t)paramm;
      paramString = new Bundle();
      if (bo.isNullOrNil(paramm.kaE))
      {
        this.trx = paramm.tum;
        ab.i("MicroMsg.WalletForgotPwdUI", "scene case 1 mCardId is null");
        AppMethodBeat.o(46297);
      }
      while (true)
      {
        return bool;
        if (paramm.tun == null)
          break label274;
        if (!paramm.tun.isError())
          break;
        ab.i("MicroMsg.WalletForgotPwdUI", "scene case 2 mTargetElement is error");
        h.g(this, 2131304582, 2131297061);
        AppMethodBeat.o(46297);
      }
      if (this.tlM == null);
      for (paramInt1 = 0; ; paramInt1 = this.tlM.size())
      {
        ab.i("MicroMsg.WalletForgotPwdUI", "scene case 3 bankcards size %d", new Object[] { Integer.valueOf(paramInt1) });
        if ((this.tlM != null) && (this.tlM.size() != 0))
          break label324;
        cOC();
        paramString.putString("bank_name", paramm.tun.nuL);
        paramString.putParcelable("elemt_query", paramm.tun);
        paramString.putString("key_card_id", this.trA.getText());
        paramString.putBoolean("key_is_reset_with_new_card", true);
        com.tencent.mm.wallet_core.a.j(this, paramString);
        AppMethodBeat.o(46297);
        break;
      }
      label274: paramString.putString("bank_name", "");
      paramString.putParcelable("elemt_query", new ElementQuery());
      paramString.putString("key_card_id", this.trA.getText());
      paramString.putBoolean("key_is_reset_with_new_card", true);
      com.tencent.mm.wallet_core.a.j(this, paramString);
    }
    label324: label336: 
    do
    {
      do
      {
        AppMethodBeat.o(46297);
        bool = false;
        break;
      }
      while (!(paramm instanceof y));
      if (this.trz != null)
        break label476;
      bool = true;
      ab.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter is null ? %s", new Object[] { Boolean.valueOf(bool) });
    }
    while (this.trz == null);
    paramString = null;
    if (r.cPI() != null)
      paramString = r.cPI().cQB();
    paramm = com.tencent.mm.wallet_core.a.aE(this);
    ArrayList localArrayList;
    if (paramm != null)
    {
      paramm.dNE();
      paramm = new ArrayList();
      localArrayList = new ArrayList();
      Iterator localIterator = paramString.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label500;
        paramString = (Bankcard)localIterator.next();
        if (paramString.field_bankcardTag == 1)
        {
          paramm.add(paramString);
          continue;
          label476: bool = false;
          break;
        }
        if (paramString.field_bankcardTag == 2)
          localArrayList.add(paramString);
      }
      label500: if (paramm.size() > 0)
        this.tlM = paramm;
    }
    else
    {
      label514: if (this.tlM != null)
        break label587;
    }
    label587: for (paramInt1 = 0; ; paramInt1 = this.tlM.size())
    {
      ab.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter update bankcardsize:  %d", new Object[] { Integer.valueOf(paramInt1) });
      this.trz.items = this.tlM;
      new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(46275);
          WalletForgotPwdUI.b(WalletForgotPwdUI.this).notifyDataSetChanged();
          WalletForgotPwdUI.c(WalletForgotPwdUI.this);
          AppMethodBeat.o(46275);
        }
      });
      break;
      this.tlM = localArrayList;
      break label514;
    }
  }

  public boolean cNR()
  {
    return true;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971099;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(46299);
    arW();
    AppMethodBeat.o(46299);
  }

  public void initView()
  {
    AppMethodBeat.i(46294);
    this.gKd = ((ListView)findViewById(2131828799));
    this.eol = ((LinearLayout)findViewById(2131828800));
    this.trB = ((WalletFormView)findViewById(2131828681));
    this.trA = ((WalletFormView)findViewById(2131828801));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.trA);
    if (this.mBundle.getBoolean("key_is_paymanager", false))
      com.tencent.mm.wallet_core.ui.formview.a.d(this, this.trB);
    while (true)
    {
      this.trB.setOnInputValidChangeListener(this);
      this.trA.setOnInputValidChangeListener(this);
      this.gEZ = ((Button)findViewById(2131822846));
      this.gEZ.setOnClickListener(new WalletForgotPwdUI.1(this));
      this.trD = false;
      s.cNC();
      this.tlM = s.cND().cQB();
      update();
      findViewById(2131828804).setOnClickListener(new WalletForgotPwdUI.2(this));
      arW();
      a(this.trA, 0, false, false);
      this.trA.setOnInfoIvClickListener(new WalletForgotPwdUI.3(this));
      this.trA.getInfoIv().setImageResource(2131232128);
      this.trA.getInfoIv().setVisibility(0);
      AppMethodBeat.o(46294);
      return;
      com.tencent.mm.wallet_core.ui.formview.a.e(this, this.trB);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46302);
    super.onActivityResult(paramInt1, paramInt1, paramIntent);
    if ((paramInt2 == -1) && (1 == paramInt1))
    {
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.trA.set3DesValStr(paramIntent);
      ari();
    }
    AppMethodBeat.o(46302);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46290);
    super.onCreate(paramBundle);
    setMMTitle(2131305138);
    this.trE = this.mBundle.getBoolean("key_is_force_bind", false);
    if (!this.trE)
    {
      a(new y(null, 6), true, true);
      AM(4);
    }
    initView();
    com.tencent.mm.sdk.b.a.xxA.c(this.trF);
    com.tencent.mm.sdk.b.a.xxA.c(this.tmk);
    AppMethodBeat.o(46290);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46291);
    com.tencent.mm.sdk.b.a.xxA.d(this.trF);
    com.tencent.mm.sdk.b.a.xxA.d(this.tmk);
    super.onDestroy();
    AppMethodBeat.o(46291);
  }

  public void onResume()
  {
    AppMethodBeat.i(46292);
    super.onResume();
    update();
    AppMethodBeat.o(46292);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI
 * JD-Core Version:    0.6.2
 */