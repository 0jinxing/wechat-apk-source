package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsimple.n;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.abg;
import com.tencent.mm.protocal.protobuf.anq;
import com.tencent.mm.protocal.protobuf.bdl;
import com.tencent.mm.protocal.protobuf.bre;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class AllRemindMsgUI$a$1
  implements Runnable
{
  AllRemindMsgUI$a$1(AllRemindMsgUI.a parama, m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29115);
    Object localObject = ((anq)((n)this.crb).fAT.fsH.fsP).wsp;
    LinkedList localLinkedList = new LinkedList();
    if (localObject != null)
    {
      Iterator localIterator = ((List)localObject).iterator();
      if (localIterator.hasNext())
      {
        bre localbre = (bre)localIterator.next();
        AllRemindMsgUI.d locald = new AllRemindMsgUI.d(this.yey.yex);
        locald.yeE = localbre;
        locald.timestamp = (localbre.lvf * 1000L);
        locald.cuu = localbre.wOI;
        locald.yeF = localbre.wTy;
        if (localbre.wOI == 1)
          localObject = new bdl();
        while (true)
        {
          try
          {
            ((bdl)localObject).parseFrom(localbre.wcJ.wR);
            locald.title = ((bdl)localObject).Title;
            locald.username = ((bdl)localObject).jBB;
            locald.cvx = ((bdl)localObject).ptF;
            if (locald.username != null)
            {
              if (!t.kH(locald.username))
                continue;
              localObject = ((j)g.K(j.class)).XM().aoO(locald.username);
              if (localObject != null)
              {
                if (((ad)localObject).Oj() == null)
                {
                  localObject = ((ad)localObject).Oi();
                  locald.nickname = ((String)localObject);
                }
              }
              else
              {
                if (!bo.isNullOrNil(locald.nickname))
                  continue;
                localObject = this.yey.yex.getString(2131298223);
                locald.nickname = ((String)localObject);
              }
            }
            else
            {
              ab.i("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] getRemind:%s", new Object[] { locald });
              localLinkedList.add(locald);
            }
          }
          catch (IOException localIOException1)
          {
            ab.e("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] %s", new Object[] { localIOException1.toString() });
            continue;
            localObject = ((ad)localObject).Oj();
            continue;
            localObject = locald.nickname;
            continue;
            localObject = ((j)g.K(j.class)).XM().aoO(locald.username);
            if (((ad)localObject).Oj() != null);
          }
          for (localObject = ((ad)localObject).Oi(); ; localObject = ((ad)localObject).Oj())
          {
            locald.nickname = ((String)localObject);
            break;
          }
          if (localIOException1.wOI == 2)
          {
            localObject = new abg();
            try
            {
              ((abg)localObject).parseFrom(localIOException1.wcJ.wR);
              locald.title = ((abg)localObject).Title;
              locald.cvp = ((abg)localObject).vEt;
              locald.whS = ((abg)localObject).vEu;
            }
            catch (IOException localIOException2)
            {
              while (true)
                ab.e("MicroMsg.emoji.AllRemindMsgUI", "[onSceneEnd] %s", new Object[] { localIOException2.toString() });
            }
          }
        }
      }
      AllRemindMsgUI.a(this.yey.yex, localLinkedList);
    }
    al.d(new AllRemindMsgUI.a.1.1(this));
    AppMethodBeat.o(29115);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.a.1
 * JD-Core Version:    0.6.2
 */