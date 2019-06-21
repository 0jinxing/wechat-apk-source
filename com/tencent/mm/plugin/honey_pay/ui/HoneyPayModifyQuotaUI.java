package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class HoneyPayModifyQuotaUI extends HoneyPayBaseUI
{
  private long nrO;
  private long nrP;
  private String nra;
  private WalletFormView nsI;
  private Button nsJ;
  private TextView nsn;

  private void hZ(boolean paramBoolean)
  {
    AppMethodBeat.i(41920);
    if ((paramBoolean) && (!this.nsn.isShown()))
    {
      String str = ae.dOd() + e.a(new StringBuilder().append(this.nrP).toString(), "100", 2, RoundingMode.HALF_UP).toString();
      this.nsn.setText(getString(2131300572, new Object[] { str }));
      this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034193));
      this.nsn.setVisibility(0);
      AppMethodBeat.o(41920);
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (this.nsn.isShown()))
      {
        this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034213));
        this.nsn.setVisibility(8);
      }
      AppMethodBeat.o(41920);
    }
  }

  private void ia(boolean paramBoolean)
  {
    AppMethodBeat.i(41921);
    if ((paramBoolean) && (!this.nsn.isShown()))
    {
      String str = ae.dOd() + e.a(new StringBuilder().append(this.nrO).toString(), "100", 2, RoundingMode.HALF_UP);
      this.nsn.setText(getString(2131300568, new Object[] { str }));
      this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034193));
      this.nsn.setVisibility(0);
      AppMethodBeat.o(41921);
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (this.nsn.isShown()))
      {
        this.nsn.startAnimation(AnimationUtils.loadAnimation(this, 2131034213));
        this.nsn.setVisibility(8);
      }
      AppMethodBeat.o(41921);
    }
  }

  private void ib(boolean paramBoolean)
  {
    AppMethodBeat.i(41922);
    this.nsJ.setEnabled(paramBoolean);
    AppMethodBeat.o(41922);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130969833;
  }

  public final void initView()
  {
    AppMethodBeat.i(41917);
    this.nsI = ((WalletFormView)findViewById(2131824927));
    this.nsJ = ((Button)findViewById(2131824928));
    this.nsn = ((TextView)findViewById(2131824929));
    this.nsI.dOP();
    this.nsI.getTitleTv().setText(ae.dOd());
    e(this.nsI, 2, false);
    this.nsI.a(new HoneyPayModifyQuotaUI.1(this));
    this.nsJ.setOnClickListener(new HoneyPayModifyQuotaUI.2(this));
    this.nsI.postDelayed(new HoneyPayModifyQuotaUI.3(this), 100L);
    AppMethodBeat.o(41917);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41919);
    if ((paramInt1 == 1) && (paramInt2 == -1) && (paramIntent.getBooleanExtra("key_modify_create_line_succ", false)))
    {
      setResult(-1, paramIntent);
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(41919);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41916);
    super.onCreate(paramBundle);
    this.nrO = getIntent().getLongExtra("key_max_credit_line", 0L);
    this.nrP = getIntent().getLongExtra("key_min_credit_line", 0L);
    this.nra = getIntent().getStringExtra("key_card_no");
    initView();
    setMMTitle(2131300573);
    AppMethodBeat.o(41916);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41918);
    super.onDestroy();
    AppMethodBeat.o(41918);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI
 * JD-Core Version:    0.6.2
 */