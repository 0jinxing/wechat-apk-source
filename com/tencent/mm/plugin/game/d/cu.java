package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cu extends com.tencent.mm.bt.a
{
  public String mZV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(117001);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PkgId");
        AppMethodBeat.o(117001);
        throw paramArrayOfObject;
      }
      if (this.mZV != null)
        paramArrayOfObject.e(1, this.mZV);
      AppMethodBeat.o(117001);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZV == null)
        break label275;
    label275: for (paramInt = e.a.a.b.b.a.f(1, this.mZV) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(117001);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PkgId");
          AppMethodBeat.o(117001);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(117001);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cu localcu = (cu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(117001);
          paramInt = -1;
          break;
        case 1:
          localcu.mZV = locala.BTU.readString();
          AppMethodBeat.o(117001);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(117001);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cu
 * JD-Core Version:    0.6.2
 */