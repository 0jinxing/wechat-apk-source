package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.b.d;
import com.tencent.mm.plugin.appbrand.b.f;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.k;

class m extends f
{
  private k iJv;

  m(Activity paramActivity, k paramk)
  {
    super(paramActivity);
    this.iJv = paramk;
  }

  public void awE()
  {
    AppMethodBeat.i(114422);
    i locali = this.iJv.atv();
    if (locali != null)
      locali.gNN.gWy.nt(10);
    AppMethodBeat.o(114422);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.m
 * JD-Core Version:    0.6.2
 */