package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class civ extends com.tencent.mm.bt.a
{
  public String xhJ;
  public String xhK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94636);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xhJ != null)
        paramArrayOfObject.e(1, this.xhJ);
      if (this.xhK != null)
        paramArrayOfObject.e(2, this.xhK);
      AppMethodBeat.o(94636);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xhJ == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.xhJ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xhK != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xhK);
      AppMethodBeat.o(94636);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94636);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        civ localciv = (civ)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(94636);
          paramInt = -1;
          break;
        case 1:
          localciv.xhJ = locala.BTU.readString();
          AppMethodBeat.o(94636);
          paramInt = i;
          break;
        case 2:
          localciv.xhK = locala.BTU.readString();
          AppMethodBeat.o(94636);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94636);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.civ
 * JD-Core Version:    0.6.2
 */