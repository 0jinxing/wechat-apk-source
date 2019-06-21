package com.tencent.mm.plugin.misc.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.network.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2 extends n.a
{
  b$2(b paramb)
  {
  }

  public final void gl(int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(50513);
    try
    {
      if (!b.bOP())
      {
        b.a(this.orr, 0);
        AppMethodBeat.o(50513);
      }
      while (true)
      {
        return;
        String str1 = q.LX();
        ab.i("MicroMsg.SimcardService", "onNetworkChange imsi[%s]", new Object[] { str1 });
        if (str1.equals(b.access$300()))
          break;
        ab.i("MicroMsg.SimcardService", "imsi change old[%s] new[%s]", new Object[] { b.access$300(), str1 });
        b.NW(str1);
        if (paramInt == 0)
          break label182;
        b.b(this.orr);
        b.c(this.orr);
        this.orr.yy(2);
        AppMethodBeat.o(50513);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SimcardService", localException, "", new Object[0]);
        AppMethodBeat.o(50513);
        continue;
        String str2 = b.bOQ();
        if (!str2.equals(b.access$500()))
        {
          ab.i("MicroMsg.SimcardService", "clientIp change old[%s] new[%s]", new Object[] { b.access$500(), str2 });
          b.RG(str2);
          continue;
          label182: b.a(this.orr, b.d(this.orr));
          AppMethodBeat.o(50513);
        }
        else
        {
          paramInt = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.misc.b.b.2
 * JD-Core Version:    0.6.2
 */