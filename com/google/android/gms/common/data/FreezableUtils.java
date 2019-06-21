package com.google.android.gms.common.data;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public final class FreezableUtils
{
  public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> paramArrayList)
  {
    AppMethodBeat.i(61136);
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
      localArrayList.add(((Freezable)paramArrayList.get(j)).freeze());
    AppMethodBeat.o(61136);
    return localArrayList;
  }

  public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] paramArrayOfE)
  {
    AppMethodBeat.i(61137);
    ArrayList localArrayList = new ArrayList(paramArrayOfE.length);
    for (int i = 0; i < paramArrayOfE.length; i++)
      localArrayList.add(paramArrayOfE[i].freeze());
    AppMethodBeat.o(61137);
    return localArrayList;
  }

  public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> paramIterable)
  {
    AppMethodBeat.i(61138);
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
      localArrayList.add(((Freezable)paramIterable.next()).freeze());
    AppMethodBeat.o(61138);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.FreezableUtils
 * JD-Core Version:    0.6.2
 */