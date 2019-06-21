package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ajn extends com.tencent.mm.bt.a
{
  public asq vKM;
  public int wpk;
  public int wpl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10176);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vKM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Device");
        AppMethodBeat.o(10176);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wpk);
      paramArrayOfObject.iz(2, this.wpl);
      if (this.vKM != null)
      {
        paramArrayOfObject.iy(3, this.vKM.computeSize());
        this.vKM.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(10176);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wpk) + 0 + e.a.a.b.b.a.bs(2, this.wpl);
        paramInt = i;
        if (this.vKM != null)
          paramInt = i + e.a.a.a.ix(3, this.vKM.computeSize());
        AppMethodBeat.o(10176);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vKM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Device");
          AppMethodBeat.o(10176);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10176);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ajn localajn = (ajn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10176);
          break;
        case 1:
          localajn.wpk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10176);
          paramInt = 0;
          break;
        case 2:
          localajn.wpl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10176);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((asq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajn.vKM = ((asq)localObject1);
          }
          AppMethodBeat.o(10176);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(10176);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ajn
 * JD-Core Version:    0.6.2
 */