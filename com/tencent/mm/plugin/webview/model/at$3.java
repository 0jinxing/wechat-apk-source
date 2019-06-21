package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class at$3
  implements Runnable
{
  at$3(d.a parama, at.a parama1, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6804);
    ab.i("MicroMsg.WebviewShrotcutManager", "expired");
    if (at.XC().contains(this.unC))
    {
      at.XC().remove(this.unC);
      o.acd().b(this.unC);
      if (this.unA != null)
        this.unA.hJ(false);
    }
    AppMethodBeat.o(6804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.at.3
 * JD-Core Version:    0.6.2
 */