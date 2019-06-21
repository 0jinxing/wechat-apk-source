package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuGridViewWithHeaderAndFooter$c
  implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener
{
  private LuGridViewWithHeaderAndFooter$c(LuGridViewWithHeaderAndFooter paramLuGridViewWithHeaderAndFooter)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(116869);
    if (LuGridViewWithHeaderAndFooter.a(this.ojb) != null)
    {
      paramInt -= this.ojb.getHeaderViewCount() * LuGridViewWithHeaderAndFooter.b(this.ojb);
      if (paramInt >= 0)
        LuGridViewWithHeaderAndFooter.a(this.ojb).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    }
    AppMethodBeat.o(116869);
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(116870);
    if (LuGridViewWithHeaderAndFooter.c(this.ojb) != null)
    {
      paramInt -= this.ojb.getHeaderViewCount() * LuGridViewWithHeaderAndFooter.b(this.ojb);
      if (paramInt >= 0)
        LuGridViewWithHeaderAndFooter.c(this.ojb).onItemLongClick(paramAdapterView, paramView, paramInt, paramLong);
    }
    AppMethodBeat.o(116870);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuGridViewWithHeaderAndFooter.c
 * JD-Core Version:    0.6.2
 */