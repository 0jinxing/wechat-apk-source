package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f.a;
import com.tencent.mm.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class b$c$1 extends h<String, Reference<Bitmap>>
{
  private final Map<Reference<Bitmap>, Integer> fqp;

  b$c$1(b.c paramc)
  {
    super(31457280);
    AppMethodBeat.i(77324);
    this.fqp = new ConcurrentHashMap();
    AppMethodBeat.o(77324);
  }

  public final void a(f.a<String, Reference<Bitmap>> parama)
  {
    AppMethodBeat.i(77326);
    ab.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear(OnClearListener)");
    super.a(parama);
    this.fqp.clear();
    AppMethodBeat.o(77326);
  }

  public final void clear()
  {
    AppMethodBeat.i(77325);
    ab.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "clear");
    super.clear();
    this.fqp.clear();
    AppMethodBeat.o(77325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.c.1
 * JD-Core Version:    0.6.2
 */