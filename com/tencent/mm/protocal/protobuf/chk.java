package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class chk extends com.tencent.mm.bt.a
{
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51007);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(51007);
        throw paramArrayOfObject;
      }
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      AppMethodBeat.o(51007);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label275;
    label275: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(51007);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(51007);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51007);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chk localchk = (chk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(51007);
          paramInt = -1;
          break;
        case 1:
          localchk.username = locala.BTU.readString();
          AppMethodBeat.o(51007);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(51007);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chk
 * JD-Core Version:    0.6.2
 */