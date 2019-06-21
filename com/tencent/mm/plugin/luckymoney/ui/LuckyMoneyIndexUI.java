package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.luckymoney.b.a;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.model.j;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.q.b;

public class LuckyMoneyIndexUI extends LuckyMoneyBaseUI
{
  private int obL;
  private LinearLayout oeG;
  private LinearLayout oeH;
  private LinearLayout oeI;

  private void bMx()
  {
    AppMethodBeat.i(42729);
    a.bKN();
    i locali = a.bKO().bLu();
    if (locali == null)
      AppMethodBeat.o(42729);
    while (true)
    {
      return;
      ImageView localImageView = (ImageView)findViewById(2131825527);
      if ((locali.nWJ & 0x1) == 1)
      {
        ab.i("MicroMsg.LuckyMoneyIndexUI", "initView: topBg use money bg");
        localImageView.setImageResource(2130839311);
        AppMethodBeat.o(42729);
      }
      else
      {
        localImageView.setImageResource(2130839312);
        AppMethodBeat.o(42729);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42730);
    boolean bool;
    if ((paramm instanceof ag))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ag)paramm;
        paramm = new h.c();
        paramm.textColor = getResources().getColor(2131690244);
        paramm.ogM = 101;
        h.a(this, this.oeG, paramString.nXf, paramm, "Text");
        paramm = new h.c();
        paramm.textColor = getResources().getColor(2131690244);
        paramm.ogM = 100;
        h.a(this, this.oeH, paramString.nYJ, paramm, "Text");
        paramm = new h.c();
        paramm.ogM = 102;
        h.a(this, this.oeI, paramString.nYH, paramm, "Pic");
        bMx();
      }
      bool = true;
      AppMethodBeat.o(42730);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(42730);
    }
  }

  public final int getLayoutId()
  {
    return 2130969983;
  }

  public final void initView()
  {
    AppMethodBeat.i(42728);
    setMMTitle(2131301206);
    setBackBtn(new LuckyMoneyIndexUI.1(this));
    this.oeG = ((LinearLayout)findViewById(2131825532));
    this.oeH = ((LinearLayout)findViewById(2131825531));
    this.oeI = ((LinearLayout)findViewById(2131825533));
    ((Button)findViewById(2131825530)).setOnClickListener(new LuckyMoneyIndexUI.2(this));
    ((Button)findViewById(2131825529)).setOnClickListener(new LuckyMoneyIndexUI.3(this));
    a(0, getString(2131301131), new LuckyMoneyIndexUI.4(this), q.b.ymB);
    bMx();
    AppMethodBeat.o(42728);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42726);
    super.onCreate(paramBundle);
    ((b)g.K(b.class)).a(this, null);
    initView();
    b(new ag("v1.0", ((Integer)g.RP().Ry().get(ac.a.xUv, Integer.valueOf(0))).intValue(), (byte)0), false);
    this.obL = getIntent().getIntExtra("pay_channel", -1);
    com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    AppMethodBeat.o(42726);
  }

  public void onResume()
  {
    AppMethodBeat.i(42727);
    super.onResume();
    b localb = (b)g.K(b.class);
    localb.a(this, localb.cTi(), null);
    AppMethodBeat.o(42727);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI
 * JD-Core Version:    0.6.2
 */