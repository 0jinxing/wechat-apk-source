package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cti extends com.tencent.mm.bt.a
{
  public String vHl;
  public long xqp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28716);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Username");
        AppMethodBeat.o(28716);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.xqp);
      if (this.vHl != null)
        paramArrayOfObject.e(2, this.vHl);
      AppMethodBeat.o(28716);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.xqp) + 0;
        paramInt = i;
        if (this.vHl != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vHl);
        AppMethodBeat.o(28716);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Username");
          AppMethodBeat.o(28716);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28716);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cti localcti = (cti)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28716);
          paramInt = -1;
          break;
        case 1:
          localcti.xqp = locala.BTU.ve();
          AppMethodBeat.o(28716);
          paramInt = 0;
          break;
        case 2:
          localcti.vHl = locala.BTU.readString();
          AppMethodBeat.o(28716);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28716);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cti
 * JD-Core Version:    0.6.2
 */