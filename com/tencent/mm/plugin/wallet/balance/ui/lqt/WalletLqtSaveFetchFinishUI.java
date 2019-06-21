package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.ase;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import java.io.IOException;

@a(19)
public class WalletLqtSaveFetchFinishUI extends WalletBaseUI
{
  private ViewGroup kEk;
  private Button oDB;
  private TextView tkc;
  private WalletTextView tkd;
  private TextView tke;
  private TextView tkf;
  private ase tkg;
  private CdnImageView tkh;
  private TextView tki;
  private TextView tkj;
  private LinearLayout tkk;

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(45643);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(45643);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971120;
  }

  public void onBackPressed()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45642);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(-1);
    this.mController.hideTitleView();
    enableBackMenu(false);
    this.kEk = ((ViewGroup)findViewById(2131826653));
    this.tkc = ((TextView)findViewById(2131828858));
    this.tkd = ((WalletTextView)findViewById(2131828860));
    this.oDB = ((Button)findViewById(2131828863));
    this.tke = ((TextView)findViewById(2131828861));
    this.tkf = ((TextView)findViewById(2131828864));
    this.tkh = ((CdnImageView)findViewById(2131828865));
    this.tki = ((TextView)findViewById(2131828866));
    this.tkj = ((TextView)findViewById(2131828867));
    this.tkk = ((LinearLayout)findViewById(2131821222));
    int i = getIntent().getIntExtra("key_mode", 1);
    double d = getIntent().getDoubleExtra("key_amount", 0.0D);
    paramBundle = getIntent().getStringExtra("profile_date_wording");
    String str = getIntent().getStringExtra("profile_upgrade_wording");
    byte[] arrayOfByte = getIntent().getByteArrayExtra("key_guide_cell");
    if (arrayOfByte != null);
    try
    {
      ase localase = new com/tencent/mm/protocal/protobuf/ase;
      localase.<init>();
      this.tkg = ((ase)localase.parseFrom(arrayOfByte));
      if (i == 1)
      {
        this.tkc.setText(getString(2131305012));
        setMMTitle(getString(2131305012));
        this.tkd.setText(e.F(d));
        this.oDB.setOnClickListener(new WalletLqtSaveFetchFinishUI.1(this));
        if (!bo.isNullOrNil(paramBundle))
        {
          this.tke.setText(paramBundle);
          this.tke.setVisibility(0);
        }
        if (!bo.isNullOrNil(str))
        {
          this.tkf.setText(j.e(this, str, (int)this.tkf.getTextSize()));
          this.tkf.setClickable(true);
          this.tkf.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m());
          this.tkf.setVisibility(0);
        }
        if (this.tkg == null)
          break label544;
        if (!bo.isNullOrNil(this.tkg.cIY))
          this.tkh.setUrl(this.tkg.cIY);
        this.tki.setText(this.tkg.title);
        this.tkj.setText(this.tkg.desc);
        this.tkk.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(45639);
            if ("wxpay://lqt/planindex".equals(WalletLqtSaveFetchFinishUI.a(WalletLqtSaveFetchFinishUI.this).url))
            {
              paramAnonymousView = new Intent(WalletLqtSaveFetchFinishUI.this.mController.ylL, WalletLqtPlanHomeUI.class);
              WalletLqtSaveFetchFinishUI.this.startActivity(paramAnonymousView);
              AppMethodBeat.o(45639);
            }
            while (true)
            {
              return;
              if ("wxpay://lqt/preaddplan".equals(WalletLqtSaveFetchFinishUI.a(WalletLqtSaveFetchFinishUI.this).url))
              {
                paramAnonymousView = new Intent(WalletLqtSaveFetchFinishUI.this.mController.ylL, WalletLqtPlanAddUI.class);
                paramAnonymousView.putExtra("key_mode", 3);
                WalletLqtSaveFetchFinishUI.this.startActivity(paramAnonymousView);
                AppMethodBeat.o(45639);
              }
              else
              {
                ab.w("MicroMsg.WalletLqtSaveFetchFinishUI", "unknown url: %s", new Object[] { WalletLqtSaveFetchFinishUI.a(WalletLqtSaveFetchFinishUI.this).url });
                AppMethodBeat.o(45639);
              }
            }
          }
        });
        this.tkk.setVisibility(0);
        getWindow().getDecorView().post(new WalletLqtSaveFetchFinishUI.3(this));
        AppMethodBeat.o(45642);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishUI", localIOException, "", new Object[0]);
        continue;
        if (i == 2)
        {
          this.tkc.setText(getString(2131304940));
          setMMTitle(getString(2131304940));
          continue;
          label544: this.tkk.setVisibility(8);
          getWindow().getDecorView().post(new WalletLqtSaveFetchFinishUI.4(this));
          AppMethodBeat.o(45642);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI
 * JD-Core Version:    0.6.2
 */