package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class csm extends com.tencent.mm.bt.a
{
  public b xpD;
  public b xpN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57003);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpD != null)
        paramArrayOfObject.c(1, this.xpD);
      if (this.xpN != null)
        paramArrayOfObject.c(2, this.xpN);
      AppMethodBeat.o(57003);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpD == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.b(1, this.xpD) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xpN != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.xpN);
      AppMethodBeat.o(57003);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57003);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csm localcsm = (csm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(57003);
          paramInt = -1;
          break;
        case 1:
          localcsm.xpD = locala.BTU.emu();
          AppMethodBeat.o(57003);
          paramInt = i;
          break;
        case 2:
          localcsm.xpN = locala.BTU.emu();
          AppMethodBeat.o(57003);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(57003);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csm
 * JD-Core Version:    0.6.2
 */