package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cur extends com.tencent.mm.bt.a
{
  public int Scene;
  public String wdK;
  public String wyw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28759);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Talker");
        AppMethodBeat.o(28759);
        throw paramArrayOfObject;
      }
      if (this.wdK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Text");
        AppMethodBeat.o(28759);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      if (this.wdK != null)
        paramArrayOfObject.e(2, this.wdK);
      paramArrayOfObject.iz(3, this.Scene);
      AppMethodBeat.o(28759);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label446;
    label446: for (paramInt = e.a.a.b.b.a.f(1, this.wyw) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wdK != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wdK);
      paramInt = i + e.a.a.b.b.a.bs(3, this.Scene);
      AppMethodBeat.o(28759);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Talker");
          AppMethodBeat.o(28759);
          throw paramArrayOfObject;
        }
        if (this.wdK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Text");
          AppMethodBeat.o(28759);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28759);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cur localcur = (cur)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28759);
          break;
        case 1:
          localcur.wyw = locala.BTU.readString();
          AppMethodBeat.o(28759);
          paramInt = i;
          break;
        case 2:
          localcur.wdK = locala.BTU.readString();
          AppMethodBeat.o(28759);
          paramInt = i;
          break;
        case 3:
          localcur.Scene = locala.BTU.vd();
          AppMethodBeat.o(28759);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28759);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cur
 * JD-Core Version:    0.6.2
 */