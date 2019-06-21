package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axu extends com.tencent.mm.bt.a
{
  public String kfA;
  public double latitude;
  public double longitude;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(114435);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.latitude);
      paramArrayOfObject.f(2, this.longitude);
      if (this.kfA != null)
        paramArrayOfObject.e(3, this.kfA);
      AppMethodBeat.o(114435);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8);
        paramInt = i;
        if (this.kfA != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.kfA);
        AppMethodBeat.o(114435);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114435);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axu localaxu = (axu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114435);
          break;
        case 1:
          localaxu.latitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(114435);
          paramInt = 0;
          break;
        case 2:
          localaxu.longitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(114435);
          paramInt = 0;
          break;
        case 3:
          localaxu.kfA = locala.BTU.readString();
          AppMethodBeat.o(114435);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(114435);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axu
 * JD-Core Version:    0.6.2
 */