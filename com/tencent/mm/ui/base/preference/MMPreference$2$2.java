package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreference$2$2
  implements EditPreference.a
{
  MMPreference$2$2(MMPreference.2 param2, EditPreference paramEditPreference, Preference paramPreference)
  {
  }

  public final void dAx()
  {
    AppMethodBeat.i(107210);
    MMPreference.c(this.yCC.yCA);
    if (this.yCD.yDf)
      MMPreference.b(this.yCC.yCA).edit().putString(this.iFO.mKey, this.yCD.value).commit();
    MMPreference.d(this.yCC.yCA).notifyDataSetChanged();
    AppMethodBeat.o(107210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference.2.2
 * JD-Core Version:    0.6.2
 */