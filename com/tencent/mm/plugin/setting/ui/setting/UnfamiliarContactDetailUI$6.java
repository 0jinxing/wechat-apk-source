package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class UnfamiliarContactDetailUI$6
  implements UnfamiliarContactDetailUI.g
{
  UnfamiliarContactDetailUI$6(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void cjq()
  {
    AppMethodBeat.i(127639);
    UnfamiliarContactDetailUI.c(this.qpX, true);
    AppMethodBeat.o(127639);
  }

  public final void fh(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(127638);
    UnfamiliarContactDetailUI.f.qqu += paramInt1;
    UnfamiliarContactDetailUI.c(this.qpX, false);
    UnfamiliarContactDetailUI.g(this.qpX).setText(this.qpX.getString(2131304148) + "(" + UnfamiliarContactDetailUI.f(this.qpX).size() + ")");
    if (UnfamiliarContactDetailUI.e(this.qpX) != null)
      UnfamiliarContactDetailUI.e(this.qpX).aop.notifyChanged();
    if (paramInt2 < paramInt1)
    {
      ab.w("MicroMsg.UnfamiliarContactUI", "[onDelSuccess] realDeleteCount:%s count:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      h.b(this.qpX.mController.ylL, this.qpX.getString(2131304145, new Object[] { Integer.valueOf(paramInt1 - paramInt2) }), "", true);
    }
    AppMethodBeat.o(127638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.6
 * JD-Core Version:    0.6.2
 */