package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bag extends com.tencent.mm.bt.a
{
  public bah wEb;
  public baf wEc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58913);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wEb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RsaReqData");
        AppMethodBeat.o(58913);
        throw paramArrayOfObject;
      }
      if (this.wEc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AesReqData");
        AppMethodBeat.o(58913);
        throw paramArrayOfObject;
      }
      if (this.wEb != null)
      {
        paramArrayOfObject.iy(1, this.wEb.computeSize());
        this.wEb.writeFields(paramArrayOfObject);
      }
      if (this.wEc != null)
      {
        paramArrayOfObject.iy(2, this.wEc.computeSize());
        this.wEc.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58913);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wEb == null)
        break label580;
    label580: for (paramInt = e.a.a.a.ix(1, this.wEb.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wEc != null)
        i = paramInt + e.a.a.a.ix(2, this.wEc.computeSize());
      AppMethodBeat.o(58913);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wEb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RsaReqData");
          AppMethodBeat.o(58913);
          throw paramArrayOfObject;
        }
        if (this.wEc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AesReqData");
          AppMethodBeat.o(58913);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58913);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bag localbag = (bag)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58913);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bah();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bah)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbag.wEb = ((bah)localObject1);
          }
          AppMethodBeat.o(58913);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new baf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((baf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbag.wEc = ((baf)localObject1);
          }
          AppMethodBeat.o(58913);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(58913);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bag
 * JD-Core Version:    0.6.2
 */