package com.tencent.mm.plugin.profile.ui.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import java.lang.ref.WeakReference;

public final class a
  implements d.a
{
  private WeakReference<d.a> bSI;

  public a(d.a parama)
  {
    AppMethodBeat.i(23960);
    this.bSI = new WeakReference(parama);
    AppMethodBeat.o(23960);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(23961);
    if (this.bSI.get() != null)
      ((d.a)this.bSI.get()).qj(paramString);
    AppMethodBeat.o(23961);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.b.a
 * JD-Core Version:    0.6.2
 */