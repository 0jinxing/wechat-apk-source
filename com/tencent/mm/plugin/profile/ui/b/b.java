package com.tencent.mm.plugin.profile.ui.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import java.lang.ref.WeakReference;

public final class b
  implements n.b
{
  private WeakReference<n.b> bSI;

  public b(n.b paramb)
  {
    AppMethodBeat.i(23962);
    this.bSI = new WeakReference(paramb);
    AppMethodBeat.o(23962);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(23963);
    if (this.bSI.get() != null)
      ((n.b)this.bSI.get()).a(paramInt, paramn, paramObject);
    AppMethodBeat.o(23963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.b.b
 * JD-Core Version:    0.6.2
 */