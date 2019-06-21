package a.i.b.a.c.k;

import a.f.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$d<K, V>
{
  final a<? extends V> BIP;
  private final K aCx;

  public b$d(K paramK, a<? extends V> parama)
  {
    this.aCx = paramK;
    this.BIP = parama;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(122442);
    if (this == paramObject)
      AppMethodBeat.o(122442);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(122442);
        bool = false;
      }
      else
      {
        paramObject = (d)paramObject;
        if (!this.aCx.equals(paramObject.aCx))
        {
          AppMethodBeat.o(122442);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(122442);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(122443);
    int i = this.aCx.hashCode();
    AppMethodBeat.o(122443);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.b.d
 * JD-Core Version:    0.6.2
 */