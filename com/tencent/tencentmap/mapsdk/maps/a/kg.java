package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class kg<T, S extends kt>
  implements kv
{
  private final T a;
  private final S b;

  public kg(T paramT, S paramS)
  {
    AppMethodBeat.i(100219);
    if (paramS == null)
    {
      paramT = new IllegalArgumentException();
      AppMethodBeat.o(100219);
      throw paramT;
    }
    this.a = paramT;
    this.b = paramS;
    AppMethodBeat.o(100219);
  }

  public static <T, S extends kt> kg<T, S> a(T paramT, S paramS)
  {
    AppMethodBeat.i(100220);
    paramT = new kg(paramT, paramS);
    AppMethodBeat.o(100220);
    return paramT;
  }

  public final T a()
  {
    return this.a;
  }

  public final S b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(100223);
    if (paramObject == null)
      AppMethodBeat.o(100223);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof kg))
      {
        AppMethodBeat.o(100223);
      }
      else
      {
        paramObject = (kg)paramObject;
        int i;
        if ((this.a == paramObject.a) || ((this.a != null) && (this.a.equals(paramObject.a))))
        {
          i = 1;
          label72: if ((this.b != paramObject.b) && ((this.b == null) || (!this.b.equals(paramObject.b))))
            break label131;
        }
        label131: for (int j = 1; ; j = 0)
        {
          if ((i == 0) || (j == 0))
            break label137;
          AppMethodBeat.o(100223);
          bool = true;
          break;
          i = 0;
          break label72;
        }
        label137: AppMethodBeat.o(100223);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(100222);
    int i = Arrays.hashCode(new Object[] { this.a, this.b });
    AppMethodBeat.o(100222);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(100221);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Entry [value=");
    ((StringBuilder)localObject).append(this.a);
    ((StringBuilder)localObject).append(", geometry=");
    ((StringBuilder)localObject).append(this.b);
    ((StringBuilder)localObject).append("]");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(100221);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.kg
 * JD-Core Version:    0.6.2
 */