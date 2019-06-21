package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.clu;
import com.tencent.mm.protocal.protobuf.clv;
import com.tencent.mm.protocal.protobuf.clw;
import com.tencent.mm.protocal.protobuf.coa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class c extends m
  implements k
{
  private int Scene;
  private final String TAG;
  private String cMr;
  private com.tencent.mm.ai.b fsB;
  private String mFileName;
  private f oRe;
  private String svJ;
  private coa svL;
  private String svN;
  public clu svS;

  public c(c paramc)
  {
    AppMethodBeat.i(25584);
    this.TAG = "MicroMsg.NetSceneUploadVoiceForTrans";
    this.svJ = paramc.svJ;
    this.svL = paramc.svL;
    this.svS = paramc.svS;
    this.mFileName = paramc.mFileName;
    this.Scene = paramc.Scene;
    this.svN = paramc.svN;
    this.cMr = paramc.cMr;
    ab.d("MicroMsg.NetSceneUploadVoiceForTrans", "alvinluo voiceTrans constructor scene: %d, fromUser: %s, toUser: %s", new Object[] { Integer.valueOf(paramc.Scene), paramc.svN, paramc.cMr });
    cDS();
    AppMethodBeat.o(25584);
  }

  public c(String paramString1, clu paramclu, int paramInt, String paramString2)
  {
    AppMethodBeat.i(25585);
    this.TAG = "MicroMsg.NetSceneUploadVoiceForTrans";
    if (paramString2 != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.svJ = paramString1;
      this.svS = paramclu;
      this.svL = d.bm(paramInt, paramString2);
      this.mFileName = paramString2;
      cDS();
      AppMethodBeat.o(25585);
      return;
    }
  }

  public c(String paramString1, clu paramclu, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(25586);
    this.TAG = "MicroMsg.NetSceneUploadVoiceForTrans";
    if (paramString2 != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ab.d("MicroMsg.NetSceneUploadVoiceForTrans", "alvinluo voiceTrans scene: %d, fromUser: %s, toUser: %s", new Object[] { Integer.valueOf(paramInt2), paramString3, paramString4 });
      this.svJ = paramString1;
      this.svS = paramclu;
      this.svL = d.bm(paramInt1, paramString2);
      this.mFileName = paramString2;
      this.Scene = paramInt2;
      this.svN = paramString3;
      this.cMr = paramString4;
      cDS();
      AppMethodBeat.o(25586);
      return;
    }
  }

  private void cDS()
  {
    AppMethodBeat.i(25589);
    b.a locala = new b.a();
    locala.fsJ = new clv();
    locala.fsK = new clw();
    locala.uri = "/cgi-bin/micromsg-bin/uploadvoicefortrans";
    locala.fsI = 547;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fsB = locala.acD();
    AppMethodBeat.o(25589);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25587);
    this.oRe = paramf;
    int i;
    if ((!bo.isNullOrNil(this.mFileName)) && (!bo.isNullOrNil(this.svJ)) && (this.svS != null) && (this.svL != null))
    {
      i = 1;
      if (i != 0)
        break label73;
      ab.e("MicroMsg.NetSceneUploadVoiceForTrans", "doScene: Value not Valid, so, do nothing.");
      i = -1;
      AppMethodBeat.o(25587);
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label73: clv localclv = (clv)this.fsB.fsG.fsP;
      localclv.vZx = this.svJ;
      localclv.vZy = this.svL;
      localclv.vZA = this.svS;
      Object localObject = this.mFileName;
      i = this.svS.ptx;
      int j = this.svS.pty;
      paramf = new SKBuiltinBuffer_t();
      localObject = com.tencent.mm.modelvoice.q.uN((String)localObject);
      if (localObject != null)
        paramf = aa.ad(((com.tencent.mm.modelvoice.b)localObject).cF(i, j).buf);
      localclv.ptz = paramf;
      localclv.Scene = this.Scene;
      localclv.ndG = this.svN;
      localclv.ndF = this.cMr;
      i = a(parame, this.fsB, this);
      AppMethodBeat.o(25587);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25588);
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.svS = ((clw)this.fsB.fsH.fsP).vZA;
      this.oRe.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (!cDT())
        break label125;
      if (this.svS == null)
        break label119;
      bool = true;
      label65: ab.i("MicroMsg.NetSceneUploadVoiceForTrans", "succeeed finish: %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(25588);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneUploadVoiceForTrans", "error upload: errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      break;
      label119: bool = false;
      break label65;
      label125: AppMethodBeat.o(25588);
    }
  }

  public final boolean cDT()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.svS != null)
      if (this.svS.pty > 0)
        break label25;
    label25: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final int getType()
  {
    return 547;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.c
 * JD-Core Version:    0.6.2
 */