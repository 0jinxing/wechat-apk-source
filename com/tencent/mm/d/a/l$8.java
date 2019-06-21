package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class l$8
  implements Runnable
{
  public l$8(l paraml, String paramString1, l.b paramb, String paramString2, String paramString3, String paramString4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113842);
    ab.d("MicroMsg.J2V8.V8ContextEngine", "eval script(%s) with code cache", new Object[] { this.chY });
    Object localObject;
    if (this.chX != null)
    {
      localObject = this.chT.CB().executeScript(this.bOU, this.chY, 0, this.chZ, this.cia);
      l.b localb = this.chX;
      if (localObject == null)
      {
        localObject = null;
        localb.ds((String)localObject);
        AppMethodBeat.o(113842);
      }
    }
    while (true)
    {
      return;
      localObject = localObject.toString();
      break;
      this.chT.CB().executeVoidScript(this.bOU, this.chY, 0, this.chZ, this.cia);
      AppMethodBeat.o(113842);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.l.8
 * JD-Core Version:    0.6.2
 */