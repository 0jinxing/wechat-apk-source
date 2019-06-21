package com.tencent.mm.sandbox.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.c.i;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.mm.protocal.protobuf.apg;
import com.tencent.mm.protocal.protobuf.aph;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;
import java.util.LinkedList;

public final class a extends m
  implements k, com.tencent.mm.plugin.p.b
{
  public final com.tencent.mm.ai.b ehh;
  private f ehi;

  public a(int paramInt)
  {
    AppMethodBeat.i(28779);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new apg();
    ((b.a)localObject).fsK = new aph();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getupdateinfo";
    ((b.a)localObject).fsI = 113;
    ((b.a)localObject).fsL = 35;
    ((b.a)localObject).fsM = 1000000035;
    this.ehh = ((b.a)localObject).acD();
    localObject = (apg)this.ehh.fsG.fsP;
    ((apg)localObject).wth = paramInt;
    ((apg)localObject).vAM = g.cdf;
    if ((10012 == ae.giz) && (ae.giA > 0))
      ((apg)localObject).vAM = ae.giA;
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      ab.i("MicroMsg.NetSceneGetUpdateInfo", "summerupdate dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d, stack[%s]", new Object[] { Integer.valueOf(((apg)localObject).wth), Integer.valueOf(((apg)localObject).vAM), Integer.valueOf(g.cdf), bo.dpG() });
      AppMethodBeat.o(28779);
      return;
      h.pYm.a(405L, 3L, 1L, true);
      continue;
      h.pYm.a(405L, 4L, 1L, true);
      continue;
      h.pYm.a(405L, 5L, 1L, true);
      continue;
      h.pYm.a(405L, 6L, 1L, true);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(28780);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(28780);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(28781);
    ab.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken GetUpdateInfo onGYNetEnd errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      h.pYm.a(405L, 7L, 1L, true);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      paramq = dnb();
      if (paramq == null)
        break label286;
      paramString = i.cO(paramq);
      if (paramString == null)
        break label261;
      paramInt1 = paramString.versionCode;
      ab.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchVersionCode[%d]", new Object[] { Integer.valueOf(paramInt1) });
      aw.Rg().a(new ac(ah.getPackageName(), paramInt1), 0);
      h.pYm.a(405L, 13L, 1L, true);
      AppMethodBeat.o(28781);
    }
    while (true)
    {
      return;
      h.pYm.a(405L, 8L, 1L, true);
      if (paramInt2 != 4)
        break;
      h.pYm.a(405L, 9L, 1L, true);
      if (paramInt3 == -16)
      {
        h.pYm.a(405L, 10L, 1L, true);
        break;
      }
      if (paramInt3 == -17)
      {
        h.pYm.a(405L, 11L, 1L, true);
        break;
      }
      if (paramInt3 != -18)
        break;
      h.pYm.a(405L, 12L, 1L, true);
      break;
      label261: ab.i("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchInfo is null patchXml[%s]", new Object[] { paramq });
      AppMethodBeat.o(28781);
      continue;
      label286: ab.w("MicroMsg.NetSceneGetUpdateInfo", "summertoken patchXml is null!");
      h.pYm.a(405L, 14L, 1L, true);
      AppMethodBeat.o(28781);
    }
  }

  public final int bQP()
  {
    return ((aph)this.ehh.fsH.fsP).wti;
  }

  public final String[] bQQ()
  {
    AppMethodBeat.i(28782);
    aph localaph = (aph)this.ehh.fsH.fsP;
    String[] arrayOfString = new String[localaph.wtn.size()];
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      arrayOfString[j] = ((bts)localaph.wtn.get(j)).wVI;
    AppMethodBeat.o(28782);
    return arrayOfString;
  }

  public final aph bQR()
  {
    int i = 1;
    aph localaph;
    if (SubCoreSandBox.pYG)
    {
      localaph = (aph)this.ehh.fsH.fsP;
      localaph.wtp = 1;
      localaph.wtq = "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
      if (!SubCoreSandBox.pYH)
        break label59;
    }
    while (true)
    {
      localaph.wtr = i;
      return (aph)this.ehh.fsH.fsP;
      label59: i = 0;
    }
  }

  public final int dmZ()
  {
    return ((aph)this.ehh.fsH.fsP).wtk;
  }

  public final String dna()
  {
    return ((aph)this.ehh.fsH.fsP).wtj;
  }

  public final String dnb()
  {
    AppMethodBeat.i(28783);
    Object localObject = (aph)this.ehh.fsH.fsP;
    ab.d("MicroMsg.NetSceneGetUpdateInfo", "summertoken getPatchInfo[%s], stack[%s]", new Object[] { ((aph)localObject).wto, bo.dpG() });
    localObject = ((aph)localObject).wto;
    AppMethodBeat.o(28783);
    return localObject;
  }

  public final int getType()
  {
    return 11;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.a.a
 * JD-Core Version:    0.6.2
 */