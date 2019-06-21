package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends com.tencent.mm.bt.a
{
  public int month;
  public String pcO;
  public int year;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56617);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.year);
      paramArrayOfObject.iz(2, this.month);
      if (this.pcO != null)
        paramArrayOfObject.e(3, this.pcO);
      AppMethodBeat.o(56617);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.year) + 0 + e.a.a.b.b.a.bs(2, this.month);
        paramInt = i;
        if (this.pcO != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.pcO);
        AppMethodBeat.o(56617);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56617);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56617);
          break;
        case 1:
          locald.year = locala.BTU.vd();
          AppMethodBeat.o(56617);
          paramInt = 0;
          break;
        case 2:
          locald.month = locala.BTU.vd();
          AppMethodBeat.o(56617);
          paramInt = 0;
          break;
        case 3:
          locald.pcO = locala.BTU.readString();
          AppMethodBeat.o(56617);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56617);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.d
 * JD-Core Version:    0.6.2
 */