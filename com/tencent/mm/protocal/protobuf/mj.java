package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class mj extends com.tencent.mm.bt.a
{
  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124297);
    if (paramInt == 0)
    {
      AppMethodBeat.o(124297);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        AppMethodBeat.o(124297);
        paramInt = 0;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124297);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        ((Integer)paramArrayOfObject[2]).intValue();
        AppMethodBeat.o(124297);
        paramInt = -1;
      }
      else
      {
        AppMethodBeat.o(124297);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mj
 * JD-Core Version:    0.6.2
 */