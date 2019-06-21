package com.tencent.weui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WeUIPreference$1
  implements Preference.OnPreferenceChangeListener
{
  WeUIPreference$1(WeUIPreference paramWeUIPreference)
  {
  }

  public final boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(113260);
    if ((!WeUIPreference.a(this.ALv)) && (paramPreference.isEnabled()) && (paramPreference.isSelectable()))
    {
      WeUIPreference.a(this.ALv, true);
      if (!(paramPreference instanceof CheckBoxPreference))
        break label170;
      paramObject = (CheckBoxPreference)paramPreference;
      paramObject.uOT = paramObject.isChecked();
      if (paramObject.isPersistent())
        WeUIPreference.b(this.ALv).edit().putBoolean(paramPreference.getKey(), paramObject.isChecked()).commit();
      WeUIPreference.c(this.ALv);
    }
    label170: for (int i = 1; ; i = 0)
    {
      if (paramPreference.getKey() != null)
        WeUIPreference.d(this.ALv);
      if (i != 0)
        WeUIPreference.d(this.ALv).notifyDataSetChanged();
      WeUIPreference.a(this.ALv, false);
      if (i != 0)
        AppMethodBeat.o(113260);
      while (true)
      {
        return bool;
        AppMethodBeat.o(113260);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.WeUIPreference.1
 * JD-Core Version:    0.6.2
 */