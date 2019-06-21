package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cdi;
import com.tencent.mm.protocal.protobuf.cdj;
import com.tencent.mm.protocal.protobuf.cdk;
import com.tencent.mm.protocal.protobuf.cdl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.LinkedList;

public final class y extends m
  implements k
{
  private static HashSet<Long> fPM;
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private final String toUserName;

  static
  {
    AppMethodBeat.i(78608);
    fPM = new HashSet();
    AppMethodBeat.o(78608);
  }

  public y(String paramString, int paramInt1, int paramInt2, LinkedList<cdl> paramLinkedList)
  {
    AppMethodBeat.i(78604);
    this.toUserName = paramString;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cdj();
    ((b.a)localObject).fsK = new cdk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/statusnotify";
    ((b.a)localObject).fsI = 251;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cdj)this.ehh.fsG.fsP;
    ((cdj)localObject).ndG = r.Yz();
    ((cdj)localObject).xcZ = paramInt1;
    ((cdj)localObject).ndF = paramString;
    ((cdj)localObject).vFF = System.currentTimeMillis();
    if ((paramLinkedList != null) && (paramLinkedList.size() == paramInt2))
    {
      ((cdj)localObject).xda = paramInt2;
      ((cdj)localObject).xdb.addAll(paramLinkedList);
    }
    ab.d("MicroMsg.NetSceneStatusNotify", "summerstatus toUserName = " + paramString + " unreadChatListCount = " + ((cdj)localObject).xdb.size());
    AppMethodBeat.o(78604);
  }

  private y(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78605);
    this.toUserName = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cdj();
    ((b.a)localObject).fsK = new cdk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/statusnotify";
    ((b.a)localObject).fsI = 251;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cdj)this.ehh.fsG.fsP;
    ((cdj)localObject).ndG = r.Yz();
    ((cdj)localObject).xcZ = paramInt;
    ((cdj)localObject).ndF = paramString1;
    ((cdj)localObject).vFF = System.currentTimeMillis();
    ((cdj)localObject).xdc = new cdi();
    ((cdj)localObject).xdc.Name = paramString2;
    ((cdj)localObject).xdc.xcY = paramString3;
    AppMethodBeat.o(78605);
  }

  public static void C(bi parambi)
  {
    AppMethodBeat.i(78602);
    g.RQ();
    if (!((Boolean)g.RP().Ry().get(ac.a.xPS, Boolean.TRUE)).booleanValue())
    {
      ab.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]autoSyncState close");
      AppMethodBeat.o(78602);
    }
    while (true)
    {
      return;
      if (fPM.contains(Long.valueOf(parambi.field_msgId)))
      {
        ab.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd: has send cmd: msgSvrId:%d, msgLocalId:%d", new Object[] { Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_msgId) });
        AppMethodBeat.o(78602);
      }
      else
      {
        fPM.add(Long.valueOf(parambi.field_msgId));
        if (!g.RN().QY())
        {
          AppMethodBeat.o(78602);
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("<![CDATA[<downloadList>");
          localStringBuilder.append("<downloadItem>");
          localStringBuilder.append("<username>");
          localStringBuilder.append(parambi.field_talker);
          localStringBuilder.append("</username>");
          localStringBuilder.append("<msgsvrid>");
          localStringBuilder.append(parambi.field_msgSvrId);
          localStringBuilder.append("</msgsvrid>");
          localStringBuilder.append("</downloadItem>");
          localStringBuilder.append("</downloadList>]]>");
          String str = localStringBuilder.toString();
          ab.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd:msgID:%d,  %s", new Object[] { Long.valueOf(parambi.field_msgId), localStringBuilder });
          parambi = new y(r.Yz(), 11, "DownloadFile", str);
          g.RO().eJo.a(parambi, 0);
          AppMethodBeat.o(78602);
        }
      }
    }
  }

  public static void ab(String paramString, int paramInt)
  {
    AppMethodBeat.i(78601);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(78601);
    while (true)
    {
      return;
      if ((!g.RN().QY()) || ((t.nI(paramString)) && (!t.nd(paramString))))
      {
        AppMethodBeat.o(78601);
      }
      else
      {
        paramString = new y(paramString, paramInt, 0, null);
        g.RO().eJo.a(paramString, 0);
        AppMethodBeat.o(78601);
      }
    }
  }

  public static void b(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78603);
    if ((bo.isNullOrNil(paramString1)) || (t.nI(paramString1)))
      AppMethodBeat.o(78603);
    while (true)
    {
      return;
      if (!g.RN().QY())
      {
        AppMethodBeat.o(78603);
      }
      else
      {
        paramString1 = new y(paramString1, paramInt, paramString2, paramString3);
        g.RO().eJo.a(paramString1, 0);
        AppMethodBeat.o(78603);
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78606);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78606);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78607);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.d("MicroMsg.NetSceneStatusNotify", "StatusNotify Error. userName=" + this.toUserName);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78607);
  }

  public final int getType()
  {
    return 251;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.y
 * JD-Core Version:    0.6.2
 */