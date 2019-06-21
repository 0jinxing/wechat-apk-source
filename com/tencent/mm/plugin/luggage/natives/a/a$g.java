package com.tencent.mm.plugin.luggage.natives.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;

public final class a$g
{
  public a.f okI;
  public float value;

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(116920);
    if (this == paramObject)
      AppMethodBeat.o(116920);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof g))
      {
        AppMethodBeat.o(116920);
        bool = false;
      }
      else
      {
        paramObject = (g)paramObject;
        if ((Float.compare(paramObject.value, this.value) == 0) && (this.okI == paramObject.okI))
        {
          AppMethodBeat.o(116920);
        }
        else
        {
          AppMethodBeat.o(116920);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(116921);
    int i = Objects.hash(new Object[] { this.okI, Float.valueOf(this.value) });
    AppMethodBeat.o(116921);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(116922);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{unit:").append(this.okI).append(", value:").append(this.value).append("}");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(116922);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.a.a.g
 * JD-Core Version:    0.6.2
 */