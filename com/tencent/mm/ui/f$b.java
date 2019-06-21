package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$b<K, T>
{
  public K object;
  public int ygE;
  public T ygF;

  public f$b(K paramK, int paramInt)
  {
    this.object = paramK;
    this.ygE = paramInt;
    this.ygF = null;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(29174);
    if (this == paramObject)
      AppMethodBeat.o(29174);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(29174);
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(29174);
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if (this.ygE != paramObject.ygE)
        {
          AppMethodBeat.o(29174);
          bool = false;
        }
        else if (this.object == null)
        {
          if (paramObject.object != null)
          {
            AppMethodBeat.o(29174);
            bool = false;
          }
        }
        else if (!this.object.equals(paramObject.object))
        {
          AppMethodBeat.o(29174);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(29174);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(29173);
    int i = this.ygE;
    if (this.object == null);
    for (int j = 0; ; j = this.object.hashCode())
    {
      AppMethodBeat.o(29173);
      return j + (i + 31) * 31;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.b
 * JD-Core Version:    0.6.2
 */