package com.tencent.mm.plugin.appbrand.s.c;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3 extends a.b
{
  b$3(b paramb)
  {
  }

  protected final Intent aOg()
  {
    AppMethodBeat.i(133603);
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.bbk.launcher2", "com.bbk.launcher2.installshortcut.PurviewActivity"));
    AppMethodBeat.o(133603);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.c.b.3
 * JD-Core Version:    0.6.2
 */