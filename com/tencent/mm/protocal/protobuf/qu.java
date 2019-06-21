package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class qu extends btd
{
  public String ndF;
  public String vXO;
  public String vXP;
  public String vXQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11733);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(11733);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vXO != null)
        paramArrayOfObject.e(2, this.vXO);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      if (this.vXP != null)
        paramArrayOfObject.e(4, this.vXP);
      if (this.vXQ != null)
        paramArrayOfObject.e(5, this.vXQ);
      AppMethodBeat.o(11733);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label639;
    label639: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vXO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vXO);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndF);
      paramInt = i;
      if (this.vXP != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vXP);
      i = paramInt;
      if (this.vXQ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vXQ);
      AppMethodBeat.o(11733);
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
          AppMethodBeat.o(11733);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11733);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qu localqu = (qu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11733);
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
            localqu.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(11733);
          paramInt = i;
          break;
        case 2:
          localqu.vXO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11733);
          paramInt = i;
          break;
        case 3:
          localqu.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11733);
          paramInt = i;
          break;
        case 4:
          localqu.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11733);
          paramInt = i;
          break;
        case 5:
          localqu.vXQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11733);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11733);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qu
 * JD-Core Version:    0.6.2
 */