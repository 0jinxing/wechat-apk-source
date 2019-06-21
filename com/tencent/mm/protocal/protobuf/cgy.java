package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cgy extends com.tencent.mm.bt.a
{
  public long xfQ;
  public long xfR;
  public int xfS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94635);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xfQ);
      paramArrayOfObject.ai(2, this.xfR);
      paramArrayOfObject.iz(3, this.xfS);
      AppMethodBeat.o(94635);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.xfQ) + 0 + e.a.a.b.b.a.o(2, this.xfR) + e.a.a.b.b.a.bs(3, this.xfS);
        AppMethodBeat.o(94635);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94635);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cgy localcgy = (cgy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94635);
          break;
        case 1:
          localcgy.xfQ = locala.BTU.ve();
          AppMethodBeat.o(94635);
          paramInt = 0;
          break;
        case 2:
          localcgy.xfR = locala.BTU.ve();
          AppMethodBeat.o(94635);
          paramInt = 0;
          break;
        case 3:
          localcgy.xfS = locala.BTU.vd();
          AppMethodBeat.o(94635);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94635);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgy
 * JD-Core Version:    0.6.2
 */