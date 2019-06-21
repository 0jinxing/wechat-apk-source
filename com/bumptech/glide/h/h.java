package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h
{
  private Class<?> aId;
  private Class<?> aIe;
  private Class<?> aIf;

  public h()
  {
  }

  public h(Class<?> paramClass1, Class<?> paramClass2)
  {
    AppMethodBeat.i(92592);
    d(paramClass1, paramClass2, null);
    AppMethodBeat.o(92592);
  }

  public h(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3)
  {
    AppMethodBeat.i(92593);
    d(paramClass1, paramClass2, paramClass3);
    AppMethodBeat.o(92593);
  }

  public final void d(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3)
  {
    this.aId = paramClass1;
    this.aIe = paramClass2;
    this.aIf = paramClass3;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(92595);
    if (this == paramObject)
      AppMethodBeat.o(92595);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(92595);
        bool = false;
      }
      else
      {
        paramObject = (h)paramObject;
        if (!this.aId.equals(paramObject.aId))
        {
          AppMethodBeat.o(92595);
          bool = false;
        }
        else if (!this.aIe.equals(paramObject.aIe))
        {
          AppMethodBeat.o(92595);
          bool = false;
        }
        else if (!j.h(this.aIf, paramObject.aIf))
        {
          AppMethodBeat.o(92595);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(92595);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92596);
    int i = this.aId.hashCode();
    int j = this.aIe.hashCode();
    if (this.aIf != null);
    for (int k = this.aIf.hashCode(); ; k = 0)
    {
      AppMethodBeat.o(92596);
      return k + (i * 31 + j) * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(92594);
    String str = "MultiClassKey{first=" + this.aId + ", second=" + this.aIe + '}';
    AppMethodBeat.o(92594);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.h
 * JD-Core Version:    0.6.2
 */