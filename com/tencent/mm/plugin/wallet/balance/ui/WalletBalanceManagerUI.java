package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ci.f;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.l;
import com.tencent.mm.protocal.protobuf.ba;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import org.json.JSONException;
import org.json.JSONObject;

public class WalletBalanceManagerUI extends WalletBaseUI
  implements l
{
  protected int gOW;
  protected TextView tgH;
  private com.tencent.mm.plugin.wallet_core.model.h thA;
  private com.tencent.mm.plugin.wallet.balance.a.a thB;
  protected TextView thr;
  protected Button ths;
  protected View tht;
  protected TextView thu;
  private ViewGroup thv;
  private TextView thw;
  private ImageView thx;
  protected Bankcard thy;
  private ba thz;

  private boolean cNb()
  {
    AppMethodBeat.i(45450);
    s.cNC();
    boolean bool;
    if ((s.cND().cQo().cNb()) && (this.thy.twS > 0.0D))
    {
      bool = true;
      AppMethodBeat.o(45450);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(45450);
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(45451);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (!(paramm instanceof com.tencent.mm.plugin.wallet.bind.a.b)) && ((paramm instanceof y)))
    {
      this.thA = ((y)paramm).tuw;
      if (this.thA == null)
        break label178;
      if (bo.isNullOrNil(this.thA.cEh))
        break label166;
      this.thw.setText(this.thA.cEh);
      if (!bo.isNullOrNil(this.thA.color))
      {
        this.thw.setTextColor(Color.parseColor(this.thA.color));
        this.thx.getDrawable().setColorFilter(Color.parseColor(this.thA.color), PorterDuff.Mode.SRC_ATOP);
      }
      this.thv.setOnClickListener(new WalletBalanceManagerUI.4(this));
      this.thv.setVisibility(0);
    }
    while (true)
    {
      cu();
      ceo();
      AppMethodBeat.o(45451);
      return false;
      label166: this.thv.setVisibility(8);
      continue;
      label178: this.thv.setVisibility(8);
    }
  }

  protected void cMZ()
  {
    AppMethodBeat.i(45443);
    s.cNC();
    if (s.cND().thy == null);
    for (boolean bool = true; ; bool = false)
    {
      a(new y(null, 10), bool, false);
      AppMethodBeat.o(45443);
      return;
    }
  }

  protected void cNa()
  {
    AppMethodBeat.i(45445);
    aA(WalletBalanceSaveUI.class);
    AppMethodBeat.o(45445);
  }

  protected final void ceo()
  {
    AppMethodBeat.i(45449);
    if (this.thz == null)
    {
      ab.w("MicroMsg.WalletBalanceManagerUI", "actionsheet is null");
      AppMethodBeat.o(45449);
    }
    while (true)
    {
      return;
      this.mController.removeAllOptionMenu();
      try
      {
        String str1 = (String)g.RP().Ry().get(ac.a.xUa, "");
        if (!bo.isNullOrNil(str1))
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str1);
          bool = localJSONObject.optBoolean("is_show_menu", false);
          if (!bool)
            break label136;
          ab.i("MicroMsg.WalletBalanceManagerUI", "go new menu logic");
          addIconOptionMenu(0, 2131230740, new WalletBalanceManagerUI.2(this));
          AppMethodBeat.o(45449);
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WalletBalanceManagerUI", localJSONException, "", new Object[0]);
          boolean bool = false;
        }
        label136: ab.i("MicroMsg.WalletBalanceManagerUI", "go old menu logic");
        if (this.thy != null)
        {
          s.cNC();
          s.cND();
          if (!bo.isNullOrNil(this.thy.twV))
          {
            String str2 = getString(2131304553);
            if (!bo.isNullOrNil(this.thy.twX))
            {
              ab.i("MicroMsg.WalletBalanceManagerUI", "carson: entry_word：%s", new Object[] { this.thy.twX });
              str2 = this.thy.twX;
            }
            a(str2, new WalletBalanceManagerUI.3(this), q.b.ymD);
          }
        }
        AppMethodBeat.o(45449);
      }
    }
  }

  protected final void cu()
  {
    AppMethodBeat.i(45448);
    s.cNC();
    this.thy = s.cND().thy;
    label71: Object localObject;
    if (this.thy != null)
    {
      if (this.thy.twS >= 0.0D)
      {
        this.thr.setText(com.tencent.mm.wallet_core.ui.e.G(this.thy.twS));
        if (!cNb())
          break label226;
        this.ths.setVisibility(0);
      }
    }
    else
    {
      localObject = findViewById(2131825786);
      g.RQ();
      if (((Integer)g.RP().Ry().get(ac.a.xSv, Integer.valueOf(-1))).intValue() != 1)
        break label238;
      ((View)localObject).setVisibility(0);
      label114: if (!new ai().cQd())
        break label247;
      g.RQ();
      localObject = (String)g.RP().Ry().get(ac.a.xNI, getString(2131302175));
      this.tht.setVisibility(0);
      this.thu.setTextColor(getResources().getColor(2131690618));
      this.thu.setText((CharSequence)localObject);
      this.tht.setOnClickListener(new WalletBalanceManagerUI.12(this));
      AppMethodBeat.o(45448);
    }
    while (true)
    {
      return;
      this.thr.setText(getString(2131304841));
      break;
      label226: this.ths.setVisibility(8);
      break label71;
      label238: ((View)localObject).setVisibility(8);
      break label114;
      label247: s.cNC();
      if (s.cND().cQN() == 1);
      for (boolean bool = true; ; bool = false)
      {
        s.cNC();
        localObject = s.cND().cQO();
        s.cNC();
        String str = s.cND().cQP();
        ab.i("MicroMsg.WalletBalanceManagerUI", "isShowLqtCell:%s lqtCellTitle:%s lqtCellWording:%s", new Object[] { Boolean.valueOf(bool), localObject, str });
        if ((bool) && ((!bo.isNullOrNil((String)localObject)) || (!bo.isNullOrNil(str))))
          break label495;
        s.cNC();
        if (!s.cND().cQw())
          break label400;
        this.tht.setVisibility(0);
        this.tht.setOnClickListener(new WalletBalanceManagerUI.13(this));
        localObject = this.thu;
        s.cNC();
        ((TextView)localObject).setText(s.cND().cQs());
        AppMethodBeat.o(45448);
        break;
      }
      label400: s.cNC();
      localObject = s.cND();
      if ((localObject != null) && (((ak)localObject).cQo().cPZ()) && (!TextUtils.isEmpty(((ak)localObject).cQs())) && (!TextUtils.isEmpty(((ak)localObject).cQt())))
      {
        this.tht.setVisibility(0);
        this.thu.setText(((ak)localObject).cQs());
        this.tht.setOnClickListener(new WalletBalanceManagerUI.14(this, (ak)localObject));
        AppMethodBeat.o(45448);
      }
      else
      {
        this.tht.setVisibility(8);
        label495: AppMethodBeat.o(45448);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130971049;
  }

  public final void initView()
  {
    AppMethodBeat.i(45446);
    setMMTitle("");
    this.thr = ((TextView)findViewById(2131828620));
    this.tgH = ((TextView)findViewById(2131828605));
    ((Button)findViewById(2131822846)).setOnClickListener(new WalletBalanceManagerUI.8(this));
    this.ths = ((Button)findViewById(2131828624));
    this.ths.setOnClickListener(new WalletBalanceManagerUI.9(this));
    Object localObject = (TextView)findViewById(2131828627);
    boolean bool;
    if (!aa.dor().equals("zh_CN"))
    {
      bool = true;
      if (bool)
        break label275;
      ((TextView)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(45437);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://kf.qq.com/touch/scene_product.html?scene_id=kf4");
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("geta8key_username", com.tencent.mm.model.r.Yz());
          d.b(WalletBalanceManagerUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          com.tencent.mm.wallet_core.ui.e.QS(17);
          AppMethodBeat.o(45437);
        }
      });
      ((TextView)localObject).setVisibility(0);
    }
    while (true)
    {
      ((TextView)findViewById(2131828628)).setText(com.tencent.mm.wallet_core.c.ae.dOc());
      this.thv = ((ViewGroup)findViewById(2131828621));
      this.thw = ((TextView)findViewById(2131828622));
      this.thx = ((ImageView)findViewById(2131828623));
      this.tht = findViewById(2131828625);
      this.thu = ((TextView)findViewById(2131828626));
      localObject = new uo();
      ((uo)localObject).cQJ.cQL = "2";
      ((uo)localObject).callback = new WalletBalanceManagerUI.11(this, (uo)localObject);
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(45446);
      return;
      bool = bo.gT(ah.getContext());
      break;
      label275: ((TextView)localObject).setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45442);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690691));
    dyb();
    ((com.tencent.mm.plugin.walletlock.a.b)g.K(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    setBackBtn(new WalletBalanceManagerUI.1(this), 2131230737);
    this.gOW = getIntent().getIntExtra("key_scene_balance_manager", 0);
    paramBundle = ECardInfo.cPp();
    if (paramBundle != null)
    {
      if (paramBundle.vAF != 1)
        break label182;
      paramBundle = new Bundle();
      bwP();
      com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramBundle, null, 0);
    }
    while (true)
    {
      nf(621);
      com.tencent.mm.plugin.wallet_core.model.r.cPP();
      com.tencent.mm.plugin.wallet_core.model.ae.a(this);
      initView();
      com.tencent.mm.wallet_core.c.z.hL(2, 0);
      com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(6), Integer.valueOf(0) });
      com.tencent.mm.wallet_core.ui.e.QS(10);
      AppMethodBeat.o(45442);
      return;
      label182: if (paramBundle.vAF == 3)
      {
        paramBundle = ECardInfo.cPq();
        if (paramBundle != null)
          com.tencent.mm.plugin.wallet_core.ui.m.a(this, paramBundle, 1);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45444);
    ng(621);
    com.tencent.mm.plugin.wallet_core.model.r.cPP();
    com.tencent.mm.plugin.wallet_core.model.ae.b(this);
    this.thB = null;
    super.onDestroy();
    AppMethodBeat.o(45444);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(45453);
    ab.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from bind ui flag:" + paramIntent.getIntExtra("from_bind_ui", 0));
    if (paramIntent.getIntExtra("from_bind_ui", 0) == com.tencent.mm.plugin.wallet.balance.a.teT)
    {
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, null, null);
      com.tencent.mm.wallet_core.ui.e.QS(15);
    }
    AppMethodBeat.o(45453);
  }

  public void onResume()
  {
    AppMethodBeat.i(45447);
    cu();
    cMZ();
    ab.i("MicroMsg.WalletBalanceManagerUI", "do query balance menu");
    if (this.thB != null)
      this.thB.cancel();
    this.thB = new com.tencent.mm.plugin.wallet.balance.a.a();
    this.thB.acy().b(new WalletBalanceManagerUI.7(this));
    super.onResume();
    com.tencent.mm.plugin.walletlock.a.b localb = (com.tencent.mm.plugin.walletlock.a.b)g.K(com.tencent.mm.plugin.walletlock.a.b.class);
    localb.a(this, localb.cTi(), null);
    AppMethodBeat.o(45447);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void yq(int paramInt)
  {
    AppMethodBeat.i(45452);
    s.cNC();
    this.thy = s.cND().thy;
    if (this.thy != null)
      if (this.thy.twS >= 0.0D)
      {
        this.thr.setText(com.tencent.mm.wallet_core.ui.e.G(this.thy.twS));
        AppMethodBeat.o(45452);
      }
    while (true)
    {
      return;
      this.thr.setText(getString(2131304841));
      AppMethodBeat.o(45452);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI
 * JD-Core Version:    0.6.2
 */