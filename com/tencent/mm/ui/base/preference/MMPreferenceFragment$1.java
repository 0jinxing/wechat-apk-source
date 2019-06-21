package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreferenceFragment$1
  implements Preference.a
{
  MMPreferenceFragment$1(MMPreferenceFragment paramMMPreferenceFragment)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(107237);
    if ((!MMPreferenceFragment.a(this.yCR)) && (paramPreference.isEnabled()) && (paramPreference.yDd))
    {
      MMPreferenceFragment.a(this.yCR, true);
      if (!(paramPreference instanceof CheckBoxPreference))
        break label178;
      paramObject = (CheckBoxPreference)paramPreference;
      paramObject.uOT = paramObject.isChecked();
      if (paramObject.yDf)
        MMPreferenceFragment.b(this.yCR).edit().putBoolean(paramPreference.mKey, paramObject.isChecked()).commit();
      MMPreferenceFragment.c(this.yCR);
    }
    label178: for (int i = 1; ; i = 0)
    {
      if (paramPreference.mKey != null)
        this.yCR.a(MMPreferenceFragment.d(this.yCR), paramPreference);
      if (i != 0)
        MMPreferenceFragment.d(this.yCR).notifyDataSetChanged();
      MMPreferenceFragment.a(this.yCR, false);
      if (i != 0)
        AppMethodBeat.o(107237);
      while (true)
      {
        return bool;
        AppMethodBeat.o(107237);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreferenceFragment.1
 * JD-Core Version:    0.6.2
 */