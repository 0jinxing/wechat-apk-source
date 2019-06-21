package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkSourceUtil
{
  public static final String TAG = "WorkSourceUtil";
  private static final int zzaam;
  private static final Method zzaan;
  private static final Method zzaao;
  private static final Method zzaap;
  private static final Method zzaaq;
  private static final Method zzaar;
  private static final Method zzaas;
  private static final Method zzaat;

  static
  {
    AppMethodBeat.i(90297);
    zzaam = Process.myUid();
    zzaan = zzdf();
    zzaao = zzdg();
    zzaap = zzdh();
    zzaaq = zzdi();
    zzaar = zzdj();
    zzaas = zzdk();
    zzaat = zzdl();
    AppMethodBeat.o(90297);
  }

  public static void add(WorkSource paramWorkSource, int paramInt, String paramString)
  {
    AppMethodBeat.i(90282);
    String str;
    if (zzaao != null)
    {
      str = paramString;
      if (paramString == null)
        str = "";
    }
    while (true)
    {
      try
      {
        zzaao.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        AppMethodBeat.o(90282);
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
        AppMethodBeat.o(90282);
        continue;
      }
      if (zzaan != null)
        try
        {
          zzaan.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(90282);
        }
        catch (Exception paramWorkSource)
        {
          Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
        }
      else
        AppMethodBeat.o(90282);
    }
  }

  public static WorkSource fromPackage(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(90281);
    if ((paramContext == null) || (paramContext.getPackageManager() == null) || (paramString == null))
    {
      AppMethodBeat.o(90281);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramString, 0);
        if (paramContext == null)
        {
          paramContext = String.valueOf(paramString);
          if (paramContext.length() != 0)
          {
            "Could not get applicationInfo from package: ".concat(paramContext);
            AppMethodBeat.o(90281);
            paramContext = localObject;
          }
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
        {
          paramContext = String.valueOf(paramString);
          if (paramContext.length() != 0)
            "Could not find package: ".concat(paramContext);
          while (true)
          {
            AppMethodBeat.o(90281);
            paramContext = localObject;
            break;
            new String("Could not find package: ");
          }
          new String("Could not get applicationInfo from package: ");
        }
        paramContext = fromUidAndPackage(paramContext.uid, paramString);
        AppMethodBeat.o(90281);
      }
    }
  }

  public static WorkSource fromPackageAndModuleExperimentalPi(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(90283);
    if ((paramContext == null) || (paramContext.getPackageManager() == null) || (paramString2 == null) || (paramString1 == null))
      AppMethodBeat.o(90283);
    int i;
    for (paramContext = localObject; ; paramContext = localObject)
    {
      return paramContext;
      i = zzc(paramContext, paramString1);
      if (i >= 0)
        break;
      AppMethodBeat.o(90283);
    }
    paramContext = new WorkSource();
    if ((zzaas == null) || (zzaat == null))
      add(paramContext, i, paramString1);
    while (true)
    {
      AppMethodBeat.o(90283);
      break;
      try
      {
        localObject = zzaas.invoke(paramContext, new Object[0]);
        if (i != zzaam)
          zzaat.invoke(localObject, new Object[] { Integer.valueOf(i), paramString1 });
        zzaat.invoke(localObject, new Object[] { Integer.valueOf(zzaam), paramString2 });
      }
      catch (Exception paramString1)
      {
      }
    }
  }

  public static WorkSource fromUidAndPackage(int paramInt, String paramString)
  {
    AppMethodBeat.i(90280);
    WorkSource localWorkSource = new WorkSource();
    add(localWorkSource, paramInt, paramString);
    AppMethodBeat.o(90280);
    return localWorkSource;
  }

  public static int get(WorkSource paramWorkSource, int paramInt)
  {
    AppMethodBeat.i(90285);
    if (zzaaq != null);
    while (true)
    {
      try
      {
        paramInt = ((Integer)zzaaq.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) })).intValue();
        AppMethodBeat.o(90285);
        return paramInt;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
      AppMethodBeat.o(90285);
      paramInt = 0;
    }
  }

  public static String getName(WorkSource paramWorkSource, int paramInt)
  {
    AppMethodBeat.i(90286);
    if (zzaar != null);
    while (true)
    {
      try
      {
        paramWorkSource = (String)zzaar.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(90286);
        return paramWorkSource;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
      paramWorkSource = null;
      AppMethodBeat.o(90286);
    }
  }

  public static List<String> getNames(WorkSource paramWorkSource)
  {
    int i = 0;
    AppMethodBeat.i(90287);
    int j;
    if (paramWorkSource == null)
    {
      j = 0;
      if (j != 0)
        break label36;
      paramWorkSource = Collections.emptyList();
      AppMethodBeat.o(90287);
    }
    while (true)
    {
      return paramWorkSource;
      j = size(paramWorkSource);
      break;
      label36: ArrayList localArrayList = new ArrayList();
      while (i < j)
      {
        String str = getName(paramWorkSource, i);
        if (!Strings.isEmptyOrWhitespace(str))
          localArrayList.add(str);
        i++;
      }
      AppMethodBeat.o(90287);
      paramWorkSource = localArrayList;
    }
  }

  public static boolean hasWorkSourcePermission(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(90288);
    if (paramContext == null)
      AppMethodBeat.o(90288);
    while (true)
    {
      return bool;
      if (paramContext.getPackageManager() == null)
      {
        AppMethodBeat.o(90288);
      }
      else if (Wrappers.packageManager(paramContext).checkPermission("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0)
      {
        bool = true;
        AppMethodBeat.o(90288);
      }
      else
      {
        AppMethodBeat.o(90288);
      }
    }
  }

  public static int size(WorkSource paramWorkSource)
  {
    AppMethodBeat.i(90284);
    if (zzaap != null);
    while (true)
    {
      try
      {
        i = ((Integer)zzaap.invoke(paramWorkSource, new Object[0])).intValue();
        AppMethodBeat.o(90284);
        return i;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
      AppMethodBeat.o(90284);
      int i = 0;
    }
  }

  private static int zzc(Context paramContext, String paramString)
  {
    int i = -1;
    AppMethodBeat.i(90289);
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramString, 0);
      if (paramContext == null)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0)
        {
          "Could not get applicationInfo from package: ".concat(paramContext);
          AppMethodBeat.o(90289);
          return i;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0)
          "Could not find package: ".concat(paramContext);
        while (true)
        {
          AppMethodBeat.o(90289);
          break;
          new String("Could not find package: ");
        }
        new String("Could not get applicationInfo from package: ");
        continue;
        i = paramContext.uid;
        AppMethodBeat.o(90289);
      }
    }
  }

  private static Method zzdf()
  {
    AppMethodBeat.i(90290);
    Object localObject = null;
    try
    {
      Method localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
      localObject = localMethod;
      label27: AppMethodBeat.o(90290);
      return localObject;
    }
    catch (Exception localException)
    {
      break label27;
    }
  }

  private static Method zzdg()
  {
    AppMethodBeat.i(90291);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (PlatformVersion.isAtLeastJellyBeanMR2());
    try
    {
      localObject2 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
      AppMethodBeat.o(90291);
      return localObject2;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject3 = localObject1;
    }
  }

  private static Method zzdh()
  {
    AppMethodBeat.i(90292);
    Object localObject = null;
    try
    {
      Method localMethod = WorkSource.class.getMethod("size", new Class[0]);
      localObject = localMethod;
      label21: AppMethodBeat.o(90292);
      return localObject;
    }
    catch (Exception localException)
    {
      break label21;
    }
  }

  private static Method zzdi()
  {
    AppMethodBeat.i(90293);
    Object localObject = null;
    try
    {
      Method localMethod = WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
      localObject = localMethod;
      label27: AppMethodBeat.o(90293);
      return localObject;
    }
    catch (Exception localException)
    {
      break label27;
    }
  }

  private static Method zzdj()
  {
    AppMethodBeat.i(90294);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (PlatformVersion.isAtLeastJellyBeanMR2());
    try
    {
      localObject2 = WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
      AppMethodBeat.o(90294);
      return localObject2;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject3 = localObject1;
    }
  }

  private static final Method zzdk()
  {
    AppMethodBeat.i(90295);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (PlatformVersion.isAtLeastP());
    try
    {
      localObject2 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
      AppMethodBeat.o(90295);
      return localObject2;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject3 = localObject1;
    }
  }

  @SuppressLint({"PrivateApi"})
  private static final Method zzdl()
  {
    AppMethodBeat.i(90296);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (PlatformVersion.isAtLeastP());
    try
    {
      localObject2 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { Integer.TYPE, String.class });
      AppMethodBeat.o(90296);
      return localObject2;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject3 = localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.WorkSourceUtil
 * JD-Core Version:    0.6.2
 */