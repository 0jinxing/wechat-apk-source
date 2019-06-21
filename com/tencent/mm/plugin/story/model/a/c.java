package com.tencent.mm.plugin.story.model.a;

import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cdr;
import com.tencent.mm.protocal.protobuf.cds;
import com.tencent.mm.protocal.protobuf.cdt;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryChatRoomSync;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "chatRoom", "", "(Ljava/lang/String;)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "getChatRoom", "()Ljava/lang/String;", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getResp", "Lcom/tencent/mm/protocal/protobuf/StoryChatRoomSyncResponse;", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class c extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStoryChatRoomSync";
  public static final c.a rUL;
  public final b ehh;
  private com.tencent.mm.ai.f ehi;
  public final String gpx;

  static
  {
    AppMethodBeat.i(109212);
    rUL = new c.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStoryChatRoomSync";
    AppMethodBeat.o(109212);
  }

  public c(String paramString)
  {
    AppMethodBeat.i(109211);
    this.gpx = paramString;
    paramString = new b.a();
    paramString.a((a)new cds());
    paramString.b((a)new cdt());
    paramString.qq("/cgi-bin/micromsg-bin/mmstorychatroomsync");
    paramString.kU(998);
    paramString.kV(0);
    paramString.kW(0);
    paramString = paramString.acD();
    a.f.b.j.o(paramString, "builder.buildInstance()");
    this.ehh = paramString;
    paramString = this.ehh.acz();
    if (paramString == null)
    {
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryChatRoomSyncRequest");
      AppMethodBeat.o(109211);
      throw paramString;
    }
    cds localcds = (cds)paramString;
    paramString = com.tencent.mm.plugin.story.model.j.rST;
    String str = j.a.cnk();
    paramString = com.tencent.mm.plugin.story.model.j.rST;
    paramString = j.a.cxV().abc(this.gpx);
    localcds.jBB = str;
    localcds.vEf = this.gpx;
    paramString = paramString.field_extbuf;
    if (paramString != null)
    {
      paramString = aa.ad(paramString);
      if (paramString != null);
    }
    else
    {
      paramString = null;
    }
    while (true)
    {
      localcds.xdt = paramString;
      ab.i(TAG, "req userName " + str + " chatRoomName " + this.gpx + " buf " + localcds.xdt);
      AppMethodBeat.o(109211);
      return;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(109210);
    a.f.b.j.p(parame, "dispatcher");
    a.f.b.j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (com.tencent.mm.network.k)this);
    AppMethodBeat.o(109210);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109209);
    ab.i(TAG, "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      paramInt1 = 1;
    while (true)
    {
      paramArrayOfByte = (cdt)this.ehh.acA();
      if (paramArrayOfByte != null)
      {
        paramq = com.tencent.mm.plugin.story.model.j.rST;
        Object localObject = j.a.cxV().abc(this.gpx);
        paramq = paramArrayOfByte.xdt;
        if (paramq != null);
        try
        {
          for (paramq = paramq.getBufferToBytes(); ; paramq = null)
          {
            ((com.tencent.mm.plugin.story.h.l)localObject).field_extbuf = paramq;
            ab.i(TAG, "onGYNetEnd: count " + paramArrayOfByte.xdu);
            if (paramInt1 == 0)
              break label493;
            ((com.tencent.mm.plugin.story.h.l)localObject).field_nextSyncTime = (60000L + System.currentTimeMillis());
            paramq = com.tencent.mm.plugin.story.model.j.rST;
            j.a.cxV().a((com.tencent.mm.sdk.e.c)localObject);
            ab.i(TAG, "response: count " + paramArrayOfByte.xdu + ", interval " + paramArrayOfByte.xdw);
            paramq = paramArrayOfByte.xdv;
            a.f.b.j.o(paramq, "resp.SyncInfoList");
            localObject = ((Iterable)paramq).iterator();
            while (true)
            {
              if (!((Iterator)localObject).hasNext())
                break label521;
              paramArrayOfByte = (cdr)((Iterator)localObject).next();
              if (paramArrayOfByte == null)
                break;
              paramq = paramArrayOfByte.jBB;
              if ((paramq != null) && (paramArrayOfByte.ThumbUrl != null))
              {
                paramq = com.tencent.mm.plugin.story.model.k.rTc;
                paramq = paramArrayOfByte.jBB;
                a.f.b.j.o(paramq, "it.UserName");
                paramq = com.tencent.mm.plugin.story.model.k.aap(paramq);
                ab.d(TAG, "fetch " + paramArrayOfByte.jBB + ' ' + paramArrayOfByte.xdq + ' ' + paramArrayOfByte.xdr + ", oldId " + paramq.field_syncId);
                if (paramq.field_syncId != paramArrayOfByte.xdq)
                {
                  paramq = com.tencent.mm.plugin.story.model.k.rTc;
                  paramq = paramArrayOfByte.jBB;
                  a.f.b.j.o(paramq, "it.UserName");
                  com.tencent.mm.plugin.story.model.k.a(paramq, paramArrayOfByte.xdq, paramArrayOfByte.xdr, paramArrayOfByte.ThumbUrl, paramArrayOfByte.nbr, 0L);
                }
              }
            }
            paramInt1 = 0;
            break;
          }
        }
        catch (Exception paramq)
        {
          while (true)
          {
            ab.b("safeBufferToByte", "", new Object[] { paramq });
            paramq = null;
            continue;
            label493: ((com.tencent.mm.plugin.story.h.l)localObject).field_nextSyncTime = (paramArrayOfByte.xdw * 1000L + System.currentTimeMillis());
            continue;
            paramq = null;
          }
        }
      }
    }
    label521: paramq = this.ehi;
    if (paramq == null)
      a.f.b.j.avw("callback");
    paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
    AppMethodBeat.o(109209);
  }

  public final int getType()
  {
    return 998;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.c
 * JD-Core Version:    0.6.2
 */