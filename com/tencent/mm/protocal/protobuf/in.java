package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class in extends com.tencent.mm.bt.a
{
  public String vKF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10154);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vKF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Mac");
        AppMethodBeat.o(10154);
        throw paramArrayOfObject;
      }
      if (this.vKF != null)
        paramArrayOfObject.e(1, this.vKF);
      AppMethodBeat.o(10154);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vKF == null)
        break label286;
    label286: for (paramInt = e.a.a.b.b.a.f(1, this.vKF) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(10154);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vKF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Mac");
          AppMethodBeat.o(10154);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10154);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        in localin = (in)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(10154);
          paramInt = -1;
          break;
        case 1:
          localin.vKF = locala.BTU.readString();
          AppMethodBeat.o(10154);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(10154);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.in
 * JD-Core Version:    0.6.2
 */