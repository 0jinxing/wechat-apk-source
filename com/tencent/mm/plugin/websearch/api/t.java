package com.tencent.mm.plugin.websearch.api;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cvd;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class t extends a
  implements k
{
  private b ehh;
  private f ehi;
  private s fpL;

  public t(s params)
  {
    AppMethodBeat.i(124061);
    this.fpL = params;
    this.tZu = params.ctj;
    this.Lp = params.offset;
    this.gOW = params.scene;
    this.tZt = params.cIv;
    this.fpL = params;
    this.tZv = params.tZN;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsI = 1943;
    ((b.a)localObject1).uri = "/cgi-bin/mmsearch-bin/mmwebrecommend";
    ((b.a)localObject1).fsJ = new cvd();
    ((b.a)localObject1).fsK = new cve();
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (cvd)this.ehh.fsG.fsP;
    ((cvd)localObject1).vOq = params.offset;
    ((cvd)localObject1).wDH = aa.HV(1);
    ((cvd)localObject1).wUr = params.tZw;
    ((cvd)localObject1).wkD = params.ctj;
    ((cvd)localObject1).wDI = aa.abJ();
    ((cvd)localObject1).Scene = params.scene;
    ((cvd)localObject1).vQg = params.lcA;
    ((cvd)localObject1).xrc = params.cIC;
    ((cvd)localObject1).wCv = params.tZC;
    ((cvd)localObject1).xfr = params.cdf;
    ((cvd)localObject1).xrd = params.tZP;
    Object localObject2 = new tn();
    ((tn)localObject2).key = "client_system_version";
    ((tn)localObject2).waD = Build.VERSION.SDK_INT;
    params.tZG.add(localObject2);
    ((cvd)localObject1).xqa = params.tZG;
    ((cvd)localObject1).wCy = params.cvF;
    this.cIz = params.nQB;
    int i;
    String str;
    int j;
    if (params.tZQ)
    {
      i = params.scene;
      localObject1 = params.cvF;
      str = params.cIy;
      localObject2 = params.lcA;
      j = params.offset;
      if (params.tZw != 1)
        break label351;
    }
    while (true)
    {
      z.a(i, (String)localObject1, str, (String)localObject2, j, bool, params.nQB, params.ctj, params.businessType, params.tZM);
      AppMethodBeat.o(124061);
      return;
      label351: bool = false;
    }
  }

  private cve cUW()
  {
    return (cve)this.ehh.fsH.fsP;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(124062);
    an.reportIdKey649ForLook(this.gOW, 2);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(124062);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124063);
    ab.i("MicroMsg.FTS.NetSceneWebRecommend", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool1;
    boolean bool2;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bool1 = true;
      if (this.fpL.tZQ)
      {
        int i = this.fpL.scene;
        paramq = this.fpL.cvF;
        String str = this.fpL.cIy;
        paramArrayOfByte = this.fpL.lcA;
        paramInt1 = this.fpL.offset;
        if (this.fpL.tZw != 1)
          break label205;
        bool2 = true;
        label122: z.a(i, paramq, str, paramArrayOfByte, paramInt1, bool2, this.fpL.nQB, bool1, this.fpL.ctj, this.fpL.businessType, this.fpL.tZM);
      }
      if (paramInt3 != -1)
        break label211;
      an.reportIdKey649ForLook(this.gOW, 4);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(124063);
      return;
      bool1 = false;
      break;
      label205: bool2 = false;
      break label122;
      label211: if ((paramInt2 != 0) || (paramInt3 != 0))
        an.reportIdKey649ForLook(this.gOW, 8);
      else
        an.reportIdKey649ForLook(this.gOW, 3);
    }
  }

  public final String abH()
  {
    AppMethodBeat.i(124064);
    String str;
    if (cUW() != null)
    {
      str = cUW().vOy;
      AppMethodBeat.o(124064);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(124064);
    }
  }

  public final int abI()
  {
    AppMethodBeat.i(124065);
    int i;
    if (cUW() != null)
    {
      i = cUW().wCB;
      AppMethodBeat.o(124065);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(124065);
    }
  }

  public final int getType()
  {
    return 1943;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.t
 * JD-Core Version:    0.6.2
 */