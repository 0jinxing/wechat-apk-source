package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class crh extends com.tencent.mm.bt.a
{
  public cqm xoW;
  public int xoX;
  public int xoY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102419);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_response");
        AppMethodBeat.o(102419);
        throw paramArrayOfObject;
      }
      if (this.xoW != null)
      {
        paramArrayOfObject.iy(1, this.xoW.computeSize());
        this.xoW.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.xoX);
      paramArrayOfObject.iz(3, this.xoY);
      AppMethodBeat.o(102419);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoW == null)
        break label465;
    label465: for (paramInt = e.a.a.a.ix(1, this.xoW.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.xoX) + e.a.a.b.b.a.bs(3, this.xoY);
      AppMethodBeat.o(102419);
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
          AppMethodBeat.o(102419);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(102419);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crh localcrh = (crh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102419);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrh.xoW = paramArrayOfObject;
          }
          AppMethodBeat.o(102419);
          paramInt = i;
          break;
        case 2:
          localcrh.xoX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102419);
          paramInt = i;
          break;
        case 3:
          localcrh.xoY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102419);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102419);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crh
 * JD-Core Version:    0.6.2
 */