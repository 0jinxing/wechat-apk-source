package com.tencent.mm.sdk.d;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Vector;

final class d$b
{
  private int mCount;
  private Vector<d.a> xCC;
  private int xCD;
  private int xCE;
  private boolean xCF;

  private d$b()
  {
    AppMethodBeat.i(52451);
    this.xCC = new Vector();
    this.xCD = 20;
    this.xCE = 0;
    this.mCount = 0;
    this.xCF = false;
    AppMethodBeat.o(52451);
  }

  final void b(d paramd, Message paramMessage, String paramString, a parama1, a parama2, a parama3)
  {
    try
    {
      AppMethodBeat.i(52453);
      this.mCount += 1;
      Object localObject;
      if (this.xCC.size() < this.xCD)
      {
        localObject = this.xCC;
        d.a locala = new com/tencent/mm/sdk/d/d$a;
        locala.<init>(paramd, paramMessage, paramString, parama1, parama2, parama3);
        ((Vector)localObject).add(locala);
        AppMethodBeat.o(52453);
      }
      while (true)
      {
        return;
        localObject = (d.a)this.xCC.get(this.xCE);
        this.xCE += 1;
        if (this.xCE >= this.xCD)
          this.xCE = 0;
        ((d.a)localObject).a(paramd, paramMessage, paramString, parama1, parama2, parama3);
        AppMethodBeat.o(52453);
      }
    }
    finally
    {
    }
    throw paramd;
  }

  final void cleanup()
  {
    try
    {
      AppMethodBeat.i(52452);
      this.xCC.clear();
      AppMethodBeat.o(52452);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final boolean dpR()
  {
    try
    {
      boolean bool = this.xCF;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.d.b
 * JD-Core Version:    0.6.2
 */