package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.aoe;
import com.tencent.mm.protocal.protobuf.aof;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class e extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  public LinkedList<String> kdX;
  public LinkedList<String> kdY;

  public e(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(88027);
    this.kdY = new LinkedList();
    this.kdX = paramLinkedList;
    b.a locala = new b.a();
    locala.fsJ = new aoe();
    locala.fsK = new aof();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecardlist";
    locala.fsI = 903;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((aoe)this.ehh.fsG.fsP).vKf = paramLinkedList;
    ab.i("MicroMsg.NetSceneGetShareCardList", "card_ids length is " + paramLinkedList.size());
    AppMethodBeat.o(88027);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(88029);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88029);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88028);
    ab.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(903), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(88028);
    }
    while (true)
    {
      return;
      paramq = (aof)this.ehh.fsH.fsP;
      ab.v("MicroMsg.NetSceneGetShareCardList", "json:" + paramq.kdS);
      paramq = paramq.kdS;
      if (TextUtils.isEmpty(paramq))
      {
        ab.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd fail, resp json_ret is null");
        this.ehi.onSceneEnd(4, -1, null, this);
        AppMethodBeat.o(88028);
      }
      else
      {
        long l1 = System.currentTimeMillis();
        paramq = com.tencent.mm.plugin.card.d.f.Hf(paramq);
        if (paramq != null)
        {
          if (this.kdX != null)
            this.kdY.addAll(this.kdX);
          long l2 = System.currentTimeMillis();
          long l3 = g.RP().eJN.iV(Thread.currentThread().getId());
          paramInt1 = 0;
          Object localObject = paramq.iterator();
          int i = 0;
          while (((Iterator)localObject).hasNext())
          {
            paramArrayOfByte = (ShareCardInfo)((Iterator)localObject).next();
            int j = paramInt1 + 1;
            if (!l.a(paramArrayOfByte))
            {
              i++;
              this.kdY.remove(paramArrayOfByte.field_card_id);
              paramInt1 = j;
            }
            else
            {
              ab.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd update share card count");
              com.tencent.mm.plugin.card.sharecard.a.b.ad(ah.getContext(), paramArrayOfByte.field_card_tp_id);
              paramInt1 = j;
              if (paramArrayOfByte.field_status != 0)
              {
                com.tencent.mm.plugin.card.sharecard.a.b.dn(paramArrayOfByte.field_card_id, paramArrayOfByte.field_card_tp_id);
                paramInt1 = j;
              }
            }
          }
          g.RP().eJN.mB(l3);
          ab.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          ab.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
          l.beD();
          if (paramq.size() > 0)
          {
            paramInt1 = (int)(System.currentTimeMillis() - l1);
            ArrayList localArrayList = new ArrayList();
            localObject = new IDKey();
            ((IDKey)localObject).SetID(281);
            ((IDKey)localObject).SetKey(17);
            ((IDKey)localObject).SetValue(1L);
            paramArrayOfByte = new IDKey();
            paramArrayOfByte.SetID(281);
            paramArrayOfByte.SetKey(18);
            paramArrayOfByte.SetValue(paramInt1);
            IDKey localIDKey1 = new IDKey();
            localIDKey1.SetID(281);
            localIDKey1.SetKey(19);
            localIDKey1.SetValue(paramq.size());
            IDKey localIDKey2 = new IDKey();
            localIDKey2.SetID(281);
            localIDKey2.SetKey(21);
            localIDKey2.SetValue(paramInt1 / paramq.size());
            localArrayList.add(localObject);
            localArrayList.add(paramArrayOfByte);
            localArrayList.add(localIDKey1);
            localArrayList.add(localIDKey2);
            com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, true);
          }
        }
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(88028);
      }
    }
  }

  public final int getType()
  {
    return 903;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.e
 * JD-Core Version:    0.6.2
 */