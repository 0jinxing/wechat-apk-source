package com.tencent.mm.booter.notification.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bo.a;
import com.tencent.mm.m.f;

public final class c
{
  public int eem = -1;

  public final int B(String paramString, int paramInt)
  {
    AppMethodBeat.i(16010);
    this.eem = a.bWV();
    if ((!f.ja(paramInt)) || (f.kD(paramString)));
    try
    {
      this.eem = 2130840628;
      while (true)
      {
        label33: if (this.eem < 0)
          this.eem = a.bWV();
        paramInt = this.eem;
        AppMethodBeat.o(16010);
        return paramInt;
        if (f.kE(paramString))
          try
          {
            this.eem = 2130840628;
          }
          catch (Exception paramString)
          {
          }
      }
    }
    catch (Exception paramString)
    {
      break label33;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.c
 * JD-Core Version:    0.6.2
 */