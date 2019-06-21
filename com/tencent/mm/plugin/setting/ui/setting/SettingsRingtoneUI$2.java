package com.tencent.mm.plugin.setting.ui.setting;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class SettingsRingtoneUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SettingsRingtoneUI$2(SettingsRingtoneUI paramSettingsRingtoneUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127425);
    SharedPreferences.Editor localEditor = this.qoF.getSharedPreferences(ah.doA(), 0).edit();
    paramMenuItem = f.evO;
    if (SettingsRingtoneUI.a(this.qoF) != 0)
    {
      Object localObject = SettingsRingtoneUI.a(this.qoF, SettingsRingtoneUI.a(this.qoF));
      ab.d("RingtonePickerActivity", "set ringtone to ".concat(String.valueOf(localObject)));
      if (localObject != null)
      {
        paramMenuItem = ((Uri)localObject).toString();
        localObject = SettingsRingtoneUI.a(this.qoF, (Uri)localObject);
        localEditor.putString("settings.ringtone.name", (String)localObject);
        ab.d("RingtonePickerActivity", "ringtone name: ".concat(String.valueOf(localObject)));
      }
    }
    while (true)
    {
      localEditor.commit();
      f.kA(paramMenuItem);
      this.qoF.finish();
      AppMethodBeat.o(127425);
      return true;
      paramMenuItem = f.evO;
      localEditor.putString("settings.ringtone.name", this.qoF.getString(2131303185));
      ab.d("RingtonePickerActivity", "set ringtone follow system");
      continue;
      paramMenuItem = f.evO;
      localEditor.putString("settings.ringtone.name", this.qoF.getString(2131303185));
      ab.d("RingtonePickerActivity", "set ringtone follow system");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI.2
 * JD-Core Version:    0.6.2
 */