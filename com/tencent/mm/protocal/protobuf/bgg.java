package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bgg extends com.tencent.mm.bt.a
{
  public String naq;
  public int wKo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80133);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wKo);
      if (this.naq != null)
        paramArrayOfObject.e(2, this.naq);
      AppMethodBeat.o(80133);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wKo) + 0;
        paramInt = i;
        if (this.naq != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.naq);
        AppMethodBeat.o(80133);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80133);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bgg localbgg = (bgg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80133);
          paramInt = -1;
          break;
        case 1:
          localbgg.wKo = locala.BTU.vd();
          AppMethodBeat.o(80133);
          paramInt = 0;
          break;
        case 2:
          localbgg.naq = locala.BTU.readString();
          AppMethodBeat.o(80133);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(80133);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgg
 * JD-Core Version:    0.6.2
 */