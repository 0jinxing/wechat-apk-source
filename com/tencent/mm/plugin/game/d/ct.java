package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ct extends com.tencent.mm.bt.a
{
  public dq ndn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111660);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppInfo");
        AppMethodBeat.o(111660);
        throw paramArrayOfObject;
      }
      if (this.ndn != null)
      {
        paramArrayOfObject.iy(1, this.ndn.computeSize());
        this.ndn.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(111660);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndn == null)
        break label372;
    label372: for (paramInt = e.a.a.a.ix(1, this.ndn.computeSize()) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(111660);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ndn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppInfo");
          AppMethodBeat.o(111660);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111660);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ct localct = (ct)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(111660);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((dq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localct.ndn = ((dq)localObject1);
          }
          AppMethodBeat.o(111660);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111660);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ct
 * JD-Core Version:    0.6.2
 */