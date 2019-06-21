package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.HashMap;

final class UnfamiliarContactDetailUI$10
  implements VerticalScrollBar.a
{
  UnfamiliarContactDetailUI$10(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void kp(String paramString)
  {
    AppMethodBeat.i(127647);
    UnfamiliarContactDetailUI localUnfamiliarContactDetailUI = this.qpX;
    if ((localUnfamiliarContactDetailUI.qpP != null) && (localUnfamiliarContactDetailUI.qpP.containsKey(paramString)));
    for (int i = ((Integer)localUnfamiliarContactDetailUI.qpP.get(paramString)).intValue(); ; i = -1)
    {
      ab.i("MicroMsg.UnfamiliarContactUI", "[onScollBarTouch] showHead:%s pos:%s", new Object[] { paramString, Integer.valueOf(i) });
      if (i != -1)
        UnfamiliarContactDetailUI.j(this.qpX).bY(i);
      AppMethodBeat.o(127647);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.10
 * JD-Core Version:    0.6.2
 */