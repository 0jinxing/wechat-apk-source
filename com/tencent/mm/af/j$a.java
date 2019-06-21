package com.tencent.mm.af;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public enum j$a
{
  static
  {
    AppMethodBeat.i(77770);
    fgh = new a("BUSINESS_MY_LIFE_AROUND", 0);
    fgi = new a("BUSINESS_OTHER", 1);
    fgj = new a("BUSINESS_MAX", 2);
    fgk = new a[] { fgh, fgi, fgj };
    AppMethodBeat.o(77770);
  }

  public static String b(int paramInt, String paramString, Context paramContext)
  {
    AppMethodBeat.i(77769);
    String str1 = "";
    String str2 = str1;
    if (isValid(paramInt))
    {
      str2 = str1;
      if (!bo.isNullOrNil(paramString))
      {
        paramInt = paramContext.getResources().getIdentifier(paramString, "string", paramContext.getPackageName());
        ab.d("MicroMsg.AppMessage", "id: %d.", new Object[] { Integer.valueOf(paramInt) });
        str2 = str1;
        if (paramInt > 0)
          str2 = paramContext.getResources().getString(paramInt);
      }
    }
    ab.d("MicroMsg.AppMessage", "txt: %s.", new Object[] { str2 });
    AppMethodBeat.o(77769);
    return str2;
  }

  public static boolean isValid(int paramInt)
  {
    AppMethodBeat.i(77768);
    boolean bool;
    if ((paramInt >= fgh.ordinal()) && (paramInt < fgj.ordinal()))
    {
      bool = true;
      AppMethodBeat.o(77768);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77768);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.j.a
 * JD-Core Version:    0.6.2
 */