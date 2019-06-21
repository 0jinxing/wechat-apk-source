package com.tencent.smtt.export.external;

import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;

class DexLoader$TbsCorePrivateClassLoader extends DexClassLoader
{
  public DexLoader$TbsCorePrivateClassLoader(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader)
  {
    super(paramString1, paramString2, paramString3, paramClassLoader);
  }

  protected Class<?> loadClass(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63755);
    Object localObject1;
    Object localObject2;
    if ((paramString != null) && (paramString.startsWith("org.chromium")))
    {
      localObject1 = findLoadedClass(paramString);
      localObject2 = localObject1;
      if (localObject1 != null);
    }
    try
    {
      localObject2 = findClass(paramString);
      localObject1 = localObject2;
      label41: localObject2 = localObject1;
      if (localObject1 == null)
      {
        ClassLoader localClassLoader = getParent();
        localObject2 = localObject1;
        if (localClassLoader != null)
          localObject2 = localClassLoader.loadClass(paramString);
      }
      AppMethodBeat.o(63755);
      while (true)
      {
        return localObject2;
        localObject2 = super.loadClass(paramString, paramBoolean);
        AppMethodBeat.o(63755);
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label41;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexLoader.TbsCorePrivateClassLoader
 * JD-Core Version:    0.6.2
 */