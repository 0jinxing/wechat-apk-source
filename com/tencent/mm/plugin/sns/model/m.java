package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.brf;
import com.tencent.mm.protocal.protobuf.cai;
import com.tencent.mm.protocal.protobuf.caj;
import com.tencent.mm.protocal.protobuf.cak;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class m extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  public static List<Long> qIU;
  public static List<Long> qIV;
  private long cND;
  private b ehh;
  public com.tencent.mm.ai.f ehi;
  private String fUM;

  static
  {
    AppMethodBeat.i(36253);
    qIU = Collections.synchronizedList(new LinkedList());
    qIV = Collections.synchronizedList(new LinkedList());
    AppMethodBeat.o(36253);
  }

  public m(long paramLong, int paramInt, String paramString)
  {
    AppMethodBeat.i(36249);
    this.cND = paramLong;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new caj();
    ((b.a)localObject1).fsK = new cak();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
    ((b.a)localObject1).fsI = 683;
    Object localObject2 = new StringBuilder();
    g.RQ();
    this.fUM = (g.RP().cachePath + "ad_detail_session");
    int i;
    if (at.isWifi(ah.getContext()))
      i = 1;
    while (true)
    {
      localObject2 = com.tencent.mm.vfs.e.e(this.fUM, 0, -1);
      this.ehh = ((b.a)localObject1).acD();
      ((caj)this.ehh.fsG.fsP).vQE = paramLong;
      ((caj)this.ehh.fsG.fsP).wZw = aa.ad((byte[])localObject2);
      ((caj)this.ehh.fsG.fsP).Scene = paramInt;
      ((caj)this.ehh.fsG.fsP).wZy = i;
      if ((paramString != null) && (paramString.length() > 0))
        ((caj)this.ehh.fsG.fsP).wZx = aa.vz(paramString);
      localObject1 = new StringBuilder("req snsId ").append(paramLong).append(" ").append(com.tencent.mm.plugin.sns.data.i.jV(paramLong)).append(" scene ").append(paramInt).append(" buf is null? ");
      if (localObject2 == null);
      for (boolean bool = true; ; bool = false)
      {
        ab.d("MicroMsg.NetSceneSnsAdObjectDetial", bool);
        ab.i("MicroMsg.NetSceneSnsAdObjectDetial", "do adObjectDetail snsId[%d] scene[%d] syncBuffer[%s]", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt), paramString });
        AppMethodBeat.o(36249);
        return;
        if (at.is3G(ah.getContext()))
        {
          i = 3;
          break;
        }
        if (at.is4G(ah.getContext()))
        {
          i = 4;
          break;
        }
        if (!at.is2G(ah.getContext()))
          break label388;
        i = 2;
        break;
      }
      label388: i = 0;
    }
  }

  public m(long paramLong, brf parambrf)
  {
    this(paramLong, 2, "");
    AppMethodBeat.i(36250);
    ((caj)this.ehh.fsG.fsP).vFa = parambrf;
    AppMethodBeat.o(36250);
  }

  public static boolean kb(long paramLong)
  {
    AppMethodBeat.i(36245);
    boolean bool;
    if (qIU.contains(Long.valueOf(paramLong)))
    {
      bool = false;
      AppMethodBeat.o(36245);
    }
    while (true)
    {
      return bool;
      qIU.add(Long.valueOf(paramLong));
      bool = true;
      AppMethodBeat.o(36245);
    }
  }

  public static boolean kc(long paramLong)
  {
    AppMethodBeat.i(36246);
    boolean bool;
    if (qIV.contains(Long.valueOf(paramLong)))
    {
      bool = false;
      AppMethodBeat.o(36246);
    }
    while (true)
    {
      return bool;
      qIV.add(Long.valueOf(paramLong));
      bool = true;
      AppMethodBeat.o(36246);
    }
  }

  private static boolean kd(long paramLong)
  {
    AppMethodBeat.i(36247);
    qIV.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(36247);
    return true;
  }

  private static boolean ke(long paramLong)
  {
    AppMethodBeat.i(36248);
    qIU.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(36248);
    return true;
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36251);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36251);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36252);
    ab.i("MicroMsg.NetSceneSnsAdObjectDetial", "errType " + paramInt2 + " errCode " + paramInt3);
    int i = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramInt1 = 1;
      if (paramInt1 != 0)
        break label205;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (((caj)this.ehh.fsG.fsP).Scene != 2)
        break label191;
      h.pYm.k(955L, 1L, 1L);
      label100: ke(this.cND);
      kd(this.cND);
      AppMethodBeat.o(36252);
    }
    while (true)
    {
      return;
      paramInt1 = i;
      if (paramInt2 != 4)
        break;
      paramInt1 = i;
      if (paramInt3 != 1)
        break;
      paramq = aa.a(((cak)this.ehh.fsH.fsP).wZw);
      if (paramq != null)
      {
        com.tencent.mm.vfs.e.deleteFile(this.fUM);
        com.tencent.mm.vfs.e.b(this.fUM, paramq, paramq.length);
      }
      paramInt1 = 0;
      break;
      label191: h.pYm.k(955L, 0L, 1L);
      break label100;
      label205: paramq = aa.a(((cak)this.ehh.fsH.fsP).wZw);
      if (paramq != null)
      {
        com.tencent.mm.vfs.e.deleteFile(this.fUM);
        com.tencent.mm.vfs.e.b(this.fUM, paramq, paramq.length);
      }
      paramq = ((cak)this.ehh.fsH.fsP).wZz;
      paramArrayOfByte = ((cak)this.ehh.fsH.fsP).wZA;
      paramInt1 = ((caj)this.ehh.fsG.fsP).Scene;
      if (paramq != null)
      {
        ab.i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail xml " + aa.b(paramq.wZu.xam));
        ab.i("MicroMsg.NetSceneSnsAdObjectDetial", "adxml " + paramq.wZv);
      }
      if ((paramq == null) || (paramq.wZu == null) || (paramq.wZu.wGu <= 0))
        break label504;
      ab.i("MicroMsg.NetSceneSnsAdObjectDetial", paramq.wZu.vQE + " will remove by get detail ");
      ke(this.cND);
      kd(this.cND);
      af.cnI().delete(paramq.wZu.vQE);
      af.cnK().ky(paramq.wZu.vQE);
      com.tencent.mm.plugin.sns.storage.i.kx(paramq.wZu.vQE);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36252);
    }
    label504: if ((paramq != null) && (paramq.wZu != null))
      ab.i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment:" + paramq.wZu.xat.size() + " like: " + paramq.wZu.xaq.size());
    if (paramInt1 == 2)
    {
      ab.i("MicroMsg.NetSceneSnsAdObjectDetial", "get atDetail %s", new Object[] { Long.valueOf(this.cND) });
      paramq = ((cak)this.ehh.fsH.fsP).wZB;
      if (paramq != null)
        a.a(paramq);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      ke(this.cND);
      kd(this.cND);
      AppMethodBeat.o(36252);
      break;
      a.a(paramq, paramArrayOfByte);
    }
  }

  public final int getType()
  {
    return 683;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.m
 * JD-Core Version:    0.6.2
 */