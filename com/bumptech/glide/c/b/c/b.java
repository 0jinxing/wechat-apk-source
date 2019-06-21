package com.bumptech.glide.c.b.c;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.regex.Pattern;

final class b
{
  static int availableProcessors()
  {
    AppMethodBeat.i(92027);
    int i = Runtime.getRuntime().availableProcessors();
    int j = i;
    if (Build.VERSION.SDK_INT < 17)
      j = Math.max(ng(), i);
    AppMethodBeat.o(92027);
    return j;
  }

  private static int ng()
  {
    AppMethodBeat.i(92028);
    Object localObject1 = null;
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    while (true)
    {
      try
      {
        Object localObject3 = new java/io/File;
        ((File)localObject3).<init>("/sys/devices/system/cpu/");
        Pattern localPattern = Pattern.compile("cpu[0-9]+");
        b.1 local1 = new com/bumptech/glide/c/b/c/b$1;
        local1.<init>(localPattern);
        localObject3 = ((File)localObject3).listFiles(local1);
        localObject1 = localObject3;
        StrictMode.setThreadPolicy(localThreadPolicy);
        if (localObject1 != null)
        {
          i = localObject1.length;
          i = Math.max(1, i);
          AppMethodBeat.o(92028);
          return i;
        }
      }
      catch (Throwable localThrowable)
      {
        Log.isLoggable("GlideRuntimeCompat", 6);
        StrictMode.setThreadPolicy(localThreadPolicy);
        continue;
      }
      finally
      {
        StrictMode.setThreadPolicy(localThreadPolicy);
        AppMethodBeat.o(92028);
      }
      int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c.b
 * JD-Core Version:    0.6.2
 */