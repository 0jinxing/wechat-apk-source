package com.tencent.mm.plugin.auto.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  c jqz;

  public a()
  {
    AppMethodBeat.i(17104);
    this.jqz = new a.1(this);
    AppMethodBeat.o(17104);
  }

  static boolean aSl()
  {
    AppMethodBeat.i(17105);
    PackageManager localPackageManager = ah.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.projection.gearhead", 1);
      bool = true;
      ab.i("MicroMsg.auto.AutoLogic", "isInstallAutoApp %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(17105);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.auto.a.a
 * JD-Core Version:    0.6.2
 */