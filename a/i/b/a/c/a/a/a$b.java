package a.i.b.a.c.a.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b
{
  final int AVt;
  final b.b BcJ;

  public a$b(b.b paramb, int paramInt)
  {
    AppMethodBeat.i(119126);
    this.BcJ = paramb;
    this.AVt = paramInt;
    AppMethodBeat.o(119126);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(119129);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof b))
        break label69;
      paramObject = (b)paramObject;
      if (!j.j(this.BcJ, paramObject.BcJ))
        break label69;
      if (this.AVt == paramObject.AVt)
      {
        i = 1;
        if (i == 0)
          break label69;
      }
    }
    else
    {
      AppMethodBeat.o(119129);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label69: AppMethodBeat.o(119129);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(119128);
    b.b localb = this.BcJ;
    if (localb != null);
    for (int i = localb.hashCode(); ; i = 0)
    {
      int j = this.AVt;
      AppMethodBeat.o(119128);
      return i * 31 + j;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(119127);
    String str = "KindWithArity(kind=" + this.BcJ + ", arity=" + this.AVt + ")";
    AppMethodBeat.o(119127);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.a.b
 * JD-Core Version:    0.6.2
 */