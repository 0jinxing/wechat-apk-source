package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bxh extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b wBe;
  public com.tencent.mm.bt.b wXp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124362);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wXp == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Name");
        AppMethodBeat.o(124362);
        throw paramArrayOfObject;
      }
      if (this.wBe == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Value");
        AppMethodBeat.o(124362);
        throw paramArrayOfObject;
      }
      if (this.wXp != null)
        paramArrayOfObject.c(1, this.wXp);
      if (this.wBe != null)
        paramArrayOfObject.c(2, this.wBe);
      AppMethodBeat.o(124362);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wXp == null)
        break label390;
    label390: for (paramInt = e.a.a.b.b.a.b(1, this.wXp) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wBe != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.wBe);
      AppMethodBeat.o(124362);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wXp == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Name");
          AppMethodBeat.o(124362);
          throw paramArrayOfObject;
        }
        if (this.wBe == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Value");
          AppMethodBeat.o(124362);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124362);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bxh localbxh = (bxh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(124362);
          paramInt = -1;
          break;
        case 1:
          localbxh.wXp = locala.BTU.emu();
          AppMethodBeat.o(124362);
          paramInt = i;
          break;
        case 2:
          localbxh.wBe = locala.BTU.emu();
          AppMethodBeat.o(124362);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(124362);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bxh
 * JD-Core Version:    0.6.2
 */