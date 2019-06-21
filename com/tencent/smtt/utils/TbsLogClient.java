package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TbsLogClient
{
  static TbsLogClient a = null;
  static File c = null;
  static String d = null;
  static byte[] e = null;
  private static boolean i = true;
  TextView b;
  private SimpleDateFormat f;
  private Context g;
  private StringBuffer h;

  public TbsLogClient(Context paramContext)
  {
    AppMethodBeat.i(65339);
    this.f = null;
    this.g = null;
    this.h = new StringBuffer();
    try
    {
      this.g = paramContext.getApplicationContext();
      paramContext = new java/text/SimpleDateFormat;
      paramContext.<init>("yyyy-MM-dd_HH:mm:ss.SSS", Locale.US);
      this.f = paramContext;
      AppMethodBeat.o(65339);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        this.f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
        AppMethodBeat.o(65339);
      }
    }
  }

  private void a()
  {
    AppMethodBeat.i(65340);
    try
    {
      if (c == null)
        if (Environment.getExternalStorageState().equals("mounted"))
        {
          String str = k.a(this.g, 6);
          if (str == null)
          {
            c = null;
            AppMethodBeat.o(65340);
          }
          while (true)
          {
            return;
            File localFile = new java/io/File;
            localFile.<init>(str, "tbslog.txt");
            c = localFile;
            d = LogFileUtils.createKey();
            e = LogFileUtils.createHeaderText(c.getName(), d);
            AppMethodBeat.o(65340);
          }
        }
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
      {
        AppMethodBeat.o(65340);
        continue;
        c = null;
        AppMethodBeat.o(65340);
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        AppMethodBeat.o(65340);
    }
  }

  public static void setWriteLogJIT(boolean paramBoolean)
  {
    i = paramBoolean;
  }

  public void d(String paramString1, String paramString2)
  {
  }

  public void e(String paramString1, String paramString2)
  {
  }

  public void i(String paramString1, String paramString2)
  {
  }

  public void setLogView(TextView paramTextView)
  {
    this.b = paramTextView;
  }

  public void showLog(String paramString)
  {
    AppMethodBeat.i(65343);
    if (this.b != null)
      this.b.post(new a(paramString));
    AppMethodBeat.o(65343);
  }

  public void v(String paramString1, String paramString2)
  {
  }

  public void w(String paramString1, String paramString2)
  {
  }

  public void writeLog(String paramString)
  {
    AppMethodBeat.i(65341);
    try
    {
      String str = this.f.format(Long.valueOf(System.currentTimeMillis()));
      this.h.append(str).append(" pid=").append(Process.myPid()).append(" tid=").append(Process.myTid()).append(paramString).append("\n");
      if ((Thread.currentThread() != Looper.getMainLooper().getThread()) || (i))
        writeLogToDisk();
      if (this.h.length() > 524288)
        this.h.delete(0, this.h.length());
      AppMethodBeat.o(65341);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(65341);
    }
  }

  public void writeLogToDisk()
  {
    AppMethodBeat.i(65342);
    try
    {
      a();
      if (c != null)
      {
        LogFileUtils.writeDataToStorage(c, d, e, this.h.toString(), true);
        this.h.delete(0, this.h.length());
      }
      AppMethodBeat.o(65342);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(65342);
    }
  }

  class a
    implements Runnable
  {
    String a = null;

    a(String arg2)
    {
      Object localObject;
      this.a = localObject;
    }

    public void run()
    {
      AppMethodBeat.i(65338);
      if (TbsLogClient.this.b != null)
        TbsLogClient.this.b.append(this.a + "\n");
      AppMethodBeat.o(65338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.TbsLogClient
 * JD-Core Version:    0.6.2
 */