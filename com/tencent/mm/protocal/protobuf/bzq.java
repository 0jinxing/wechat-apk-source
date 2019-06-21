package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzq extends com.tencent.mm.bt.a
{
  public String username;
  public int vMG;
  public int wzF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114988);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.iz(2, this.wzF);
      paramArrayOfObject.iz(3, this.vMG);
      AppMethodBeat.o(114988);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wzF) + e.a.a.b.b.a.bs(3, this.vMG);
      AppMethodBeat.o(114988);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114988);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzq localbzq = (bzq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114988);
          break;
        case 1:
          localbzq.username = locala.BTU.readString();
          AppMethodBeat.o(114988);
          paramInt = i;
          break;
        case 2:
          localbzq.wzF = locala.BTU.vd();
          AppMethodBeat.o(114988);
          paramInt = i;
          break;
        case 3:
          localbzq.vMG = locala.BTU.vd();
          AppMethodBeat.o(114988);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114988);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzq
 * JD-Core Version:    0.6.2
 */