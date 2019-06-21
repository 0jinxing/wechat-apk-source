package com.tencent.tinker.loader;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemClassLoaderAdder
{
  private static int ACw = 0;

  @SuppressLint({"NewApi"})
  public static void a(Application paramApplication, PathClassLoader paramPathClassLoader, File paramFile, List<File> paramList)
  {
    new StringBuilder("installDexes dexOptDir: ").append(paramFile.getAbsolutePath()).append(", dex size:").append(paramList.size());
    if (!paramList.isEmpty())
    {
      List localList = fD(paramList);
      paramList = paramPathClassLoader;
      if (Build.VERSION.SDK_INT >= 24)
      {
        paramList = paramPathClassLoader;
        if (!fC(localList))
          paramList = AndroidNClassLoader.a(paramPathClassLoader, paramApplication);
      }
      if (Build.VERSION.SDK_INT >= 23)
        V23.d(paramList, localList, paramFile);
      while (true)
      {
        ACw = localList.size();
        new StringBuilder("after loaded classloader: ").append(paramList).append(", dex size:").append(ACw);
        if (((Boolean)ShareReflectUtil.d(Class.forName("com.tencent.tinker.loader.TinkerTestDexLoad", true, paramList), "isPatch").get(null)).booleanValue())
          break;
        a(paramList);
        throw new TinkerRuntimeException("checkDexInstall failed");
        if (Build.VERSION.SDK_INT >= 19)
          V19.c(paramList, localList, paramFile);
        else if (Build.VERSION.SDK_INT >= 14)
          V14.b(paramList, localList, paramFile);
        else
          V4.e(paramList, localList, paramFile);
      }
    }
  }

  public static void a(ClassLoader paramClassLoader)
  {
    if (ACw <= 0);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 14)
      {
        ShareReflectUtil.a(ShareReflectUtil.b(paramClassLoader, "pathList").get(paramClassLoader), "dexElements", ACw);
      }
      else
      {
        ShareReflectUtil.a(paramClassLoader, "mPaths", ACw);
        ShareReflectUtil.a(paramClassLoader, "mFiles", ACw);
        ShareReflectUtil.a(paramClassLoader, "mZips", ACw);
        try
        {
          ShareReflectUtil.a(paramClassLoader, "mDexs", ACw);
        }
        catch (Exception paramClassLoader)
        {
        }
      }
    }
  }

  private static boolean fC(List<File> paramList)
  {
    if (!paramList.isEmpty())
    {
      Iterator localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        paramList = (File)localIterator.next();
      }
      while ((paramList == null) || (!paramList.getName().startsWith("changed_classes")));
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static List<File> fD(List<File> paramList)
  {
    paramList = new ArrayList(paramList);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = ((File)localIterator.next()).getName();
      localHashMap.put(str, Boolean.valueOf(ShareConstants.ADM.matcher(str).matches()));
    }
    Collections.sort(paramList, new Comparator()
    {
    });
    return paramList;
  }

  static final class V14
  {
  }

  static final class V19
  {
    private static Object[] a(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      try
      {
        Method localMethod1 = ShareReflectUtil.b(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        return (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        try
        {
          Method localMethod2 = ShareReflectUtil.b(paramObject, "makeDexElements", new Class[] { List.class, File.class, List.class });
        }
        catch (NoSuchMethodException paramObject)
        {
        }
      }
      throw paramObject;
    }
  }

  static final class V23
  {
    private static Object[] c(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      try
      {
        Method localMethod1 = ShareReflectUtil.b(paramObject, "makePathElements", new Class[] { List.class, File.class, List.class });
        paramObject = (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
        return paramObject;
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        try
        {
          Method localMethod2 = ShareReflectUtil.b(paramObject, "makePathElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          try
          {
            paramObject = SystemClassLoaderAdder.V19.b(paramObject, paramArrayList, paramFile, paramArrayList1);
          }
          catch (NoSuchMethodException paramObject)
          {
          }
        }
      }
      throw paramObject;
    }
  }

  static final class V4
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.SystemClassLoaderAdder
 * JD-Core Version:    0.6.2
 */