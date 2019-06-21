package com.tencent.mm.bl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ajb;
import com.tencent.mm.protocal.protobuf.ajc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  private ajb gcw;
  public ajc gcx;
  public com.tencent.mm.api.f gcy;
  private String gcz;

  public a(com.tencent.mm.api.f paramf)
  {
    AppMethodBeat.i(35455);
    this.ehi = null;
    this.gcz = null;
    if (paramf == null)
      AppMethodBeat.o(35455);
    while (true)
    {
      return;
      this.gcy = paramf;
      ab.i("MicroMsg.NetSceneGetFuncMsg", "new NetSceneGetFuncMsg, cgi: %s, cmdId: %s, functionMsgId: %s", new Object[] { paramf.field_cgi, Integer.valueOf(paramf.field_cmdid), paramf.field_functionmsgid });
      b.a locala = new b.a();
      locala.fsJ = new ajb();
      locala.fsK = new ajc();
      locala.fsI = 825;
      locala.uri = paramf.field_cgi;
      locala.fsL = paramf.field_cmdid;
      locala.fsM = 0;
      this.ehh = locala.acD();
      this.gcw = ((ajb)this.ehh.fsG.fsP);
      this.gcw.woV = paramf.field_functionmsgid;
      if (paramf.field_custombuff != null)
        this.gcw.woW = paramf.field_custombuff;
      this.gcw.woX = paramf.field_businessInfo;
      AppMethodBeat.o(35455);
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(35456);
    if (this.gcy != null)
    {
      ab.i("MicroMsg.NetSceneGetFuncMsg", "doScene, functionMsgId: %s", new Object[] { this.gcy.field_functionmsgid });
      this.gcy.field_status = 1;
    }
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(35456);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(35457);
    this.gcx = ((ajc)((b)paramq).fsH.fsP);
    this.gcz = this.gcx.woW;
    ab.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s, opCode: %s, responseCustomBuff==null: %s, response.version: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.gcx.OpCode), Boolean.valueOf(bo.isNullOrNil(this.gcz)), Long.valueOf(this.gcx.woY) });
    if (!bo.isNullOrNil(this.gcz))
    {
      this.gcw = ((ajb)this.ehh.fsG.fsP);
      this.gcw.woW = this.gcz;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
      if (paramInt2 == 4)
      {
        ab.i("MicroMsg.NetSceneGetFuncMsg", "server error");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(35457);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, local error");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(35457);
      continue;
      h.pYm.a(this.gcy.field_reportid, this.gcy.field_successkey, 1L, false);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(35457);
    }
  }

  public final int getType()
  {
    return 825;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bl.a
 * JD-Core Version:    0.6.2
 */