package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class c extends com.tencent.mm.bt.a
{
  public int jBh;
  public b jBi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18046);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jBh);
      if (this.jBi != null)
        paramArrayOfObject.c(2, this.jBi);
      AppMethodBeat.o(18046);
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
        AppMethodBeat.o(18046);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(18046);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(18046);
          paramInt = -1;
          break;
        case 1:
          localc.jBh = locala.BTU.vd();
          AppMethodBeat.o(18046);
          paramInt = 0;
          break;
        case 2:
          localc.jBi = locala.BTU.emu();
          AppMethodBeat.o(18046);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(18046);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.c
 * JD-Core Version:    0.6.2
 */