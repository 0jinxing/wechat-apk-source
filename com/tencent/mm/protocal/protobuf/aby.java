package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aby extends com.tencent.mm.bt.a
{
  public long endTime = 0L;
  public long startTime = 0L;
  public int wjO = 0;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73649);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.startTime);
      paramArrayOfObject.ai(2, this.endTime);
      paramArrayOfObject.iz(3, this.wjO);
      AppMethodBeat.o(73649);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.startTime) + 0 + e.a.a.b.b.a.o(2, this.endTime) + e.a.a.b.b.a.bs(3, this.wjO);
        AppMethodBeat.o(73649);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73649);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aby localaby = (aby)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73649);
          break;
        case 1:
          localaby.startTime = locala.BTU.ve();
          AppMethodBeat.o(73649);
          paramInt = 0;
          break;
        case 2:
          localaby.endTime = locala.BTU.ve();
          AppMethodBeat.o(73649);
          paramInt = 0;
          break;
        case 3:
          localaby.wjO = locala.BTU.vd();
          AppMethodBeat.o(73649);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73649);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aby
 * JD-Core Version:    0.6.2
 */