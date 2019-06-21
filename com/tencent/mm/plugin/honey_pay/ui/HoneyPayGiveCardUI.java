package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class HoneyPayGiveCardUI extends HoneyPayBaseUI
{
  private String igi;
  private ImageView kEn;
  private String kGE;
  private String kWC;
  private long nrO = 100000L;
  private long nrP = 0L;
  private String nsb;
  private int nsd;
  private ScrollView nsk;
  private WalletFormView nsl;
  private TextView nsm;
  private TextView nsn;
  private TextView nso;
  private TextView nsp;
  private TextView nsq;
  private CdnImageView nsr;
  private MMEditText nss;

  private void bGe()
  {
    AppMethodBeat.i(41870);
    this.nsq.setVisibility(0);
    this.nss.setVisibility(8);
    this.nss.setText(this.nsb);
    this.nss.setSelection(this.nsb.length());
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String str = getString(2131300575);
    SpannableString localSpannableString = j.b(this.mController.ylL, this.nsb, this.nsq.getTextSize());
    localSpannableStringBuilder.append(localSpannableString);
    localSpannableStringBuilder.append(" ");
    localSpannableStringBuilder.append(str);
    localSpannableStringBuilder.setSpan(new o(new HoneyPayGiveCardUI.9(this)), localSpannableString.length() + 1, localSpannableStringBuilder.length(), 34);
    this.nsq.setText(localSpannableStringBuilder);
    AppMethodBeat.o(41870);
  }

  private void hZ(boolean paramBoolean)
  {
    AppMethodBeat.i(41873);
    if ((paramBoolean) && (!this.nsn.isShown()))
    {
      String str = ae.dOd() + e.b(new StringBuilder().append(this.nrP).toString(), "100", RoundingMode.HALF_UP);
      this.nsn.setText(getString(2131300572, new Object[] { str }));
      this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034193));
      this.nsn.setVisibility(0);
      AppMethodBeat.o(41873);
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (this.nsn.isShown()))
      {
        this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034213));
        this.nsn.setVisibility(8);
      }
      AppMethodBeat.o(41873);
    }
  }

  private void ia(boolean paramBoolean)
  {
    AppMethodBeat.i(41874);
    if ((paramBoolean) && (!this.nsn.isShown()))
    {
      String str = ae.dOd() + e.a(new StringBuilder().append(this.nrO).toString(), "100", 2, RoundingMode.HALF_UP).toString();
      this.nsn.setText(getString(2131300568, new Object[] { str }));
      this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034193));
      this.nsn.setVisibility(0);
      AppMethodBeat.o(41874);
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (this.nsn.isShown()))
      {
        this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034213));
        this.nsn.setVisibility(8);
      }
      AppMethodBeat.o(41874);
    }
  }

  private void ib(boolean paramBoolean)
  {
    AppMethodBeat.i(41875);
    this.nso.setEnabled(paramBoolean);
    AppMethodBeat.o(41875);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130969830;
  }

  public final void initView()
  {
    AppMethodBeat.i(41869);
    this.nsk = ((ScrollView)findViewById(2131824903));
    this.nsl = ((WalletFormView)findViewById(2131824911));
    this.nsm = ((TextView)findViewById(2131824906));
    this.nsn = ((TextView)findViewById(2131824914));
    this.kEn = ((ImageView)findViewById(2131824905));
    this.nso = ((TextView)findViewById(2131824913));
    this.nsp = ((TextView)findViewById(2131824912));
    this.nsq = ((TextView)findViewById(2131824907));
    this.nss = ((MMEditText)findViewById(2131824908));
    a.b.a(this.kEn, this.igi, 0.06F, false);
    String str1 = e.eL(this.igi, 10);
    String str2 = str1;
    if (!bo.isNullOrNil(this.kGE))
      str2 = String.format("%s(%s)", new Object[] { str1, this.kGE });
    this.nsm.setText(j.b(this.mController.ylL, str2, this.nsm.getTextSize()));
    this.nsl.dOP();
    this.nsl.getTitleTv().setText(ae.dOd());
    this.nsl.a(new HoneyPayGiveCardUI.1(this));
    this.nsl.setOnClickListener(new HoneyPayGiveCardUI.2(this));
    this.nsp.setOnClickListener(new HoneyPayGiveCardUI.3(this));
    this.nso.setClickable(true);
    this.nso.setOnClickListener(new HoneyPayGiveCardUI.4(this));
    this.nsq.setClickable(true);
    this.nsq.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this));
    this.nss.setOnEditorActionListener(new HoneyPayGiveCardUI.5(this));
    this.nss.setOnFocusChangeListener(new HoneyPayGiveCardUI.6(this));
    bGe();
    this.obM = new HoneyPayGiveCardUI.7(this);
    e(this.nsl, 2, false);
    this.nsl.postDelayed(new HoneyPayGiveCardUI.8(this), 100L);
    this.nsr = ((CdnImageView)findViewById(2131824909));
    if (!bo.isNullOrNil(this.kWC))
    {
      this.nsr.eb(this.kWC, c.bFX());
      AppMethodBeat.o(41869);
    }
    while (true)
    {
      return;
      this.nsr.setImageResource(c.bFX());
      AppMethodBeat.o(41869);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41872);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(41872);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41868);
    this.nqT = 2131690166;
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawableResource(2131690691);
    this.nrO = getIntent().getLongExtra("key_max_credit_line", 0L);
    this.nrP = getIntent().getLongExtra("key_min_credit_line", 0L);
    this.kGE = getIntent().getStringExtra("key_true_name");
    this.igi = getIntent().getStringExtra("key_username");
    this.nsb = getIntent().getStringExtra("key_wishing");
    this.kWC = getIntent().getStringExtra("key_icon_url");
    this.nsd = getIntent().getIntExtra("key_cardtype", 0);
    if (this.nsd == 0)
    {
      ab.w(this.TAG, "error card type!!");
      finish();
    }
    initView();
    setMMTitle(2131300556);
    AppMethodBeat.o(41868);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41871);
    super.onDestroy();
    AppMethodBeat.o(41871);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI
 * JD-Core Version:    0.6.2
 */