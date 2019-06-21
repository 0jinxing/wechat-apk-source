package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.an;
import com.tencent.mm.model.as;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import java.util.HashMap;

public final class g
  implements at
{
  private bz.a jCX;
  private f uLf;
  private a uLg;
  private as uLh;
  private com.tencent.mm.sdk.b.c uLi;
  private s uLj;

  public g()
  {
    AppMethodBeat.i(26515);
    this.uLf = new f();
    this.jCX = new g.1(this);
    this.uLh = new g.2(this);
    this.uLi = new g.3(this);
    this.uLj = new g.4(this);
    AppMethodBeat.o(26515);
  }

  public static g ddf()
  {
    AppMethodBeat.i(26516);
    aw.ZE();
    g localg1 = (g)bw.oJ("plugin.webwx");
    g localg2 = localg1;
    if (localg1 == null)
    {
      localg2 = new g();
      aw.ZE().a("plugin.webwx", localg2);
    }
    AppMethodBeat.o(26516);
    return localg2;
  }

  static void ddg()
  {
    AppMethodBeat.i(26519);
    aw.getNotification().cancel(38);
    AppMethodBeat.o(26519);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(26518);
    e.d.a(Integer.valueOf(51), this.uLf);
    aw.getSysCmdMsgExtension().a("pushloginurl", this.jCX, true);
    aw.ZK();
    com.tencent.mm.model.c.a(this.uLh);
    com.tencent.mm.sdk.b.a.xxA.c(this.uLi);
    this.uLg = null;
    u.a(5, this.uLj);
    AppMethodBeat.o(26518);
  }

  public final a ddh()
  {
    AppMethodBeat.i(26520);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.uLg == null)
      this.uLg = new a();
    a locala = this.uLg;
    AppMethodBeat.o(26520);
    return locala;
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(26517);
    e.d.b(Integer.valueOf(51), this.uLf);
    aw.getSysCmdMsgExtension().b("pushloginurl", this.jCX, true);
    aw.ZK();
    com.tencent.mm.model.c.b(this.uLh);
    com.tencent.mm.sdk.b.a.xxA.d(this.uLi);
    ddg();
    if (this.uLg != null)
    {
      a locala = this.uLg;
      o.all().a(locala);
      com.tencent.mm.kernel.g.Rg().b(221, locala);
    }
    u.a(this.uLj);
    AppMethodBeat.o(26517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.g
 * JD-Core Version:    0.6.2
 */