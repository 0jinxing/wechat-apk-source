package a.i.b.a.c.d.a.c;

import a.f.b.j;
import a.i.b.a.c.d.a.a.a;
import a.i.b.a.c.d.a.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.EnumMap;

public final class d
{
  final EnumMap<a.a, h> Bnl;

  public d(EnumMap<a.a, h> paramEnumMap)
  {
    AppMethodBeat.i(119827);
    this.Bnl = paramEnumMap;
    AppMethodBeat.o(119827);
  }

  public final a.i.b.a.c.d.a.f.d b(a.a parama)
  {
    AppMethodBeat.i(119826);
    parama = (h)this.Bnl.get(parama);
    if (parama == null)
    {
      AppMethodBeat.o(119826);
      parama = null;
    }
    while (true)
    {
      return parama;
      j.o(parama, "nullabilityQualifiers[ap…ilityType] ?: return null");
      parama = new a.i.b.a.c.d.a.f.d(parama.BpP, null, false, parama.BpQ);
      AppMethodBeat.o(119826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.d
 * JD-Core Version:    0.6.2
 */