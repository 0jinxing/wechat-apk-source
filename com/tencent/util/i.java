package com.tencent.util;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.b;
import java.util.HashMap;

public final class i
{
  public static boolean AIi;
  private static HashMap<String, Long> AIj;
  private static h AIk;

  static
  {
    AppMethodBeat.i(86621);
    AIi = false;
    AIj = new HashMap();
    AIk = null;
    AppMethodBeat.o(86621);
  }

  public static int a(Object paramObject, String paramString, Throwable paramThrowable)
  {
    int i = 0;
    AppMethodBeat.i(86620);
    if (b.AIF)
    {
      paramObject = dg(paramObject);
      if (AIk != null)
        AppMethodBeat.o(86620);
    }
    while (true)
    {
      return i;
      if (b.AIF)
      {
        i = Log.e(paramObject, paramString, paramThrowable);
        AppMethodBeat.o(86620);
      }
      else
      {
        AppMethodBeat.o(86620);
      }
    }
  }

  private static String dg(Object paramObject)
  {
    AppMethodBeat.i(86615);
    if (paramObject == null)
    {
      paramObject = "filter process";
      AppMethodBeat.o(86615);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        AppMethodBeat.o(86615);
      }
      else
      {
        paramObject = paramObject.getClass().getSimpleName();
        AppMethodBeat.o(86615);
      }
    }
  }

  public static int j(Object paramObject, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(86616);
    if (b.AIF)
    {
      paramObject = dg(paramObject);
      if (AIk != null)
        AppMethodBeat.o(86616);
    }
    while (true)
    {
      return i;
      if (b.AIF)
      {
        i = Log.i(paramObject, paramString);
        AppMethodBeat.o(86616);
      }
      else
      {
        AppMethodBeat.o(86616);
      }
    }
  }

  public static int k(Object paramObject, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(86617);
    if (b.AIF)
    {
      paramObject = dg(paramObject);
      if (AIk != null)
        AppMethodBeat.o(86617);
    }
    while (true)
    {
      return i;
      if (b.AIF)
      {
        i = Log.d(paramObject, paramString);
        AppMethodBeat.o(86617);
      }
      else
      {
        AppMethodBeat.o(86617);
      }
    }
  }

  public static int l(Object paramObject, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(86618);
    if (b.AIJ)
    {
      paramObject = dg(paramObject);
      if (AIk != null)
        AppMethodBeat.o(86618);
    }
    while (true)
    {
      return i;
      if (b.AIF)
      {
        i = Log.d(paramObject, paramString);
        AppMethodBeat.o(86618);
      }
      else
      {
        AppMethodBeat.o(86618);
      }
    }
  }

  public static int m(Object paramObject, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(86619);
    if (b.AIF)
    {
      paramObject = dg(paramObject);
      if (AIk != null)
        AppMethodBeat.o(86619);
    }
    while (true)
    {
      return i;
      if (b.AIF)
      {
        i = Log.e(paramObject, paramString);
        AppMethodBeat.o(86619);
      }
      else
      {
        AppMethodBeat.o(86619);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.util.i
 * JD-Core Version:    0.6.2
 */