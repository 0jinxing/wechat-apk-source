package com.tencent.mm.plugin.scanner.a;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.a;
import com.tencent.mm.plugin.scanner.util.e;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.b.c;

public final class b
{
  Activity mActivity;
  String pZu;
  e pZv;
  a pZw;
  e.a pZx;
  public c pZy;
  public c pZz;

  public b()
  {
    AppMethodBeat.i(80829);
    this.pZx = new b.1(this);
    this.pZy = new b.2(this);
    this.pZz = new b.3(this);
    AppMethodBeat.o(80829);
  }

  public final void cgE()
  {
    AppMethodBeat.i(80830);
    if (this.pZv != null)
    {
      this.pZv.chU();
      this.pZv = null;
    }
    this.mActivity = null;
    this.pZu = null;
    AppMethodBeat.o(80830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.b
 * JD-Core Version:    0.6.2
 */