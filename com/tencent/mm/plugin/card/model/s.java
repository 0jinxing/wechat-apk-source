package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.ic;
import com.tencent.mm.protocal.protobuf.id;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class s extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private LinkedList<ak> kdX;
  public LinkedList<ak> kdY;

  public s(LinkedList<ak> paramLinkedList)
  {
    AppMethodBeat.i(87869);
    this.kdY = new LinkedList();
    this.kdX = paramLinkedList;
    b.a locala = new b.a();
    locala.fsJ = new ic();
    locala.fsK = new id();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetcarditem";
    locala.fsI = 559;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((ic)this.ehh.fsG.fsP).vKf = J(paramLinkedList);
    AppMethodBeat.o(87869);
  }

  private static LinkedList<String> J(LinkedList<ak> paramLinkedList)
  {
    AppMethodBeat.i(87872);
    LinkedList localLinkedList = new LinkedList();
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
      AppMethodBeat.o(87872);
    while (true)
    {
      return localLinkedList;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        ak localak = (ak)paramLinkedList.next();
        if (localak != null)
          localLinkedList.add(localak.field_cardUserId);
      }
      AppMethodBeat.o(87872);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(87870);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87870);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87871);
    ab.d("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87871);
    }
    while (true)
    {
      return;
      paramq = ((id)this.ehh.fsH.fsP).kdS;
      if (TextUtils.isEmpty(paramq))
      {
        ab.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
        this.ehi.onSceneEnd(4, -1, null, this);
        AppMethodBeat.o(87871);
      }
      else
      {
        long l1 = System.currentTimeMillis();
        paramq = com.tencent.mm.plugin.card.d.f.Hg(paramq);
        if (paramq != null)
        {
          if (this.kdX != null)
            this.kdY.addAll(this.kdX);
          long l2 = System.currentTimeMillis();
          long l3 = g.RP().eJN.iV(Thread.currentThread().getId());
          paramInt2 = 0;
          Object localObject1 = paramq.iterator();
          Object localObject2;
          Object localObject3;
          for (paramInt1 = 0; ((Iterator)localObject1).hasNext(); paramInt1 = paramInt3)
          {
            localObject2 = (CardInfo)((Iterator)localObject1).next();
            paramInt3 = paramInt1 + 1;
            paramInt1 = paramInt2;
            if (!l.b((CardInfo)localObject2))
            {
              paramInt2++;
              localObject3 = this.kdY;
              paramInt1 = paramInt2;
              if (localObject2 != null)
              {
                paramArrayOfByte = new ak();
                paramArrayOfByte.field_cardUserId = ((CardInfo)localObject2).field_card_id;
                ((LinkedList)localObject3).remove(paramArrayOfByte);
                paramInt1 = paramInt2;
              }
            }
            paramInt2 = paramInt1;
          }
          g.RP().eJN.mB(l3);
          ab.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          ab.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
          l.beB();
          if (paramq.size() > 0)
          {
            paramInt1 = (int)(System.currentTimeMillis() - l1);
            localObject1 = new ArrayList();
            localObject2 = new IDKey();
            ((IDKey)localObject2).SetID(281);
            ((IDKey)localObject2).SetKey(43);
            ((IDKey)localObject2).SetValue(1L);
            paramArrayOfByte = new IDKey();
            paramArrayOfByte.SetID(281);
            paramArrayOfByte.SetKey(44);
            paramArrayOfByte.SetValue(paramInt1);
            IDKey localIDKey = new IDKey();
            localIDKey.SetID(281);
            localIDKey.SetKey(45);
            localIDKey.SetValue(paramq.size());
            localObject3 = new IDKey();
            ((IDKey)localObject3).SetID(281);
            ((IDKey)localObject3).SetKey(47);
            ((IDKey)localObject3).SetValue(paramInt1 / paramq.size());
            ((ArrayList)localObject1).add(localObject2);
            ((ArrayList)localObject1).add(paramArrayOfByte);
            ((ArrayList)localObject1).add(localIDKey);
            ((ArrayList)localObject1).add(localObject3);
            com.tencent.mm.plugin.report.service.h.pYm.b((ArrayList)localObject1, true);
          }
        }
        this.ehi.onSceneEnd(0, 0, paramString, this);
        AppMethodBeat.o(87871);
      }
    }
  }

  public final int getType()
  {
    return 559;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.s
 * JD-Core Version:    0.6.2
 */