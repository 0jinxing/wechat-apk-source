package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cyj extends com.tencent.mm.bt.a
{
  public int timestamp;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28772);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(28772);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.timestamp);
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      AppMethodBeat.o(28772);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.timestamp) + 0;
        paramInt = i;
        if (this.username != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.username);
        AppMethodBeat.o(28772);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(28772);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28772);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cyj localcyj = (cyj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28772);
          paramInt = -1;
          break;
        case 1:
          localcyj.timestamp = locala.BTU.vd();
          AppMethodBeat.o(28772);
          paramInt = 0;
          break;
        case 2:
          localcyj.username = locala.BTU.readString();
          AppMethodBeat.o(28772);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28772);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cyj
 * JD-Core Version:    0.6.2
 */