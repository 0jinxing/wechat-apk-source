package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class jt extends btd
{
  public asq vLi;
  public asr vLj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10161);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10161);
        throw paramArrayOfObject;
      }
      if (this.vLi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDevice");
        AppMethodBeat.o(10161);
        throw paramArrayOfObject;
      }
      if (this.vLj == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDeviceAttr");
        AppMethodBeat.o(10161);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vLi != null)
      {
        paramArrayOfObject.iy(2, this.vLi.computeSize());
        this.vLi.writeFields(paramArrayOfObject);
      }
      if (this.vLj != null)
      {
        paramArrayOfObject.iy(3, this.vLj.computeSize());
        this.vLj.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(10161);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label799;
    label799: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vLi != null)
        paramInt = i + e.a.a.a.ix(2, this.vLi.computeSize());
      i = paramInt;
      if (this.vLj != null)
        i = paramInt + e.a.a.a.ix(3, this.vLj.computeSize());
      AppMethodBeat.o(10161);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(10161);
          throw paramArrayOfObject;
        }
        if (this.vLi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDevice");
          AppMethodBeat.o(10161);
          throw paramArrayOfObject;
        }
        if (this.vLj == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDeviceAttr");
          AppMethodBeat.o(10161);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10161);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jt localjt = (jt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10161);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjt.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(10161);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((asq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjt.vLi = ((asq)localObject1);
          }
          AppMethodBeat.o(10161);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new asr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjt.vLj = paramArrayOfObject;
          }
          AppMethodBeat.o(10161);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10161);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jt
 * JD-Core Version:    0.6.2
 */