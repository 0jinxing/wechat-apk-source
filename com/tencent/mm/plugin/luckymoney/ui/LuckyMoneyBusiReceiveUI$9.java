package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.ac;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyBusiReceiveUI$9
  implements View.OnClickListener
{
  LuckyMoneyBusiReceiveUI$9(LuckyMoneyBusiReceiveUI paramLuckyMoneyBusiReceiveUI, ac paramac)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42626);
    paramView = new Intent();
    paramView.setClass(this.odj.mController.ylL, LuckyMoneyBusiDetailUI.class);
    if (this.odl.nTN != null)
      paramView.putExtra("key_realname_guide_helper", this.odl.nTN);
    paramView.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.j(this.odj));
    paramView.putExtra("key_sendid", this.odl.nSX);
    paramView.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.g(this.odj));
    this.odj.startActivity(paramView);
    this.odj.finish();
    AppMethodBeat.o(42626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.9
 * JD-Core Version:    0.6.2
 */