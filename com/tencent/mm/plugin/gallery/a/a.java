package com.tencent.mm.plugin.gallery.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a
{
  public static void swap(List<?> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(21620);
    int i = paramInt1;
    if (paramInt1 > paramInt2)
    {
      while (paramInt1 > paramInt2)
      {
        Collections.swap(paramList, paramInt1, paramInt1 - 1);
        paramInt1--;
      }
      AppMethodBeat.o(21620);
    }
    while (true)
    {
      return;
      while (i < paramInt2)
      {
        Collections.swap(paramList, i, i + 1);
        i++;
      }
      AppMethodBeat.o(21620);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.a.a
 * JD-Core Version:    0.6.2
 */