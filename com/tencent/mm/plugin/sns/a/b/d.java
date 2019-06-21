package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bl;
import com.tencent.mm.protocal.protobuf.bm;
import com.tencent.mm.protocal.protobuf.bn;
import com.tencent.mm.protocal.protobuf.bo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public final class d extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  public f ehi;

  public d(String paramString1, int paramInt1, int paramInt2, int paramInt3, bl parambl, bo parambo, int paramInt4, String paramString2, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, com.tencent.mm.bt.b paramb1, com.tencent.mm.bt.b paramb2)
  {
    AppMethodBeat.i(35705);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bm();
    ((b.a)localObject).fsK = new bn();
    if (paramInt6 != 2)
    {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/exposure";
      ((b.a)localObject).fsI = 1231;
      ((b.a)localObject).fsL = 0;
      ((b.a)localObject).fsM = 0;
      this.ehh = ((b.a)localObject).acD();
      ab.i("MicroMsg.NetSceneAdExposure", "uri %s", new Object[] { this.ehh.uri });
      localObject = (bm)this.ehh.fsG.fsP;
      ((bm)localObject).vDK = paramInt3;
      ((bm)localObject).type = paramInt2;
      ((bm)localObject).scene = paramInt1;
      ((bm)localObject).qEg = paramString1;
      ((bm)localObject).vDN = paramInt5;
      ((bm)localObject).vDO = paramInt7;
      ((bm)localObject).vDP = paramInt8;
      ((bm)localObject).vDz = paramInt9;
      if (parambl != null)
      {
        ((bm)localObject).vDL = parambl;
        ab.i("MicroMsg.NetSceneAdExposure", "exposure_info " + parambl.vDI);
      }
      if (parambo != null)
      {
        ((bm)localObject).vDM = parambo;
        ab.i("MicroMsg.NetSceneAdExposure", "social_info " + parambo.vDR + " " + parambo.vDQ);
      }
      ((bm)localObject).bssid = at.gF(ah.getContext());
      ((bm)localObject).ssid = at.gE(ah.getContext());
      ((bm)localObject).vDu = System.currentTimeMillis();
      ((bm)localObject).vDw = paramInt4;
      if (paramString2 != null)
        ((bm)localObject).vDt = paramString2;
      if (paramb2 != null)
        ((bm)localObject).vDB = paramb2;
      if (paramb1 != null)
        ((bm)localObject).vDA = paramb1;
      paramString1 = new StringBuilder("##viewid:").append(paramString1).append(" scene:").append(paramInt1).append(" exposureScene:").append(paramInt2).append(" duration:").append(paramInt3).append(" feed_duration:").append(paramInt7).append(" feed_full_duration:").append(paramInt8).append(" ad_type:").append(paramInt4).append(" exposureCount:").append(paramInt5).append(" descXml:").append(paramString2).append(" flip_status:").append(paramInt9).append(" self_info.length:");
      if (paramb2 != null)
        break label502;
      paramInt1 = 0;
      label447: paramString1 = paramString1.append(paramInt1).append(" source_info.length:");
      if (paramb1 != null)
        break label512;
    }
    label512: for (paramInt1 = 0; ; paramInt1 = paramb1.wR.length)
    {
      ab.i("MicroMsg.NetSceneAdExposure", paramInt1);
      AppMethodBeat.o(35705);
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adexposure";
      ((b.a)localObject).fsI = 1875;
      break;
      label502: paramInt1 = paramb2.wR.length;
      break label447;
    }
  }

  public d(String paramString, int paramInt1, bo parambo, int paramInt2, int paramInt3, int paramInt4, com.tencent.mm.bt.b paramb1, com.tencent.mm.bt.b paramb2)
  {
    this(paramString, paramInt1, 1, 0, null, parambo, paramInt2, "", paramInt3, paramInt4, 0, 0, 0, paramb1, paramb2);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(35706);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(35706);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(35707);
    ab.i("MicroMsg.NetSceneAdExposure", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (bn)this.ehh.fsH.fsP;
    ab.i("MicroMsg.NetSceneAdExposure", "resp " + paramq.ret + " msg: " + paramq.bzH);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(35707);
  }

  public final int getType()
  {
    return 1231;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.d
 * JD-Core Version:    0.6.2
 */