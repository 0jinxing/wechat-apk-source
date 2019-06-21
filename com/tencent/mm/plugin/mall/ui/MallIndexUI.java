package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.g.a.uq.b;
import com.tencent.mm.g.a.vw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.mall.a.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.plugin.wallet_core.ui.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.math.BigDecimal;
import java.math.RoundingMode;

@i
public class MallIndexUI extends MallIndexBaseUI
{
  private String cRs;
  private boolean eTM;
  private View jNV;
  private TextView omQ;
  private boolean omR;
  uq.b onh;
  private RelativeLayout oni;
  private boolean onj;
  private boolean onk;
  s onl;
  private boolean onm;
  private Dialog onn;
  private boolean ono;
  private com.tencent.mm.sdk.b.c<lu> onp;
  private boolean onq;
  private com.tencent.mm.sdk.b.c onr;
  private com.tencent.mm.sdk.b.c<vw> ons;
  private boolean ont;

  public MallIndexUI()
  {
    AppMethodBeat.i(43222);
    this.eTM = false;
    this.onl = new s();
    this.jNV = null;
    this.omR = false;
    this.omQ = null;
    this.onm = false;
    this.ono = false;
    this.onp = new com.tencent.mm.sdk.b.c()
    {
    };
    this.onq = false;
    this.onr = new MallIndexUI.9(this);
    this.ons = new MallIndexUI.10(this);
    this.ont = false;
    AppMethodBeat.o(43222);
  }

  private void a(d paramd)
  {
    AppMethodBeat.i(43244);
    if ((paramd == null) || (bo.isNullOrNil(paramd.okM)))
      AppMethodBeat.o(43244);
    while (true)
    {
      return;
      if (this.omR)
      {
        if (this.omQ != null)
        {
          this.omQ.setText(2131301318);
          this.omQ.setOnClickListener(new MallIndexUI.7(this, paramd));
        }
        AppMethodBeat.o(43244);
      }
      else
      {
        this.jNV = View.inflate(this, 2130970032, null);
        this.jNV.setClickable(false);
        this.jNV.setEnabled(false);
        this.omQ = ((TextView)this.jNV.findViewById(2131825757));
        this.omQ.setVisibility(0);
        this.omQ.setText(2131301318);
        this.omQ.setTextColor(getResources().getColor(2131690208));
        this.omQ.setOnClickListener(new MallIndexUI.8(this, paramd));
        this.omu.addFooterView(this.jNV);
        this.omR = true;
        AppMethodBeat.o(43244);
      }
    }
  }

  private void iQ(boolean paramBoolean)
  {
    AppMethodBeat.i(43235);
    if (paramBoolean)
      this.omy.setText(getString(2131304836));
    AppMethodBeat.o(43235);
  }

  protected final void bFY()
  {
    AppMethodBeat.i(43225);
    int i = getResources().getColor(2131690259);
    xE(i);
    dyb();
    findViewById(2131825792).setBackgroundColor(i);
    AppMethodBeat.o(43225);
  }

  protected final void bGb()
  {
    AppMethodBeat.i(43229);
    this.omC = com.tencent.mm.plugin.mall.a.j.bMV().yl(this.okT).field_isShowSetting;
    if (this.omE == null)
    {
      this.omE = v.hu(this).inflate(2130970035, null);
      this.omu.addFooterView(this.omE, null, false);
      TextView localTextView = (TextView)this.omE.findViewById(2131825772);
      com.tencent.mm.wallet_core.ui.e.aA(localTextView, 100);
      localTextView.setOnClickListener(new MallIndexUI.12(this));
    }
    ab.i("MicorMsg.MallIndexUI", "is show setting: %s", new Object[] { Integer.valueOf(this.omC) });
    if (this.omC == 0)
    {
      this.omE.setVisibility(8);
      this.omE.setPadding(0, 0, 0, 0);
      AppMethodBeat.o(43229);
    }
    while (true)
    {
      return;
      this.omE.setVisibility(0);
      getWindow().getDecorView().post(new MallIndexUI.13(this));
      AppMethodBeat.o(43229);
    }
  }

  protected final void bNa()
  {
    AppMethodBeat.i(43240);
    com.tencent.mm.plugin.mall.b.a.bNu();
    AppMethodBeat.o(43240);
  }

  protected final void bNb()
  {
    AppMethodBeat.i(43241);
    com.tencent.mm.plugin.wallet_core.model.r.cPE().cRh();
    if (((com.tencent.mm.plugin.wallet_core.model.r.cPE().cRh().cQj()) || (com.tencent.mm.plugin.wallet_core.model.r.cPE().cRh().cQi())) && (com.tencent.mm.model.r.YM()))
    {
      ab.e("MicorMsg.MallIndexUI", "hy: user not open wallet or status unknown. try query");
      a(new com.tencent.mm.plugin.wallet_core.c.b.a("", false), true, false);
    }
    AppMethodBeat.o(43241);
  }

