package com.tencent.d.d.a;

import com.tencent.d.d.b.a;
import com.tencent.d.d.b.c;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public final class f
{
  private static boolean af(File paramFile)
  {
    AppMethodBeat.i(114510);
    try
    {
      if ((c.atS(paramFile.getAbsolutePath()) & 0x800) > 0)
      {
        bool = true;
        AppMethodBeat.o(114510);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(114510);
        bool = false;
      }
    }
    catch (Exception paramFile)
    {
      while (true)
      {
        h.w(paramFile);
        AppMethodBeat.o(114510);
        boolean bool = false;
      }
    }
  }

  public static boolean dQn()
  {
    boolean bool = false;
    AppMethodBeat.i(114511);
    if (com.tencent.d.d.b.f.dQp())
    {
      h.dQG();
      AppMethodBeat.o(114511);
    }
    while (true)
    {
      return bool;
      Object localObject;
      int i;
      int j;
      try
      {
        String str = new java/lang/String;
        str.<init>(a.atR("/proc/mounts"));
        "SetuidBitChecker mounts : ".concat(String.valueOf(str));
        h.dQH();
        localObject = str.split("\n");
        i = localObject.length;
        j = 0;
        label62: if (j < i)
        {
          str = localObject[j];
          if (str.contains(" /system "))
          {
            if (!str.contains(",nosuid"))
              break label116;
            h.dQG();
          }
        }
        label116: for (j = 1; ; j = 0)
        {
          if (j == 0)
            break label135;
          AppMethodBeat.o(114511);
          break;
          j++;
          break label62;
        }
      }
      catch (IOException localIOException)
      {
        h.w(localIOException);
        AppMethodBeat.o(114511);
      }
      continue;
      label135: if (!c.isAvailable())
      {
        h.dQG();
        AppMethodBeat.o(114511);
      }
      else
      {
        localObject = new File("/system/bin").listFiles();
        File localFile;
        if (localObject != null)
        {
          i = localObject.length;
          for (j = 0; ; j++)
          {
            if (j >= i)
              break label241;
            localFile = localObject[j];
            if ((!"run-as".equals(localFile.getName())) && (af(localFile)))
            {
              new StringBuilder("SetuidBitChecker s-bit found : ").append(localFile.getAbsolutePath());
              h.dQG();
              AppMethodBeat.o(114511);
              bool = true;
              break;
            }
          }
        }
        label241: localObject = new File("/system/xbin").listFiles();
        if (localObject != null)
        {
          i = localObject.length;
          for (j = 0; ; j++)
          {
            if (j >= i)
              break label318;
            localFile = localObject[j];
            if (af(localFile))
            {
              new StringBuilder("SetuidBitChecker s-bit found : ").append(localFile.getAbsolutePath());
              h.dQG();
              AppMethodBeat.o(114511);
              bool = true;
              break;
            }
          }
        }
        label318: h.dQG();
        AppMethodBeat.o(114511);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.a.f
 * JD-Core Version:    0.6.2
 */