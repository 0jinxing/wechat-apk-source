package com.tencent.mm.plugin.appbrand.s.c;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2 extends a.b
{
  b$2(b paramb)
  {
  }

  protected final Intent aOg()
  {
    AppMethodBeat.i(133602);
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
    localIntent.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
    AppMethodBeat.o(133602);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.c.b.2
 * JD-Core Version:    0.6.2
 */