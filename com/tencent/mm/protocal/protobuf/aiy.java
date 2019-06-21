package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aiy extends btd
{
  public long jBS;
  public long vEw;
  public int woR;
  public int woS;
  public int woT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51427);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(51427);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.vEw);
      paramArrayOfObject.ai(3, this.jBS);
      paramArrayOfObject.iz(4, this.woR);
      paramArrayOfObject.iz(5, this.woS);
      paramArrayOfObject.iz(6, this.woT);
      AppMethodBeat.o(51427);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label603;
    label603: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.vEw) + e.a.a.b.b.a.o(3, this.jBS) + e.a.a.b.b.a.bs(4, this.woR) + e.a.a.b.b.a.bs(5, this.woS) + e.a.a.b.b.a.bs(6, this.woT);
      AppMethodBeat.o(51427);
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
          AppMethodBeat.o(51427);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51427);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aiy localaiy = (aiy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51427);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaiy.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(51427);
          paramInt = i;
          break;
        case 2:
          localaiy.vEw = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(51427);
          paramInt = i;
          break;
        case 3:
          localaiy.jBS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(51427);
          paramInt = i;
          break;
        case 4:
          localaiy.woR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51427);
          paramInt = i;
          break;
        case 5:
          localaiy.woS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51427);
          paramInt = i;
          break;
        case 6:
          localaiy.woT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51427);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51427);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aiy
 * JD-Core Version:    0.6.2
 */