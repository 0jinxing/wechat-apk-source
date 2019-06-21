package com.tencent.luggage.sdk.b;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.a.a;
import com.tencent.mm.plugin.appbrand.config.a.a.b;

final class a$2
  implements a.a
{
  a$2(a parama)
  {
  }

  public final void a(a.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(101683);
    d.i("Luggage.AppBrandRuntimeContainerLU", "onOrientationChanged");
    if (!paramBoolean)
      if (paramb != null)
        break label44;
    label44: for (paramb = "null"; ; paramb = paramb.name())
    {
      d.e("Luggage.AppBrandRuntimeContainerLU", "OnOrientationChanged failure  ret:[%s]", new Object[] { paramb });
      AppMethodBeat.o(101683);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.b.a.2
 * JD-Core Version:    0.6.2
 */