package com.tencent.smtt.export.external;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.TimerTask;

final class DexClassLoaderProvider$1 extends TimerTask
{
  DexClassLoaderProvider$1(String paramString1, String paramString2, String paramString3, String paramString4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63721);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(4);
      localArrayList.add(0, this.val$dexName);
      localArrayList.add(1, this.val$dexPath);
      localArrayList.add(2, this.val$optimizedDirectory);
      localArrayList.add(3, this.val$libraryPath);
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(DexClassLoaderProvider.access$000(), DexClassLoaderProviderService.class);
      localIntent.putStringArrayListExtra("dex2oat", localArrayList);
      DexClassLoaderProvider.access$000().startService(localIntent);
      AppMethodBeat.o(63721);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        AppMethodBeat.o(63721);
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        new StringBuilder("after shouldUseDexLoaderService exception: ").append(localThrowable);
        AppMethodBeat.o(63721);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexClassLoaderProvider.1
 * JD-Core Version:    0.6.2
 */