package com.tencent.smtt.export.external;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;

public class DexClassLoaderProviderService extends Service
{
  private static final String LOGTAG = "dexloader";

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    AppMethodBeat.i(63752);
    super.onCreate();
    DexClassLoaderProvider.setForceLoadDexFlag(true, this);
    AppMethodBeat.o(63752);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(63754);
    System.exit(0);
    AppMethodBeat.o(63754);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(63753);
    if (paramIntent == null)
      AppMethodBeat.o(63753);
    while (true)
    {
      return 1;
      try
      {
        Object localObject = paramIntent.getStringArrayListExtra("dex2oat");
        if (localObject == null)
        {
          AppMethodBeat.o(63753);
          continue;
        }
        ((ArrayList)localObject).get(0);
        String str1 = (String)((ArrayList)localObject).get(1);
        paramIntent = (String)((ArrayList)localObject).get(2);
        String str2 = (String)((ArrayList)localObject).get(3);
        ClassLoader localClassLoader = getClassLoader();
        localObject = new java/io/File;
        ((File)localObject).<init>(paramIntent);
        if (!((File)localObject).exists())
          ((File)localObject).mkdirs();
        DexClassLoaderProvider.createDexClassLoader(str1, paramIntent, str2, localClassLoader, getApplicationContext());
        label122: AppMethodBeat.o(63753);
      }
      catch (Exception paramIntent)
      {
        break label122;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexClassLoaderProviderService
 * JD-Core Version:    0.6.2
 */