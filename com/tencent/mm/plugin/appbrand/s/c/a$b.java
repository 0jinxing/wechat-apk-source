package com.tencent.mm.plugin.appbrand.s.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Collection;
import java.util.List;

abstract class a$b
{
  public final boolean aOf()
  {
    List localList = ah.getContext().getPackageManager().queryIntentActivities(aOg(), 0);
    int i;
    if ((localList == null) || (localList.isEmpty()))
    {
      i = 1;
      if ((i != 0) || (!((ResolveInfo)localList.get(0)).activityInfo.exported))
        break label62;
    }
    label62: for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
    }
  }

  protected abstract Intent aOg();

  public final void dd(Context paramContext)
  {
    Intent localIntent = aOg();
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.c.a.b
 * JD-Core Version:    0.6.2
 */