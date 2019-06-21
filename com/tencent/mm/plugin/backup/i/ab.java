package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class ab extends com.tencent.mm.bt.a
{
  public long jBS;
  public int jBh;
  public b jBi;
  public int jCI;
  public int jCJ;
  public long jCK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18077);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jBh);
      if (this.jBi != null)
        paramArrayOfObject.c(2, this.jBi);
      paramArrayOfObject.iz(3, this.jCI);
      paramArrayOfObject.iz(4, this.jCJ);
      paramArrayOfObject.ai(5, this.jCK);
      paramArrayOfObject.ai(6, this.jBS);
      AppMethodBeat.o(18077);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jBh) + 0;
        paramInt = i;
        if (this.jBi != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.jBi);
        paramInt = paramInt + e.a.a.b.b.a.bs(3, this.jCI) + e.a.a.b.b.a.bs(4, this.jCJ) + e.a.a.b.b.a.o(5, this.jCK) + e.a.a.b.b.a.o(6, this.jBS);
        AppMethodBeat.o(18077);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(18077);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ab localab = (ab)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18077);
          break;
        case 1:
          localab.jBh = locala.BTU.vd();
          AppMethodBeat.o(18077);
          paramInt = 0;
          break;
        case 2:
          localab.jBi = locala.BTU.emu();
          AppMethodBeat.o(18077);
          paramInt = 0;
          break;
        case 3:
          localab.jCI = locala.BTU.vd();
          AppMethodBeat.o(18077);
          paramInt = 0;
          break;
        case 4:
          localab.jCJ = locala.BTU.vd();
          AppMethodBeat.o(18077);
          paramInt = 0;
          break;
        case 5:
          localab.jCK = locala.BTU.ve();
          AppMethodBeat.o(18077);
          paramInt = 0;
          break;
        case 6:
          localab.jBS = locala.BTU.ve();
          AppMethodBeat.o(18077);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.ab
 * JD-Core Version:    0.6.2
 */