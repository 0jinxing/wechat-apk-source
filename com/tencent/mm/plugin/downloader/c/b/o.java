package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o extends com.tencent.mm.bt.a
{
  public String kLS;
  public String kdF;
  public int type;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35541);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.kLS != null)
        paramArrayOfObject.e(2, this.kLS);
      if (this.kdF != null)
        paramArrayOfObject.e(3, this.kdF);
      AppMethodBeat.o(35541);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.kLS != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.kLS);
        i = paramInt;
        if (this.kdF != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.kdF);
        AppMethodBeat.o(35541);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35541);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        o localo = (o)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35541);
          break;
        case 1:
          localo.type = locala.BTU.vd();
          AppMethodBeat.o(35541);
          paramInt = 0;
          break;
        case 2:
          localo.kLS = locala.BTU.readString();
          AppMethodBeat.o(35541);
          paramInt = 0;
          break;
        case 3:
          localo.kdF = locala.BTU.readString();
          AppMethodBeat.o(35541);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(35541);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.o
 * JD-Core Version:    0.6.2
 */