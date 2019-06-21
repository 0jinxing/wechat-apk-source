package com.tencent.tinker.lib.a;

import android.app.Application;
import android.os.Build.VERSION;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.e.b;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static void a(ClassLoader paramClassLoader, File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists()))
    {
      com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", new Object[] { paramFile });
      return;
    }
    if (((Build.VERSION.SDK_INT == 25) && (Build.VERSION.PREVIEW_SDK_INT != 0)) || (Build.VERSION.SDK_INT > 25));
    label351: label375: 
    while (true)
    {
      while (true)
      {
        try
        {
          Object localObject1 = ShareReflectUtil.b(paramClassLoader, "pathList").get(paramClassLoader);
          Object localObject2 = (List)ShareReflectUtil.b(localObject1, "nativeLibraryDirectories").get(localObject1);
          if (localObject2 != null)
            break label375;
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>(2);
          Object localObject3 = ((List)localObject2).iterator();
          if (((Iterator)localObject3).hasNext())
          {
            if (!paramFile.equals((File)((Iterator)localObject3).next()))
              continue;
            ((Iterator)localObject3).remove();
          }
          ((List)localObject2).add(0, paramFile);
          Object localObject4 = (List)ShareReflectUtil.b(localObject1, "systemNativeLibraryDirectories").get(localObject1);
          localObject3 = localObject4;
          if (localObject4 == null)
          {
            localObject3 = new java/util/ArrayList;
            ((ArrayList)localObject3).<init>(2);
          }
          localObject4 = new java/util/ArrayList;
          ((ArrayList)localObject4).<init>(((List)localObject2).size() + ((List)localObject3).size() + 1);
          ((List)localObject4).addAll((Collection)localObject2);
          ((List)localObject4).addAll((Collection)localObject3);
          localObject2 = (Object[])ShareReflectUtil.b(localObject1, "makePathElements", new Class[] { List.class }).invoke(localObject1, new Object[] { localObject4 });
          ShareReflectUtil.b(localObject1, "nativeLibraryPathElements").set(localObject1, localObject2);
        }
        catch (Throwable localThrowable1)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), localThrowable1.getMessage() });
          b.d(paramClassLoader, paramFile);
        }
        break;
        if (Build.VERSION.SDK_INT < 23)
          break label351;
        try
        {
          b.d(paramClassLoader, paramFile);
        }
        catch (Throwable localThrowable2)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), localThrowable2.getMessage() });
          a.c(paramClassLoader, paramFile);
        }
      }
      break;
      if (Build.VERSION.SDK_INT >= 14)
      {
        a.c(paramClassLoader, paramFile);
        break;
      }
      c.b(paramClassLoader, paramFile);
      break;
    }
  }

  public static boolean a(ApplicationLike paramApplicationLike, String paramString)
  {
    boolean bool = false;
    Object localObject = b.d(paramApplicationLike);
    if (ShareTinkerInternals.isNullOrNil((String)localObject))
      com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "failed to get current patch version.", new Object[0]);
    while (true)
    {
      return bool;
      File localFile = SharePatchFileUtil.jh(paramApplicationLike.getApplication());
      if (localFile == null)
      {
        com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "failed to get current patch directory.", new Object[0]);
      }
      else
      {
        localObject = new File(localFile.getAbsolutePath() + "/" + SharePatchFileUtil.auq((String)localObject));
        paramString = new File(((File)localObject).getAbsolutePath() + "/lib/lib/" + paramString);
        if (!paramString.exists())
        {
          com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", new Object[] { paramString });
        }
        else
        {
          paramApplicationLike = paramApplicationLike.getApplication().getClassLoader();
          if (paramApplicationLike == null)
          {
            com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", "classloader is null", new Object[0]);
          }
          else
          {
            com.tencent.tinker.lib.util.a.i("Tinker.LoadLibrary", "before hack classloader:" + paramApplicationLike.toString(), new Object[0]);
            try
            {
              localObject = a.class.getDeclaredMethod("a", new Class[] { ClassLoader.class, File.class });
              ((Method)localObject).setAccessible(true);
              ((Method)localObject).invoke(null, new Object[] { paramApplicationLike, paramString });
              com.tencent.tinker.lib.util.a.i("Tinker.LoadLibrary", "after hack classloader:" + paramApplicationLike.toString(), new Object[0]);
              bool = true;
            }
            catch (Throwable localThrowable)
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("installNativeLibraryPath fail:");
              com.tencent.tinker.lib.util.a.e("Tinker.LoadLibrary", paramString + ", thr: " + localThrowable, new Object[0]);
              com.tencent.tinker.lib.util.a.i("Tinker.LoadLibrary", "after hack classloader:" + paramApplicationLike.toString(), new Object[0]);
            }
            finally
            {
              com.tencent.tinker.lib.util.a.i("Tinker.LoadLibrary", "after hack classloader:" + paramApplicationLike.toString(), new Object[0]);
            }
          }
        }
      }
    }
    throw paramString;
  }

  static final class a
  {
    private static void b(ClassLoader paramClassLoader, File paramFile)
    {
      Object localObject = ShareReflectUtil.b(paramClassLoader, "pathList").get(paramClassLoader);
      Field localField = ShareReflectUtil.b(localObject, "nativeLibraryDirectories");
      File[] arrayOfFile = (File[])localField.get(localObject);
      paramClassLoader = new ArrayList(arrayOfFile.length + 1);
      paramClassLoader.add(paramFile);
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile = arrayOfFile[j];
        if (!paramFile.equals(localFile))
          paramClassLoader.add(localFile);
      }
      localField.set(localObject, paramClassLoader.toArray(new File[0]));
    }
  }

  static final class b
  {
    private static void b(ClassLoader paramClassLoader, File paramFile)
    {
      Object localObject1 = ShareReflectUtil.b(paramClassLoader, "pathList").get(paramClassLoader);
      paramClassLoader = (List)ShareReflectUtil.b(localObject1, "nativeLibraryDirectories").get(localObject1);
      if (paramClassLoader == null)
        paramClassLoader = new ArrayList(2);
      while (true)
      {
        Object localObject2 = paramClassLoader.iterator();
        while (((Iterator)localObject2).hasNext())
          if (paramFile.equals((File)((Iterator)localObject2).next()))
            ((Iterator)localObject2).remove();
        paramClassLoader.add(0, paramFile);
        localObject2 = (List)ShareReflectUtil.b(localObject1, "systemNativeLibraryDirectories").get(localObject1);
        paramFile = (File)localObject2;
        if (localObject2 == null)
          paramFile = new ArrayList(2);
        localObject2 = new ArrayList(paramClassLoader.size() + paramFile.size() + 1);
        ((List)localObject2).addAll(paramClassLoader);
        ((List)localObject2).addAll(paramFile);
        paramClassLoader = (Object[])ShareReflectUtil.b(localObject1, "makePathElements", new Class[] { List.class, File.class, List.class }).invoke(localObject1, new Object[] { localObject2, null, new ArrayList() });
        ShareReflectUtil.b(localObject1, "nativeLibraryPathElements").set(localObject1, paramClassLoader);
        return;
      }
    }
  }

  static final class c
  {
    static void b(ClassLoader paramClassLoader, File paramFile)
    {
      paramFile = paramFile.getPath();
      Field localField = ShareReflectUtil.b(paramClassLoader, "libPath");
      String[] arrayOfString = ((String)localField.get(paramClassLoader)).split(":");
      Object localObject1 = new StringBuilder(paramFile);
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        localObject2 = arrayOfString[j];
        if ((localObject2 != null) && (!paramFile.equals(localObject2)))
          ((StringBuilder)localObject1).append(':').append((String)localObject2);
      }
      localField.set(paramClassLoader, ((StringBuilder)localObject1).toString());
      localField = ShareReflectUtil.b(paramClassLoader, "libraryPathElements");
      localObject1 = (List)localField.get(paramClassLoader);
      Object localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
        if (paramFile.equals((String)((Iterator)localObject2).next()))
          ((Iterator)localObject2).remove();
      ((List)localObject1).add(0, paramFile);
      localField.set(paramClassLoader, localObject1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.a.a
 * JD-Core Version:    0.6.2
 */