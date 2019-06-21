package a.i.b.a.c.d.a.c.b;

import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.d.a.a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  final l BoW;
  final b BoX;
  final boolean BoY;
  final ar BoZ;

  private a(l paraml, b paramb, boolean paramBoolean, ar paramar)
  {
    AppMethodBeat.i(120023);
    this.BoW = paraml;
    this.BoX = paramb;
    this.BoY = paramBoolean;
    this.BoZ = paramar;
    AppMethodBeat.o(120023);
  }

  public final a a(b paramb)
  {
    AppMethodBeat.i(120022);
    j.p(paramb, "flexibility");
    l locall = this.BoW;
    boolean bool = this.BoY;
    ar localar = this.BoZ;
    j.p(locall, "howThisTypeIsUsed");
    j.p(paramb, "flexibility");
    paramb = new a(locall, paramb, bool, localar);
    AppMethodBeat.o(120022);
    return paramb;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(120027);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label97;
      paramObject = (a)paramObject;
      if ((!j.j(this.BoW, paramObject.BoW)) || (!j.j(this.BoX, paramObject.BoX)))
        break label97;
      if (this.BoY == paramObject.BoY)
      {
        i = 1;
        if ((i == 0) || (!j.j(this.BoZ, paramObject.BoZ)))
          break label97;
      }
    }
    else
    {
      AppMethodBeat.o(120027);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label97: AppMethodBeat.o(120027);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(120026);
    Object localObject = this.BoW;
    int j;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.BoX;
      if (localObject == null)
        break label97;
    }
    label97: for (int k = localObject.hashCode(); ; k = 0)
    {
      int m = this.BoY;
      int n = m;
      if (m != 0)
        n = 1;
      localObject = this.BoZ;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(120026);
      return (n + (k + j * 31) * 31) * 31 + i;
      j = 0;
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(120025);
    String str = "JavaTypeAttributes(howThisTypeIsUsed=" + this.BoW + ", flexibility=" + this.BoX + ", isForAnnotationParameter=" + this.BoY + ", upperBoundOfTypeParameter=" + this.BoZ + ")";
    AppMethodBeat.o(120025);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.a
 * JD-Core Version:    0.6.2
 */