package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class hm
{
  public static long a(File paramFile)
  {
    long l1 = 0L;
    AppMethodBeat.i(99556);
    long l2;
    if ((paramFile == null) || (!paramFile.exists()))
    {
      AppMethodBeat.o(99556);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      if (paramFile.isDirectory())
      {
        localObject = paramFile.listFiles();
        l2 = l1;
        if (localObject != null)
        {
          int i = localObject.length;
          for (int j = 0; ; j++)
          {
            l2 = l1;
            if (j >= i)
              break;
            l1 += a(localObject[j]);
          }
        }
      }
      else
      {
        l2 = paramFile.length();
      }
      Object localObject = new File(paramFile.getAbsolutePath() + System.currentTimeMillis());
      paramFile.renameTo((File)localObject);
      ((File)localObject).delete();
      AppMethodBeat.o(99556);
    }
  }

  public static String a(Context paramContext)
  {
    AppMethodBeat.i(99557);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99557);
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageName();
        if ((paramContext == null) || (paramContext.length() == 0))
        {
          paramContext = "";
          AppMethodBeat.o(99557);
        }
        else if (paramContext.length() > 255)
        {
          paramContext = paramContext.substring(0, 254);
          AppMethodBeat.o(99557);
        }
        else
        {
          AppMethodBeat.o(99557);
        }
      }
      catch (Exception paramContext)
      {
        paramContext = "";
        AppMethodBeat.o(99557);
      }
    }
  }

  public static boolean a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(99555);
    File localFile = new File(paramString1);
    paramString1 = new File(paramString2);
    if (paramString1.exists())
      a(paramString1);
    boolean bool = localFile.renameTo(new File(paramString2));
    AppMethodBeat.o(99555);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hm
 * JD-Core Version:    0.6.2
 */