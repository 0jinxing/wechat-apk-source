package a.i.b.a.c.h;

import a.a.e;
import a.a.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public enum h
{
  public static final Set<h> BCu;
  public static final Set<h> BCv;
  public static final h.a BCw;
  private final boolean BCt;

  static
  {
    int i = 0;
    AppMethodBeat.i(121848);
    h localh1 = new h("VISIBILITY", 0, true);
    BCi = localh1;
    h localh2 = new h("MODALITY", 1, true);
    BCj = localh2;
    h localh3 = new h("OVERRIDE", 2, true);
    BCk = localh3;
    h localh4 = new h("ANNOTATIONS", 3, false);
    BCl = localh4;
    Object localObject1 = new h("INNER", 4, true);
    BCm = (h)localObject1;
    h localh5 = new h("MEMBER_KIND", 5, true);
    BCn = localh5;
    h localh6 = new h("DATA", 6, true);
    BCo = localh6;
    h localh7 = new h("INLINE", 7, true);
    BCp = localh7;
    h localh8 = new h("EXPECT", 8, true);
    BCq = localh8;
    Object localObject2 = new h("ACTUAL", 9, true);
    BCr = (h)localObject2;
    BCs = new h[] { localh1, localh2, localh3, localh4, localObject1, localh5, localh6, localh7, localh8, localObject2 };
    BCw = new h.a((byte)0);
    localObject2 = values();
    localObject1 = (Collection)new ArrayList();
    int j = localObject2.length;
    while (i < j)
    {
      localh5 = localObject2[i];
      if (localh5.BCt)
        ((Collection)localObject1).add(localh5);
      i++;
    }
    BCu = j.o((Iterable)localObject1);
    BCv = e.R(values());
    AppMethodBeat.o(121848);
  }

  private h(boolean paramBoolean)
  {
    this.BCt = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.h
 * JD-Core Version:    0.6.2
 */