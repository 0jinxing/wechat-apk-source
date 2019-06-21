package com.tencent.mm.plugin.wepkg.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.wepkg.b.e;
import com.tencent.mm.plugin.wepkg.b.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WepkgCrossProcessTask extends BaseWepkgProcessTask
{
  public static final Parcelable.Creator<WepkgCrossProcessTask> CREATOR;
  public int Cn;
  public Runnable hww;
  public WepkgVersion uWY;
  public List<WepkgVersion> uWZ;
  public WePkgDiffInfo uXa;
  public WepkgPreloadFile uXb;
  public List<WepkgPreloadFile> uXc;
  public String uXd;

  static
  {
    AppMethodBeat.i(63537);
    CREATOR = new WepkgCrossProcessTask.1();
    AppMethodBeat.o(63537);
  }

  public WepkgCrossProcessTask()
  {
    AppMethodBeat.i(63531);
    this.Cn = -1;
    this.uWY = new WepkgVersion();
    this.uWZ = new ArrayList();
    this.uXa = new WePkgDiffInfo();
    this.uXb = new WepkgPreloadFile();
    this.uXc = new ArrayList();
    AppMethodBeat.o(63531);
  }

  private WepkgCrossProcessTask(Parcel paramParcel)
  {
    AppMethodBeat.i(63532);
    g(paramParcel);
    AppMethodBeat.o(63532);
  }

  public final void a(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63536);
    paramParcel.writeInt(this.Cn);
    paramParcel.writeParcelable(this.uWY, paramInt);
    paramParcel.writeList(this.uWZ);
    paramParcel.writeParcelable(this.uXb, paramInt);
    paramParcel.writeList(this.uXc);
    paramParcel.writeString(this.uXd);
    AppMethodBeat.o(63536);
  }

  public final void asP()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    boolean bool1 = false;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    AppMethodBeat.i(63533);
    label222: Object localObject3;
    Object localObject4;
    switch (this.Cn)
    {
    default:
    case 1001:
    case 1002:
    case 3001:
    case 3003:
    case 3004:
    case 3005:
    case 3006:
    case 2002:
    case 4001:
    case 4002:
    case 2003:
      do
      {
        wM();
        AppMethodBeat.o(63533);
        return;
        while (true)
        {
          this.csN = bool5;
          break;
          bool5 = g.Nv().Ni();
          continue;
          if (this.uWY == null)
            break;
          localObject2 = f.dgp().ahF(this.uWY.eBS);
          if (localObject2 != null)
          {
            this.uWY.a((e)localObject2);
          }
          else
          {
            this.uWY = null;
            break;
            if (this.uWY == null)
              break;
            bool5 = f.dgp().ahH(this.uWY.eBS);
            continue;
            if (this.uWY == null)
              break;
            bool5 = f.dgp().a(this.uWY.eBS, this.uWY.uXG, this.uWY.uXH, this.uWY.uXI);
            continue;
            if (this.uWY == null)
              break;
            bool5 = f.dgp().B(this.uWY.eBS, this.uWY.gSP, this.uWY.uXM);
            continue;
            if (this.uWY == null)
              break;
            bool5 = f.dgp().bP(this.uWY.eBS, this.uWY.uXN);
            continue;
            if ((this.uWY == null) || (bo.isNullOrNil(this.uWY.eBS)))
              break;
            localObject1 = f.dgp();
            localObject2 = this.uWY;
            localObject3 = new e();
            ((e)localObject3).field_pkgId = ((WepkgVersion)localObject2).eBS;
            ((e)localObject3).field_appId = ((WepkgVersion)localObject2).appId;
            ((e)localObject3).field_version = ((WepkgVersion)localObject2).version;
            ((e)localObject3).field_pkgPath = ((WepkgVersion)localObject2).gSP;
            ((e)localObject3).field_disableWvCache = ((WepkgVersion)localObject2).uXG;
            ((e)localObject3).field_clearPkgTime = ((WepkgVersion)localObject2).uXH;
            ((e)localObject3).field_checkIntervalTime = ((WepkgVersion)localObject2).uXI;
            ((e)localObject3).field_packMethod = ((WepkgVersion)localObject2).uXJ;
            ((e)localObject3).field_domain = ((WepkgVersion)localObject2).cSx;
            ((e)localObject3).field_md5 = ((WepkgVersion)localObject2).cvZ;
            ((e)localObject3).field_downloadUrl = ((WepkgVersion)localObject2).downloadUrl;
            ((e)localObject3).field_pkgSize = ((WepkgVersion)localObject2).uXK;
            ((e)localObject3).field_downloadNetType = ((WepkgVersion)localObject2).uWQ;
            ((e)localObject3).field_nextCheckTime = ((WepkgVersion)localObject2).uXL;
            ((e)localObject3).field_createTime = ((WepkgVersion)localObject2).createTime;
            ((e)localObject3).field_charset = ((WepkgVersion)localObject2).charset;
            ((e)localObject3).field_bigPackageReady = ((WepkgVersion)localObject2).uXM;
            ((e)localObject3).field_preloadFilesReady = ((WepkgVersion)localObject2).uXN;
            ((e)localObject3).field_preloadFilesAtomic = ((WepkgVersion)localObject2).uXO;
            ((e)localObject3).field_totalDownloadCount = ((WepkgVersion)localObject2).uXP;
            ((e)localObject3).field_downloadTriggerType = ((WepkgVersion)localObject2).cTb;
            ((f)localObject1).a((e)localObject3, this.uXa);
            if (!bo.ek(this.uXc))
            {
              localObject4 = this.uXc.iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject2 = (WepkgPreloadFile)((Iterator)localObject4).next();
                if (localObject2 != null)
                {
                  localObject1 = com.tencent.mm.plugin.wepkg.b.d.dgo();
                  localObject3 = new com.tencent.mm.plugin.wepkg.b.c();
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_key = ((WepkgPreloadFile)localObject2).key;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_pkgId = ((WepkgPreloadFile)localObject2).eBS;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_version = ((WepkgPreloadFile)localObject2).version;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_filePath = ((WepkgPreloadFile)localObject2).filePath;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_rid = ((WepkgPreloadFile)localObject2).uXe;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_mimeType = ((WepkgPreloadFile)localObject2).mimeType;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_md5 = ((WepkgPreloadFile)localObject2).cvZ;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_downloadUrl = ((WepkgPreloadFile)localObject2).downloadUrl;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_size = ((WepkgPreloadFile)localObject2).size;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_downloadNetType = ((WepkgPreloadFile)localObject2).uWQ;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_completeDownload = ((WepkgPreloadFile)localObject2).uXr;
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_createTime = ((WepkgPreloadFile)localObject2).createTime;
                  if (((com.tencent.mm.plugin.wepkg.b.d)localObject1).hrm)
                    if (((com.tencent.mm.plugin.wepkg.b.d)localObject1).hu(((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_rid) == null)
                    {
                      ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_createTime = com.tencent.mm.plugin.wepkg.utils.d.aNY();
                      bool1 = ((com.tencent.mm.plugin.wepkg.b.d)localObject1).b((com.tencent.mm.sdk.e.c)localObject3);
                      ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "insertPreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", new Object[] { ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_version, ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_rid, Boolean.valueOf(bool1) });
                    }
                    else
                    {
                      bool1 = ((com.tencent.mm.plugin.wepkg.b.d)localObject1).a((com.tencent.mm.sdk.e.c)localObject3);
                      ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "relacePreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", new Object[] { ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_version, ((com.tencent.mm.plugin.wepkg.b.c)localObject3).field_rid, Boolean.valueOf(bool1) });
                    }
                }
              }
            }
            continue;
            if ((this.uWY == null) || (bo.isNullOrNil(this.uWY.eBS)))
              break;
            localObject1 = com.tencent.mm.plugin.wepkg.b.d.dgo();
            localObject4 = this.uWY.eBS;
            if ((!((com.tencent.mm.plugin.wepkg.b.d)localObject1).hrm) && (bo.isNullOrNil((String)localObject4)));
            while (true)
            {
              this.uXc = ((List)localObject2);
              break;
              localObject3 = String.format("select * from %s where %s=? and %s=0", new Object[] { "WepkgPreloadFiles", "pkgId", "completeDownload" });
              localObject1 = ((com.tencent.mm.plugin.wepkg.b.d)localObject1).rawQuery((String)localObject3, new String[] { localObject4 });
              ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getNeedDownloadPreLoadFileList queryStr:%s", new Object[] { localObject3 });
              if (localObject1 == null)
              {
                ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
              }
              else if (((Cursor)localObject1).moveToFirst())
              {
                localObject2 = new ArrayList();
                do
                {
                  localObject3 = new WepkgPreloadFile();
                  localObject4 = new com.tencent.mm.plugin.wepkg.b.c();
                  ((com.tencent.mm.plugin.wepkg.b.c)localObject4).d((Cursor)localObject1);
                  ((WepkgPreloadFile)localObject3).a((com.tencent.mm.plugin.wepkg.b.c)localObject4);
                  ((List)localObject2).add(localObject3);
                }
                while (((Cursor)localObject1).moveToNext());
                ((Cursor)localObject1).close();
                ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject2).size()) });
              }
              else
              {
                ((Cursor)localObject1).close();
                ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
              }
            }
            if (this.uXb == null)
              break;
            bool5 = com.tencent.mm.plugin.wepkg.b.d.dgo().h(this.uXb.eBS, this.uXb.uXe, this.uXb.filePath, this.uXb.uXr);
          }
        }
      }
      while (this.uWY == null);
      localObject2 = f.dgp();
      if (!((f)localObject2).hrm)
        localObject2 = null;
      while (true)
        label1296: if (bo.isNullOrNil((String)localObject2))
        {
          localObject3 = com.tencent.mm.plugin.wepkg.b.d.dgo();
          if (!((com.tencent.mm.plugin.wepkg.b.d)localObject3).hrm)
          {
            localObject2 = localObject1;
            label1318: if (bo.isNullOrNil((String)localObject2))
            {
              localObject1 = f.dgp();
              if (((f)localObject1).hrm)
              {
                ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((f)localObject1).hY("WepkgVersion", String.format("update %s set %s=0", new Object[] { "WepkgVersion", "autoDownloadCount" }))) });
                ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord resetAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((f)localObject1).hY("WepkgPreloadFiles", String.format("update %s set %s=0", new Object[] { "WepkgPreloadFiles", "autoDownloadCount" }))) });
              }
            }
            this.uWY.eBS = ((String)localObject2);
            break;
            localObject4 = ((f)localObject2).rawQuery(String.format("select * from %s where %s=0 and %s=1 and %s<1 and %s<?", new Object[] { "WepkgVersion", "bigPackageReady", "preloadFilesAtomic", "autoDownloadCount", "packageDownloadCount" }), new String[] { "3" });
            if (localObject4 == null)
            {
              localObject2 = null;
              continue;
            }
            if (((Cursor)localObject4).moveToFirst())
            {
              i = ((Cursor)localObject4).getCount();
              if (i <= 1)
                break label2921;
            }
          }
        }
    case 4003:
    case 4004:
    case 2004:
    case 3002:
    case 2005:
    case 3007:
    case 2006:
    case 3008:
    case 3009:
    case 4005:
    case 4006:
    }
    label2364: label2906: label2915: label2921: for (int i = bo.gV(i - 1, 0); ; i = 0)
    {
      ((Cursor)localObject4).move(i);
      localObject3 = new e();
      ((e)localObject3).d((Cursor)localObject4);
      ((Cursor)localObject4).close();
      ((f)localObject2).ahI(((e)localObject3).field_pkgId);
      ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:true", new Object[] { ((e)localObject3).field_pkgId, ((e)localObject3).field_version });
      localObject2 = ((e)localObject3).field_pkgId;
      break label1296;
      ((Cursor)localObject4).close();
      localObject3 = ((f)localObject2).rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[] { "WepkgVersion", "bigPackageReady", "autoDownloadCount", "packageDownloadCount" }), new String[] { "3" });
      if (localObject3 == null)
      {
        localObject2 = null;
        break label1296;
      }
      if (((Cursor)localObject3).moveToFirst())
      {
        i = ((Cursor)localObject3).getCount();
        if (i <= 1)
          break label2915;
      }
      for (i = bo.gV(i - 1, 0); ; i = 0)
      {
        ((Cursor)localObject3).move(i);
        localObject4 = new e();
        ((e)localObject4).d((Cursor)localObject3);
        ((Cursor)localObject3).close();
        ((f)localObject2).ahI(((e)localObject4).field_pkgId);
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:false", new Object[] { ((e)localObject4).field_pkgId, ((e)localObject4).field_version });
        localObject2 = ((e)localObject4).field_pkgId;
        break label1296;
        ((Cursor)localObject3).close();
        ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid no download record in DB");
        localObject2 = null;
        break label1296;
        localObject4 = ((com.tencent.mm.plugin.wepkg.b.d)localObject3).rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[] { "WepkgPreloadFiles", "completeDownload", "autoDownloadCount", "fileDownloadCount" }), new String[] { "3" });
        localObject2 = localObject1;
        if (localObject4 == null)
          break label1318;
        if (((Cursor)localObject4).moveToFirst())
        {
          i = ((Cursor)localObject4).getCount();
          if (i <= 1)
            break label2906;
        }
        for (i = bo.gV(i - 1, 0); ; i = 0)
        {
          ((Cursor)localObject4).move(i);
          localObject2 = new com.tencent.mm.plugin.wepkg.b.c();
          ((com.tencent.mm.plugin.wepkg.b.c)localObject2).d((Cursor)localObject4);
          ((Cursor)localObject4).close();
          localObject4 = ((com.tencent.mm.plugin.wepkg.b.c)localObject2).field_pkgId;
          localObject1 = ((com.tencent.mm.plugin.wepkg.b.c)localObject2).field_rid;
          if ((!((com.tencent.mm.plugin.wepkg.b.d)localObject3).hrm) || (bo.isNullOrNil((String)localObject4)) || (bo.isNullOrNil((String)localObject1)));
          while (true)
          {
            ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", new Object[] { ((com.tencent.mm.plugin.wepkg.b.c)localObject2).field_pkgId, ((com.tencent.mm.plugin.wepkg.b.c)localObject2).field_version, ((com.tencent.mm.plugin.wepkg.b.c)localObject2).field_rid });
            localObject2 = ((com.tencent.mm.plugin.wepkg.b.c)localObject2).field_pkgId;
            break;
            ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.wepkg.b.d)localObject3).hY("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[] { "WepkgPreloadFiles", "autoDownloadCount", "autoDownloadCount", "pkgId", localObject4, "rid", localObject1 }))) });
          }
          ((Cursor)localObject4).close();
          ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid no download record in DB");
          localObject2 = localObject1;
          break label1318;
          if (this.uWY == null)
            break;
          this.uXc = com.tencent.mm.plugin.wepkg.b.d.dgo().ahD(this.uWY.eBS);
          break label222;
          if (this.uXb == null)
            break;
          localObject2 = com.tencent.mm.plugin.wepkg.b.d.dgo().hu(this.uXb.eBS, this.uXb.uXe);
          if (localObject2 != null)
          {
            this.uXb.a((com.tencent.mm.plugin.wepkg.b.c)localObject2);
            break label222;
          }
          this.uXb = null;
          break;
          if (this.uWY == null)
            break;
          bool5 = f.dgp().ahJ(this.uWY.eBS);
          break label222;
          if (this.uWY == null)
            break;
          localObject2 = f.dgp().ahG(this.uWY.eBS);
          if (localObject2 != null)
          {
            this.uWY.a((e)localObject2);
            break label222;
          }
          this.uWY = null;
          break;
          this.uWZ = f.dgp().dgs();
          break label222;
          if (this.uWY == null)
            break;
          bool5 = f.dgp().ahK(this.uWY.eBS);
          break label222;
          if (this.uWY == null)
            break;
          localObject2 = f.dgp();
          localObject1 = this.uWY.eBS;
          bool5 = bool1;
          if (((f)localObject2).hrm)
            if (!bo.isNullOrNil((String)localObject1))
              break label2364;
          for (bool5 = bool1; ; bool5 = true)
          {
            this.csN = bool5;
            break;
            ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addTotalDownloadCount ret:%s", new Object[] { Boolean.valueOf(((f)localObject2).hY("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "totalDownloadCount", "totalDownloadCount", "pkgId", localObject1 }))) });
          }
          if (this.uWY == null)
            break;
          localObject1 = f.dgp();
          localObject2 = this.uWY.eBS;
          if ((!((f)localObject1).hrm) || (bo.isNullOrNil((String)localObject2)));
          for (bool5 = false; ; bool5 = bool2)
          {
            this.csN = bool5;
            break;
            ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addPackageDownloadCount ret:%s", new Object[] { Boolean.valueOf(((f)localObject1).hY("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "packageDownloadCount", "packageDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.uWY == null)
            break;
          localObject2 = f.dgp();
          localObject1 = this.uWY.eBS;
          if ((!((f)localObject2).hrm) || (bo.isNullOrNil((String)localObject1)));
          for (bool5 = false; ; bool5 = bool3)
          {
            this.csN = bool5;
            break;
            ab.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetPackageDownloadCount ret:%s", new Object[] { Boolean.valueOf(((f)localObject2).hY("WepkgVersion", String.format("update %s set %s=0 where %s='%s'", new Object[] { "WepkgVersion", "packageDownloadCount", "pkgId", localObject1 }))) });
          }
          if (this.uXb == null)
            break;
          localObject2 = com.tencent.mm.plugin.wepkg.b.d.dgo();
          localObject3 = this.uXb.eBS;
          localObject1 = this.uXb.uXe;
          if ((!((com.tencent.mm.plugin.wepkg.b.d)localObject2).hrm) || (bo.isNullOrNil((String)localObject3)) || (bo.isNullOrNil((String)localObject1)));
          for (bool5 = false; ; bool5 = bool4)
          {
            this.csN = bool5;
            break;
            ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addFileDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.wepkg.b.d)localObject2).hY("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[] { "WepkgPreloadFiles", "fileDownloadCount", "fileDownloadCount", "pkgId", localObject3, "rid", localObject1 }))) });
          }
          if (this.uXb == null)
            break;
          localObject2 = com.tencent.mm.plugin.wepkg.b.d.dgo();
          localObject1 = this.uXb.eBS;
          if ((!((com.tencent.mm.plugin.wepkg.b.d)localObject2).hrm) || (bo.isNullOrNil((String)localObject1)))
          {
            bool5 = false;
            break label222;
          }
          ab.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord resetFileDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.wepkg.b.d)localObject2).hY("WepkgPreloadFiles", String.format("update %s set %s=0 where %s='%s'", new Object[] { "WepkgPreloadFiles", "fileDownloadCount", "pkgId", localObject1 }))) });
          break label222;
        }
        break label1318;
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(63534);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(63534);
  }

  public final void m(Parcel paramParcel)
  {
    AppMethodBeat.i(63535);
    this.Cn = paramParcel.readInt();
    this.uWY = ((WepkgVersion)paramParcel.readParcelable(WepkgVersion.class.getClassLoader()));
    if (this.uWZ == null)
      this.uWZ = new ArrayList();
    paramParcel.readList(this.uWZ, WepkgVersion.class.getClassLoader());
    this.uXb = ((WepkgPreloadFile)paramParcel.readParcelable(WepkgPreloadFile.class.getClassLoader()));
    if (this.uXc == null)
      this.uXc = new ArrayList();
    paramParcel.readList(this.uXc, WepkgPreloadFile.class.getClassLoader());
    this.uXd = paramParcel.readString();
    AppMethodBeat.o(63535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask
 * JD-Core Version:    0.6.2
 */