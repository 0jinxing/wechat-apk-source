package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cqq extends com.tencent.mm.bt.a
{
  public String wyn;
  public long xox;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(102398);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.xox);
      if (this.wyn != null)
        paramArrayOfObject.e(2, this.wyn);
      AppMethodBeat.o(102398);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.xox) + 0;
        paramInt = i;
        if (this.wyn != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wyn);
        AppMethodBeat.o(102398);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102398);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cqq localcqq = (cqq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(102398);
          paramInt = -1;
          break;
        case 1:
          localcqq.xox = locala.BTU.ve();
          AppMethodBeat.o(102398);
          paramInt = 0;
          break;
        case 2:
          localcqq.wyn = locala.BTU.readString();
          AppMethodBeat.o(102398);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(102398);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqq
 * JD-Core Version:    0.6.2
 */