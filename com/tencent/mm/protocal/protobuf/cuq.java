package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cuq extends com.tencent.mm.bt.a
{
  public int Scene;
  public String vQq;
  public String wdK;
  public String wdO;
  public String wyw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28758);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Talker");
        AppMethodBeat.o(28758);
        throw paramArrayOfObject;
      }
      if (this.wdK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Text");
        AppMethodBeat.o(28758);
        throw paramArrayOfObject;
      }
      if (this.wdO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MD5");
        AppMethodBeat.o(28758);
        throw paramArrayOfObject;
      }
      if (this.vQq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductId");
        AppMethodBeat.o(28758);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      if (this.wdK != null)
        paramArrayOfObject.e(2, this.wdK);
      if (this.wdO != null)
        paramArrayOfObject.e(3, this.wdO);
      if (this.vQq != null)
        paramArrayOfObject.e(4, this.vQq);
      paramArrayOfObject.iz(5, this.Scene);
      AppMethodBeat.o(28758);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label674;
    label674: for (paramInt = e.a.a.b.b.a.f(1, this.wyw) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wdK != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wdK);
      paramInt = i;
      if (this.wdO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wdO);
      i = paramInt;
      if (this.vQq != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vQq);
      paramInt = i + e.a.a.b.b.a.bs(5, this.Scene);
      AppMethodBeat.o(28758);
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
          AppMethodBeat.o(28758);
          throw paramArrayOfObject;
        }
        if (this.wdK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Text");
          AppMethodBeat.o(28758);
          throw paramArrayOfObject;
        }
        if (this.wdO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MD5");
          AppMethodBeat.o(28758);
          throw paramArrayOfObject;
        }
        if (this.vQq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductId");
          AppMethodBeat.o(28758);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28758);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuq localcuq = (cuq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28758);
          break;
        case 1:
          localcuq.wyw = locala.BTU.readString();
          AppMethodBeat.o(28758);
          paramInt = i;
          break;
        case 2:
          localcuq.wdK = locala.BTU.readString();
          AppMethodBeat.o(28758);
          paramInt = i;
          break;
        case 3:
          localcuq.wdO = locala.BTU.readString();
          AppMethodBeat.o(28758);
          paramInt = i;
          break;
        case 4:
          localcuq.vQq = locala.BTU.readString();
          AppMethodBeat.o(28758);
          paramInt = i;
          break;
        case 5:
          localcuq.Scene = locala.BTU.vd();
          AppMethodBeat.o(28758);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28758);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuq
 * JD-Core Version:    0.6.2
 */