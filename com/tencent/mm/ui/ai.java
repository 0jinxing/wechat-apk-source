package com.tencent.mm.ui;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ai
{
  private static a yqS;
  private static a yqT;

  static
  {
    AppMethodBeat.i(112481);
    a local1 = new a()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2)
      {
      }

      public final void e(String paramAnonymousString1, String paramAnonymousString2)
      {
      }

      public final void i(String paramAnonymousString1, String paramAnonymousString2)
      {
      }

      public final void v(String paramAnonymousString1, String paramAnonymousString2)
      {
      }

      public final void w(String paramAnonymousString1, String paramAnonymousString2)
      {
      }
    };
    yqS = local1;
    yqT = local1;
    AppMethodBeat.o(112481);
  }

  public static void a(a parama)
  {
    yqT = parama;
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(112476);
    if (yqT != null)
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      yqT.d(paramString1, paramString2);
    }
    AppMethodBeat.o(112476);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(112479);
    if (yqT != null)
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      yqT.e(paramString1, paramString2);
    }
    AppMethodBeat.o(112479);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(112477);
    if (yqT != null)
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      yqT.i(paramString1, paramString2);
    }
    AppMethodBeat.o(112477);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(112480);
    if (yqT != null)
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      paramThrowable = paramString2 + "  " + Log.getStackTraceString(paramThrowable);
      yqT.e(paramString1, paramThrowable);
    }
    AppMethodBeat.o(112480);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(112475);
    if (yqT != null)
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      yqT.v(paramString1, paramString2);
    }
    AppMethodBeat.o(112475);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(112478);
    if (yqT != null)
    {
      paramArrayOfObject = String.format(paramString2, paramArrayOfObject);
      paramString2 = paramArrayOfObject;
      if (paramArrayOfObject == null)
        paramString2 = "";
      yqT.w(paramString1, paramString2);
    }
    AppMethodBeat.o(112478);
  }

  public static abstract interface a
  {
    public abstract void d(String paramString1, String paramString2);

    public abstract void e(String paramString1, String paramString2);

    public abstract void i(String paramString1, String paramString2);

    public abstract void v(String paramString1, String paramString2);

    public abstract void w(String paramString1, String paramString2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ai
 * JD-Core Version:    0.6.2
 */