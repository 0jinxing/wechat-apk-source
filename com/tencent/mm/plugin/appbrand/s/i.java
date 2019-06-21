package com.tencent.mm.plugin.appbrand.s;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.service.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI;

public final class i
  implements b
{
  public final void F(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(133578);
    int i = -1;
    Intent localIntent;
    if (1 == paramInt)
    {
      i = 14;
      localIntent = new Intent(paramContext, AppBrandLauncherFolderUI.class);
      localIntent.putExtra("extra_use_system_default_enter_exit_anim", true);
      localIntent.putExtra("extra_enter_scene", i);
      localIntent.putExtra("KEY_MODE", 1);
      if (!(paramContext instanceof Activity))
        break label109;
    }
    label109: for (paramInt = 0; ; paramInt = 268435456)
    {
      localIntent.addFlags(paramInt);
      localIntent.addFlags(536870912);
      localIntent.addFlags(134217728);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(133578);
      return;
      if (2 != paramInt)
        break;
      i = 15;
      break;
    }
  }

  public final void cX(Context paramContext)
  {
    AppMethodBeat.i(133579);
    Intent localIntent = new Intent(paramContext, AppBrandLauncherFolderUI.class);
    localIntent.putExtra("extra_use_system_default_enter_exit_anim", true);
    localIntent.putExtra("extra_enter_scene", 4);
    localIntent.putExtra("KEY_MODE", 2);
    if ((paramContext instanceof Activity));
    for (int i = 0; ; i = 268435456)
    {
      localIntent.addFlags(i);
      localIntent.addFlags(536870912);
      localIntent.addFlags(134217728);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(133579);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.i
 * JD-Core Version:    0.6.2
 */