package com.tencent.mm.plugin.appbrand.b;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.c;
import com.tencent.mm.d.a.l;
import com.tencent.mm.d.a.t;
import com.tencent.mm.plugin.appbrand.h.r;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class d$d extends h
{
  d$d(d paramd, i parami)
  {
    super(parami);
  }

  public final void enter()
  {
    AppMethodBeat.i(86858);
    super.enter();
    Object localObject = d.d(this.gWL);
    if (localObject != null)
    {
      ((r)localObject).resume();
      localObject = this.gWL.gPI.xT().gPJ.gQj.ciF.values().iterator();
      while (((Iterator)localObject).hasNext())
        ((l)((Iterator)localObject).next()).chO.resume();
    }
    AppMethodBeat.o(86858);
  }

  public final void exit()
  {
    AppMethodBeat.i(86859);
    super.exit();
    AppMethodBeat.o(86859);
  }

  public final String getName()
  {
    AppMethodBeat.i(86856);
    String str = this.gWL.mName + "|Foreground";
    AppMethodBeat.o(86856);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    AppMethodBeat.i(86857);
    boolean bool;
    switch (paramMessage.what)
    {
    default:
      bool = super.k(paramMessage);
      AppMethodBeat.o(86857);
    case 1:
    }
    while (true)
    {
      return bool;
      d.a(this.gWL, this.gWL.gWC);
      bool = true;
      AppMethodBeat.o(86857);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.d.d
 * JD-Core Version:    0.6.2
 */