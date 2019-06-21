package com.tencent.mm.plugin.wepkg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.model.f;
import com.tencent.mm.plugin.wepkg.model.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1 extends com.tencent.mm.plugin.wepkg.model.a
{
  public final void a(BaseWepkgProcessTask paramBaseWepkgProcessTask)
  {
    AppMethodBeat.i(63338);
    paramBaseWepkgProcessTask = ((WepkgCrossProcessTask)paramBaseWepkgProcessTask).uWY;
    if (paramBaseWepkgProcessTask == null)
    {
      ab.e("MicroMsg.CommJsLoader", "wepkgVersion is null");
      a.a(null);
      AppMethodBeat.o(63338);
    }
    while (true)
    {
      return;
      if (paramBaseWepkgProcessTask.version == null)
      {
        ab.e("MicroMsg.CommJsLoader", "version is null");
        a.a(null);
        AppMethodBeat.o(63338);
      }
      else if ((a.dgc() != null) && (paramBaseWepkgProcessTask.version.equals(a.dgc().uWY.version)))
      {
        AppMethodBeat.o(63338);
      }
      else if (!paramBaseWepkgProcessTask.uXM)
      {
        ab.e("MicroMsg.CommJsLoader", "bigPackage is not ready");
        AppMethodBeat.o(63338);
      }
      else
      {
        com.tencent.mm.plugin.wepkg.model.e locale = g.a(a.dga(), paramBaseWepkgProcessTask.version, paramBaseWepkgProcessTask.gSP, paramBaseWepkgProcessTask.cvZ, paramBaseWepkgProcessTask.uXK);
        if ((locale == null) || (bo.isNullOrNil(paramBaseWepkgProcessTask.gSP)) || (!com.tencent.mm.a.e.ct(paramBaseWepkgProcessTask.gSP)))
        {
          ab.e("MicroMsg.CommJsLoader", "path not exist");
          AppMethodBeat.o(63338);
        }
        else
        {
          a.a(new f(paramBaseWepkgProcessTask, locale, null));
          AppMethodBeat.o(63338);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.a.1
 * JD-Core Version:    0.6.2
 */