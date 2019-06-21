package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeMsgListUI$3
  implements View.OnClickListener
{
  ShakeMsgListUI$3(ShakeMsgListUI paramShakeMsgListUI, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24754);
    ShakeMsgListUI.a(this.quR, ShakeMsgListUI.d(this.quR) + 8);
    ShakeMsgListUI.b(this.quR).CA(ShakeMsgListUI.d(this.quR));
    if (ShakeMsgListUI.e(this.quR) <= ShakeMsgListUI.d(this.quR))
      ShakeMsgListUI.f(this.quR).removeFooterView(this.oQO);
    AppMethodBeat.o(24754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.3
 * JD-Core Version:    0.6.2
 */