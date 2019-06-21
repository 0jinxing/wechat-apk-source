package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class bg<T>
{
  public Object[] gH;
  public int gI;

  public bg(int paramInt)
  {
    AppMethodBeat.i(52275);
    if (paramInt <= 0)
    {
      ab.e("MicroMsg.SimpleObjectPool", "The max pool size must be > 0");
      AppMethodBeat.o(52275);
    }
    while (true)
    {
      return;
      this.gH = new Object[paramInt];
      AppMethodBeat.o(52275);
    }
  }

  public T aA()
  {
    Object localObject = null;
    if (this.gH == null);
    while (true)
    {
      return localObject;
      if (this.gI > 0)
      {
        int i = this.gI - 1;
        localObject = this.gH[i];
        this.gH[i] = null;
        this.gI -= 1;
      }
    }
  }

  public boolean release(T paramT)
  {
    boolean bool = false;
    AppMethodBeat.i(52276);
    if (this.gH == null)
      AppMethodBeat.o(52276);
    while (true)
    {
      return bool;
      if (this.gH != null)
      {
        i = 0;
        label30: if (i < this.gI)
          if (this.gH[i] != paramT);
      }
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label73;
        AppMethodBeat.o(52276);
        break;
        i++;
        break label30;
      }
      label73: if ((this.gI < this.gH.length) && (this.gI >= 0))
      {
        this.gH[this.gI] = paramT;
        this.gI += 1;
        AppMethodBeat.o(52276);
        bool = true;
      }
      else
      {
        ab.e("MicroMsg.SimpleObjectPool", "error index %d %d", new Object[] { Integer.valueOf(this.gI), Integer.valueOf(this.gH.length) });
        AppMethodBeat.o(52276);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bg
 * JD-Core Version:    0.6.2
 */