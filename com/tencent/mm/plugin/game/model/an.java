package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bd;
import com.tencent.mm.plugin.game.d.be;
import com.tencent.mm.plugin.game.d.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class an extends m
  implements k
{
  private f ehi;
  public final b lty;

  public an(String paramString, LinkedList<String> paramLinkedList, n paramn1, n paramn2, n paramn3, boolean paramBoolean)
  {
    AppMethodBeat.i(111436);
    ab.i("MicroMsg.NetSceneGetGameIndex4", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext())
      ab.i("MicroMsg.NetSceneGetGameIndex4", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    localObject = new b.a();
    ((b.a)localObject).fsJ = new bd();
    ((b.a)localObject).fsK = new be();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgameindex4";
    ((b.a)localObject).fsI = 2994;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (bd)this.lty.fsG.fsP;
    ((bd)localObject).nbs = paramString;
    ((bd)localObject).nbX = paramLinkedList;
    paramLinkedList = e.ef(ah.getContext());
    paramString = paramLinkedList;
    if (bo.isNullOrNil(paramLinkedList))
      paramString = bo.gQ(ah.getContext());
    if (!bo.isNullOrNil(i.countryCode))
      paramString = i.countryCode;
    while (true)
    {
      ((bd)localObject).guW = paramString;
      if (paramn1 != null);
      while (true)
      {
        ((bd)localObject).nbY = new t();
        if (paramn1 != null)
        {
          ((bd)localObject).nbY.nam = paramn1.mWr.mXl;
          ((bd)localObject).nbY.fKh = paramn1.field_appId;
          ((bd)localObject).nbY.mZo = paramn1.mXc;
          if (paramn1.field_msgType == 100)
            ((bd)localObject).nbY.nao = paramn1.mXb;
        }
        else
        {
          label303: if (paramn2 != null)
          {
            paramLinkedList = ((bd)localObject).nbY;
            paramLinkedList.nan |= 1;
          }
          if (paramn3 != null)
          {
            paramLinkedList = ((bd)localObject).nbY;
            paramLinkedList.nan |= 2;
          }
          ((bd)localObject).nbZ = ((c)com.tencent.mm.kernel.g.K(c.class)).bCY().bEw();
          ((bd)localObject).nca = paramBoolean;
          if (!com.tencent.mm.sdk.platformtools.g.dnY())
            break label485;
        }
        label485: for (int i = 1; ; i = 0)
        {
          ((bd)localObject).nbt = i;
          ab.i("MicroMsg.NetSceneGetGameIndex4", "Country Code: %s", new Object[] { paramString });
          if ((!bo.isNullOrNil(((bd)localObject).guW)) && (!"CN".equalsIgnoreCase(((bd)localObject).guW)))
            h.pYm.a(860L, 7L, 1L, false);
          AppMethodBeat.o(111436);
          return;
          if (paramn2 != null)
          {
            paramn1 = paramn2;
            break;
          }
          if (paramn3 == null)
            break label491;
          paramn1 = paramn3;
          break;
          ((bd)localObject).nbY.nao = paramn1.field_msgType;
          break label303;
        }
        label491: paramn1 = null;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(111437);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111437);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111438);
    ab.i("MicroMsg.NetSceneGetGameIndex4", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111438);
  }

  public final int getType()
  {
    return 2994;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.an
 * JD-Core Version:    0.6.2
 */