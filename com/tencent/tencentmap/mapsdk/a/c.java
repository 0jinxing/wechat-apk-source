package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ag;
import com.tencent.tencentmap.mapsdk.maps.a.an;

public final class c
{
  private static c n = null;
  private Context a = null;
  private String b = "";
  private String c = "";
  private byte d = (byte)-1;
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private long j = 0L;
  private String k = "";
  private String l = "";
  private String m = "";

  public static void a(Context paramContext)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(97771);
        if (paramContext != null)
        {
          if (n == null)
          {
            ??? = new com/tencent/tencentmap/mapsdk/a/c;
            ???.<init>();
            n = ???;
          }
          synchronized (n)
          {
            ag.e("init cominfo", new Object[0]);
            n.a = paramContext;
            e.a(paramContext);
            n.b = e.a();
            c localc2 = n;
            Object localObject = new java/lang/StringBuffer;
            ((StringBuffer)localObject).<init>();
            ((StringBuffer)localObject).append("Android ");
            ((StringBuffer)localObject).append(e.b());
            ((StringBuffer)localObject).append(",level ");
            ((StringBuffer)localObject).append(e.c());
            localc2.c = ((StringBuffer)localObject).toString();
            n.n();
            n.d(a.d(paramContext));
            if (a.a != null)
              n.a(a.a);
            n.e("beacon_tmap");
            n.f("1.6.7");
            n.b("unknown");
            n.g(e.b(paramContext));
            if ((an.d() != null) && (!"".equals(an.d())))
            {
              n.h(an.d());
              n.c(e.b(a.a(paramContext)));
              AppMethodBeat.o(97771);
              return;
            }
            localObject = n;
            ((c)localObject).h(((c)localObject).o());
          }
        }
      }
      finally
      {
      }
      AppMethodBeat.o(97771);
    }
  }

  private void d(String paramString)
  {
    try
    {
      this.e = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private void e(String paramString)
  {
    try
    {
      this.g = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private void f(String paramString)
  {
    try
    {
      this.h = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  // ERROR //
  private void g(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 157
    //   4: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 35
    //   9: aload_1
    //   10: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifne +14 -> 29
    //   18: aload_0
    //   19: getfield 33	com/tencent/tencentmap/mapsdk/a/c:a	Landroid/content/Context;
    //   22: ldc 159
    //   24: aload_1
    //   25: invokestatic 162	com/tencent/tencentmap/mapsdk/a/a:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    //   28: pop
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 55	com/tencent/tencentmap/mapsdk/a/c:k	Ljava/lang/String;
    //   34: ldc 157
    //   36: invokestatic 152	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    //   47: astore_3
    //   48: goto -19 -> 29
    //
    // Exception table:
    //   from	to	target	type
    //   2	14	42	finally
    //   18	29	42	finally
    //   29	39	42	finally
    //   18	29	47	java/lang/Exception
  }

  private void h(String paramString)
  {
    try
    {
      this.l = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public static c m()
  {
    try
    {
      c localc = n;
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void n()
  {
    try
    {
      this.d = ((byte)1);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private String o()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String a()
  {
    return this.b;
  }

  public final void a(long paramLong)
  {
    try
    {
      this.j = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(String paramString)
  {
    try
    {
      this.f = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final String b()
  {
    return this.c;
  }

  public final void b(String paramString)
  {
    try
    {
      this.i = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final byte c()
  {
    try
    {
      byte b1 = this.d;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void c(String paramString)
  {
    try
    {
      this.m = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final String d()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String e()
  {
    try
    {
      String str = this.g;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String f()
  {
    try
    {
      String str = this.h;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String g()
  {
    try
    {
      String str = this.i;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long h()
  {
    try
    {
      long l1 = this.j;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public final String i()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 167
    //   4: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 35
    //   9: aload_0
    //   10: getfield 55	com/tencent/tencentmap/mapsdk/a/c:k	Ljava/lang/String;
    //   13: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   16: istore_1
    //   17: iload_1
    //   18: ifeq +18 -> 36
    //   21: aload_0
    //   22: aload_0
    //   23: getfield 33	com/tencent/tencentmap/mapsdk/a/c:a	Landroid/content/Context;
    //   26: ldc 159
    //   28: ldc 35
    //   30: invokestatic 170	com/tencent/tencentmap/mapsdk/a/a:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   33: putfield 55	com/tencent/tencentmap/mapsdk/a/c:k	Ljava/lang/String;
    //   36: aload_0
    //   37: getfield 55	com/tencent/tencentmap/mapsdk/a/c:k	Ljava/lang/String;
    //   40: astore_2
    //   41: ldc 167
    //   43: invokestatic 152	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_2
    //   49: areturn
    //   50: astore_2
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    //   55: astore_2
    //   56: goto -20 -> 36
    //
    // Exception table:
    //   from	to	target	type
    //   2	17	50	finally
    //   21	36	50	finally
    //   36	46	50	finally
    //   21	36	55	java/lang/Exception
  }

  public final String j()
  {
    try
    {
      String str = this.l;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String k()
  {
    try
    {
      String str = this.m;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Context l()
  {
    try
    {
      Context localContext = this.a;
      return localContext;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.c
 * JD-Core Version:    0.6.2
 */