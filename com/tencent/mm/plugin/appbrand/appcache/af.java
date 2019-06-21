package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.q.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class af extends c<ae>
{
  public static final String[] fjY;
  private final e gTC;

  static
  {
    AppMethodBeat.i(59450);
    fjY = new String[] { j.a(ae.fjX, "PredownloadEncryptPkgInfo") };
    AppMethodBeat.o(59450);
  }

  public af(e parame)
  {
    super(parame, ae.fjX, "PredownloadEncryptPkgInfo", ae.diI);
    this.gTC = parame;
  }

  static boolean a(ae paramae)
  {
    boolean bool = false;
    AppMethodBeat.i(59449);
    if (bo.isNullOrNil(paramae.field_pkgPath))
    {
      ab.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s path nil", new Object[] { paramae.toShortString() });
      AppMethodBeat.o(59449);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramae.field_pkgMd5))
      {
        ab.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s record md5 nil", new Object[] { paramae.toShortString() });
        AppMethodBeat.o(59449);
      }
      else
      {
        String str = g.cz(paramae.field_pkgPath);
        ab.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity with %s, file_md5(%s), record_md5(%s)", new Object[] { paramae.toShortString(), str, paramae.field_pkgMd5 });
        bool = paramae.field_pkgMd5.equals(str);
        AppMethodBeat.o(59449);
      }
    }
  }

  public final ae r(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    AppMethodBeat.i(59447);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(59447);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      ae localae = new ae();
      localae.field_appId = paramString;
      localae.field_type = paramInt1;
      localae.field_version = paramInt2;
      if (b(localae, ae.gSr))
      {
        AppMethodBeat.o(59447);
        paramString = localae;
      }
      else
      {
        AppMethodBeat.o(59447);
        paramString = localObject;
      }
    }
  }

  public final ae s(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59448);
    paramString = r(paramString, paramInt1, paramInt2);
    if ((paramString != null) && (a(paramString)))
      AppMethodBeat.o(59448);
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(59448);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.af
 * JD-Core Version:    0.6.2
 */