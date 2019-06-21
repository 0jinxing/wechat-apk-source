package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bqv extends com.tencent.mm.bt.a
{
  public String luG;
  public String vKF;
  public int wQU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28614);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.luG != null)
        paramArrayOfObject.e(1, this.luG);
      if (this.vKF != null)
        paramArrayOfObject.e(2, this.vKF);
      paramArrayOfObject.iz(3, this.wQU);
      AppMethodBeat.o(28614);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.luG == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.luG) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vKF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vKF);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wQU);
      AppMethodBeat.o(28614);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28614);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bqv localbqv = (bqv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28614);
          break;
        case 1:
          localbqv.luG = locala.BTU.readString();
          AppMethodBeat.o(28614);
          paramInt = i;
          break;
        case 2:
          localbqv.vKF = locala.BTU.readString();
          AppMethodBeat.o(28614);
          paramInt = i;
          break;
        case 3:
          localbqv.wQU = locala.BTU.vd();
          AppMethodBeat.o(28614);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28614);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqv
 * JD-Core Version:    0.6.2
 */