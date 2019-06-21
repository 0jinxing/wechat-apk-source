package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aub extends com.tencent.mm.bt.a
{
  public double latitude;
  public double longitude;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10194);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.latitude);
      paramArrayOfObject.f(2, this.longitude);
      AppMethodBeat.o(10194);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8);
        AppMethodBeat.o(10194);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10194);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aub localaub = (aub)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(10194);
          paramInt = -1;
          break;
        case 1:
          localaub.latitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(10194);
          paramInt = 0;
          break;
        case 2:
          localaub.longitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(10194);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(10194);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aub
 * JD-Core Version:    0.6.2
 */