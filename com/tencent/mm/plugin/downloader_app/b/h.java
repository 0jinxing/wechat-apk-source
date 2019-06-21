package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class h<E extends e> extends LinkedList<E>
{
  public final int a(E paramE)
  {
    AppMethodBeat.i(136144);
    int i = 0;
    if (i < size())
    {
      e locale = (e)get(i);
      if (paramE.biK() >= locale.biK());
    }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
        i = size();
      add(i, paramE);
      AppMethodBeat.o(136144);
      return i;
      i++;
      break;
      i = 0;
    }
  }

  public final int tP(int paramInt)
  {
    AppMethodBeat.i(136145);
    int i = 0;
    int k;
    for (int j = 0; i < size(); j = k)
    {
      k = j;
      if (((e)get(i)).biK() == paramInt)
        k = j + 1;
      i++;
    }
    AppMethodBeat.o(136145);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.h
 * JD-Core Version:    0.6.2
 */