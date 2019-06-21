package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class e
{
  public static final boolean a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(125683);
    int i = 0;
    while (true)
    {
      if (i >= paramInt)
      {
        bool = true;
        AppMethodBeat.o(125683);
      }
      int j;
      while (true)
      {
        return bool;
        j = paramInputStream.read(paramArrayOfByte, i + 0, paramInt - i);
        if (j >= 0)
          break;
        AppMethodBeat.o(125683);
      }
      i += j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.e
 * JD-Core Version:    0.6.2
 */