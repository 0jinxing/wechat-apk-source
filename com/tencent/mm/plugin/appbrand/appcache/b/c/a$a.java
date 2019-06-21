package com.tencent.mm.plugin.appbrand.appcache.b.c;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a$a<_Key> extends SparseIntArray
{
  private int bn(_Key param_Key)
  {
    int i = -1;
    AppMethodBeat.i(129496);
    if (param_Key == null)
      AppMethodBeat.o(129496);
    while (true)
    {
      return i;
      i = super.get(param_Key.hashCode(), -1);
      AppMethodBeat.o(129496);
    }
  }

  public final void e(_Key param_Key, int paramInt)
  {
    AppMethodBeat.i(129495);
    super.put(param_Key.hashCode(), paramInt);
    AppMethodBeat.o(129495);
  }

  public final int get(_Key param_Key)
  {
    AppMethodBeat.i(129497);
    int i = bn(param_Key);
    AppMethodBeat.o(129497);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.c.a.a
 * JD-Core Version:    0.6.2
 */