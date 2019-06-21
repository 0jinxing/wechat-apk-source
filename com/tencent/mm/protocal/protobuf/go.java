package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class go extends com.tencent.mm.bt.a
{
  public long endTime;
  public long startTime;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28324);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.startTime);
      paramArrayOfObject.ai(2, this.endTime);
      AppMethodBeat.o(28324);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.startTime) + 0 + e.a.a.b.b.a.o(2, this.endTime);
        AppMethodBeat.o(28324);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28324);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        go localgo = (go)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28324);
          paramInt = -1;
          break;
        case 1:
          localgo.startTime = locala.BTU.ve();
          AppMethodBeat.o(28324);
          paramInt = 0;
          break;
        case 2:
          localgo.endTime = locala.BTU.ve();
          AppMethodBeat.o(28324);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28324);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.go
 * JD-Core Version:    0.6.2
 */