package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ahh extends btd
{
  public int jBs;
  public String wnM;
  public qe wnN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5586);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5586);
        throw paramArrayOfObject;
      }
      if (this.wnN == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NewChatroomData");
        AppMethodBeat.o(5586);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wnM != null)
        paramArrayOfObject.e(2, this.wnM);
      paramArrayOfObject.iz(3, this.jBs);
      if (this.wnN != null)
      {
        paramArrayOfObject.iy(4, this.wnN.computeSize());
        this.wnN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5586);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label702;
    label702: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wnM != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wnM);
      i += e.a.a.b.b.a.bs(3, this.jBs);
      paramInt = i;
      if (this.wnN != null)
        paramInt = i + e.a.a.a.ix(4, this.wnN.computeSize());
      AppMethodBeat.o(5586);
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
          AppMethodBeat.o(5586);
          throw paramArrayOfObject;
        }
        if (this.wnN == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NewChatroomData");
          AppMethodBeat.o(5586);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5586);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahh localahh = (ahh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5586);
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
            localahh.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(5586);
          paramInt = i;
          break;
        case 2:
          localahh.wnM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5586);
          paramInt = i;
          break;
        case 3:
          localahh.jBs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5586);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new qe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahh.wnN = paramArrayOfObject;
          }
          AppMethodBeat.o(5586);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5586);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahh
 * JD-Core Version:    0.6.2
 */