package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class ata extends com.tencent.mm.bt.a
{
  public long cSh;
  public b wwO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70474);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.cSh);
      if (this.wwO != null)
        paramArrayOfObject.c(2, this.wwO);
      AppMethodBeat.o(70474);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.cSh) + 0;
        paramInt = i;
        if (this.wwO != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.wwO);
        AppMethodBeat.o(70474);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(70474);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ata localata = (ata)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(70474);
          paramInt = -1;
          break;
        case 1:
          localata.cSh = locala.BTU.ve();
          AppMethodBeat.o(70474);
          paramInt = 0;
          break;
        case 2:
          localata.wwO = locala.BTU.emu();
          AppMethodBeat.o(70474);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(70474);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ata
 * JD-Core Version:    0.6.2
 */