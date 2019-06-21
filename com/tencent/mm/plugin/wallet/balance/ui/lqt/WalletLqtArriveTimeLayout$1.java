package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class WalletLqtArriveTimeLayout$1
  implements View.OnClickListener
{
  WalletLqtArriveTimeLayout$1(WalletLqtArriveTimeLayout paramWalletLqtArriveTimeLayout)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45503);
    WalletLqtArriveTimeLayout.a(this.thZ);
    paramView = (WalletLqtArriveTimeLayout.b)paramView.getTag();
    if ((WalletLqtArriveTimeLayout.b(this.thZ) != null) && (WalletLqtArriveTimeLayout.b(this.thZ).size() > paramView.index))
    {
      paramView.aaX.setChecked(true);
      WalletLqtArriveTimeLayout.a(this.thZ, (bqr)WalletLqtArriveTimeLayout.b(this.thZ).get(paramView.index));
    }
    while (true)
    {
      WalletLqtArriveTimeLayout.c(this.thZ);
      ab.i("MicroMsg.WalletLqtArriveTimeLayout", "click item: %s, %s", new Object[] { Integer.valueOf(paramView.index), paramView.iDT.getText() });
      AppMethodBeat.o(45503);
      return;
      WalletLqtArriveTimeLayout.a(this.thZ, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout.1
 * JD-Core Version:    0.6.2
 */