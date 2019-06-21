package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bte extends com.tencent.mm.bt.a
{
  public int ret;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51001);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(51001);
        throw paramArrayOfObject;
      }
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.iz(2, this.ret);
      AppMethodBeat.o(51001);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label322;
    label322: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.ret);
      AppMethodBeat.o(51001);
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
          AppMethodBeat.o(51001);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51001);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bte localbte = (bte)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(51001);
          paramInt = -1;
          break;
        case 1:
          localbte.username = locala.BTU.readString();
          AppMethodBeat.o(51001);
          paramInt = i;
          break;
        case 2:
          localbte.ret = locala.BTU.vd();
          AppMethodBeat.o(51001);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(51001);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bte
 * JD-Core Version:    0.6.2
 */