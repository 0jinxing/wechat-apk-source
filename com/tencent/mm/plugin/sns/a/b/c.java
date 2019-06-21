package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.bh;
import com.tencent.mm.protocal.protobuf.bi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public final class c extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  public f ehi;

  public c(long paramLong, String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, String paramString3, int paramInt5, com.tencent.mm.bt.b paramb1, com.tencent.mm.bt.b paramb2)
  {
    AppMethodBeat.i(94483);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bh();
    ((b.a)localObject).fsK = new bi();
    int i = n.qFD.jS(paramLong);
    if (i != 2)
    {
      ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/click";
      ((b.a)localObject).fsI = 1232;
      ((b.a)localObject).fsL = 0;
      ((b.a)localObject).fsM = 0;
      this.ehh = ((b.a)localObject).acD();
      ab.i("MicroMsg.NetSceneAdClick", "source %d, uri %s", new Object[] { Integer.valueOf(i), this.ehh.uri });
      localObject = new StringBuilder("snsId:").append(paramLong).append(" viewId:").append(paramString1).append(" clickPos:").append(paramInt1).append(" clickAction:").append(paramInt2).append(" sceneType:").append(paramInt3).append(" descXml:").append(paramString2).append(" adtype:").append(paramInt4).append(" snsStatStr:").append(paramString3).append(" flipStatus:").append(paramInt5).append(" remind_source_info.length:");
      if (paramb1 == null)
        break label439;
      j = paramb1.wR.length;
      label236: localObject = ((StringBuilder)localObject).append(String.valueOf(j)).append(" remind_self_info.length:");
      if (paramb2 == null)
        break label445;
    }
    label439: label445: for (int j = paramb2.wR.length; ; j = 0)
    {
      ab.i("MicroMsg.NetSceneAdClick", String.valueOf(j));
      localObject = (bh)this.ehh.fsG.fsP;
      ((bh)localObject).vDs = paramInt1;
      ((bh)localObject).qEg = paramString1;
      ((bh)localObject).scene = paramInt3;
      ((bh)localObject).vDt = paramString2;
      ((bh)localObject).bssid = at.gF(ah.getContext());
      ((bh)localObject).ssid = at.gE(ah.getContext());
      ((bh)localObject).vDu = System.currentTimeMillis();
      ((bh)localObject).vDw = paramInt4;
      ((bh)localObject).vDx = paramInt2;
      ((bh)localObject).cvd = i;
      ((bh)localObject).vDy = paramString3;
      ((bh)localObject).vDz = paramInt5;
      if (paramb2 != null)
        ((bh)localObject).vDB = paramb2;
      if (paramb1 != null)
        ((bh)localObject).vDA = paramb1;
      AppMethodBeat.o(94483);
      return;
      ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adclick";
      ((b.a)localObject).fsI = 1817;
      break;
      j = 0;
      break label236;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(94484);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(94484);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94485);
    ab.d("MicroMsg.NetSceneAdClick", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(94485);
  }

  public final int getType()
  {
    return 1232;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.c
 * JD-Core Version:    0.6.2
 */