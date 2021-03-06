package com.tencent.smtt.export.external;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;
import dalvik.system.VMStack;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class DexLoader
{
  private static final String JAVACORE_PACKAGE_PREFIX = "org.chromium";
  private static final String TAG = "DexLoader";
  private static final String TBS_FUSION_DEX = "tbs_jars_fusion_dex";
  private static final String TBS_WEBVIEW_DEX = "webview_dex";
  static boolean mCanUseDexLoaderProviderService = true;
  private static boolean mUseSpeedyClassLoader;
  private static boolean mUseTbsCorePrivateClassLoader = false;
  private DexClassLoader mClassLoader;

  static
  {
    mUseSpeedyClassLoader = false;
  }

  public DexLoader(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, new String[] { paramString1 }, paramString2);
    AppMethodBeat.i(63761);
    AppMethodBeat.o(63761);
  }

  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    this(null, paramContext, paramArrayOfString, paramString);
  }

  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString, DexLoader paramDexLoader)
  {
    AppMethodBeat.i(63760);
    paramDexLoader = paramDexLoader.getClassLoader();
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      paramDexLoader = createDexClassLoader(paramArrayOfString[i], paramString, paramContext.getApplicationInfo().nativeLibraryDir, paramDexLoader, paramContext);
      this.mClassLoader = paramDexLoader;
    }
    AppMethodBeat.o(63760);
  }

  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString1, String paramString2)
  {
    AppMethodBeat.i(63759);
    ClassLoader localClassLoader = paramContext.getClassLoader();
    String str1 = paramContext.getApplicationInfo().nativeLibraryDir;
    String str2 = str1;
    if (!TextUtils.isEmpty(paramString2))
      str2 = str1 + File.pathSeparator + paramString2;
    int i = 0;
    paramString2 = localClassLoader;
    while (i < paramArrayOfString.length)
    {
      paramString2 = createDexClassLoader(paramArrayOfString[i], paramString1, str2, paramString2, paramContext);
      this.mClassLoader = paramString2;
      i++;
    }
    AppMethodBeat.o(63759);
  }

  public DexLoader(String paramString1, Context paramContext, String[] paramArrayOfString, String paramString2)
  {
    this(paramString1, paramContext, paramArrayOfString, paramString2, null);
  }

  public DexLoader(String paramString1, Context paramContext, String[] paramArrayOfString, String paramString2, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(63758);
    initTbsSettings(paramMap);
    ClassLoader localClassLoader = VMStack.getCallingClassLoader();
    paramMap = localClassLoader;
    if (localClassLoader == null)
      paramMap = paramContext.getClassLoader();
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      paramMap = createDexClassLoader(paramArrayOfString[i], paramString2, paramString1, paramMap, paramContext);
      this.mClassLoader = paramMap;
    }
    AppMethodBeat.o(63758);
  }

  private DexClassLoader createDexClassLoader(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader, Context paramContext)
  {
    AppMethodBeat.i(63762);
    if (shouldUseTbsCorePrivateClassLoader(paramString1))
      paramString1 = new DexLoader.TbsCorePrivateClassLoader(paramString1, paramString2, paramString3, paramClassLoader);
    while (true)
    {
      AppMethodBeat.o(63762);
      return paramString1;
      if ((Build.VERSION.SDK_INT >= 21) && (Build.VERSION.SDK_INT <= 25) && (mUseSpeedyClassLoader))
        try
        {
          paramContext = DexClassLoaderProvider.createDexClassLoader(paramString1, paramString2, paramString3, paramClassLoader, paramContext);
          paramString1 = paramContext;
        }
        catch (Throwable paramContext)
        {
          new StringBuilder("createDexClassLoader exception: ").append(paramContext);
          paramString1 = new DexClassLoader(paramString1, paramString2, paramString3, paramClassLoader);
        }
      else
        paramString1 = new DexClassLoader(paramString1, paramString2, paramString3, paramClassLoader);
    }
  }

  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(63756);
    if (paramMap != null);
    while (true)
    {
      try
      {
        Object localObject = paramMap.get("use_private_classloader");
        if ((localObject instanceof Boolean))
          mUseTbsCorePrivateClassLoader = ((Boolean)localObject).booleanValue();
        localObject = paramMap.get("use_speedy_classloader");
        if ((localObject instanceof Boolean))
          mUseSpeedyClassLoader = ((Boolean)localObject).booleanValue();
        paramMap = paramMap.get("use_dexloader_service");
        if ((paramMap instanceof Boolean))
          mCanUseDexLoaderProviderService = ((Boolean)paramMap).booleanValue();
        AppMethodBeat.o(63756);
        return;
      }
      catch (Throwable paramMap)
      {
      }
      AppMethodBeat.o(63756);
    }
  }

  private boolean shouldUseTbsCorePrivateClassLoader(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(63757);
    if (!mUseTbsCorePrivateClassLoader)
      AppMethodBeat.o(63757);
    while (true)
    {
      return bool;
      if ((paramString.contains("tbs_jars_fusion_dex")) || (paramString.contains("webview_dex")))
      {
        bool = true;
        AppMethodBeat.o(63757);
      }
      else
      {
        AppMethodBeat.o(63757);
      }
    }
  }

  public DexClassLoader getClassLoader()
  {
    return this.mClassLoader;
  }

  public Object getStaticField(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(63768);
    try
    {
      Object localObject2 = this.mClassLoader.loadClass(paramString1).getField(paramString2);
      ((Field)localObject2).setAccessible(true);
      localObject2 = ((Field)localObject2).get(null);
      paramString1 = (String)localObject2;
      AppMethodBeat.o(63768);
      return paramString1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        getClass().getSimpleName();
        new StringBuilder("'").append(paramString1).append("' get field '").append(paramString2).append("' failed");
        AppMethodBeat.o(63768);
        paramString1 = localObject1;
      }
    }
  }

  public Object invokeMethod(Object paramObject, String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63767);
    try
    {
      paramArrayOfClass = this.mClassLoader.loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramObject = paramArrayOfClass.invoke(paramObject, paramArrayOfObject);
      AppMethodBeat.o(63767);
      return paramObject;
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        getClass().getSimpleName();
        new StringBuilder("'").append(paramString1).append("' invoke method '").append(paramString2).append("' failed");
        paramObject = null;
        AppMethodBeat.o(63767);
      }
    }
  }

  public Object invokeStaticMethod(String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63766);
    try
    {
      paramArrayOfClass = this.mClassLoader.loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.invoke(null, paramArrayOfObject);
      paramString1 = paramArrayOfClass;
      AppMethodBeat.o(63766);
      return paramString1;
    }
    catch (Throwable paramArrayOfClass)
    {
      while (true)
        if ((paramString2 != null) && (paramString2.equalsIgnoreCase("initTesRuntimeEnvironment")))
        {
          getClass().getSimpleName();
          new StringBuilder("'").append(paramString1).append("' invoke static method '").append(paramString2).append("' failed");
          AppMethodBeat.o(63766);
          paramString1 = paramArrayOfClass;
        }
        else
        {
          getClass().getSimpleName();
          new StringBuilder("'").append(paramString1).append("' invoke static method '").append(paramString2).append("' failed");
          AppMethodBeat.o(63766);
          paramString1 = null;
        }
    }
  }

  public Class<?> loadClass(String paramString)
  {
    AppMethodBeat.i(63765);
    try
    {
      Class localClass = this.mClassLoader.loadClass(paramString);
      paramString = localClass;
      AppMethodBeat.o(63765);
      return paramString;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        getClass().getSimpleName();
        new StringBuilder("loadClass '").append(paramString).append("' failed");
        paramString = null;
        AppMethodBeat.o(63765);
      }
    }
  }

  public Object newInstance(String paramString)
  {
    AppMethodBeat.i(63763);
    try
    {
      Object localObject = this.mClassLoader.loadClass(paramString).newInstance();
      paramString = localObject;
      AppMethodBeat.o(63763);
      return paramString;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        getClass().getSimpleName();
        new StringBuilder("create ").append(paramString).append(" instance failed");
        paramString = null;
        AppMethodBeat.o(63763);
      }
    }
  }

  public Object newInstance(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63764);
    try
    {
      paramArrayOfClass = this.mClassLoader.loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      paramString = paramArrayOfClass;
      AppMethodBeat.o(63764);
      return paramString;
    }
    catch (Throwable paramArrayOfClass)
    {
      while (true)
        if ("com.tencent.smtt.webkit.adapter.X5WebViewAdapter".equalsIgnoreCase(paramString))
        {
          getClass().getSimpleName();
          new StringBuilder("'newInstance ").append(paramString).append(" failed");
          AppMethodBeat.o(63764);
          paramString = paramArrayOfClass;
        }
        else
        {
          getClass().getSimpleName();
          new StringBuilder("create '").append(paramString).append("' instance failed");
          paramString = null;
          AppMethodBeat.o(63764);
        }
    }
  }

  public void setStaticField(String paramString1, String paramString2, Object paramObject)
  {
    AppMethodBeat.i(63769);
    try
    {
      Field localField = this.mClassLoader.loadClass(paramString1).getField(paramString2);
      localField.setAccessible(true);
      localField.set(null, paramObject);
      AppMethodBeat.o(63769);
      return;
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        getClass().getSimpleName();
        new StringBuilder("'").append(paramString1).append("' set field '").append(paramString2).append("' failed");
        AppMethodBeat.o(63769);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexLoader
 * JD-Core Version:    0.6.2
 */