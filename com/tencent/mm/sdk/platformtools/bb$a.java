package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class bb$a<V>
{
  final V xBi;

  bb$a(V paramV)
  {
    this.xBi = paramV;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(52241);
    if (paramObject == null)
      AppMethodBeat.o(52241);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof a))
      {
        AppMethodBeat.o(52241);
      }
      else
      {
        paramObject = (a)paramObject;
        if (this.xBi == null)
        {
          if (paramObject.xBi == null)
          {
            bool = true;
            AppMethodBeat.o(52241);
          }
          else
          {
            AppMethodBeat.o(52241);
          }
        }
        else
        {
          bool = this.xBi.equals(paramObject.xBi);
          AppMethodBeat.o(52241);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bb.a
 * JD-Core Version:    0.6.2
 */