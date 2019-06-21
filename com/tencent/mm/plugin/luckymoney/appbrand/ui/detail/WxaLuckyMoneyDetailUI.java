package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.i;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.protocal.protobuf.ash;
import com.tencent.mm.protocal.protobuf.bhk;
import com.tencent.mm.protocal.protobuf.bon;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

public class WxaLuckyMoneyDetailUI extends WxaLuckyMoneyBaseUI
  implements b
{
  private View abB;
  private TextView kEq;
  private TextView kGq;
  private TextView nSD;
  private final a nSJ;
  private Intent nSK;
  private ListView nSL;
  private ImageView nSM;
  private TextView nSN;
  private ImageView nSO;
  private View nSP;
  private View nSQ;
  private c nSR;
  private AbsListView.OnScrollListener nSS;
  private TextView nsq;
  private p tipDialog;

  public WxaLuckyMoneyDetailUI()
  {
    AppMethodBeat.i(42027);
    this.nSJ = new d();
    this.tipDialog = null;
    this.nSK = null;
    this.nSS = new WxaLuckyMoneyDetailUI.1(this);
    AppMethodBeat.o(42027);
  }

  private void a(i parami)
  {
    AppMethodBeat.i(42037);
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    x.b(this.nSM, parami.nSa, parami.username);
    x.a(localAppCompatActivity, this.nSN, parami.nickname);
    x.a(localAppCompatActivity, this.nsq, parami.nSd);
    if (parami.nSc == 1)
    {
      this.nSO.setVisibility(0);
      this.nSO.setImageResource(2130839301);
      if (parami.nSb != 2)
        break label204;
      this.nSD.setText(e.F(parami.cSh / 100.0D));
      this.nSR.nSz = false;
      this.nSP.setVisibility(0);
      label120: if (bo.isNullOrNil(parami.nSe))
        break label216;
      this.nSQ.setVisibility(0);
      this.kGq.setText(parami.nSe);
      this.kGq.setTextColor(getResources().getColor(2131690252));
      label165: if (bo.isNullOrNil(parami.nSf))
        break label228;
      this.kEq.setText(parami.nSf);
      AppMethodBeat.o(42037);
    }
    while (true)
    {
      return;
      this.nSO.setVisibility(8);
      break;
      label204: this.nSP.setVisibility(8);
      break label120;
      label216: this.nSQ.setVisibility(8);
      break label165;
      label228: this.kEq.setText(null);
      AppMethodBeat.o(42037);
    }
  }

  public final void Qf(String paramString)
  {
    AppMethodBeat.i(42028);
    h.bQ(this, paramString);
    AppMethodBeat.o(42028);
  }

  public final void a(bhk parambhk)
  {
    AppMethodBeat.i(42034);
    if (parambhk == null)
    {
      locali = null;
      a(locali);
      cj(parambhk.wKD);
      AppMethodBeat.o(42034);
      return;
    }
    i locali = new i();
    locali.username = parambhk.wKE;
    locali.nSa = parambhk.wKG;
    locali.nickname = parambhk.wKF;
    locali.cSh = parambhk.cSh;
    locali.nSe = parambhk.nSe;
    locali.nSf = parambhk.nSf;
    if (parambhk.wKI == 0);
    for (boolean bool = false; ; bool = true)
    {
      locali.nSg = bool;
      locali.nSc = parambhk.nSc;
      locali.nSb = parambhk.nSb;
      locali.nSd = parambhk.nSd;
      break;
    }
  }

  public final void a(bon parambon)
  {
    AppMethodBeat.i(42035);
    if (parambon == null)
    {
      locali = null;
      a(locali);
      cj(parambon.wKD);
      AppMethodBeat.o(42035);
      return;
    }
    i locali = new i();
    locali.username = parambon.wKE;
    locali.nSa = parambon.wKG;
    locali.nickname = parambon.wKF;
    locali.cSh = parambon.cSh;
    locali.nSe = parambon.nSe;
    locali.nSf = parambon.nSf;
    if (parambon.wKI == 0);
    for (boolean bool = false; ; bool = true)
    {
      locali.nSg = bool;
      locali.nSc = parambon.nSc;
      locali.nSb = parambon.nSb;
      locali.nSd = parambon.nSd;
      break;
    }
  }

  public final void ae(Intent paramIntent)
  {
    this.nSK = paramIntent;
  }

  public final MMActivity bKU()
  {
    return this;
  }

  public final void bKV()
  {
    AppMethodBeat.i(42029);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    AppMethodBeat.o(42029);
  }

  public final void cj(List<ash> paramList)
  {
    AppMethodBeat.i(42036);
    this.nSR.ck(paramList);
    AppMethodBeat.o(42036);
  }

  public final int getLayoutId()
  {
    return 2130969977;
  }

  public final void initView()
  {
    AppMethodBeat.i(42033);
    setMMTitle(2131301092);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(42025);
        if (WxaLuckyMoneyDetailUI.c(WxaLuckyMoneyDetailUI.this) != null)
          WxaLuckyMoneyDetailUI.this.setResult(0, WxaLuckyMoneyDetailUI.c(WxaLuckyMoneyDetailUI.this));
        while (true)
        {
          WxaLuckyMoneyDetailUI.this.finish();
          AppMethodBeat.o(42025);
          return true;
          WxaLuckyMoneyDetailUI.this.setResult(-1, null);
        }
      }
    });
    this.nSL = ((ListView)findViewById(2131825494));
    this.nSR = new c(this.mController.ylL);
    this.abB = LayoutInflater.from(this).inflate(2130969974, null);
    this.nSL.addHeaderView(this.abB);
    this.nSL.setAdapter(this.nSR);
    this.nSR.nSz = false;
    this.nSL.setOnScrollListener(this.nSS);
    this.nSM = ((ImageView)this.abB.findViewById(2131825442));
    this.nSN = ((TextView)this.abB.findViewById(2131825444));
    this.nSO = ((ImageView)this.abB.findViewById(2131825445));
    this.nsq = ((TextView)this.abB.findViewById(2131825446));
    this.nSP = this.abB.findViewById(2131825447);
    this.nSD = ((TextView)this.abB.findViewById(2131825448));
    this.nSQ = this.abB.findViewById(2131825450);
    this.kGq = ((TextView)this.abB.findViewById(2131825452));
    this.kEq = ((TextView)this.abB.findViewById(2131825464));
    this.tipDialog = h.b(this.mController.ylL, getString(2131300968), true, new WxaLuckyMoneyDetailUI.3(this));
    this.tipDialog.show();
    AppMethodBeat.o(42033);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42032);
    if (this.nSK != null)
      setResult(0, this.nSK);
    while (true)
    {
      finish();
      AppMethodBeat.o(42032);
      return;
      setResult(-1, null);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42030);
    super.onCreate(paramBundle);
    initView();
    this.nSJ.a(this, getIntent());
    AppMethodBeat.o(42030);
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    AppMethodBeat.i(42031);
    boolean bool = super.onCreatePanelMenu(paramInt, paramMenu);
    paramMenu = (TextView)findViewById(2131820958);
    if (paramMenu != null)
      paramMenu.setTextColor(getResources().getColor(2131690231));
    AppMethodBeat.o(42031);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42038);
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    AppMethodBeat.o(42038);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI
 * JD-Core Version:    0.6.2
 */