package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crc extends com.tencent.mm.bt.a
{
  public long xoL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(102412);
    if (paramInt == 0)
    {
      ((e.a.a.c.a)paramArrayOfObject[0]).ai(1, this.xoL);
      AppMethodBeat.o(102412);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.xoL) + 0;
        AppMethodBeat.o(102412);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102412);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crc localcrc = (crc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(102412);
          paramInt = -1;
          break;
        case 1:
          localcrc.xoL = locala.BTU.ve();
          AppMethodBeat.o(102412);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(102412);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crc
 * JD-Core Version:    0.6.2
 */