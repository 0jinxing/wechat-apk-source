package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.z;
import com.tencent.mm.ci.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.brandservice.ui.b.c;
import com.tencent.mm.protocal.protobuf.cgz;
import com.tencent.mm.protocal.protobuf.cha;
import com.tencent.mm.protocal.protobuf.eu;
import com.tencent.mm.protocal.protobuf.ev;
import com.tencent.mm.protocal.protobuf.jy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.r.2;
import com.tencent.mm.storage.r.3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class l extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;

  public l(LinkedList<jy> paramLinkedList)
  {
    AppMethodBeat.i(13858);
    b.a locala = new b.a();
    locala.fsJ = new cgz();
    locala.fsK = new cha();
    locala.uri = "/cgi-bin/mmbiz-bin/bizattr/timeline_comment_reward_stat";
    locala.fsI = 2571;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((cgz)this.ehh.fsG.fsP).xfT = paramLinkedList;
    ab.d("MicroMsg.NetSceneTimelineGetCommentReward", "NetSceneTimelineGetCommentReward %d", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    AppMethodBeat.o(13858);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(13860);
    this.ehi = paramf;
    ab.d("MicroMsg.NetSceneTimelineGetCommentReward", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13860);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13859);
    ab.i("MicroMsg.NetSceneTimelineGetCommentReward", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramString = (cha)this.ehh.fsH.fsP;
      if (paramString != null)
      {
        paramq = new HashMap();
        if (!bo.ek(paramString.vGJ))
        {
          Iterator localIterator = paramString.vGJ.iterator();
          while (localIterator.hasNext())
          {
            paramArrayOfByte = (eu)localIterator.next();
            ab.d("MicroMsg.NetSceneTimelineGetCommentReward", "client_msg_id=%d, fans_read_cnt=%d", new Object[] { Long.valueOf(paramArrayOfByte.vGH), Integer.valueOf(paramArrayOfByte.vGI) });
            if ((paramArrayOfByte.vGH > 0L) && (paramArrayOfByte.vGI > 0))
            {
              if (!paramq.containsKey(Long.valueOf(paramArrayOfByte.vGH)))
                paramq.put(Long.valueOf(paramArrayOfByte.vGH), new ev());
              ((ev)paramq.get(Long.valueOf(paramArrayOfByte.vGH))).vGJ.add(paramArrayOfByte);
            }
          }
          localIterator = paramq.entrySet().iterator();
          paramq = new LinkedList();
          while (localIterator.hasNext())
          {
            Object localObject = (Map.Entry)localIterator.next();
            paramArrayOfByte = (ev)((Map.Entry)localObject).getValue();
            localObject = z.aeX().B(((Long)((Map.Entry)localObject).getKey()).longValue(), "msgId");
            if ((localObject != null) && (!c.b(((com.tencent.mm.storage.q)localObject).field_appMsgStatInfoProto, paramArrayOfByte)))
            {
              ((com.tencent.mm.storage.q)localObject).field_appMsgStatInfoProto = paramArrayOfByte;
              paramq.add(localObject);
            }
          }
          paramArrayOfByte = z.aeX();
          if (!bo.ek(paramq))
            g.dOW().h(new r.3(paramArrayOfByte, paramq)).b(new r.2(paramArrayOfByte, paramq));
        }
        if (paramString.xfU > 0)
          com.tencent.mm.plugin.brandservice.ui.b.a.jYZ = paramString.xfU;
      }
    }
    AppMethodBeat.o(13859);
  }

  public final int getType()
  {
    return 2571;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.l
 * JD-Core Version:    0.6.2
 */