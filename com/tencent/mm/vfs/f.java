package com.tencent.mm.vfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterOutputStream;

public final class f extends FilterOutputStream
{
  public f(b paramb)
  {
    super(e.a(paramb.mUri, paramb.dMA(), false));
    AppMethodBeat.i(54664);
    AppMethodBeat.o(54664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.f
 * JD-Core Version:    0.6.2
 */