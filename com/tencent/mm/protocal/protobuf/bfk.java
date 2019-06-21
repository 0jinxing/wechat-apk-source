package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class bfk extends com.tencent.mm.bt.a
{
  public int wJl;
  public b wJm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(93799);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wJl);
      if (this.wJm != null)
        paramArrayOfObject.c(2, this.wJm);
      AppMethodBeat.o(93799);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wJl) + 0;
        paramInt = i;
        if (this.wJm != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.wJm);
        AppMethodBeat.o(93799);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93799);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bfk localbfk = (bfk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(93799);
          paramInt = -1;
          break;
        case 1:
          localbfk.wJl = locala.BTU.vd();
          AppMethodBeat.o(93799);
          paramInt = 0;
          break;
        case 2:
          localbfk.wJm = locala.BTU.emu();
          AppMethodBeat.o(93799);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(93799);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfk
 * JD-Core Version:    0.6.2
 */