package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bkp extends com.tencent.mm.bt.a
{
  public int ndE;
  public String vMU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58924);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMU != null)
        paramArrayOfObject.e(1, this.vMU);
      paramArrayOfObject.iz(2, this.ndE);
      AppMethodBeat.o(58924);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vMU == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.vMU) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.ndE);
      AppMethodBeat.o(58924);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58924);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bkp localbkp = (bkp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(58924);
          paramInt = -1;
          break;
        case 1:
          localbkp.vMU = locala.BTU.readString();
          AppMethodBeat.o(58924);
          paramInt = i;
          break;
        case 2:
          localbkp.ndE = locala.BTU.vd();
          AppMethodBeat.o(58924);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(58924);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkp
 * JD-Core Version:    0.6.2
 */