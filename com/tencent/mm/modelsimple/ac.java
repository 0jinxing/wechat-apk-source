package com.tencent.mm.modelsimple;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cyg;
import com.tencent.mm.protocal.protobuf.cyh;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class ac extends m
  implements k
{
  private f ehi;
  private final com.tencent.mm.ai.b fmP;
  private int retryCount;

  public ac(String paramString, int paramInt)
  {
    AppMethodBeat.i(78615);
    this.retryCount = 3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cyg();
    ((b.a)localObject).fsK = new cyh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/yybgetpkgsig";
    ((b.a)localObject).fsI = 729;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fmP = ((b.a)localObject).acD();
    localObject = (cyg)this.fmP.fsG.fsP;
    ((cyg)localObject).luQ = aa.dor();
    ((cyg)localObject).vIh = com.tencent.mm.plugin.normsg.a.b.oTO.An(0);
    ((cyg)localObject).xtD = paramString;
    ((cyg)localObject).mZv = paramInt;
    ab.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig Language[%s], PkgName[%s], versionCode[%d], stack[%s]", new Object[] { ((cyg)localObject).luQ, paramString, Integer.valueOf(paramInt), bo.dpG() });
    AppMethodBeat.o(78615);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78616);
    this.ehi = paramf;
    int i = a(parame, this.fmP, this);
    AppMethodBeat.o(78616);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78617);
    paramq = (cyg)this.fmP.fsG.fsP;
    paramArrayOfByte = (cyh)this.fmP.fsH.fsP;
    ab.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s], ret[%d], sig[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(paramArrayOfByte.xtE), paramArrayOfByte.xtF });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig err and return!");
      com.tencent.mm.plugin.report.service.h.pYm.a(322L, 1L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4001), String.format("%s,%d,%d,%d", new Object[] { paramq.xtD, Integer.valueOf(paramq.mZv), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78617);
    }
    while (true)
    {
      return;
      if ((paramArrayOfByte.xtE != 2) && (paramArrayOfByte.xtE != 3))
        break label393;
      this.retryCount -= 1;
      if (this.retryCount > 0)
        break;
      ab.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken err and return with no try!");
      com.tencent.mm.plugin.report.service.h.pYm.a(322L, 2L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4002), String.format("%s,%d", new Object[] { paramq.xtD, Integer.valueOf(paramq.mZv) }) });
      this.ehi.onSceneEnd(3, -1, "", this);
      AppMethodBeat.o(78617);
    }
    ab.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken do scene again retryCount:%d", new Object[] { Integer.valueOf(this.retryCount) });
    a(this.ftf, this.ehi);
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78617);
      break;
      label393: if (paramArrayOfByte.xtE == 1)
      {
        MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "yyb_pkg_sig_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().remove(paramq.xtD).commit();
        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 5L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4005), String.format("%s,%d", new Object[] { paramq.xtD, Integer.valueOf(paramq.mZv) }) });
        ab.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no sig[%s] and remove", new Object[] { paramArrayOfByte.xtF });
      }
      else if (paramArrayOfByte.xtE == 4)
      {
        ab.w("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no need try and revise");
        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 4L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4004), String.format("%s,%d", new Object[] { paramq.xtD, Integer.valueOf(paramq.mZv) }) });
      }
      else
      {
        ab.i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret sig[%s]", new Object[] { paramArrayOfByte.xtF });
        MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "yyb_pkg_sig_prefs", com.tencent.mm.compatible.util.h.Mu()).edit().putString(paramq.xtD, paramArrayOfByte.xtF).commit();
        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 3L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4003), String.format("%s,%d,%s", new Object[] { paramq.xtD, Integer.valueOf(paramq.mZv), paramArrayOfByte.xtF }) });
      }
    }
  }

  public final int getType()
  {
    return 729;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ac
 * JD-Core Version:    0.6.2
 */