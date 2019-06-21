package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;

final class ShakeMsgListUI$5
  implements AdapterView.OnItemLongClickListener
{
  ShakeMsgListUI$5(ShakeMsgListUI paramShakeMsgListUI, j paramj)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24756);
    if (paramInt < ShakeMsgListUI.f(this.quR).getHeaderViewsCount())
    {
      ab.w("MicroMsg.ShakeMsgListUI", "on header view long click, ignore");
      AppMethodBeat.o(24756);
    }
    while (true)
    {
      return true;
      this.jKd.a(paramView, paramInt, paramLong, this.quR.mController.ylL, ShakeMsgListUI.h(this.quR));
      AppMethodBeat.o(24756);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.5
 * JD-Core Version:    0.6.2
 */