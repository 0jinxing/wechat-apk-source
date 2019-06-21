package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxa extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b vMS;
  public LinkedList<cwx> vMT;
  public String xfb;

  public cxa()
  {
    AppMethodBeat.i(96338);
    this.vMT = new LinkedList();
    AppMethodBeat.o(96338);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96339);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xfb == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: WxaUserName");
        AppMethodBeat.o(96339);
        throw paramArrayOfObject;
      }
      if (this.xfb != null)
        paramArrayOfObject.e(1, this.xfb);
      if (this.vMS != null)
        paramArrayOfObject.c(2, this.vMS);
      paramArrayOfObject.e(3, 8, this.vMT);
      AppMethodBeat.o(96339);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xfb == null)
        break label486;
    label486: for (paramInt = e.a.a.b.b.a.f(1, this.xfb) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMS != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.vMS);
      paramInt = i + e.a.a.a.c(3, 8, this.vMT);
      AppMethodBeat.o(96339);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vMT.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xfb == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: WxaUserName");
          AppMethodBeat.o(96339);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96339);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxa localcxa = (cxa)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96339);
          break;
        case 1:
          localcxa.xfb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96339);
          paramInt = i;
          break;
        case 2:
          localcxa.vMS = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(96339);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cwx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxa.vMT.add(localObject1);
          }
          AppMethodBeat.o(96339);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96339);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxa
 * JD-Core Version:    0.6.2
 */