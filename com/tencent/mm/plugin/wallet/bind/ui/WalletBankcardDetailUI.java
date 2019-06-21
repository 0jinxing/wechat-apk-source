package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

public class WalletBankcardDetailUI extends WalletBaseUI
{
  protected Bankcard thJ;
  protected TextView tlE;
  private TextView tlF;
  private View tlG;
  protected LinearLayout tlH;
  protected LinearLayout tlI;
  protected LinearLayout tlJ;

  private void ceo()
  {
    AppMethodBeat.i(45756);
    addIconOptionMenu(0, 2130839555, new WalletBankcardDetailUI.5(this));
    AppMethodBeat.o(45756);
  }

  private void mU(boolean paramBoolean)
  {
    AppMethodBeat.i(45757);
    if ((!r.YM()) && (!paramBoolean) && (!((com.tencent.mm.plugin.walletlock.a.b)g.K(com.tencent.mm.plugin.walletlock.a.b.class)).cTj()))
    {
      e.QS(0);
      h.a(this, 2131304601, -1, 2131304600, 2131304602, true, new WalletBankcardDetailUI.6(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(45747);
          WalletBankcardDetailUI.b(WalletBankcardDetailUI.this);
          e.QS(2);
          AppMethodBeat.o(45747);
        }
      });
      AppMethodBeat.o(45757);
    }
    while (true)
    {
      return;
      this.mBundle.putBoolean("offline_pay", false);
      com.tencent.mm.wallet_core.a.j(this, this.mBundle);
      AppMethodBeat.o(45757);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(45759);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wallet.bind.a.b))
      {
        if (this.tlE != null)
          this.tlE.setVisibility(0);
        AppMethodBeat.o(45759);
      }
    while (true)
    {
      return bool;
      if (!(paramm instanceof com.tencent.mm.plugin.wallet.bind.a.a))
        break;
      paramString = (com.tencent.mm.plugin.wallet.bind.a.a)paramm;
      ab.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo succ and level = " + paramString.tle);
      switch (paramString.tle)
      {
      default:
        mU(false);
        break;
      case 2:
      case 3:
        paramInt1 = paramString.tle;
        h.a(this, paramString.tlf, null, false, new WalletBankcardDetailUI.9(this, paramInt1));
        break;
        if (!(paramm instanceof com.tencent.mm.plugin.wallet.bind.a.a))
          break;
        ab.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo error");
        mU(false);
        bool = true;
        AppMethodBeat.o(45759);
      }
    }
  }

  protected final void cNs()
  {
    AppMethodBeat.i(45755);
    this.tlH.setVisibility(0);
    this.tlI.setVisibility(8);
    ((TextView)findViewById(2131828675)).setOnClickListener(new WalletBankcardDetailUI.3(this));
    ((TextView)findViewById(2131828673)).setOnClickListener(new WalletBankcardDetailUI.4(this));
    AppMethodBeat.o(45755);
  }

  public final int getLayoutId()
  {
    return 2130971061;
  }

  public final void initView()
  {
    AppMethodBeat.i(45753);
    this.thJ = ((Bankcard)this.mBundle.getParcelable("key_bankcard"));
    if (this.thJ == null)
      AppMethodBeat.o(45753);
    while (true)
    {
      return;
      this.tlH = ((LinearLayout)findViewById(2131828672));
      this.tlI = ((LinearLayout)findViewById(2131828663));
      this.tlJ = ((LinearLayout)findViewById(2131828676));
      this.tlF = ((TextView)findViewById(2131828669));
      this.tlG = findViewById(2131828670);
      this.tlG.setOnClickListener(new WalletBankcardDetailUI.1(this));
      if (1 != this.thJ.field_bankcardState)
        break;
      cNs();
      AppMethodBeat.o(45753);
    }
    if (this.thJ.cPf())
    {
      mT(true);
      this.tlE = ((TextView)findViewById(2131828664));
      s.cNC();
      s.cND();
      this.tlE.setVisibility(8);
    }
    while (true)
    {
      ceo();
      AppMethodBeat.o(45753);
      break;
      mT(false);
      this.tlE = ((TextView)findViewById(2131828677));
      s.cNC();
      s.cND();
      this.tlE.setVisibility(8);
    }
  }

  protected final void mT(boolean paramBoolean)
  {
    AppMethodBeat.i(45754);
    if (paramBoolean)
    {
      this.tlH.setVisibility(8);
      this.tlI.setVisibility(0);
      ((TextView)findViewById(2131828671)).setOnClickListener(new WalletBankcardDetailUI.2(this));
      TextView localTextView1 = (TextView)findViewById(2131828665);
      TextView localTextView2 = (TextView)findViewById(2131828666);
      TextView localTextView3 = (TextView)findViewById(2131828667);
      TextView localTextView4 = (TextView)findViewById(2131828668);
      localTextView1.setText(e.e(this.thJ.field_onceQuotaKind, null));
      localTextView2.setText(e.e(this.thJ.field_onceQuotaVirtual, null));
      localTextView3.setText(e.e(this.thJ.field_dayQuotaKind, null));
      localTextView4.setText(e.e(this.thJ.field_dayQuotaVirtual, null));
      if (!bo.isNullOrNil(this.thJ.field_repay_url))
      {
        this.tlF.setVisibility(0);
        this.tlG.setVisibility(0);
      }
      AppMethodBeat.o(45754);
    }
    while (true)
    {
      return;
      this.tlH.setVisibility(8);
      this.tlI.setVisibility(8);
      this.tlJ.setVisibility(0);
      AppMethodBeat.o(45754);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45750);
    super.onCreate(paramBundle);
    nf(621);
    setMMTitle(2131304599);
    initView();
    AppMethodBeat.o(45750);
  }

  @Deprecated
  public Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(45758);
    Dialog localDialog = h.a(this.mController.ylL, getString(2131304586), getResources().getStringArray(2131755065), "", new WalletBankcardDetailUI.8(this));
    AppMethodBeat.o(45758);
    return localDialog;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45752);
    ng(621);
    super.onDestroy();
    AppMethodBeat.o(45752);
  }

  public void onResume()
  {
    AppMethodBeat.i(45751);
    super.onResume();
    AppMethodBeat.o(45751);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI
 * JD-Core Version:    0.6.2
 */