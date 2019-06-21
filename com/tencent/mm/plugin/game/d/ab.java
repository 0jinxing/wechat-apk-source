package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ab extends com.tencent.mm.bt.a
{
  public String nax;
  public String nay;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111566);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nax != null)
        paramArrayOfObject.e(1, this.nax);
      if (this.nay != null)
        paramArrayOfObject.e(2, this.nay);
      AppMethodBeat.o(111566);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nax == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.nax) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nay != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nay);
      AppMethodBeat.o(111566);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111566);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ab localab = (ab)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111566);
          paramInt = -1;
          break;
        case 1:
          localab.nax = locala.BTU.readString();
          AppMethodBeat.o(111566);
          paramInt = i;
          break;
        case 2:
          localab.nay = locala.BTU.readString();
          AppMethodBeat.o(111566);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111566);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ab
 * JD-Core Version:    0.6.2
 */