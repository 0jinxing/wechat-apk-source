package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l extends com.tencent.mm.bt.a
{
  public long duration;
  public long interval;
  public long kLH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35538);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.duration);
      paramArrayOfObject.ai(2, this.interval);
      paramArrayOfObject.ai(3, this.kLH);
      AppMethodBeat.o(35538);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.duration) + 0 + e.a.a.b.b.a.o(2, this.interval) + e.a.a.b.b.a.o(3, this.kLH);
        AppMethodBeat.o(35538);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35538);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        l locall = (l)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35538);
          break;
        case 1:
          locall.duration = locala.BTU.ve();
          AppMethodBeat.o(35538);
          paramInt = 0;
          break;
        case 2:
          locall.interval = locala.BTU.ve();
          AppMethodBeat.o(35538);
          paramInt = 0;
          break;
        case 3:
          locall.kLH = locala.BTU.ve();
          AppMethodBeat.o(35538);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(35538);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.l
 * JD-Core Version:    0.6.2
 */