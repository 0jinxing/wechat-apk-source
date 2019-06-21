package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ShakeSayHiListUI$1
  implements View.OnClickListener
{
  ShakeSayHiListUI$1(ShakeSayHiListUI paramShakeSayHiListUI, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24873);
    ShakeSayHiListUI.a(this.qwt, ShakeSayHiListUI.a(this.qwt) + 8);
    ab.d("MicroMsg.SayHiListUI", "dkfooter more btn:" + ShakeSayHiListUI.a(this.qwt));
    ShakeSayHiListUI.b(this.qwt).CA(ShakeSayHiListUI.a(this.qwt));
    if (ShakeSayHiListUI.c(this.qwt) <= ShakeSayHiListUI.a(this.qwt))
    {
      ShakeSayHiListUI.d(this.qwt).removeFooterView(this.oQO);
      ab.d("MicroMsg.SayHiListUI", "dkfooter REMOVE more btn: " + ShakeSayHiListUI.a(this.qwt));
    }
    AppMethodBeat.o(24873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.1
 * JD-Core Version:    0.6.2
 */