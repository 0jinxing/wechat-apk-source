package com.tencent.mm.plugin.facedetect.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import java.util.ArrayList;
import java.util.Iterator;

final class a$1
  implements c.a
{
  a$1(a parama)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(284);
    if (a.i(this.lUY) != null)
    {
      Iterator localIterator = a.i(this.lUY).iterator();
      while (localIterator.hasNext())
      {
        c.a locala = (c.a)localIterator.next();
        if (locala != null)
          locala.bN(paramInt1, paramInt2);
      }
    }
    AppMethodBeat.o(284);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(283);
    if (a.i(this.lUY) != null)
    {
      Iterator localIterator = a.i(this.lUY).iterator();
      while (localIterator.hasNext())
      {
        c.a locala = (c.a)localIterator.next();
        if (locala != null)
          locala.u(paramArrayOfByte, paramInt);
      }
    }
    AppMethodBeat.o(283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.a.1
 * JD-Core Version:    0.6.2
 */