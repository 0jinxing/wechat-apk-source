package com.b.a.a;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class o
{
  private static final SimpleDateFormat bFA;
  private static String bFy;
  private static final SimpleDateFormat bFz;

  static
  {
    AppMethodBeat.i(55574);
    bFz = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss", Locale.US);
    bFA = new SimpleDateFormat("yyyMMddHHmmss", Locale.US);
    AppMethodBeat.o(55574);
  }

  protected static boolean s(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(55575);
    Object localObject2;
    boolean bool2;
    if (bFy == null)
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        localObject2 = new File(Environment.getExternalStorageDirectory() + "/" + y.bIO);
        boolean bool1 = ((File)localObject2).exists();
        bool2 = bool1;
        if (!bool1)
          bool2 = ((File)localObject2).mkdir();
        if (bool2)
          localObject1 = ((File)localObject2).toString();
        bFy = (String)localObject1;
        if (bool2)
          break label120;
        AppMethodBeat.o(55575);
        bool2 = false;
      }
    while (true)
    {
      return bool2;
      bFy = null;
      bool2 = false;
      break;
      try
      {
        label120: localObject1 = new java/io/FileWriter;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(String.valueOf(bFy));
        ((FileWriter)localObject1).<init>("/" + paramString1 + ".txt", true);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("\n");
        SimpleDateFormat localSimpleDateFormat = bFz;
        paramString1 = new java/util/Date;
        paramString1.<init>();
        ((FileWriter)localObject1).write(localSimpleDateFormat.format(paramString1) + ',' + paramString2);
        ((FileWriter)localObject1).flush();
        ((FileWriter)localObject1).close();
        AppMethodBeat.o(55575);
        bool2 = true;
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(55575);
        bool2 = false;
      }
    }
  }

  protected static String wf()
  {
    AppMethodBeat.i(55576);
    String str = bFA.format(new Date());
    AppMethodBeat.o(55576);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.b.a.a.o
 * JD-Core Version:    0.6.2
 */