package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class csn extends com.tencent.mm.bt.a
{
  public b xpO;
  public b xpP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57004);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpO != null)
        paramArrayOfObject.c(1, this.xpO);
      if (this.xpP != null)
        paramArrayOfObject.c(2, this.xpP);
      AppMethodBeat.o(57004);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpO == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.b(1, this.xpO) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xpP != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.xpP);
      AppMethodBeat.o(57004);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57004);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csn localcsn = (csn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(57004);
          paramInt = -1;
          break;
        case 1:
          localcsn.xpO = locala.BTU.emu();
          AppMethodBeat.o(57004);
          paramInt = i;
          break;
        case 2:
          localcsn.xpP = locala.BTU.emu();
          AppMethodBeat.o(57004);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(57004);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csn
 * JD-Core Version:    0.6.2
 */