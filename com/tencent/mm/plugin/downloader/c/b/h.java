package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h extends com.tencent.mm.bt.a
{
  public int id;
  public String name;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35534);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.id);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      AppMethodBeat.o(35534);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.id) + 0;
        paramInt = i;
        if (this.name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.name);
        AppMethodBeat.o(35534);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35534);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(35534);
          paramInt = -1;
          break;
        case 1:
          localh.id = locala.BTU.vd();
          AppMethodBeat.o(35534);
          paramInt = 0;
          break;
        case 2:
          localh.name = locala.BTU.readString();
          AppMethodBeat.o(35534);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(35534);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.h
 * JD-Core Version:    0.6.2
 */