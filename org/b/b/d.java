package org.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends b
{
  public d(String paramString, Exception paramException)
  {
    super(String.format("Error while signing string: %s", new Object[] { paramString }), paramException);
    AppMethodBeat.i(77236);
    AppMethodBeat.o(77236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.b.b.d
 * JD-Core Version:    0.6.2
 */