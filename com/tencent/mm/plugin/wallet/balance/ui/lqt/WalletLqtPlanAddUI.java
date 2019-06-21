package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet.balance.a.a.h;
import com.tencent.mm.plugin.wallet.balance.a.a.u;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.protocal.protobuf.aum;
import com.tencent.mm.protocal.protobuf.bkm;
import com.tencent.mm.protocal.protobuf.bls;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.g;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WalletLqtPlanAddUI extends WalletLqtBasePresenterUI
{
  private static final int tiO;
  private static final int tiP;
  private int mMode;
  private ScrollView tiQ;
  private WalletFormView tiR;
  private TextView tiS;
  private CdnImageView tiT;
  private TextView tiU;
  private LinearLayout tiV;
  private TextView tiW;
  private LinearLayout tiX;
  private Button tiY;
  private CheckBox tiZ;
  private TextView tja;
  private LinearLayout tjb;
  private u tjc;
  private List<Bankcard> tjd;
  private aum tje;
  private bls tjf;
  private boolean tjg;
  private bkm tjh;
  private ImageView tji;
  private LinearLayout tjj;
  private long tjk;
  private int tjl;
  private String tjm;
  private String tjn;
  private String[] tjo;

  static
  {
    AppMethodBeat.i(45603);
    tiO = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 48);
    tiP = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 8);
    AppMethodBeat.o(45603);
  }

  public WalletLqtPlanAddUI()
  {
    AppMethodBeat.i(45580);
    this.tjc = ((u)V(u.class));
    this.tjd = new ArrayList();
    this.tjh = new bkm();
    AppMethodBeat.o(45580);
  }

  private Bankcard acm(String paramString)
  {
    AppMethodBeat.i(45591);
    Iterator localIterator = this.tjd.iterator();
    while (localIterator.hasNext())
    {
      Bankcard localBankcard = (Bankcard)localIterator.next();
      if (localBankcard.field_bindSerial.equals(paramString))
      {
        AppMethodBeat.o(45591);
        paramString = localBankcard;
      }
    }
    while (true)
    {
      return paramString;
      paramString = r.cPI().h(paramString, false, false);
      AppMethodBeat.o(45591);
    }
  }

  private void cNi()
  {
    AppMethodBeat.i(45587);
    BigDecimal localBigDecimal;
    if (this.mMode == 2)
    {
      localBigDecimal = com.tencent.mm.wallet_core.ui.e.a(this.tjh.cSh, "100", 2, RoundingMode.HALF_UP);
      if (localBigDecimal.intValue() == localBigDecimal.doubleValue())
      {
        this.tiR.setText(localBigDecimal.intValue());
        AppMethodBeat.o(45587);
      }
    }
    while (true)
    {
      return;
      this.tiR.setText(localBigDecimal.toString());
      AppMethodBeat.o(45587);
    }
  }

  private void cNj()
  {
    AppMethodBeat.i(45588);
    Bankcard localBankcard = acm(this.tjh.vEQ);
    if (localBankcard != null)
    {
      this.tiU.setText(String.format("%s(%s)", new Object[] { this.tjh.nuL, this.tjh.pck }));
      this.tiT.setTag(this.tjh.vEQ);
      if (localBankcard.cPc())
      {
        this.tiT.setImageResource(2130840657);
        AppMethodBeat.o(45588);
      }
    }
    while (true)
    {
      return;
      Object localObject = "";
      com.tencent.mm.plugin.wallet_core.model.e locale = b.i(this, localBankcard.field_bankcardType, localBankcard.cPb());
      if (locale != null)
        localObject = locale.oRi;
      localObject = x.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject));
      if (localObject != null)
        this.tiT.setImageBitmap((Bitmap)localObject);
      x.a(new WalletLqtPlanAddUI.8(this, localBankcard));
      AppMethodBeat.o(45588);
    }
  }

  private void cNk()
  {
    AppMethodBeat.i(45589);
    int i = this.tjh.ehf - 1;
    ab.i("MicroMsg.WalletLqtPlanAddUI", "select day index: %s", new Object[] { Integer.valueOf(i) });
    if ((i >= 0) && (i < this.tjo.length))
      this.tiW.setText(this.tjo[i]);
    AppMethodBeat.o(45589);
  }

  private void cNl()
  {
    AppMethodBeat.i(45590);
    if ((this.tjf != null) && (!bo.isNullOrNil(this.tjf.title)))
    {
      this.tja.setClickable(true);
      this.tja.setOnTouchListener(new m(this));
      com.tencent.mm.plugin.wallet_core.ui.o localo = new com.tencent.mm.plugin.wallet_core.ui.o(new o.a()
      {
        public final void df(View paramAnonymousView)
        {
          AppMethodBeat.i(45567);
          com.tencent.mm.wallet_core.ui.e.n(WalletLqtPlanAddUI.this.mController.ylL, WalletLqtPlanAddUI.o(WalletLqtPlanAddUI.this).url, true);
          AppMethodBeat.o(45567);
        }
      });
      String str = getString(2131304991);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str);
      localSpannableStringBuilder.append(this.tjf.title);
      localSpannableStringBuilder.setSpan(localo, str.length(), localSpannableStringBuilder.length(), 18);
      this.tja.setText(localSpannableStringBuilder);
      this.tjb.setVisibility(0);
      AppMethodBeat.o(45590);
    }
    while (true)
    {
      return;
      this.tjb.setVisibility(8);
      AppMethodBeat.o(45590);
    }
  }

  private void cu()
  {
    AppMethodBeat.i(45586);
    cNi();
    cNj();
    cNk();
    cNl();
    AppMethodBeat.o(45586);
  }

  private void mN(boolean paramBoolean)
  {
    Dialog localDialog = null;
    AppMethodBeat.i(45585);
    ab.i("MicroMsg.WalletLqtPlanAddUI", "do pre add plan: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    int i;
    if ((this.mMode == 2) && (this.tjh != null))
    {
      i = this.tjh.vES;
      localDialog = g.b(this.mController.ylL, false, null);
    }
    while (true)
    {
      com.tencent.mm.plugin.wallet.balance.a.a.o localo = new com.tencent.mm.plugin.wallet.balance.a.a.o();
      localo.b(new h(this.mMode, i));
      localo.a(new WalletLqtPlanAddUI.18(this, paramBoolean, localDialog));
      AppMethodBeat.o(45585);
      return;
      i = 0;
    }
  }

  public final int getLayoutId()
  {
    return 2130969962;
  }

  public final void initView()
  {
    AppMethodBeat.i(45582);
    this.tiQ = ((ScrollView)findViewById(2131825356));
    this.tiR = ((WalletFormView)findViewById(2131825357));
    this.tiS = ((TextView)findViewById(2131825359));
    this.tiT = ((CdnImageView)findViewById(2131825362));
    this.tiU = ((TextView)findViewById(2131825363));
    this.tiV = ((LinearLayout)findViewById(2131825361));
    this.tiW = ((TextView)findViewById(2131825365));
    this.tiX = ((LinearLayout)findViewById(2131825364));
    this.tiY = ((Button)findViewById(2131825366));
    this.tiZ = ((CheckBox)findViewById(2131825368));
    this.tja = ((TextView)findViewById(2131825369));
    this.tjb = ((LinearLayout)findViewById(2131825367));
    this.tji = ((ImageView)findViewById(2131825360));
    this.tjj = ((LinearLayout)findViewById(2131825358));
    this.tiR.dOP();
    this.tiR.setTitleText(ae.dOd());
    a(this.tiR, 2, false, false, false);
    this.tiY.setOnClickListener(new WalletLqtPlanAddUI.1(this));
    this.tiZ.setOnCheckedChangeListener(new WalletLqtPlanAddUI.11(this));
    this.tiV.setOnClickListener(new WalletLqtPlanAddUI.12(this));
    this.tiX.setOnClickListener(new WalletLqtPlanAddUI.13(this));
    this.tiR.a(new WalletLqtPlanAddUI.14(this));
    int i = com.tencent.mm.bz.a.fromDPToPix(this, 50);
    bo.n(this.tji, i, i, i, i);
    this.tji.setOnClickListener(new WalletLqtPlanAddUI.15(this));
    this.obM = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void ic(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(45576);
        if (paramAnonymousBoolean)
        {
          LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)WalletLqtPlanAddUI.b(WalletLqtPlanAddUI.this).getLayoutParams();
          if (localLayoutParams != null)
          {
            localLayoutParams.bottomMargin = WalletLqtPlanAddUI.cML();
            WalletLqtPlanAddUI.b(WalletLqtPlanAddUI.this).setLayoutParams(localLayoutParams);
          }
          WalletLqtPlanAddUI.h(WalletLqtPlanAddUI.this).post(new WalletLqtPlanAddUI.16.1(this));
          AppMethodBeat.o(45576);
        }
        while (true)
        {
          return;
          WalletLqtPlanAddUI.h(WalletLqtPlanAddUI.this).post(new WalletLqtPlanAddUI.16.2(this));
          AppMethodBeat.o(45576);
        }
      }
    };
    AppMethodBeat.o(45582);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45584);
    ab.i("MicroMsg.WalletLqtPlanAddUI", "activity result: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    String str1;
    int i;
    Object localObject1;
    Object localObject2;
    String str2;
    int j;
    int k;
    Object localObject3;
    Object localObject4;
    if (paramInt1 == 0)
      if (paramInt2 == -1)
      {
        str1 = paramIntent.getStringExtra("encrypt_pwd");
        i = com.tencent.mm.wallet_core.ui.e.iy(this.tiR.getText(), "100");
        localObject1 = this.tjh.pbn;
        localObject2 = this.tjh.pck;
        str2 = this.tjh.vEQ;
        j = this.tjh.ehf;
        k = this.tjh.vES;
        localObject3 = g.b(this.mController.ylL, false, null);
        localObject4 = this.tjc.tfM;
        f.a(str1, localObject1, localObject2, str2, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)).c((com.tencent.mm.vending.c.a)localObject4).f(new WalletLqtPlanAddUI.3(this, (Dialog)localObject3)).a(new WalletLqtPlanAddUI.2(this, (Dialog)localObject3));
      }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(45584);
      return;
      if ((paramInt1 == 4) && (paramInt2 == -1))
      {
        localObject4 = paramIntent.getStringExtra("encrypt_pwd");
        i = com.tencent.mm.wallet_core.ui.e.iy(this.tiR.getText(), "100");
        j = this.tjh.vES;
        localObject3 = this.tjh.pbn;
        str2 = this.tjh.pck;
        str1 = this.tjh.vEQ;
        k = this.tjh.ehf;
        localObject1 = g.b(this.mController.ylL, false, null);
        localObject2 = this.tjc.tfN;
        f.a(Integer.valueOf(j), localObject3, str2, str1, Integer.valueOf(i), Integer.valueOf(k), localObject4).c((com.tencent.mm.vending.c.a)localObject2).f(new WalletLqtPlanAddUI.5(this, (Dialog)localObject1)).a(new WalletLqtPlanAddUI.4(this, (Dialog)localObject1));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45581);
    this.yll = true;
    super.onCreate(paramBundle);
    setMMTitle(2131305000);
    xE(getResources().getColor(2131690691));
    dyb();
    this.mMode = getIntent().getIntExtra("key_mode", 0);
    if (this.mMode == 2);
    try
    {
      bkm localbkm = new com/tencent/mm/protocal/protobuf/bkm;
      localbkm.<init>();
      paramBundle = getIntent().getByteArrayExtra("key_plan_item");
      if (paramBundle != null)
      {
        this.tjh = ((bkm)localbkm.parseFrom(paramBundle));
        this.tjk = this.tjh.cSh;
        this.tjl = this.tjh.ehf;
        this.tjm = this.tjh.vEQ;
      }
      this.tjo = new String[28];
      for (int i = 0; i < 28; i++)
        this.tjo[i] = getString(2131304954, new Object[] { String.valueOf(i + 1) });
    }
    catch (IOException paramBundle)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletLqtPlanAddUI", paramBundle, "", new Object[0]);
      initView();
      cu();
      mN(true);
      AppMethodBeat.o(45581);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45583);
    super.onDestroy();
    AppMethodBeat.o(45583);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI
 * JD-Core Version:    0.6.2
 */