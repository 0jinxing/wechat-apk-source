package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class a$c
{
  final long[] axL;
  File[] axM;
  File[] axN;
  boolean axO;
  a.b axP;
  long axQ;
  final String key;

  private a$c(a parama, String paramString)
  {
    AppMethodBeat.i(51800);
    this.key = paramString;
    this.axL = new long[a.f(parama)];
    this.axM = new File[a.f(parama)];
    this.axN = new File[a.f(parama)];
    paramString = new StringBuilder(paramString).append('.');
    int i = paramString.length();
    for (int j = 0; j < a.f(parama); j++)
    {
      paramString.append(j);
      this.axM[j] = new File(a.g(parama), paramString.toString());
      paramString.append(".tmp");
      this.axN[j] = new File(a.g(parama), paramString.toString());
      paramString.setLength(i);
    }
    AppMethodBeat.o(51800);
  }

  private static IOException d(String[] paramArrayOfString)
  {
    AppMethodBeat.i(51803);
    paramArrayOfString = new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
    AppMethodBeat.o(51803);
    throw paramArrayOfString;
  }

  final void c(String[] paramArrayOfString)
  {
    AppMethodBeat.i(51802);
    if (paramArrayOfString.length != a.f(this.axH))
    {
      paramArrayOfString = d(paramArrayOfString);
      AppMethodBeat.o(51802);
      throw paramArrayOfString;
    }
    int i = 0;
    try
    {
      while (i < paramArrayOfString.length)
      {
        this.axL[i] = Long.parseLong(paramArrayOfString[i]);
        i++;
      }
      AppMethodBeat.o(51802);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      paramArrayOfString = d(paramArrayOfString);
      AppMethodBeat.o(51802);
    }
    throw paramArrayOfString;
  }

  public final String lR()
  {
    AppMethodBeat.i(51801);
    StringBuilder localStringBuilder = new StringBuilder();
    for (long l : this.axL)
      localStringBuilder.append(' ').append(l);
    ??? = localStringBuilder.toString();
    AppMethodBeat.o(51801);
    return ???;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.a.c
 * JD-Core Version:    0.6.2
 */