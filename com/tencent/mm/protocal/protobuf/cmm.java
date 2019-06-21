package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class cmm extends com.tencent.mm.bt.a
{
  public int xko;
  public b xkp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5224);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xko);
      if (this.xkp != null)
        paramArrayOfObject.c(2, this.xkp);
      AppMethodBeat.o(5224);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xko) + 0;
        paramInt = i;
        if (this.xkp != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.xkp);
        AppMethodBeat.o(5224);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5224);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmm localcmm = (cmm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(5224);
          paramInt = -1;
          break;
        case 1:
          localcmm.xko = locala.BTU.vd();
          AppMethodBeat.o(5224);
          paramInt = 0;
          break;
        case 2:
          localcmm.xkp = locala.BTU.emu();
          AppMethodBeat.o(5224);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(5224);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmm
 * JD-Core Version:    0.6.2
 */