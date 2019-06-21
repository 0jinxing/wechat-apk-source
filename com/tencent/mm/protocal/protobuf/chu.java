package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chu extends com.tencent.mm.bt.a
{
  public String name;
  public long timestamp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55707);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name != null)
        paramArrayOfObject.e(1, this.name);
      paramArrayOfObject.ai(2, this.timestamp);
      AppMethodBeat.o(55707);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.name) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.o(2, this.timestamp);
      AppMethodBeat.o(55707);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55707);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chu localchu = (chu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(55707);
          paramInt = -1;
          break;
        case 1:
          localchu.name = locala.BTU.readString();
          AppMethodBeat.o(55707);
          paramInt = i;
          break;
        case 2:
          localchu.timestamp = locala.BTU.ve();
          AppMethodBeat.o(55707);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(55707);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chu
 * JD-Core Version:    0.6.2
 */