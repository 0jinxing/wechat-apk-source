package c.t.m.c;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class e
{
  private static final byte[] b = new byte[0];
  private static e j;
  private final String a;
  private HandlerThread c;
  private e.a d;
  private boolean e;
  private Context f;
  private k g;
  private SimpleDateFormat h;
  private SimpleDateFormat i;

  private e(Context paramContext)
  {
    AppMethodBeat.i(136346);
    this.a = "DexAsynchHandler";
    this.h = new SimpleDateFormat("HHmmss");
    this.i = new SimpleDateFormat("yyyyMMdd-HHmmss");
    this.f = paramContext.getApplicationContext();
    this.g = new k(this.f);
    AppMethodBeat.o(136346);
  }

  public static e a()
  {
    return j;
  }

  public static e a(Context paramContext)
  {
    AppMethodBeat.i(136347);
    if (j == null);
    try
    {
      if (j == null)
      {
        e locale = new c/t/m/c/e;
        locale.<init>(paramContext);
        j = locale;
      }
      paramContext = j;
      AppMethodBeat.o(136347);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(136347);
    }
    throw paramContext;
  }

  private void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(136351);
    e.a locala = this.d;
    if (locala != null)
    {
      Message localMessage = locala.obtainMessage();
      localMessage.obj = paramString;
      localMessage.what = paramInt;
      o.a(locala, localMessage);
    }
    AppMethodBeat.o(136351);
  }

  private byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(136353);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = b;
      AppMethodBeat.o(136353);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramString = m.a(q.b(paramArrayOfByte), paramString);
      if ((paramString == null) || (paramString.length == 0))
      {
        paramArrayOfByte = b;
        AppMethodBeat.o(136353);
      }
      else
      {
        paramArrayOfByte = new byte[paramString.length + 2];
        System.arraycopy(q.a(paramString.length), 0, paramArrayOfByte, 0, 2);
        System.arraycopy(paramString, 0, paramArrayOfByte, 2, paramString.length);
        AppMethodBeat.o(136353);
      }
    }
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(136349);
    try
    {
      if ((this.f != null) && (this.d != null) && (paramString != null))
      {
        int k = paramString.length();
        if (k != 0);
      }
      else
      {
        AppMethodBeat.o(136349);
      }
      while (true)
      {
        return;
        p.a = 3000;
        StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>();
        StringBuilder localStringBuilder2 = localStringBuilder1.append("LOC_CORE,");
        SimpleDateFormat localSimpleDateFormat = this.i;
        Date localDate = new java/util/Date;
        localDate.<init>();
        localStringBuilder2.append(localSimpleDateFormat.format(localDate)).append(',').append(q.e(this.f)).append(',').append(q.d(this.f)).append(',').append(q.b()).append(',').append(q.a()).append(',').append(q.c()).append(',').append("COMP").append(paramString).append("$");
        a(localStringBuilder1.toString().getBytes());
        AppMethodBeat.o(136349);
      }
    }
    catch (Throwable paramString)
    {
      while (true)
        AppMethodBeat.o(136349);
    }
  }

  public void a(String paramString1, String paramString2)
  {
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(136352);
    if (paramArrayOfByte != null);
    try
    {
      int k = paramArrayOfByte.length;
      if (k == 0)
      {
        AppMethodBeat.o(136352);
        bool = true;
      }
      while (true)
      {
        return bool;
        paramArrayOfByte = a(paramArrayOfByte, "0PEq^X$sjtWqEqa2$dg4TG2PT^4dFEep");
        if (paramArrayOfByte != null)
        {
          k = paramArrayOfByte.length;
          if (k != 0);
        }
        else
        {
          AppMethodBeat.o(136352);
          bool = true;
          continue;
        }
        if (p.a("https://analytics.map.qq.com/tr?mllc", paramArrayOfByte) == null)
          this.g.a(paramArrayOfByte);
        AppMethodBeat.o(136352);
      }
    }
    catch (Throwable paramArrayOfByte)
    {
      while (true)
        AppMethodBeat.o(136352);
    }
  }

  public void b()
  {
    AppMethodBeat.i(136348);
    if (this.e)
      AppMethodBeat.o(136348);
    while (true)
    {
      return;
      this.c = new HandlerThread("d_thread");
      this.c.start();
      this.d = new e.a(this, this.c.getLooper());
      this.e = true;
      AppMethodBeat.o(136348);
    }
  }

  public void c()
  {
  }

  public void d()
  {
    AppMethodBeat.i(136350);
    if (this.f == null)
      AppMethodBeat.o(136350);
    while (true)
    {
      return;
      a(10005, null);
      AppMethodBeat.o(136350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     c.t.m.c.e
 * JD-Core Version:    0.6.2
 */