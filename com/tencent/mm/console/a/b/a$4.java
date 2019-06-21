package com.tencent.mm.console.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.List;

final class a$4
  implements a.a
{
  a$4(a parama, String paramString, int paramInt, int[] paramArrayOfInt, b paramb)
  {
  }

  public final void execute()
  {
    AppMethodBeat.i(16157);
    ab.i("MicroMsg.AgingTestCommand", "[oneliang] batch insert test msg info, begin single transaction, username:%s", new Object[] { this.eiH });
    long l1 = System.currentTimeMillis();
    int i = 0;
    if (i < this.ewI)
    {
      int j = a.jg(this.ewJ.length);
      int k = this.ewJ[j];
      c localc = null;
      bi localbi;
      label106: long l2;
      switch (k)
      {
      default:
        localbi = a.H(this.eiH, i);
        l2 = ((j)g.K(j.class)).bOr().Z(localbi);
        if (l2 <= 0L)
          if (i > 0)
            j = i - 1;
        break;
      case 3:
      case 43:
      case 47:
      }
      while (true)
      {
        i = j + 1;
        break;
        j = i;
        if (!this.ewD.ewL.isEmpty())
        {
          localbi = a.a(this.eiH, (c)this.ewD.ewL.get(a.jg(this.ewD.ewL.size())));
          break label106;
          j = i;
          if (!this.ewD.ewM.isEmpty())
          {
            localc = (c)this.ewD.ewM.get(a.jg(this.ewD.ewM.size()));
            localbi = a.b(this.eiH, localc);
            break label106;
            j = i;
            if (!this.ewD.ewN.isEmpty())
            {
              localbi = a.c(this.eiH, (c)this.ewD.ewN.get(a.jg(this.ewD.ewN.size())));
              break label106;
              j = 0;
              continue;
              j = i;
              if (k == 43)
              {
                o.all().b(a.a(this.eiH, (int)l2, localbi, localc));
                j = i;
              }
            }
          }
        }
      }
    }
    ab.i("MicroMsg.AgingTestCommand", "[oneliang] batch insert test msg info, end single transaction, username:%s, cost:%s", new Object[] { this.eiH, Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(16157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.b.a.4
 * JD-Core Version:    0.6.2
 */