package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$a
{
  int rep;
  int req;
  int rer;

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      bool2 = bool1;
      if (paramObject.rep == this.rep)
      {
        bool2 = bool1;
        if (paramObject.req == this.req)
        {
          bool2 = bool1;
          if (paramObject.rer == this.rer)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  public final int hashCode()
  {
    return this.rep + this.req + this.rer;
  }

  public final String toString()
  {
    AppMethodBeat.i(37732);
    String str = "[nodeType=" + this.rep + ",compType=" + this.req + ",subCompType=" + this.rer + "]";
    AppMethodBeat.o(37732);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a
 * JD-Core Version:    0.6.2
 */