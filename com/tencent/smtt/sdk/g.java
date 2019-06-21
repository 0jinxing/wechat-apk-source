package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.c;
import java.util.UnknownFormatConversionException;

public class g
{
  static int a = 5;
  static int b = 16;
  static char[] c = new char[16];
  static String d = "dex2oat-cmdline";
  static long e = 4096L;

  public static String a(Context paramContext, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(63982);
    paramContext = new c(paramString);
    paramContext.a(c);
    if (c[a] == '\001');
    while (true)
    {
      paramContext.a(bool);
      paramContext.a(e);
      paramContext = a(new String(a(paramContext)));
      AppMethodBeat.o(63982);
      return paramContext;
      bool = false;
    }
  }

  private static String a(String paramString)
  {
    AppMethodBeat.i(63983);
    String[] arrayOfString = paramString.split(new String(""));
    int i = 0;
    while (i < arrayOfString.length)
    {
      int j = i + 1;
      String str = arrayOfString[i];
      i = j + 1;
      paramString = arrayOfString[j];
      if (str.equals(d))
        AppMethodBeat.o(63983);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(63983);
    }
  }

  public static char[] a(c paramc)
  {
    AppMethodBeat.i(63984);
    char[] arrayOfChar1 = new char[4];
    char[] arrayOfChar2 = new char[4];
    paramc.a(arrayOfChar1);
    if ((arrayOfChar1[0] != 'o') || (arrayOfChar1[1] != 'a') || (arrayOfChar1[2] != 't'))
    {
      paramc = new UnknownFormatConversionException(String.format("Invalid art magic %c%c%c", new Object[] { Character.valueOf(arrayOfChar1[0]), Character.valueOf(arrayOfChar1[1]), Character.valueOf(arrayOfChar1[2]) }));
      AppMethodBeat.o(63984);
      throw paramc;
    }
    paramc.a(arrayOfChar2);
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    if (arrayOfChar2[1] <= '4')
    {
      paramc.b();
      paramc.b();
      paramc.b();
    }
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    paramc.b();
    arrayOfChar2 = new char[paramc.b()];
    paramc.a(arrayOfChar2);
    AppMethodBeat.o(63984);
    return arrayOfChar2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.g
 * JD-Core Version:    0.6.2
 */