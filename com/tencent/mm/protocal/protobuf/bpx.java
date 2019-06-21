package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bpx extends com.tencent.mm.bt.a
{
  public cbt wSf;
  public bts wSg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94552);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wSf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SnsRecommendObject");
        AppMethodBeat.o(94552);
        throw paramArrayOfObject;
      }
      if (this.wSf != null)
      {
        paramArrayOfObject.iy(1, this.wSf.computeSize());
        this.wSf.writeFields(paramArrayOfObject);
      }
      if (this.wSg != null)
      {
        paramArrayOfObject.iy(2, this.wSg.computeSize());
        this.wSg.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94552);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wSf == null)
        break label531;
    label531: for (paramInt = e.a.a.a.ix(1, this.wSf.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wSg != null)
        i = paramInt + e.a.a.a.ix(2, this.wSg.computeSize());
      AppMethodBeat.o(94552);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wSf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SnsRecommendObject");
          AppMethodBeat.o(94552);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94552);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpx localbpx = (bpx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(94552);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cbt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpx.wSf = ((cbt)localObject1);
          }
          AppMethodBeat.o(94552);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpx.wSg = paramArrayOfObject;
          }
          AppMethodBeat.o(94552);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94552);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpx
 * JD-Core Version:    0.6.2
 */