package a.i.b.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b<K, V>
{
  private static final b<Object, Object> BNB;
  private final d<a<e<K, V>>> BNC;
  private final int size;

  static
  {
    AppMethodBeat.i(122993);
    BNB = new b(d.ekG(), 0);
    AppMethodBeat.o(122993);
  }

  private b(d<a<e<K, V>>> paramd, int paramInt)
  {
    this.BNC = paramd;
    this.size = paramInt;
  }

  private static <K, V> int a(a<e<K, V>> parama, Object paramObject)
  {
    AppMethodBeat.i(122992);
    int i = 0;
    if ((parama != null) && (parama.size > 0))
      if (((e)parama.first).aCx.equals(paramObject))
        AppMethodBeat.o(122992);
    while (true)
    {
      return i;
      parama = parama.BNz;
      i++;
      break;
      i = -1;
      AppMethodBeat.o(122992);
    }
  }

  public static <K, V> b<K, V> ekF()
  {
    return BNB;
  }

  public final b<K, V> K(K paramK, V paramV)
  {
    AppMethodBeat.i(122990);
    a locala1 = UV(paramK.hashCode());
    int i = locala1.size;
    int j = a(locala1, paramK);
    a locala2 = locala1;
    if (j != -1)
      locala2 = locala1.UT(j);
    paramV = locala2.dZ(new e(paramK, paramV));
    paramK = this.BNC.t(paramK.hashCode(), paramV);
    j = this.size;
    paramK = new b(paramK, paramV.size + (j - i));
    AppMethodBeat.o(122990);
    return paramK;
  }

  public final a<e<K, V>> UV(int paramInt)
  {
    AppMethodBeat.i(122991);
    a locala = (a)this.BNC.get(paramInt);
    if (locala == null)
    {
      locala = a.ekE();
      AppMethodBeat.o(122991);
    }
    while (true)
    {
      return locala;
      AppMethodBeat.o(122991);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.b
 * JD-Core Version:    0.6.2
 */