package a.i.b.a.c.e.b.a;

import a.a.aj;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class m
{
  private final LinkedHashMap<String, String> ByK;
  final Set<String> ByL;
  private final String ByM;

  public m(String paramString)
  {
    AppMethodBeat.i(121347);
    this.ByM = paramString;
    this.ByK = new LinkedHashMap();
    this.ByL = ((Set)new LinkedHashSet());
    AppMethodBeat.o(121347);
  }

  public final Set<String> ehA()
  {
    AppMethodBeat.i(121342);
    Set localSet = this.ByK.keySet();
    j.o(localSet, "packageParts.keys");
    AppMethodBeat.o(121342);
    return localSet;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(121344);
    boolean bool;
    if (((paramObject instanceof m)) && (j.j(((m)paramObject).ByM, this.ByM)) && (j.j(((m)paramObject).ByK, this.ByK)) && (j.j(((m)paramObject).ByL, this.ByL)))
    {
      bool = true;
      AppMethodBeat.o(121344);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121344);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121345);
    int i = this.ByM.hashCode();
    int j = this.ByK.hashCode();
    int k = this.ByL.hashCode();
    AppMethodBeat.o(121345);
    return (i * 31 + j) * 31 + k;
  }

  public final void iY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(121343);
    j.p(paramString1, "partInternalName");
    ((Map)this.ByK).put(paramString1, paramString2);
    AppMethodBeat.o(121343);
  }

  public final String toString()
  {
    AppMethodBeat.i(121346);
    String str = aj.a(ehA(), (Iterable)this.ByL).toString();
    AppMethodBeat.o(121346);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.m
 * JD-Core Version:    0.6.2
 */