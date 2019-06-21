package com.tencent.mm.chatroom.c;

import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.ahg;
import com.tencent.mm.protocal.protobuf.ahh;
import com.tencent.mm.protocal.protobuf.qe;
import com.tencent.mm.protocal.protobuf.qf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private final String chatroomName;
  private final b ehh;
  private f ehi;
  private int ehu;
  private int ehv;

  public k(String paramString, int paramInt)
  {
    AppMethodBeat.i(103933);
    this.ehi = null;
    this.ehu = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ahg();
    ((b.a)localObject).fsK = new ahh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getchatroommemberdetail";
    ((b.a)localObject).fsI = 551;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.chatroomName = paramString;
    int i = ((c)g.K(c.class)).XV().ob(paramString).drT();
    ((ahg)this.ehh.fsG.fsP).wnM = paramString;
    localObject = (ahg)this.ehh.fsG.fsP;
    if (i < paramInt);
    for (int j = paramInt; ; j = i)
    {
      ((ahg)localObject).vKd = j;
      ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s, oldVer:%d, localVer:%d, stack[%s]", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(i), bo.dpG() });
      AppMethodBeat.o(103933);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(103934);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(103934);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103935);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103935);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      paramq = (ahh)this.ehh.fsH.fsP;
      paramArrayOfByte = ((c)g.K(c.class)).XV().ob(this.chatroomName);
      long l1 = paramArrayOfByte.drT();
      long l2 = 0xFFFFFFFF & paramq.jBs;
      int i = paramq.jBs;
      if (paramq.wnN == null);
      for (paramInt1 = 0; ; paramInt1 = paramq.wnN.ehB)
      {
        ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom svrVer:%d, modCnt:%d， localVer:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Long.valueOf(l1) });
        if (l1 < l2)
          break label272;
        ab.e("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom localVer[%d] serverVer[%d] is new and return", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(103935);
        break;
      }
      label272: paramArrayOfByte.Mk(paramq.jBs);
      label300: bd localbd;
      LinkedList localLinkedList1;
      LinkedList localLinkedList2;
      label394: Iterator localIterator;
      if (paramq.wnN == null)
      {
        paramq = null;
        if (paramq != null)
          break label615;
        paramInt1 = -1;
        ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
        paramArrayOfByte.v(r.Yz(), paramq);
        ((c)g.K(c.class)).XV().a(paramArrayOfByte);
        localbd = ((j)g.K(j.class)).XM();
        paramArrayOfByte = o.act();
        localLinkedList1 = new LinkedList();
        localLinkedList2 = new LinkedList();
        if (paramq != null)
          break label626;
        paramInt1 = -1;
        ab.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", new Object[] { Integer.valueOf(paramInt1) });
        if (paramInt1 <= WXHardCoderJNI.hcUpdateChatroomMemberCount)
          break label637;
        paramInt1 = 0;
        this.ehv = paramInt1;
        localIterator = paramq.iterator();
      }
      while (true)
      {
        label437: if (!localIterator.hasNext())
          break label766;
        qf localqf = (qf)localIterator.next();
        if ((!bo.isNullOrNil(localqf.vXn)) && (!bo.isNullOrNil(localqf.jBB)))
        {
          paramq = paramArrayOfByte.qo(localqf.jBB);
          if (paramq != null)
            break label702;
          paramq = new h();
          paramq.username = localqf.jBB;
          label517: paramq.frW = localqf.vXm;
          paramq.frV = localqf.vXn;
          paramq.dtR = 3;
          if (bo.isNullOrNil(localqf.vXm))
            break label719;
        }
        label702: label719: for (boolean bool = true; ; bool = false)
        {
          paramq.cB(bool);
          localLinkedList2.add(paramq);
          paramq = localbd.aoO(localqf.jBB);
          if (paramq != null)
            break label725;
          ab.e("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail memberlist username is null");
          break label437;
          paramq = paramq.wnN.vXi;
          break;
          label615: paramInt1 = paramq.size();
          break label300;
          label626: paramInt1 = paramq.size();
          break label394;
          label637: bool = WXHardCoderJNI.hcUpdateChatroomEnable;
          int j = WXHardCoderJNI.hcUpdateChatroomDelay;
          i = WXHardCoderJNI.hcUpdateChatroomCPU;
          int k = WXHardCoderJNI.hcUpdateChatroomIO;
          if (WXHardCoderJNI.hcUpdateChatroomThr);
          for (paramInt1 = g.RS().doL(); ; paramInt1 = 0)
          {
            paramInt1 = WXHardCoderJNI.startPerformance(bool, j, i, k, paramInt1, WXHardCoderJNI.hcUpdateChatroomTimeout, 401, WXHardCoderJNI.hcUpdateChatroomAction, "MicroMsg.NetSceneGetChatroomMemberDetail");
            break;
          }
          paramq.acl().equals(localqf.vXn);
          break label517;
        }
        label725: if (paramq.NZ())
        {
          paramq.iB(localqf.jCH);
          localLinkedList1.add(new Pair(localqf.jBB, paramq));
        }
      }
      label766: ab.d("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update newImgFlagList size:%d, updateList size:%d", new Object[] { Integer.valueOf(localLinkedList2.size()), Integer.valueOf(localLinkedList1.size()) });
      if (!localLinkedList2.isEmpty())
      {
        this.ehu |= 1;
        new ap(g.RS().oAl.getLooper(), new k.1(this, localLinkedList2, paramArrayOfByte), true).ae(100L, 100L);
      }
      if (!localLinkedList1.isEmpty())
      {
        this.ehu |= 2;
        new ap(g.RS().oAl.getLooper(), new k.2(this, localLinkedList1, localbd), true).ae(100L, 100L);
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(103935);
    }
  }

  public final int getType()
  {
    return 551;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.k
 * JD-Core Version:    0.6.2
 */