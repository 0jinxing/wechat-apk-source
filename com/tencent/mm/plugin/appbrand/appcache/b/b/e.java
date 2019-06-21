package com.tencent.mm.plugin.appbrand.appcache.b.b;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.protocal.protobuf.cwx;
import com.tencent.mm.protocal.protobuf.cwy;
import com.tencent.mm.protocal.protobuf.cxp;
import com.tencent.mm.protocal.protobuf.cxu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public class e extends a<Boolean, cxu>
{
  private static Boolean a(String paramString1, String paramString2, cxu paramcxu)
  {
    AppMethodBeat.i(129464);
    Object localObject1 = paramcxu.xtm;
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.e("MicroMsg.AppBrand.Predownload.CmdIssueContact", "call[%s | %s], empty base64", new Object[] { paramString1, paramString2 });
      paramString1 = Boolean.FALSE;
      AppMethodBeat.o(129464);
      return paramString1;
    }
    label490: 
    while (true)
    {
      try
      {
        localObject1 = Base64.decode((String)localObject1, 0);
        Object localObject2 = new com/tencent/mm/protocal/protobuf/cwy;
        ((cwy)localObject2).<init>();
        ((cwy)localObject2).parseFrom((byte[])localObject1);
        localObject1 = f.auO().d(paramString1, new String[] { "versionInfo" });
        WxaAttributes.e locale;
        if (localObject1 == null)
        {
          locale = null;
          localObject1 = null;
          localObject3 = ((cwy)localObject2).vMT.iterator();
          if (((Iterator)localObject3).hasNext())
          {
            cwx localcwx = (cwx)((Iterator)localObject3).next();
            if (!"WxaAppVersionInfo".equals(localcwx.vMU))
              break label490;
            localObject1 = WxaAttributes.e.zz(localcwx.pXM);
            continue;
          }
        }
        else
        {
          locale = ((WxaAttributes)localObject1).ayL();
          continue;
        }
        if (localObject1 == null)
        {
          localObject1 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramcxu.xsZ.xsX, 87L);
          paramcxu = Boolean.FALSE;
          AppMethodBeat.o(129464);
          paramString1 = paramcxu;
          break;
        }
        Object localObject3 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramcxu.xsZ.xsX, 88L);
        if ((locale == null) || (localObject1 == null) || (locale.axy < ((WxaAttributes.e)localObject1).axy))
        {
          bool1 = true;
          if (!bool1)
            continue;
          f.auO().a(paramString1, ((cwy)localObject2).vMS, ((cwy)localObject2).vMT);
          if (f.auO().d(paramString1, new String[0]) == null)
            continue;
          bool2 = true;
          localObject2 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          i = paramcxu.xsZ.xsX;
          if (!bool2)
            continue;
          j = 85;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(i, j);
          if (locale != null)
            continue;
          j = -1;
          if (localObject1 != null)
            continue;
          i = -1;
          ab.i("MicroMsg.AppBrand.Predownload.CmdIssueContact", "call[%s | %s], record.ver %d, issue.ver %d, doIssue %b, issueRet %b", new Object[] { paramString1, paramString2, Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          paramString1 = Boolean.valueOf(bool2);
          AppMethodBeat.o(129464);
          break;
        }
        boolean bool1 = false;
        continue;
        boolean bool2 = false;
        continue;
        int j = 86;
        continue;
        localObject2 = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramcxu.xsZ.xsX, 84L);
        bool2 = false;
        continue;
        j = locale.axy;
        continue;
        int i = ((WxaAttributes.e)localObject1).axy;
        continue;
      }
      catch (Exception paramcxu)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdIssueContact", paramcxu, "call[%s | %s], decode base64", new Object[] { paramString1, paramString2 });
        paramString1 = Boolean.FALSE;
        AppMethodBeat.o(129464);
      }
      break;
    }
  }

  final String awu()
  {
    return "CmdIssueContact";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b.e
 * JD-Core Version:    0.6.2
 */