package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class clm extends com.tencent.mm.bt.a
{
  public int OpCode;
  public LinkedList<String> xjj;

  public clm()
  {
    AppMethodBeat.i(62587);
    this.xjj = new LinkedList();
    AppMethodBeat.o(62587);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62588);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.OpCode);
      paramArrayOfObject.e(2, 1, this.xjj);
      AppMethodBeat.o(62588);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.OpCode) + 0 + e.a.a.a.c(2, 1, this.xjj);
        AppMethodBeat.o(62588);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xjj.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62588);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        clm localclm = (clm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(62588);
          paramInt = -1;
          break;
        case 1:
          localclm.OpCode = locala.BTU.vd();
          AppMethodBeat.o(62588);
          paramInt = 0;
          break;
        case 2:
          localclm.xjj.add(locala.BTU.readString());
          AppMethodBeat.o(62588);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(62588);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clm
 * JD-Core Version:    0.6.2
 */