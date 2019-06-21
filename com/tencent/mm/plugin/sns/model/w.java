package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cbz;
import com.tencent.mm.protocal.protobuf.ccc;
import com.tencent.mm.protocal.protobuf.ccd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class w extends m
  implements k
{
  private int czE;
  private b ehh;
  public f ehi;
  private long qJP;
  private int scene;

  public w(int paramInt1, long paramLong, String paramString, int paramInt2, List<String> paramList, int paramInt3)
  {
    AppMethodBeat.i(36330);
    this.scene = 0;
    ab.d("MicroMsg.NetSceneSnsTagMemberOption", "opCode " + paramInt1 + " tagName " + paramString + " memberList " + paramList.size() + " scene " + paramInt3);
    this.czE = paramInt1;
    this.qJP = paramLong;
    this.scene = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ccc();
    ((b.a)localObject).fsK = new ccd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
    ((b.a)localObject).fsI = 291;
    ((b.a)localObject).fsL = 115;
    ((b.a)localObject).fsM = 1000000115;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ccc)this.ehh.fsG.fsP;
    ((ccc)localObject).OpCode = paramInt1;
    ((ccc)localObject).xbt = paramLong;
    ((ccc)localObject).ncF = paramString;
    ((ccc)localObject).jBv = paramInt2;
    ((ccc)localObject).Scene = this.scene;
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      paramString.add(new bts().alV(str));
    }
    ((ccc)localObject).jBw = paramString;
    ab.d("MicroMsg.NetSceneSnsTagMemberOption", "rr.req.rImpl " + localObject.toString());
    AppMethodBeat.o(36330);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(36331);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36331);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36332);
    ab.d("MicroMsg.NetSceneSnsTagMemberOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36332);
      return;
    }
    paramq = ((ccd)((b)paramq).fsH.fsP).xbv;
    ab.d("MicroMsg.NetSceneSnsTagMemberOption", "Resp.rImpl " + paramq.toString());
    paramArrayOfByte = af.cnL().kF(paramq.xbt);
    paramArrayOfByte.field_tagId = paramq.xbt;
    paramArrayOfByte.field_tagName = bo.bc(paramq.ncF, "");
    switch (this.czE)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      af.cnL().a(paramArrayOfByte);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36332);
      break;
      paramArrayOfByte.field_count = paramq.jBv;
      paramArrayOfByte.jdMethod_do(paramq.jBw);
    }
  }

  public final int getType()
  {
    return 291;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.w
 * JD-Core Version:    0.6.2
 */