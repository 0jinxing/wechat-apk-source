package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bwb;
import com.tencent.mm.protocal.protobuf.bwc;
import com.tencent.mm.protocal.protobuf.dv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends m
  implements k
{
  private String aeskey;
  private String ecX;
  private b ehh;
  private f ehi;
  private String fileId;
  private int oFD;
  private String oFE;
  private String oFF;

  public e(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(22900);
    this.fileId = paramString1;
    this.aeskey = paramString2;
    this.oFD = paramInt;
    this.ecX = paramString3;
    this.oFE = paramString4;
    this.oFF = paramString5;
    paramString2 = new b.a();
    paramString2.fsJ = new bwb();
    paramString2.fsK = new bwc();
    paramString2.uri = "/cgi-bin/micromsg-bin/sendappmsg";
    paramString2.fsI = 222;
    paramString2.fsL = 107;
    paramString2.fsM = 1000000107;
    this.ehh = paramString2.acD();
    ab.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "MsgSynchronizeSendAppMsgNetScene action[%s], messagaction[%s], fileId[%s], fileLen[%d], selfName[%s], stack[%s]", new Object[] { paramString4, this.oFE, paramString1, Integer.valueOf(paramInt), paramString3, bo.dpG() });
    AppMethodBeat.o(22900);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(22901);
    this.ehi = paramf;
    j.b localb = new j.b();
    localb.title = "ChatSync";
    localb.description = "ChatSync";
    localb.type = 35;
    localb.url = this.fileId;
    localb.eyr = this.aeskey;
    localb.fgK = this.aeskey;
    localb.fgo = this.oFD;
    localb.fgK = this.aeskey;
    localb.showType = 0;
    localb.action = "phone";
    localb.messageAction = this.oFE;
    localb.extInfo = "supportAfterSleep,supportGetMore";
    localb.content = this.oFF;
    bwb localbwb = (bwb)this.ehh.fsG.fsP;
    paramf = new dv();
    paramf.ndG = this.ecX;
    paramf.vFE = localb.sdkVer;
    paramf.jCt = 35;
    paramf.ndF = this.ecX;
    paramf.ncM = j.b.a(localb, null, null, 0, 0);
    paramf.pcX = ((int)bo.anT());
    localbwb.wWQ = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(22901);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22902);
    ab.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "msgSynchronize sendAppMsg onGYNetEnd. [%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(22902);
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 222;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.e
 * JD-Core Version:    0.6.2
 */