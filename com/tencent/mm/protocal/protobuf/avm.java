package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class avm extends btd
{
  public String fKh;
  public String vLo;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10202);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10202);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.vYO != null)
        paramArrayOfObject.e(3, this.vYO);
      if (this.vLo != null)
        paramArrayOfObject.e(4, this.vLo);
      if (this.vYP != null)
        paramArrayOfObject.e(5, this.vYP);
      if (this.vYQ != null)
        paramArrayOfObject.e(6, this.vYQ);
      if (this.vYR != null)
        paramArrayOfObject.e(7, this.vYR);
      AppMethodBeat.o(10202);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label770;
    label770: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      i = paramInt;
      if (this.vYO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vYO);
      paramInt = i;
      if (this.vLo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vLo);
      i = paramInt;
      if (this.vYP != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vYP);
      paramInt = i;
      if (this.vYQ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vYQ);
      i = paramInt;
      if (this.vYR != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vYR);
      AppMethodBeat.o(10202);
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
          AppMethodBeat.o(10202);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10202);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avm localavm = (avm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10202);
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
            localavm.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        case 2:
          localavm.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        case 3:
          localavm.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        case 4:
          localavm.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        case 5:
          localavm.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        case 6:
          localavm.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        case 7:
          localavm.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10202);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10202);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avm
 * JD-Core Version:    0.6.2
 */