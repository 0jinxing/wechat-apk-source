package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.b;

final class c$2
  implements b
{
  c$2(c paramc)
  {
  }

  public final int N(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(135469);
    if (c.a(this.kzp) != 2)
    {
      AppMethodBeat.o(135469);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      j localj = j.kzW;
      paramInt = j.P(paramArrayOfByte, paramInt);
      if (!c.j(this.kzp))
      {
        if (paramInt < 0)
        {
          AppMethodBeat.o(135469);
          paramInt = i;
        }
      }
      else
      {
        paramInt = -10086;
        AppMethodBeat.o(135469);
        continue;
        paramInt = 0;
        AppMethodBeat.o(135469);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.c.2
 * JD-Core Version:    0.6.2
 */