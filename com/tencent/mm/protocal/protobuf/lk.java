package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.storage.ad;
import e.a.a.b;

public final class lk extends com.tencent.mm.bt.a
{
  public ad ehM;
  public d pkW;
  public String userName;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14716);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.userName == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: userName");
        AppMethodBeat.o(14716);
        throw paramArrayOfObject;
      }
      if (this.userName != null)
        paramArrayOfObject.e(1, this.userName);
      AppMethodBeat.o(14716);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.userName == null)
        break label286;
    label286: for (paramInt = e.a.a.b.b.a.f(1, this.userName) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(14716);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.userName == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: userName");
          AppMethodBeat.o(14716);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(14716);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        lk locallk = (lk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(14716);
          paramInt = -1;
          break;
        case 1:
          locallk.userName = locala.BTU.readString();
          AppMethodBeat.o(14716);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14716);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lk
 * JD-Core Version:    0.6.2
 */