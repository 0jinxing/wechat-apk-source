package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class b$1
  implements Runnable
{
  b$1(b paramb, String paramString1, b.i parami, String paramString2, b.l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(77315);
    Object localObject = this.fqi.pB(this.cia);
    if (localObject != null)
    {
      this.fqg.x((Bitmap)localObject);
      ab.d("MicroMsg.AppBrandSimpleImageLoader", "load already cached, url %s, bitmap %s", new Object[] { this.val$url, localObject });
      AppMethodBeat.o(77315);
    }
    while (true)
    {
      return;
      localObject = this.fqh.abY();
      b.a(this.fqi).put(this.fqg, localObject);
      b.b(this.fqi).put(localObject, this.fqg);
      this.fqg.abU();
      localObject = this.fqh;
      b.d(((b.l)localObject).fqu).f(new b.l.2((b.l)localObject));
      AppMethodBeat.o(77315);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.1
 * JD-Core Version:    0.6.2
 */