package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s extends com.tencent.mm.bt.a
{
  public long jBP;
  public long jCm;
  public long jCn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18067);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.jBP);
      paramArrayOfObject.ai(2, this.jCm);
      paramArrayOfObject.ai(3, this.jCn);
      AppMethodBeat.o(18067);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.jBP) + 0 + e.a.a.b.b.a.o(2, this.jCm) + e.a.a.b.b.a.o(3, this.jCn);
        AppMethodBeat.o(18067);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(18067);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        s locals = (s)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18067);
          break;
        case 1:
          locals.jBP = locala.BTU.ve();
          AppMethodBeat.o(18067);
          paramInt = 0;
          break;
        case 2:
          locals.jCm = locala.BTU.ve();
          AppMethodBeat.o(18067);
          paramInt = 0;
          break;
        case 3:
          locals.jCn = locala.BTU.ve();
          AppMethodBeat.o(18067);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18067);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.s
 * JD-Core Version:    0.6.2
 */