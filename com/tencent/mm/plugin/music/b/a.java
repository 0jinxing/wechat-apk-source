package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.b;
import com.tencent.mm.ag.d;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static boolean a(t paramt)
  {
    boolean bool = true;
    AppMethodBeat.i(137260);
    if (paramt.csI.action != 6)
      ab.d("MicroMsg.Audio.AudioActionListener", "callback, action:%d", new Object[] { Integer.valueOf(paramt.csI.action) });
    switch (paramt.csI.action)
    {
    default:
    case 10:
    case 0:
    case 1:
    case 2:
    case 3:
    case 14:
    case 5:
    case 4:
    case 8:
    case 7:
    case 17:
    case 13:
    case 6:
    case 11:
    case 12:
    case 9:
    case 15:
    case 16:
    case 18:
    case 19:
    }
    while (true)
    {
      AppMethodBeat.o(137260);
      return bool;
      Object localObject = f.bSA().fk(paramt.csI.appId, paramt.csI.ckD);
      paramt.csI.ckD = ((String)localObject);
      continue;
      bool = f.bSA().h(paramt.csI.csL);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().b(paramt.csI.ckD, paramt.csI.csL);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().St(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().Su(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().Sv(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().Sw(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().cF(paramt.csI.ckD, paramt.csI.csK);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().Sx(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().pN(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().dZ(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      bool = f.bSA().Sy(paramt.csI.ckD);
      paramt.csJ.csN = bool;
      continue;
      localObject = f.bSA().Sz(paramt.csI.ckD);
      paramt.csJ.csO = ((d)localObject);
      continue;
      int i = f.bSA().SA(paramt.csI.appId);
      paramt.csJ.count = i;
      continue;
      f.bSA().SC(paramt.csI.appId);
      continue;
      f.bSA().SD(paramt.csI.appId);
      continue;
      f.bSA().SK(paramt.csI.processName);
      continue;
      localObject = f.bSA().pO(paramt.csI.ckD);
      paramt.csI.csL = ((b)localObject);
      continue;
      bool = f.bSA().g(paramt.csI.csL);
      paramt.csJ.csN = bool;
      continue;
      f.bSA().csM = paramt.csI.csM;
      paramt.csJ.csN = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.a
 * JD-Core Version:    0.6.2
 */