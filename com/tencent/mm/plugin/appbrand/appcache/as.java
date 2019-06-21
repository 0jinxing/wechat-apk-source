package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public enum as
{
  private static WxaPkgWrappingInfo ar(String paramString, int paramInt)
  {
    AppMethodBeat.i(59519);
    if (("@LibraryAppId".equals(paramString)) && ((paramInt < 0) || (an.VERSION >= paramInt)))
    {
      ab.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "use local library version = %d | query appId = %s, debugType = %d, pkgVersion = %d", new Object[] { Integer.valueOf(an.VERSION), paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
      paramString = an.avV();
      AppMethodBeat.o(59519);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(59519);
    }
  }

  public static Pair<as.a, WxaPkgWrappingInfo> dE(boolean paramBoolean)
  {
    AppMethodBeat.i(59520);
    Pair localPair = p(paramBoolean, false);
    AppMethodBeat.o(59520);
    return localPair;
  }

  public static Pair<as.a, WxaPkgWrappingInfo> p(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(59521);
    Object localObject;
    if ((paramBoolean1) && ((!paramBoolean2) || (an.gTU != an.a.gTY)))
    {
      localObject = (d)g.K(d.class);
      if (localObject != null)
      {
        localObject = ((d)localObject).xF();
        if (localObject != null);
      }
      else
      {
        localObject = Pair.create(as.a.gUI, an.avV());
        AppMethodBeat.o(59521);
      }
      while (true)
      {
        return localObject;
        i = ((ax)localObject).au("@LibraryAppId", 0);
        localObject = ar("@LibraryAppId", i);
        if (localObject == null)
          break;
        ab.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, dbMax %d, local %d, use local", new Object[] { Integer.valueOf(i), Integer.valueOf(an.VERSION) });
        localObject = Pair.create(as.a.gUI, localObject);
        AppMethodBeat.o(59521);
      }
    }
    if (paramBoolean1);
    for (int i = 0; ; i = 999)
    {
      localObject = v("@LibraryAppId", i, -1);
      ab.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, release %b, skipLocalDevPack %b, localPackMode %s, checkRecordResult %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), an.gTU, ((Pair)localObject).first });
      AppMethodBeat.o(59521);
      break;
    }
  }

  public static Pair<as.a, WxaPkgWrappingInfo> v(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59522);
    if ((!g.RN().eJb) || (((d)g.K(d.class)).xF() == null))
    {
      ab.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "get null storage, appId = %s, debugType = %d, version = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = Pair.create(as.a.gUN, null);
      AppMethodBeat.o(59522);
    }
    label402: label553: label562: 
    while (true)
    {
      return paramString;
      Object localObject = new String[6];
      localObject[0] = "pkgPath";
      localObject[1] = "versionMd5";
      localObject[2] = "version";
      localObject[3] = "createTime";
      localObject[4] = "startTime";
      localObject[5] = "endTime";
      if ((j.a.np(paramInt1)) && (paramInt2 > 0));
      for (at localat = ((d)g.K(d.class)).xF().a(paramString, paramInt2, paramInt1, (String[])localObject); ; localat = ((d)g.K(d.class)).xF().a(paramString, paramInt1, (String[])localObject))
      {
        if (localat != null)
          break label217;
        ab.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "get null record, appId = %s, debugType = %d, version = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        paramString = Pair.create(as.a.gUJ, null);
        AppMethodBeat.o(59522);
        break;
      }
      label217: if (paramInt1 == 999)
      {
        ab.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkPkg for dev_lib, time_scope[%d, %d]", new Object[] { Long.valueOf(localat.field_startTime), Long.valueOf(localat.field_endTime) });
        if ((localat.field_endTime > 0L) && (localat.field_endTime <= bo.anT()))
        {
          paramString = Pair.create(as.a.gUK, null);
          AppMethodBeat.o(59522);
        }
      }
      else
      {
        String str1 = localat.field_pkgPath;
        String str2 = localat.field_versionMd5;
        if (paramInt2 < 0);
        long l;
        for (int i = localat.field_version; ; i = paramInt2)
        {
          l = localat.field_createTime;
          localObject = null;
          if ((!bo.isNullOrNil(str1)) && (e.ct(str1)))
            break label402;
          ab.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "file not exists, pkgPath = %s, appId = %s, debugType = %d, version = %d", new Object[] { str1, paramString, Integer.valueOf(paramInt1), Integer.valueOf(i) });
          paramString = Pair.create(as.a.gUM, null);
          AppMethodBeat.o(59522);
          break;
        }
        String str3 = e.atg(str1);
        if ((!bo.isNullOrNil(str2)) && (!str2.equals(str3)))
        {
          ab.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "md5 mismatch | realMd5 = %s, manifestMd5 = %s, appId = %s, debugType = %d, version = %d", new Object[] { str3, str2, paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          paramString = Pair.create(as.a.gUM, null);
          AppMethodBeat.o(59522);
        }
        else
        {
          if (!bo.isNullOrNil(paramString))
            if (!paramString.endsWith("__CODELIB__"))
              break label553;
          for (localObject = WxaPkgWrappingInfo.xN(str1); ; localObject = WxaPkgWrappingInfo.xM(str1))
          {
            if (localObject != null)
              break label562;
            ab.e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "obtain wxPkg failed, appId = %s, debugType = %d, version = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
            paramString = Pair.create(as.a.gUM, null);
            AppMethodBeat.o(59522);
            break;
          }
          ((WxaPkgWrappingInfo)localObject).gVu = i;
          ((WxaPkgWrappingInfo)localObject).gVv = l;
          ((WxaPkgWrappingInfo)localObject).gSP = str1;
          ((WxaPkgWrappingInfo)localObject).gVw = false;
          ((WxaPkgWrappingInfo)localObject).gVt = paramInt1;
          ((WxaPkgWrappingInfo)localObject).cvZ = str3;
          ab.i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "check ok, params: appId = %s, debugType = %d, version = %d, pkgVersion = %d, startTime = %d, endTime = %d, return %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Long.valueOf(localat.field_startTime), Long.valueOf(localat.field_endTime), localObject });
          paramString = Pair.create(as.a.gUI, localObject);
          AppMethodBeat.o(59522);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.as
 * JD-Core Version:    0.6.2
 */