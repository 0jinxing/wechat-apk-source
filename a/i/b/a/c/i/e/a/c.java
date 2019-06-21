package a.i.b.a.c.i.e.a;

import a.f.b.j;
import a.i.b.a.c.b.e;
import a.i.b.a.c.l.ad;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
  implements d, g
{
  private final c BGv;
  private final e BGw;
  private final e BGx;

  public c(e parame)
  {
    AppMethodBeat.i(122236);
    this.BGx = parame;
    this.BGv = this;
    this.BGw = this.BGx;
    AppMethodBeat.o(122236);
  }

  private ad ebq()
  {
    AppMethodBeat.i(122231);
    ad localad = this.BGx.dZf();
    j.o(localad, "classDescriptor.defaultType");
    AppMethodBeat.o(122231);
    return localad;
  }

  public final e dZR()
  {
    return this.BGx;
  }

  public final boolean equals(Object paramObject)
  {
    Object localObject = null;
    AppMethodBeat.i(122233);
    e locale = this.BGx;
    if (!(paramObject instanceof c))
      paramObject = null;
    while (true)
    {
      c localc = (c)paramObject;
      paramObject = localObject;
      if (localc != null)
        paramObject = localc.BGx;
      boolean bool = j.j(locale, paramObject);
      AppMethodBeat.o(122233);
      return bool;
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(122234);
    int i = this.BGx.hashCode();
    AppMethodBeat.o(122234);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(122235);
    String str = "Class{" + ebq() + '}';
    AppMethodBeat.o(122235);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.a.c
 * JD-Core Version:    0.6.2
 */