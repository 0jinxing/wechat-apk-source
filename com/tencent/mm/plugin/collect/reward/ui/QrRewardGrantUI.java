package com.tencent.mm.plugin.collect.reward.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fx;
import com.tencent.mm.plugin.collect.reward.a.a;
import com.tencent.mm.plugin.collect.reward.a.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class QrRewardGrantUI extends QrRewardBaseUI
{
  private RadioButton aaX;
  private int cIb;
  private String czZ;
  private String hAh;
  private String kBE;
  private ImageView kDI;
  private TextView kDJ;
  private TextView kDK;
  private WalletTextView kDL;
  private LinearLayout kDM;
  private WalletFormView kDN;
  private MMEditText kDO;
  private Button kDP;
  private int kDQ;
  private int kDR;
  private String kDS;
  private String kDT;
  private String kDU;
  private String kDV;
  private String kDW;
  private String kDX;
  private String kDY;
  private String kDZ;
  private String kEa;
  private int kEb;
  private c<fx> kEc;

  public QrRewardGrantUI()
  {
    AppMethodBeat.i(41072);
    this.kEc = new QrRewardGrantUI.8(this);
    AppMethodBeat.o(41072);
  }

  private void dA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(41078);
    ab.i("MicroMsg.QrRewardGrantUI", "do pay check");
    if (bo.isNullOrNil(this.czZ))
      this.czZ = paramString1;
    if (bo.isNullOrNil(this.kBE))
      this.kBE = paramString2;
    a(new d(this.czZ, this.kDT, this.kBE, this.kDQ, this.kDU, this.kDV), false, false);
    AppMethodBeat.o(41078);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41075);
    if ((paramm instanceof com.tencent.mm.plugin.collect.reward.a.e))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.e)paramm;
      paramString.a(new QrRewardGrantUI.7(this, paramString)).b(new QrRewardGrantUI.6(this, paramString)).c(new QrRewardGrantUI.5(this));
    }
    AppMethodBeat.o(41075);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970430;
  }

  public final void initView()
  {
    AppMethodBeat.i(41074);
    this.kDI = ((ImageView)findViewById(2131826730));
    this.kDJ = ((TextView)findViewById(2131826731));
    this.kDL = ((WalletTextView)findViewById(2131826733));
    this.kDM = ((LinearLayout)findViewById(2131826732));
    this.kDN = ((WalletFormView)findViewById(2131826734));
    this.kDO = ((MMEditText)findViewById(2131826735));
    this.kDP = ((Button)findViewById(2131826738));
    this.kDK = ((TextView)findViewById(2131826739));
    this.aaX = ((RadioButton)findViewById(2131826737));
    this.aaX.setChecked(true);
    this.kDK.setText(getString(2131302080, new Object[] { Math.round(this.kEb / 100.0F) }));
    a.b.a(this.kDI, this.kDW, 0.03F, false);
    String str = com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(this.kDW), 10);
    this.kDJ.setText(j.b(this, getString(2131302066, new Object[] { str })));
    if (this.kDR == 2)
    {
      ab.i("MicroMsg.QrRewardGrantUI", "edit layout");
      e(this.kDN, 2, false);
      this.kDN.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          AppMethodBeat.i(41063);
          if (paramAnonymousEditable.toString().startsWith("."))
            paramAnonymousEditable.insert(0, "0");
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 3))
            paramAnonymousEditable.delete(i + 3, j);
          while (true)
          {
            j = (int)Math.round(bo.getDouble(paramAnonymousEditable.toString(), 0.0D) * 100.0D);
            QrRewardGrantUI.a(QrRewardGrantUI.this, j);
            QrRewardGrantUI.b(QrRewardGrantUI.this, j);
            AppMethodBeat.o(41063);
            return;
            if (i > 6)
              paramAnonymousEditable.delete(6, i);
            else if ((i == -1) && (j > 6))
              paramAnonymousEditable.delete(6, j);
          }
        }

        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }

        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }
      });
      this.kDN.setVisibility(0);
      this.kDM.setVisibility(8);
      this.kDN.dOS();
      this.kDP.setEnabled(false);
    }
    while (true)
    {
      this.kDP.setOnClickListener(new QrRewardGrantUI.2(this));
      findViewById(2131826736).setOnClickListener(new QrRewardGrantUI.3(this));
      this.aaX.setOnCheckedChangeListener(new QrRewardGrantUI.4(this));
      AppMethodBeat.o(41074);
      return;
      this.kDL.setText(com.tencent.mm.wallet_core.ui.e.F(this.kDQ / 100.0D));
      this.kDN.setVisibility(8);
      this.kDM.setVisibility(0);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41077);
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1)
        break label61;
      setResult(-1);
      if (paramIntent != null)
        dA(paramIntent.getStringExtra("key_reqKey"), paramIntent.getStringExtra("key_trans_id"));
      finish();
      AppMethodBeat.o(41077);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      label61: AppMethodBeat.o(41077);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41073);
    super.onCreate(paramBundle);
    nf(1336);
    this.kEc.dnU();
    setMMTitle(2131302065);
    this.kDQ = getIntent().getIntExtra("key_money_amt", 20000);
    this.kDR = getIntent().getIntExtra("key_amt_type", 0);
    this.kDS = getIntent().getStringExtra("key_qrcode_desc");
    this.cIb = getIntent().getIntExtra("key_channel", 0);
    this.kDU = getIntent().getStringExtra("key_rcvr_open_id");
    this.kDW = getIntent().getStringExtra("key_rcvr_name");
    this.kDX = getIntent().getStringExtra("key_rcvr_true_name");
    this.kDY = getIntent().getStringExtra("key_scan_id");
    this.hAh = getIntent().getStringExtra("key_web_url");
    this.kDZ = getIntent().getStringExtra("key_sxtend_1");
    this.kEa = getIntent().getStringExtra("key_sxtend_2");
    this.kEb = getIntent().getIntExtra("key_max_amt", 20000);
    ab.i("MicroMsg.QrRewardGrantUI", "amtType: %s, channel: %s, maxAmt: %s", new Object[] { Integer.valueOf(this.kDR), Integer.valueOf(this.cIb), Integer.valueOf(this.kEb) });
    initView();
    AppMethodBeat.o(41073);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41076);
    super.onDestroy();
    ng(1336);
    this.kEc.dead();
    AppMethodBeat.o(41076);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI
 * JD-Core Version:    0.6.2
 */