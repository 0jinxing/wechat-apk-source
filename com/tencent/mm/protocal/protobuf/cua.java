package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cua extends com.tencent.mm.bt.a
{
  public long vIs;
  public boolean xqC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28738);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vIs);
      paramArrayOfObject.aO(2, this.xqC);
      AppMethodBeat.o(28738);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.vIs) + 0 + (e.a.a.b.b.a.fv(2) + 1);
        AppMethodBeat.o(28738);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28738);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cua localcua = (cua)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28738);
          paramInt = -1;
          break;
        case 1:
          localcua.vIs = locala.BTU.ve();
          AppMethodBeat.o(28738);
          paramInt = 0;
          break;
        case 2:
          localcua.xqC = locala.BTU.ehX();
          AppMethodBeat.o(28738);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28738);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cua
 * JD-Core Version:    0.6.2
 */