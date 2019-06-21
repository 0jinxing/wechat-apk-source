package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class azz extends com.tencent.mm.bt.a
{
  public LinkedList<b> wDN;

  public azz()
  {
    AppMethodBeat.i(102383);
    this.wDN = new LinkedList();
    AppMethodBeat.o(102383);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(102384);
    if (paramInt == 0)
    {
      ((e.a.a.c.a)paramArrayOfObject[0]).e(1, 6, this.wDN);
      AppMethodBeat.o(102384);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 6, this.wDN) + 0;
        AppMethodBeat.o(102384);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wDN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102384);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azz localazz = (azz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(102384);
          paramInt = -1;
          break;
        case 1:
          localazz.wDN.add(locala.BTU.emu());
          AppMethodBeat.o(102384);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(102384);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azz
 * JD-Core Version:    0.6.2
 */