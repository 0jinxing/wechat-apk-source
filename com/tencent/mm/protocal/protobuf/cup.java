package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cup extends com.tencent.mm.bt.a
{
  public int Scene;
  public String vQq;
  public String wdO;
  public String wyw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28757);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Talker");
        AppMethodBeat.o(28757);
        throw paramArrayOfObject;
      }
      if (this.wdO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MD5");
        AppMethodBeat.o(28757);
        throw paramArrayOfObject;
      }
      if (this.vQq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductId");
        AppMethodBeat.o(28757);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      if (this.wdO != null)
        paramArrayOfObject.e(2, this.wdO);
      if (this.vQq != null)
        paramArrayOfObject.e(3, this.vQq);
      paramArrayOfObject.iz(4, this.Scene);
      AppMethodBeat.o(28757);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label562;
    label562: for (i = e.a.a.b.b.a.f(1, this.wyw) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wdO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wdO);
      i = paramInt;
      if (this.vQq != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vQq);
      paramInt = i + e.a.a.b.b.a.bs(4, this.Scene);
      AppMethodBeat.o(28757);
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
          AppMethodBeat.o(28757);
          throw paramArrayOfObject;
        }
        if (this.wdO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MD5");
          AppMethodBeat.o(28757);
          throw paramArrayOfObject;
        }
        if (this.vQq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductId");
          AppMethodBeat.o(28757);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28757);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cup localcup = (cup)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28757);
          break;
        case 1:
          localcup.wyw = locala.BTU.readString();
          AppMethodBeat.o(28757);
          paramInt = i;
          break;
        case 2:
          localcup.wdO = locala.BTU.readString();
          AppMethodBeat.o(28757);
          paramInt = i;
          break;
        case 3:
          localcup.vQq = locala.BTU.readString();
          AppMethodBeat.o(28757);
          paramInt = i;
          break;
        case 4:
          localcup.Scene = locala.BTU.vd();
          AppMethodBeat.o(28757);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28757);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cup
 * JD-Core Version:    0.6.2
 */