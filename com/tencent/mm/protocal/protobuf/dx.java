package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class dx extends com.tencent.mm.bt.a
{
  public int type;
  public LinkedList<ea> vCQ;

  public dx()
  {
    AppMethodBeat.i(14677);
    this.vCQ = new LinkedList();
    AppMethodBeat.o(14677);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14678);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      paramArrayOfObject.e(2, 8, this.vCQ);
      AppMethodBeat.o(14678);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.type) + 0 + e.a.a.a.c(2, 8, this.vCQ);
        AppMethodBeat.o(14678);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vCQ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14678);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        dx localdx = (dx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(14678);
          paramInt = -1;
          break;
        case 1:
          localdx.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14678);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ea();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ea)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdx.vCQ.add(localObject1);
          }
          AppMethodBeat.o(14678);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(14678);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dx
 * JD-Core Version:    0.6.2
 */