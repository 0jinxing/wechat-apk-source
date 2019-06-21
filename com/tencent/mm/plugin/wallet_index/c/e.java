package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.d.d;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.adj;
import com.tencent.mm.protocal.protobuf.adk;
import com.tencent.mm.protocal.protobuf.csj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.c.u;

public class e extends u
  implements i
{
  private b ehh;
  private f ehi;
  public String tRa;
  public String tRb;
  public csj tRc;
  public String tRd;

  public e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2, int paramInt3, String paramString9)
  {
    AppMethodBeat.i(48181);
    this.tRd = "";
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new adj();
    ((b.a)localObject1).fsK = new adk();
    ((b.a)localObject1).uri = getUri();
    ((b.a)localObject1).fsI = getType();
    ((b.a)localObject1).fsL = 189;
    ((b.a)localObject1).fsM = 1000000189;
    ((b.a)localObject1).fsO = com.tencent.mm.wallet_core.ui.e.atB(paramString4);
    this.ehh = ((b.a)localObject1).acD();
    this.tRd = paramString7;
    Object localObject2 = d.cvQ();
    localObject1 = ((com.tencent.mm.plugin.soter.d.e)localObject2).rOh;
    String str = ((com.tencent.mm.plugin.soter.d.e)localObject2).jSY;
    localObject2 = (adj)this.ehh.fsG.fsP;
    ((adj)localObject2).fKh = paramString1;
    ((adj)localObject2).vYP = paramString4;
    ((adj)localObject2).vYO = paramString3;
    ((adj)localObject2).vYQ = paramString5;
    ((adj)localObject2).vYR = paramString2;
    ((adj)localObject2).vLo = paramString6;
    ((adj)localObject2).vXP = paramString7;
    ((adj)localObject2).wla = paramString8;
    ((adj)localObject2).vAM = paramInt1;
    ((adj)localObject2).wle = ((String)localObject1);
    ((adj)localObject2).wld = str;
    ((adj)localObject2).vRP = k.cPy();
    if (paramInt2 > 0)
      ((adj)localObject2).Scene = paramInt2;
    ((adj)localObject2).wlf = paramInt3;
    ((adj)localObject2).wlg = paramString9;
    ab.d("MicroMsg.NetSceneGenPrepay", "appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s,WxAppScene:%s,cookie:%s", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString9 });
    AppMethodBeat.o(48181);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(48183);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48183);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48182);
    ab.d("MicroMsg.NetSceneGenPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (adk)((b)paramq).fsH.fsP;
    ab.i("MicroMsg.NetSceneGenPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramString.luT), paramString.luU });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.d("MicroMsg.NetSceneGenPrepay", "rr " + paramString.wlb);
      this.tRa = paramString.wlb;
      this.tRb = paramString.wlc;
      this.tRc = paramString.wlh;
    }
    paramq = paramString.luU;
    paramInt2 = paramString.luT;
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramq, this);
    AppMethodBeat.o(48182);
  }

  public int getType()
  {
    return 398;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/genprepay";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.e
 * JD-Core Version:    0.6.2
 */