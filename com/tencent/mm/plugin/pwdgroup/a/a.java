package com.tencent.mm.plugin.pwdgroup.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aal;
import com.tencent.mm.protocal.protobuf.aam;
import com.tencent.mm.protocal.protobuf.aan;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a extends m
  implements k
{
  public int czW;
  private b ehh;
  private f ehi;

  public a(int paramInt1, String paramString1, String paramString2, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    AppMethodBeat.i(23980);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aal();
    ((b.a)localObject).fsK = new aam();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmfacingcreatechatroom";
    ((b.a)localObject).fsI = 653;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aal)this.ehh.fsG.fsP;
    this.czW = paramInt1;
    ((aal)localObject).OpCode = paramInt1;
    ((aal)localObject).wfF = paramString1;
    ((aal)localObject).wdB = paramString2;
    ((aal)localObject).vRp = paramFloat2;
    ((aal)localObject).vRq = paramFloat1;
    ((aal)localObject).wfG = paramInt2;
    if (!bo.isNullOrNil(paramString3))
      ((aal)localObject).wfH = paramString3;
    if (!bo.isNullOrNil(paramString4))
      ((aal)localObject).wfI = paramString4;
    ((aal)localObject).wfJ = paramInt3;
    ab.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "OpCode:%d, Ticket:%s, Longitude:%f, Latitude:%f, Precision:%d, MackAddr:%s, CellId:%s, GPSSource:%d", new Object[] { Integer.valueOf(paramInt1), paramString2, Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Integer.valueOf(paramInt2), paramString3, paramString4, Integer.valueOf(paramInt3) });
    com.tencent.mm.modelstat.o.a(2007, paramFloat2, paramFloat1, paramInt2);
    AppMethodBeat.o(23980);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(23981);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(23981);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23982);
    ab.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.czW == 0)
    {
      paramq = cbS();
      if (paramq != null)
      {
        LinkedList localLinkedList = paramq.vEh;
        if (localLinkedList != null)
        {
          long l = System.currentTimeMillis();
          int i = localLinkedList.size();
          ArrayList localArrayList = new ArrayList();
          paramInt1 = 0;
          if (paramInt1 < i)
          {
            paramArrayOfByte = (aan)localLinkedList.get(paramInt1);
            paramq = new h();
            if (!bo.isNullOrNil(paramArrayOfByte.jBB));
            for (paramq.username = paramArrayOfByte.jBB; ; paramq.username = paramArrayOfByte.wfK)
            {
              ab.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "cpan[onGYNetEnd]UserName:%s SmallImgUrl:%s", new Object[] { paramArrayOfByte.jBB, paramArrayOfByte.SmallImgUrl });
              paramq.frV = paramArrayOfByte.SmallImgUrl;
              paramq.cB(true);
              localArrayList.add(paramq);
              paramInt1++;
              break;
            }
          }
          com.tencent.mm.ah.o.act().aa(localArrayList);
          ab.d("MicroMsg.Facing.NetSceneFacingCreateChatRoom", "use time:%s", new Object[] { System.currentTimeMillis() - l });
        }
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(23982);
  }

  public final aam cbS()
  {
    return (aam)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 653;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.a.a
 * JD-Core Version:    0.6.2
 */