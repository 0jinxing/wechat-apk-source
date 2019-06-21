package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyNotHookReceiveUI$5
  implements View.OnClickListener
{
  LuckyMoneyNotHookReceiveUI$5(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI, an paraman)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42852);
    paramView = new Intent();
    if (this.ofH.nTN != null)
      paramView.putExtra("key_realname_guide_helper", this.ofH.nTN);
    paramView.setClass(this.ogx.mController.ylL, LuckyMoneyBeforeDetailUI.class);
    paramView.putExtra("key_lucky_money_can_received", true);
    paramView.putExtra("key_native_url", this.ofH.cRS);
    paramView.putExtra("key_sendid", this.ofH.nSX);
    paramView.putExtra("key_username", this.ogx.getIntent().getStringExtra("key_username"));
    paramView.putExtra("key_emoji_switch", this.ofH.nYC);
    paramView.putExtra("key_detail_emoji_md5", this.ofH.nYA);
    paramView.putExtra("key_detail_emoji_type", this.ofH.nYB);
    this.ogx.startActivity(paramView);
    this.ogx.finish();
    AppMethodBeat.o(42852);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.5
 * JD-Core Version:    0.6.2
 */