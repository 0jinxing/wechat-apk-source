package com.tencent.mm.plugin.appbrand.appcache.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.b.b.b;
import com.tencent.mm.plugin.appbrand.appcache.b.b.c;
import com.tencent.mm.plugin.appbrand.appcache.b.b.e;
import com.tencent.mm.plugin.appbrand.appcache.b.b.h;
import com.tencent.mm.protocal.protobuf.cgb;
import com.tencent.mm.protocal.protobuf.cxr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public final class d
{
  static void aB(List<cgb> paramList)
  {
    AppMethodBeat.i(129446);
    if (bo.ek(paramList))
      AppMethodBeat.o(129446);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        cgb localcgb = (cgb)localIterator.next();
        if (localcgb.xfe == null)
        {
          ab.e("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s, appId %s, nil Cmds", new Object[] { localcgb.xfb, localcgb.vEn });
        }
        else
        {
          paramList = localcgb.xfb;
          String str = localcgb.vEn;
          boolean bool1;
          label102: boolean bool2;
          label115: boolean bool3;
          label128: boolean bool4;
          label141: boolean bool5;
          if (localcgb.xfe.xtd != null)
          {
            bool1 = true;
            if (localcgb.xfe.xte == null)
              break label529;
            bool2 = true;
            if (localcgb.xfe.xtf == null)
              break label535;
            bool3 = true;
            if (localcgb.xfe.xtg == null)
              break label541;
            bool4 = true;
            if (localcgb.xfe.xth == null)
              break label547;
            bool5 = true;
            label154: if (localcgb.xfe.xti == null)
              break label553;
          }
          label529: label535: label541: label547: label553: for (boolean bool6 = true; ; bool6 = false)
          {
            ab.i("MicroMsg.AppBrand.PredownloadCmdProcessor", "processCmd, username %s appId %s, GetContact(%b), GetCode(%b), IssueContact(%b), IssueLaunch(%b), IssueDecryptKey(%s), UpdateVersion(%b)", new Object[] { paramList, str, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6) });
            if (localcgb.xfe.xtd != null)
              com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xtd).j(new com.tencent.mm.plugin.appbrand.appcache.b.b.d());
            if (localcgb.xfe.xte != null)
              com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xte).j(new c()).g(new d.1());
            if (localcgb.xfe.xtf != null)
              com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xtf).j(new e());
            if (localcgb.xfe.xtg != null)
              com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xtg).j(new com.tencent.mm.plugin.appbrand.appcache.b.b.g());
            if (localcgb.xfe.xth != null)
              com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xth).j(new com.tencent.mm.plugin.appbrand.appcache.b.b.f());
            if (localcgb.xfe.xti != null)
              com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xti).j(new h());
            if (localcgb.xfe.xtj == null)
              break;
            com.tencent.mm.ci.g.j(localcgb.xfb, localcgb.vEn, localcgb.xfe.xtj).j(new b());
            break;
            bool1 = false;
            break label102;
            bool2 = false;
            break label115;
            bool3 = false;
            break label128;
            bool4 = false;
            break label141;
            bool5 = false;
            break label154;
          }
        }
      }
      AppMethodBeat.o(129446);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.d
 * JD-Core Version:    0.6.2
 */