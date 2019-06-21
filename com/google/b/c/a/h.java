package com.google.b.c.a;

import com.google.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;

final class h
{
  final String bzH;
  l bzI;
  b bzJ;
  b bzK;
  final StringBuilder bzL;
  int bzM;
  k bzN;
  int bzO;
  int pos;

  h(String paramString)
  {
    AppMethodBeat.i(57207);
    byte[] arrayOfByte = paramString.getBytes(Charset.forName("ISO-8859-1"));
    StringBuilder localStringBuilder = new StringBuilder(arrayOfByte.length);
    int i = 0;
    int j = arrayOfByte.length;
    while (i < j)
    {
      char c = (char)(arrayOfByte[i] & 0xFF);
      if ((c == '?') && (paramString.charAt(i) != '?'))
      {
        paramString = new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
        AppMethodBeat.o(57207);
        throw paramString;
      }
      localStringBuilder.append(c);
      i++;
    }
    this.bzH = localStringBuilder.toString();
    this.bzI = l.bAd;
    this.bzL = new StringBuilder(paramString.length());
    this.bzM = -1;
    AppMethodBeat.o(57207);
  }

  private int vz()
  {
    AppMethodBeat.i(57212);
    int i = this.bzH.length();
    int j = this.bzO;
    AppMethodBeat.o(57212);
    return i - j;
  }

  public final void bi(String paramString)
  {
    AppMethodBeat.i(57209);
    this.bzL.append(paramString);
    AppMethodBeat.o(57209);
  }

  public final void d(char paramChar)
  {
    AppMethodBeat.i(57210);
    this.bzL.append(paramChar);
    AppMethodBeat.o(57210);
  }

  public final void fF(int paramInt)
  {
    AppMethodBeat.i(57215);
    if ((this.bzN == null) || (paramInt > this.bzN.bzW))
      this.bzN = k.a(paramInt, this.bzI, this.bzJ, this.bzK);
    AppMethodBeat.o(57215);
  }

  public final int vA()
  {
    AppMethodBeat.i(57213);
    int i = vz();
    int j = this.pos;
    AppMethodBeat.o(57213);
    return i - j;
  }

  public final void vB()
  {
    AppMethodBeat.i(57214);
    fF(this.bzL.length());
    AppMethodBeat.o(57214);
  }

  public final char vx()
  {
    AppMethodBeat.i(57208);
    char c = this.bzH.charAt(this.pos);
    AppMethodBeat.o(57208);
    return c;
  }

  public final boolean vy()
  {
    AppMethodBeat.i(57211);
    boolean bool;
    if (this.pos < vz())
    {
      bool = true;
      AppMethodBeat.o(57211);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.h
 * JD-Core Version:    0.6.2
 */