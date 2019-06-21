package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnw extends com.tencent.mm.bt.a
{
  public LinkedList<Float> xls;

  public cnw()
  {
    AppMethodBeat.i(2534);
    this.xls = new LinkedList();
    AppMethodBeat.o(2534);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(2535);
    if (paramInt == 0)
    {
      ((e.a.a.c.a)paramArrayOfObject[0]).e(1, 5, this.xls);
      AppMethodBeat.o(2535);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 5, this.xls) + 0;
        AppMethodBeat.o(2535);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xls.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2535);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cnw localcnw = (cnw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(2535);
          paramInt = -1;
          break;
        case 1:
          localcnw.xls.add(Float.valueOf(Float.intBitsToFloat(locala.BTU.eia())));
          AppMethodBeat.o(2535);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(2535);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnw
 * JD-Core Version:    0.6.2
 */