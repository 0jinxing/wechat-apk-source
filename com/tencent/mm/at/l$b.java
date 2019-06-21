package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class l$b
{
  public l.a fFI;

  public l$b(l paraml, l.a parama)
  {
    this.fFI = parama;
  }

  final void agX()
  {
    AppMethodBeat.i(78330);
    if (l.b(this.fFF) == l.c(this.fFF));
    for (Object localObject = l.d(this.fFF); ; localObject = l.e(this.fFF))
    {
      if (((e)localObject).fDL == 1)
      {
        com.tencent.mm.plugin.report.service.g.BO(23);
        com.tencent.mm.plugin.report.service.g.BO(21);
      }
      ab.i(l.f(this.fFF), "UploadEndWrapper onUploadEnd %s done", new Object[] { l.f(l.d(this.fFF)) });
      if (o.ahl().a(Long.valueOf(l.c(this.fFF)), l.d(this.fFF)) < 0)
      {
        ab.e(l.f(this.fFF), "update db failed local id:" + l.c(this.fFF) + " server id:" + l.d(this.fFF).cKK);
        i.lC((int)l.b(this.fFF));
        i.lB((int)l.b(this.fFF));
        l.g(this.fFF).onSceneEnd(3, -1, "", this.fFF);
      }
      if (l.c(this.fFF) != l.b(this.fFF))
      {
        ab.i(l.f(this.fFF), "UploadEndWrapper onUploadEnd OriImg %s done", new Object[] { l.f(l.e(this.fFF)) });
        o.ahl().a(Long.valueOf(l.b(this.fFF)), l.e(this.fFF));
      }
      if ((!b.dnO()) && (!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_PURPLE))
        break;
      localObject = o.ahl().agV();
      if (localObject == null)
        break;
      for (int i = 0; i < ((List)localObject).size(); i++)
        ab.i(l.f(this.fFF), "UploadEndWrapper onUploadEnd duminfo %s %s", new Object[] { Integer.valueOf(i), l.f((e)((List)localObject).get(i)) });
    }
    l.a(this.fFF, l.c(this.fFF));
    if (l.b(this.fFF) != l.c(this.fFF))
      l.a(this.fFF, l.b(this.fFF));
    if (this.fFI != null)
      this.fFI.agX();
    this.fFF.lD(l.h(this.fFF));
    l.i(this.fFF);
    AppMethodBeat.o(78330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.l.b
 * JD-Core Version:    0.6.2
 */