package com.tencent.mm.plugin.appbrand.s.c;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class b$1 extends a.b
{
  b$1(b paramb)
  {
  }

  protected final Intent aOg()
  {
    AppMethodBeat.i(133601);
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
    localIntent.putExtra("extra_pkgname", ah.getPackageName());
    AppMethodBeat.o(133601);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.c.b.1
 * JD-Core Version:    0.6.2
 */