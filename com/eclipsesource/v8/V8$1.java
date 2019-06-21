package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class V8$1
  implements ILoadLibraryDelegate
{
  public final void loadLibrary(String paramString)
  {
    AppMethodBeat.i(75160);
    LibraryLoader.loadLibrary(paramString);
    AppMethodBeat.o(75160);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8.1
 * JD-Core Version:    0.6.2
 */