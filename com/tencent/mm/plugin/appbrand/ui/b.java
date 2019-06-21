package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class b extends c.a
{
  private boolean iFB;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(132890);
    this.iFB = false;
    if ((paramContext instanceof Activity))
      this.iFB = n.b(((Activity)paramContext).getWindow());
    AppMethodBeat.o(132890);
  }

  public final c aMb()
  {
    AppMethodBeat.i(132891);
    c localc = super.aMb();
    n.a(localc.getWindow(), this.iFB);
    AppMethodBeat.o(132891);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.b
 * JD-Core Version:    0.6.2
 */