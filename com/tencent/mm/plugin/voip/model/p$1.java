package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class p$1
  implements ap.a
{
  p$1(p paramp)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4567);
    boolean bool;
    if (!this.sSJ.sSD)
    {
      AppMethodBeat.o(4567);
      bool = false;
      return bool;
    }
    p localp = this.sSJ;
    byte[] arrayOfByte = new byte[4];
    int[] arrayOfInt = new int[2];
    int[] tmp42_40 = arrayOfInt;
    tmp42_40[0] = -1;
    int[] tmp46_42 = tmp42_40;
    tmp46_42[1] = -1;
    tmp46_42;
    if (localp.sSz.setAppCmd(10, arrayOfByte, 4) < 0)
    {
      ab.d("MicroMsg.VoipNetStatusChecker", "get netStatus failed");
      label72: if (arrayOfInt[0] != -1)
      {
        this.sSJ.sSC = arrayOfInt[0];
        this.sSJ.sSF = (this.sSJ.sSC + this.sSJ.sSF);
        localp = this.sSJ;
        localp.sSG += 1;
        if (arrayOfInt[1] != 0)
          break label209;
        p.a(this.sSJ, true);
      }
    }
    while (true)
    {
      AppMethodBeat.o(4567);
      bool = true;
      break;
      int i = bo.bf(arrayOfByte);
      arrayOfInt[0] = i;
      arrayOfInt[1] = localp.sSz.GetNetBottleneckSide();
      ab.d("MicroMsg.VoipNetStatusChecker", "netStatus: %d net_bottleneck_side %d", new Object[] { Integer.valueOf(i), Integer.valueOf(arrayOfInt[1]) });
      break label72;
      label209: p.a(this.sSJ, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.p.1
 * JD-Core Version:    0.6.2
 */