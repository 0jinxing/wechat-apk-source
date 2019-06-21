package com.tencent.mm.plugin.gwallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public int nqa;
  String nqb;

  public c(int paramInt, String paramString)
  {
    AppMethodBeat.i(41705);
    this.nqa = paramInt;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      this.nqb = b.wR(paramInt);
      AppMethodBeat.o(41705);
    }
    while (true)
    {
      return;
      this.nqb = (paramString + " (response: " + b.wR(paramInt) + ")");
      AppMethodBeat.o(41705);
    }
  }

  public final int bFQ()
  {
    int i;
    switch (this.nqa)
    {
    default:
      i = this.nqa;
    case 0:
    case 1:
    case -1009:
    case -1002:
    case -1001:
    case -1000:
    case 2:
    case 3:
    case 4:
    case 6:
    case 5:
    case 7:
    case 8:
    case -2001:
    case -1004:
    }
    while (true)
    {
      return i;
      i = 0;
      continue;
      i = 1;
      continue;
      i = 5;
      continue;
      i = 6;
      continue;
      i = 100000002;
      continue;
      i = 106;
      continue;
      i = 3;
    }
  }

  public final boolean isSuccess()
  {
    if (this.nqa == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(41706);
    String str = "IapResult: " + this.nqb;
    AppMethodBeat.o(41706);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.c
 * JD-Core Version:    0.6.2
 */