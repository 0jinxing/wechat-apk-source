package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$a
{
  private final byte[] aLv;

  public e$a()
  {
    AppMethodBeat.i(70533);
    this.aLv = new byte[32];
    AppMethodBeat.o(70533);
  }

  private int ab(Object paramObject)
  {
    AppMethodBeat.i(70536);
    int i = paramObject.hashCode();
    int j = this.aLv.length;
    AppMethodBeat.o(70536);
    return i & j - 1;
  }

  final int get(Object paramObject)
  {
    AppMethodBeat.i(70535);
    int i = ab(paramObject);
    i = this.aLv[i];
    AppMethodBeat.o(70535);
    return (i & 0xFF) - 1;
  }

  final void h(String paramString, int paramInt)
  {
    AppMethodBeat.i(70534);
    int i = ab(paramString);
    if (paramInt < 255)
    {
      this.aLv[i] = ((byte)(byte)(paramInt + 1));
      AppMethodBeat.o(70534);
    }
    while (true)
    {
      return;
      this.aLv[i] = ((byte)0);
      AppMethodBeat.o(70534);
    }
  }

  public final void remove(int paramInt)
  {
    int i = 0;
    if (i < this.aLv.length)
    {
      if (this.aLv[i] == paramInt + 1)
        this.aLv[i] = ((byte)0);
      while (true)
      {
        i++;
        break;
        if (this.aLv[i] > paramInt + 1)
        {
          byte[] arrayOfByte = this.aLv;
          arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] - 1));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.e.a
 * JD-Core Version:    0.6.2
 */