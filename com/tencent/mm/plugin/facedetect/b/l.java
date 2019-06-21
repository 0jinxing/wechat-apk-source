package com.tencent.mm.plugin.facedetect.b;

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
import com.tencent.mm.protocal.protobuf.aaf;
import com.tencent.mm.protocal.protobuf.aag;
import com.tencent.mm.protocal.protobuf.axh;
import com.tencent.mm.protocal.protobuf.blr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class l extends m
  implements k
{
  private b ehh;
  private f ehi;
  private LinkedList<axh> lSF;
  public blr lSG;
  public String lSH;
  public String lSI;
  public String lSJ;
  public String lSK;
  public String lSL;
  public float lSM;
  public int lSN;
  public String lSO;

  public l(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(78);
    this.lSF = null;
    this.lSG = null;
    this.lSJ = null;
    this.lSK = null;
    this.lSL = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aaf();
    ((b.a)localObject).fsK = new aag();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/faceidentifyprepage";
    ((b.a)localObject).fsI = 1147;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aaf)this.ehh.fsG.fsP;
    ((aaf)localObject).csB = paramString1;
    ((aaf)localObject).wfo = paramString2;
    ((aaf)localObject).lSN = paramInt;
    AppMethodBeat.o(78);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(79);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(79);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80);
    ab.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (aag)((b)paramq).fsH.fsP;
    if (paramq != null)
    {
      this.lSF = paramq.vWz;
      this.lSG = paramq.wfp;
      this.lSJ = paramq.wfr;
      this.lSK = paramq.wfs;
      this.lSL = paramq.wft;
      this.lSM = paramq.wfu;
      this.lSN = paramq.lSN;
      this.lSO = paramq.lSO;
      this.lSH = paramq.wfv;
      this.lSI = paramq.wfq;
      ab.d("MicroMsg.NetSceneFaceGetConfirmPageInfo", "Light threshold is A : " + this.lSM);
      ab.d("MicroMsg.NetSceneFaceGetConfirmPageInfo", "check_alive_type is  : " + this.lSN);
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    }
    AppMethodBeat.o(80);
  }

  public final int getType()
  {
    return 1147;
  }

  public final String toString()
  {
    AppMethodBeat.i(81);
    String str = "NetSceneFaceGetConfirmPageInfo{callback=" + this.ehi + ", rr=" + this.ehh + ", mFaceConfirmInfoList=" + this.lSF + ", mPromptButtonInfo=" + this.lSG + ", bizHeadUrl='" + this.lSH + '\'' + ", bizNickName='" + this.lSI + '\'' + ", mHeaderPrompt='" + this.lSJ + '\'' + ", mFeedbackUrl='" + this.lSK + '\'' + ", mComplainUrl='" + this.lSL + '\'' + ", mLight_threshold=" + this.lSM + ", check_alive_type=" + this.lSN + ", business_tips='" + this.lSO + '\'' + '}';
    AppMethodBeat.o(81);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.l
 * JD-Core Version:    0.6.2
 */