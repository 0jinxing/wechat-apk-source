package a.i.b.a.c.d.b;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q
{
  public static final q.a BrI;
  final String signature;

  static
  {
    AppMethodBeat.i(120296);
    BrI = new q.a((byte)0);
    AppMethodBeat.o(120296);
  }

  private q(String paramString)
  {
    this.signature = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(120299);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof q))
      {
        paramObject = (q)paramObject;
        if (!j.j(this.signature, paramObject.signature));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(120299);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120299);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(120298);
    String str = this.signature;
    int i;
    if (str != null)
    {
      i = str.hashCode();
      AppMethodBeat.o(120298);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(120298);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(120297);
    String str = "MemberSignature(signature=" + this.signature + ")";
    AppMethodBeat.o(120297);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.q
 * JD-Core Version:    0.6.2
 */