package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class abs extends com.tencent.mm.bt.a
{
  public LinkedList<String> wiI;
  public LinkedList<String> wiJ;

  public abs()
  {
    AppMethodBeat.i(51421);
    this.wiI = new LinkedList();
    this.wiJ = new LinkedList();
    AppMethodBeat.o(51421);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51422);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 1, this.wiI);
      paramArrayOfObject.e(2, 1, this.wiJ);
      AppMethodBeat.o(51422);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 1, this.wiI) + 0 + e.a.a.a.c(2, 1, this.wiJ);
        AppMethodBeat.o(51422);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wiI.clear();
        this.wiJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51422);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abs localabs = (abs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(51422);
          paramInt = -1;
          break;
        case 1:
          localabs.wiI.add(locala.BTU.readString());
          AppMethodBeat.o(51422);
          paramInt = 0;
          break;
        case 2:
          localabs.wiJ.add(locala.BTU.readString());
          AppMethodBeat.o(51422);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(51422);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abs
 * JD-Core Version:    0.6.2
 */