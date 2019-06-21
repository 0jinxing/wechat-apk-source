package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public final class WalletLqtPlanHomeUI$b
{
  public View iym;
  public WalletTextView tjR;
  public ImageView tjS;
  public TextView tjT;
  public TextView tjU;
  public TextView tjV;
  public TextView tjW;
  public LinearLayout tjX;

  public WalletLqtPlanHomeUI$b(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI, View paramView)
  {
    AppMethodBeat.i(45621);
    this.iym = paramView;
    this.tjR = ((WalletTextView)paramView.findViewById(2131825339));
    this.tjS = ((ImageView)paramView.findViewById(2131825340));
    this.tjW = ((TextView)paramView.findViewById(2131825341));
    this.tjT = ((TextView)paramView.findViewById(2131825342));
    this.tjU = ((TextView)paramView.findViewById(2131825343));
    this.tjV = ((TextView)paramView.findViewById(2131825345));
    this.tjX = ((LinearLayout)paramView.findViewById(2131825344));
    int i = a.fromDPToPix(paramWalletLqtPlanHomeUI.mController.ylL, 50);
    bo.n(this.tjS, i, i, i, i);
    AppMethodBeat.o(45621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.b
 * JD-Core Version:    0.6.2
 */