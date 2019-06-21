package com.tencent.mm.vfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStreamReader;

public final class g extends InputStreamReader
{
  public g(b paramb)
  {
    super(e.b(paramb.mUri, paramb.dMA()));
    AppMethodBeat.i(54666);
    AppMethodBeat.o(54666);
  }

  public g(String paramString)
  {
    super(e.openRead(paramString));
    AppMethodBeat.i(54665);
    AppMethodBeat.o(54665);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.g
 * JD-Core Version:    0.6.2
 */