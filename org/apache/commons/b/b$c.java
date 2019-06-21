package org.apache.commons.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

class b$c
  implements b.a
{
  private final Map BWX;
  private final c BWY;

  b$c()
  {
    AppMethodBeat.i(116928);
    this.BWX = new HashMap();
    this.BWY = new c();
    AppMethodBeat.o(116928);
  }

  public final int awK(String paramString)
  {
    AppMethodBeat.i(116930);
    paramString = this.BWX.get(paramString);
    int i;
    if (paramString == null)
    {
      i = -1;
      AppMethodBeat.o(116930);
    }
    while (true)
    {
      return i;
      i = ((Integer)paramString).intValue();
      AppMethodBeat.o(116930);
    }
  }

  public final void h(String paramString, int paramInt)
  {
    AppMethodBeat.i(116929);
    this.BWX.put(paramString, Integer.valueOf(paramInt));
    this.BWY.v(paramInt, paramString);
    AppMethodBeat.o(116929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.b.c
 * JD-Core Version:    0.6.2
 */