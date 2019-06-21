package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;
import com.tencent.mm.plugin.appbrand.widget.input.i;
import com.tencent.mm.plugin.appbrand.widget.input.l;
import java.lang.ref.WeakReference;

final class h$5
  implements Runnable
{
  h$5(h paramh, WeakReference paramWeakReference, i parami, e parame, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123549);
    Object localObject1 = (u)this.hKr.get();
    if ((localObject1 == null) || (((u)localObject1).aJz() == null))
      AppMethodBeat.o(123549);
    while (true)
    {
      return;
      localObject1 = this.hKp;
      Object localObject2 = this.hKA;
      int i = this.hKB;
      int j = this.hKC;
      ((i)localObject1).jdS = ((e)localObject2);
      localObject2 = (u)((e)localObject2).jdm.get();
      if (localObject2 != null)
        new l((u)localObject2);
      ((i)localObject1).ds(i, j);
      AppMethodBeat.o(123549);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.h.5
 * JD-Core Version:    0.6.2
 */