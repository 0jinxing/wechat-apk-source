package com.tencent.mm.plugin.appbrand.ui;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion;", "", "()V", "KEY_MODE_INT", "", "MODE_COLLECTION", "", "MODE_RECENTS", "startCollectionList", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "startRecentsList", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherFolderUI$a
{
  public static void o(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(134987);
    j.p(paramContext, "context");
    Intent localIntent = new Intent(paramContext, AppBrandLauncherFolderUI.class);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    if (paramIntent != null)
    {
      Bundle localBundle = paramIntent.getExtras();
      paramIntent = localBundle;
      if (localBundle != null);
    }
    else
    {
      paramIntent = Bundle.EMPTY;
    }
    localIntent.putExtras(paramIntent);
    localIntent.putExtra("KEY_MODE", 1);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(134987);
  }

  public static void p(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(134988);
    j.p(paramContext, "context");
    Intent localIntent = new Intent(paramContext, AppBrandLauncherFolderUI.class);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    if (paramIntent != null)
    {
      Bundle localBundle = paramIntent.getExtras();
      paramIntent = localBundle;
      if (localBundle != null);
    }
    else
    {
      paramIntent = Bundle.EMPTY;
    }
    localIntent.putExtras(paramIntent);
    localIntent.putExtra("KEY_MODE", 2);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(134988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.a
 * JD-Core Version:    0.6.2
 */