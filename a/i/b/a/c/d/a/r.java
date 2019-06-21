package a.i.b.a.c.d.a;

import a.f.b.j;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r
{
  final f BgZ;
  final String signature;

  public r(f paramf, String paramString)
  {
    AppMethodBeat.i(119719);
    this.BgZ = paramf;
    this.signature = paramString;
    AppMethodBeat.o(119719);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(119722);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof r))
      {
        paramObject = (r)paramObject;
        if ((!j.j(this.BgZ, paramObject.BgZ)) || (!j.j(this.signature, paramObject.signature)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(119722);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119722);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(119721);
    Object localObject = this.BgZ;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.signature;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(119721);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(119720);
    String str = "NameAndSignature(name=" + this.BgZ + ", signature=" + this.signature + ")";
    AppMethodBeat.o(119720);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.r
 * JD-Core Version:    0.6.2
 */