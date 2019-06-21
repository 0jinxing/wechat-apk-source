package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ahx extends com.tencent.mm.bt.a
{
  public double vNH;
  public double vNI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28432);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.vNH);
      paramArrayOfObject.f(2, this.vNI);
      AppMethodBeat.o(28432);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8);
        AppMethodBeat.o(28432);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28432);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ahx localahx = (ahx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28432);
          paramInt = -1;
          break;
        case 1:
          localahx.vNH = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(28432);
          paramInt = 0;
          break;
        case 2:
          localahx.vNI = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(28432);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28432);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahx
 * JD-Core Version:    0.6.2
 */