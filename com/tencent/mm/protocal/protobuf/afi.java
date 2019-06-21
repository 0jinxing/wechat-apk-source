package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class afi extends btd
{
  public int result;
  public aue wmJ;
  public String wmK;
  public atz wmL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10174);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10174);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wmJ != null)
      {
        paramArrayOfObject.iy(2, this.wmJ.computeSize());
        this.wmJ.writeFields(paramArrayOfObject);
      }
      if (this.wmK != null)
        paramArrayOfObject.e(3, this.wmK);
      if (this.wmL != null)
      {
        paramArrayOfObject.iy(4, this.wmL.computeSize());
        this.wmL.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.result);
      AppMethodBeat.o(10174);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label811;
    label811: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wmJ != null)
        paramInt = i + e.a.a.a.ix(2, this.wmJ.computeSize());
      i = paramInt;
      if (this.wmK != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wmK);
      paramInt = i;
      if (this.wmL != null)
        paramInt = i + e.a.a.a.ix(4, this.wmL.computeSize());
      paramInt += e.a.a.b.b.a.bs(5, this.result);
      AppMethodBeat.o(10174);
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
          AppMethodBeat.o(10174);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10174);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        afi localafi = (afi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10174);
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
            localafi.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(10174);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aue();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aue)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localafi.wmJ = ((aue)localObject1);
          }
          AppMethodBeat.o(10174);
          paramInt = i;
          break;
        case 3:
          localafi.wmK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10174);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new atz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localafi.wmL = paramArrayOfObject;
          }
          AppMethodBeat.o(10174);
          paramInt = i;
          break;
        case 5:
          localafi.result = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10174);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10174);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afi
 * JD-Core Version:    0.6.2
 */