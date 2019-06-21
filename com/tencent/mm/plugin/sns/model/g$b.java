package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;

final class g$b extends h<String, Integer, Boolean>
{
  private bau cNr;
  private String fUJ;
  private n feQ;
  String key;
  private String path;
  private int qII;

  public g$b(g paramg, String paramString1, String paramString2, String paramString3, bau parambau, int paramInt)
  {
    AppMethodBeat.i(36150);
    this.key = "";
    this.feQ = null;
    this.qII = 0;
    paramg.qIp.add(paramString1);
    this.key = paramString1;
    this.path = paramString2;
    this.fUJ = paramString3;
    this.cNr = parambau;
    this.qII = paramInt;
    g.bTr();
    ab.d("MicroMsg.ImageLoader", "peddingCount %d ", new Object[] { Integer.valueOf(g.bQp()) });
    AppMethodBeat.o(36150);
  }

  private void ac(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36151);
    com.tencent.mm.vfs.e.ct(this.fUJ + paramString3);
    if (!com.tencent.mm.vfs.e.ct(this.fUJ + paramString1))
    {
      String str = paramString2;
      if (!com.tencent.mm.vfs.e.ct(this.fUJ + paramString2))
        str = i.m(this.cNr);
      boolean bool = s.a(this.fUJ, str, paramString1, af.cnO());
      if (!bool)
      {
        ab.i("MicroMsg.ImageLoader", "delete %s", new Object[] { str });
        com.tencent.mm.vfs.e.deleteFile(this.fUJ + str);
      }
      ab.i("MicroMsg.ImageLoader", "createUserThumb %s -> %s, result:%b", new Object[] { this.fUJ + str, this.fUJ + paramString1, Boolean.valueOf(bool) });
    }
    s.b(this.fUJ, paramString1, paramString3, af.cnN());
    AppMethodBeat.o(36151);
  }

  private Boolean cmY()
  {
    AppMethodBeat.i(36152);
    g.a(this.qIr, true);
    Object localObject;
    if (!g.h(this.qIr))
    {
      ab.i("MicroMsg.ImageLoader", "doInBackground pass" + this.path);
      localObject = Boolean.FALSE;
      AppMethodBeat.o(36152);
    }
    while (true)
    {
      return localObject;
      if (!g.f(this.qIr).aj(this.key))
        break;
      ab.i("MicroMsg.ImageLoader", "doInBackGroundgetKey");
      localObject = Boolean.FALSE;
      AppMethodBeat.o(36152);
    }
    com.tencent.mm.vfs.e.ate(this.fUJ);
    long l1 = System.currentTimeMillis();
    label141: long l2;
    if (!com.tencent.mm.vfs.e.ct(this.path))
    {
      ac(i.e(this.cNr), i.l(this.cNr), i.f(this.cNr));
      l2 = bo.yz();
      if (this.qII != 5)
        break label763;
      if (!com.tencent.mm.vfs.e.ct(this.path))
        ac(i.e(this.cNr), i.l(this.cNr), i.f(this.cNr));
      boolean bool1 = com.tencent.mm.vfs.e.ct(this.fUJ + i.e(this.cNr));
      boolean bool2 = com.tencent.mm.vfs.e.ct(this.fUJ + i.l(this.cNr));
      boolean bool3 = com.tencent.mm.vfs.e.ct(this.fUJ + i.f(this.cNr));
      this.feQ = i.Xi(this.path);
      if (this.feQ == null)
      {
        ab.i("MicroMsg.ImageLoader", "error path %s", new Object[] { this.path });
        localObject = i.f(this.cNr);
        this.feQ = com.tencent.mm.plugin.sns.lucky.a.a.fV(this.fUJ + (String)localObject, this.path);
        bool4 = com.tencent.mm.vfs.e.ct(this.path);
        ab.i("MicroMsg.ImageLoader", "abc a" + bool1 + " b" + bool2 + " c" + bool3 + " d" + bool4);
      }
      label422: long l3 = bo.az(l2);
      int i = (int)com.tencent.mm.vfs.e.asZ(this.path);
      if (bo.az(g.i(this.qIr)) > 60000L)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11696, new Object[] { Integer.valueOf(4), Long.valueOf(l3), Integer.valueOf(i), Thread.currentThread().getName(), af.cnR(), com.tencent.mm.compatible.util.e.eSl });
        g.b(this.qIr, bo.yz());
      }
      if (this.feQ == null)
      {
        ab.i("MicroMsg.ImageLoader", "mediaid %s is fail and delete it", new Object[] { this.cNr.Id });
        com.tencent.mm.vfs.e.deleteFile(this.fUJ + i.f(this.cNr));
        com.tencent.mm.vfs.e.deleteFile(this.path);
        com.tencent.mm.plugin.report.service.h.pYm.a(150L, 2L, 1L, true);
      }
      l3 = System.currentTimeMillis();
      com.tencent.mm.plugin.report.service.h.pYm.a(150L, 0L, 1L, true);
      com.tencent.mm.plugin.report.service.h.pYm.a(150L, 1L, l3 - l1, true);
      localObject = new StringBuilder("doInBackground decode %s and ");
      if (this.feQ != null)
        break label864;
    }
    label864: for (boolean bool4 = true; ; bool4 = false)
    {
      ab.i("MicroMsg.ImageLoader", bool4 + " " + this.feQ + " %d ", new Object[] { this.path, Long.valueOf(System.currentTimeMillis() - l2) });
      localObject = Boolean.TRUE;
      AppMethodBeat.o(36152);
      break;
      ab.d("MicroMsg.ImageLoader", "doInBackground file exist:%s", new Object[] { this.path });
      break label141;
      label763: if (this.qII == 4)
      {
        this.feQ = i.Xi(this.path);
        if (this.feQ != null)
          break label422;
        ab.i("MicroMsg.ImageLoader", "error path %s", new Object[] { this.path });
        localObject = i.e(this.cNr);
        this.feQ = com.tencent.mm.plugin.sns.lucky.a.a.fV(this.fUJ + (String)localObject, this.path);
        break label422;
      }
      this.feQ = i.Xk(this.path);
      break label422;
    }
  }

  public final com.tencent.mm.sdk.g.b.a cin()
  {
    AppMethodBeat.i(36153);
    com.tencent.mm.sdk.g.b.a locala = af.cnq();
    AppMethodBeat.o(36153);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.b
 * JD-Core Version:    0.6.2
 */