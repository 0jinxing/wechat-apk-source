package org.apache.commons.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.io.Writer;

public final class b extends Writer
  implements Serializable
{
  private final StringBuilder BWD;

  public b()
  {
    AppMethodBeat.i(136502);
    this.BWD = new StringBuilder();
    AppMethodBeat.o(136502);
  }

  public b(byte paramByte)
  {
    AppMethodBeat.i(136503);
    this.BWD = new StringBuilder(4);
    AppMethodBeat.o(136503);
  }

  public final Writer append(char paramChar)
  {
    AppMethodBeat.i(136504);
    this.BWD.append(paramChar);
    AppMethodBeat.o(136504);
    return this;
  }

  public final Writer append(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(136505);
    this.BWD.append(paramCharSequence);
    AppMethodBeat.o(136505);
    return this;
  }

  public final Writer append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136506);
    this.BWD.append(paramCharSequence, paramInt1, paramInt2);
    AppMethodBeat.o(136506);
    return this;
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final String toString()
  {
    AppMethodBeat.i(136509);
    String str = this.BWD.toString();
    AppMethodBeat.o(136509);
    return str;
  }

  public final void write(String paramString)
  {
    AppMethodBeat.i(136507);
    if (paramString != null)
      this.BWD.append(paramString);
    AppMethodBeat.o(136507);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136508);
    if (paramArrayOfChar != null)
      this.BWD.append(paramArrayOfChar, paramInt1, paramInt2);
    AppMethodBeat.o(136508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.apache.commons.a.a.b
 * JD-Core Version:    0.6.2
 */