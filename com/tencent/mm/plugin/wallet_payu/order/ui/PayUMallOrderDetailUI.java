package com.tencent.mm.plugin.wallet_payu.order.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.order.a.c;
import com.tencent.mm.protocal.protobuf.bjn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class PayUMallOrderDetailUI extends WalletBaseUI
{
  private TextView iqw;
  private TextView nSC;
  private String oXY = "";
  private TextView pSi;
  private bjn tTD;
  private LinearLayout tTE;
  private LinearLayout tTF;
  private LinearLayout tTG;
  private LinearLayout tTH;
  private LinearLayout tTI;
  private LinearLayout tTJ;
  private LinearLayout tTK;
  private TextView tTL;
  private TextView tTM;
  private TextView tTN;
  private TextView tTO;

  private void caf()
  {
    AppMethodBeat.i(48427);
    if (this.tTD == null)
      AppMethodBeat.o(48427);
    while (true)
    {
      label17: return;
      if (!bo.isNullOrNil(this.tTD.pcU))
      {
        this.tTE.setVisibility(0);
        this.tTL.setText(this.tTD.pcU);
        label53: if (bo.isNullOrNil(this.tTD.pde))
          break label305;
        this.tTF.setVisibility(0);
        this.tTM.setText(this.tTD.pde);
        label88: if (bo.isNullOrNil(this.tTD.pcW))
          break label317;
        this.tTG.setVisibility(0);
        this.tTN.setText(this.tTD.pcW);
        label123: if (bo.isNullOrNil(this.tTD.pda))
          break label329;
        this.tTH.setVisibility(0);
        this.pSi.setText(e.e(this.tTD.wMU / 100.0D, this.tTD.pda));
        label173: if (this.tTD.pcX < 0)
          break label341;
        this.tTI.setVisibility(0);
        this.nSC.setText(e.kC(this.tTD.pcX));
        label208: if (bo.isNullOrNil(this.tTD.pcY))
          break label353;
        this.tTJ.setVisibility(0);
        this.iqw.setText(this.tTD.pcY);
      }
      while (true)
        switch (this.tTD.pdc)
        {
        case 4:
        default:
          this.tTO.setText(2131305208);
          AppMethodBeat.o(48427);
          break label17;
          this.tTE.setVisibility(8);
          break label53;
          label305: this.tTF.setVisibility(8);
          break label88;
          label317: this.tTG.setVisibility(8);
          break label123;
          label329: this.tTH.setVisibility(8);
          break label173;
          label341: this.tTI.setVisibility(8);
          break label208;
          label353: this.tTJ.setVisibility(8);
        case 3:
        case 5:
        }
      this.tTO.setText(2131304555);
      AppMethodBeat.o(48427);
      continue;
      this.tTO.setText(2131304855);
      AppMethodBeat.o(48427);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48428);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof c))
      {
        this.tTD = ((c)paramm).tTC;
        caf();
      }
      bool = true;
      AppMethodBeat.o(48428);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48428);
    }
  }

  public final int getLayoutId()
  {
    return 2130970350;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48426);
    super.onCreate(paramBundle);
    nf(1520);
    this.oXY = this.mBundle.getString("key_trans_id");
    if (bo.isNullOrNil(this.oXY))
    {
      ab.e("MicroMsg.PayUMallOrderDetailUI", "hy: trans id is null");
      finish();
    }
    a(new c(this.oXY), true, true);
    this.tTE = ((LinearLayout)findViewById(2131826486));
    this.tTF = ((LinearLayout)findViewById(2131826488));
    this.tTG = ((LinearLayout)findViewById(2131826490));
    this.tTH = ((LinearLayout)findViewById(2131826492));
    this.tTI = ((LinearLayout)findViewById(2131826498));
    this.tTJ = ((LinearLayout)findViewById(2131826494));
    this.tTK = ((LinearLayout)findViewById(2131826496));
    this.tTL = ((TextView)findViewById(2131826487));
    this.tTM = ((TextView)findViewById(2131826489));
    this.tTN = ((TextView)findViewById(2131826491));
    this.pSi = ((TextView)findViewById(2131826493));
    this.nSC = ((TextView)findViewById(2131826499));
    this.iqw = ((TextView)findViewById(2131826495));
    this.tTO = ((TextView)findViewById(2131826497));
    caf();
    AppMethodBeat.o(48426);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48429);
    super.onDestroy();
    ng(1520);
    AppMethodBeat.o(48429);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderDetailUI
 * JD-Core Version:    0.6.2
 */