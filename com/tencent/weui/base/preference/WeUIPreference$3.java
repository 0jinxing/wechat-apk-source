package com.tencent.weui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class WeUIPreference$3
  implements AdapterView.OnItemLongClickListener
{
  WeUIPreference$3(WeUIPreference paramWeUIPreference)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(113262);
    if (paramInt < WeUIPreference.e(this.ALv).getHeaderViewsCount())
      AppMethodBeat.o(113262);
    while (true)
    {
      return false;
      paramInt -= WeUIPreference.e(this.ALv).getHeaderViewsCount();
      if (paramInt >= WeUIPreference.d(this.ALv).getCount())
      {
        ai.e("MicroMsg.mmui.WeUIPreference", "itemlongclick, outofindex, %d, %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(WeUIPreference.d(this.ALv).getCount()) });
        AppMethodBeat.o(113262);
      }
      else
      {
        WeUIPreference.d(this.ALv).getItem(paramInt);
        WeUIPreference.d(this.ALv);
        WeUIPreference.e(this.ALv);
        AppMethodBeat.o(113262);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.WeUIPreference.3
 * JD-Core Version:    0.6.2
 */