package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class asx extends com.tencent.mm.bt.a
{
  public int nbk;
  public b vKc;
  public b vKe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11772);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vKe != null)
        paramArrayOfObject.c(1, this.vKe);
      if (this.vKc != null)
        paramArrayOfObject.c(2, this.vKc);
      paramArrayOfObject.iz(3, this.nbk);
      AppMethodBeat.o(11772);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vKe == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.b(1, this.vKe) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vKc != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.vKc);
      paramInt = i + e.a.a.b.b.a.bs(3, this.nbk);
      AppMethodBeat.o(11772);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11772);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        asx localasx = (asx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11772);
          break;
        case 1:
          localasx.vKe = locala.BTU.emu();
          AppMethodBeat.o(11772);
          paramInt = i;
          break;
        case 2:
          localasx.vKc = locala.BTU.emu();
          AppMethodBeat.o(11772);
          paramInt = i;
          break;
        case 3:
          localasx.nbk = locala.BTU.vd();
          AppMethodBeat.o(11772);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11772);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asx
 * JD-Core Version:    0.6.2
 */