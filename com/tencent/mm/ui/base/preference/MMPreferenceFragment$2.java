package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreferenceFragment$2
  implements AdapterView.OnItemClickListener
{
  MMPreferenceFragment$2(MMPreferenceFragment paramMMPreferenceFragment)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107240);
    if (paramInt < MMPreferenceFragment.e(this.yCR).getHeaderViewsCount())
      AppMethodBeat.o(107240);
    while (true)
    {
      return;
      int i = MMPreferenceFragment.e(this.yCR).getHeaderViewsCount();
      paramAdapterView = (Preference)MMPreferenceFragment.d(this.yCR).getItem(paramInt - i);
      if ((paramAdapterView.isEnabled()) && (paramAdapterView.yDd))
      {
        if ((paramAdapterView instanceof CheckBoxPreference))
        {
          AppMethodBeat.o(107240);
        }
        else
        {
          if ((paramAdapterView instanceof DialogPreference))
          {
            paramView = (DialogPreference)paramAdapterView;
            paramView.showDialog();
            paramView.yBy = new MMPreferenceFragment.2.1(this, paramView, paramAdapterView);
          }
          if ((paramAdapterView instanceof EditPreference))
          {
            paramView = (EditPreference)paramAdapterView;
            paramView.showDialog();
            paramView.yBA = new MMPreferenceFragment.2.2(this, paramView, paramAdapterView);
          }
          if (paramAdapterView.mKey != null)
            this.yCR.a(MMPreferenceFragment.d(this.yCR), paramAdapterView);
        }
      }
      else
        AppMethodBeat.o(107240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreferenceFragment.2
 * JD-Core Version:    0.6.2
 */