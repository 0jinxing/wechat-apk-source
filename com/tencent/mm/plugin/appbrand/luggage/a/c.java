package com.tencent.mm.plugin.appbrand.luggage.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.canvas.e.a;
import com.tencent.mm.plugin.appbrand.d.a;
import com.tencent.mm.plugin.appbrand.d.b;

public final class c
  implements e
{
  public final Bitmap a(d paramd, String paramString)
  {
    AppMethodBeat.i(132092);
    paramd = a(paramd, paramString, null);
    AppMethodBeat.o(132092);
    return paramd;
  }

  public final Bitmap a(d paramd, String paramString, Rect paramRect, e.a parama)
  {
    AppMethodBeat.i(132094);
    com.tencent.mm.plugin.appbrand.jsapi.c localc = paramd.hcM;
    String str = ((b)localc.B(b.class)).b(localc, paramString);
    paramd = ((a)localc.B(a.class)).a(str, paramRect, new c.1(this, parama, paramd, paramString));
    AppMethodBeat.o(132094);
    return paramd;
  }

  public final Bitmap a(d paramd, String paramString, e.a parama)
  {
    AppMethodBeat.i(132093);
    paramd = a(paramd, paramString, null, parama);
    AppMethodBeat.o(132093);
    return paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.a.c
 * JD-Core Version:    0.6.2
 */