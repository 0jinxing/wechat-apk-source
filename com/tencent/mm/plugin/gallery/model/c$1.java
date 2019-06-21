package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21223);
    Object localObject = c.a(this.mNz);
    if (((d)localObject).mNG != null)
    {
      localObject = ((d)localObject).mNG;
      if (((f)localObject).dirty)
      {
        ((f)localObject).dirty = false;
        ((f)localObject).bCi();
        ((f)localObject).bCj();
        ((f)localObject).wl(-1);
        ((f)localObject).bCl();
      }
    }
    AppMethodBeat.o(21223);
  }

  public final String toString()
  {
    AppMethodBeat.i(21224);
    String str = super.toString() + "|tryStartDocode";
    AppMethodBeat.o(21224);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.c.1
 * JD-Core Version:    0.6.2
 */