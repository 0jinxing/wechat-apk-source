package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.a.i;
import com.tencent.mm.plugin.honey_pay.a.l;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.atj;
import com.tencent.mm.protocal.protobuf.bdb;
import com.tencent.mm.protocal.protobuf.bdh;
import com.tencent.mm.protocal.protobuf.bir;
import com.tencent.mm.protocal.protobuf.bkc;
import com.tencent.mm.protocal.protobuf.bnl;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HoneyPayCardManagerUI extends HoneyPayBaseUI
{
  private int gOW;
  private ImageView kEn;
  private ViewGroup kox;
  private ViewGroup laj;
  private TextView nrA;
  private MMSwitchBtn nrB;
  private LinearLayout nrC;
  private TextView nrD;
  private TextView nrE;
  private TextView nrF;
  private View nrG;
  private View nrH;
  private TextView nrI;
  private HoneyPayCardManagerUI.a nrJ;
  private List<bir> nrK;
  private Bankcard nrL;
  private bkc nrM;
  private bkc nrN;
  private long nrO;
  private long nrP;
  private boolean nrQ;
  private String nrR;
  private String nra;
  private chl nrb;
  private TextView nre;
  private TextView nrg;
  private TextView nrh;
  private TextView nri;
  private TextView nrj;
  private WalletTextView nru;
  private ListView nrx;
  private ViewGroup nry;
  private ViewGroup nrz;

  public HoneyPayCardManagerUI()
  {
    AppMethodBeat.i(41811);
    this.nrK = new ArrayList();
    AppMethodBeat.o(41811);
  }

  private static Bankcard OD(String paramString)
  {
    AppMethodBeat.i(41822);
    Bankcard localBankcard1 = r.cPI().h(paramString, false, false);
    Bankcard localBankcard2;
    if (localBankcard1 == null)
    {
      localBankcard2 = r.cPI().tCZ;
      if ((localBankcard2 != null) && (localBankcard2.field_bindSerial.equals(paramString)))
        AppMethodBeat.o(41822);
    }
    for (paramString = localBankcard2; ; paramString = localBankcard1)
    {
      return paramString;
      AppMethodBeat.o(41822);
    }
  }

  private void a(atj paramatj)
  {
    boolean bool = false;
    AppMethodBeat.i(41823);
    Object localObject = e.eL(paramatj.vYh, 6) + getString(2131300569);
    this.nrD.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject, this.nrD.getTextSize()));
    a.b.a(this.kEn, paramatj.vYh, 0.06F, false);
    this.nru.setText(c.iR(paramatj.wch));
    localObject = this.nrB;
    if (paramatj.tob != 0)
      bool = true;
    ((MMSwitchBtn)localObject).setCheck(bool);
    bGd();
    AppMethodBeat.o(41823);
  }

  private void a(bdh parambdh)
  {
    AppMethodBeat.i(41821);
    this.nry = ((ViewGroup)View.inflate(this, 2130969825, null));
    ((TextView)this.nry.findViewById(2131824874)).setText(parambdh.title);
    this.nry.setOnClickListener(new HoneyPayCardManagerUI.8(this, parambdh));
    AppMethodBeat.o(41821);
  }

  private void a(bnl parambnl)
  {
    AppMethodBeat.i(41820);
    this.nrb = parambnl.woi;
    this.nrK.clear();
    this.nrJ.notifyDataSetChanged();
    int i;
    if (parambnl.wci != null)
    {
      setMMTitle(parambnl.wci.kdf);
      this.nrO = parambnl.vYj;
      this.nrP = parambnl.vYi;
      if (parambnl.wci.wxt != null)
      {
        this.nrL = OD(parambnl.wci.wxt.wNk);
        this.nrM = parambnl.wci.wxt;
      }
      a(parambnl.wci);
      i = parambnl.wci.state;
      ab.i(this.TAG, "detail state: %s", new Object[] { Integer.valueOf(i) });
      ab.d(this.TAG, "state title: %s", new Object[] { parambnl.wci.wxw });
      if (bo.isNullOrNil(parambnl.wci.wxw))
        break label416;
      this.nre.setText(parambnl.wci.wxw);
      this.nre.setVisibility(0);
      if (bo.isNullOrNil(parambnl.wci.wxs))
        break label428;
      this.nrF.setText(parambnl.wci.wxs);
      this.nrF.setVisibility(0);
      label233: if (i != 1)
        break label440;
      this.nre.setTextColor(Color.parseColor("#FA9D3B"));
      this.nru.setTextColor(Color.parseColor("#B2B2B2"));
      findViewById(2131824881).setVisibility(8);
      this.nrx.removeFooterView(this.kox);
      this.kox.setVisibility(8);
      this.nrG.setVisibility(8);
      if (this.nrQ)
      {
        this.nrz = ((ViewGroup)LayoutInflater.from(this).inflate(2130969823, null));
        ((Button)this.nrz.findViewById(2131824873)).setOnClickListener(new HoneyPayCardManagerUI.7(this));
        this.nrx.addFooterView(this.nrz);
        showHomeBtn(false);
        enableBackMenu(false);
        setMMTitle("");
      }
    }
    while (true)
    {
      this.nrH.setVisibility(8);
      c.b(this, parambnl.wxm, this.nra, 2, this.nrb);
      AppMethodBeat.o(41820);
      return;
      label416: this.nre.setVisibility(8);
      break;
      label428: this.nrF.setVisibility(8);
      break label233;
      label440: if (i == 2)
      {
        if ((parambnl.vAD != null) && (!parambnl.vAD.isEmpty()))
        {
          this.nrK = parambnl.vAD;
          this.nrJ.notifyDataSetChanged();
          this.nrx.removeFooterView(this.kox);
          this.kox.setVisibility(8);
          if (parambnl.wQl != null)
          {
            a(parambnl.wQl);
            this.nrx.addFooterView(this.nry);
          }
          findViewById(2131824896).setBackgroundResource(2131690166);
        }
        this.nrA.setVisibility(0);
        this.nru.setVisibility(0);
        this.nrG.setVisibility(0);
        findViewById(2131824881).setVisibility(8);
      }
      else if (i == 3)
      {
        findViewById(2131824881).setVisibility(0);
        this.nrg.setText(2131300548);
        this.nrh.setText(2131300591);
        this.nri.setText(c.iS(parambnl.wci.vNm));
        this.nrj.setText(c.iS(parambnl.wci.kbK));
        this.nrx.removeFooterView(this.kox);
        this.kox.setVisibility(8);
        this.nrG.setVisibility(8);
        findViewById(2131824888).setVisibility(8);
      }
      else if (i == 4)
      {
        this.nrA.setVisibility(8);
        findViewById(2131824881).setVisibility(0);
        this.nrg.setText(2131300590);
        this.nri.setText(c.iS(parambnl.wci.wxu));
        findViewById(2131824885).setVisibility(8);
        this.nrx.removeFooterView(this.kox);
        this.kox.setVisibility(8);
        this.nrG.setVisibility(8);
        findViewById(2131824888).setVisibility(8);
        findViewById(2131824896).setBackgroundResource(2131690691);
      }
      else
      {
        ab.d(this.TAG, "unknown state: %s", new Object[] { Integer.valueOf(i) });
      }
    }
  }

  private void bGb()
  {
    AppMethodBeat.i(41818);
    this.kox = ((ViewGroup)LayoutInflater.from(this).inflate(2130969824, null));
    AppMethodBeat.o(41818);
  }

  private void bGc()
  {
    AppMethodBeat.i(41819);
    ab.i(this.TAG, "do qry detail");
    l locall = new l(this.nra);
    locall.o(this);
    a(locall, true, false);
    AppMethodBeat.o(41819);
  }

  private void bGd()
  {
    AppMethodBeat.i(41824);
    if (this.nrM != null)
    {
      this.nrE.setText(this.nrM.wNi);
      if (!bo.isNullOrNil(this.nrM.wNj))
      {
        this.nrE.setTextColor(Color.parseColor(this.nrM.wNj));
        if (bo.isNullOrNil(this.nrM.wNn))
          break label119;
        this.nrI.setText(this.nrM.wNn);
        this.nrI.setVisibility(0);
        AppMethodBeat.o(41824);
      }
    }
    while (true)
    {
      return;
      this.nrE.setTextColor(getResources().getColor(2131690316));
      break;
      label119: this.nrI.setVisibility(8);
      AppMethodBeat.o(41824);
      continue;
      ab.i(this.TAG, "reset payway view for null");
      this.nrE.setText("");
      this.nrE.setTextColor(getResources().getColor(2131690316));
      this.nrI.setVisibility(8);
      AppMethodBeat.o(41824);
    }
  }

  private void initHeaderView()
  {
    AppMethodBeat.i(41817);
    this.laj = ((ViewGroup)LayoutInflater.from(this).inflate(2130969826, null));
    this.nrB = ((MMSwitchBtn)this.laj.findViewById(2131824889));
    this.nrC = ((LinearLayout)this.laj.findViewById(2131824890));
    this.nrE = ((TextView)this.laj.findViewById(2131824891));
    this.kEn = ((ImageView)this.laj.findViewById(2131824875));
    this.nru = ((WalletTextView)this.laj.findViewById(2131824877));
    this.nrD = ((TextView)this.laj.findViewById(2131824876));
    this.nrA = ((TextView)this.laj.findViewById(2131824880));
    this.nre = ((TextView)this.laj.findViewById(2131824878));
    this.nrF = ((TextView)this.laj.findViewById(2131824879));
    this.nrg = ((TextView)this.laj.findViewById(2131824883));
    this.nri = ((TextView)this.laj.findViewById(2131824884));
    this.nrh = ((TextView)this.laj.findViewById(2131824886));
    this.nrj = ((TextView)this.laj.findViewById(2131824887));
    this.nrG = this.laj.findViewById(2131824893);
    this.nrI = ((TextView)this.laj.findViewById(2131824892));
    this.nru.setPrefix(ae.dOd());
    this.nrB.setSwitchListener(new MMSwitchBtn.a()
    {
      public final void di(boolean paramAnonymousBoolean)
      {
        int i = 1;
        AppMethodBeat.i(41795);
        ab.d(HoneyPayCardManagerUI.this.TAG, "check %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        HoneyPayCardManagerUI localHoneyPayCardManagerUI = HoneyPayCardManagerUI.this;
        if (paramAnonymousBoolean);
        while (true)
        {
          HoneyPayCardManagerUI.a(localHoneyPayCardManagerUI, i);
          AppMethodBeat.o(41795);
          return;
          i = 0;
        }
      }
    });
    this.nrC.setOnClickListener(new HoneyPayCardManagerUI.4(this));
    String str = getString(2131300569);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str);
    localSpannableStringBuilder.append(getString(2131300571));
    localSpannableStringBuilder.setSpan(new o(new HoneyPayCardManagerUI.5(this)), str.length(), localSpannableStringBuilder.length(), 18);
    this.nrA.setClickable(true);
    this.nrA.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
    this.nrA.setText(localSpannableStringBuilder);
    AppMethodBeat.o(41817);
  }

  public final boolean c(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41815);
    if ((paramm instanceof l))
    {
      paramString = (l)paramm;
      paramString.a(new HoneyPayCardManagerUI.11(this, paramString)).b(new HoneyPayCardManagerUI.10(this)).c(new HoneyPayCardManagerUI.9(this));
    }
    while (true)
    {
      AppMethodBeat.o(41815);
      return true;
      if ((paramm instanceof i))
      {
        paramString = (i)paramm;
        paramString.a(new HoneyPayCardManagerUI.14(this)).b(new HoneyPayCardManagerUI.13(this, paramString)).c(new HoneyPayCardManagerUI.12(this, paramString));
      }
      else if ((paramm instanceof com.tencent.mm.plugin.honey_pay.a.j))
      {
        paramString = (com.tencent.mm.plugin.honey_pay.a.j)paramm;
        paramString.a(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
          {
            AppMethodBeat.i(41794);
            HoneyPayCardManagerUI.a(HoneyPayCardManagerUI.this, paramString.nqH.wHj);
            if (HoneyPayCardManagerUI.c(HoneyPayCardManagerUI.this) != null)
              HoneyPayCardManagerUI.a(HoneyPayCardManagerUI.this, HoneyPayCardManagerUI.OE(HoneyPayCardManagerUI.c(HoneyPayCardManagerUI.this).wNk));
            HoneyPayCardManagerUI.d(HoneyPayCardManagerUI.this);
            AppMethodBeat.o(41794);
          }
        }).b(new HoneyPayCardManagerUI.16(this)).c(new HoneyPayCardManagerUI.15(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969828;
  }

  public final void initView()
  {
    AppMethodBeat.i(41813);
    initHeaderView();
    bGb();
    this.nrH = findViewById(2131824898);
    this.nrx = ((ListView)findViewById(2131824897));
    this.nrx.addHeaderView(this.laj);
    this.nrx.addFooterView(this.kox, null, false);
    this.nrJ = new HoneyPayCardManagerUI.a(this, (byte)0);
    this.nrx.setAdapter(this.nrJ);
    this.nrx.setOnItemClickListener(new HoneyPayCardManagerUI.1(this));
    AppMethodBeat.o(41813);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41816);
    if (paramInt1 == 1)
      if ((paramInt2 == -1) && (paramIntent.getBooleanExtra("key_modify_create_line_succ", false)))
      {
        long l = paramIntent.getLongExtra("key_credit_line", 0L);
        this.nru.setText(c.iR(l));
        setResult(-1);
      }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(41816);
      return;
      if (paramInt1 == 2)
      {
        if (paramInt2 == -1)
        {
          this.mController.removeAllOptionMenu();
          setResult(-1);
          finish();
        }
      }
      else if ((paramInt1 == 3) && (paramInt2 == -1))
        bGc();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41812);
    super.onCreate(paramBundle);
    nf(2876);
    nf(2742);
    nf(2941);
    this.nra = getIntent().getStringExtra("key_card_no");
    this.gOW = getIntent().getIntExtra("key_scene", 0);
    this.nrQ = getIntent().getBooleanExtra("key_is_create", false);
    this.nrR = getIntent().getStringExtra("key_card_type");
    initView();
    ab.d(this.TAG, "cardtype: %s", new Object[] { this.nrR });
    setMMTitle(2131300563);
    if (this.gOW == 1)
      paramBundle = new bnl();
    while (true)
    {
      try
      {
        paramBundle.parseFrom(getIntent().getByteArrayExtra("key_qry_response"));
        a(paramBundle);
        AppMethodBeat.o(41812);
        return;
      }
      catch (IOException paramBundle)
      {
        ab.printErrStackTrace(this.TAG, paramBundle, "", new Object[0]);
        bGc();
        AppMethodBeat.o(41812);
        continue;
      }
      bGc();
      AppMethodBeat.o(41812);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41814);
    super.onDestroy();
    ng(2876);
    ng(2742);
    ng(2941);
    AppMethodBeat.o(41814);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI
 * JD-Core Version:    0.6.2
 */