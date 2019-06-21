package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class zm extends com.tencent.mm.bt.a
{
  public String weG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28397);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.weG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: LoginUrl");
        AppMethodBeat.o(28397);
        throw paramArrayOfObject;
      }
      if (this.weG != null)
        paramArrayOfObject.e(1, this.weG);
      AppMethodBeat.o(28397);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.weG == null)
        break label286;
    label286: for (paramInt = e.a.a.b.b.a.f(1, this.weG) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(28397);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.weG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: LoginUrl");
          AppMethodBeat.o(28397);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28397);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zm localzm = (zm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28397);
          paramInt = -1;
          break;
        case 1:
          localzm.weG = locala.BTU.readString();
          AppMethodBeat.o(28397);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28397);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zm
 * JD-Core Version:    0.6.2
 */