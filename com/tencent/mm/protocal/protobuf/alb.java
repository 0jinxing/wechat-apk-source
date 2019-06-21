package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class alb extends btd
{
  public int vKp;
  public String vKq;
  public String wqA;
  public String wqB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56818);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56818);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vKp);
      if (this.vKq != null)
        paramArrayOfObject.e(3, this.vKq);
      if (this.wqA != null)
        paramArrayOfObject.e(4, this.wqA);
      if (this.wqB != null)
        paramArrayOfObject.e(5, this.wqB);
      AppMethodBeat.o(56818);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label611;
    label611: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.vKp);
      i = paramInt;
      if (this.vKq != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vKq);
      paramInt = i;
      if (this.wqA != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wqA);
      i = paramInt;
      if (this.wqB != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wqB);
      AppMethodBeat.o(56818);
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
          AppMethodBeat.o(56818);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56818);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        alb localalb = (alb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56818);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localalb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56818);
          paramInt = i;
          break;
        case 2:
          localalb.vKp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56818);
          paramInt = i;
          break;
        case 3:
          localalb.vKq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56818);
          paramInt = i;
          break;
        case 4:
          localalb.wqA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56818);
          paramInt = i;
          break;
        case 5:
          localalb.wqB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56818);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56818);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.alb
 * JD-Core Version:    0.6.2
 */