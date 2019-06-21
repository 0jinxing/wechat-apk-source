package a.i.b.a.c.n;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public final int BNi;
  public final String tTc;

  public f(String paramString, int paramInt)
  {
    AppMethodBeat.i(122940);
    this.tTc = paramString;
    this.BNi = paramInt;
    AppMethodBeat.o(122940);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(122943);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof f))
        break label69;
      paramObject = (f)paramObject;
      if (!j.j(this.tTc, paramObject.tTc))
        break label69;
      if (this.BNi == paramObject.BNi)
      {
        i = 1;
        if (i == 0)
          break label69;
      }
    }
    else
    {
      AppMethodBeat.o(122943);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label69: AppMethodBeat.o(122943);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(122942);
    String str = this.tTc;
    if (str != null);
    for (int i = str.hashCode(); ; i = 0)
    {
      int j = this.BNi;
      AppMethodBeat.o(122942);
      return i * 31 + j;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122941);
    String str = "NumberWithRadix(number=" + this.tTc + ", radix=" + this.BNi + ")";
    AppMethodBeat.o(122941);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.f
 * JD-Core Version:    0.6.2
 */