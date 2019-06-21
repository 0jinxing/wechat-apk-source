package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.d.al;
import com.tencent.mm.plugin.game.d.bf;
import com.tencent.mm.plugin.game.d.bg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aj extends m
  implements k
{
  public static f fur;
  public static final String mYz;
  private f ehi;
  private final com.tencent.mm.ai.b lty;

  static
  {
    AppMethodBeat.i(111426);
    mYz = com.tencent.mm.loader.j.b.eSn + "Game/TabNav/";
    fur = new aj.1();
    AppMethodBeat.o(111426);
  }

  public aj()
  {
    AppMethodBeat.i(111419);
    b.a locala = new b.a();
    locala.fsJ = new bf();
    locala.fsK = new bg();
    locala.uri = "/cgi-bin/mmgame-bin/getgameindex4tabnav";
    locala.fsI = 2641;
    locala.fsL = 0;
    locala.fsM = 0;
    this.lty = locala.acD();
    AppMethodBeat.o(111419);
  }

  public static void a(bg parambg)
  {
    AppMethodBeat.i(111423);
    if (parambg == null)
      AppMethodBeat.o(111423);
    while (true)
    {
      return;
      if (bo.ek(parambg.naO))
      {
        ab.i("MicroMsg.NetSceneGameIndex4TabNav", "nav list is null");
        AppMethodBeat.o(111423);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = parambg.naO.iterator();
        while (localIterator.hasNext())
        {
          al localal = (al)localIterator.next();
          if (localal != null)
          {
            localArrayList.add(localal.naY);
            localArrayList.add(localal.naZ);
          }
        }
        a(localArrayList, new aj.2(parambg));
        AppMethodBeat.o(111423);
      }
    }
  }

  private static void a(List<String> paramList, aj.a parama)
  {
    AppMethodBeat.i(111424);
    if (bo.ek(paramList))
    {
      if (parama != null)
        parama.onComplete();
      AppMethodBeat.o(111424);
    }
    while (true)
    {
      return;
      String str = (String)paramList.remove(0);
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.NetSceneGameIndex4TabNav", "iconUrl is null");
        break;
      }
      Object localObject = mYz + com.tencent.mm.a.g.x(str.getBytes());
      c.a locala = new c.a();
      locala.ePH = true;
      locala.ePJ = ((String)localObject);
      localObject = locala.ahG();
      o.ahp().a(str, (c)localObject, new aj.3(str, paramList, parama));
      AppMethodBeat.o(111424);
    }
  }

  public static void updateData()
  {
    AppMethodBeat.i(111422);
    ab.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data");
    com.tencent.mm.kernel.g.Rg().a(2641, fur);
    aj localaj = new aj();
    com.tencent.mm.kernel.g.Rg().a(localaj, 0);
    AppMethodBeat.o(111422);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(111421);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111421);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111420);
    ab.i("MicroMsg.NetSceneGameIndex4TabNav", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111420);
  }

  public final bg bET()
  {
    return (bg)this.lty.fsH.fsP;
  }

  public final int getType()
  {
    return 2641;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aj
 * JD-Core Version:    0.6.2
 */