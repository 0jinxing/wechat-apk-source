package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cbo extends com.tencent.mm.bt.a
{
  public int vEq;
  public int xaT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94593);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vEq);
      paramArrayOfObject.iz(2, this.xaT);
      AppMethodBeat.o(94593);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vEq) + 0 + e.a.a.b.b.a.bs(2, this.xaT);
        AppMethodBeat.o(94593);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94593);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cbo localcbo = (cbo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(94593);
          paramInt = -1;
          break;
        case 1:
          localcbo.vEq = locala.BTU.vd();
          AppMethodBeat.o(94593);
          paramInt = 0;
          break;
        case 2:
          localcbo.xaT = locala.BTU.vd();
          AppMethodBeat.o(94593);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(94593);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbo
 * JD-Core Version:    0.6.2
 */