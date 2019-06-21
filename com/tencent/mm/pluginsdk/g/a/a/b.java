package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.pluginsdk.g.a.c.d;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.protocal.protobuf.bsw;
import com.tencent.mm.protocal.protobuf.bsy;
import com.tencent.mm.protocal.protobuf.bsz;
import com.tencent.mm.protocal.protobuf.bzu;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class b
{
  private final d uov;
  private final Set<b.b> vdO;
  private final k vdP;

  private b()
  {
    AppMethodBeat.i(79490);
    this.vdO = Collections.newSetFromMap(new android.support.v4.f.a(i.vep.length));
    this.vdP = new k();
    this.uov = new b.3(this);
    q.a.diy().b("CheckResUpdate", this.uov);
    AppMethodBeat.o(79490);
  }

  public static void Ky(int paramInt)
  {
    AppMethodBeat.i(79491);
    ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "doCheck, resType = %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.kernel.g.RN();
    boolean bool1 = com.tencent.mm.kernel.a.QX();
    boolean bool2 = av.fly.T("login_user_name", "").equals("");
    if ((!bool1) && (bool2))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "doCheck, not login, skip");
      AppMethodBeat.o(79491);
    }
    while (true)
    {
      return;
      m localm = new m(paramInt);
      com.tencent.mm.kernel.g.RO().eJo.a(localm, 0);
      AppMethodBeat.o(79491);
    }
  }

  static void c(s params)
  {
    AppMethodBeat.i(79494);
    ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "performDecryptDirectly, urlkey %s", new Object[] { params.field_urlKey });
    k.g(params);
    AppMethodBeat.o(79494);
  }

  public static b did()
  {
    AppMethodBeat.i(138582);
    b localb = b.c.dif();
    AppMethodBeat.o(138582);
    return localb;
  }

  public static String gM(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(79492);
    s locals = q.a.diy().ajg(i.gN(paramInt1, paramInt2));
    Object localObject2;
    if (locals == null)
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, get null info, return", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(79492);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      ab.v("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, queried primeInfo { deleted = %b, filepath = %s, md5 = %s, compress = %b, encrypt = %b, originalMd5 = %s }", new Object[] { Boolean.valueOf(locals.field_deleted), locals.field_filePath, locals.field_md5, Boolean.valueOf(locals.field_fileCompress), Boolean.valueOf(locals.field_fileEncrypt), locals.field_originalMd5 });
      if ((locals.field_fileCompress) || (locals.field_fileEncrypt))
        break;
      if ((!locals.field_deleted) && (!bo.isNullOrNil(locals.field_filePath)) && (bo.nullAsNil(com.tencent.mm.a.g.cz(locals.field_filePath)).equals(locals.field_md5)))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file valid, return path(%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locals.field_filePath });
        localObject2 = locals.field_filePath;
        AppMethodBeat.o(79492);
      }
      else
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file invalid, return null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(79492);
        localObject2 = localObject1;
      }
    }
    if (locals.field_fileCompress)
      localObject2 = locals.field_filePath + ".decompressed";
    while (true)
    {
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, filePath invalid return null ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(79492);
        localObject2 = localObject1;
        break;
        if (!locals.field_fileEncrypt)
          break label467;
        localObject2 = locals.field_filePath + ".decrypted";
        continue;
      }
      if ((!bo.isNullOrNil(locals.field_originalMd5)) && (bo.nullAsNil(com.tencent.mm.a.g.cz((String)localObject2)).equals(locals.field_originalMd5)))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, file valid, ret = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localObject2 });
        AppMethodBeat.o(79492);
        break;
      }
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt, return null ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(79492);
      localObject2 = localObject1;
      break;
      label467: localObject2 = null;
    }
  }

  final void a(int paramInt, bsw parambsw, boolean paramBoolean)
  {
    AppMethodBeat.i(79495);
    String str = i.gN(paramInt, parambsw.wOI);
    if (parambsw.wUV == null)
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDeleteOperation(), resource.Info = null");
      AppMethodBeat.o(79495);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive delete-op, fromNewXml(%b), %d.%d, file version (%d)", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(parambsw.wOI), Integer.valueOf(parambsw.wUV.wVf) });
      j.z(parambsw.wUX, 3L);
      int i = parambsw.wUV.wVf;
      int j = parambsw.wOI;
      int k = parambsw.wUX;
      parambsw = parambsw.wUY;
      q.a.diy().R(new b.4(this, str, paramInt, j, i, k, parambsw, paramBoolean));
      AppMethodBeat.o(79495);
    }
  }

  final void a(int paramInt, bsw parambsw, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(79497);
    String str = i.gN(paramInt, parambsw.wOI);
    if (parambsw.wUW == null)
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDecryptOperation(), resource.Key = null");
      AppMethodBeat.o(79497);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(parambsw.wUW.wVe))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "encryptKey null, skip");
        AppMethodBeat.o(79497);
      }
      else
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive decrypt-op, fromNewXml(%b), %d.%d, key version (%d)", new Object[] { Boolean.valueOf(paramBoolean1), Integer.valueOf(paramInt), Integer.valueOf(parambsw.wOI), Integer.valueOf(parambsw.wUW.wVd) });
        ab.d("MicroMsg.ResDownloader.CheckResUpdateHelper", "key (%s)", new Object[] { parambsw.wUW.wVe });
        j.z(parambsw.wUX, 4L);
        parambsw = new b.6(this, str, parambsw.wUV.wVi, parambsw.wUW.wVe, parambsw.wUW.wVd, parambsw.wUX, parambsw.wUY, paramBoolean2);
        if (paramBoolean2)
        {
          parambsw.run();
          AppMethodBeat.o(79497);
        }
        else
        {
          q.a.diy().R(parambsw);
          AppMethodBeat.o(79497);
        }
      }
    }
  }

  public final void as(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79488);
    f(paramInt1, paramInt2, paramInt3, true);
    AppMethodBeat.o(79488);
  }

  final void b(int paramInt, bsw parambsw, boolean paramBoolean)
  {
    AppMethodBeat.i(79496);
    String str = i.gN(paramInt, parambsw.wOI);
    if (parambsw.wUV == null)
    {
      ab.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveCacheOperation(%s), resource.Info = null, return", new Object[] { str });
      AppMethodBeat.o(79496);
    }
    while (true)
    {
      return;
      int i = parambsw.wOI;
      int j = parambsw.wUV.wVf;
      if (parambsw.wUV.wVh == null);
      for (localObject = "null"; ; localObject = String.valueOf(parambsw.wUV.wVh.size()))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive cache-op, urlKey = %d.%d,  fromNewXml = %b, file version = %d, eccSignatureList.size = %s, reportId = %s, sampleId = %s, url = %s, data = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(paramBoolean), Integer.valueOf(j), localObject, Integer.valueOf(parambsw.wUX), parambsw.wUY, parambsw.wUV.Url, parambsw.wUV.wdt });
        if (parambsw.wUV.wVh == null)
          break;
        Iterator localIterator = parambsw.wUV.wVh.iterator();
        while (localIterator.hasNext())
        {
          localObject = (bzu)localIterator.next();
          ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, sigInfo: version(%d), signature(%s) ", new Object[] { Integer.valueOf(((bzu)localObject).Version), ((bzu)localObject).wYR.dlY() });
        }
      }
      j.mc(parambsw.wUX);
      if (!paramBoolean)
        j.z(parambsw.wUX, 1L);
      if ((parambsw.vQW != 0) && (parambsw.vQW <= bo.anT()))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "recourse(%s) is expired before do download, expireTime = %d, fileVersion = %d", new Object[] { str, Integer.valueOf(parambsw.vQW), Integer.valueOf(parambsw.wUV.wVf) });
        j.z(parambsw.wUX, 14L);
        j.z(parambsw.wUX, 44L);
        j.a(paramInt, parambsw.wOI, parambsw.wUV.Url, parambsw.wUV.wVf, j.a.veG, false, paramBoolean, false, parambsw.wUY);
        AppMethodBeat.o(79496);
      }
      else
      {
        if ((!bo.isNullOrNil(parambsw.wUV.Url)) || (parambsw.wUV.wdt != null))
          break;
        ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, invalid cache operation, url and data is null or nil, skip");
        AppMethodBeat.o(79496);
      }
    }
    Object localObject = new g.a(parambsw.wUV.Url);
    ((g.a)localObject).aja(str);
    ((g.a)localObject).cut = paramInt;
    ((g.a)localObject).cuu = parambsw.wOI;
    ((g.a)localObject).md(parambsw.vQW);
    ((g.a)localObject).cuv = parambsw.wUV.wVf;
    ((g.a)localObject).ajb(parambsw.wUV.wdO);
    ((g.a)localObject).vei = i.a.KA(parambsw.wUV.wVg);
    ((g.a)localObject).vej = i.a.Kz(parambsw.wUV.wVg);
    ((g.a)localObject).vdK = parambsw.wUX;
    ((g.a)localObject).vdL = parambsw.wUY;
    if (parambsw.wUZ > 0);
    for (paramInt = parambsw.wUZ; ; paramInt = 3)
    {
      ((g.a)localObject).KH(paramInt);
      ((g.a)localObject).vek = parambsw.vek;
      ((g.a)localObject).KG(parambsw.wVa);
      ((g.a)localObject).cuA = paramBoolean;
      if (!bo.ek(parambsw.wUV.wVh))
        ((g.a)localObject).vdH = ((bzu)parambsw.wUV.wVh.get(0)).wYR.wR;
      if ((parambsw.wUW != null) && (!bo.isNullOrNil(parambsw.wUW.wVe)))
      {
        ((g.a)localObject).vdF = parambsw.wUW.wVe;
        ((g.a)localObject).vdG = parambsw.wUW.wVd;
      }
      if ((parambsw.wUV.wdt != null) && (parambsw.wUV.wdt.wR.length > 0))
        ((g.a)localObject).veh = parambsw.wUV.wdt.toByteArray();
      ((g.a)localObject).vdI = parambsw.wUV.wVi;
      ((g.a)localObject).fileSize = parambsw.wUV.FileSize;
      ((g.a)localObject).KI(parambsw.wxG);
      parambsw = ((g.a)localObject).dii();
      ab.d("MicroMsg.ResDownloader.CheckResUpdateHelper", "request (%s)", new Object[] { parambsw.toString() });
      q.a.diy().R(new b.5(this, str, parambsw));
      AppMethodBeat.o(79496);
      break;
    }
  }

  final void b(s params)
  {
    AppMethodBeat.i(79493);
    ab.d("MicroMsg.ResDownloader.CheckResUpdateHelper", "addDecryptRequest, urlkey = " + params.field_urlKey);
    k localk = this.vdP;
    if (localk.ajd(params.field_urlKey))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "URLKey(%s) is already decrypting, skip repeated task");
      AppMethodBeat.o(79493);
    }
    while (true)
    {
      return;
      localk.a(a.a(params));
      AppMethodBeat.o(79493);
    }
  }

  final Set<b.b> dic()
  {
    AppMethodBeat.i(79486);
    synchronized (this.vdO)
    {
      Object localObject1 = new android/support/v4/f/a;
      ((android.support.v4.f.a)localObject1).<init>(this.vdO.size());
      localObject1 = Collections.newSetFromMap((Map)localObject1);
      ((Set)localObject1).addAll(this.vdO);
      AppMethodBeat.o(79486);
      return localObject1;
    }
  }

  final void e(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(79498);
    q.a.diy().R(new b.7(this, paramInt1, paramInt2, paramString, paramInt3));
    AppMethodBeat.o(79498);
  }

  public final void f(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(79487);
    q.a.diy().R(new b.1(this, paramInt1, paramInt2, paramInt3, paramBoolean));
    AppMethodBeat.o(79487);
  }

  final void g(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(79499);
    if (q.a.diy().handler == null)
    {
      ab.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventPreOperation: get null eventThread ");
      AppMethodBeat.o(79499);
    }
    while (true)
    {
      return;
      q.a.diy().handler.post(new b.2(this, paramInt3, paramInt1, paramInt2, paramBoolean));
      AppMethodBeat.o(79499);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b
 * JD-Core Version:    0.6.2
 */