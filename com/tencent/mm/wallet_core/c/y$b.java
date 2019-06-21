package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class y$b
{
  final String fns;
  final int type;

  y$b(int paramInt, String paramString)
  {
    this.type = paramInt;
    this.fns = paramString;
  }

  final Object aoq()
  {
    Object localObject1 = null;
    AppMethodBeat.i(5477);
    if (this.fns == y.dsc())
      AppMethodBeat.o(5477);
    while (true)
    {
      return localObject1;
      try
      {
        int i = this.type;
        Object localObject2;
        switch (i)
        {
        default:
          AppMethodBeat.o(5477);
          break;
        case 1:
          localObject2 = Integer.valueOf(this.fns);
          localObject1 = localObject2;
          AppMethodBeat.o(5477);
          break;
        case 2:
          localObject2 = Long.valueOf(this.fns);
          localObject1 = localObject2;
          AppMethodBeat.o(5477);
          break;
        case 3:
          localObject2 = this.fns;
          AppMethodBeat.o(5477);
          localObject1 = localObject2;
          break;
        case 4:
          localObject2 = Boolean.valueOf(this.fns);
          localObject1 = localObject2;
          AppMethodBeat.o(5477);
          break;
        case 5:
          localObject2 = Float.valueOf(this.fns);
          localObject1 = localObject2;
          AppMethodBeat.o(5477);
          break;
        case 6:
          localObject2 = Double.valueOf(this.fns);
          localObject1 = localObject2;
          AppMethodBeat.o(5477);
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.ConfigStorage", "exception:%s", new Object[] { bo.l(localException) });
      }
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(5476);
    if (paramObject == null)
      AppMethodBeat.o(5476);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof b))
      {
        AppMethodBeat.o(5476);
      }
      else
      {
        paramObject = (b)paramObject;
        if (this.type != paramObject.type)
        {
          AppMethodBeat.o(5476);
        }
        else if (this.fns == null)
        {
          if (paramObject.fns == null)
          {
            bool = true;
            AppMethodBeat.o(5476);
          }
          else
          {
            AppMethodBeat.o(5476);
          }
        }
        else
        {
          bool = this.fns.equals(paramObject.fns);
          AppMethodBeat.o(5476);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.y.b
 * JD-Core Version:    0.6.2
 */