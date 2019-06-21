package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cfo extends btd
{
  public int vKp;
  public String vKq;
  public String xeQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56984);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56984);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.xeQ != null)
        paramArrayOfObject.e(2, this.xeQ);
      paramArrayOfObject.iz(3, this.vKp);
      if (this.vKq != null)
        paramArrayOfObject.e(4, this.vKq);
      AppMethodBeat.o(56984);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label545;
    label545: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xeQ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xeQ);
      i += e.a.a.b.b.a.bs(3, this.vKp);
      paramInt = i;
      if (this.vKq != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vKq);
      AppMethodBeat.o(56984);
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
          AppMethodBeat.o(56984);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56984);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfo localcfo = (cfo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56984);
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
            localcfo.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56984);
          paramInt = i;
          break;
        case 2:
          localcfo.xeQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56984);
          paramInt = i;
          break;
        case 3:
          localcfo.vKp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56984);
          paramInt = i;
          break;
        case 4:
          localcfo.vKq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56984);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56984);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfo
 * JD-Core Version:    0.6.2
 */