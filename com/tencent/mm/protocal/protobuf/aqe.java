package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aqe extends btd
{
  public bod vZB;
  public cof vZz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28492);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28492);
        throw paramArrayOfObject;
      }
      if (this.vZz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: TransRes");
        AppMethodBeat.o(28492);
        throw paramArrayOfObject;
      }
      if (this.vZB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QueryCtx");
        AppMethodBeat.o(28492);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vZz != null)
      {
        paramArrayOfObject.iy(2, this.vZz.computeSize());
        this.vZz.writeFields(paramArrayOfObject);
      }
      if (this.vZB != null)
      {
        paramArrayOfObject.iy(3, this.vZB.computeSize());
        this.vZB.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28492);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label800;
    label800: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vZz != null)
        paramInt = i + e.a.a.a.ix(2, this.vZz.computeSize());
      i = paramInt;
      if (this.vZB != null)
        i = paramInt + e.a.a.a.ix(3, this.vZB.computeSize());
      AppMethodBeat.o(28492);
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
          AppMethodBeat.o(28492);
          throw paramArrayOfObject;
        }
        if (this.vZz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: TransRes");
          AppMethodBeat.o(28492);
          throw paramArrayOfObject;
        }
        if (this.vZB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QueryCtx");
          AppMethodBeat.o(28492);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28492);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aqe localaqe = (aqe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28492);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqe.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28492);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cof();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cof)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqe.vZz = ((cof)localObject1);
          }
          AppMethodBeat.o(28492);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bod();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqe.vZB = paramArrayOfObject;
          }
          AppMethodBeat.o(28492);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28492);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aqe
 * JD-Core Version:    0.6.2
 */