package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bku extends com.tencent.mm.bt.a
{
  public double vNH;
  public double vNI;
  public double wNP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(113788);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.vNI);
      paramArrayOfObject.f(2, this.vNH);
      paramArrayOfObject.f(3, this.wNP);
      AppMethodBeat.o(113788);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8);
        AppMethodBeat.o(113788);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(113788);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bku localbku = (bku)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113788);
          break;
        case 1:
          localbku.vNI = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113788);
          paramInt = 0;
          break;
        case 2:
          localbku.vNH = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113788);
          paramInt = 0;
          break;
        case 3:
          localbku.wNP = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113788);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(113788);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bku
 * JD-Core Version:    0.6.2
 */