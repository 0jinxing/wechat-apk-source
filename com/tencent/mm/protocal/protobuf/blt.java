package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class blt extends com.tencent.mm.bt.a
{
  public String wCK;
  public int wOO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28574);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wCK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Ip");
        AppMethodBeat.o(28574);
        throw paramArrayOfObject;
      }
      if (this.wCK != null)
        paramArrayOfObject.e(1, this.wCK);
      paramArrayOfObject.iz(2, this.wOO);
      AppMethodBeat.o(28574);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wCK == null)
        break label334;
    label334: for (paramInt = e.a.a.b.b.a.f(1, this.wCK) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wOO);
      AppMethodBeat.o(28574);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wCK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Ip");
          AppMethodBeat.o(28574);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28574);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        blt localblt = (blt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28574);
          paramInt = -1;
          break;
        case 1:
          localblt.wCK = locala.BTU.readString();
          AppMethodBeat.o(28574);
          paramInt = i;
          break;
        case 2:
          localblt.wOO = locala.BTU.vd();
          AppMethodBeat.o(28574);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28574);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blt
 * JD-Core Version:    0.6.2
 */