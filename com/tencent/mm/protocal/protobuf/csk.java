package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class csk extends com.tencent.mm.bt.a
{
  public b xpM;
  public b xpN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57000);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpM != null)
        paramArrayOfObject.c(1, this.xpM);
      if (this.xpN != null)
        paramArrayOfObject.c(2, this.xpN);
      AppMethodBeat.o(57000);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpM == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.b(1, this.xpM) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xpN != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.xpN);
      AppMethodBeat.o(57000);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57000);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csk localcsk = (csk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(57000);
          paramInt = -1;
          break;
        case 1:
          localcsk.xpM = locala.BTU.emu();
          AppMethodBeat.o(57000);
          paramInt = i;
          break;
        case 2:
          localcsk.xpN = locala.BTU.emu();
          AppMethodBeat.o(57000);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(57000);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csk
 * JD-Core Version:    0.6.2
 */