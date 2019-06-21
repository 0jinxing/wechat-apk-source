package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnq extends com.tencent.mm.bt.a
{
  public int xkW;
  public bdk xkX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124373);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xkW);
      if (this.xkX != null)
      {
        paramArrayOfObject.iy(3, this.xkX.computeSize());
        this.xkX.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(124373);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.xkW) + 0;
        paramInt = i;
        if (this.xkX != null)
          paramInt = i + e.a.a.a.ix(3, this.xkX.computeSize());
        AppMethodBeat.o(124373);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124373);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnq localcnq = (cnq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 2:
        default:
          AppMethodBeat.o(124373);
          paramInt = -1;
          break;
        case 1:
          localcnq.xkW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124373);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bdk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnq.xkX = ((bdk)localObject1);
          }
          AppMethodBeat.o(124373);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(124373);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnq
 * JD-Core Version:    0.6.2
 */