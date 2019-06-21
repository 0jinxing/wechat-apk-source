package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$5
  implements AdapterView.OnItemClickListener
{
  c$5(c paramc)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(113599);
    paramView = null;
    paramAdapterView = paramView;
    if (paramInt >= 0)
    {
      paramAdapterView = paramView;
      if (paramInt < c.v(this.nQa).getCount())
        paramAdapterView = c.v(this.nQa).xG(paramInt);
    }
    c.b(this.nQa, paramAdapterView);
    c.a(this.nQa, paramAdapterView);
    AppMethodBeat.o(113599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.5
 * JD-Core Version:    0.6.2
 */