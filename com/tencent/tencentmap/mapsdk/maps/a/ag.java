package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class ag
{
  public static boolean a = false;
  public static boolean b = false;

  private static void a(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98421);
    int i;
    if (a)
    {
      i = 1;
      if ((i == 0) || (paramString2 == null))
        break label50;
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length != 0))
        break label41;
      AppMethodBeat.o(98421);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label41: String.format(Locale.US, paramString2, paramArrayOfObject);
      label50: AppMethodBeat.o(98421);
    }
  }

  public static void a(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98416);
    int i;
    if (a)
    {
      i = 1;
      if ((i == 0) || (paramString == null))
        break label50;
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length != 0))
        break label41;
      AppMethodBeat.o(98416);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label41: String.format(Locale.US, paramString, paramArrayOfObject);
      label50: AppMethodBeat.o(98416);
    }
  }

  public static void a(Throwable paramThrowable)
  {
    AppMethodBeat.i(98420);
    int i;
    if ((paramThrowable != null) && ((paramThrowable instanceof Throwable)))
      if (a)
      {
        i = 1;
        if (i == 0)
          break label39;
        AppMethodBeat.o(98420);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label39: d(paramThrowable.getMessage(), new Object[0]);
      AppMethodBeat.o(98420);
    }
  }

  public static void b(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98417);
    int i;
    if (a)
    {
      i = 1;
      if ((i == 0) || (paramString == null))
        break label50;
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length != 0))
        break label41;
      AppMethodBeat.o(98417);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label41: String.format(Locale.US, paramString, paramArrayOfObject);
      label50: AppMethodBeat.o(98417);
    }
  }

  public static void c(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98418);
    if (paramString != null)
      if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
        AppMethodBeat.o(98418);
    while (true)
    {
      return;
      String.format(Locale.US, paramString, paramArrayOfObject);
      AppMethodBeat.o(98418);
    }
  }

  public static void d(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98419);
    if (paramString != null)
      if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
        AppMethodBeat.o(98419);
    while (true)
    {
      return;
      String.format(Locale.US, paramString, paramArrayOfObject);
      AppMethodBeat.o(98419);
    }
  }

  public static void e(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98422);
    a("beacon_step_api", paramString, paramArrayOfObject);
    AppMethodBeat.o(98422);
  }

  public static void f(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98423);
    a("beacon_step_buffer", paramString, paramArrayOfObject);
    AppMethodBeat.o(98423);
  }

  public static void g(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98424);
    a("beacon_step_db", paramString, paramArrayOfObject);
    AppMethodBeat.o(98424);
  }

  public static void h(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98425);
    a("beacon_step_upload", paramString, paramArrayOfObject);
    AppMethodBeat.o(98425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ag
 * JD-Core Version:    0.6.2
 */