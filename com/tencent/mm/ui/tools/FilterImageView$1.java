package com.tencent.mm.ui.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FilterImageView$1
  implements AdapterView.OnItemClickListener
{
  FilterImageView$1(FilterImageView paramFilterImageView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107627);
    paramAdapterView = FilterImageView.a(this.zBZ);
    paramAdapterView.llU = paramInt;
    paramAdapterView.notifyDataSetChanged();
    try
    {
      FilterImageView.a(this.zBZ, FilterImageView.zBY[paramInt].zCj);
      FilterImageView.a(this.zBZ, FilterImageView.zBY[paramInt].zCg, FilterImageView.zBY[paramInt].zCh, FilterImageView.zBY[paramInt].zCi);
      AppMethodBeat.o(107627);
      return;
    }
    catch (Exception paramAdapterView)
    {
      while (true)
      {
        ab.e("MicroMsg.FilterView", paramAdapterView.toString());
        ab.printErrStackTrace("MicroMsg.FilterView", paramAdapterView, "", new Object[0]);
        AppMethodBeat.o(107627);
      }
    }
    catch (OutOfMemoryError paramAdapterView)
    {
      while (true)
      {
        ab.e("MicroMsg.FilterView", paramAdapterView.toString());
        ab.printErrStackTrace("MicroMsg.FilterView", paramAdapterView, "", new Object[0]);
        AppMethodBeat.o(107627);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.FilterImageView.1
 * JD-Core Version:    0.6.2
 */