package a.i.b.a.c.d.b;

import a.f.b.j;
import a.i.b.a.c.b.an;
import a.i.b.a.c.e.a.s;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.b.a.g;
import a.i.b.a.c.f.a;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.j.a.a.e;
import a.i.b.a.c.j.a.o;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
  implements e
{
  private final boolean BrA;
  final n BrB;
  public final a.i.b.a.c.i.d.b Brx;
  public final a.i.b.a.c.i.d.b Bry;
  private final o<g> Brz;
  private final String gTy;

  public i(n paramn, a.s params, c paramc, o<g> paramo, boolean paramBoolean)
  {
  }

  private i(a.i.b.a.c.i.d.b paramb1, a.i.b.a.c.i.d.b paramb2, a.s params, c paramc, o<g> paramo, boolean paramBoolean, n paramn)
  {
    AppMethodBeat.i(120271);
    this.Brx = paramb1;
    this.Bry = paramb2;
    this.Brz = paramo;
    this.BrA = paramBoolean;
    this.BrB = paramn;
    paramb1 = (i.c)params;
    paramb2 = a.i.b.a.c.e.b.b.BxK;
    j.o(paramb2, "JvmProtoBuf.packageModuleName");
    paramb1 = (Integer)a.i.b.a.c.e.a.f.a(paramb1, paramb2);
    if (paramb1 != null)
    {
      paramb2 = paramc.getString(((Number)paramb1).intValue());
      paramb1 = paramb2;
      if (paramb2 != null);
    }
    else
    {
      paramb1 = "main";
    }
    this.gTy = paramb1;
    AppMethodBeat.o(120271);
  }

  public final a dWY()
  {
    AppMethodBeat.i(120268);
    a locala = new a(this.Brx.ejz(), ect());
    AppMethodBeat.o(120268);
    return locala;
  }

  public final an dXz()
  {
    AppMethodBeat.i(120270);
    an localan = an.BeS;
    j.o(localan, "SourceFile.NO_SOURCE_FILE");
    AppMethodBeat.o(120270);
    return localan;
  }

  public final a.i.b.a.c.f.f ect()
  {
    AppMethodBeat.i(120267);
    Object localObject = this.Brx.BrD;
    j.o(localObject, "className.internalName");
    localObject = a.i.b.a.c.f.f.avX(m.a((String)localObject, '/'));
    j.o(localObject, "Name.identifier(classNam….substringAfterLast('/'))");
    AppMethodBeat.o(120267);
    return localObject;
  }

  public final String toString()
  {
    AppMethodBeat.i(120269);
    String str = getClass().getSimpleName() + ": " + this.Brx;
    AppMethodBeat.o(120269);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.i
 * JD-Core Version:    0.6.2
 */