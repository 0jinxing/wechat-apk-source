package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class g extends com.tencent.mm.bt.a
{
  public String mZJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116992);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppStoreUrl");
        AppMethodBeat.o(116992);
        throw paramArrayOfObject;
      }
      if (this.mZJ != null)
        paramArrayOfObject.e(1, this.mZJ);
      AppMethodBeat.o(116992);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZJ == null)
        break label275;
    label275: for (paramInt = e.a.a.b.b.a.f(1, this.mZJ) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(116992);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppStoreUrl");
          AppMethodBeat.o(116992);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116992);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(116992);
          paramInt = -1;
          break;
        case 1:
          localg.mZJ = locala.BTU.readString();
          AppMethodBeat.o(116992);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(116992);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.g
 * JD-Core Version:    0.6.2
 */