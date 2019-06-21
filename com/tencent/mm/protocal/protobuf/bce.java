package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bce extends com.tencent.mm.bt.a
{
  public asq vLi;
  public asr vLj;
  public int wGJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28553);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDevice");
        AppMethodBeat.o(28553);
        throw paramArrayOfObject;
      }
      if (this.vLj == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDeviceAttr");
        AppMethodBeat.o(28553);
        throw paramArrayOfObject;
      }
      if (this.vLi != null)
      {
        paramArrayOfObject.iy(1, this.vLi.computeSize());
        this.vLi.writeFields(paramArrayOfObject);
      }
      if (this.vLj != null)
      {
        paramArrayOfObject.iy(2, this.vLj.computeSize());
        this.vLj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wGJ);
      AppMethodBeat.o(28553);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vLi == null)
        break label638;
    label638: for (paramInt = e.a.a.a.ix(1, this.vLi.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vLj != null)
        i = paramInt + e.a.a.a.ix(2, this.vLj.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.wGJ);
      AppMethodBeat.o(28553);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vLi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDevice");
          AppMethodBeat.o(28553);
          throw paramArrayOfObject;
        }
        if (this.vLj == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDeviceAttr");
          AppMethodBeat.o(28553);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28553);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bce localbce = (bce)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28553);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbce.vLi = paramArrayOfObject;
          }
          AppMethodBeat.o(28553);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new asr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbce.vLj = paramArrayOfObject;
          }
          AppMethodBeat.o(28553);
          paramInt = i;
          break;
        case 3:
          localbce.wGJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28553);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28553);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bce
 * JD-Core Version:    0.6.2
 */