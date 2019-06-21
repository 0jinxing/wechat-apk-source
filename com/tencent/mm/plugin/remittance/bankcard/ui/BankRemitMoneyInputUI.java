package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.remittance.bankcard.a.n;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class BankRemitMoneyInputUI extends BankRemitBaseUI
{
  private String eeO;
  private Button gHn;
  private final int gnS;
  private ScrollView nsk;
  private String ogi;
  private CdnImageView pMa;
  private TextView pMc;
  private WalletFormView pNA;
  private LinearLayout pNB;
  private TextView pNC;
  private TextView pND;
  private TextView pNE;
  private TextView pNF;
  private BankcardElemParcel pNG;
  private String pNH;
  private String pNI;
  private String pNJ;
  private String pNK;
  private String pNL;
  private int pNM;
  private int pNN;
  private com.tencent.mm.plugin.wallet_core.ui.o pNO;
  private long pNP;
  private int pNQ;
  private int pNR;
  private int pNS;
  private String pNn;
  private TextView pNz;

  public BankRemitMoneyInputUI()
  {
    AppMethodBeat.i(44642);
    this.gnS = a.fromDPToPix(ah.getContext(), 270);
    this.pNQ = 0;
    AppMethodBeat.o(44642);
  }

  private void cfi()
  {
    AppMethodBeat.i(44650);
    if ((bo.getDouble(this.pNA.getText(), 0.0D) > 0.0D) && (!bo.isNullOrNil(this.pNI)) && (!bo.isNullOrNil(this.pNJ)) && (!bo.isNullOrNil(this.pNL)) && (!bo.isNullOrNil(this.pNK)))
    {
      this.gHn.setEnabled(true);
      AppMethodBeat.o(44650);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BankRemitMoneyInputUI", "disable btn: money: %s, seqNo: %s, tail: %s, bankType: %s, encrypt: %s", new Object[] { this.pNA.getText(), Boolean.valueOf(bo.isNullOrNil(this.pNI)), Boolean.valueOf(bo.isNullOrNil(this.pNJ)), Boolean.valueOf(bo.isNullOrNil(this.pNL)), Boolean.valueOf(bo.isNullOrNil(this.pNK)) });
      this.gHn.setEnabled(false);
      AppMethodBeat.o(44650);
    }
  }

  private void cfl()
  {
    AppMethodBeat.i(44648);
    this.pNF.setClickable(true);
    this.pNF.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
    this.pNO = new com.tencent.mm.plugin.wallet_core.ui.o(new BankRemitMoneyInputUI.8(this));
    cfm();
    AppMethodBeat.o(44648);
  }

  private void cfm()
  {
    AppMethodBeat.i(44649);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (!bo.isNullOrNil(this.eeO))
    {
      localSpannableStringBuilder.append(j.b(this.mController.ylL, this.eeO));
      localSpannableStringBuilder.append(getString(2131297475));
      localSpannableStringBuilder.setSpan(this.pNO, this.eeO.length(), localSpannableStringBuilder.length(), 34);
    }
    while (true)
    {
      this.pNF.setText(localSpannableStringBuilder);
      AppMethodBeat.o(44649);
      return;
      localSpannableStringBuilder.append(getString(2131297476));
      localSpannableStringBuilder.setSpan(this.pNO, 0, localSpannableStringBuilder.length(), 18);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(44645);
    if ((paramm instanceof com.tencent.mm.plugin.remittance.bankcard.a.o))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.o)paramm;
      paramString.a(new BankRemitMoneyInputUI.7(this, paramString)).b(new BankRemitMoneyInputUI.6(this, paramString)).c(new BankRemitMoneyInputUI.5(this));
    }
    AppMethodBeat.o(44645);
    return false;
  }

  public final int getLayoutId()
  {
    return 2130968821;
  }

  public final void initView()
  {
    AppMethodBeat.i(44644);
    this.nsk = ((ScrollView)findViewById(2131820884));
    this.pMa = ((CdnImageView)findViewById(2131821672));
    this.pMc = ((TextView)findViewById(2131821673));
    this.pNz = ((TextView)findViewById(2131821674));
    this.pNA = ((WalletFormView)findViewById(2131821675));
    this.pNB = ((LinearLayout)findViewById(2131821676));
    this.pNC = ((TextView)this.pNB.findViewById(2131821677));
    this.pND = ((TextView)this.pNB.findViewById(2131821678));
    this.pNE = ((TextView)this.pNB.findViewById(2131821679));
    this.pNF = ((TextView)this.pNB.findViewById(2131821680));
    this.gHn = ((Button)findViewById(2131821681));
    this.pNC.setText(getString(2131297461, new Object[] { this.pNG.pLO }));
    this.pMa.setUrl(this.pNG.pLH);
    this.pMc.setText(getString(2131297481, new Object[] { this.pNG.nuL, this.pNJ }));
    this.pNz.setText(this.pNH);
    this.pNA.setTitleText(ae.dOd());
    e(this.pNA, 2, false);
    this.pNA.a(new BankRemitMoneyInputUI.1(this));
    cfl();
    this.gHn.setOnClickListener(new BankRemitMoneyInputUI.3(this));
    cfi();
    this.obM = new BankRemitMoneyInputUI.4(this);
    AppMethodBeat.o(44644);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44647);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.BankRemitMoneyInputUI", "goto detail");
        Object localObject = new Intent(this.mController.ylL, BankRemitDetailUI.class);
        ((Intent)localObject).putExtra("key_transfer_bill_id", this.pNn);
        ((Intent)localObject).putExtra("key_enter_scene", 0);
        startActivityForResult((Intent)localObject, 2);
        localObject = "";
        if (paramIntent != null)
          localObject = paramIntent.getStringExtra("key_trans_id");
        ab.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", new Object[] { this.pNn, localObject });
        a(new com.tencent.mm.plugin.remittance.bankcard.a.c(this.pNn, (String)localObject), false, false);
        this.pNQ = 1;
        paramIntent = new n(this.pNn, this.ogi, 1);
        a(paramIntent, false, false);
        AppMethodBeat.o(44647);
      }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.wallet_core.utils.c.aw(paramIntent))
      {
        finish();
        AppMethodBeat.o(44647);
      }
      else if (com.tencent.mm.plugin.wallet_core.utils.c.ax(paramIntent))
      {
        AppMethodBeat.o(44647);
      }
      else
      {
        ab.i("MicroMsg.BankRemitMoneyInputUI", "pay failed: %d", new Object[] { Integer.valueOf(paramInt2) });
        this.pNQ = paramIntent.getIntExtra("key_pay_reslut_type", 0);
        paramIntent = new n(this.pNn, this.ogi, this.pNQ);
        ab.i("MicroMsg.BankRemitMoneyInputUI", "onActivityResult() requestCode == REQ_PAY resultCode != RESULT_OK  mUnpayType:%s", new Object[] { Integer.valueOf(this.pNQ) });
        break;
        if (paramInt1 == 2)
        {
          ab.d("MicroMsg.BankRemitMoneyInputUI", "return from detail");
          paramIntent = new Intent();
          paramIntent.addFlags(67108864);
          d.b(this.mController.ylL, "offline", ".ui.WalletOfflineCoinPurseUI", paramIntent);
          AppMethodBeat.o(44647);
        }
        else
        {
          super.onActivityResult(paramInt1, paramInt2, paramIntent);
          AppMethodBeat.o(44647);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44643);
    super.onCreate(paramBundle);
    dyb();
    nf(1380);
    nf(2739);
    int i = ((Integer)g.RP().Ry().get(ac.a.xTQ, Integer.valueOf(10))).intValue();
    int j = i;
    if (i < 0)
      j = 10;
    this.pNR = j;
    i = ((Integer)g.RP().Ry().get(ac.a.xTR, Integer.valueOf(5000000))).intValue();
    j = i;
    if (i <= 0)
      j = 5000000;
    this.pNS = j;
    ab.i("MicroMsg.BankRemitMoneyInputUI", "minFee: %s, maxAmount: %s", new Object[] { Integer.valueOf(this.pNR), Integer.valueOf(this.pNS) });
    this.ogi = getIntent().getStringExtra("key_unique_id");
    this.pNG = ((BankcardElemParcel)getIntent().getParcelableExtra("key_bank_card_elem_parcel"));
    this.pNH = getIntent().getStringExtra("key_payee_name");
    this.pNI = getIntent().getStringExtra("key_bank_card_seqno");
    this.pNJ = getIntent().getStringExtra("key_bank_card_tailno");
    this.pNK = getIntent().getStringExtra("key_encrypt_data");
    this.pNM = getIntent().getIntExtra("key_enter_time_scene", 0);
    this.pNN = getIntent().getIntExtra("key_input_type", 0);
    ab.d("MicroMsg.BankRemitMoneyInputUI", "set uniqueId:%s", new Object[] { this.ogi });
    if (this.pNG == null)
    {
      ab.w("MicroMsg.BankRemitMoneyInputUI", "bankcard elem is null");
      this.pNG = new BankcardElemParcel();
    }
    this.pNL = this.pNG.pbn;
    initView();
    setMMTitle(2131297489);
    AppMethodBeat.o(44643);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44646);
    super.onDestroy();
    ng(1380);
    ng(2739);
    AppMethodBeat.o(44646);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI
 * JD-Core Version:    0.6.2
 */