package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreferenceFragment$3
  implements AdapterView.OnItemLongClickListener
{
  MMPreferenceFragment$3(MMPreferenceFragment paramMMPreferenceFragment)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107241);
    boolean bool;
    if (paramInt < MMPreferenceFragment.e(this.yCR).getHeaderViewsCount())
    {
      bool = false;
      AppMethodBeat.o(107241);
    }
    while (true)
    {
      return bool;
      int i = MMPreferenceFragment.e(this.yCR).getHeaderViewsCount();
      paramAdapterView = (Preference)MMPreferenceFragment.d(this.yCR).getItem(paramInt - i);
      bool = this.yCR.a(MMPreferenceFragment.d(this.yCR), paramAdapterView, MMPreferenceFragment.e(this.yCR));
      AppMethodBeat.o(107241);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreferenceFragment.3
 * JD-Core Version:    0.6.2
 */