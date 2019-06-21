package com.tencent.mm.plugin.exdevice.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends com.tencent.mm.bt.a
{
  public int luF;
  public String luG;
  public String luH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(19415);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.luF);
      if (this.luG != null)
        paramArrayOfObject.e(2, this.luG);
      if (this.luH != null)
        paramArrayOfObject.e(3, this.luH);
      AppMethodBeat.o(19415);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.luF) + 0;
        paramInt = i;
        if (this.luG != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.luG);
        i = paramInt;
        if (this.luH != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.luH);
        AppMethodBeat.o(19415);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(19415);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        a locala1 = (a)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(19415);
          break;
        case 1:
          locala1.luF = locala.BTU.vd();
          AppMethodBeat.o(19415);
          paramInt = 0;
          break;
        case 2:
          locala1.luG = locala.BTU.readString();
          AppMethodBeat.o(19415);
          paramInt = 0;
          break;
        case 3:
          locala1.luH = locala.BTU.readString();
          AppMethodBeat.o(19415);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(19415);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.d.a
 * JD-Core Version:    0.6.2
 */