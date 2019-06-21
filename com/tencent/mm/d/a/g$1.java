package com.tencent.mm.d.a;

import com.eclipsesource.v8.ILoadLibraryDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements ILoadLibraryDelegate
{
  public final void loadLibrary(String paramString)
  {
    AppMethodBeat.i(113799);
    k.a("mmv8", i.class.getClassLoader());
    k.a("node", i.class.getClassLoader());
    k.a("j2v8", i.class.getClassLoader());
    ab.i("MicroMsg.JSRuntimeCreator", "load so done");
    AppMethodBeat.o(113799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.g.1
 * JD-Core Version:    0.6.2
 */