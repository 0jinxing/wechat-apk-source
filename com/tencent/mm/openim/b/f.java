package com.tencent.mm.openim.b;

import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.openim.room.a.a.1;
import com.tencent.mm.openim.room.a.a.2;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.alg;
import com.tencent.mm.protocal.protobuf.alh;
import com.tencent.mm.protocal.protobuf.bgb;
import com.tencent.mm.protocal.protobuf.bge;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private final String geY;
  private final int version;

  public f(String paramString, int paramInt)
  {
    AppMethodBeat.i(78849);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new alg();
    ((b.a)localObject).fsK = new alh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getopenimchatroommemberdetail";
    ((b.a)localObject).fsI = 942;
    this.ehh = ((b.a)localObject).acD();
    this.geY = paramString;
    this.version = paramInt;
    localObject = (alg)this.ehh.fsG.fsP;
    ((alg)localObject).gfa = paramString;
    ((alg)localObject).wqH = paramInt;
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "get roomname:%s, version=%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(78849);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(78851);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78851);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78850);
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s, %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geY, Integer.valueOf(this.version) });
    if (paramInt3 == 0)
    {
      Object localObject = (alh)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      paramArrayOfByte = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().ob(this.geY);
      long l = ((alh)localObject).wqI;
      ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail svrVer:%d, localVer:%d", new Object[] { Integer.valueOf(((alh)localObject).wqI), Integer.valueOf(this.version) });
      if (this.version < (0xFFFFFFFF & l))
      {
        paramArrayOfByte.Mk(((alh)localObject).wqI);
        label179: bgb localbgb;
        com.tencent.mm.openim.room.a.c localc;
        i locali;
        LinkedList localLinkedList1;
        LinkedList localLinkedList2;
        label304: Iterator localIterator;
        if (((alh)localObject).wqJ == null)
        {
          paramq = null;
          if (paramq != null)
            break label542;
          paramInt1 = -1;
          ab.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
          paramArrayOfByte.v(r.Yz(), com.tencent.mm.openim.room.a.b.c.ao(paramq));
          ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().a(paramArrayOfByte);
          localbgb = ((alh)localObject).wqJ;
          localc = new com.tencent.mm.openim.room.a.c();
          if (localbgb == null)
            break label910;
          paramq = localbgb.vEN;
          localObject = ((j)g.K(j.class)).XM();
          locali = o.act();
          localLinkedList1 = new LinkedList();
          localLinkedList2 = new LinkedList();
          if (paramq != null)
            break label553;
          paramInt1 = -1;
          ab.i("OpenIMChatRoomContactLogic", "updateMemberDetail memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
          if (paramInt1 < 0)
            break label910;
          if (paramInt1 <= WXHardCoderJNI.hcUpdateChatroomMemberCount)
            break label564;
          paramInt1 = 0;
          localc.ehv = paramInt1;
          localIterator = paramq.iterator();
        }
        while (true)
        {
          label352: if (!localIterator.hasNext())
            break label770;
          bge localbge = (bge)localIterator.next();
          if ((localbgb.wKf == 0) && (!bo.isNullOrNil(localbge.userName)) && (!bo.isNullOrNil(localbge.wck)))
          {
            paramArrayOfByte = locali.qo(localbge.userName);
            paramq = paramArrayOfByte;
            if (paramArrayOfByte == null)
            {
              paramq = new h();
              paramq.username = localbge.userName;
            }
            paramq.frW = localbge.wcj;
            paramq.frV = localbge.wck;
            paramq.dtR = 3;
            if (bo.isNullOrNil(localbge.wcj))
              break label630;
          }
          label542: label553: label564: label630: for (boolean bool = true; ; bool = false)
          {
            paramq.cB(bool);
            localLinkedList2.add(paramq);
            paramq = ((bd)localObject).aoO(localbge.userName);
            if (paramq != null)
              break label636;
            ab.e("OpenIMChatRoomContactLogic", "updateMemberDetail memberlist username is null");
            break label352;
            paramq = ((alh)localObject).wqJ.vEN;
            break;
            paramInt1 = paramq.size();
            break label179;
            paramInt1 = paramq.size();
            break label304;
            bool = WXHardCoderJNI.hcUpdateChatroomEnable;
            int i = WXHardCoderJNI.hcUpdateChatroomDelay;
            int j = WXHardCoderJNI.hcUpdateChatroomCPU;
            int k = WXHardCoderJNI.hcUpdateChatroomIO;
            if (WXHardCoderJNI.hcUpdateChatroomThr);
            for (paramInt1 = g.RS().doL(); ; paramInt1 = 0)
            {
              paramInt1 = WXHardCoderJNI.startPerformance(bool, i, j, k, paramInt1, WXHardCoderJNI.hcUpdateChatroomTimeout, 401, WXHardCoderJNI.hcUpdateChatroomAction, "PerfTrace");
              break;
            }
          }
          label636: if (paramq.NZ())
          {
            paramq.iB(localbge.bCu);
            localLinkedList1.add(new Pair(localbge.userName, paramq));
          }
          if (!bo.isNullOrNil(localbge.appId))
            paramq.iK(localbge.appId);
          if (!bo.isNullOrNil(localbge.wKh))
            paramq.iJ(localbge.wKh);
          ((bd)localObject).Y(paramq);
          if (!bo.isNullOrNil(localbge.appId))
            ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).u(localbge.appId, aa.gw(ah.getContext()), localbge.wKh);
        }
        label770: ab.d("OpenIMChatRoomContactLogic", "updateMemberDetail update newImgFlagList size:%d, updateList size:%d", new Object[] { Integer.valueOf(localLinkedList2.size()), Integer.valueOf(localLinkedList1.size()) });
        if (!localLinkedList2.isEmpty())
        {
          localc.mG(1);
          new ap(g.RS().oAl.getLooper(), new a.1(localLinkedList2, localc, locali), true).ae(100L, 100L);
        }
        if (!localLinkedList1.isEmpty())
        {
          localc.mG(2);
          new ap(g.RS().oAl.getLooper(), new a.2(localLinkedList1, localc, (bd)localObject), true).ae(100L, 100L);
        }
      }
    }
    label910: if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78850);
  }

  public final int getType()
  {
    return 942;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.f
 * JD-Core Version:    0.6.2
 */