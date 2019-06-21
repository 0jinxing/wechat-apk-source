package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends com.tencent.mm.bt.a
{
  public String kKq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35510);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kKq != null)
        paramArrayOfObject.e(1, this.kKq);
      AppMethodBeat.o(35510);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kKq == null)
        break label227;
    label227: for (paramInt = e.a.a.b.b.a.f(1, this.kKq) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(35510);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35510);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(35510);
          paramInt = -1;
          break;
        case 1:
          localc.kKq = locala.BTU.readString();
          AppMethodBeat.o(35510);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(35510);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.c
 * JD-Core Version:    0.6.2
 */