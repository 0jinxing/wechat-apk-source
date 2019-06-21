package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreferenceFragment$2$2
  implements EditPreference.a
{
  MMPreferenceFragment$2$2(MMPreferenceFragment.2 param2, EditPreference paramEditPreference, Preference paramPreference)
  {
  }

  public final void dAx()
  {
    AppMethodBeat.i(107239);
    MMPreferenceFragment.c(this.yCS.yCR);
    if (this.yCD.yDf)
      MMPreferenceFragment.b(this.yCS.yCR).edit().putString(this.iFO.mKey, this.yCD.value).commit();
    MMPreferenceFragment.d(this.yCS.yCR).notifyDataSetChanged();
    AppMethodBeat.o(107239);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreferenceFragment.2.2
 * JD-Core Version:    0.6.2
 */