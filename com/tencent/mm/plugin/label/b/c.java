package com.tencent.mm.plugin.label.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.protocal.protobuf.ahr;
import com.tencent.mm.protocal.protobuf.ahs;
import com.tencent.mm.protocal.protobuf.axj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public c()
  {
    AppMethodBeat.i(22527);
    b.a locala = new b.a();
    locala.fsJ = new ahr();
    locala.fsK = new ahs();
    locala.uri = "/cgi-bin/micromsg-bin/getcontactlabellist";
    locala.fsI = 639;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(22527);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(22529);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(22529);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(22528);
    ab.d("MicroMsg.Label.NetSceneGetContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(209408, Long.valueOf(System.currentTimeMillis()));
      paramq = (ahs)this.ehh.fsH.fsP;
      if ((paramq != null) && (paramq.vEm != null))
      {
        LinkedList localLinkedList = paramq.vEm;
        paramq = new ArrayList();
        int j = localLinkedList.size();
        for (paramInt1 = i; paramInt1 < j; paramInt1++)
        {
          axj localaxj = (axj)localLinkedList.get(paramInt1);
          paramArrayOfByte = new af();
          paramArrayOfByte.field_labelID = localaxj.wBr;
          paramArrayOfByte.field_labelName = localaxj.wBq;
          paramArrayOfByte.field_labelPYFull = g.vo(localaxj.wBq);
          paramArrayOfByte.field_labelPYShort = g.vp(localaxj.wBq);
          paramq.add(paramArrayOfByte);
        }
        com.tencent.mm.plugin.label.e.bIZ().er(paramq);
        com.tencent.mm.plugin.label.e.bIZ().es(com.tencent.mm.plugin.label.e.bIZ().et(paramq));
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(22528);
      return;
      ab.w("MicroMsg.Label.NetSceneGetContactLabelList", "cpan[onGYNetEnd] getcontactlabellist fail.");
    }
  }

  public final int getType()
  {
    return 639;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b.c
 * JD-Core Version:    0.6.2
 */