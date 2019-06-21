package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bpi extends btd
{
  public bpj wRK;
  public int wRM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28602);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wRK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
        AppMethodBeat.o(28602);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28602);
        throw paramArrayOfObject;
      }
      if (this.wRK != null)
      {
        paramArrayOfObject.iy(1, this.wRK.computeSize());
        this.wRK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wRM);
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(3, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28602);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wRK == null)
        break label639;
    label639: for (paramInt = e.a.a.a.ix(1, this.wRK.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wRM);
      paramInt = i;
      if (this.BaseResponse != null)
        paramInt = i + e.a.a.a.ix(3, this.BaseResponse.computeSize());
      AppMethodBeat.o(28602);
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
          AppMethodBeat.o(28602);
          throw paramArrayOfObject;
        }
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28602);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28602);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpi localbpi = (bpi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28602);
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
            localbpi.wRK = paramArrayOfObject;
          }
          AppMethodBeat.o(28602);
          paramInt = i;
          break;
        case 2:
          localbpi.wRM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28602);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpi.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28602);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28602);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpi
 * JD-Core Version:    0.6.2
 */