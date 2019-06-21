package com.tencent.mm.ca;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class b$a<E> extends ArrayList<E>
{
  public final void add(int paramInt, E paramE)
  {
    AppMethodBeat.i(105886);
    ab.i("InterceptArrayList", "InterceptArrayList.add index object");
    AppMethodBeat.o(105886);
  }

  public final boolean add(E paramE)
  {
    AppMethodBeat.i(105885);
    ab.i("InterceptArrayList", "InterceptArrayList.add");
    AppMethodBeat.o(105885);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.b.a
 * JD-Core Version:    0.6.2
 */