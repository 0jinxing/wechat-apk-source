package com.tencent.mm.plugin.websearch.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;

final class g$4
  implements b.a
{
  g$4(g paramg, b paramb, Bundle paramBundle, t paramt)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(91454);
    this.jqm.hide();
    Bundle localBundle = this.udv;
    if (paramBoolean);
    for (paramObject = this.jqm.dLl(); ; paramObject = "-1")
    {
      localBundle.putString("value", paramObject);
      if (this.uds != null)
        this.uds.b(paramBoolean, "", this.udv);
      AppMethodBeat.o(91454);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.g.4
 * JD-Core Version:    0.6.2
 */