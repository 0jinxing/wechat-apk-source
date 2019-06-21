package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CopyOnWriteArrayList;

public class Audio2Text$FIFOList<T> extends CopyOnWriteArrayList<T>
{
  private int mCapacity;

  public Audio2Text$FIFOList(int paramInt)
  {
    this.mCapacity = paramInt;
  }

  public boolean add(T paramT)
  {
    AppMethodBeat.i(83451);
    boolean bool;
    if (size() >= this.mCapacity)
    {
      remove(0);
      bool = super.add(paramT);
      AppMethodBeat.o(83451);
    }
    while (true)
    {
      return bool;
      bool = super.add(paramT);
      AppMethodBeat.o(83451);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.Audio2Text.FIFOList
 * JD-Core Version:    0.6.2
 */