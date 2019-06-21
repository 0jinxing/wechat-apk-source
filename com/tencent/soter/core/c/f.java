package com.tencent.soter.core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class f
{
  public String aIm;
  public int errCode;

  public f(int paramInt)
  {
    AppMethodBeat.i(73034);
    this.errCode = paramInt;
    switch (this.errCode)
    {
    case 1:
    default:
      this.aIm = "errmsg not specified";
      AppMethodBeat.o(73034);
    case 0:
    case 2:
    }
    while (true)
    {
      return;
      this.aIm = "ok";
      AppMethodBeat.o(73034);
      continue;
      this.aIm = "device not support soter";
      AppMethodBeat.o(73034);
    }
  }

  public f(int paramInt, String paramString)
  {
    this(paramInt);
    AppMethodBeat.i(73033);
    if (!g.isNullOrNil(paramString))
      this.aIm = paramString;
    AppMethodBeat.o(73033);
  }

  public boolean equals(Object paramObject)
  {
    if (((paramObject instanceof f)) && (((f)paramObject).errCode == this.errCode));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isSuccess()
  {
    if (this.errCode == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    AppMethodBeat.i(73035);
    String str = "SoterCoreResult{errCode=" + this.errCode + ", errMsg='" + this.aIm + '\'' + '}';
    AppMethodBeat.o(73035);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.f
 * JD-Core Version:    0.6.2
 */