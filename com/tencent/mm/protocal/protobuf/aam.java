package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aam extends btd
{
  public int ehB;
  public String vEf;
  public LinkedList<aan> vEh;
  public String wdB;

  public aam()
  {
    AppMethodBeat.i(28404);
    this.vEh = new LinkedList();
    AppMethodBeat.o(28404);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28405);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28405);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wdB != null)
        paramArrayOfObject.e(2, this.wdB);
      paramArrayOfObject.iz(3, this.ehB);
      paramArrayOfObject.e(4, 8, this.vEh);
      if (this.vEf != null)
        paramArrayOfObject.e(5, this.vEf);
      AppMethodBeat.o(28405);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label703;
    label703: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wdB);
      i = i + e.a.a.b.b.a.bs(3, this.ehB) + e.a.a.a.c(4, 8, this.vEh);
      paramInt = i;
      if (this.vEf != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vEf);
      AppMethodBeat.o(28405);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28405);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28405);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aam localaam = (aam)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28405);
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
            localaam.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28405);
          paramInt = i;
          break;
        case 2:
          localaam.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28405);
          paramInt = i;
          break;
        case 3:
          localaam.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28405);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aan();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaam.vEh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28405);
          paramInt = i;
          break;
        case 5:
          localaam.vEf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28405);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28405);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aam
 * JD-Core Version:    0.6.2
 */