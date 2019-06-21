package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xu extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t vIn;
  public int wdx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58905);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Key");
        AppMethodBeat.o(58905);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wdx);
      if (this.vIn != null)
      {
        paramArrayOfObject.iy(2, this.vIn.computeSize());
        this.vIn.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58905);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wdx) + 0;
        paramInt = i;
        if (this.vIn != null)
          paramInt = i + e.a.a.a.ix(2, this.vIn.computeSize());
        AppMethodBeat.o(58905);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vIn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Key");
          AppMethodBeat.o(58905);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58905);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xu localxu = (xu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58905);
          paramInt = -1;
          break;
        case 1:
          localxu.wdx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58905);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxu.vIn = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58905);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(58905);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xu
 * JD-Core Version:    0.6.2
 */