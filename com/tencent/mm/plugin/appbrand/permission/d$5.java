package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.e;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.protocal.protobuf.buj;

final class d$5
  implements Runnable
{
  d$5(d paramd, i parami, String paramString1, String paramString2, buj parambuj, String paramString3, String paramString4, avx paramavx, boolean paramBoolean, a.e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102252);
    if (this.gVf.asV() == null)
      AppMethodBeat.o(102252);
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.widget.b.h localh = new com.tencent.mm.plugin.appbrand.widget.b.h(this.gVf.asV().getContext(), new d.5.1(this));
      localh.Ez(this.gVf.ye().cwz);
      localh.EC(this.iws);
      localh.EA(this.iwt.Desc);
      localh.ED(this.iwu);
      localh.EE(this.iwv);
      localh.jl(this.iww.vDm);
      if (this.iwx)
        localh.EB(this.iwy.desc);
      this.gVf.gNG.b(localh);
      AppMethodBeat.o(102252);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d.5
 * JD-Core Version:    0.6.2
 */