package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.aq;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.model.a;
import com.tencent.mm.plugin.appbrand.report.model.d;
import com.tencent.mm.plugin.appbrand.report.model.g;
import com.tencent.mm.plugin.appbrand.report.model.i;
import com.tencent.mm.plugin.appbrand.report.model.p;

final class h$1
  implements g
{
  private final i ikv;

  h$1(h paramh)
  {
    AppMethodBeat.i(132124);
    this.ikv = new d(a.d(this.ikw.getRuntime().atI().hgF));
    AppMethodBeat.o(132124);
  }

  public final void F(Intent paramIntent)
  {
  }

  public final void a(long paramLong, aq paramaq)
  {
  }

  public final void a(w paramw)
  {
    AppMethodBeat.i(132125);
    b(paramw);
    AppMethodBeat.o(132125);
  }

  public final void a(w paramw1, w paramw2, aq paramaq)
  {
    AppMethodBeat.i(132127);
    this.ikv.a(paramw1, paramw2, paramaq);
    AppMethodBeat.o(132127);
  }

  public final void aHW()
  {
  }

  public final i aHX()
  {
    return this.ikv;
  }

  public final Intent aHY()
  {
    return null;
  }

  public final p aHZ()
  {
    AppMethodBeat.i(132126);
    p localp = p.aLy();
    AppMethodBeat.o(132126);
    return localp;
  }

  public final void aIa()
  {
  }

  public final void b(w paramw)
  {
    AppMethodBeat.i(132128);
    this.ikv.b(paramw);
    AppMethodBeat.o(132128);
  }

  public final void c(w paramw)
  {
    AppMethodBeat.i(132129);
    this.ikv.c(paramw);
    AppMethodBeat.o(132129);
  }

  public final void resetSession()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h.1
 * JD-Core Version:    0.6.2
 */