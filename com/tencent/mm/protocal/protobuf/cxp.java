package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxp extends com.tencent.mm.bt.a
{
  public int xsV;
  public int xsW;
  public int xsX;
  public int xsY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(115015);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xsV);
      paramArrayOfObject.iz(2, this.xsW);
      paramArrayOfObject.iz(3, this.xsX);
      paramArrayOfObject.iz(4, this.xsY);
      AppMethodBeat.o(115015);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.xsV) + 0 + e.a.a.b.b.a.bs(2, this.xsW) + e.a.a.b.b.a.bs(3, this.xsX) + e.a.a.b.b.a.bs(4, this.xsY);
        AppMethodBeat.o(115015);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115015);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxp localcxp = (cxp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115015);
          break;
        case 1:
          localcxp.xsV = locala.BTU.vd();
          AppMethodBeat.o(115015);
          paramInt = 0;
          break;
        case 2:
          localcxp.xsW = locala.BTU.vd();
          AppMethodBeat.o(115015);
          paramInt = 0;
          break;
        case 3:
          localcxp.xsX = locala.BTU.vd();
          AppMethodBeat.o(115015);
          paramInt = 0;
          break;
        case 4:
          localcxp.xsY = locala.BTU.vd();
          AppMethodBeat.o(115015);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(115015);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxp
 * JD-Core Version:    0.6.2
 */