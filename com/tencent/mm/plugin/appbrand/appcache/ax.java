package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.c;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.cwk;
import com.tencent.mm.protocal.protobuf.cwv;
import com.tencent.mm.sdk.e.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class ax
{
  public static final String[] gVi;
  public final f gVj;
  public final ax.b gVk;

  static
  {
    AppMethodBeat.i(101759);
    gVi = new String[] { com.tencent.mm.sdk.e.j.a(at.fjX, "AppBrandWxaPkgManifestRecord") };
    AppMethodBeat.o(101759);
  }

  public ax(f paramf)
  {
    AppMethodBeat.i(101727);
    this.gVj = paramf;
    this.gVk = new ax.b(paramf);
    AppMethodBeat.o(101727);
  }

  private boolean b(at paramat)
  {
    AppMethodBeat.i(101749);
    ab.i("MicroMsg.AppBrandWxaPkgStorage", "insertManifest, appId %s, type %d, version %d", new Object[] { paramat.field_appId, Integer.valueOf(paramat.field_debugType), Integer.valueOf(paramat.field_version) });
    boolean bool = this.gVk.b(paramat);
    AppMethodBeat.o(101749);
    return bool;
  }

  private boolean w(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(101758);
    Locale localLocale = Locale.US;
    if (paramInt2 > 0);
    for (String str = "version=".concat(String.valueOf(paramInt2)); ; str = "1=1")
    {
      str = String.format(localLocale, "where %s like '%s$%%' and %s=%d and %s", new Object[] { "appId", paramString, "debugType", Integer.valueOf(paramInt1), str });
      str = String.format(Locale.US, "delete from %s %s", new Object[] { "AppBrandWxaPkgManifestRecord", str });
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "deleteModuleList, appId %s, type %d, version %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      boolean bool = this.gVj.hY("AppBrandWxaPkgManifestRecord", str);
      AppMethodBeat.o(101758);
      return bool;
    }
  }

  public final at a(String paramString, int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(101732);
    Object localObject3 = new StringBuilder();
    Object localObject4 = at.gUR;
    int i = localObject4.length;
    for (int j = 0; j < i; j++)
      ((StringBuilder)localObject3).append(localObject4[j]).append("=? and ");
    ((StringBuilder)localObject3).append("1=1");
    if (j.a.kR(paramInt2))
      paramInt1 = 1;
    localObject4 = this.gVj;
    if (bo.Q(paramArrayOfString))
    {
      paramArrayOfString = null;
      localObject3 = ((f)localObject4).a("AppBrandWxaPkgManifestRecord", paramArrayOfString, ((StringBuilder)localObject3).toString(), new String[] { paramString, String.valueOf(paramInt1), String.valueOf(paramInt2) }, null, null, null, 2);
      if (localObject3 != null)
        break label160;
      AppMethodBeat.o(101732);
      paramArrayOfString = localObject2;
    }
    while (true)
    {
      return paramArrayOfString;
      break;
      label160: paramArrayOfString = localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        paramArrayOfString = new at();
        paramArrayOfString.d((Cursor)localObject3);
        paramArrayOfString.field_appId = paramString;
      }
      ((Cursor)localObject3).close();
      AppMethodBeat.o(101732);
    }
  }

  public final at a(String paramString, int paramInt, String[] paramArrayOfString)
  {
    AppMethodBeat.i(101733);
    if (bo.isNullOrNil(paramString))
    {
      paramArrayOfString = null;
      AppMethodBeat.o(101733);
    }
    while (true)
    {
      return paramArrayOfString;
      Object localObject;
      label32: f localf;
      if (j.a.np(paramInt))
      {
        localObject = "version desc";
        localf = this.gVj;
        if (!bo.Q(paramArrayOfString))
          break label153;
        paramArrayOfString = null;
      }
      label153: 
      while (true)
      {
        localObject = localf.query("AppBrandWxaPkgManifestRecord", paramArrayOfString, String.format(Locale.US, "%s=? and %s=?", new Object[] { "appId", "debugType" }), new String[] { paramString, String.valueOf(paramInt) }, null, null, (String)localObject);
        if (localObject != null)
          break label156;
        paramArrayOfString = null;
        AppMethodBeat.o(101733);
        break;
        if (j.a.kR(paramInt))
        {
          localObject = "createTime desc";
          break label32;
        }
        paramString = new RuntimeException("Illegal pkgType ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(101733);
        throw paramString;
      }
      label156: paramArrayOfString = null;
      if (((Cursor)localObject).moveToFirst())
      {
        paramArrayOfString = new at();
        paramArrayOfString.d((Cursor)localObject);
        paramArrayOfString.field_appId = paramString;
        paramArrayOfString.field_debugType = paramInt;
      }
      ((Cursor)localObject).close();
      AppMethodBeat.o(101733);
    }
  }

  final List<at> a(String paramString, int paramInt, ax.a parama, String[] paramArrayOfString)
  {
    AppMethodBeat.i(101730);
    if (bo.isNullOrNil(paramString))
    {
      paramString = Collections.emptyList();
      AppMethodBeat.o(101730);
    }
    while (true)
    {
      return paramString;
      f localf = this.gVj;
      Object localObject = String.format(Locale.US, "%s=? and %s=? ", new Object[] { "appId", "debugType" });
      parama = "version " + parama.name();
      paramArrayOfString = localf.a("AppBrandWxaPkgManifestRecord", paramArrayOfString, (String)localObject, new String[] { paramString, String.valueOf(paramInt) }, null, null, parama, 2);
      if (paramArrayOfString == null)
      {
        paramString = Collections.emptyList();
        AppMethodBeat.o(101730);
      }
      else if (!paramArrayOfString.moveToFirst())
      {
        paramArrayOfString.close();
        paramString = Collections.emptyList();
        AppMethodBeat.o(101730);
      }
      else
      {
        parama = new LinkedList();
        do
        {
          localObject = new at();
          ((at)localObject).d(paramArrayOfString);
          ((at)localObject).field_appId = paramString;
          ((at)localObject).field_debugType = paramInt;
          parama.add(localObject);
        }
        while (paramArrayOfString.moveToNext());
        paramArrayOfString.close();
        AppMethodBeat.o(101730);
        paramString = parama;
      }
    }
  }

  public final boolean a(at paramat)
  {
    AppMethodBeat.i(101739);
    if ((!bo.isNullOrNil(paramat.field_appId)) && (this.gVk.a(paramat, at.gUR)));
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
        w(paramat.field_appId, paramat.field_debugType, paramat.field_version);
      AppMethodBeat.o(101739);
      return bool;
    }
  }

  final boolean a(cwk paramcwk, PInt paramPInt)
  {
    boolean bool = false;
    AppMethodBeat.i(101735);
    if ((paramcwk.version < 0) || (bo.isNullOrNil(paramcwk.url)) || (bo.isNullOrNil(paramcwk.cvZ)))
    {
      ab.e("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, invalid resp: version( %d ), url( %s ), md5( %s )", new Object[] { Integer.valueOf(paramcwk.version), paramcwk.url, paramcwk.cvZ });
      AppMethodBeat.o(101735);
    }
    while (true)
    {
      return bool;
      if (paramcwk.wPu > 0)
      {
        int i = this.gVj.delete("AppBrandWxaPkgManifestRecord", String.format("%s=? and %s=? and %s>?", new Object[] { "appId", "debugType", "version" }), new String[] { "@LibraryAppId", "0", String.valueOf(paramcwk.version) });
        ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, delete manifest.version > %d, ret = %d", new Object[] { Integer.valueOf(paramcwk.version), Integer.valueOf(i) });
        paramPInt.value = i;
      }
      bool = a("@LibraryAppId", 0, paramcwk.version, paramcwk.cvZ, paramcwk.url);
      AppMethodBeat.o(101735);
    }
  }

  public final boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    AppMethodBeat.i(101743);
    boolean bool1;
    if (!j.a.np(paramInt1))
    {
      bool1 = false;
      AppMethodBeat.o(101743);
    }
    int i;
    at localat;
    while (true)
    {
      return bool1;
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo for release, appId %s, type %d, version %d, md5 %s, url %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2, paramString3 });
      i = au(paramString1, paramInt1);
      if ((!bo.isNullOrNil(paramString1)) && (!paramString1.endsWith("__CODELIB__")) && (paramInt2 < i))
      {
        ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, newVersion( %d ) < curMaxVersion( %d ), skip", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i) });
        bool1 = false;
        AppMethodBeat.o(101743);
      }
      else if (("@LibraryAppId".equals(paramString1)) && (paramInt2 == an.VERSION))
      {
        ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, given version == local library version %d, skip", new Object[] { Integer.valueOf(an.VERSION) });
        bool1 = false;
        AppMethodBeat.o(101743);
      }
      else
      {
        localat = a(paramString1, paramInt2, paramInt1, new String[0]);
        bool1 = false;
        if (localat != null)
          break;
        localObject = new at();
        ((at)localObject).field_appId = paramString1;
        ((at)localObject).field_version = paramInt2;
        ((at)localObject).field_versionMd5 = paramString2;
        ((at)localObject).field_downloadURL = paramString3;
        ((at)localObject).field_debugType = paramInt1;
        bool1 = b((at)localObject);
        ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, insert record %b, appId %s, version %d, url %s, md5 %s", new Object[] { Boolean.valueOf(bool1), paramString1, Integer.valueOf(((at)localObject).field_version), ((at)localObject).field_downloadURL, ((at)localObject).field_versionMd5 });
        AppMethodBeat.o(101743);
      }
    }
    Object localObject = localat.field_downloadURL;
    String str = localat.field_versionMd5;
    if (!bo.nullAsNil(localat.field_versionMd5).equals(paramString2))
    {
      localat.field_versionMd5 = paramString2;
      localat.field_version = paramInt2;
      localat.field_downloadURL = paramString3;
      paramInt1 = 1;
    }
    while (true)
    {
      label367: if (paramInt1 != 0)
        bool1 = c(localat);
      if ((paramInt1 != 0) && (bool1));
      for (boolean bool2 = true; ; bool2 = false)
      {
        ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaPkgVersionInfo, update record %b, appId %s, oldVersion %d, newVersion %d, oldURL %s, newURL %s, oldMd5 %s, newMd5 %s", new Object[] { Boolean.valueOf(bool2), paramString1, Integer.valueOf(i), Integer.valueOf(paramInt2), localObject, paramString3, str, paramString2 });
        if ((paramInt1 == 0) || (!bool1))
          break label513;
        bool1 = true;
        AppMethodBeat.o(101743);
        break;
        if ((bo.isNullOrNil(paramString3)) || (paramString3.equals(localat.field_downloadURL)))
          break label525;
        localat.field_downloadURL = paramString3;
        paramInt1 = 1;
        break label367;
      }
      label513: bool1 = false;
      AppMethodBeat.o(101743);
      break;
      label525: paramInt1 = 0;
    }
  }

  public final boolean a(String paramString, int paramInt1, int paramInt2, List<WxaAttributes.f> paramList)
  {
    AppMethodBeat.i(101757);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (bo.ek(paramList)))
    {
      bool = false;
      AppMethodBeat.o(101757);
      return bool;
    }
    if (!j.a.np(paramInt1))
      paramInt2 = 1;
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('{');
      Object localObject1 = paramList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (WxaAttributes.f)((Iterator)localObject1).next();
        localStringBuilder.append(',').append(((WxaAttributes.f)localObject2).name).append("::").append(((WxaAttributes.f)localObject2).cvZ);
      }
      localStringBuilder.append('}');
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "updateModuleList, appId %s, type %d, version %d, list %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localStringBuilder.toString() });
      Object localObject2 = paramList.iterator();
      if (((Iterator)localObject2).hasNext())
      {
        paramList = (WxaAttributes.f)((Iterator)localObject2).next();
        localObject1 = new y(paramString, paramList.name).toString();
        if (j.a.np(paramInt1))
          a((String)localObject1, paramInt1, paramInt2, paramList.cvZ, null);
        while (true)
        {
          localObject1 = paramList.hit;
          if ((bo.isNullOrNil(paramList.name)) || (bo.isNullOrNil((String)localObject1)))
            break;
          b(paramString, paramList.name, paramInt2, paramInt1, (String)localObject1, 13);
          break;
          a((String)localObject1, paramInt1, null, paramList.cvZ, 0L, 0L);
        }
      }
      bool = true;
      AppMethodBeat.o(101757);
      break;
    }
  }

  public final boolean a(String paramString1, int paramInt, String paramString2, String paramString3, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(101738);
    boolean bool;
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, null or nil appId");
      bool = false;
      AppMethodBeat.o(101738);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, appId %s, type %d, url %s, md5 %s, lifespan[%d, %d]", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, paramString3, Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      if (paramInt == 999)
        paramString1 = "@LibraryAppId";
      at localat = a(paramString1, 1, paramInt, new String[0]);
      if (localat == null)
      {
        localat = new at();
        localat.field_appId = paramString1;
        localat.field_version = 1;
        localat.field_debugType = paramInt;
        localat.field_downloadURL = paramString2;
        localat.field_versionMd5 = paramString3;
        localat.field_versionState = 0;
        localat.field_startTime = paramLong1;
        localat.field_endTime = paramLong2;
        localat.field_createTime = bo.anT();
        b(localat);
        bool = true;
        AppMethodBeat.o(101738);
      }
      else
      {
        int i;
        if ((!bo.isNullOrNil(paramString3)) && (!bo.isNullOrNil(localat.field_versionMd5)) && (!paramString3.equals(localat.field_versionMd5)))
        {
          i = 1;
          label233: if (bo.nullAsNil(paramString2).equals(bo.nullAsNil(localat.field_downloadURL)))
            break label355;
        }
        label355: for (int j = 1; ; j = 0)
        {
          if (i == 0)
            break label361;
          localat.field_downloadURL = paramString2;
          e.deleteFile(localat.field_pkgPath);
          localat.field_pkgPath = null;
          localat.field_createTime = bo.anT();
          localat.field_versionMd5 = paramString3;
          localat.field_startTime = paramLong1;
          localat.field_endTime = paramLong2;
          c(localat);
          if (bo.Q(paramString1.split("$")))
            w(paramString1, paramInt, 1);
          bool = true;
          AppMethodBeat.o(101738);
          break;
          i = 0;
          break label233;
        }
        label361: if (j != 0)
        {
          localat.field_downloadURL = paramString2;
          localat.field_startTime = paramLong1;
          localat.field_endTime = paramLong2;
          c(localat);
          bool = false;
          AppMethodBeat.o(101738);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(101738);
        }
      }
    }
  }

  public final boolean a(String paramString, WxaAttributes.e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(101746);
    if ((bo.isNullOrNil(paramString)) || (parame == null))
    {
      ab.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaAppVersionInfoV2, args invalid appId = %s, vInfo = %s", new Object[] { paramString, parame });
      AppMethodBeat.o(101746);
    }
    while (true)
    {
      return bool;
      a(paramString, 0, parame.axy, parame.hin);
      az(parame.hil);
      if (!bo.isNullOrNil(parame.hiq))
        b(paramString, "__WITHOUT_CODELIB__", parame.axy, 0, parame.hiq, 12);
      bool = a(paramString, 0, parame.axy, parame.hii, null);
      AppMethodBeat.o(101746);
    }
  }

  public final boolean a(String paramString, cwv paramcwv, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(101744);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaAppVersionInfo, args invalid appId = %s, vInfo = %s", new Object[] { paramString, paramcwv });
      AppMethodBeat.o(101744);
    }
    while (true)
    {
      return bool;
      bool = a(paramString, paramInt, paramcwv.vMG, paramcwv.xsx, paramcwv.xsy);
      AppMethodBeat.o(101744);
    }
  }

  public final boolean as(String paramString, int paramInt)
  {
    AppMethodBeat.i(101737);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (paramInt < 0))
    {
      AppMethodBeat.o(101737);
      bool = false;
    }
    while (true)
    {
      return bool;
      f localf = this.gVj;
      String str = String.format(Locale.US, "%s=? and %s=?", new Object[] { "appId", "debugType" });
      paramString = localf.a("AppBrandWxaPkgManifestRecord", new String[] { "version" }, str, new String[] { paramString, String.valueOf(paramInt) }, null, null, null, 2);
      if (paramString == null)
      {
        AppMethodBeat.o(101737);
        bool = false;
      }
      else
      {
        bool = paramString.moveToFirst();
        paramString.close();
        AppMethodBeat.o(101737);
      }
    }
  }

  public final String at(String paramString, int paramInt)
  {
    AppMethodBeat.i(101741);
    paramString = a(paramString, paramInt, new String[] { "downloadURL" });
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(101741);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.field_downloadURL;
      AppMethodBeat.o(101741);
    }
  }

  public final int au(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(101742);
    if ((bo.isNullOrNil(paramString)) || (!j.a.np(paramInt)))
    {
      AppMethodBeat.o(101742);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      paramString = a(paramString, paramInt, new String[] { "version" });
      if (paramString == null)
      {
        AppMethodBeat.o(101742);
        paramInt = i;
      }
      else
      {
        paramInt = paramString.field_version;
        AppMethodBeat.o(101742);
      }
    }
  }

  final int av(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(101750);
    if (j.a.np(0))
    {
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "deletePkgsBelowVersion, appId %s, pkgType %d, pkgVersion %d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
      paramInt = this.gVj.delete("AppBrandWxaPkgManifestRecord", String.format("%s=? and %s=? and %s<?", new Object[] { "appId", "debugType", "version" }), new String[] { paramString, "0", String.valueOf(paramInt) });
      AppMethodBeat.o(101750);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(101750);
      paramInt = i;
    }
  }

  final int aw(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(101751);
    if (j.a.np(0))
    {
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "deleteModuleListBelowVersion appId[%s] pkgType[%d] pkgVersion[%d]", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
      paramString = "'" + paramString + '$' + "%%'";
      paramInt = this.gVj.delete("AppBrandWxaPkgManifestRecord", String.format(Locale.US, "%s like %s and %s=? and %s<?", new Object[] { "appId", paramString, "debugType", "version" }), new String[] { "0", String.valueOf(paramInt) });
      AppMethodBeat.o(101751);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(101751);
      paramInt = i;
    }
  }

  final List<at> awo()
  {
    Object localObject1 = null;
    AppMethodBeat.i(101740);
    Object localObject2 = new StringBuilder("debugType");
    ((StringBuilder)localObject2).append(" in (");
    Object localObject3 = j.gSv;
    int i = localObject3.length;
    for (int j = 0; j < i; j++)
      ((StringBuilder)localObject2).append(localObject3[j]).append(',');
    ((StringBuilder)localObject2).append(-1).append(')');
    localObject3 = ((StringBuilder)localObject2).toString();
    localObject3 = this.gVj.a("AppBrandWxaPkgManifestRecord", null, (String)localObject3, null, null, null, null, 2);
    if (localObject3 == null)
      AppMethodBeat.o(101740);
    while (true)
    {
      return localObject1;
      if (!((Cursor)localObject3).moveToFirst())
      {
        ((Cursor)localObject3).close();
        AppMethodBeat.o(101740);
      }
      else
      {
        localObject1 = new ArrayList();
        do
        {
          localObject2 = new at();
          ((at)localObject2).d((Cursor)localObject3);
          ((List)localObject1).add(localObject2);
        }
        while (((Cursor)localObject3).moveToNext());
        ((Cursor)localObject3).close();
        AppMethodBeat.o(101740);
      }
    }
  }

  public final int ax(String paramString, int paramInt)
  {
    AppMethodBeat.i(101755);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(101755);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "deleteAppPkg, appId %s, debugType %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      String str = String.format("%s=? and %s=?", new Object[] { "appId", "debugType" });
      String[] arrayOfString = new String[2];
      arrayOfString[0] = paramString;
      arrayOfString[1] = String.valueOf(paramInt);
      Cursor localCursor = this.gVj.a("AppBrandWxaPkgManifestRecord", new String[] { "pkgPath" }, str, arrayOfString, null, null, null, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(101755);
        paramInt = 0;
      }
      else if (!localCursor.moveToFirst())
      {
        localCursor.close();
        AppMethodBeat.o(101755);
        paramInt = 0;
      }
      else
      {
        Object localObject = new LinkedList();
        do
          ((List)localObject).add(localCursor.getString(0));
        while (localCursor.moveToNext());
        localCursor.close();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
          e.deleteFile((String)((Iterator)localObject).next());
        int i = this.gVj.delete("AppBrandWxaPkgManifestRecord", str, arrayOfString);
        w(paramString, paramInt, -1);
        AppMethodBeat.o(101755);
        paramInt = i;
      }
    }
  }

  public final void az(List<WxaAttributes.c> paramList)
  {
    AppMethodBeat.i(101748);
    if ((paramList != null) && (paramList.size() > 0))
    {
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "updateCodeLibList size:%s", new Object[] { Integer.valueOf(paramList.size()) });
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject1 = (WxaAttributes.c)paramList.next();
        Object localObject2 = ((WxaAttributes.c)localObject1).bIy;
        String str = ((WxaAttributes.c)localObject1).cvZ;
        int i = ((WxaAttributes.c)localObject1).version;
        if ((!c.isNullOrNil((String)localObject2)) && (!c.isNullOrNil(str)))
        {
          localObject1 = new y((String)localObject2, "__CODELIB__").toString();
          localObject2 = xG((String)localObject1);
          if ((localObject2 != null) && (a.contains((int[])localObject2, i)))
            ab.i("MicroMsg.AppBrandWxaPkgStorage", "already has this codeLib info version:%s", new Object[] { Integer.valueOf(i) });
          else
            a((String)localObject1, 0, i, str, null);
        }
      }
    }
    AppMethodBeat.o(101748);
  }

  final List<at> b(String paramString, int paramInt, ax.a parama, String[] paramArrayOfString)
  {
    AppMethodBeat.i(101731);
    if (bo.isNullOrNil(paramString))
    {
      paramString = Collections.emptyList();
      AppMethodBeat.o(101731);
    }
    while (true)
    {
      return paramString;
      f localf = this.gVj;
      Object localObject = String.format(Locale.US, "%s=? and %s=? ", new Object[] { "appId", "version" });
      parama = "version " + parama.name();
      paramArrayOfString = localf.a("AppBrandWxaPkgManifestRecord", paramArrayOfString, (String)localObject, new String[] { paramString, String.valueOf(paramInt) }, null, null, parama, 2);
      if (paramArrayOfString == null)
      {
        paramString = Collections.emptyList();
        AppMethodBeat.o(101731);
      }
      else if (!paramArrayOfString.moveToFirst())
      {
        paramArrayOfString.close();
        paramString = Collections.emptyList();
        AppMethodBeat.o(101731);
      }
      else
      {
        parama = new LinkedList();
        do
        {
          localObject = new at();
          ((at)localObject).d(paramArrayOfString);
          ((at)localObject).field_appId = paramString;
          ((at)localObject).field_version = paramInt;
          parama.add(localObject);
        }
        while (paramArrayOfString.moveToNext());
        paramArrayOfString.close();
        AppMethodBeat.o(101731);
        paramString = parama;
      }
    }
  }

  public final void b(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    AppMethodBeat.i(101747);
    if (bo.isNullOrNil(paramString3))
    {
      ab.e("MicroMsg.AppBrandWxaPkgStorage", "updateWithoutCodeLibInfo withoutLibMd5 null appid:%s,modulename:%s!", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(101747);
    }
    while (true)
    {
      return;
      paramString1 = new y(paramString1, paramString2, paramInt3).toString();
      if (paramInt2 == 0)
      {
        a(paramString1, paramInt2, paramInt1, paramString3, null);
        AppMethodBeat.o(101747);
      }
      else
      {
        a(paramString1, paramInt2, "", paramString3, 0L, 0L);
        AppMethodBeat.o(101747);
      }
    }
  }

  public final boolean c(at paramat)
  {
    AppMethodBeat.i(101753);
    ab.i("MicroMsg.AppBrandWxaPkgStorage", "updateManifest, appId %s, version %d, pkgType %d", new Object[] { paramat.field_appId, Integer.valueOf(paramat.field_version), Integer.valueOf(paramat.field_debugType) });
    boolean bool = this.gVk.c(paramat, at.gUR);
    AppMethodBeat.o(101753);
    return bool;
  }

  public final void d(at paramat)
  {
    AppMethodBeat.i(101756);
    this.gVk.a(paramat);
    AppMethodBeat.o(101756);
  }

  public final void d(List<String> paramList, List<Integer> paramList1)
  {
    AppMethodBeat.i(101754);
    if ((paramList.size() <= 0) || (paramList1.size() <= 0) || (paramList.size() != paramList1.size()))
      AppMethodBeat.o(101754);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandWxaPkgStorage", "batchDeleteAppPkg, size %d", new Object[] { Integer.valueOf(paramList.size()) });
      long l = this.gVj.iV(Thread.currentThread().getId());
      for (int i = 0; i < paramList.size(); i++)
        ax((String)paramList.get(i), ((Integer)paramList1.get(i)).intValue());
      this.gVj.mB(l);
      AppMethodBeat.o(101754);
    }
  }

  @SuppressLint({"DefaultLocale"})
  public final boolean d(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(101752);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(101752);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (j.a.kR(paramInt1))
        paramInt2 = 1;
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("pkgPath", paramString2);
      if (this.gVj.update("AppBrandWxaPkgManifestRecord", localContentValues, String.format("%s=? and %s=? and %s=?", new Object[] { "appId", "debugType", "version" }), new String[] { paramString1, String.valueOf(paramInt1), String.valueOf(paramInt2) }) > 0)
      {
        AppMethodBeat.o(101752);
      }
      else
      {
        AppMethodBeat.o(101752);
        bool = false;
      }
    }
  }

  public final boolean g(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(101745);
    boolean bool = a(paramString1, 0, paramInt, paramString2, null);
    AppMethodBeat.o(101745);
    return bool;
  }

  public final int[] xF(String paramString)
  {
    AppMethodBeat.i(101728);
    paramString = xG(paramString);
    AppMethodBeat.o(101728);
    return paramString;
  }

  public final int[] xG(String paramString)
  {
    AppMethodBeat.i(101729);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(101729);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (!j.a.np(0))
      {
        AppMethodBeat.o(101729);
        paramString = null;
      }
      else
      {
        Object localObject = a(paramString, 0, ax.a.gVl, new String[] { "version" });
        if (bo.ek((List)localObject))
        {
          AppMethodBeat.o(101729);
          paramString = null;
        }
        else
        {
          paramString = new int[((List)localObject).size()];
          localObject = ((List)localObject).iterator();
          for (int i = 0; ((Iterator)localObject).hasNext(); i++)
            paramString[i] = ((at)((Iterator)localObject).next()).field_version;
          AppMethodBeat.o(101729);
        }
      }
    }
  }

  final boolean xH(String paramString)
  {
    AppMethodBeat.i(101734);
    f localf = this.gVj;
    String str = String.format("%s=?", new Object[] { "pkgPath" });
    paramString = localf.a("AppBrandWxaPkgManifestRecord", new String[] { "appId" }, str, new String[] { paramString }, null, null, null, 2);
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(101734);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = paramString.moveToFirst();
      paramString.close();
      AppMethodBeat.o(101734);
    }
  }

  @SuppressLint({"DefaultLocale"})
  final List<at> xI(String paramString)
  {
    at localat = null;
    AppMethodBeat.i(101736);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(101736);
      paramString = localat;
    }
    while (true)
    {
      return paramString;
      if (j.a.np(0));
      Object localObject2;
      for (Object localObject1 = String.format("order by %s desc", new Object[] { "version" }); ; localObject1 = String.format("order by %s desc", new Object[] { "createTime" }))
      {
        String str = String.format("limit %d offset %d", new Object[] { Integer.valueOf(2147483647), Integer.valueOf(2) });
        localObject2 = this.gVj;
        localObject1 = String.format("%s=? and %s=? %s %s", new Object[] { "appId", "debugType", localObject1, str });
        localObject2 = ((f)localObject2).a("AppBrandWxaPkgManifestRecord", new String[] { "pkgPath", "version" }, (String)localObject1, new String[] { paramString, "0" }, null, null, null, 2);
        if (localObject2 != null)
          break label195;
        AppMethodBeat.o(101736);
        paramString = localat;
        break;
      }
      label195: localObject1 = new ArrayList();
      if (((Cursor)localObject2).moveToFirst())
        do
        {
          localat = new at();
          localat.field_appId = paramString;
          localat.field_debugType = 0;
          localat.d((Cursor)localObject2);
          ((List)localObject1).add(localat);
        }
        while (((Cursor)localObject2).moveToNext());
      ((Cursor)localObject2).close();
      AppMethodBeat.o(101736);
      paramString = (String)localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ax
 * JD-Core Version:    0.6.2
 */