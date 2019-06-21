package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bo extends com.tencent.mm.bt.a
{
  public int vDQ;
  public int vDR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94499);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vDQ);
      paramArrayOfObject.iz(2, this.vDR);
      AppMethodBeat.o(94499);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vDQ) + 0 + e.a.a.b.b.a.bs(2, this.vDR);
        AppMethodBeat.o(94499);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94499);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bo localbo = (bo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(94499);
          paramInt = -1;
          break;
        case 1:
          localbo.vDQ = locala.BTU.vd();
          AppMethodBeat.o(94499);
          paramInt = 0;
          break;
        case 2:
          localbo.vDR = locala.BTU.vd();
          AppMethodBeat.o(94499);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(94499);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bo
 * JD-Core Version:    0.6.2
 */