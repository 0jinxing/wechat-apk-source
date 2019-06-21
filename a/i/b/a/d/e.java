package a.i.b.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public final class e<K, V>
  implements Serializable
{
  public final K aCx;
  public final V value;

  public e(K paramK, V paramV)
  {
    this.aCx = paramK;
    this.value = paramV;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(123004);
    if (!(paramObject instanceof e))
    {
      AppMethodBeat.o(123004);
      return bool;
    }
    paramObject = (e)paramObject;
    if (this.aCx == null)
    {
      if (paramObject.aCx != null)
        break label78;
      label40: if (this.value != null)
        break label86;
      if (paramObject.value != null)
        break label78;
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(123004);
      break;
      if (this.aCx.equals(paramObject.aCx))
        break label40;
      label78: label86: 
      do
      {
        AppMethodBeat.o(123004);
        break;
      }
      while (!this.value.equals(paramObject.value));
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(123005);
    int j;
    if (this.aCx == null)
    {
      j = 0;
      if (this.value != null)
        break label43;
    }
    while (true)
    {
      AppMethodBeat.o(123005);
      return j ^ i;
      j = this.aCx.hashCode();
      break;
      label43: i = this.value.hashCode();
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(123006);
    String str = this.aCx + "=" + this.value;
    AppMethodBeat.o(123006);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.e
 * JD-Core Version:    0.6.2
 */