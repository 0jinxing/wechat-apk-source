package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cam extends com.tencent.mm.bt.a
{
  public long wZC;
  public bts wZq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94562);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.wZC);
      if (this.wZq != null)
      {
        paramArrayOfObject.iy(2, this.wZq.computeSize());
        this.wZq.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94562);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.wZC) + 0;
        paramInt = i;
        if (this.wZq != null)
          paramInt = i + e.a.a.a.ix(2, this.wZq.computeSize());
        AppMethodBeat.o(94562);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94562);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cam localcam = (cam)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(94562);
          paramInt = -1;
          break;
        case 1:
          localcam.wZC = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94562);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcam.wZq = ((bts)localObject1);
          }
          AppMethodBeat.o(94562);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(94562);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cam
 * JD-Core Version:    0.6.2
 */