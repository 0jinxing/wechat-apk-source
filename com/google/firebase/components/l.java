package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class l
  implements m
{
  private static Bundle ap(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(10618);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null)
      {
        AppMethodBeat.o(10618);
        paramContext = localObject;
      }
      while (true)
      {
        return paramContext;
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, ComponentDiscoveryService.class);
        paramContext = localPackageManager.getServiceInfo(localComponentName, 128);
        if (paramContext == null)
        {
          AppMethodBeat.o(10618);
          paramContext = localObject;
        }
        else
        {
          paramContext = paramContext.metaData;
          AppMethodBeat.o(10618);
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(10618);
        paramContext = localObject;
      }
    }
  }

  public final List<String> ao(Context paramContext)
  {
    AppMethodBeat.i(10617);
    Bundle localBundle = ap(paramContext);
    if (localBundle == null)
    {
      paramContext = Collections.emptyList();
      AppMethodBeat.o(10617);
    }
    while (true)
    {
      return paramContext;
      paramContext = new ArrayList();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (("com.google.firebase.components.ComponentRegistrar".equals(localBundle.get(str))) && (str.startsWith("com.google.firebase.components:")))
          paramContext.add(str.substring(31));
      }
      AppMethodBeat.o(10617);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.l
 * JD-Core Version:    0.6.2
 */