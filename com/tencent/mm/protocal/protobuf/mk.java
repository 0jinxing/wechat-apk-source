package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class mk extends com.tencent.mm.bt.a
{
  public long vQj;
  public b vQk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60024);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vQj);
      if (this.vQk != null)
        paramArrayOfObject.c(2, this.vQk);
      AppMethodBeat.o(60024);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vQj) + 0;
        paramInt = i;
        if (this.vQk != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.vQk);
        AppMethodBeat.o(60024);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60024);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mk localmk = (mk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(60024);
          paramInt = -1;
          break;
        case 1:
          localmk.vQj = locala.BTU.ve();
          AppMethodBeat.o(60024);
          paramInt = 0;
          break;
        case 2:
          localmk.vQk = locala.BTU.emu();
          AppMethodBeat.o(60024);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(60024);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mk
 * JD-Core Version:    0.6.2
 */