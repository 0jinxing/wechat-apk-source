package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class con extends com.tencent.mm.bt.a
{
  public int xmt;
  public int xmu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5233);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xmt);
      paramArrayOfObject.iz(2, this.xmu);
      AppMethodBeat.o(5233);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.xmt) + 0 + e.a.a.b.b.a.bs(2, this.xmu);
        AppMethodBeat.o(5233);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5233);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        con localcon = (con)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(5233);
          paramInt = -1;
          break;
        case 1:
          localcon.xmt = locala.BTU.vd();
          AppMethodBeat.o(5233);
          paramInt = 0;
          break;
        case 2:
          localcon.xmu = locala.BTU.vd();
          AppMethodBeat.o(5233);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(5233);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.con
 * JD-Core Version:    0.6.2
 */