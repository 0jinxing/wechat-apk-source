package com.tencent.mm.al;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnInfoParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.agb;
import com.tencent.mm.protocal.protobuf.agc;
import com.tencent.mm.protocal.protobuf.mv;
import com.tencent.mm.protocal.protobuf.mw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class d extends m
  implements k
{
  public static long fzj;
  private static Map<String, d.a> fzk;
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private String fzl;
  int scene;
  public long startTime;

  static
  {
    AppMethodBeat.i(78071);
    fzj = 0L;
    fzk = new HashMap();
    AppMethodBeat.o(78071);
  }

  protected d(int paramInt)
  {
    AppMethodBeat.i(78066);
    this.startTime = 0L;
    this.scene = 0;
    this.fzl = "";
    ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn init Scene:%d  [%s]", new Object[] { Integer.valueOf(paramInt), bo.dpG() });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new agb();
    ((b.a)localObject).fsK = new agc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcdndns";
    ((b.a)localObject).fsI = 379;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.scene = paramInt;
    localObject = (agb)this.ehh.fsG.fsP;
    ((agb)localObject).wnb = "";
    ((agb)localObject).Scene = paramInt;
    AppMethodBeat.o(78066);
  }

  private static CdnLogic.CdnInfoParams a(mv parammv)
  {
    AppMethodBeat.i(78069);
    CdnLogic.CdnInfoParams localCdnInfoParams = new CdnLogic.CdnInfoParams();
    localCdnInfoParams.c2CretryIntervalMs = parammv.vQR;
    localCdnInfoParams.c2CrwtimeoutMs = parammv.vQT;
    localCdnInfoParams.c2CshowErrorDelayMs = parammv.vQP;
    localCdnInfoParams.snsretryIntervalMs = parammv.vQS;
    localCdnInfoParams.snsrwtimeoutMs = parammv.vQU;
    localCdnInfoParams.snsshowErrorDelayMs = parammv.vQQ;
    AppMethodBeat.o(78069);
    return localCdnInfoParams;
  }

  private static String aft()
  {
    AppMethodBeat.i(78068);
    String str;
    if (!at.isConnected(ah.getContext()))
    {
      AppMethodBeat.o(78068);
      str = null;
    }
    while (true)
    {
      return str;
      if (at.isWifi(ah.getContext()));
      for (str = "wifi_" + at.gE(ah.getContext()); ; str = "mobile_" + at.getNetTypeString(ah.getContext()) + "_" + at.getISPCode(ah.getContext()))
      {
        ab.d("MicroMsg.NetSceneGetCDNDns", "cdntra getCurCacheFullPath file:%s", new Object[] { str });
        if ((str != null) && (str.length() >= 2))
          break label130;
        AppMethodBeat.o(78068);
        str = null;
        break;
      }
      label130: str = String.format("%x", new Object[] { Integer.valueOf(str.hashCode()) });
      StringBuilder localStringBuilder = new StringBuilder();
      f.afu();
      str = f.afv() + str;
      AppMethodBeat.o(78068);
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(78067);
    this.ehi = paramf;
    g.RN();
    int i = com.tencent.mm.kernel.a.QF();
    if (i == 0)
    {
      ab.e("MicroMsg.NetSceneGetCDNDns", "has not set uin.");
      i = -1;
      AppMethodBeat.o(78067);
    }
    d.a locala;
    while (true)
    {
      return i;
      if (fzj != i)
      {
        fzj = i;
        fzk.clear();
      }
      l = bo.anT();
      if (this.scene != 0)
        break label473;
      this.fzl = bo.bc(aft(), "");
      locala = (d.a)fzk.get(this.fzl);
      paramf = locala;
      if (locala == null)
      {
        paramf = new d.a();
        fzk.put(this.fzl, paramf);
        ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn doScene NEW lastGetResult[%s] path[%s]", new Object[] { paramf, this.fzl });
      }
      if (paramf.fzm)
      {
        paramf.fzn = l;
        paramf.fzo = l;
        paramf.fzp = 0L;
      }
      ab.d("MicroMsg.NetSceneGetCDNDns", "cdntra doscene Sec:%d Hour[%d,%d]", new Object[] { Long.valueOf(l - paramf.fzn), Long.valueOf(l - paramf.fzo), Long.valueOf(paramf.fzp) });
      if ((l > paramf.fzn) && (l - paramf.fzn < 10L))
      {
        ab.w("MicroMsg.NetSceneGetCDNDns", "Last get dns at %d ago . ignore!, lastGetResult[%s]", new Object[] { Long.valueOf(l - paramf.fzn), paramf });
        i = -1;
        AppMethodBeat.o(78067);
      }
      else
      {
        if ((l <= paramf.fzo) || (l - paramf.fzo >= 3600L) || (paramf.fzp < 90L))
          break;
        ab.w("MicroMsg.NetSceneGetCDNDns", "in 1 hour , get dns more than 90  (%d). ignore!, lastGetResult[%s]", new Object[] { Long.valueOf(l - paramf.fzo), paramf });
        i = -1;
        AppMethodBeat.o(78067);
      }
    }
    paramf.fzn = l;
    if ((l < paramf.fzo) || (l - paramf.fzp > 3600L))
    {
      paramf.fzo = l;
      paramf.fzp = 0L;
      label409: this.startTime = l;
      paramf = h.pYm;
      if (this.scene != 0)
        break label586;
    }
    label586: for (long l = 0L; ; l = 1L)
    {
      paramf.a(546L, l, 1L, true);
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(78067);
      break;
      paramf.fzp += 1L;
      break label409;
      label473: this.fzl = "";
      paramf = fzk.values().iterator();
      if (paramf == null)
        break label409;
      while (paramf.hasNext())
      {
        locala = (d.a)paramf.next();
        if (locala != null)
        {
          locala.fzn = l;
          if ((l < locala.fzo) || (l - locala.fzp > 3600L))
          {
            locala.fzo = l;
            locala.fzp = 0L;
          }
          else
          {
            locala.fzp += 1L;
          }
        }
      }
      break label409;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78070);
    ab.d("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    agc localagc = (agc)((b)paramq).fsH.fsP;
    boolean bool;
    if ((paramInt2 != 0) || (paramInt3 != 0) || (localagc.vMl == null))
    {
      h.pYm.e(10769, new Object[] { Integer.valueOf(c.fzi), Integer.valueOf(0), Long.valueOf(this.startTime) });
      if (localagc.vMl == null)
      {
        bool = true;
        ab.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd: [%d ,%d]  info is null :%b", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(78070);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      paramq = aft();
      if ((!bo.isNullOrNil(paramq)) && (!bo.isNullOrNil(this.fzl)) && (!paramq.equals(this.fzl)))
      {
        ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd revised cacheFullPath[%s] to [%s]", new Object[] { paramq, this.fzl });
        h.pYm.a(546L, 6L, 1L, true);
      }
      fzk.clear();
      paramArrayOfByte = null;
      paramq = paramArrayOfByte;
      if (localagc.vMo != null)
      {
        paramq = paramArrayOfByte;
        if (localagc.vMo.getILen() > 0)
        {
          ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd cdnrule:%d", new Object[] { Integer.valueOf(localagc.vMo.getILen()) });
          paramq = aa.a(localagc.vMo);
        }
      }
      Object localObject = null;
      paramArrayOfByte = localObject;
      if (localagc.vMp != null)
      {
        paramArrayOfByte = localObject;
        if (localagc.vMp.getILen() > 0)
        {
          ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd safecdnrule:%d", new Object[] { Integer.valueOf(localagc.vMp.getILen()) });
          paramArrayOfByte = aa.a(localagc.vMp);
        }
      }
      ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo:%s", new Object[] { localagc.vMq });
      if (localagc.vMq != null)
        ab.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo FakeUin:%d NewAuthKey:%s", new Object[] { Integer.valueOf(localagc.vMq.luF), localagc.vMq.vRb });
      if (!f.afy().a(localagc.vMl, localagc.vMm, localagc.vMn, paramq, paramArrayOfByte, localagc.vMq))
      {
        ab.e("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd setCDNDnsInfo failed ");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(78070);
      }
      else
      {
        ab.i("MicroMsg.NetSceneGetCDNDns", "getcdndns defaultcfg %s, disastercfg %s, getcdninterval %d", new Object[] { localagc.vMs, localagc.vMt, Integer.valueOf(localagc.vMr) });
        if ((localagc.vMs != null) && (localagc.vMt != null))
          CdnLogic.setCdnInfoParams(a(localagc.vMs), a(localagc.vMt), localagc.vMr);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(78070);
      }
    }
  }

  public final int getType()
  {
    return 379;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.d
 * JD-Core Version:    0.6.2
 */