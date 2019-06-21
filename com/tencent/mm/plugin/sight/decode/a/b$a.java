package com.tencent.mm.plugin.sight.decode.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.g.a.tn.a;
import com.tencent.mm.sdk.b.c;
import java.lang.ref.WeakReference;

final class b$a extends c<tn>
{
  int mik;
  int qxY;
  int qxZ;
  WeakReference<b> qya;

  public b$a(b paramb)
  {
    super(0);
    AppMethodBeat.i(70229);
    this.qxY = 0;
    this.qxZ = 0;
    this.mik = 0;
    this.qya = new WeakReference(paramb);
    this.xxI = tn.class.getName().hashCode();
    AppMethodBeat.o(70229);
  }

  private void a(tn paramtn)
  {
    this.qxY = paramtn.cPI.cPL;
    this.qxZ = paramtn.cPI.cPJ;
    this.mik = paramtn.cPI.cPK;
  }

  private boolean clg()
  {
    AppMethodBeat.i(70230);
    boolean bool;
    if (this.qya.get() == null)
    {
      AppMethodBeat.o(70230);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = b.E((b)this.qya.get()) + this.qxY;
      if ((i < this.qxZ) || (i > this.mik))
      {
        AppMethodBeat.o(70230);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(70230);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.a
 * JD-Core Version:    0.6.2
 */