package com.tencent.smtt.export.external;

import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.net.URL;
import java.util.Enumeration;

class DexClassLoaderProvider$SpeedyDexClassLoader extends BaseDexClassLoader
{
  public DexClassLoaderProvider$SpeedyDexClassLoader(String paramString1, File paramFile, String paramString2, ClassLoader paramClassLoader)
  {
    super(paramString1, null, paramString2, paramClassLoader);
  }

  public Package definePackage(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, URL paramURL)
  {
    AppMethodBeat.i(63727);
    paramString1 = super.definePackage(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramURL);
    AppMethodBeat.o(63727);
    return paramString1;
  }

  public Class<?> findClass(String paramString)
  {
    AppMethodBeat.i(63723);
    paramString = super.findClass(paramString);
    AppMethodBeat.o(63723);
    return paramString;
  }

  public URL findResource(String paramString)
  {
    AppMethodBeat.i(63724);
    paramString = super.findResource(paramString);
    AppMethodBeat.o(63724);
    return paramString;
  }

  public Enumeration<URL> findResources(String paramString)
  {
    AppMethodBeat.i(63725);
    paramString = super.findResources(paramString);
    AppMethodBeat.o(63725);
    return paramString;
  }

  public Package getPackage(String paramString)
  {
    try
    {
      AppMethodBeat.i(63726);
      paramString = super.getPackage(paramString);
      AppMethodBeat.o(63726);
      return paramString;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public Package[] getPackages()
  {
    AppMethodBeat.i(63728);
    Package[] arrayOfPackage = super.getPackages();
    AppMethodBeat.o(63728);
    return arrayOfPackage;
  }

  public Class<?> loadClass(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63729);
    paramString = super.loadClass(paramString, paramBoolean);
    AppMethodBeat.o(63729);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexClassLoaderProvider.SpeedyDexClassLoader
 * JD-Core Version:    0.6.2
 */