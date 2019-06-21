package com.tencent.mm.plugin.gallery.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.LinkedList;

final class l$1
  implements Runnable
{
  l$1(l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21318);
    LinkedList localLinkedList = this.mOv.mOt.bBS();
    l locall = this.mOv;
    i.a[] arrayOfa = new i.a[locall.mOq.size()];
    locall.mOq.toArray(arrayOfa);
    int i = arrayOfa.length;
    for (int j = 0; j < i; j++)
      arrayOfa[j].V(localLinkedList);
    AppMethodBeat.o(21318);
  }

  public final String toString()
  {
    AppMethodBeat.i(21319);
    String str = super.toString() + "|queryAlbums";
    AppMethodBeat.o(21319);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.l.1
 * JD-Core Version:    0.6.2
 */