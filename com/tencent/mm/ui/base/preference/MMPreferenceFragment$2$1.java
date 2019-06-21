package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreferenceFragment$2$1
  implements DialogPreference.a
{
  MMPreferenceFragment$2$1(MMPreferenceFragment.2 param2, DialogPreference paramDialogPreference, Preference paramPreference)
  {
  }

  public final void dAx()
  {
    AppMethodBeat.i(107238);
    MMPreferenceFragment.c(this.yCS.yCR);
    if (this.yCB.yDf)
      MMPreferenceFragment.b(this.yCS.yCR).edit().putString(this.iFO.mKey, this.yCB.getValue()).commit();
    MMPreferenceFragment.d(this.yCS.yCR).notifyDataSetChanged();
    AppMethodBeat.o(107238);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreferenceFragment.2.1
 * JD-Core Version:    0.6.2
 */