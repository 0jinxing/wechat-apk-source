package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ayj extends com.tencent.mm.bt.a
{
  public String vLl;
  public String vLm;
  public String vLn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60043);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLm != null)
        paramArrayOfObject.e(1, this.vLm);
      if (this.vLl != null)
        paramArrayOfObject.e(2, this.vLl);
      if (this.vLn != null)
        paramArrayOfObject.e(3, this.vLn);
      AppMethodBeat.o(60043);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vLm == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.vLm) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vLl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vLl);
      i = paramInt;
      if (this.vLn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLn);
      AppMethodBeat.o(60043);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60043);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ayj localayj = (ayj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60043);
          break;
        case 1:
          localayj.vLm = locala.BTU.readString();
          AppMethodBeat.o(60043);
          paramInt = i;
          break;
        case 2:
          localayj.vLl = locala.BTU.readString();
          AppMethodBeat.o(60043);
          paramInt = i;
          break;
        case 3:
          localayj.vLn = locala.BTU.readString();
          AppMethodBeat.o(60043);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60043);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayj
 * JD-Core Version:    0.6.2
 */