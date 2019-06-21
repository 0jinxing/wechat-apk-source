package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxe extends com.tencent.mm.bt.a
{
  public int vEr;
  public int wDC;
  public int xsE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96340);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wDC);
      paramArrayOfObject.iz(2, this.vEr);
      paramArrayOfObject.iz(3, this.xsE);
      AppMethodBeat.o(96340);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wDC) + 0 + e.a.a.b.b.a.bs(2, this.vEr) + e.a.a.b.b.a.bs(3, this.xsE);
        AppMethodBeat.o(96340);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96340);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxe localcxe = (cxe)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96340);
          break;
        case 1:
          localcxe.wDC = locala.BTU.vd();
          AppMethodBeat.o(96340);
          paramInt = 0;
          break;
        case 2:
          localcxe.vEr = locala.BTU.vd();
          AppMethodBeat.o(96340);
          paramInt = 0;
          break;
        case 3:
          localcxe.xsE = locala.BTU.vd();
          AppMethodBeat.o(96340);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96340);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxe
 * JD-Core Version:    0.6.2
 */