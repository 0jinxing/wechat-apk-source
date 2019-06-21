package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bt.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bj;
import com.tencent.mm.plugin.game.d.bk;
import com.tencent.mm.plugin.game.d.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class ap extends m
  implements k
{
  private f ehi;
  public final b lty;

  public ap(String paramString, LinkedList<String> paramLinkedList, n paramn1, n paramn2, n paramn3, boolean paramBoolean)
  {
    AppMethodBeat.i(111442);
    ab.i("MicroMsg.NetSceneGetGameIndexForeign", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext())
      ab.i("MicroMsg.NetSceneGetGameIndexForeign", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    localObject = new bj();
    ((bj)localObject).nbs = paramString;
    ((bj)localObject).nbX = paramLinkedList;
    paramLinkedList = e.ef(ah.getContext());
    paramString = paramLinkedList;
    if (bo.isNullOrNil(paramLinkedList))
      paramString = bo.gQ(ah.getContext());
    if (!bo.isNullOrNil(i.countryCode))
      paramString = i.countryCode;
    while (true)
    {
      ((bj)localObject).guW = paramString;
      if (paramn1 != null);
      while (true)
      {
        ((bj)localObject).nbY = new t();
        if (paramn1 != null)
        {
          ((bj)localObject).nbY.nam = paramn1.mWr.mXl;
          ((bj)localObject).nbY.fKh = paramn1.field_appId;
          ((bj)localObject).nbY.mZo = paramn1.mXc;
          if (paramn1.field_msgType == 100)
            ((bj)localObject).nbY.nao = paramn1.mXb;
        }
        else
        {
          label228: if (paramn2 != null)
          {
            paramLinkedList = ((bj)localObject).nbY;
            paramLinkedList.nan |= 1;
          }
          if (paramn3 != null)
          {
            paramLinkedList = ((bj)localObject).nbY;
            paramLinkedList.nan |= 2;
          }
          ((bj)localObject).nbZ = ((c)com.tencent.mm.kernel.g.K(c.class)).bCY().bEw();
          ((bj)localObject).nca = paramBoolean;
          if (!com.tencent.mm.sdk.platformtools.g.dnY())
            break label466;
        }
        label466: for (int i = 1; ; i = 0)
        {
          ((bj)localObject).nbt = i;
          ab.i("MicroMsg.NetSceneGetGameIndexForeign", "Country Code: %s", new Object[] { paramString });
          if ((!bo.isNullOrNil(((bj)localObject).guW)) && ("CN".equalsIgnoreCase(((bj)localObject).guW)))
            h.pYm.a(860L, 8L, 1L, false);
          paramString = new b.a();
          paramString.fsJ = ((a)localObject);
          paramString.fsK = new bk();
          paramString.uri = "/cgi-bin/mmgame-bin/getgameindexforeign";
          paramString.fsI = 2855;
          paramString.fsL = 0;
          paramString.fsM = 0;
          this.lty = paramString.acD();
          AppMethodBeat.o(111442);
          return;
          if (paramn2 != null)
          {
            paramn1 = paramn2;
            break;
          }
          if (paramn3 == null)
            break label472;
          paramn1 = paramn3;
          break;
          ((bj)localObject).nbY.nao = paramn1.field_msgType;
          break label228;
        }
        label472: paramn1 = null;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(111443);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111443);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111444);
    ab.i("MicroMsg.NetSceneGetGameIndexForeign", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111444);
  }

  public final int getType()
  {
    return 2855;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ap
 * JD-Core Version:    0.6.2
 */