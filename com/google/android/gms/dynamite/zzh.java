package com.google.android.gms.dynamite;

import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.PathClassLoader;

final class zzh extends PathClassLoader
{
  zzh(String paramString, ClassLoader paramClassLoader)
  {
    super(paramString, paramClassLoader);
  }

  protected final Class<?> loadClass(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90456);
    if ((!paramString.startsWith("java.")) && (!paramString.startsWith("android.")));
    while (true)
    {
      try
      {
        Class localClass = findClass(paramString);
        paramString = localClass;
        AppMethodBeat.o(90456);
        return paramString;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
      }
      paramString = super.loadClass(paramString, paramBoolean);
      AppMethodBeat.o(90456);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.zzh
 * JD-Core Version:    0.6.2
 */