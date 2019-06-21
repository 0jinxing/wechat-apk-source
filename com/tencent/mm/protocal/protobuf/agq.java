package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class agq extends btd
{
  public int kdT;
  public String kdU;
  public ns wnk;
  public int wnl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89083);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89083);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      if (this.wnk != null)
      {
        paramArrayOfObject.iy(4, this.wnk.computeSize());
        this.wnk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wnl);
      AppMethodBeat.o(89083);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label688;
    label688: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wnk != null)
        i = paramInt + e.a.a.a.ix(4, this.wnk.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(5, this.wnl);
      AppMethodBeat.o(89083);
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
          AppMethodBeat.o(89083);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89083);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agq localagq = (agq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89083);
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
            localagq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(89083);
          paramInt = i;
          break;
        case 2:
          localagq.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89083);
          paramInt = i;
          break;
        case 3:
          localagq.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89083);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ns();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagq.wnk = paramArrayOfObject;
          }
          AppMethodBeat.o(89083);
          paramInt = i;
          break;
        case 5:
          localagq.wnl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89083);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89083);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agq
 * JD-Core Version:    0.6.2
 */