package com.tencent.map.lib;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class d
{
  public static boolean a = false;

  private static String a()
  {
    AppMethodBeat.i(97860);
    String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.CHINA).format(new Date(System.currentTimeMillis()));
    AppMethodBeat.o(97860);
    return str;
  }

  public static void a(String paramString)
  {
    if ((a) && (paramString == null));
  }

  public static void a(String paramString, Throwable paramThrowable)
  {
  }

  public static void b(String paramString)
  {
  }

  public static void c(String paramString)
  {
    AppMethodBeat.i(97859);
    if (!a)
      AppMethodBeat.o(97859);
    while (true)
    {
      return;
      try
      {
        Object localObject1 = Environment.getExternalStorageDirectory();
        Object localObject2 = new java/io/File;
        ((File)localObject2).<init>((File)localObject1, "xiaozhi.txt");
        if (!((File)localObject2).exists())
          ((File)localObject2).createNewFile();
        localObject1 = new java/io/FileWriter;
        ((FileWriter)localObject1).<init>((File)localObject2, true);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((FileWriter)localObject1).write(a() + " " + paramString + "\n");
        ((FileWriter)localObject1).flush();
        ((FileWriter)localObject1).close();
        AppMethodBeat.o(97859);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(97859);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.d
 * JD-Core Version:    0.6.2
 */