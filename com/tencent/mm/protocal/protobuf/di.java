package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class di extends com.tencent.mm.bt.a
{
  public String vFm;
  public String vFn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28311);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFm != null)
        paramArrayOfObject.e(1, this.vFm);
      if (this.vFn != null)
        paramArrayOfObject.e(2, this.vFn);
      AppMethodBeat.o(28311);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFm == null)
        break label302;
    label302: for (paramInt = e.a.a.b.b.a.f(1, this.vFm) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFn != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFn);
      AppMethodBeat.o(28311);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28311);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        di localdi = (di)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28311);
          paramInt = -1;
          break;
        case 1:
          localdi.vFm = locala.BTU.readString();
          AppMethodBeat.o(28311);
          paramInt = i;
          break;
        case 2:
          localdi.vFn = locala.BTU.readString();
          AppMethodBeat.o(28311);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28311);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.di
 * JD-Core Version:    0.6.2
 */