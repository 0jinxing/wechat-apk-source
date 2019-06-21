package com.tencent.mm.plugin.honey_pay.model;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.btn;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.d;

final class c$2
  implements MenuItem.OnMenuItemClickListener
{
  c$2(MMActivity paramMMActivity, btn parambtn, String paramString, chl paramchl, int paramInt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(41755);
    paramMenuItem = new d(this.icV, 1, false);
    paramMenuItem.rBl = new c.2.1(this);
    paramMenuItem.rBm = new c.2.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(41755);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.c.2
 * JD-Core Version:    0.6.2
 */