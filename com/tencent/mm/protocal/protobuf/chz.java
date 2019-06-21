package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class chz extends com.tencent.mm.bt.a
{
  public b vPM;
  public int vPN;
  public int xhl;
  public int xhm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56990);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(7, this.xhl);
      if (this.vPM != null)
        paramArrayOfObject.c(8, this.vPM);
      paramArrayOfObject.iz(9, this.vPN);
      paramArrayOfObject.iz(10, this.xhm);
      AppMethodBeat.o(56990);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(7, this.xhl) + 0;
        paramInt = i;
        if (this.vPM != null)
          paramInt = i + e.a.a.b.b.a.b(8, this.vPM);
        paramInt = paramInt + e.a.a.b.b.a.bs(9, this.vPN) + e.a.a.b.b.a.bs(10, this.xhm);
        AppMethodBeat.o(56990);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56990);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chz localchz = (chz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(56990);
          paramInt = -1;
          break;
        case 7:
          localchz.xhl = locala.BTU.vd();
          AppMethodBeat.o(56990);
          paramInt = 0;
          break;
        case 8:
          localchz.vPM = locala.BTU.emu();
          AppMethodBeat.o(56990);
          paramInt = 0;
          break;
        case 9:
          localchz.vPN = locala.BTU.vd();
          AppMethodBeat.o(56990);
          paramInt = 0;
          break;
        case 10:
          localchz.xhm = locala.BTU.vd();
          AppMethodBeat.o(56990);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(56990);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chz
 * JD-Core Version:    0.6.2
 */