package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class UnfamiliarContactDetailUI$c$2
  implements View.OnClickListener
{
  UnfamiliarContactDetailUI$c$2(UnfamiliarContactDetailUI.c paramc, UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127659);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = UnfamiliarContactDetailUI.e(this.qqk.qpX).Cr(i);
    ab.i("MicroMsg.UnfamiliarContactUI", "position:%s", new Object[] { Integer.valueOf(i), paramView.eoz });
    UnfamiliarContactDetailUI.c.a(this.qqk, paramView, i);
    AppMethodBeat.o(127659);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.c.2
 * JD-Core Version:    0.6.2
 */