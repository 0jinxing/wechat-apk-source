package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.utils.a;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.protocal.protobuf.bkj;
import com.tencent.mm.protocal.protobuf.cvm;
import com.tencent.mm.protocal.protobuf.cvp;
import com.tencent.mm.protocal.protobuf.cvq;
import com.tencent.mm.protocal.protobuf.cvt;
import com.tencent.mm.protocal.protobuf.cvu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  public static e a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(63556);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString3)) || (bo.isNullOrNil(paramString4)))
    {
      ab.i("MicroMsg.Wepkg.WepkgManager", "pkgid or pkgPath or md5 is null, pkg invalid");
      paramString1 = null;
      AppMethodBeat.o(63556);
    }
    while (true)
    {
      return paramString1;
      File localFile = new File(paramString3);
      if (!localFile.exists())
      {
        ab.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, pkgPath:%s, file dont exist", new Object[] { paramString3 });
        ahV(paramString1);
        a.b("PkgModified", null, paramString1, paramString2, 1L, 0L, null);
        paramString1 = null;
        AppMethodBeat.o(63556);
      }
      else if (localFile.length() != paramInt)
      {
        ab.i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, [server_pkgSize:%d] != [local_pkgSize:%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(localFile.length()) });
        localFile.delete();
        ahV(paramString1);
        a.b("PkgModified", null, paramString1, paramString2, 2L, 0L, null);
        paramString1 = null;
        AppMethodBeat.o(63556);
      }
      else if (localFile.length() <= 5242880L)
      {
        String str = com.tencent.mm.a.g.v(localFile);
        if (!paramString4.equalsIgnoreCase(str))
        {
          ab.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage, [server_md5:%s] != [local_md5:%s]", new Object[] { paramString4, str });
          localFile.delete();
          ahV(paramString1);
          a.b("PkgModified", null, paramString1, paramString2, 3L, 0L, null);
          paramString1 = null;
          AppMethodBeat.o(63556);
        }
      }
      else
      {
        ab.i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage fileLength(%d) > checkSize(%d). dont check md5", new Object[] { Long.valueOf(localFile.length()), Long.valueOf(5242880L) });
        ab.i("MicroMsg.Wepkg.WepkgManager", "this is big package. localPath: %s", new Object[] { paramString3 });
        paramString2 = new e(localFile);
        if ((paramString2.gUe) && (paramString2.uWV != null))
        {
          AppMethodBeat.o(63556);
          paramString1 = paramString2;
        }
        else
        {
          b.dgz();
          b.dQ(paramString1, 2);
          paramString1 = null;
          AppMethodBeat.o(63556);
        }
      }
    }
  }

  public static List<String> a(bkj parambkj)
  {
    AppMethodBeat.i(63555);
    if ((parambkj == null) || (parambkj.wNw == null))
    {
      parambkj = null;
      AppMethodBeat.o(63555);
    }
    while (true)
    {
      return parambkj;
      Object localObject1 = parambkj.wNw.xrL;
      Object localObject2 = parambkj.wNw.xrM;
      ArrayList localArrayList = new ArrayList();
      if ((localObject1 != null) && (((cvm)localObject1).xrx != null))
        localArrayList.add(ag.ck(parambkj.mZV + ((cvm)localObject1).xrx.vMJ));
      if ((localObject2 != null) && (!bo.ek(((cvt)localObject2).xrI)))
      {
        localObject2 = ((cvt)localObject2).xrI.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (cvq)((Iterator)localObject2).next();
          if ((localObject1 != null) && (((cvq)localObject1).xrx != null))
            localArrayList.add(ag.ck(parambkj.mZV + ((cvq)localObject1).xrx.vMJ));
        }
      }
      AppMethodBeat.o(63555);
      parambkj = localArrayList;
    }
  }

  public static void a(g.a parama)
  {
    AppMethodBeat.i(63557);
    String str = c.uWL;
    File localFile = new File(str);
    if ((!localFile.exists()) || (!localFile.isDirectory()))
      parama.U(null);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 1001;
    localWepkgCrossProcessTask.hww = new g.1(localWepkgCrossProcessTask, str, localFile, parama);
    localWepkgCrossProcessTask.aBV();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
    AppMethodBeat.o(63557);
  }

  public static f ahU(String paramString)
  {
    while (true)
    {
      String str;
      Object localObject1;
      long l;
      WepkgVersion localWepkgVersion;
      try
      {
        AppMethodBeat.i(63554);
        ab.d("MicroMsg.Wepkg.WepkgManager", "loadWepkg");
        str = d.aid(paramString);
        localObject1 = d.aie(paramString);
        l = System.currentTimeMillis();
        if ((bo.isNullOrNil(str)) || (bo.isNullOrNil((String)localObject1)))
        {
          ab.e("MicroMsg.Wepkg.WepkgManager", "pkgId = %s, domain = %s", new Object[] { str, localObject1 });
          paramString = null;
          AppMethodBeat.o(63554);
          return paramString;
        }
        com.tencent.mm.plugin.report.service.h.pYm.a(859L, 6L, 1L, false);
        localWepkgVersion = h.ahX(str);
        if (localWepkgVersion == null)
        {
          ab.i("MicroMsg.Wepkg.WepkgManager", "DB dont have valid record, pkgid:%s, domain:%s, version:%s:", new Object[] { str, "", "" });
          a.b("EnterWeb", paramString, str, null, 0L, 0L, a.Kl(14));
          com.tencent.mm.plugin.report.service.h.pYm.a(859L, 7L, 1L, false);
          paramString = null;
          AppMethodBeat.o(63554);
          continue;
        }
      }
      finally
      {
      }
      if (!((String)localObject1).equalsIgnoreCase(localWepkgVersion.cSx))
      {
        ab.i("MicroMsg.Wepkg.WepkgManager", "the domain not match, pkgid:%s, version:%s, UrlDomain[%s] != DBDomain[%s]", new Object[] { str, localWepkgVersion.version, localObject1, localWepkgVersion.cSx });
        a.b("EnterWeb", paramString, str, null, 0L, 0L, a.Kl(13));
        com.tencent.mm.plugin.report.service.h.pYm.a(859L, 8L, 1L, false);
        paramString = null;
        AppMethodBeat.o(63554);
      }
      else if (bo.isNullOrNil(localWepkgVersion.version))
      {
        ab.i("MicroMsg.Wepkg.WepkgManager", "this pkgid(%s) is disable form server", new Object[] { str });
        a.b("EnterWeb", paramString, str, null, 0L, 0L, a.Kl(15));
        com.tencent.mm.plugin.report.service.h.pYm.a(859L, 9L, 1L, false);
        paramString = null;
        AppMethodBeat.o(63554);
      }
      else if ((!localWepkgVersion.uXM) || ((!localWepkgVersion.uXN) && (localWepkgVersion.uXO)))
      {
        ab.i("MicroMsg.Wepkg.WepkgManager", "local cache disable, pkgid:%s, version:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s", new Object[] { localWepkgVersion.eBS, localWepkgVersion.version, Boolean.valueOf(localWepkgVersion.uXM), Boolean.valueOf(localWepkgVersion.uXN), Boolean.valueOf(localWepkgVersion.uXO) });
        a.b("EnterWeb", paramString, str, localWepkgVersion.version, 0L, 0L, a.Kl(16));
        com.tencent.mm.plugin.report.service.h.pYm.a(859L, 10L, 1L, false);
        paramString = null;
        AppMethodBeat.o(63554);
      }
      else
      {
        e locale = a(str, localWepkgVersion.version, localWepkgVersion.gSP, localWepkgVersion.cvZ, localWepkgVersion.uXK);
        if ((locale == null) && (!bo.isNullOrNil(localWepkgVersion.gSP)))
        {
          a.b("EnterWeb", paramString, str, localWepkgVersion.version, 0L, 0L, a.Kl(17));
          com.tencent.mm.plugin.report.service.h.pYm.a(859L, 11L, 1L, false);
          paramString = null;
          AppMethodBeat.o(63554);
        }
        else
        {
          boolean bool = localWepkgVersion.uXO;
          if (bo.isNullOrNil(str))
            localObject1 = null;
          while (true)
          {
            if (localObject1 != null)
              break label973;
            a.b("EnterWeb", paramString, str, localWepkgVersion.version, 0L, 0L, a.Kl(18));
            com.tencent.mm.plugin.report.service.h.pYm.a(859L, 11L, 1L, false);
            paramString = null;
            AppMethodBeat.o(63554);
            break;
            HashMap localHashMap = new java/util/HashMap;
            localHashMap.<init>();
            Object localObject2 = h.aia(str);
            localObject1 = localHashMap;
            if (!bo.ek((List)localObject2))
            {
              Iterator localIterator = ((List)localObject2).iterator();
              int i = 0;
              while (localIterator.hasNext())
              {
                localObject2 = (WepkgPreloadFile)localIterator.next();
                if (localObject2 != null)
                  if (bo.isNullOrNil(((WepkgPreloadFile)localObject2).filePath))
                  {
                    ab.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath is null, isAtomic:%s", new Object[] { Boolean.valueOf(bool) });
                    if (bool)
                    {
                      hz(((WepkgPreloadFile)localObject2).eBS, ((WepkgPreloadFile)localObject2).uXe);
                      i = 1;
                    }
                    else
                    {
                      h.a(str, ((WepkgPreloadFile)localObject2).uXe, "", null);
                    }
                  }
                  else
                  {
                    localObject1 = new java/io/File;
                    ((File)localObject1).<init>(((WepkgPreloadFile)localObject2).filePath);
                    if (!((File)localObject1).exists())
                    {
                      ab.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, pkgPath:%s, file dont exist, isAtomic:%s", new Object[] { ((WepkgPreloadFile)localObject2).filePath, Boolean.valueOf(bool) });
                      if (bool)
                      {
                        hz(((WepkgPreloadFile)localObject2).eBS, ((WepkgPreloadFile)localObject2).uXe);
                        i = 1;
                      }
                      else
                      {
                        h.a(str, ((WepkgPreloadFile)localObject2).uXe, "", null);
                      }
                    }
                    else if (((File)localObject1).length() != ((WepkgPreloadFile)localObject2).size)
                    {
                      ab.i("MicroMsg.Wepkg.WepkgManager", "readCachePreloadFiles, [server_pkgSize:%d] != [local_pkgSize:%d], isAtomic:%s", new Object[] { Integer.valueOf(((WepkgPreloadFile)localObject2).size), Long.valueOf(((File)localObject1).length()), Boolean.valueOf(bool) });
                      if (bool)
                      {
                        hz(((WepkgPreloadFile)localObject2).eBS, ((WepkgPreloadFile)localObject2).uXe);
                        ((File)localObject1).delete();
                        i = 1;
                      }
                      else
                      {
                        h.a(str, ((WepkgPreloadFile)localObject2).uXe, "", null);
                      }
                    }
                    else
                    {
                      localHashMap.put(((WepkgPreloadFile)localObject2).uXe, localObject2);
                    }
                  }
              }
              localObject1 = localHashMap;
              if (i != 0)
                localObject1 = null;
            }
          }
          label973: paramString = new com/tencent/mm/plugin/wepkg/model/f;
          paramString.<init>(localWepkgVersion, locale, (Map)localObject1);
          ab.i("MicroMsg.Wepkg.WepkgManager", "loadWepkg time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          com.tencent.mm.plugin.report.service.h.pYm.a(859L, 12L, 1L, false);
          AppMethodBeat.o(63554);
        }
      }
    }
  }

  private static void ahV(String paramString)
  {
    AppMethodBeat.i(63558);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(63558);
    while (true)
    {
      return;
      h.a(paramString, "", false, new g.2());
      AppMethodBeat.o(63558);
    }
  }

  private static void hz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63559);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      AppMethodBeat.o(63559);
    while (true)
    {
      return;
      h.a(paramString1, paramString2, "", new g.4(paramString1, new g.3()));
      AppMethodBeat.o(63559);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.g
 * JD-Core Version:    0.6.2
 */