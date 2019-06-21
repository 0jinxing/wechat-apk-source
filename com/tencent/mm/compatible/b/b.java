package com.tencent.mm.compatible.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.Lock;

public final class b
{
  public int eoJ = 0;
  public int eoK = 0;
  public byte[] eoL = null;
  public int eoM = 0;
  public int eoN = 0;
  public boolean eoO = false;
  public Lock eoP = null;

  public final int KH()
  {
    AppMethodBeat.i(92829);
    if (this.eoO)
      this.eoP.lock();
    int i;
    if (this.eoM == this.eoN)
    {
      i = 0;
      AppMethodBeat.o(92829);
      return i;
    }
    if (this.eoM < this.eoN)
      this.eoK = (this.eoN - this.eoM);
    while (true)
    {
      if (this.eoO)
        this.eoP.unlock();
      i = this.eoK;
      AppMethodBeat.o(92829);
      break;
      if (this.eoM > this.eoN)
        this.eoK = (this.eoN + this.eoJ - this.eoM);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.b
 * JD-Core Version:    0.6.2
 */