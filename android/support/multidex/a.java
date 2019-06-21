package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private static final String wW = "code_cache" + File.separator + "secondary-dexes";
  private static final Set<String> wX = new HashSet();
  private static final boolean wY = F(System.getProperty("java.vm.version"));

  private static boolean F(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    Object localObject;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool2 = bool1;
      if (!((Matcher)localObject).matches());
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool2 = bool1;
        if (i == 2)
        {
          bool2 = bool1;
          if (j <= 0);
        }
      }
      else
      {
        bool2 = true;
      }
      localObject = new StringBuilder("VM with version ").append(paramString);
      if (bool2);
      for (paramString = " has multidex support"; ; paramString = " does not have multidex support")
      {
        ((StringBuilder)localObject).append(paramString);
        return bool2;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        bool2 = bool1;
    }
  }

  public static void H(Context paramContext)
  {
    if (wY);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 4)
        throw new RuntimeException("Multi dex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
      ApplicationInfo localApplicationInfo;
      Object localObject;
      try
      {
        localApplicationInfo = I(paramContext);
        if (localApplicationInfo == null)
          continue;
        synchronized (wX)
        {
          localObject = localApplicationInfo.sourceDir;
          if (!wX.contains(localObject));
        }
      }
      catch (Exception paramContext)
      {
        throw new RuntimeException("Multi dex installation failed (" + paramContext.getMessage() + ").");
      }
      wX.add(localObject);
      if (Build.VERSION.SDK_INT > 20)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("MultiDex is not guaranteed to work in SDK version ");
        ((StringBuilder)localObject).append(Build.VERSION.SDK_INT).append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
      }
      try
      {
        localObject = paramContext.getClassLoader();
        if (localObject != null)
          break label194;
      }
      catch (RuntimeException paramContext)
      {
      }
      continue;
      try
      {
        label194: J(paramContext);
        label198: File localFile = new java/io/File;
        localFile.<init>(localApplicationInfo.dataDir, wW);
        List localList = b.a(paramContext, localApplicationInfo, localFile, false);
        if (g(localList))
          a((ClassLoader)localObject, localFile, localList);
        while (true)
        {
          break;
          paramContext = b.a(paramContext, localApplicationInfo, localFile, true);
          if (!g(paramContext))
            break label272;
          a((ClassLoader)localObject, localFile, paramContext);
        }
        label272: paramContext = new java/lang/RuntimeException;
        paramContext.<init>("Zip files were not valid.");
        throw paramContext;
      }
      catch (Throwable localThrowable)
      {
        break label198;
      }
    }
  }

  private static ApplicationInfo I(Context paramContext)
  {
    Object localObject = null;
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      String str = paramContext.getPackageName();
      paramContext = localObject;
      if (localPackageManager != null)
        if (str != null)
          break label26;
      label26: for (paramContext = localObject; ; paramContext = localPackageManager.getApplicationInfo(str, 128))
        return paramContext;
    }
    catch (RuntimeException paramContext)
    {
      while (true)
        paramContext = localObject;
    }
  }

  private static void J(Context paramContext)
  {
    paramContext = new File(paramContext.getFilesDir(), "secondary-dexes");
    File[] arrayOfFile;
    if (paramContext.isDirectory())
    {
      new StringBuilder("Clearing old secondary dex dir (").append(paramContext.getPath()).append(").");
      arrayOfFile = paramContext.listFiles();
      if (arrayOfFile != null)
        break label75;
      new StringBuilder("Failed to list secondary dex dir content (").append(paramContext.getPath()).append(").");
    }
    while (true)
    {
      return;
      label75: int i = arrayOfFile.length;
      int j = 0;
      if (j < i)
      {
        File localFile = arrayOfFile[j];
        new StringBuilder("Trying to delete old file ").append(localFile.getPath()).append(" of size ").append(localFile.length());
        if (!localFile.delete())
          new StringBuilder("Failed to delete old file ").append(localFile.getPath());
        while (true)
        {
          j++;
          break;
          new StringBuilder("Deleted old file ").append(localFile.getPath());
        }
      }
      if (!paramContext.delete())
        new StringBuilder("Failed to delete secondary dex dir ").append(paramContext.getPath());
      else
        new StringBuilder("Deleted old secondary dex dir ").append(paramContext.getPath());
    }
  }

  private static void a(ClassLoader paramClassLoader, File paramFile, List<File> paramList)
  {
    if (!paramList.isEmpty())
    {
      if (Build.VERSION.SDK_INT < 19)
        break label24;
      a.b.a(paramClassLoader, paramList, paramFile);
    }
    while (true)
    {
      return;
      label24: if (Build.VERSION.SDK_INT >= 14)
        a.a.a(paramClassLoader, paramList, paramFile);
      else
        a.c.a(paramClassLoader, paramList);
    }
  }

  private static Field b(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible())
          localField.setAccessible(true);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
  }

  private static Method b(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramArrayOfClass);
        if (!localMethod.isAccessible())
          localMethod.setAccessible(true);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramArrayOfClass) + " not found in " + paramObject.getClass());
  }

  private static boolean g(List<File> paramList)
  {
    paramList = paramList.iterator();
    do
      if (!paramList.hasNext())
        break;
    while (b.f((File)paramList.next()));
    for (boolean bool = false; ; bool = true)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.multidex.a
 * JD-Core Version:    0.6.2
 */