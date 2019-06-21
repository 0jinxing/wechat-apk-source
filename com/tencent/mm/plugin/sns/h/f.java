package com.tencent.mm.plugin.sns.h;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends com.tencent.mm.bt.a
{
  public int qQn;
  public long qQp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(36829);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.qQp);
      paramArrayOfObject.iz(2, this.qQn);
      AppMethodBeat.o(36829);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.qQp) + 0 + e.a.a.b.b.a.bs(2, this.qQn);
        AppMethodBeat.o(36829);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(36829);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        f localf = (f)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(36829);
          paramInt = -1;
          break;
        case 1:
          localf.qQp = locala.BTU.ve();
          AppMethodBeat.o(36829);
          paramInt = 0;
          break;
        case 2:
          localf.qQn = locala.BTU.vd();
          AppMethodBeat.o(36829);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(36829);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.f
 * JD-Core Version:    0.6.2
 */