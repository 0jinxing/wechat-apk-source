package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.a.a.n;
import com.tencent.mm.plugin.wallet.balance.a.a.w;
import com.tencent.mm.plugin.wallet.balance.a.a.w.a;
import com.tencent.mm.protocal.protobuf.bkm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;
import java.util.ArrayList;
import java.util.List;

public class WalletLqtPlanHomeUI extends WalletLqtBasePresenterUI
{
  private ViewGroup kox;
  private LinearLayout tjA;
  private Button tjB;
  private RelativeLayout tjC;
  private LinearLayout tjD;
  private TextView tjE;
  private w tjF;
  private WalletLqtPlanHomeUI.a tjG;
  private List<bkm> tjH;
  private int tjI;
  private int tjJ;
  private ListView tjx;
  private TextView tjy;
  private TextView tjz;

  public WalletLqtPlanHomeUI()
  {
    AppMethodBeat.i(45622);
    this.tjF = ((w)V(w.class));
    this.tjG = new WalletLqtPlanHomeUI.a(this, (byte)0);
    this.tjH = new ArrayList();
    AppMethodBeat.o(45622);
  }

  private void bGb()
  {
    AppMethodBeat.i(45626);
    this.kox = ((ViewGroup)LayoutInflater.from(this).inflate(2130969960, this.tjx, false));
    this.kox.setOnClickListener(new WalletLqtPlanHomeUI.3(this));
    this.tjx.addFooterView(this.kox);
    AppMethodBeat.o(45626);
  }

  private void mO(boolean paramBoolean)
  {
    AppMethodBeat.i(45627);
    n localn = new n();
    localn.b(new com.tencent.mm.plugin.wallet.balance.a.a.g());
    localn.a(new WalletLqtPlanHomeUI.7(this, paramBoolean));
    AppMethodBeat.o(45627);
  }

  public final int getLayoutId()
  {
    return 2130969961;
  }

  public final void initView()
  {
    AppMethodBeat.i(45624);
    this.tjx = ((ListView)findViewById(2131825348));
    this.tjy = ((TextView)findViewById(2131825351));
    this.tjz = ((TextView)findViewById(2131825352));
    this.tjA = ((LinearLayout)findViewById(2131825350));
    this.tjB = ((Button)findViewById(2131825353));
    this.tjC = ((RelativeLayout)findViewById(2131825349));
    this.tjD = ((LinearLayout)findViewById(2131825354));
    this.tjE = ((TextView)findViewById(2131825355));
    this.tjG = new WalletLqtPlanHomeUI.a(this, (byte)0);
    this.tjx.setAdapter(this.tjG);
    bGb();
    this.tjB.setOnClickListener(new WalletLqtPlanHomeUI.1(this));
    this.tjx.setOnItemClickListener(new WalletLqtPlanHomeUI.2(this));
    AppMethodBeat.o(45624);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45625);
    ab.i("MicroMsg.WalletLqtPlanHomeUI", "activity result: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 65281:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(45625);
      return;
      if (paramInt2 == -1)
      {
        String str = paramIntent.getStringExtra("encrypt_pwd");
        int i = this.tjI;
        int j = this.tjJ;
        Dialog localDialog = com.tencent.mm.wallet_core.ui.g.b(this.mController.ylL, false, null);
        w.a locala = this.tjF.tfS;
        f.h(Integer.valueOf(i), Integer.valueOf(j), str).c(locala).f(new WalletLqtPlanHomeUI.9(this, localDialog)).a(new WalletLqtPlanHomeUI.8(this, localDialog));
        continue;
        if (paramInt2 == -1)
          mO(false);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45623);
    this.yll = true;
    super.onCreate(paramBundle);
    setMMTitle("");
    xE(getResources().getColor(2131690691));
    dyb();
    initView();
    mO(true);
    AppMethodBeat.o(45623);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI
 * JD-Core Version:    0.6.2
 */