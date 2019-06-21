package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.m.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.csg;
import com.tencent.mm.protocal.protobuf.csh;
import com.tencent.mm.protocal.protobuf.csi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.LinkedList;

public class MallIndexOSUI extends MallIndexBaseUI
{
  private boolean eTM;
  private View jNV;
  private long lastUpdateTime;
  private MallIndexOSUI.a[] omO;
  private ag omP;
  private TextView omQ;
  private boolean omR;
  private long omS;
  private boolean omT;
  private boolean omU;
  private String omV;
  private int omW;
  private com.tencent.mm.sdk.b.c omX;
  private com.tencent.mm.sdk.b.c omY;

  public MallIndexOSUI()
  {
    AppMethodBeat.i(43187);
    this.omO = new MallIndexOSUI.a[4];
    this.omP = new ag();
    this.omQ = null;
    this.lastUpdateTime = 0L;
    this.jNV = null;
    this.omR = false;
    this.eTM = false;
    this.omS = 0L;
    this.omT = false;
    this.omU = false;
    this.omV = "";
    this.omW = 0;
    this.omX = new MallIndexOSUI.1(this);
    this.omY = new MallIndexOSUI.2(this);
    AppMethodBeat.o(43187);
  }

  public final void a(MallFunction paramMallFunction, int paramInt)
  {
    AppMethodBeat.i(43191);
    super.a(paramMallFunction, paramInt);
    com.tencent.mm.plugin.report.service.h.pYm.e(13720, new Object[] { paramMallFunction.nmz, Long.valueOf(bo.anl(paramMallFunction.pFP)) });
    AppMethodBeat.o(43191);
  }

