package com.tencent.mm.plugin.wepkg.downloader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService;
import com.tencent.mm.plugin.wepkg.c.a.a;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WePkgDownloader
{
  private static volatile WePkgDownloader uVZ = null;
  private Map<String, WePkgDownloader.IWepkgUpdateCallback> uWa;
  private a uWb;

  public WePkgDownloader()
  {
    AppMethodBeat.i(63439);
    this.uWb = new WePkgDownloader.2(this);
    if (this.uWa == null)
      this.uWa = new ConcurrentHashMap();
    AppMethodBeat.o(63439);
  }

  private void a(File paramFile, String paramString, List<String> paramList)
  {
    AppMethodBeat.i(63444);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(63444);
    while (true)
    {
      return;
      if ((paramFile.isFile()) && (paramFile.getName().equals(paramString)))
      {
        paramString = paramList;
        if (paramList == null)
          paramString = new ArrayList();
        paramString.add(paramFile.getAbsolutePath());
        AppMethodBeat.o(63444);
      }
      else
      {
        if (paramFile.isDirectory())
        {
          paramFile = paramFile.listFiles();
          if (paramFile != null)
            for (int i = 0; i < paramFile.length; i++)
              a(paramFile[i], paramString, paramList);
        }
        AppMethodBeat.o(63444);
      }
    }
  }

  public static WePkgDownloader dgx()
  {
    AppMethodBeat.i(63438);
    if (uVZ == null);
    try
    {
      if (uVZ == null)
      {
        localWePkgDownloader = new com/tencent/mm/plugin/wepkg/downloader/WePkgDownloader;
        localWePkgDownloader.<init>();
        uVZ = localWePkgDownloader;
      }
      WePkgDownloader localWePkgDownloader = uVZ;
      AppMethodBeat.o(63438);
      return localWePkgDownloader;
    }
    finally
    {
      AppMethodBeat.o(63438);
    }
  }

  private static boolean e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(63441);
    long l1 = System.currentTimeMillis();
    try
    {
      int i = ((IBSPatchJNIService)com.tencent.mm.kernel.g.K(IBSPatchJNIService.class)).bspatch(paramString3, paramString2, paramString4);
      l2 = System.currentTimeMillis() - l1;
      ab.i("MicroMsg.Wepkg.WepkgDownloader", "mergeDiffPackage, result: %d, cost: %d", new Object[] { Integer.valueOf(i), Long.valueOf(l2) });
      boolean bool;
      if (i == 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(859L, 34L, 1L);
        if (bo.isNullOrNil(paramString5))
          bool = true;
        while (bool)
        {
          com.tencent.mm.plugin.wepkg.utils.a.c(paramString1, 0, "", l2);
          bool = true;
          AppMethodBeat.o(63441);
          return bool;
          String str = com.tencent.mm.vfs.e.atg(paramString2);
          if (bo.isNullOrNil(str))
          {
            bool = false;
          }
          else
          {
            ab.i("MicroMsg.Wepkg.WepkgDownloader", "matchMd5, fileMd5: %s, md5: %s", new Object[] { str, paramString5 });
            bool = paramString5.trim().equalsIgnoreCase(str.trim());
          }
        }
        com.tencent.mm.plugin.report.service.h.pYm.k(859L, 35L, 1L);
        com.tencent.mm.plugin.wepkg.utils.a.c(paramString1, 2007, "", l2);
      }
      while (true)
      {
        bool = false;
        AppMethodBeat.o(63441);
        break;
        com.tencent.mm.plugin.report.service.h.pYm.k(859L, 27L, 1L);
        com.tencent.mm.plugin.report.service.h.pYm.k(859L, 25 - i, 1L);
        com.tencent.mm.plugin.wepkg.utils.a.c(paramString1, 1998 - i, "", l2);
      }
    }
    catch (Exception paramString5)
    {
      while (true)
      {
        long l2 = System.currentTimeMillis();
        ab.e("MicroMsg.Wepkg.WepkgDownloader", "mergeDiffPkg e = %s, old[%s], new[%s], diff[%s]", new Object[] { paramString5, paramString3, paramString2, paramString4 });
        ab.printErrStackTrace("MicroMsg.Wepkg.WepkgDownloader", paramString5, "", new Object[0]);
        com.tencent.mm.plugin.report.service.h.pYm.k(859L, 33L, 1L);
        com.tencent.mm.plugin.wepkg.utils.a.c(paramString1, 2006, "", l2 - l1);
      }
    }
  }

  private static String hv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63442);
    paramString1 = com.tencent.mm.plugin.wepkg.model.c.hx(paramString1, paramString2);
    com.tencent.mm.plugin.wepkg.utils.d.aih(paramString1);
    paramString1 = paramString1 + "/package";
    AppMethodBeat.o(63442);
    return paramString1;
  }

  public final void a(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, String paramString6, String paramString7, int paramInt2, WePkgDownloader.IWepkgUpdateCallback paramIWepkgUpdateCallback)
  {
    AppMethodBeat.i(63443);
    ab.i("MicroMsg.Wepkg.WepkgDownloader", "triggerDownloadWepkg, fileType:%s, pkgid:%s, downloadUrl:%s, pkgSize:%d, version:%s, md5:%s, downloadNetType:%d", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString4, Long.valueOf(paramLong), paramString5, paramString7, Integer.valueOf(paramInt2) });
    if (paramInt1 == 2)
    {
      paramString2 = com.tencent.mm.plugin.wepkg.model.c.hx(paramString1, paramString5) + "/preload_files";
      com.tencent.mm.plugin.wepkg.utils.d.aih(paramString2);
    }
    for (String str = paramString2 + "/" + paramString7; ; str = paramString2)
    {
      if (bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.Wepkg.WepkgDownloader", "pkgPath:%s is null", new Object[] { str });
        a.a.dgE().n(paramString1, paramString4, 0L);
        if (paramIWepkgUpdateCallback != null)
          paramIWepkgUpdateCallback.a(paramString1, "", IWepkgUpdateCallback.RetCode.uWk);
        AppMethodBeat.o(63443);
      }
      while (true)
      {
        return;
        if (com.tencent.mm.pluginsdk.g.a.d.a.ct(str))
        {
          if (bo.nullAsNil(com.tencent.mm.a.g.cz(str)).equals(paramString7))
          {
            ab.i("MicroMsg.Wepkg.WepkgDownloader", "file exist in current %s version, pkgPath:%s", new Object[] { paramString5, str });
            a.a.dgE().n(paramString1, paramString4, 0L);
            if (paramIWepkgUpdateCallback != null)
              paramIWepkgUpdateCallback.a(paramString1, str, IWepkgUpdateCallback.RetCode.uWg);
            AppMethodBeat.o(63443);
          }
        }
        else
        {
          paramString2 = com.tencent.mm.plugin.wepkg.model.c.ahQ(paramString1);
          if (!bo.isNullOrNil(paramString2))
          {
            File localFile = new File(paramString2);
            ArrayList localArrayList = new ArrayList();
            if ((str == null) || (str.length() <= 0))
              paramString2 = "";
            while (true)
            {
              a(localFile, paramString2, localArrayList);
              ab.i("MicroMsg.Wepkg.WepkgDownloader", "local have the same file. size:%s", new Object[] { Integer.valueOf(localArrayList.size()) });
              paramString2 = localArrayList.iterator();
              do
              {
                if (!paramString2.hasNext())
                  break;
                localObject = new File((String)paramString2.next());
              }
              while ((!((File)localObject).isFile()) || (((File)localObject).length() != paramLong) || (!bo.nullAsNil(com.tencent.mm.a.g.v((File)localObject)).equalsIgnoreCase(paramString7)));
              com.tencent.mm.a.e.y(((File)localObject).getAbsolutePath(), str);
              ab.i("MicroMsg.Wepkg.WepkgDownloader", "file exist in other version path:%s, pkgPath:%s", new Object[] { ((File)localObject).getAbsolutePath(), str });
              a.a.dgE().n(paramString1, paramString4, 0L);
              if (paramIWepkgUpdateCallback != null)
                paramIWepkgUpdateCallback.a(paramString1, str, IWepkgUpdateCallback.RetCode.uWg);
              AppMethodBeat.o(63443);
              break;
              Object localObject = new File(str).getName();
              i = ((String)localObject).lastIndexOf('.');
              paramString2 = (String)localObject;
              if (i >= 0)
                if (i == 0)
                  paramString2 = "";
                else
                  paramString2 = ((String)localObject).substring(0, i);
            }
          }
          int j = 0;
          boolean bool1 = false;
          boolean bool2 = false;
          boolean bool3 = false;
          boolean bool4 = false;
          boolean bool5 = bool3;
          int i = j;
          boolean bool6 = bool4;
          switch (paramInt2)
          {
          default:
            bool6 = bool4;
            i = j;
            bool5 = bool3;
          case 2:
          case 5:
          case 6:
          case 7:
          case 8:
            if (i != 0)
            {
              a.a.dgE().n(paramString1, paramString4, paramLong);
              label652: ab.i("MicroMsg.Wepkg.WepkgDownloader", "allowDownload:%s", new Object[] { Boolean.valueOf(bool5) });
              if (!bool5)
                break label1006;
              paramString3 = new c(new f(com.tencent.mm.a.g.x(paramString4.getBytes()), paramInt1, paramString1, paramString3, paramString5, paramString6, paramString4, str, paramLong, paramString7, bool6, this.uWb));
              paramString2 = d.dgw();
              if (paramString2.uVY.containsKey(paramString3.uVO.uWo))
                break label974;
              paramString3.uVP = b.dgu().uVN.submit(paramString3);
              paramString2.uVY.put(paramString3.uVO.uWo, paramString3);
            }
            break;
          case 4:
          case 3:
          case 1:
          case 9:
          }
          label974: for (paramInt1 = 1; ; paramInt1 = 0)
          {
            if (paramInt1 == 0)
              break label979;
            this.uWa.put(com.tencent.mm.a.g.x(paramString4.getBytes()), paramIWepkgUpdateCallback);
            com.tencent.mm.plugin.report.service.h.pYm.a(859L, 0L, 1L, false);
            AppMethodBeat.o(63443);
            break;
            bool5 = true;
            while (true)
            {
              i = 1;
              bool6 = bool4;
              break;
              if (!at.gH(ah.getContext()))
              {
                bool5 = bool2;
                if (!at.is3G(ah.getContext()));
              }
              else
              {
                bool5 = true;
              }
              i = 1;
              bool6 = bool4;
              break;
              bool5 = bool3;
              i = j;
              bool6 = bool4;
              if (!at.isWifi(ah.getContext()))
                break;
              bool5 = true;
              bool6 = true;
              i = j;
              break;
              if (at.isWifi(ah.getContext()))
              {
                bool5 = true;
              }
              else if (!at.gH(ah.getContext()))
              {
                bool5 = bool1;
                if (!at.is3G(ah.getContext()));
              }
              else
              {
                bool5 = bool1;
                if (com.tencent.mm.plugin.wepkg.utils.d.dgH())
                  bool5 = true;
              }
            }
            a.a.dgE().n(paramString1, paramString4, 0L);
            break label652;
          }
          label979: if (paramIWepkgUpdateCallback != null)
            paramIWepkgUpdateCallback.a(paramString1, "", IWepkgUpdateCallback.RetCode.uWl);
          AppMethodBeat.o(63443);
          continue;
          label1006: ab.i("MicroMsg.Wepkg.WepkgDownloader", "net is not match, dont download");
          if (paramIWepkgUpdateCallback != null)
            paramIWepkgUpdateCallback.a(paramString1, "", IWepkgUpdateCallback.RetCode.uWl);
          AppMethodBeat.o(63443);
        }
      }
    }
  }

  public final void a(String paramString, WePkgDownloader.IWepkgUpdateCallback paramIWepkgUpdateCallback)
  {
    AppMethodBeat.i(63440);
    WepkgVersion localWepkgVersion = com.tencent.mm.plugin.wepkg.model.h.ahW(paramString);
    if (localWepkgVersion == null)
    {
      ab.e("MicroMsg.Wepkg.WepkgDownloader", "downloadWepkg, wepkgVersion is null");
      AppMethodBeat.o(63440);
    }
    while (true)
    {
      return;
      String str = hv(paramString, localWepkgVersion.version);
      if ((com.tencent.mm.vfs.e.ct(str)) && (bo.nullAsNil(com.tencent.mm.a.g.cz(str)).equals(localWepkgVersion.cvZ)))
      {
        ab.i("MicroMsg.Wepkg.WepkgDownloader", "file exist in current %s version, pkgPath:%s", new Object[] { localWepkgVersion.version, str });
        a.a.dgE().n(paramString, localWepkgVersion.downloadUrl, 0L);
        if (paramIWepkgUpdateCallback != null)
          paramIWepkgUpdateCallback.a(paramString, str, IWepkgUpdateCallback.RetCode.uWg);
        AppMethodBeat.o(63440);
      }
      else
      {
        com.tencent.mm.plugin.wepkg.b.a locala = com.tencent.mm.plugin.wepkg.b.b.dgn().ahC(paramString);
        boolean bool1 = false;
        boolean bool2 = bool1;
        if (locala != null)
        {
          ab.i("MicroMsg.Wepkg.WepkgDownloader", "diff is not null, pkgId: %s", new Object[] { paramString });
          if (bo.nullAsNil(locala.field_version).equals(localWepkgVersion.version))
            break label370;
          ab.i("MicroMsg.Wepkg.WepkgDownloader", "diff version is not equal to package version, pkgId: %s, diffVersion: %s, packageVersion: %s", new Object[] { paramString, locala.field_version, localWepkgVersion.version });
          com.tencent.mm.plugin.wepkg.b.b.dgn().pI(paramString);
          bool2 = bool1;
        }
        while (true)
        {
          ab.i("MicroMsg.Wepkg.WepkgDownloader", "downloadBigPackage, downloadDiff = %b", new Object[] { Boolean.valueOf(bool2) });
          if (!bool2)
            break label476;
          com.tencent.mm.plugin.report.service.h.pYm.k(859L, 22L, 1L);
          paramString = new WePkgDownloader.1(this, localWepkgVersion, locala, paramIWepkgUpdateCallback);
          paramIWepkgUpdateCallback = com.tencent.mm.plugin.wepkg.model.c.hx(locala.field_pkgId, locala.field_version);
          com.tencent.mm.plugin.wepkg.utils.d.aih(paramIWepkgUpdateCallback);
          paramIWepkgUpdateCallback = paramIWepkgUpdateCallback + "/diff";
          a(3, locala.field_pkgId, paramIWepkgUpdateCallback, "", locala.field_downloadUrl, locala.field_pkgSize, locala.field_version, locala.field_oldVersion, locala.field_md5, locala.field_downloadNetType, paramString);
          AppMethodBeat.o(63440);
          break;
          label370: if (bo.isNullOrNil(locala.field_downloadUrl))
          {
            ab.i("MicroMsg.Wepkg.WepkgDownloader", "diff downloadurl is null, pkgId: %s, diffVersion: %s", new Object[] { paramString, locala.field_version });
            com.tencent.mm.plugin.wepkg.b.b.dgn().pI(paramString);
            bool2 = bool1;
          }
          else if (!com.tencent.mm.vfs.e.ct(locala.field_oldPath))
          {
            ab.i("MicroMsg.Wepkg.WepkgDownloader", "old package is not exists, pkgId: %s, oldPath: %s", new Object[] { paramString, locala.field_oldPath });
            com.tencent.mm.plugin.wepkg.b.b.dgn().pI(paramString);
            bool2 = bool1;
          }
          else
          {
            bool2 = true;
          }
        }
        label476: a(1, localWepkgVersion.eBS, str, "", localWepkgVersion.downloadUrl, localWepkgVersion.uXK, localWepkgVersion.version, "", localWepkgVersion.cvZ, localWepkgVersion.uWQ, paramIWepkgUpdateCallback);
        AppMethodBeat.o(63440);
      }
    }
  }

  public static enum IWepkgUpdateCallback$RetCode
    implements Parcelable
  {
    public static final Parcelable.Creator<RetCode> CREATOR;

    static
    {
      AppMethodBeat.i(63437);
      uWg = new RetCode("OK", 0);
      uWh = new RetCode("LOCAL_FILE_NOT_FOUND", 1);
      uWi = new RetCode("PKG_INTEGRITY_FAILED", 2);
      uWj = new RetCode("PKG_INVALID", 3);
      uWk = new RetCode("FAILED", 4);
      uWl = new RetCode("CANCEL", 5);
      uWm = new RetCode[] { uWg, uWh, uWi, uWj, uWk, uWl };
      CREATOR = new Parcelable.Creator()
      {
      };
      AppMethodBeat.o(63437);
    }

    public final int describeContents()
    {
      return 0;
    }

    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(63436);
      paramParcel.writeInt(ordinal());
      AppMethodBeat.o(63436);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader
 * JD-Core Version:    0.6.2
 */