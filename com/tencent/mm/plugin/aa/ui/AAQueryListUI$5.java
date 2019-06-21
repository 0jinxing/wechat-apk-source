package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class AAQueryListUI$5
  implements d.a
{
  AAQueryListUI$5(AAQueryListUI paramAAQueryListUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40734);
    ab.i("MicroMsg.AAQueryListUI", "getNexPage failed: %s", new Object[] { paramObject });
    if (AAQueryListUI.g(this.gnt) != null)
    {
      AAQueryListUI.g(this.gnt).dismiss();
      AAQueryListUI.h(this.gnt);
    }
    AAQueryListUI.i(this.gnt);
    if (AAQueryListUI.a(this.gnt).getFooterViewsCount() > 0)
      AAQueryListUI.a(this.gnt).removeFooterView(AAQueryListUI.d(this.gnt));
    if ((paramObject instanceof String))
    {
      Toast.makeText(this.gnt, paramObject.toString(), 1).show();
      AppMethodBeat.o(40734);
    }
    while (true)
    {
      return;
      Toast.makeText(this.gnt, 2131300408, 1).show();
      AppMethodBeat.o(40734);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI.5
 * JD-Core Version:    0.6.2
 */