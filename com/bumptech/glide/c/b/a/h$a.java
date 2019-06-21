package com.bumptech.glide.c.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class h$a<K, V>
{
  a<K, V> aCA;
  final K aCx;
  private List<V> aCy;
  a<K, V> aCz;

  h$a()
  {
    this(null);
  }

  h$a(K paramK)
  {
    AppMethodBeat.i(91914);
    this.aCA = this;
    this.aCz = this;
    this.aCx = paramK;
    AppMethodBeat.o(91914);
  }

  public final void add(V paramV)
  {
    AppMethodBeat.i(91917);
    if (this.aCy == null)
      this.aCy = new ArrayList();
    this.aCy.add(paramV);
    AppMethodBeat.o(91917);
  }

  public final V removeLast()
  {
    AppMethodBeat.i(91915);
    int i = size();
    Object localObject;
    if (i > 0)
    {
      localObject = this.aCy.remove(i - 1);
      AppMethodBeat.o(91915);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(91915);
    }
  }

  public final int size()
  {
    AppMethodBeat.i(91916);
    int i;
    if (this.aCy != null)
    {
      i = this.aCy.size();
      AppMethodBeat.o(91916);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(91916);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.h.a
 * JD-Core Version:    0.6.2
 */