package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class cov extends com.tencent.mm.bt.a
{
  public long wen;
  public long xeF;
  public int xmD;
  public int xmE;
  public int xmF;
  public int xmG;
  public b xmH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(135450);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xeF);
      paramArrayOfObject.ai(2, this.wen);
      paramArrayOfObject.iz(3, this.xmD);
      paramArrayOfObject.iz(4, this.xmE);
      paramArrayOfObject.iz(5, this.xmF);
      paramArrayOfObject.iz(6, this.xmG);
      if (this.xmH != null)
        paramArrayOfObject.c(7, this.xmH);
      AppMethodBeat.o(135450);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.xeF) + 0 + e.a.a.b.b.a.o(2, this.wen) + e.a.a.b.b.a.bs(3, this.xmD) + e.a.a.b.b.a.bs(4, this.xmE) + e.a.a.b.b.a.bs(5, this.xmF) + e.a.a.b.b.a.bs(6, this.xmG);
        paramInt = i;
        if (this.xmH != null)
          paramInt = i + e.a.a.b.b.a.b(7, this.xmH);
        AppMethodBeat.o(135450);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135450);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cov localcov = (cov)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135450);
          break;
        case 1:
          localcov.xeF = locala.BTU.ve();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        case 2:
          localcov.wen = locala.BTU.ve();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        case 3:
          localcov.xmD = locala.BTU.vd();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        case 4:
          localcov.xmE = locala.BTU.vd();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        case 5:
          localcov.xmF = locala.BTU.vd();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        case 6:
          localcov.xmG = locala.BTU.vd();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        case 7:
          localcov.xmH = locala.BTU.emu();
          AppMethodBeat.o(135450);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(135450);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cov
 * JD-Core Version:    0.6.2
 */