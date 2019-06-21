package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;
import java.util.Arrays;

public final class k extends l
{
  private final char[] aLL;

  private k(char[] paramArrayOfChar)
  {
    this.aLL = paramArrayOfChar;
  }

  public static k du(int paramInt)
  {
    AppMethodBeat.i(70605);
    if (paramInt < 0)
    {
      localObject = new IllegalArgumentException("number is negative");
      AppMethodBeat.o(70605);
      throw ((Throwable)localObject);
    }
    Object localObject = new char[paramInt];
    Arrays.fill((char[])localObject, ' ');
    localObject = new k((char[])localObject);
    AppMethodBeat.o(70605);
    return localObject;
  }

  protected final i a(Writer paramWriter)
  {
    AppMethodBeat.i(70606);
    paramWriter = new k.a(paramWriter, this.aLL, (byte)0);
    AppMethodBeat.o(70606);
    return paramWriter;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.k
 * JD-Core Version:    0.6.2
 */