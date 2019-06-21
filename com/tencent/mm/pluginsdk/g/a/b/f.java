package com.tencent.mm.pluginsdk.g.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class f extends IOException
{
  public final int httpStatusCode;
  public final IOException veV;

  public f(int paramInt, IOException paramIOException)
  {
    this.httpStatusCode = paramInt;
    this.veV = paramIOException;
  }

  public final String toString()
  {
    AppMethodBeat.i(79566);
    String str = "UnknownConnectionError{httpStatusCode=" + this.httpStatusCode + ", realException=" + this.veV + '}';
    AppMethodBeat.o(79566);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.b.f
 * JD-Core Version:    0.6.2
 */