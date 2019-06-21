package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ach extends com.tencent.mm.bt.a
{
  public int hzv;
  public int index;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28407);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.index);
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      paramArrayOfObject.iz(3, this.hzv);
      AppMethodBeat.o(28407);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.index) + 0;
        paramInt = i;
        if (this.username != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.username);
        paramInt += e.a.a.b.b.a.bs(3, this.hzv);
        AppMethodBeat.o(28407);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28407);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ach localach = (ach)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28407);
          break;
        case 1:
          localach.index = locala.BTU.vd();
          AppMethodBeat.o(28407);
          paramInt = 0;
          break;
        case 2:
          localach.username = locala.BTU.readString();
          AppMethodBeat.o(28407);
          paramInt = 0;
          break;
        case 3:
          localach.hzv = locala.BTU.vd();
          AppMethodBeat.o(28407);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28407);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ach
 * JD-Core Version:    0.6.2
 */