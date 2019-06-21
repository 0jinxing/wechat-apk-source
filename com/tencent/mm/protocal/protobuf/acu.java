package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class acu extends com.tencent.mm.bt.a
{
  public boolean wkx;
  public boolean wky;
  public boolean wkz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(2541);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.wkx);
      paramArrayOfObject.aO(2, this.wky);
      paramArrayOfObject.aO(3, this.wkz);
      AppMethodBeat.o(2541);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 1 + 0 + (e.a.a.b.b.a.fv(2) + 1) + (e.a.a.b.b.a.fv(3) + 1);
        AppMethodBeat.o(2541);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2541);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acu localacu = (acu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2541);
          break;
        case 1:
          localacu.wkx = locala.BTU.ehX();
          AppMethodBeat.o(2541);
          paramInt = 0;
          break;
        case 2:
          localacu.wky = locala.BTU.ehX();
          AppMethodBeat.o(2541);
          paramInt = 0;
          break;
        case 3:
          localacu.wkz = locala.BTU.ehX();
          AppMethodBeat.o(2541);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(2541);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acu
 * JD-Core Version:    0.6.2
 */