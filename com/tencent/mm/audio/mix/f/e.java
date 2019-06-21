package com.tencent.mm.audio.mix.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;

public final class e<T>
{
  private T cnY;

  public e(T paramT)
  {
    this.cnY = paramT;
  }

  public final T al(T paramT)
  {
    try
    {
      AppMethodBeat.i(137194);
      Object localObject = this.cnY;
      this.cnY = paramT;
      paramT = new java/lang/StringBuilder;
      paramT.<init>();
      b.i("StateRunner", localObject.toString() + " -> " + this.cnY.toString());
      AppMethodBeat.o(137194);
      return localObject;
    }
    finally
    {
      paramT = finally;
    }
    throw paramT;
  }

  public final boolean g(T[] paramArrayOfT)
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(137195);
      int i = 0;
      if (i <= 0)
      {
        T ? = paramArrayOfT[0];
        if (this.cnY.equals(?))
        {
          bool = true;
          AppMethodBeat.o(137195);
        }
      }
      while (true)
      {
        return bool;
        i++;
        break;
        AppMethodBeat.o(137195);
      }
    }
    finally
    {
    }
    throw paramArrayOfT;
  }

  public final T get()
  {
    try
    {
      Object localObject1 = this.cnY;
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.e
 * JD-Core Version:    0.6.2
 */