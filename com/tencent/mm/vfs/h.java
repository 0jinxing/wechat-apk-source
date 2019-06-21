package com.tencent.mm.vfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStreamWriter;

public final class h extends OutputStreamWriter
{
  public h(b paramb)
  {
    super(e.a(paramb.mUri, paramb.dMA(), false));
    AppMethodBeat.i(54668);
    AppMethodBeat.o(54668);
  }

  public h(String paramString)
  {
    super(e.L(paramString, false));
    AppMethodBeat.i(54667);
    AppMethodBeat.o(54667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.h
 * JD-Core Version:    0.6.2
 */