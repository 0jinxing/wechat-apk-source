package com.tencent.mm.plugin.appbrand.appcache.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appcache.ae;
import com.tencent.mm.plugin.appbrand.appcache.af;
import com.tencent.mm.plugin.appbrand.appcache.ag;
import com.tencent.mm.plugin.appbrand.appcache.ah;
import com.tencent.mm.plugin.appbrand.appcache.aq;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.protobuf.cxv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class f extends a<Boolean, cxv>
{
  public static boolean a(ae paramae, a parama)
  {
    AppMethodBeat.i(129471);
    boolean bool = a(paramae, parama, null);
    AppMethodBeat.o(129471);
    return bool;
  }

  public static boolean a(ae paramae, a parama, PLong paramPLong)
  {
    AppMethodBeat.i(129472);
    ag localag = ((ah)com.tencent.mm.plugin.appbrand.app.f.E(ah.class)).ap(paramae.field_appId, paramae.field_version);
    boolean bool;
    if (localag == null)
    {
      ab.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave get null key with %s", new Object[] { paramae.toShortString() });
      AppMethodBeat.o(129472);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramPLong != null)
        paramPLong.value = localag.field_reportId;
      bool = a(paramae, localag.field_decryptKey, localag.field_pkgMd5, localag.field_reportId, parama);
      AppMethodBeat.o(129472);
    }
  }

  private static boolean a(ae paramae, String paramString1, String paramString2, int paramInt, a parama)
  {
    boolean bool1 = false;
    AppMethodBeat.i(129470);
    Object localObject;
    switch (f.1.gVY[parama.ordinal()])
    {
    default:
      i = 127;
      localObject = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
      com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
      localObject = aq.aq(paramae.field_appId, paramae.field_version);
      i = MMProtocalJni.aesDecryptFile(paramae.field_pkgPath, (String)localObject, paramString1.getBytes());
      ab.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, appId(%s), version(%d), ret %d", new Object[] { paramae.field_appId, Integer.valueOf(paramae.field_version), Integer.valueOf(i) });
      if (i != 0)
        switch (f.1.gVY[parama.ordinal()])
        {
        default:
        case 1:
        }
      break;
    case 1:
      for (i = 129; ; i = 133)
      {
        paramae = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
        AppMethodBeat.o(129470);
        bool1 = false;
        return bool1;
        i = 131;
        break;
      }
    }
    paramString1 = g.cz((String)localObject);
    if (!paramString1.equals(paramString2))
    {
      ab.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, file_md5(%s) expect_md5(%s) mismatch", new Object[] { paramString1, paramString2 });
      switch (f.1.gVY[parama.ordinal()])
      {
      default:
      case 1:
      }
      for (i = 130; ; i = 134)
      {
        paramae = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
        AppMethodBeat.o(129470);
        bool1 = false;
        break;
      }
    }
    com.tencent.mm.plugin.appbrand.app.f.auV().g(paramae.field_appId, paramae.field_version, paramString2);
    boolean bool2 = com.tencent.mm.plugin.appbrand.app.f.auV().d(paramae.field_appId, 0, paramae.field_version, (String)localObject);
    switch (f.1.gVY[parama.ordinal()])
    {
    default:
      if (bool2)
      {
        i = 143;
        label362: paramString1 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
        e.deleteFile(paramae.field_pkgPath);
        if (!((af)com.tencent.mm.plugin.appbrand.app.f.E(af.class)).a(paramae, new String[0]))
          break label561;
        i = 139;
        label406: paramString1 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
        if (parama != a.gWa)
        {
          paramString1 = (ah)com.tencent.mm.plugin.appbrand.app.f.E(ah.class);
          paramString2 = paramae.field_appId;
          i = paramae.field_version;
          if (!bo.isNullOrNil(paramString2))
            break label569;
          label453: if (!bool1)
            break label602;
          i = 141;
          label463: paramae = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
        }
        switch (f.1.gVY[parama.ordinal()])
        {
        default:
        case 1:
        }
      }
      break;
    case 1:
    }
    for (int i = 128; ; i = 132)
    {
      paramae = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
      com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramInt, i);
      AppMethodBeat.o(129470);
      bool1 = true;
      break;
      if (bool2)
      {
        i = 147;
        break label362;
      }
      i = 148;
      break label362;
      i = 144;
      break label362;
      label561: i = 140;
      break label406;
      label569: paramae = new ag();
      paramae.field_appId = paramString2;
      paramae.field_appVersion = i;
      bool1 = paramString1.a(paramae, new String[0]);
      break label453;
      label602: i = 142;
      break label463;
    }
  }

  final String awu()
  {
    return "CmdIssueDecryptKey";
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(129469);
      gVZ = new a("WXA_LAUNCH", 0);
      gWa = new a("ISSUE_DECRYPT", 1);
      gWb = new a("GET_CODE", 2);
      gWc = new a[] { gVZ, gWa, gWb };
      AppMethodBeat.o(129469);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b.f
 * JD-Core Version:    0.6.2
 */