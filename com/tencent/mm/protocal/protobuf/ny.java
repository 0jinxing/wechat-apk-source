package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ny extends com.tencent.mm.bt.a
{
  public int tIE;
  public String ttg;
  public String tzW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89035);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.tzW != null)
        paramArrayOfObject.e(1, this.tzW);
      if (this.ttg != null)
        paramArrayOfObject.e(2, this.ttg);
      paramArrayOfObject.iz(3, this.tIE);
      AppMethodBeat.o(89035);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.tzW == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.tzW) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ttg != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ttg);
      paramInt = i + e.a.a.b.b.a.bs(3, this.tIE);
      AppMethodBeat.o(89035);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89035);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ny localny = (ny)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89035);
          break;
        case 1:
          localny.tzW = locala.BTU.readString();
          AppMethodBeat.o(89035);
          paramInt = i;
          break;
        case 2:
          localny.ttg = locala.BTU.readString();
          AppMethodBeat.o(89035);
          paramInt = i;
          break;
        case 3:
          localny.tIE = locala.BTU.vd();
          AppMethodBeat.o(89035);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89035);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ny
 * JD-Core Version:    0.6.2
 */