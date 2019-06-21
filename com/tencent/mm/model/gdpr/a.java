package com.tencent.mm.model.gdpr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public enum a
{
  public final String fon;
  public final int foo;

  static
  {
    AppMethodBeat.i(1487);
    fok = new a("MINI_PROGRAM", 0, "miniProgram", 1);
    fol = new a("BIZ", 1, "officialAccount", 0);
    fom = new a("OPENSDK", 2, "OPENSDK", 2);
    fop = new a[] { fok, fol, fom };
    AppMethodBeat.o(1487);
  }

  private a(String paramString, int paramInt)
  {
    this.fon = paramString;
    this.foo = paramInt;
  }

  public static boolean oX(String paramString)
  {
    AppMethodBeat.i(1485);
    boolean bool;
    if (oY(paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(1485);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1485);
    }
  }

  public static a oY(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1486);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1486);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      a[] arrayOfa = values();
      int i = arrayOfa.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label77;
        a locala = arrayOfa[j];
        if (paramString.equals(locala.fon))
        {
          AppMethodBeat.o(1486);
          paramString = locala;
          break;
        }
      }
      label77: AppMethodBeat.o(1486);
      paramString = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.a
 * JD-Core Version:    0.6.2
 */