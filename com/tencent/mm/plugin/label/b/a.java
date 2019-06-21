package com.tencent.mm.plugin.label.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.protocal.protobuf.axj;
import com.tencent.mm.protocal.protobuf.cc;
import com.tencent.mm.protocal.protobuf.cd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private LinkedList<axj> nHw;

  public a(String paramString)
  {
    AppMethodBeat.i(22520);
    this.nHw = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cc();
    ((b.a)localObject).fsK = new cd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addcontactlabel";
    ((b.a)localObject).fsI = 635;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    if (!bo.isNullOrNil(paramString))
    {
      localObject = new axj();
      ((axj)localObject).wBq = paramString;
      this.nHw.add(localObject);
    }
    AppMethodBeat.o(22520);
  }

  public a(List<String> paramList)
  {
    AppMethodBeat.i(22521);
    this.nHw = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cc();
    ((b.a)localObject).fsK = new cd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addcontactlabel";
    ((b.a)localObject).fsI = 635;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    if ((paramList != null) && (paramList.size() > 0))
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        localObject = new axj();
        ((axj)localObject).wBq = ((String)paramList.get(j));
        this.nHw.add(localObject);
      }
    }
    AppMethodBeat.o(22521);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(22522);
    ab.d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene].");
    this.ehi = paramf;
    cc localcc = (cc)this.ehh.fsG.fsP;
    int i;
    if ((this.nHw != null) && (this.nHw.size() > 0))
    {
      localcc.vEm = this.nHw;
      localcc.vEl = this.nHw.size();
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(22522);
    }
    while (true)
    {
      return i;
      ab.e("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene] label list is null.");
      paramf.onSceneEnd(3, -1, "[doScene]empty contact list.", this);
      i = 0;
      AppMethodBeat.o(22522);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22523);
    ab.d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = bJb();
    if (paramq != null)
    {
      paramArrayOfByte = paramq.vEm;
      ArrayList localArrayList = new ArrayList();
      int i = paramArrayOfByte.size();
      for (paramInt1 = 0; paramInt1 < i; paramInt1++)
      {
        paramq = (axj)paramArrayOfByte.get(paramInt1);
        af localaf = new af();
        localaf.field_labelID = paramq.wBr;
        localaf.field_labelName = paramq.wBq;
        localaf.field_labelPYFull = g.vo(paramq.wBq);
        localaf.field_labelPYShort = g.vp(paramq.wBq);
        localaf.field_isTemporary = false;
        localArrayList.add(localaf);
      }
      com.tencent.mm.plugin.label.e.bIZ().eq(localArrayList);
      com.tencent.mm.plugin.label.e.bIZ().er(localArrayList);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(22523);
  }

  public final cd bJb()
  {
    return (cd)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 635;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b.a
 * JD-Core Version:    0.6.2
 */