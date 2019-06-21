package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends com.tencent.mm.bt.a
{
  public int erD;
  public String nWy;
  public String nWz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56608);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.erD);
      if (this.nWy != null)
        paramArrayOfObject.e(2, this.nWy);
      if (this.nWz != null)
        paramArrayOfObject.e(3, this.nWz);
      AppMethodBeat.o(56608);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.erD) + 0;
        paramInt = i;
        if (this.nWy != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.nWy);
        i = paramInt;
        if (this.nWz != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.nWz);
        AppMethodBeat.o(56608);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56608);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56608);
          break;
        case 1:
          locale.erD = locala.BTU.vd();
          AppMethodBeat.o(56608);
          paramInt = 0;
          break;
        case 2:
          locale.nWy = locala.BTU.readString();
          AppMethodBeat.o(56608);
          paramInt = 0;
          break;
        case 3:
          locale.nWz = locala.BTU.readString();
          AppMethodBeat.o(56608);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56608);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.e
 * JD-Core Version:    0.6.2
 */