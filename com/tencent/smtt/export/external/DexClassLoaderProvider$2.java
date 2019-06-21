package com.tencent.smtt.export.external;

import android.app.Service;
import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.TimerTask;

final class DexClassLoaderProvider$2 extends TimerTask
{
  DexClassLoaderProvider$2(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader, String paramString4)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    AppMethodBeat.i(63722);
    try
    {
      Object localObject1 = this.val$dexPath.replace(".jar", ".dex");
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      if ((((File)localObject2).exists()) && (((File)localObject2).length() != 0L))
      {
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(this.val$optimizedDirectory);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(this.val$dexPath);
        boolean bool2 = ((File)localObject2).exists();
        boolean bool3 = ((File)localObject2).isDirectory();
        boolean bool4 = ((File)localObject1).exists();
        if ((bool2) && (bool3) && (bool4))
          break label154;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("dex loading exception(");
        ((StringBuilder)localObject2).append(bool2).append(", ").append(bool3).append(", ").append(bool4).append(")");
        AppMethodBeat.o(63722);
      }
      while (true)
      {
        return;
        bool1 = false;
        break;
        label154: long l = System.currentTimeMillis();
        new DexClassLoader(this.val$dexPath, this.val$optimizedDirectory, this.val$libraryPath, this.val$parent);
        String.format("load_dex completed -- cl_cost: %d, existed: %b", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool1) });
        if ((DexClassLoaderProvider.access$100()) && ("tbs_jars_fusion_dex.jar".equals(this.val$dexName)) && (DexClassLoaderProvider.mService != null))
          DexClassLoaderProvider.mService.stopSelf();
        AppMethodBeat.o(63722);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        new StringBuilder("@AsyncDexLoad task exception: ").append(localThrowable);
        AppMethodBeat.o(63722);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexClassLoaderProvider.2
 * JD-Core Version:    0.6.2
 */