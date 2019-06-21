package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.qm;
import com.tencent.mm.protocal.protobuf.qn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class z extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  private final z.a vcq;

  public z(j.b paramb, String paramString1, String paramString2, z.a parama)
  {
    AppMethodBeat.i(27355);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qm();
    ((b.a)localObject).fsK = new qn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkbigfileupload";
    ((b.a)localObject).fsI = 727;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    qm localqm = (qm)this.ehh.fsG.fsP;
    if ((paramb != null) && (!bo.isNullOrNil(paramb.eyr)) && (!bo.isNullOrNil(paramb.filemd5)))
    {
      localqm.vRw = paramb.eyr;
      localqm.vXw = paramb.filemd5;
      localqm.fMd = paramb.title;
      localqm.vXx = paramb.fgp;
      localqm.vXv = paramb.fgo;
      localqm.vHo = com.tencent.mm.i.a.efE;
      localqm.ndF = paramString2;
      localqm.ndG = r.Yz();
      this.vcq = parama;
      ab.i("MicroMsg.NetSceneCheckBigFileUpload", "summerbig NetSceneCheckBigFileUpload content[%s], aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", new Object[] { paramb, localqm.vRw, localqm.vXw, localqm.fMd, Long.valueOf(localqm.vXv), localqm.vXx, localqm.ndF, localqm.ndG, bo.dpG() });
      AppMethodBeat.o(27355);
      return;
    }
    com.tencent.mm.al.f.afy();
    localqm.vRw = com.tencent.mm.al.a.afp();
    com.tencent.mm.al.f.afy();
    localqm.vXw = com.tencent.mm.al.a.rH(paramString1);
    if ((paramString1 == null) || (paramString1.length() <= 0))
      localObject = "";
    while (true)
    {
      localqm.fMd = ((String)localObject);
      localqm.vXx = com.tencent.mm.a.e.cv(paramString1);
      localqm.vXv = com.tencent.mm.a.e.cs(paramString1);
      break;
      localObject = new File(paramString1).getName();
      int i = ((String)localObject).lastIndexOf('.');
      if (i < 0)
        localObject = paramString1;
      else if (i == 0)
        localObject = "";
      else
        localObject = ((String)localObject).substring(0, i);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(27356);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(27356);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27357);
    ab.d("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (this.vcq != null)
        this.vcq.a("", "", "", "", "", 0L);
      AppMethodBeat.o(27357);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      paramString = (qm)((b)paramq).fsG.fsP;
      paramq = (qn)((b)paramq).fsH.fsP;
      ab.d("MicroMsg.NetSceneCheckBigFileUpload", "summersafecdn onGYNetEnd Signature[%s], fuin[%d], faeskey[%s], fSignature[%s]", new Object[] { paramq.guQ, Integer.valueOf(paramq.vXy), paramq.vXz, paramq.vXA });
      if (this.vcq != null)
        this.vcq.a(paramString.vXw, paramString.vRw, paramq.guQ, paramq.vXz, paramq.vXA, paramString.vXv);
      AppMethodBeat.o(27357);
    }
  }

  public final int getType()
  {
    return 727;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.z
 * JD-Core Version:    0.6.2
 */