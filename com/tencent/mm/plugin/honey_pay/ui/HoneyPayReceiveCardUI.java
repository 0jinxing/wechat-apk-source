package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.atk;
import com.tencent.mm.protocal.protobuf.bnn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

public class HoneyPayReceiveCardUI extends HoneyPayBaseUI
{
  private int gOW;
  private String nra;
  private ImageView nsP;
  private TextView nsQ;
  private TextView nsR;
  private TextView nsS;
  private TextView nsT;
  private TextView nsU;
  private TextView nsV;
  private TextView nsW;
  private TextView nsX;
  private TextView nsY;
  private LinearLayout nsZ;
  private CdnImageView nta;
  private g ntb;

  public HoneyPayReceiveCardUI()
  {
    AppMethodBeat.i(41942);
    this.ntb = new HoneyPayReceiveCardUI.1(this);
    AppMethodBeat.o(41942);
  }

  private void a(bnn parambnn)
  {
    AppMethodBeat.i(41947);
    if (parambnn.wps == null)
      AppMethodBeat.o(41947);
    while (true)
    {
      return;
      atk localatk = parambnn.wps;
      this.nsU.setText(localatk.wxs);
      this.nsW.setText(j.b(this.mController.ylL, localatk.nSd, this.nsW.getTextSize()));
      Object localObject = new Bundle();
      ((Bundle)localObject).putBoolean("click_help", true);
      this.nsX.setText(j.a(this.mController.ylL, localatk.pMg, (int)this.nsX.getTextSize(), localObject));
      this.nsX.setClickable(true);
      this.nsX.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
      if (!bo.isNullOrNil(parambnn.wNr))
      {
        localObject = new o(new HoneyPayReceiveCardUI.9(this, parambnn));
        parambnn = new SpannableString(parambnn.wNr);
        parambnn.setSpan(localObject, 0, parambnn.length(), 18);
        this.nsS.setText(parambnn);
        this.nsS.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
        this.nsS.setClickable(true);
        label212: this.nsR.setText(localatk.kdf);
        a.b.a(this.nsP, localatk.vAh, 0.06F, false);
        com.tencent.mm.wallet_core.ui.e.d(this.nsQ, localatk.vAh);
        com.tencent.mm.wallet_core.ui.e.d(this.nsY, localatk.vAh);
        if (localatk.iAd != 1)
          break label329;
        this.nsV.setText(2131300549);
      }
      while (true)
      {
        if (bo.isNullOrNil(localatk.kKZ))
          break label378;
        this.nta.eb(localatk.kKZ, c.bFX());
        AppMethodBeat.o(41947);
        break;
        ab.d(this.TAG, "no help url");
        this.nsS.setVisibility(8);
        break label212;
        label329: if (localatk.iAd == 2)
          this.nsV.setText(2131300576);
        else
          this.nsV.setText(j.b(this, com.tencent.mm.wallet_core.ui.e.eK(r.YB(), 16), this.nsV.getTextSize()));
      }
      label378: this.nta.setImageResource(c.bFX());
      AppMethodBeat.o(41947);
    }
  }

  private void bGa()
  {
    AppMethodBeat.i(41948);
    ab.i(this.TAG, "qry user detail");
    com.tencent.mm.plugin.honey_pay.a.m localm = new com.tencent.mm.plugin.honey_pay.a.m(this.nra);
    localm.o(this);
    a(localm, true, false);
    AppMethodBeat.o(41948);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41946);
    if ((paramm instanceof com.tencent.mm.plugin.honey_pay.a.m))
    {
      paramString = (com.tencent.mm.plugin.honey_pay.a.m)paramm;
      paramString.a(new HoneyPayReceiveCardUI.5(this, paramString)).b(new HoneyPayReceiveCardUI.4(this)).c(new p.a()
      {
        public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
        {
        }
      });
    }
    while (true)
    {
      AppMethodBeat.o(41946);
      return true;
      if ((paramm instanceof com.tencent.mm.plugin.honey_pay.a.e))
      {
        paramString = (com.tencent.mm.plugin.honey_pay.a.e)paramm;
        paramString.a(new HoneyPayReceiveCardUI.8(this, paramString)).b(new HoneyPayReceiveCardUI.7(this, paramString)).c(new HoneyPayReceiveCardUI.6(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969835;
  }

  public final void initView()
  {
    AppMethodBeat.i(41944);
    this.nsP = ((ImageView)findViewById(2131824935));
    this.nsQ = ((TextView)findViewById(2131824934));
    this.nsV = ((TextView)findViewById(2131824930));
    this.nsR = ((TextView)findViewById(2131824938));
    this.nsY = ((TextView)findViewById(2131824939));
    this.nsS = ((TextView)findViewById(2131824933));
    this.nsT = ((TextView)findViewById(2131824940));
    this.nsU = ((TextView)findViewById(2131824941));
    this.nsZ = ((LinearLayout)findViewById(2131824937));
    this.nsW = ((TextView)findViewById(2131824931));
    this.nsX = ((TextView)findViewById(2131824932));
    this.nta = ((CdnImageView)findViewById(2131824936));
    this.nsT.setOnClickListener(new HoneyPayReceiveCardUI.2(this));
    AppMethodBeat.o(41944);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41943);
    this.nqT = 2131690167;
    super.onCreate(paramBundle);
    j.a(this.ntb);
    nf(2613);
    nf(1983);
    this.nra = getIntent().getStringExtra("key_card_no");
    this.gOW = getIntent().getIntExtra("key_scene", 0);
    initView();
    if (this.gOW == 1)
      paramBundle = new bnn();
    while (true)
    {
      try
      {
        paramBundle.parseFrom(getIntent().getByteArrayExtra("key_qry_response"));
        a(paramBundle);
        if (paramBundle.wps != null)
          setMMTitle(paramBundle.wps.kdf);
        AppMethodBeat.o(41943);
        return;
      }
      catch (IOException paramBundle)
      {
        ab.printErrStackTrace(this.TAG, paramBundle, "", new Object[0]);
        bGa();
        AppMethodBeat.o(41943);
        continue;
      }
      bGa();
      AppMethodBeat.o(41943);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41945);
    super.onDestroy();
    j.b(this.ntb);
    ng(2613);
    ng(1983);
    AppMethodBeat.o(41945);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI
 * JD-Core Version:    0.6.2
 */