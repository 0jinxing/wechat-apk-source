package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum am$a
{
  static
  {
    AppMethodBeat.i(131997);
    iiK = new a("Ok", 0);
    iiL = new a("Fail", 1);
    iiM = new a("Timeout", 2);
    iiN = new a("CgiFail", 3);
    iiO = new a("ResponseInvalid", 4);
    iiP = new a("AwaitFail", 5);
    iiQ = new a[] { iiK, iiL, iiM, iiN, iiO, iiP };
    AppMethodBeat.o(131997);
  }

  public static a pa(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(131996);
    Object localObject2;
    if (paramInt < 0)
    {
      AppMethodBeat.o(131996);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      a[] arrayOfa = values();
      int i = arrayOfa.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label65;
        localObject2 = arrayOfa[j];
        if (localObject2.ordinal() == paramInt)
        {
          AppMethodBeat.o(131996);
          break;
        }
      }
      label65: AppMethodBeat.o(131996);
      localObject2 = localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.am.a
 * JD-Core Version:    0.6.2
 */