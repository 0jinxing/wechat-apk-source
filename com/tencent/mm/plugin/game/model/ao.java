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
import com.tencent.mm.plugin.game.d.bh;
import com.tencent.mm.plugin.game.d.bi;
import com.tencent.mm.plugin.game.d.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class ao extends m
  implements k
{
  private f ehi;
  public final b lty;

  public ao(String paramString, LinkedList<String> paramLinkedList, n paramn1, n paramn2, n paramn3, boolean paramBoolean)
  {
    AppMethodBeat.i(111439);
    ab.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext())
      ab.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    localObject = new bh();
    ((bh)localObject).nbs = paramString;
    ((bh)localObject).nbX = paramLinkedList;
    paramLinkedList = e.ef(ah.getContext());
    paramString = paramLinkedList;
    if (bo.isNullOrNil(paramLinkedList))
      paramString = bo.gQ(ah.getContext());
    if (!bo.isNullOrNil(i.countryCode))
      paramString = i.countryCode;
    while (true)
    {
      ((bh)localObject).guW = paramString;
      if (paramn1 != null);
      while (true)
      {
        ((bh)localObject).nbY = new t();
        if (paramn1 != null)
        {
          ((bh)localObject).nbY.nam = paramn1.mWr.mXl;
          ((bh)localObject).nbY.fKh = paramn1.field_appId;
          ((bh)localObject).nbY.mZo = paramn1.mXc;
          if (paramn1.field_msgType == 100)
            ((bh)localObject).nbY.nao = paramn1.mXb;
        }
        else
        {
          label228: if (paramn2 != null)
          {
            paramLinkedList = ((bh)localObject).nbY;
            paramLinkedList.nan |= 1;
          }
          if (paramn3 != null)
          {
            paramLinkedList = ((bh)localObject).nbY;
            paramLinkedList.nan |= 2;
          }
          ((bh)localObject).nbZ = ((c)com.tencent.mm.kernel.g.K(c.class)).bCY().bEw();
          ((bh)localObject).nca = paramBoolean;
          if (!com.tencent.mm.sdk.platformtools.g.dnY())
            break label428;
        }
        label428: for (int i = 1; ; i = 0)
        {
          ((bh)localObject).nbt = i;
          ab.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "Country Code: %s", new Object[] { paramString });
          paramString = new b.a();
          paramString.fsJ = ((a)localObject);
          paramString.fsK = new bi();
          paramString.uri = "/cgi-bin/mmgame-bin/getgameindexdownloadguidance";
          paramString.fsI = 2586;
          paramString.fsL = 0;
          paramString.fsM = 0;
          this.lty = paramString.acD();
          AppMethodBeat.o(111439);
          return;
          if (paramn2 != null)
          {
            paramn1 = paramn2;
            break;
          }
          if (paramn3 == null)
            break label434;
          paramn1 = paramn3;
          break;
          ((bh)localObject).nbY.nao = paramn1.field_msgType;
          break label228;
        }
        label434: paramn1 = null;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(111440);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(111440);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111441);
    ab.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111441);
  }

  public final int getType()
  {
    return 2586;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ao
 * JD-Core Version:    0.6.2
 */