package com.tencent.mm.plugin.luckymoney.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;

final class LuckyMoneyBusiReceiveUI$3
  implements View.OnClickListener
{
  LuckyMoneyBusiReceiveUI$3(LuckyMoneyBusiReceiveUI paramLuckyMoneyBusiReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42618);
    paramView = new Bundle();
    paramView.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
    paramView.putString("realname_verify_process_jump_plugin", "luckymoney");
    if ((LuckyMoneyBusiReceiveUI.d(this.odj) != null) && (LuckyMoneyBusiReceiveUI.d(this.odj).a(this.odj, paramView, null, null, true)))
    {
      LuckyMoneyBusiReceiveUI.e(this.odj);
      AppMethodBeat.o(42618);
    }
    while (true)
    {
      return;
      this.odj.finish();
      AppMethodBeat.o(42618);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.3
 * JD-Core Version:    0.6.2
 */