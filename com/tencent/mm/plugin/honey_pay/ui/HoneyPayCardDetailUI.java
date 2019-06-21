package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.asi;
import com.tencent.mm.protocal.protobuf.atk;
import com.tencent.mm.protocal.protobuf.bnn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

public class HoneyPayCardDetailUI extends HoneyPayBaseUI
{
  private int gOW;
  private ImageView kEn;
  private String nra;
  private TextView nre;
  private TextView nrf;
  private TextView nrg;
  private TextView nrh;
  private TextView nri;
  private TextView nrj;
  private RelativeLayout nrk;
  private CdnImageView nrl;
  private TextView nrm;
  private Button nrn;
  private bnn nro;
  private asi nrp;

  private void bFZ()
  {
    AppMethodBeat.i(41785);
    if (this.nro.wps == null)
      AppMethodBeat.o(41785);
    while (true)
    {
      return;
      atk localatk = this.nro.wps;
      setMMTitle(localatk.kdf);
      this.nre.setText(localatk.wxw);
      int i = localatk.state;
      if (i == 2)
      {
        this.kEn.setImageResource(2130840748);
        if (!bo.isNullOrNil(localatk.wxs))
        {
          localatk.wxs = c.eG(localatk.wxs, this.nro.wps.vAh);
          this.nrf.setText(j.a(this, localatk.wxs, (int)this.nrf.getTextSize(), null));
        }
        findViewById(2131824855).setVisibility(8);
        findViewById(2131824860).setVisibility(8);
        findViewById(2131824863).setVisibility(8);
        if (this.nrp != null)
        {
          this.nrk.setVisibility(0);
          this.nrl.setUrl(this.nrp.cIY);
          this.nrm.setText(this.nrp.wvV);
          this.nrn.setText(this.nrp.wvU);
          this.nrn.setOnClickListener(new HoneyPayCardDetailUI.4(this));
          AppMethodBeat.o(41785);
        }
      }
      else if (i == 3)
      {
        this.kEn.setImageResource(2131231870);
        if (!bo.isNullOrNil(localatk.wxs))
          this.nrf.setText(localatk.wxs);
        this.nrg.setText(2131300589);
        this.nrh.setText(2131300591);
        this.nri.setText(c.iS(this.nro.wps.vNm));
        this.nrj.setText(c.iS(this.nro.wps.kbK));
        AppMethodBeat.o(41785);
      }
      else
      {
        if (i == 4)
        {
          this.kEn.setImageResource(2131231870);
          if (!bo.isNullOrNil(localatk.wxs))
            this.nrf.setText(j.e(this, localatk.wxs, (int)this.nrf.getTextSize()));
          this.nrg.setText(2131300590);
          this.nri.setText(c.iS(this.nro.wps.wxu));
          findViewById(2131824863).setVisibility(8);
        }
        AppMethodBeat.o(41785);
      }
    }
  }

  private void bGa()
  {
    AppMethodBeat.i(41786);
    com.tencent.mm.plugin.honey_pay.a.m localm = new com.tencent.mm.plugin.honey_pay.a.m(this.nra);
    localm.o(this);
    a(localm, true, false);
    AppMethodBeat.o(41786);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41784);
    if ((paramm instanceof com.tencent.mm.plugin.honey_pay.a.m))
    {
      paramString = (com.tencent.mm.plugin.honey_pay.a.m)paramm;
      paramString.a(new HoneyPayCardDetailUI.3(this, paramString)).b(new HoneyPayCardDetailUI.2(this)).c(new HoneyPayCardDetailUI.1(this));
    }
    AppMethodBeat.o(41784);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130969821;
  }

  public final void initView()
  {
    AppMethodBeat.i(41782);
    this.kEn = ((ImageView)findViewById(2131824852));
    this.nre = ((TextView)findViewById(2131824853));
    this.nrf = ((TextView)findViewById(2131824854));
    this.nri = ((TextView)findViewById(2131824862));
    this.nrj = ((TextView)findViewById(2131824865));
    this.nrg = ((TextView)findViewById(2131824861));
    this.nrh = ((TextView)findViewById(2131824864));
    this.nrk = ((RelativeLayout)findViewById(2131824856));
    this.nrl = ((CdnImageView)findViewById(2131824857));
    this.nrm = ((TextView)findViewById(2131824858));
    this.nrn = ((Button)findViewById(2131824859));
    this.nrf.setClickable(true);
    this.nrf.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
    AppMethodBeat.o(41782);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41781);
    this.nqT = 2131690167;
    super.onCreate(paramBundle);
    nf(2613);
    this.gOW = getIntent().getIntExtra("key_scene", 0);
    this.nra = getIntent().getStringExtra("key_card_no");
    initView();
    if (this.gOW == 0)
    {
      bGa();
      AppMethodBeat.o(41781);
    }
    while (true)
    {
      return;
      paramBundle = getIntent().getByteArrayExtra("key_qry_response");
      try
      {
        bnn localbnn = new com/tencent/mm/protocal/protobuf/bnn;
        localbnn.<init>();
        this.nro = localbnn;
        this.nro.parseFrom(paramBundle);
        bFZ();
        AppMethodBeat.o(41781);
      }
      catch (IOException paramBundle)
      {
        ab.printErrStackTrace(this.TAG, paramBundle, "", new Object[0]);
        bGa();
        AppMethodBeat.o(41781);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41783);
    super.onDestroy();
    ng(2613);
    AppMethodBeat.o(41783);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardDetailUI
 * JD-Core Version:    0.6.2
 */