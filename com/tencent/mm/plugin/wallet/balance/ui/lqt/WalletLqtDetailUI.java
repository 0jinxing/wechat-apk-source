package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.balance.a.a.r;
import com.tencent.mm.plugin.wallet.balance.a.a.r.a;
import com.tencent.mm.plugin.wallet.balance.a.a.r.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.bdy;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.protocal.protobuf.xg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class WalletLqtDetailUI extends WalletLqtBasePresenterUI
{
  private static final int koS;
  private Dialog gnn;
  private ak handler;
  private TextView tiA;
  private LinearLayout tiB;
  private TextView tiC;
  private TextView tiD;
  private TextView tiE;
  private TextView tiF;
  private boolean tiG;
  private com.tencent.mm.plugin.wallet.balance.a.a.q tic;
  private r tie;
  private bnr tif;
  private ViewGroup tig;
  private TextView tih;
  private WalletTextView tii;
  private ViewGroup tij;
  private TextView tik;
  private TextView til;
  private ViewGroup tim;
  private TextView tin;
  private WalletTextView tio;
  private Button tip;
  private Button tiq;
  private LinearLayout tir;
  private TextView tis;
  private TextView tit;
  private View tiu;
  private TextView tiv;
  private View tiw;
  private View tix;
  private CdnImageView tiy;
  private TextView tiz;

  static
  {
    AppMethodBeat.i(45557);
    koS = a.fromDPToPix(ah.getContext(), 16);
    AppMethodBeat.o(45557);
  }

  public WalletLqtDetailUI()
  {
    AppMethodBeat.i(45545);
    this.tic = ((com.tencent.mm.plugin.wallet.balance.a.a.q)Z(com.tencent.mm.plugin.wallet.balance.a.a.q.class));
    this.tie = ((r)V(r.class));
    this.tiG = true;
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(45545);
  }

  private void ack(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(45549);
    ab.i("MicroMsg.WalletLqtDetailUI", "go to save ui");
    Intent localIntent = new Intent(this, WalletLqtSaveFetchUI.class);
    String str;
    if (this.tif != null)
    {
      str = this.tif.wPv;
      localIntent.putExtra("lqt_save_fund_code", str);
      localIntent.putExtra("lqt_save_fetch_mode", 1);
      if (this.tif.cRh != 1)
        break label182;
      bool2 = true;
      label72: localIntent.putExtra("lqt_is_show_protocol", bool2);
      if (this.tif.wQw != 1)
        break label188;
    }
    label182: label188: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localIntent.putExtra("lqt_is_agree_protocol", bool2);
      localIntent.putStringArrayListExtra("lqt_protocol_list", cNh());
      localIntent.putExtra("lqt_profile_wording", this.tif.wQp);
      localIntent.putExtra("lqt_account_type", this.tif.wao);
      localIntent.putExtra("lqt_fund_spid", this.tif.wPx);
      localIntent.putExtra("operate_id", paramString);
      startActivity(localIntent);
      AppMethodBeat.o(45549);
      return;
      str = null;
      break;
      bool2 = false;
      break label72;
    }
  }

  private void acl(String paramString)
  {
    AppMethodBeat.i(45550);
    ab.i("MicroMsg.WalletLqtDetailUI", "go to fetch ui");
    Intent localIntent = new Intent(this, WalletLqtSaveFetchUI.class);
    localIntent.putExtra("lqt_save_fetch_mode", 2);
    localIntent.putExtra("lqt_balance", this.tif.wJb);
    localIntent.putExtra("lqt_max_redeem_amount", this.tif.wQD);
    localIntent.putExtra("lqt_redeem_invalid_amount_hint", this.tif.wQE);
    localIntent.putExtra("lqt_account_type", this.tif.wao);
    localIntent.putExtra("operate_id", paramString);
    startActivity(localIntent);
    AppMethodBeat.o(45550);
  }

  private ArrayList<String> cNh()
  {
    AppMethodBeat.i(45547);
    ArrayList localArrayList = new ArrayList();
    if ((this.tif.wQx != null) && (this.tif.wQx.size() > 0))
    {
      Iterator localIterator = this.tif.wQx.iterator();
      while (localIterator.hasNext())
      {
        xg localxg = (xg)localIterator.next();
        if ((!bo.isNullOrNil(localxg.title)) && (!bo.isNullOrNil(localxg.wdd)))
          localArrayList.add(String.format("%s||%s", new Object[] { localxg.title, localxg.wdd }));
      }
    }
    AppMethodBeat.o(45547);
    return localArrayList;
  }

  public final int getLayoutId()
  {
    return 2130971117;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45551);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 123) && (paramInt2 == -1))
    {
      this.tiG = false;
      paramIntent = paramIntent.getStringExtra("lqt_enc_pwd");
      if (this.gnn != null)
        break label118;
      this.gnn = g.b(this, false, null);
    }
    while (true)
    {
      r.a locala = this.tie.tfD;
      f.D(paramIntent, Integer.valueOf(this.tif.wao)).c(locala).f(new WalletLqtDetailUI.11(this)).a(new WalletLqtDetailUI.10(this));
      AppMethodBeat.o(45551);
      return;
      label118: this.gnn.show();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45546);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690634));
    Nc(getResources().getColor(2131690691));
    dyb();
    setMMTitle("");
    ab.i("MicroMsg.WalletLqtDetailUI", "inputAccountType: %s", new Object[] { Integer.valueOf(getIntent().getIntExtra("key_account_type", 1)) });
    this.tig = ((ViewGroup)findViewById(2131828823));
    this.tih = ((TextView)findViewById(2131828824));
    this.tii = ((WalletTextView)findViewById(2131828831));
    this.tij = ((ViewGroup)findViewById(2131828832));
    this.tik = ((TextView)findViewById(2131828833));
    this.til = ((TextView)findViewById(2131828835));
    this.tim = ((ViewGroup)findViewById(2131828837));
    this.tin = ((TextView)findViewById(2131828838));
    this.tio = ((WalletTextView)findViewById(2131828840));
    this.tip = ((Button)findViewById(2131828842));
    this.tiq = ((Button)findViewById(2131828843));
    this.tir = ((LinearLayout)findViewById(2131828845));
    this.tis = ((TextView)findViewById(2131828853));
    this.tiu = findViewById(2131825354);
    this.tiv = ((TextView)findViewById(2131825355));
    this.tix = findViewById(2131828847);
    this.tiy = ((CdnImageView)findViewById(2131828848));
    this.tiz = ((TextView)findViewById(2131828849));
    this.tiA = ((TextView)findViewById(2131828850));
    this.tiw = findViewById(2131828846);
    this.tit = ((TextView)findViewById(2131828854));
    this.tiB = ((LinearLayout)findViewById(2131828827));
    this.tiC = ((TextView)findViewById(2131828828));
    this.tiD = ((TextView)findViewById(2131828836));
    this.tiE = ((TextView)findViewById(2131828841));
    this.tiF = ((TextView)findViewById(2131828851));
    this.tis.setVisibility(4);
    AppMethodBeat.o(45546);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45552);
    super.onDestroy();
    this.tic = null;
    this.tie = null;
    AppMethodBeat.o(45552);
  }

  public void onResume()
  {
    AppMethodBeat.i(45548);
    super.onResume();
    if (this.tiG)
    {
      this.tig.setVisibility(8);
      this.gnn = g.b(this, false, null);
      this.tie.tfC.aor().f(new WalletLqtDetailUI.12(this)).a(new WalletLqtDetailUI.1(this));
    }
    this.tiG = true;
    AppMethodBeat.o(45548);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI
 * JD-Core Version:    0.6.2
 */