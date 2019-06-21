package org.apache.commons.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements Cloneable
{
  private String BYC;
  protected char[] aLx;
  protected int size;

  public a()
  {
    this(32);
  }

  public a(int paramInt)
  {
    AppMethodBeat.i(116965);
    int i = paramInt;
    if (paramInt <= 0)
      i = 32;
    this.aLx = new char[i];
    AppMethodBeat.o(116965);
  }

  private a Vm(int paramInt)
  {
    AppMethodBeat.i(116966);
    if (paramInt > this.aLx.length)
    {
      char[] arrayOfChar = this.aLx;
      this.aLx = new char[paramInt * 2];
      System.arraycopy(arrayOfChar, 0, this.aLx, 0, this.size);
    }
    AppMethodBeat.o(116966);
    return this;
  }

  public final a awR(String paramString)
  {
    AppMethodBeat.i(116968);
    if (paramString == null)
    {
      paramString = emT();
      AppMethodBeat.o(116968);
    }
    while (true)
    {
      return paramString;
      int i = paramString.length();
      if (i > 0)
      {
        int j = this.size;
        Vm(j + i);
        paramString.getChars(0, i, this.aLx, j);
        this.size = (i + this.size);
      }
      AppMethodBeat.o(116968);
      paramString = this;
    }
  }

  public final Object clone()
  {
    AppMethodBeat.i(116971);
    a locala = (a)super.clone();
    locala.aLx = new char[this.aLx.length];
    System.arraycopy(this.aLx, 0, locala.aLx, 0, this.aLx.length);
    AppMethodBeat.o(116971);
    return locala;
  }

  public final a emT()
  {
    AppMethodBeat.i(116967);
    a locala;
    if (this.BYC == null)
    {
      AppMethodBeat.o(116967);
      locala = this;
    }
    while (true)
    {
      return locala;
      locala = awR(this.BYC);
      AppMethodBeat.o(116967);
    }
  }

  public final a emU()
  {
    AppMethodBeat.i(116969);
    Vm(this.size + 1);
    char[] arrayOfChar = this.aLx;
    int i = this.size;
    this.size = (i + 1);
    arrayOfChar[i] = ((char)35);
    AppMethodBeat.o(116969);
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    Object localObject;
    if ((paramObject instanceof a))
    {
      localObject = (a)paramObject;
      if (this == localObject)
        break label84;
      if (this.size == ((a)localObject).size)
        break label39;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label39: paramObject = this.aLx;
      localObject = ((a)localObject).aLx;
      for (int i = this.size - 1; ; i--)
      {
        if (i < 0)
          break label84;
        bool2 = bool1;
        if (paramObject[i] != localObject[i])
          break;
      }
      label84: bool2 = true;
    }
  }

  public final int hashCode()
  {
    char[] arrayOfChar = this.aLx;
    int i = 0;
    for (int j = this.size - 1; j >= 0; j--)
      i = i * 31 + arrayOfChar[j];
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(116970);
    String str = new String(this.aLx, 0, this.size);
    AppMethodBeat.o(116970);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.b.a
 * JD-Core Version:    0.6.2
 */