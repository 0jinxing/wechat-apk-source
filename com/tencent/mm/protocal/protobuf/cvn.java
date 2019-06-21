package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvn extends com.tencent.mm.bt.a
{
  public boolean xry;
  public boolean xrz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63694);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.xry);
      paramArrayOfObject.aO(2, this.xrz);
      AppMethodBeat.o(63694);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 1 + 0 + (e.a.a.b.b.a.fv(2) + 1);
        AppMethodBeat.o(63694);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(63694);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvn localcvn = (cvn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(63694);
          paramInt = -1;
          break;
        case 1:
          localcvn.xry = locala.BTU.ehX();
          AppMethodBeat.o(63694);
          paramInt = 0;
          break;
        case 2:
          localcvn.xrz = locala.BTU.ehX();
          AppMethodBeat.o(63694);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(63694);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvn
 * JD-Core Version:    0.6.2
 */