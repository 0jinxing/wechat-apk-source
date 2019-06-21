package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a.b;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public enum t
  implements b
{
  private int gTl = -1;
  private String gTm = null;

  static
  {
    AppMethodBeat.i(129396);
    gTk = new t("INSTANCE");
    gTn = new t[] { gTk };
    AppMethodBeat.o(129396);
  }

  final void E(int paramInt, String paramString)
  {
    this.gTl = paramInt;
    this.gTm = paramString;
  }

  public final void dy(boolean paramBoolean)
  {
    AppMethodBeat.i(129395);
    Object localObject = as.p(paramBoolean, true);
    if (((Pair)localObject).second != null)
      AppMethodBeat.o(129395);
    while (true)
    {
      return;
      if (((Pair)localObject).first == as.a.gUM)
      {
        localObject = f.auV();
        if (paramBoolean)
        {
          i = 0;
          label44: localObject = ((ax)localObject).a("@LibraryAppId", i, new String[] { "downloadURL", "version" });
          if ((localObject == null) || (bo.isNullOrNil(((at)localObject).field_downloadURL)))
            break label287;
          if (!paramBoolean)
            break label208;
        }
        t.1 local1;
        label208: for (int i = ((at)localObject).field_version; ; i = 0)
        {
          local1 = new t.1(this, i);
          if (!paramBoolean)
            break label263;
          if ((this.gTl <= 0) || (bo.isNullOrNil(this.gTm)))
            break label241;
          paramBoolean = r.avE();
          ab.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] lib can be patch, abtest open %b", new Object[] { Boolean.valueOf(paramBoolean) });
          if (!paramBoolean)
            break label241;
          if (as.v("@LibraryAppId", 0, this.gTl).first != as.a.gUI)
            break label213;
          ab.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] start incremental lib download");
          p.a("@LibraryAppId", this.gTl, ((at)localObject).field_version, this.gTm, local1);
          AppMethodBeat.o(129395);
          break;
          i = 999;
          break label44;
        }
        label213: ab.e("MicroMsg.AppBrand.PkgDownloadService", "[incremental] OldLibPkg[%d] or PatchUrl[%s] Invalid", new Object[] { Integer.valueOf(this.gTl), this.gTm });
        label241: az.a(((at)localObject).field_downloadURL, ((at)localObject).field_version, local1);
        AppMethodBeat.o(129395);
        continue;
        label263: az.a("@LibraryAppId", 999, ((at)localObject).field_downloadURL, local1, new t.2(this, (at)localObject));
      }
      else
      {
        label287: AppMethodBeat.o(129395);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.t
 * JD-Core Version:    0.6.2
 */