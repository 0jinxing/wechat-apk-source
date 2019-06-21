package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bz extends com.tencent.mm.bt.a
{
  public String cIY;
  public String desc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111633);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cIY != null)
        paramArrayOfObject.e(1, this.cIY);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      AppMethodBeat.o(111633);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cIY == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.cIY) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.desc);
      AppMethodBeat.o(111633);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111633);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bz localbz = (bz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111633);
          paramInt = -1;
          break;
        case 1:
          localbz.cIY = locala.BTU.readString();
          AppMethodBeat.o(111633);
          paramInt = i;
          break;
        case 2:
          localbz.desc = locala.BTU.readString();
          AppMethodBeat.o(111633);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111633);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bz
 * JD-Core Version:    0.6.2
 */