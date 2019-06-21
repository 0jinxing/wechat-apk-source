package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bn;

public final class n
{
  static
  {
    AppMethodBeat.i(78767);
    bn.reset();
    AppMethodBeat.o(78767);
  }

  public static void I(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(78764);
    k localk = new k();
    localk.fTj = paramInt1;
    localk.fTv = paramInt2;
    localk.bJt = 8390656;
    c(localk);
    a(localk, paramInt3);
    q.aks().a(localk);
    AppMethodBeat.o(78764);
  }

  public static void J(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(78765);
    k localk = new k();
    localk.fTi = paramInt1;
    localk.fTu = paramInt2;
    localk.bJt = 4195328;
    c(localk);
    a(localk, paramInt3);
    q.aks().a(localk);
    AppMethodBeat.o(78765);
  }

  private static void a(k paramk, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 522:
    case 138:
    case 139:
    case 110:
    case 109:
    case 123:
    case 127:
    case 128:
    case 149:
    case 150:
    }
    while (true)
    {
      return;
      paramk.fTn = (paramk.fTu + paramk.fTv);
      paramk.bJt |= 32768;
      continue;
      paramk.fTb = (paramk.fTi + paramk.fTj);
      paramk.bJt |= 8;
      continue;
      paramk.fTp = (paramk.fTu + paramk.fTv);
      paramk.bJt |= 131072;
      continue;
      paramk.fTd = (paramk.fTi + paramk.fTj);
      paramk.bJt |= 32;
      continue;
      paramk.fTr = (paramk.fTu + paramk.fTv);
      paramk.bJt |= 524288;
      continue;
      paramk.fTf = (paramk.fTi + paramk.fTj);
      paramk.bJt |= 128;
      continue;
      paramk.fTt = (paramk.fTu + paramk.fTv);
      paramk.bJt |= 2097152;
      continue;
      paramk.fTh = (paramk.fTi + paramk.fTj);
      paramk.bJt |= 512;
    }
  }

  private static void c(k paramk)
  {
    AppMethodBeat.i(78766);
    bn.update();
    paramk.fTk = ((int)bn.dpx());
    paramk.fTw = ((int)bn.dpw());
    paramk.fTl = ((int)bn.dpv());
    paramk.fTx = ((int)bn.dpu());
    paramk.fTy = ((int)bn.mv(0L));
    paramk.fTA = ((int)bn.mu(0L));
    paramk.fTz = ((int)bn.dpy());
    paramk.fTB = ((int)bn.mt(0L));
    paramk.bJt = (paramk.bJt | 0x2000 | 0x2000000 | 0x1000 | 0x1000000 | 0x8000000 | 0x20000000 | 0x4000000 | 0x10000000);
    AppMethodBeat.o(78766);
  }

  public static void cm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78763);
    if (com.tencent.mm.network.ab.ch(ah.getContext()))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetStatStorageLogic", "dknetflow wifi recv:%d send:%d type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      I(paramInt1, paramInt2, 0);
      AppMethodBeat.o(78763);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetStatStorageLogic", "dknetflow mobile recv:%d send:%d type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      J(paramInt1, paramInt2, 0);
      AppMethodBeat.o(78763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.n
 * JD-Core Version:    0.6.2
 */