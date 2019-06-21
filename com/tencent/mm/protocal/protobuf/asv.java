package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class asv extends com.tencent.mm.bt.a
{
  public b vKc;
  public b vKe;
  public b wwF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28521);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vKe != null)
        paramArrayOfObject.c(1, this.vKe);
      if (this.vKc != null)
        paramArrayOfObject.c(2, this.vKc);
      if (this.wwF != null)
        paramArrayOfObject.c(3, this.wwF);
      AppMethodBeat.o(28521);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vKe == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.b(1, this.vKe) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vKc != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.vKc);
      i = paramInt;
      if (this.wwF != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.wwF);
      AppMethodBeat.o(28521);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28521);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        asv localasv = (asv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28521);
          break;
        case 1:
          localasv.vKe = locala.BTU.emu();
          AppMethodBeat.o(28521);
          paramInt = i;
          break;
        case 2:
          localasv.vKc = locala.BTU.emu();
          AppMethodBeat.o(28521);
          paramInt = i;
          break;
        case 3:
          localasv.wwF = locala.BTU.emu();
          AppMethodBeat.o(28521);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28521);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asv
 * JD-Core Version:    0.6.2
 */