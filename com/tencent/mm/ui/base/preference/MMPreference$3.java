package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMPreference$3
  implements AdapterView.OnItemLongClickListener
{
  MMPreference$3(MMPreference paramMMPreference)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107212);
    if (paramInt < MMPreference.e(this.yCA).getHeaderViewsCount())
      AppMethodBeat.o(107212);
    while (true)
    {
      return false;
      paramInt -= MMPreference.e(this.yCA).getHeaderViewsCount();
      if (paramInt >= MMPreference.d(this.yCA).getCount())
      {
        ab.e("MicroMsg.mmui.MMPreference", "itemlongclick, outofindex, %d, %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(MMPreference.d(this.yCA).getCount()) });
        AppMethodBeat.o(107212);
      }
      else
      {
        MMPreference.d(this.yCA).getItem(paramInt);
        MMPreference.d(this.yCA);
        MMPreference.e(this.yCA);
        AppMethodBeat.o(107212);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference.3
 * JD-Core Version:    0.6.2
 */