  protected final void bFY()
  {
    AppMethodBeat.i(43192);
    if (getSupportActionBar() != null)
      getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(2131690260));
    if (com.tencent.mm.compatible.util.d.iW(21))
      getWindow().setStatusBarColor(getResources().getColor(2131690635));
    if (Build.VERSION.SDK_INT >= 16)
      getWindow().getDecorView().setSystemUiVisibility(1280);
    xE(this.mController.ylL.getResources().getColor(2131690597));
    AppMethodBeat.o(43192);
  }

  protected final void bGb()
  {
  }

  protected final void bNa()
  {
  }

  protected final void bNb()
  {
  }

  protected final boolean bNd()
  {
    AppMethodBeat.i(43199);
    csg localcsg = this.omP.tCG;
    for (int i = 0; i < this.omO.length; i++)
    {
      this.omO[i].view.setVisibility(8);
      this.omO[i].oll.setImageBitmap(null);
    }
    for (i = 0; (i < localcsg.wmz.size()) && (i < this.omO.length); i++)
    {
      csh localcsh = (csh)localcsg.wmz.get(i);
      this.omO[i].view.setVisibility(0);
      this.omO[i].oll.setUrl(aa.a(localcsh.xpE));
      this.omO[i].oll.setVisibility(0);
      this.omO[i].eku.setText(aa.a(localcsh.xpD));
      ab.i("MicroMsg.MallIndexOSUI", "item %d url %s", new Object[] { Integer.valueOf(i), aa.a(localcsh.xpE) });
      this.omO[i].ong.setVisibility(8);
      String str = aa.a(localcsh.xpG);
      if (!bo.isNullOrNil(str))
      {
        this.omO[i].ong.setText(str);
        this.omO[i].ong.setVisibility(0);
      }
      this.omO[i].view.setOnClickListener(new MallIndexOSUI.4(this, localcsh));
    }
    if ((this.omu != null) && (this.jNV != null) && (!this.omR))
    {
      this.omu.addFooterView(this.jNV);
      this.omR = true;
    }
    if (!bo.isNullOrNil(this.omP.tCM))
    {
      this.omQ.setText(this.omP.tCM);
      this.omQ.setVisibility(0);
    }
    AppMethodBeat.o(43199);
    return true;
  }

  protected final void bNh()
  {
    AppMethodBeat.i(43190);
    com.tencent.mm.wallet_core.ui.e.a(this.omz, "1", this.omP.tCL, this.omP.nYG);
    bNc();
    AppMethodBeat.o(43190);
  }

  protected final void bNi()
  {
  }

  protected final void bNk()
  {
    AppMethodBeat.i(43200);
    this.mController.removeAllOptionMenu();
    addIconOptionMenu(0, 2130839555, new MallIndexOSUI.5(this));
    AppMethodBeat.o(43200);
  }

  protected final void bNm()
  {
  }

  protected final void bbC()
  {
    AppMethodBeat.i(43193);
    String str1 = this.omP.tCJ;
    String str2 = this.omP.tCK;
    setMMTitle(str1);
    if (!bo.isNullOrNil(str2))
      setMMSubTitle(str2);
    AppMethodBeat.o(43193);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43202);
    super.c(paramInt1, paramInt2, paramString, paramm);
    if (paramm.getType() == 1577)
    {
      paramm = (com.tencent.mm.plugin.mall.a.h)paramm;
      if (paramm.okW == null)
      {
        paramInt1 = 0;
        if ((paramInt1 != 1) || (bo.isNullOrNil(paramm.bMU())))
          break label248;
        if (!this.eTM)
          break label87;
        AppMethodBeat.o(43202);
      }
    }
    while (true)
    {
      return true;
      paramInt1 = paramm.okW.xpH;
      break;
      label87: if (System.currentTimeMillis() - this.omS > 500L)
      {
        this.omS = System.currentTimeMillis();
        this.omX.dnU();
        this.omY.dnU();
        paramString = new Bundle();
        this.omV = paramm.bMU();
        paramm = new Intent();
        ab.i("MicroMsg.MallIndexOSUI", "startWebViewUI %s", new Object[] { this.omV });
        paramString.putString("KoriginUrl", this.omV);
        paramString.putBoolean("KIsHKAgreeUrl", true);
        paramm.putExtra("rawUrl", this.omV);
        paramm.putExtra("jsapiargs", paramString);
        paramm.putExtra("geta8key_username", com.tencent.mm.model.r.Yz());
        paramm.putExtra("pay_channel", 1);
        com.tencent.mm.bp.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramm, 4);
      }
      label248: this.omP = com.tencent.mm.plugin.wallet_core.model.r.cPO().Ht(this.okT);
      bNh();
      bNd();
      bbC();
      AppMethodBeat.o(43202);
    }
  }

  protected final void dp(View paramView)
  {
    AppMethodBeat.i(43195);
    this.omO[0] = new MallIndexOSUI.a(this);
    this.omO[0].view = paramView.findViewById(2131825774);
    this.omO[0].oll = ((CdnImageView)paramView.findViewById(2131825775));
    this.omO[0].eku = ((TextView)paramView.findViewById(2131825776));
    this.omO[0].ong = ((TextView)paramView.findViewById(2131825777));
    this.omO[0].oll.setVisibility(4);
    this.omO[1] = new MallIndexOSUI.a(this);
    this.omO[1].view = paramView.findViewById(2131825778);
    this.omO[1].oll = ((CdnImageView)paramView.findViewById(2131825779));
    this.omO[1].eku = ((TextView)paramView.findViewById(2131825780));
    this.omO[1].ong = ((TextView)paramView.findViewById(2131825781));
    this.omO[1].oll.setVisibility(4);
    this.omO[2] = new MallIndexOSUI.a(this);
    this.omO[2].view = paramView.findViewById(2131825787);
    this.omO[2].oll = ((CdnImageView)paramView.findViewById(2131825788));
    this.omO[2].eku = ((TextView)paramView.findViewById(2131825789));
    this.omO[2].ong = ((TextView)paramView.findViewById(2131825791));
    this.omO[2].oll.setVisibility(4);
    this.omO[3] = new MallIndexOSUI.a(this);
    this.omO[3].view = paramView.findViewById(2131825783);
    this.omO[3].oll = ((CdnImageView)paramView.findViewById(2131825784));
    this.omO[3].eku = ((TextView)paramView.findViewById(2131825785));
    this.omO[3].oll.setVisibility(4);
    this.omO[3].view.setVisibility(8);
    AppMethodBeat.o(43195);
  }

  public void finish()
  {
    AppMethodBeat.i(43201);
    this.eTM = true;
    super.finish();
    AppMethodBeat.o(43201);
  }

  protected final void initHeaderView()
  {
    AppMethodBeat.i(43194);
    this.omD = v.hu(this).inflate(2130970036, null);
    this.omu.addHeaderView(this.omD);
    AbsListView.LayoutParams localLayoutParams1 = (AbsListView.LayoutParams)this.omD.getLayoutParams();
    AbsListView.LayoutParams localLayoutParams2 = localLayoutParams1;
    if (localLayoutParams1 == null)
      localLayoutParams2 = new AbsListView.LayoutParams(-1, -2);
    localLayoutParams2.height = a.bMX();
    this.omD.setLayoutParams(localLayoutParams2);
    AppMethodBeat.o(43194);
  }

  public final void initView()
  {
    AppMethodBeat.i(43189);
    super.initView();
    this.omu.setOnScrollListener(new MallIndexOSUI.3(this));
    AppMethodBeat.o(43189);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43203);
    ab.i("MicroMsg.MallIndexOSUI", "onActivityResult requestCode %s resultCode %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(43203);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43188);
    c.iR(false);
    a.a(this, false, false);
    this.ylm = true;
    super.onCreate(paramBundle);
    this.jNV = View.inflate(this, 2130970029, null);
    this.jNV.setClickable(false);
    this.jNV.setEnabled(false);
    this.omQ = ((TextView)this.jNV.findViewById(2131825757));
    this.omP = com.tencent.mm.plugin.wallet_core.model.r.cPO().Ht(this.okT);
    nf(1577);
    ab.i("MicroMsg.MallIndexOSUI", "walletMallIndexOsUI ");
    com.tencent.mm.plugin.mall.a.h localh = new com.tencent.mm.plugin.mall.a.h();
    int i;
    if (this.omP != null)
    {
      paramBundle = this.omP;
      if ((paramBundle.tCG == null) || (paramBundle.tCG.wmz == null) || (paramBundle.tCG.wmz.size() == 0))
      {
        i = 1;
        if (i == 0)
          break label176;
      }
    }
    else
    {
      a(localh, true, false);
      AppMethodBeat.o(43188);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label176: a(localh, false, false);
      AppMethodBeat.o(43188);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43198);
    super.onDestroy();
    ng(1577);
    this.omX.dead();
    this.omY.dead();
    AppMethodBeat.o(43198);
  }

  public void onPause()
  {
    AppMethodBeat.i(43197);
    super.onPause();
    AppMethodBeat.o(43197);
  }

  public void onResume()
  {
    AppMethodBeat.i(43196);
    super.onResume();
    int i = g.Nu().getInt("OverseaPayWalletInfoRefreshInternal", 15) * 1000;
    long l = System.currentTimeMillis();
    ab.d("MicroMsg.MallIndexOSUI", "checkUpdate svrTime: %d lastUpdateTime : %d  curTime %d", new Object[] { Integer.valueOf(i), Long.valueOf(this.lastUpdateTime), Long.valueOf(l) });
    if (l - this.lastUpdateTime >= i)
    {
      this.lastUpdateTime = System.currentTimeMillis();
      a(new com.tencent.mm.plugin.mall.a.h(), false, false);
    }
    bbC();
    AppMethodBeat.o(43196);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexOSUI
 * JD-Core Version:    0.6.2
 */