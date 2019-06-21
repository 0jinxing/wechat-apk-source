package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.m.a;
import com.tencent.mm.protocal.m.b;
import com.tencent.mm.protocal.protobuf.ja;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends com.tencent.mm.ai.m
  implements k
{
  private f ehi;
  private q ftU;

  private c(boolean paramBoolean)
  {
    AppMethodBeat.i(16556);
    this.ftU = new c.a();
    m.a locala = (m.a)this.ftU.acF();
    locala.netType = com.tencent.mm.protocal.m.getNetType(ah.getContext());
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      locala.vyo = i;
      AppMethodBeat.o(16556);
      return;
    }
  }

  private static boolean aiS()
  {
    AppMethodBeat.i(16555);
    int i;
    boolean bool;
    if (ae.gjf != -1)
    {
      i = ae.gjf;
      bool = b.foreground;
      ab.i("MicroMsg.NetSceneBgFg", "somr DynamicConfig checkBit:%d TestMuteRoomEnable:%d muteRoomDisable:%d fg:%b", new Object[] { Integer.valueOf(1), Integer.valueOf(ae.gjf), Integer.valueOf(i), Boolean.valueOf(bool) });
      if ((i & 0x1) == 0)
        break label112;
      bool = true;
    }
    label112: 
    while (true)
    {
      while (true)
      {
        AppMethodBeat.o(16555);
        return bool;
        try
        {
          i = bo.getInt(g.Nu().getValue("MuteRoomDisable"), 0);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneBgFg", localException, "", new Object[0]);
          i = 0;
        }
      }
      break;
    }
  }

  public static void cQ(boolean paramBoolean)
  {
    AppMethodBeat.i(16554);
    ab.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom isFg[%s], accHasReady[%s] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(aw.RK()), bo.dpG() });
    if (!aw.RK())
      AppMethodBeat.o(16554);
    while (true)
    {
      return;
      if ((aw.Rg() == null) || (aw.Rg().ftA == null) || (aw.Rg().ftA.adg() == null))
      {
        ab.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom push not rready");
        AppMethodBeat.o(16554);
      }
      else
      {
        aw.Rg().ftA.adg().cE(paramBoolean);
        if (paramBoolean)
        {
          aw.Rg().a(new c(true), 0);
          AppMethodBeat.o(16554);
        }
        else
        {
          c localc = new c(aiS());
          aw.Rg().a(localc, 0);
          AppMethodBeat.o(16554);
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(16557);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(16557);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16558);
    ab.d("MicroMsg.NetSceneBgFg", " ret[%d]", new Object[] { Integer.valueOf(((m.b)paramq.ZS()).vyp.kCl) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16558);
  }

  public final int getType()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.c
 * JD-Core Version:    0.6.2
 */