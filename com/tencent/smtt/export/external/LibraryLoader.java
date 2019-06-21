package com.tencent.smtt.export.external;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;

public class LibraryLoader
{
  private static String[] sLibrarySearchPaths = null;

  public static String[] getLibrarySearchPaths(Context paramContext)
  {
    AppMethodBeat.i(63770);
    if (sLibrarySearchPaths != null)
    {
      paramContext = sLibrarySearchPaths;
      AppMethodBeat.o(63770);
    }
    while (true)
    {
      return paramContext;
      if (paramContext == null)
      {
        paramContext = new String[1];
        paramContext[0] = "/system/lib";
        AppMethodBeat.o(63770);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(getNativeLibraryDir(paramContext));
        localArrayList.add("/system/lib");
        paramContext = new String[localArrayList.size()];
        localArrayList.toArray(paramContext);
        sLibrarySearchPaths = paramContext;
        AppMethodBeat.o(63770);
      }
    }
  }

  public static String getNativeLibraryDir(Context paramContext)
  {
    AppMethodBeat.i(63771);
    int i = Build.VERSION.SDK_INT;
    if (i >= 9)
    {
      paramContext = paramContext.getApplicationInfo().nativeLibraryDir;
      AppMethodBeat.o(63771);
    }
    while (true)
    {
      return paramContext;
      if (i >= 4)
      {
        paramContext = paramContext.getApplicationInfo().dataDir + "/lib";
        AppMethodBeat.o(63771);
      }
      else
      {
        paramContext = "/data/data/" + paramContext.getPackageName() + "/lib";
        AppMethodBeat.o(63771);
      }
    }
  }

  public static void loadLibrary(Context paramContext, String paramString)
  {
    AppMethodBeat.i(63772);
    paramContext = getLibrarySearchPaths(paramContext);
    String str1 = System.mapLibraryName(paramString);
    int i = paramContext.length;
    int j = 0;
    String str2;
    if (j < i)
    {
      str2 = paramContext[j];
      str2 = str2 + "/" + str1;
      if (!new File(str2).exists());
    }
    while (true)
    {
      try
      {
        System.load(str2);
        AppMethodBeat.o(63772);
        return;
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(63772);
        continue;
      }
      j++;
      break;
      try
      {
        System.loadLibrary(paramString);
        AppMethodBeat.o(63772);
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(63772);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.LibraryLoader
 * JD-Core Version:    0.6.2
 */