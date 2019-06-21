package com.tencent.mm.plugin.websearch.widget.view;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.widget.f;
import com.tencent.mm.plugin.websearch.widget.view.footer.a.a;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.List;

final class b$1
  implements a.a
{
  b$1(b paramb)
  {
  }

  public final void cWf()
  {
    AppMethodBeat.i(91512);
    List localList = this.uef.udX.cVW();
    if ((localList == null) || (localList.isEmpty()) || (localList.size() == 1))
      AppMethodBeat.o(91512);
    while (true)
    {
      return;
      f.a(1, this.uef.udY, null);
      this.uef.udW = ((h)g.K(h.class)).a(this.uef.hwd, ah.getContext().getString(2131305957), "", localList, new b.1.1(this));
      AppMethodBeat.o(91512);
    }
  }

  public final void cWg()
  {
    AppMethodBeat.i(91513);
    this.uef.mJs.cUT();
    AppMethodBeat.o(91513);
  }

  public final void cWh()
  {
    AppMethodBeat.i(91514);
    this.uef.mJs.cUU();
    AppMethodBeat.o(91514);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(91517);
    int i = this.uef.udX.cVV();
    AppMethodBeat.o(91517);
    return i;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(91515);
    boolean bool = this.uef.udX.hasNext();
    AppMethodBeat.o(91515);
    return bool;
  }

  public final boolean hasPrevious()
  {
    AppMethodBeat.i(91516);
    boolean bool = this.uef.udX.cVX();
    AppMethodBeat.o(91516);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b.1
 * JD-Core Version:    0.6.2
 */