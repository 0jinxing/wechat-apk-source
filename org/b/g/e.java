package org.b.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class e
{
  public static String T(InputStream paramInputStream)
  {
    AppMethodBeat.i(77314);
    d.r(paramInputStream, "Cannot get String from a null object");
    try
    {
      char[] arrayOfChar = new char[65536];
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localInputStreamReader.<init>(paramInputStream, "UTF-8");
      int i;
      do
      {
        i = localInputStreamReader.read(arrayOfChar, 0, 65536);
        if (i > 0)
          localStringBuilder.append(arrayOfChar, 0, i);
      }
      while (i >= 0);
      localInputStreamReader.close();
      paramInputStream = localStringBuilder.toString();
      AppMethodBeat.o(77314);
      return paramInputStream;
    }
    catch (IOException paramInputStream)
    {
      paramInputStream = new IllegalStateException("Error while reading response body", paramInputStream);
      AppMethodBeat.o(77314);
    }
    throw paramInputStream;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.b.g.e
 * JD-Core Version:    0.6.2
 */