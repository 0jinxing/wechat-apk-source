package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aco extends com.tencent.mm.bt.a
{
  public int weB;
  public String wkk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73706);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.weB);
      if (this.wkk != null)
        paramArrayOfObject.e(2, this.wkk);
      AppMethodBeat.o(73706);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.weB) + 0;
        paramInt = i;
        if (this.wkk != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wkk);
        AppMethodBeat.o(73706);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73706);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aco localaco = (aco)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(73706);
          paramInt = -1;
          break;
        case 1:
          localaco.weB = locala.BTU.vd();
          AppMethodBeat.o(73706);
          paramInt = 0;
          break;
        case 2:
          localaco.wkk = locala.BTU.readString();
          AppMethodBeat.o(73706);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(73706);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aco
 * JD-Core Version:    0.6.2
 */