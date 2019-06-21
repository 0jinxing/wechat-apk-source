package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class HoneyPayMainUI$1
  implements View.OnClickListener
{
  HoneyPayMainUI$1(HoneyPayMainUI paramHoneyPayMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41882);
    ab.d(this.nsB.TAG, "click add friend");
    HoneyPayMainUI.a(this.nsB);
    AppMethodBeat.o(41882);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.1
 * JD-Core Version:    0.6.2
 */