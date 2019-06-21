package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ces extends com.tencent.mm.bt.a
{
  public int nbk;
  public long xdq;
  public SKBuiltinBuffer_t xet;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56536);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xet == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OpContent");
        AppMethodBeat.o(56536);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.xdq);
      paramArrayOfObject.iz(2, this.nbk);
      if (this.xet != null)
      {
        paramArrayOfObject.iy(3, this.xet.computeSize());
        this.xet.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56536);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.xdq) + 0 + e.a.a.b.b.a.bs(2, this.nbk);
        paramInt = i;
        if (this.xet != null)
          paramInt = i + e.a.a.a.ix(3, this.xet.computeSize());
        AppMethodBeat.o(56536);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xet == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OpContent");
          AppMethodBeat.o(56536);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56536);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ces localces = (ces)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56536);
          break;
        case 1:
          localces.xdq = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56536);
          paramInt = 0;
          break;
        case 2:
          localces.nbk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56536);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localces.xet = paramArrayOfObject;
          }
          AppMethodBeat.o(56536);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56536);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ces
 * JD-Core Version:    0.6.2
 */