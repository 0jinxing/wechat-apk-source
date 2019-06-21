package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.b.g.c;

public final class d
  implements Comparable<d>
{
  private final String key;
  private final String value;

  public d(String paramString1, String paramString2)
  {
    this.key = paramString1;
    this.value = paramString2;
  }

  public final String eng()
  {
    AppMethodBeat.i(77271);
    String str = c.encode(this.key).concat("=").concat(c.encode(this.value));
    AppMethodBeat.o(77271);
    return str;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(77272);
    if (paramObject == null)
      AppMethodBeat.o(77272);
    while (true)
    {
      return bool;
      if (paramObject == this)
      {
        AppMethodBeat.o(77272);
        bool = true;
      }
      else if (!(paramObject instanceof d))
      {
        AppMethodBeat.o(77272);
      }
      else
      {
        paramObject = (d)paramObject;
        if ((paramObject.key.equals(this.key)) && (paramObject.value.equals(this.value)))
        {
          AppMethodBeat.o(77272);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(77272);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(77273);
    int i = this.key.hashCode();
    int j = this.value.hashCode();
    AppMethodBeat.o(77273);
    return i + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.b.d.d
 * JD-Core Version:    0.6.2
 */