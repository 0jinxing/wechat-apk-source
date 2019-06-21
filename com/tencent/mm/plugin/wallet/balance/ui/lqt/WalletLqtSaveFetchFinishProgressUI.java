package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView;
import com.tencent.mm.protocal.protobuf.bqq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletLqtSaveFetchFinishProgressUI extends WalletBaseUI
{
  private LinearLayout nsy;
  private ImageView pNb;
  private ImageView pNc;
  private ImageView pNd;
  private TextView pNe;
  private TextView pNf;
  private TextView pNg;
  private TextView pNh;
  private TextView pNi;
  private TextView pNj;
  private bqq tka;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130968816;
  }

  public final void initView()
  {
    AppMethodBeat.i(45637);
    this.pNb = ((ImageView)findViewById(2131821647));
    this.pNc = ((ImageView)findViewById(2131821651));
    this.pNd = ((ImageView)findViewById(2131821655));
    this.pNb.setImageResource(2130837843);
    this.pNc.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.pNc.setImageResource(2131231871);
    this.pNd.setImageResource(2130837844);
    this.pNe = ((TextView)findViewById(2131821648));
    this.pNf = ((TextView)findViewById(2131821652));
    this.pNg = ((TextView)findViewById(2131821656));
    this.pNe.setText(2131304944);
    this.pNf.setText(this.tka.wSY);
    this.pNf.setTextColor(getResources().getColor(2131690316));
    this.pNg.setText(2131304542);
    this.pNh = ((TextView)findViewById(2131821649));
    this.pNi = ((TextView)findViewById(2131821653));
    this.pNj = ((TextView)findViewById(2131821657));
    this.pNh.setVisibility(8);
    this.pNi.setText(this.tka.wSZ);
    this.pNi.setVisibility(0);
    this.pNj.setVisibility(8);
    this.nsy = ((LinearLayout)findViewById(2131821660));
    this.nsy.setBackgroundResource(2130837842);
    Object localObject1 = new WalletBalanceFetchResultItemView(this, true);
    ((WalletBalanceFetchResultItemView)localObject1).b(2131305003, e.G(this.tka.wOi / 100.0F));
    this.nsy.addView((View)localObject1);
    if (!bo.isNullOrNil(this.tka.nuL))
    {
      Object localObject2 = this.tka.nuL;
      localObject1 = localObject2;
      if (!bo.isNullOrNil(this.tka.pck))
        localObject1 = (String)localObject2 + " " + getString(2131305177) + this.tka.pck;
      localObject2 = new WalletBalanceFetchResultItemView(this);
      ((WalletBalanceFetchResultItemView)localObject2).b(2131304932, (CharSequence)localObject1);
      this.nsy.addView((View)localObject2);
    }
    if (!bo.isNullOrNil(this.tka.wTa))
    {
      localObject1 = new WalletBalanceFetchResultItemView(this);
      ((WalletBalanceFetchResultItemView)localObject1).b(2131304928, this.tka.wTa);
      this.nsy.addView((View)localObject1);
    }
    ((Button)findViewById(2131821663)).setOnClickListener(new WalletLqtSaveFetchFinishProgressUI.2(this));
    findViewById(2131821658).setVisibility(8);
    findViewById(2131821661).setVisibility(8);
    AppMethodBeat.o(45637);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45636);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getByteArrayExtra("key_redeem_res");
    this.tka = new bqq();
    try
    {
      this.tka.parseFrom(paramBundle);
      paramBundle = this.tka;
      if (paramBundle != null)
      {
        paramBundle = String.format("status:%s, wording_for_status2:%s, pre_arrive_time_wording:%s, redeem_fee:%s, bank_name:%s, card_tail:%s, failure_wording:%s", new Object[] { Integer.valueOf(paramBundle.status), paramBundle.wSY, paramBundle.wSZ, Integer.valueOf(paramBundle.wOi), paramBundle.nuL, paramBundle.pck, paramBundle.wTa });
        ab.i("MicroMsg.WalletLqtSaveFetchFinishProgressUI", "onCreate, redeemRes: %s", new Object[] { paramBundle });
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690691)));
        View localView = getSupportActionBar().getCustomView();
        if (localView != null)
        {
          paramBundle = localView.findViewById(2131821128);
          if (paramBundle != null)
            paramBundle.setBackgroundColor(getResources().getColor(2131690157));
          paramBundle = localView.findViewById(16908308);
          if ((paramBundle != null) && ((paramBundle instanceof TextView)))
            ((TextView)paramBundle).setTextColor(getResources().getColor(2131689761));
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramBundle = getWindow();
          paramBundle.addFlags(-2147483648);
          paramBundle.setStatusBarColor(getResources().getColor(2131690691));
          if (Build.VERSION.SDK_INT >= 23)
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        this.mController.contentView.setFitsSystemWindows(true);
        initView();
        showHomeBtn(false);
        enableBackMenu(false);
        pP(false);
        setMMTitle(2131304933);
        setBackBtn(new WalletLqtSaveFetchFinishProgressUI.1(this));
        AppMethodBeat.o(45636);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishProgressUI", paramBundle, "parse redeemFundRes error!", new Object[0]);
        finish();
        continue;
        paramBundle = "";
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressUI
 * JD-Core Version:    0.6.2
 */