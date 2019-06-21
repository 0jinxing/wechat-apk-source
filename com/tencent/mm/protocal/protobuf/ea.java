package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ea extends com.tencent.mm.bt.a
{
  public String fns;
  public String key;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14682);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.key != null)
        paramArrayOfObject.e(1, this.key);
      if (this.fns != null)
        paramArrayOfObject.e(2, this.fns);
      AppMethodBeat.o(14682);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.key == null)
        break label298;
    label298: for (i = e.a.a.b.b.a.f(1, this.key) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fns != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fns);
      AppMethodBeat.o(14682);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14682);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ea localea = (ea)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(14682);
          paramInt = -1;
          break;
        case 1:
          localea.key = locala.BTU.readString();
          AppMethodBeat.o(14682);
          paramInt = i;
          break;
        case 2:
          localea.fns = locala.BTU.readString();
          AppMethodBeat.o(14682);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14682);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ea
 * JD-Core Version:    0.6.2
 */