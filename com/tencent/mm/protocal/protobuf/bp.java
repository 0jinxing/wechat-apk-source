package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class bp extends com.tencent.mm.bt.a
{
  public int vDS;
  public b vDT;
  public long vDU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94500);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vDS);
      if (this.vDT != null)
        paramArrayOfObject.c(2, this.vDT);
      paramArrayOfObject.ai(3, this.vDU);
      AppMethodBeat.o(94500);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vDS) + 0;
        paramInt = i;
        if (this.vDT != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.vDT);
        paramInt += e.a.a.b.b.a.o(3, this.vDU);
        AppMethodBeat.o(94500);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94500);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bp localbp = (bp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94500);
          break;
        case 1:
          localbp.vDS = locala.BTU.vd();
          AppMethodBeat.o(94500);
          paramInt = 0;
          break;
        case 2:
          localbp.vDT = locala.BTU.emu();
          AppMethodBeat.o(94500);
          paramInt = 0;
          break;
        case 3:
          localbp.vDU = locala.BTU.ve();
          AppMethodBeat.o(94500);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94500);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bp
 * JD-Core Version:    0.6.2
 */