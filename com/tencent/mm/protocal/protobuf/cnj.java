package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cnj extends com.tencent.mm.bt.a
{
  public String username;
  public String xkS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28696);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.xkS != null)
        paramArrayOfObject.e(2, this.xkS);
      AppMethodBeat.o(28696);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label298;
    label298: for (i = e.a.a.b.b.a.f(1, this.username) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xkS != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xkS);
      AppMethodBeat.o(28696);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28696);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cnj localcnj = (cnj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28696);
          paramInt = -1;
          break;
        case 1:
          localcnj.username = locala.BTU.readString();
          AppMethodBeat.o(28696);
          paramInt = i;
          break;
        case 2:
          localcnj.xkS = locala.BTU.readString();
          AppMethodBeat.o(28696);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28696);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnj
 * JD-Core Version:    0.6.2
 */