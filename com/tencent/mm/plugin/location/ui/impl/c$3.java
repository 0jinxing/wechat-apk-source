package com.tencent.mm.plugin.location.ui.impl;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.tools.ActionBarSearchView.b;

final class c$3
  implements ActionBarSearchView.b
{
  c$3(c paramc)
  {
  }

  public final void Qa(String paramString)
  {
    AppMethodBeat.i(113596);
    ab.d("MicroMsg.MMPoiMapUI", "searchText: %s", new Object[] { paramString });
    c.a(this.nQa, paramString);
    c.w(this.nQa).dzO();
    c.y(this.nQa).setVisibility(8);
    if (bo.isNullOrNil(paramString))
    {
      c.v(this.nQa).clean();
      c.v(this.nQa).notifyDataSetChanged();
      AppMethodBeat.o(113596);
    }
    while (true)
    {
      return;
      c.z(this.nQa);
      AppMethodBeat.o(113596);
    }
  }

  public final void apq()
  {
    AppMethodBeat.i(113597);
    ab.d("MicroMsg.MMPoiMapUI", "clear btn click");
    c.v(this.nQa).clean();
    c.v(this.nQa).notifyDataSetChanged();
    AppMethodBeat.o(113597);
  }

  public final void bKt()
  {
  }

  public final void bKu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.3
 * JD-Core Version:    0.6.2
 */