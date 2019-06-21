package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class ff extends fj
{
  int b;

  private ff(ex paramex, int paramInt)
  {
    super(paramex);
    AppMethodBeat.i(98876);
    a(paramInt);
    AppMethodBeat.o(98876);
  }

  public static ff a(ex paramex, int paramInt, fi paramfi, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98878);
    paramex = new ff(paramex, paramInt);
    paramex.a(paramArrayOfObject);
    paramex.a(paramfi);
    AppMethodBeat.o(98878);
    return paramex;
  }

  public static ff a(ex paramex, int paramInt, double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(98877);
    paramex = new ff(paramex, paramInt);
    paramex.a(paramArrayOfDouble);
    AppMethodBeat.o(98877);
    return paramex;
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(98875);
    if (this.e != null)
    {
      fg localfg = this.e[0];
      int i = localfg.b();
      this.f.remove(Integer.valueOf(i));
      this.f.put(Integer.valueOf(paramInt), localfg);
    }
    this.b = paramInt;
    AppMethodBeat.o(98875);
  }

  public final void a(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(98879);
    if ((this.e == null) || (this.e.length == 0))
    {
      a(new fg[] { fg.a(this.b, paramArrayOfDouble) });
      AppMethodBeat.o(98879);
    }
    while (true)
    {
      return;
      super.a(paramArrayOfDouble);
      AppMethodBeat.o(98879);
    }
  }

  public final void a(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98880);
    if ((this.e == null) || (this.e.length == 0))
    {
      a(new fg[] { fg.a(this.b, null, paramArrayOfObject) });
      AppMethodBeat.o(98880);
    }
    while (true)
    {
      return;
      super.a(paramArrayOfObject);
      AppMethodBeat.o(98880);
    }
  }

  public final ff b()
  {
    AppMethodBeat.i(98881);
    ff localff = (ff)super.a();
    AppMethodBeat.o(98881);
    return localff;
  }

  public final String toString()
  {
    AppMethodBeat.i(98882);
    String str1 = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.g;
    String str2 = str1;
    if (this.e != null)
      for (int i = 0; ; i++)
      {
        str2 = str1;
        if (i >= this.e.length)
          break;
        str1 = str1 + "\n    " + this.e[i].toString();
      }
    AppMethodBeat.o(98882);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ff
 * JD-Core Version:    0.6.2
 */