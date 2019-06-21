package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class uk extends btd
{
  public String tuB;
  public int version;
  public LinkedList<nn> wbW;
  public int wbX;
  public int wbY;

  public uk()
  {
    AppMethodBeat.i(28373);
    this.wbW = new LinkedList();
    AppMethodBeat.o(28373);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28374);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28374);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wbW);
      paramArrayOfObject.iz(3, this.version);
      paramArrayOfObject.iz(4, this.wbX);
      paramArrayOfObject.iz(5, this.wbY);
      if (this.tuB != null)
        paramArrayOfObject.e(6, this.tuB);
      AppMethodBeat.o(28374);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label732;
    label732: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.wbW) + e.a.a.b.b.a.bs(3, this.version) + e.a.a.b.b.a.bs(4, this.wbX) + e.a.a.b.b.a.bs(5, this.wbY);
      paramInt = i;
      if (this.tuB != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.tuB);
      AppMethodBeat.o(28374);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wbW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28374);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28374);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        uk localuk = (uk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28374);
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
            localuk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28374);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new nn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((nn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuk.wbW.add(localObject1);
          }
          AppMethodBeat.o(28374);
          paramInt = i;
          break;
        case 3:
          localuk.version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28374);
          paramInt = i;
          break;
        case 4:
          localuk.wbX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28374);
          paramInt = i;
          break;
        case 5:
          localuk.wbY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28374);
          paramInt = i;
          break;
        case 6:
          localuk.tuB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28374);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28374);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uk
 * JD-Core Version:    0.6.2
 */