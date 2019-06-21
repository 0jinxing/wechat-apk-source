package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g extends com.tencent.mm.bt.a
{
  public int FileSize;
  public int jBT;
  public int ptD;
  public String ptE;
  public long ptF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(67926);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ptD);
      if (this.ptE != null)
        paramArrayOfObject.e(2, this.ptE);
      paramArrayOfObject.iz(3, this.jBT);
      paramArrayOfObject.iz(4, this.FileSize);
      paramArrayOfObject.ai(5, this.ptF);
      AppMethodBeat.o(67926);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.ptD) + 0;
        paramInt = i;
        if (this.ptE != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ptE);
        paramInt = paramInt + e.a.a.b.b.a.bs(3, this.jBT) + e.a.a.b.b.a.bs(4, this.FileSize) + e.a.a.b.b.a.o(5, this.ptF);
        AppMethodBeat.o(67926);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(67926);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(67926);
          break;
        case 1:
          localg.ptD = locala.BTU.vd();
          AppMethodBeat.o(67926);
          paramInt = 0;
          break;
        case 2:
          localg.ptE = locala.BTU.readString();
          AppMethodBeat.o(67926);
          paramInt = 0;
          break;
        case 3:
          localg.jBT = locala.BTU.vd();
          AppMethodBeat.o(67926);
          paramInt = 0;
          break;
        case 4:
          localg.FileSize = locala.BTU.vd();
          AppMethodBeat.o(67926);
          paramInt = 0;
          break;
        case 5:
          localg.ptF = locala.BTU.ve();
          AppMethodBeat.o(67926);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(67926);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.g
 * JD-Core Version:    0.6.2
 */