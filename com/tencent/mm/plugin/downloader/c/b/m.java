package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m extends com.tencent.mm.bt.a
{
  public String kLI;
  public String kLJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35539);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kLI != null)
        paramArrayOfObject.e(1, this.kLI);
      if (this.kLJ != null)
        paramArrayOfObject.e(2, this.kLJ);
      AppMethodBeat.o(35539);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kLI == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.f(1, this.kLI) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kLJ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kLJ);
      AppMethodBeat.o(35539);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35539);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(35539);
          paramInt = -1;
          break;
        case 1:
          localm.kLI = locala.BTU.readString();
          AppMethodBeat.o(35539);
          paramInt = i;
          break;
        case 2:
          localm.kLJ = locala.BTU.readString();
          AppMethodBeat.o(35539);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(35539);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.m
 * JD-Core Version:    0.6.2
 */