package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class afk extends btd
{
  public long wmO;
  public com.tencent.mm.bt.b wmP;
  public bdv wmQ;
  public jv wmR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(846);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(846);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.wmO);
      if (this.wmP != null)
        paramArrayOfObject.c(3, this.wmP);
      if (this.wmQ != null)
      {
        paramArrayOfObject.iy(4, this.wmQ.computeSize());
        this.wmQ.writeFields(paramArrayOfObject);
      }
      if (this.wmR != null)
      {
        paramArrayOfObject.iy(5, this.wmR.computeSize());
        this.wmR.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(846);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label811;
    label811: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.wmO);
      paramInt = i;
      if (this.wmP != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.wmP);
      i = paramInt;
      if (this.wmQ != null)
        i = paramInt + e.a.a.a.ix(4, this.wmQ.computeSize());
      paramInt = i;
      if (this.wmR != null)
        paramInt = i + e.a.a.a.ix(5, this.wmR.computeSize());
      AppMethodBeat.o(846);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(846);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(846);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        afk localafk = (afk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(846);
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
            localafk.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(846);
          paramInt = i;
          break;
        case 2:
          localafk.wmO = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(846);
          paramInt = i;
          break;
        case 3:
          localafk.wmP = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(846);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localafk.wmQ = paramArrayOfObject;
          }
          AppMethodBeat.o(846);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new jv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((jv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localafk.wmR = ((jv)localObject1);
          }
          AppMethodBeat.o(846);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(846);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afk
 * JD-Core Version:    0.6.2
 */