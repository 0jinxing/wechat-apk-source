package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aq;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.protocal.protobuf.arb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;

public final class v extends u
{
  public final String appId;
  public int cBc;
  public final int cvn;
  public final String gTy;
  public final int ihB;
  public final boolean ihC;
  private at ihD;
  private final int[] ihE;

  public v(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, true);
  }

  public v(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this(paramString1, paramString2, paramInt1, paramInt2, (byte)0);
  }

  private v(String paramString1, String paramString2, int paramInt1, int paramInt2, byte paramByte)
  {
    super(new y(paramString1, paramString2, paramInt2));
    AppMethodBeat.i(131892);
    this.cvn = 0;
    this.cBc = 4;
    this.ihE = new int[] { 14, 12 };
    this.appId = paramString1;
    this.gTy = paramString2;
    this.ihB = paramInt1;
    this.ihC = true;
    if (paramInt2 != 0)
      this.cBc = paramInt2;
    AppMethodBeat.o(131892);
  }

  public v(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    super(new y(paramString1, paramString2));
    AppMethodBeat.i(131891);
    this.cvn = 0;
    this.cBc = 4;
    this.ihE = new int[] { 14, 12 };
    this.appId = paramString1;
    this.gTy = paramString2;
    this.ihB = paramInt;
    this.ihC = paramBoolean;
    AppMethodBeat.o(131891);
  }

  private WxaPkgWrappingInfo Ci(String paramString)
  {
    AppMethodBeat.i(131894);
    if ((!bo.isNullOrNil(this.gTy)) && (this.gTy.endsWith("__CODELIB__")));
    for (paramString = WxaPkgWrappingInfo.xN(paramString); ; paramString = WxaPkgWrappingInfo.xM(paramString))
    {
      paramString.gVu = this.ihB;
      AppMethodBeat.o(131894);
      return paramString;
    }
  }

  public final String aHu()
  {
    AppMethodBeat.i(131893);
    String str = String.format(Locale.US, "pkg %s, targetVersion %d, codeType %d", new Object[] { this.ihz.toString(), Integer.valueOf(this.ihB), Integer.valueOf(0) });
    AppMethodBeat.o(131893);
    return str;
  }

  public final void prepare()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 1;
    AppMethodBeat.i(131895);
    Object localObject5 = com.tencent.mm.plugin.appbrand.app.f.auV();
    if (localObject5 == null)
    {
      ab.e("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "get NULL storage with %s", new Object[] { aHu() });
      e(null);
      AppMethodBeat.o(131895);
    }
    while (true)
    {
      return;
      this.ihD = ((ax)localObject5).a(this.ihz.toString(), this.ihB, 0, new String[0]);
      if (this.ihD == null)
      {
        ab.e("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "get NULL record with %s", new Object[] { aHu() });
        e(null);
        localObject2 = ah.getContext().getString(2131296775, new Object[] { "" });
        if ((!this.ihC) || (TextUtils.isEmpty((CharSequence)localObject2)))
        {
          AppMethodBeat.o(131895);
        }
        else
        {
          com.tencent.mm.sdk.g.d.xDG.d(new v.3(this, (String)localObject2));
          AppMethodBeat.o(131895);
        }
      }
      else if (bo.isNullOrNil(this.ihD.field_versionMd5))
      {
        ab.e("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "get EMPTY md5 with %s", new Object[] { aHu() });
        e(null);
        AppMethodBeat.o(131895);
      }
      else
      {
        try
        {
          localObject5 = com.tencent.mm.vfs.e.openRead(this.ihD.field_pkgPath);
          localObject2 = localObject5;
          localObject1 = localObject5;
          if (this.ihD.field_versionMd5.equals(g.b((InputStream)localObject5, 4096)))
          {
            localObject2 = localObject5;
            localObject1 = localObject5;
            ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "%s prepare ok", new Object[] { aHu() });
            localObject2 = localObject5;
            localObject1 = localObject5;
            e(Ci(this.ihD.field_pkgPath));
            localObject2 = localObject5;
            localObject1 = localObject5;
            aHs();
            bo.b((Closeable)localObject5);
            AppMethodBeat.o(131895);
          }
          else
          {
            bo.b((Closeable)localObject5);
            com.tencent.mm.vfs.e.deleteFile(this.ihD.field_pkgPath);
            localObject2 = h.a(this.ihz, 0, this.ihB, this.ihD.field_versionMd5);
            if (localObject2 != null)
            {
              ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "find reusable record, target (%s), reusable (%s %d)", new Object[] { aHu(), ((at)localObject2).field_appId, Integer.valueOf(((at)localObject2).field_version) });
              localObject1 = aq.aq(this.ihz.toString(), this.ihB);
              com.tencent.mm.vfs.e.y(((at)localObject2).field_pkgPath, (String)localObject1);
              com.tencent.mm.plugin.appbrand.app.f.auV().d(this.ihz.toString(), 0, this.ihB, (String)localObject1);
              e(Ci((String)localObject1));
              aHs();
              AppMethodBeat.o(131895);
            }
          }
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          while (true)
            bo.b((Closeable)localObject2);
        }
        finally
        {
          bo.b(localFileNotFoundException);
          AppMethodBeat.o(131895);
        }
      }
    }
    ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "%s getDownloadURL", new Object[] { aHu() });
    arb localarb = new arb();
    localarb.csB = this.appId;
    localarb.vOP = this.ihB;
    localarb.wtb = 0;
    if (!bo.isNullOrNil(this.gTy))
    {
      localarb.wtb = this.cBc;
      if (!a.contains(this.ihE, this.cBc))
        localarb.wsY = this.gTy;
    }
    localarb.wuL = this.ihD.field_versionMd5;
    if ((r.avD()) && (j.a.np(0)))
    {
      localObject4 = this.ihz.toString();
      if (!bo.isNullOrNil((String)localObject4))
      {
        if (!((String)localObject4).endsWith("__CODELIB__"))
          break label767;
        localObject4 = h.bm((String)localObject4, 0);
        label623: if (localObject4 != null)
          localarb.wuM = ((WxaPkgWrappingInfo)localObject4).gVu;
      }
    }
    Object localObject4 = localarb.csB;
    int j = localarb.wtb;
    localObject5 = localarb.wsY;
    int k = localarb.vOP;
    int m = localarb.wuM;
    String str = localarb.wuL;
    if (r.avD());
    while (true)
    {
      ab.i("MicroMsg.AppBrand.LaunchPkgPrepareJobReleaseCode", "appid:%s,cgirequest pkgtype:%s,modulename:%s,version:%s,old_app_version:%s,record md5:%s,openIncremental:%s", new Object[] { localObject4, Integer.valueOf(j), localObject5, Integer.valueOf(k), Integer.valueOf(m), str, Integer.valueOf(i) });
      new com.tencent.mm.plugin.appbrand.appcache.d(localarb).acy().h(new v.1(this, localarb));
      AppMethodBeat.o(131895);
      break;
      label767: localObject4 = h.bm((String)localObject4, 1);
      break label623;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.v
 * JD-Core Version:    0.6.2
 */