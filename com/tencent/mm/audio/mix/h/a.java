package com.tencent.mm.audio.mix.h;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  private static boolean coh = false;

  public static String F(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137207);
    String str = Environment.getExternalStorageDirectory().getAbsolutePath();
    if ((coh) && (paramString2.contains(".")) && (paramString2.contains("/")))
    {
      paramString2 = paramString2.substring(paramString2.lastIndexOf("/") + 1, paramString2.lastIndexOf("."));
      paramString2 = paramString2 + "_cache.pcm";
    }
    while (true)
    {
      paramString1 = File.separator + paramString1;
      str = str + paramString1;
      paramString1 = new File(str);
      if (!paramString1.exists())
        paramString1.mkdirs();
      paramString1 = str + File.separator + paramString2;
      AppMethodBeat.o(137207);
      return paramString1;
      if ((paramString2.contains(".")) && (paramString2.contains("/")) && (paramString2.lastIndexOf(".") > paramString2.lastIndexOf("/")))
      {
        paramString2 = paramString2.substring(paramString2.lastIndexOf("/") + 1, paramString2.lastIndexOf("."));
        paramString2 = paramString2 + "_cache.pcm";
        str = str + "/tencent/MicroMsg/MixAudio";
      }
      else
      {
        paramString2 = c.ck(new StringBuilder().append(paramString2.hashCode()).toString()) + "_cache.pcm";
        str = str + "/tencent/MicroMsg/MixAudio";
      }
    }
  }

  public static void b(String paramString, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(137208);
    if (paramArrayList.size() > 0)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayList = F(paramString, (String)localIterator.next());
        File localFile = new File(paramArrayList);
        if (localFile.exists())
        {
          localFile.delete();
          b.i("MicroMsg.Mix.FileUtil", "delete pcm cache file, file:%s", new Object[] { paramArrayList });
        }
      }
    }
    AppMethodBeat.o(137208);
  }

  public static String eh(String paramString)
  {
    AppMethodBeat.i(137205);
    Object localObject = Environment.getExternalStorageDirectory().getAbsolutePath();
    String str;
    if ((coh) && (paramString.contains(".")) && (paramString.contains("/")))
    {
      paramString = paramString.substring(paramString.lastIndexOf("/") + 1, paramString.lastIndexOf("."));
      str = paramString + "_convert.pcm";
      paramString = (String)localObject;
    }
    while (true)
    {
      localObject = new File(paramString);
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      paramString = paramString + File.separator + str;
      AppMethodBeat.o(137205);
      return paramString;
      if ((paramString.contains(".")) && (paramString.contains("/")) && (paramString.lastIndexOf(".") > paramString.lastIndexOf("/")))
      {
        paramString = paramString.substring(paramString.lastIndexOf("/") + 1, paramString.lastIndexOf("."));
        str = paramString + "_convert.pcm";
        paramString = (String)localObject + "/tencent/MicroMsg/MixAudio";
      }
      else
      {
        str = c.ck(new StringBuilder().append(paramString.hashCode()).toString()) + "_convert.pcm";
        paramString = (String)localObject + "/tencent/MicroMsg/MixAudio";
      }
    }
  }

  public static File ei(String paramString)
  {
    AppMethodBeat.i(137206);
    File localFile = new File(paramString);
    if (!localFile.exists());
    try
    {
      localFile.createNewFile();
      AppMethodBeat.o(137206);
      return localFile;
    }
    catch (Exception paramString)
    {
      while (true)
        b.printErrStackTrace("MicroMsg.Mix.FileUtil", paramString, "createNewFile", new Object[0]);
    }
  }

  public static boolean ej(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(137209);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(137209);
    while (true)
    {
      return bool;
      File localFile = new File(paramString);
      if (!localFile.exists())
      {
        AppMethodBeat.o(137209);
      }
      else if (localFile.isDirectory())
      {
        AppMethodBeat.o(137209);
      }
      else
      {
        int i;
        if (paramString.endsWith(".wav"))
        {
          if (localFile.length() >= 5000000L);
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label99;
            AppMethodBeat.o(137209);
            break;
          }
        }
        label99: if (!paramString.endsWith(".wav"))
        {
          if (localFile.length() >= 2000000L);
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label138;
            AppMethodBeat.o(137209);
            break;
          }
        }
        label138: AppMethodBeat.o(137209);
        bool = true;
      }
    }
  }

  public static long ek(String paramString)
  {
    AppMethodBeat.i(137210);
    paramString = new File(paramString);
    long l;
    if (paramString.exists())
    {
      l = paramString.length();
      AppMethodBeat.o(137210);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(137210);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.h.a
 * JD-Core Version:    0.6.2
 */