package com.tencent.matrix.d;

import android.util.Log;

public final class c
{
  private static a caR = local1;
  private static a caS = local1;

  static
  {
    a local1 = new a()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        if ((paramAnonymousArrayOfObject == null) || (paramAnonymousArrayOfObject.length == 0));
        while (true)
        {
          return;
          String.format(paramAnonymousString2, paramAnonymousArrayOfObject);
        }
      }

      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        if ((paramAnonymousArrayOfObject == null) || (paramAnonymousArrayOfObject.length == 0));
        while (true)
        {
          return;
          String.format(paramAnonymousString2, paramAnonymousArrayOfObject);
        }
      }

      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        if ((paramAnonymousArrayOfObject == null) || (paramAnonymousArrayOfObject.length == 0));
        while (true)
        {
          return;
          String.format(paramAnonymousString2, paramAnonymousArrayOfObject);
        }
      }

      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        if ((paramAnonymousArrayOfObject == null) || (paramAnonymousArrayOfObject.length == 0));
        for (paramAnonymousString1 = paramAnonymousString2; ; paramAnonymousString1 = String.format(paramAnonymousString2, paramAnonymousArrayOfObject))
        {
          paramAnonymousString2 = paramAnonymousString1;
          if (paramAnonymousString1 == null)
            paramAnonymousString2 = "";
          new StringBuilder().append(paramAnonymousString2).append("  ").append(Log.getStackTraceString(paramAnonymousThrowable));
          return;
        }
      }

      public final void v(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        if ((paramAnonymousArrayOfObject == null) || (paramAnonymousArrayOfObject.length == 0));
        while (true)
        {
          return;
          String.format(paramAnonymousString2, paramAnonymousArrayOfObject);
        }
      }

      public final void w(String paramAnonymousString1, String paramAnonymousString2, Object[] paramAnonymousArrayOfObject)
      {
        if ((paramAnonymousArrayOfObject == null) || (paramAnonymousArrayOfObject.length == 0));
        while (true)
        {
          return;
          String.format(paramAnonymousString2, paramAnonymousArrayOfObject);
        }
      }
    };
  }

  public static void b(a parama)
  {
    caS = parama;
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (caS != null)
      caS.d(paramString1, paramString2, paramArrayOfObject);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (caS != null)
      caS.e(paramString1, paramString2, paramArrayOfObject);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (caS != null)
      caS.i(paramString1, paramString2, paramArrayOfObject);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    if (caS != null)
      caS.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (caS != null)
      caS.v(paramString1, paramString2, paramArrayOfObject);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (caS != null)
      caS.w(paramString1, paramString2, paramArrayOfObject);
  }

  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void e(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void i(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject);

    public abstract void v(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void w(String paramString1, String paramString2, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.d.c
 * JD-Core Version:    0.6.2
 */