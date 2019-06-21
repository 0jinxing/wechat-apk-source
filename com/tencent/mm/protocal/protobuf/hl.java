package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class hl extends com.tencent.mm.bt.a
{
  public int Scene;
  public int luF;
  public b vKb;
  public b vKc;
  public int vKd;
  public b vKe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58892);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vKb != null)
        paramArrayOfObject.c(1, this.vKb);
      paramArrayOfObject.iz(2, this.luF);
      if (this.vKc != null)
        paramArrayOfObject.c(3, this.vKc);
      paramArrayOfObject.iz(4, this.vKd);
      if (this.vKe != null)
        paramArrayOfObject.c(5, this.vKe);
      paramArrayOfObject.iz(6, this.Scene);
      AppMethodBeat.o(58892);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vKb == null)
        break label498;
    label498: for (paramInt = e.a.a.b.b.a.b(1, this.vKb) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.luF);
      paramInt = i;
      if (this.vKc != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.vKc);
      i = paramInt + e.a.a.b.b.a.bs(4, this.vKd);
      paramInt = i;
      if (this.vKe != null)
        paramInt = i + e.a.a.b.b.a.b(5, this.vKe);
      paramInt += e.a.a.b.b.a.bs(6, this.Scene);
      AppMethodBeat.o(58892);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58892);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        hl localhl = (hl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58892);
          break;
        case 1:
          localhl.vKb = locala.BTU.emu();
          AppMethodBeat.o(58892);
          paramInt = i;
          break;
        case 2:
          localhl.luF = locala.BTU.vd();
          AppMethodBeat.o(58892);
          paramInt = i;
          break;
        case 3:
          localhl.vKc = locala.BTU.emu();
          AppMethodBeat.o(58892);
          paramInt = i;
          break;
        case 4:
          localhl.vKd = locala.BTU.vd();
          AppMethodBeat.o(58892);
          paramInt = i;
          break;
        case 5:
          localhl.vKe = locala.BTU.emu();
          AppMethodBeat.o(58892);
          paramInt = i;
          break;
        case 6:
          localhl.Scene = locala.BTU.vd();
          AppMethodBeat.o(58892);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58892);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hl
 * JD-Core Version:    0.6.2
 */