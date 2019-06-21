package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crm extends com.tencent.mm.bt.a
{
  public cqm xoW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102424);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_response");
        AppMethodBeat.o(102424);
        throw paramArrayOfObject;
      }
      if (this.xoW != null)
      {
        paramArrayOfObject.iy(1, this.xoW.computeSize());
        this.xoW.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(102424);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoW == null)
        break label372;
    label372: for (paramInt = e.a.a.a.ix(1, this.xoW.computeSize()) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(102424);
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
          AppMethodBeat.o(102424);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102424);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crm localcrm = (crm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(102424);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cqm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cqm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrm.xoW = ((cqm)localObject1);
          }
          AppMethodBeat.o(102424);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102424);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crm
 * JD-Core Version:    0.6.2
 */