  protected final boolean bNd()
  {
    AppMethodBeat.i(43232);
    ab.i("MicorMsg.MallIndexUI", "init BankcardList");
    uq localuq = new uq();
    localuq.cQP.scene = 1;
    localuq.cQP.cQR = true;
    localuq.cQP.cQS = true;
    localuq.cQQ.cQH = new MallIndexUI.3(this, localuq);
    com.tencent.mm.sdk.b.a.xxA.a(localuq, Looper.myLooper());
    AppMethodBeat.o(43232);
    return false;
  }

  protected final void bNh()
  {
    AppMethodBeat.i(43231);
    uo localuo = new uo();
    localuo.cQJ.cQL = "1";
    localuo.callback = new MallIndexUI.16(this, localuo);
    com.tencent.mm.sdk.b.a.xxA.m(localuo);
    AppMethodBeat.o(43231);
  }

  protected final void bNi()
  {
    AppMethodBeat.i(43234);
    ab.i("MicorMsg.MallIndexUI", "updateBalanceNum");
    ai localai = new ai();
    boolean bool;
    Object localObject;
    if ((localai.tCP & 0x4000) > 0)
    {
      bool = true;
      ab.i("MicroMsg.WalletSwitchConfig", "isHideBalanceNum, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(localai.tCP) });
      if (!bool)
        break label132;
      g.RQ();
      localObject = (String)g.RP().Ry().get(ac.a.xNJ, getString(2131302174));
      this.omy.setText((CharSequence)localObject);
      this.omy.setVisibility(0);
      iQ(localai.cQf());
      AppMethodBeat.o(43234);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label132: if ((localai.tCP & 0x400000) > 0)
      {
        bool = true;
        label145: ab.i("MicroMsg.WalletSwitchConfig", "isShowBalanceAmount, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(localai.tCP) });
        if (bool)
        {
          ab.i("MicorMsg.MallIndexUI", "show balance amount");
          localObject = com.tencent.mm.plugin.wallet_core.model.r.cPI();
          if (((ak)localObject).tCT == null)
            break label245;
        }
      }
      label245: for (long l = ((ak)localObject).tCT.field_wallet_balance; ; l = -1L)
      {
        if (l >= 0L)
          break label253;
        ab.w("MicorMsg.MallIndexUI", "wallet balance is null!");
        this.omy.setVisibility(8);
        AppMethodBeat.o(43234);
        break;
        bool = false;
        break label145;
      }
      label253: localObject = com.tencent.mm.wallet_core.ui.e.G(com.tencent.mm.wallet_core.ui.e.a(String.valueOf(l), "100", 2, RoundingMode.HALF_UP).doubleValue());
      this.omy.setText((CharSequence)localObject);
      this.omy.setVisibility(0);
      iQ(localai.cQf());
      AppMethodBeat.o(43234);
    }
  }

  protected final void bNk()
  {
    AppMethodBeat.i(43236);
    this.mController.removeAllOptionMenu();
    ab.i("MicorMsg.MallIndexUI", "addIconOptionMenuByMode");
    MallIndexUI.5 local5 = new MallIndexUI.5(this);
    this.mController.addIconOptionMenu(0, 0, 2130839555, false, local5);
    h.pYm.e(14872, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", "", Integer.valueOf(1) });
    AppMethodBeat.o(43236);
  }

  protected final void bNm()
  {
    AppMethodBeat.i(43233);
    if (this.omx == null)
      AppMethodBeat.o(43233);
    while (true)
    {
      return;
      if ((!com.tencent.mm.x.c.PK().b(ac.a.xSK, ac.a.xSL)) && (!this.onh.cQV))
      {
        n localn = com.tencent.mm.plugin.wallet_core.model.r.cPI().tCW;
        if (localn == null)
          break label134;
        i = localn.field_red_dot_index;
        g.RQ();
        if ((((Integer)g.RP().Ry().get(ac.a.xMg, Integer.valueOf(-1))).intValue() >= i) || (i <= 0))
          break label126;
        ab.i("MicorMsg.MallIndexUI", "bankcard need red point");
      }
      label134: for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label139;
        this.omx.setVisibility(0);
        AppMethodBeat.o(43233);
        break;
        label126: ab.i("MicorMsg.MallIndexUI", "bankcard do not need red point");
      }
      label139: this.omx.setVisibility(8);
      AppMethodBeat.o(43233);
    }
  }

  protected final void bbC()
  {
    AppMethodBeat.i(43226);
    setMMTitle(2131301322);
    AppMethodBeat.o(43226);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43243);
    super.c(paramInt1, paramInt2, paramString, paramm);
    if ((paramm instanceof com.tencent.mm.plugin.mall.a.e))
    {
      a(((com.tencent.mm.plugin.mall.a.e)paramm).okN);
      AppMethodBeat.o(43243);
    }
    while (true)
    {
      return true;
      if (!(paramm instanceof y))
        break;
      paramString = (y)paramm;
      if ((!paramString.bLD()) || (!paramString.nYe.a(this, new MallIndexUI.6(this))))
        break;
      AppMethodBeat.o(43243);
    }
  }

  protected final void dp(View paramView)
  {
    AppMethodBeat.i(43230);
    g.RQ();
    boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xUl, Boolean.FALSE)).booleanValue();
    g.RQ();
    long l = ((Long)g.RP().Ry().get(ac.a.xUm, Long.valueOf(0L))).longValue();
    if ((bool) && (l > 0L) && (System.currentTimeMillis() >= l))
    {
      ab.i("MicorMsg.MallIndexUI", "hasRedDot expire, ignore reddot");
      g.RQ();
      g.RP().Ry().set(ac.a.xUl, Boolean.FALSE);
      g.RQ();
      g.RP().Ry().set(ac.a.xUm, Long.valueOf(0L));
      bool = false;
    }
    while (true)
    {
      LinearLayout localLinearLayout1 = (LinearLayout)paramView.findViewById(2131825768);
      LinearLayout localLinearLayout2 = (LinearLayout)paramView.findViewById(2131825769);
      this.omy = ((TextView)localLinearLayout2.findViewById(2131825771));
      paramView = (ImageView)localLinearLayout2.findViewById(2131825770);
      if (bool)
        paramView.setVisibility(0);
      while (true)
      {
        localLinearLayout1.setOnClickListener(new MallIndexUI.14(this));
        localLinearLayout2.setOnClickListener(new MallIndexUI.15(this));
        AppMethodBeat.o(43230);
        return;
        paramView.setVisibility(8);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(43242);
    this.eTM = true;
    super.finish();
    AppMethodBeat.o(43242);
  }

  protected final void initHeaderView()
  {
    AppMethodBeat.i(43228);
    this.omD = v.hu(this).inflate(2130970034, null);
    this.omu.addHeaderView(this.omD, null, false);
    LinearLayout localLinearLayout = (LinearLayout)this.omD.findViewById(2131825767);
    LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams2 = localLayoutParams1;
    if (localLayoutParams1 == null)
      localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams2.height = a.bMX();
    localLinearLayout.setLayoutParams(localLayoutParams2);
    AppMethodBeat.o(43228);
  }

  public final void initView()
  {
    AppMethodBeat.i(43227);
    super.initView();
    this.omu.setPadding(a.olm, 0, a.olm, 0);
    AppMethodBeat.o(43227);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43223);
    ab.i("MicorMsg.MallIndexUI", "onActivityResult %s %s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 3)
      if (paramInt2 == -1)
      {
        this.onl.bNo();
        AppMethodBeat.o(43223);
      }
    while (true)
    {
      return;
      this.onl.cancel();
      AppMethodBeat.o(43223);
      continue;
      if (paramInt1 == 5)
      {
        g.RQ();
        if (!((Boolean)g.RP().Ry().get(ac.a.xVC, Boolean.FALSE)).booleanValue())
          finish();
      }
      AppMethodBeat.o(43223);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43224);
    this.yll = true;
    ((com.tencent.mm.plugin.walletlock.a.b)g.K(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    com.tencent.mm.plugin.wallet_core.model.k.Hp(2);
    this.onh = new uq.b();
    this.onh.cQT = false;
    this.onh.cQU = true;
    this.onh.cQV = false;
    this.onp.dnU();
    this.ons.dnU();
    this.onl.tLw = new MallIndexUI.11(this);
    c.iR(true);
    a.a(this, false, true);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.c(this.onr);
    nf(2713);
    nf(385);
    if (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null)))
    {
      g.RQ();
      a(new d((String)g.RP().Ry().get(ac.a.xVD, "")));
      g.RQ();
      ((Boolean)g.RP().Ry().get(ac.a.xVC, Boolean.FALSE)).booleanValue();
      a(new com.tencent.mm.plugin.mall.a.e(), false, false);
    }
    h.pYm.e(16500, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(43224);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43239);
    super.onDestroy();
    this.onp.dead();
    this.ons.dead();
    ng(2713);
    ng(385);
    com.tencent.mm.sdk.b.a.xxA.d(this.onr);
    AppMethodBeat.o(43239);
  }

  public void onPause()
  {
    AppMethodBeat.i(43238);
    super.onPause();
    this.onl.onPause();
    AppMethodBeat.o(43238);
  }

  public void onResume()
  {
    AppMethodBeat.i(43237);
    ab.v("MicorMsg.MallIndexUI", "alvinluo MallIndexUI onResume");
    this.onl.onResume();
    com.tencent.mm.plugin.walletlock.a.b localb = (com.tencent.mm.plugin.walletlock.a.b)g.K(com.tencent.mm.plugin.walletlock.a.b.class);
    localb.a(this, localb.cTi(), null);
    super.onResume();
    AppMethodBeat.o(43237);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI
 * JD-Core Version:    0.6.2
 */