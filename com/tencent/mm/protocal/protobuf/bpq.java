package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bpq extends btd
{
  public bpj wRK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28611);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wRK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
        AppMethodBeat.o(28611);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28611);
        throw paramArrayOfObject;
      }
      if (this.wRK != null)
      {
        paramArrayOfObject.iy(1, this.wRK.computeSize());
        this.wRK.writeFields(paramArrayOfObject);
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(2, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28611);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wRK == null)
        break label590;
    label590: for (paramInt = e.a.a.a.ix(1, this.wRK.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.BaseResponse != null)
        i = paramInt + e.a.a.a.ix(2, this.BaseResponse.computeSize());
      AppMethodBeat.o(28611);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wRK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
          AppMethodBeat.o(28611);
          throw paramArrayOfObject;
        }
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28611);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28611);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpq localbpq = (bpq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(28611);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpq.wRK = paramArrayOfObject;
          }
          AppMethodBeat.o(28611);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpq.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28611);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28611);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpq
 * JD-Core Version:    0.6.2
 */