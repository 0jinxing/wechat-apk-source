package com.tencent.mm.plugin.misc.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.q;

final class a$1
  implements Runnable
{
  a$1(a parama, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(50504);
    int j = this.crb.getType();
    Object localObject = this.crb.ftl;
    int k = i;
    if (j != 1616)
    {
      k = i;
      if (j != 1518)
      {
        if (j != 385)
          break label73;
        k = i;
      }
    }
    while (true)
    {
      a.A(k, this.crc, this.crd, j);
      AppMethodBeat.o(50504);
      return;
      label73: if (localObject != null)
      {
        localObject = ((q)localObject).getUri();
        if (localObject != null)
        {
          k = i;
          if (((String)localObject).startsWith("/cgi-bin/mmpay-bin/"))
            continue;
        }
      }
      else
      {
        k = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.misc.b.a.1
 * JD-Core Version:    0.6.2
 */