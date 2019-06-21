package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cro extends com.tencent.mm.bt.a
{
  public cqm xoW;
  public crf xpg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102426);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_response");
        AppMethodBeat.o(102426);
        throw paramArrayOfObject;
      }
      if (this.xoW != null)
      {
        paramArrayOfObject.iy(1, this.xoW.computeSize());
        this.xoW.writeFields(paramArrayOfObject);
      }
      if (this.xpg != null)
      {
        paramArrayOfObject.iy(2, this.xpg.computeSize());
        this.xpg.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(102426);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoW == null)
        break label531;
    label531: for (i = e.a.a.a.ix(1, this.xoW.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xpg != null)
        paramInt = i + e.a.a.a.ix(2, this.xpg.computeSize());
      AppMethodBeat.o(102426);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xoW == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: base_response");
          AppMethodBeat.o(102426);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102426);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cro localcro = (cro)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(102426);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcro.xoW = paramArrayOfObject;
          }
          AppMethodBeat.o(102426);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new crf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((crf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcro.xpg = ((crf)localObject1);
          }
          AppMethodBeat.o(102426);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102426);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cro
 * JD-Core Version:    0.6.2
 */