package com.tencent.tinker.loader;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
class AndroidNClassLoader extends PathClassLoader
{
  private static Object ACs = null;
  private static String ACt = null;
  private final PathClassLoader ACu;
  private String ACv;

  private AndroidNClassLoader(String paramString, PathClassLoader paramPathClassLoader, Application paramApplication)
  {
    super(paramString, paramPathClassLoader.getParent());
    this.ACu = paramPathClassLoader;
    paramString = paramApplication.getClass().getName();
    if ((paramString != null) && (!paramString.equals("android.app.Application")))
      this.ACv = paramString;
    ACt = paramApplication.getPackageCodePath();
  }

  public static AndroidNClassLoader a(PathClassLoader paramPathClassLoader, Application paramApplication)
  {
    AndroidNClassLoader localAndroidNClassLoader = new AndroidNClassLoader("", paramPathClassLoader, paramApplication);
    Field localField = ShareReflectUtil.b(paramPathClassLoader, "pathList");
    paramPathClassLoader = localField.get(paramPathClassLoader);
    Constructor localConstructor = ShareReflectUtil.a(paramPathClassLoader, new Class[] { ClassLoader.class, String.class, String.class, File.class });
    Object localObject1 = (Object[])ShareReflectUtil.b(paramPathClassLoader, "dexElements").get(paramPathClassLoader);
    Object localObject2 = (List)ShareReflectUtil.b(paramPathClassLoader, "nativeLibraryDirectories").get(paramPathClassLoader);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject3 = ShareReflectUtil.d(localObject1.getClass().getComponentType(), "dexFile");
    int i = 1;
    int j = localObject1.length;
    int k = 0;
    if (k < j)
    {
      DexFile localDexFile = (DexFile)((Field)localObject3).get(localObject1[k]);
      int m = i;
      if (localDexFile != null)
      {
        m = i;
        if (localDexFile.getName() != null)
        {
          m = i;
          if (localDexFile.getName().equals(ACt))
          {
            if (i == 0)
              break label214;
            i = 0;
          }
        }
      }
      while (true)
      {
        localStringBuilder.append(localDexFile.getName());
        m = i;
        k++;
        i = m;
        break;
        label214: localStringBuilder.append(File.pathSeparator);
      }
    }
    localObject3 = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localObject1 = ((List)localObject2).iterator();
    i = 1;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (File)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        if (i != 0)
          i = 0;
        while (true)
        {
          localStringBuilder.append(((File)localObject2).getAbsolutePath());
          break;
          localStringBuilder.append(File.pathSeparator);
        }
      }
    }
    localField.set(localAndroidNClassLoader, localConstructor.newInstance(new Object[] { localAndroidNClassLoader, localObject3, localStringBuilder.toString(), null }));
    ShareReflectUtil.b(paramPathClassLoader, "definingContext").set(paramPathClassLoader, localAndroidNClassLoader);
    ACs = paramPathClassLoader;
    paramPathClassLoader = (Context)ShareReflectUtil.b(paramApplication, "mBase").get(paramApplication);
    paramPathClassLoader = ShareReflectUtil.b(paramPathClassLoader, "mPackageInfo").get(paramPathClassLoader);
    ShareReflectUtil.b(paramPathClassLoader, "mClassLoader").set(paramPathClassLoader, localAndroidNClassLoader);
    if (Build.VERSION.SDK_INT < 27)
    {
      paramPathClassLoader = paramApplication.getResources();
      ShareReflectUtil.b(paramPathClassLoader, "mClassLoader").set(paramPathClassLoader, localAndroidNClassLoader);
      paramPathClassLoader = ShareReflectUtil.b(paramPathClassLoader, "mDrawableInflater").get(paramPathClassLoader);
      if (paramPathClassLoader != null)
        ShareReflectUtil.b(paramPathClassLoader, "mClassLoader").set(paramPathClassLoader, localAndroidNClassLoader);
    }
    Thread.currentThread().setContextClassLoader(localAndroidNClassLoader);
    return localAndroidNClassLoader;
  }

  public Class<?> findClass(String paramString)
  {
    if ((this.ACv != null) && (this.ACv.equals(paramString)))
      paramString = this.ACu.loadClass(paramString);
    while (true)
    {
      return paramString;
      if ((paramString != null) && (paramString.startsWith("com.tencent.tinker.loader.")) && (!paramString.equals("com.tencent.tinker.loader.TinkerTestDexLoad")))
        paramString = this.ACu.loadClass(paramString);
      else if ((paramString != null) && (paramString.startsWith("org.apache.http.")))
        paramString = this.ACu.loadClass(paramString);
      else
        try
        {
          Class localClass = super.findClass(paramString);
          paramString = localClass;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          paramString = this.ACu.loadClass(paramString);
        }
    }
  }

  public String findLibrary(String paramString)
  {
    return super.findLibrary(paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.AndroidNClassLoader
 * JD-Core Version:    0.6.2
 */