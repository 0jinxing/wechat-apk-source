package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class b$1 extends ByteArrayOutputStream
{
  b$1(b paramb, int paramInt)
  {
    super(paramInt);
  }

  public final String toString()
  {
    AppMethodBeat.i(51804);
    int i;
    if ((this.count > 0) && (this.buf[(this.count - 1)] == 13))
      i = this.count - 1;
    try
    {
      while (true)
      {
        String str = new String(this.buf, 0, i, this.axS.axR.name());
        AppMethodBeat.o(51804);
        return str;
        i = this.count;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      AssertionError localAssertionError = new AssertionError(localUnsupportedEncodingException);
      AppMethodBeat.o(51804);
      throw localAssertionError;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.b.1
 * JD-Core Version:    0.6.2
 */