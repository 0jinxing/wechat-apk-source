package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzt extends com.tencent.mm.bt.a
{
  public String wYO;
  public String wYP;
  public String wYQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28657);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wYO != null)
        paramArrayOfObject.e(1, this.wYO);
      if (this.wYP != null)
        paramArrayOfObject.e(2, this.wYP);
      if (this.wYQ != null)
        paramArrayOfObject.e(3, this.wYQ);
      AppMethodBeat.o(28657);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wYO == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.f(1, this.wYO) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wYP != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wYP);
      i = paramInt;
      if (this.wYQ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wYQ);
      AppMethodBeat.o(28657);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28657);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzt localbzt = (bzt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28657);
          break;
        case 1:
          localbzt.wYO = locala.BTU.readString();
          AppMethodBeat.o(28657);
          paramInt = i;
          break;
        case 2:
          localbzt.wYP = locala.BTU.readString();
          AppMethodBeat.o(28657);
          paramInt = i;
          break;
        case 3:
          localbzt.wYQ = locala.BTU.readString();
          AppMethodBeat.o(28657);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28657);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzt
 * JD-Core Version:    0.6.2
 */