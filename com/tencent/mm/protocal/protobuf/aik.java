package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aik extends btd
{
  public int jBv;
  public LinkedList<yh> jBw;
  public int wov;
  public String wow;
  public int wox;

  public aik()
  {
    AppMethodBeat.i(62556);
    this.jBw = new LinkedList();
    AppMethodBeat.o(62556);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62557);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62557);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBv);
      paramArrayOfObject.e(3, 8, this.jBw);
      paramArrayOfObject.iz(4, this.wov);
      if (this.wow != null)
        paramArrayOfObject.e(5, this.wow);
      paramArrayOfObject.iz(6, this.wox);
      AppMethodBeat.o(62557);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label718;
    label718: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jBv) + e.a.a.a.c(3, 8, this.jBw) + e.a.a.b.b.a.bs(4, this.wov);
      paramInt = i;
      if (this.wow != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wow);
      paramInt += e.a.a.b.b.a.bs(6, this.wox);
      AppMethodBeat.o(62557);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jBw.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(62557);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62557);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aik localaik = (aik)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62557);
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
            localaik.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(62557);
          paramInt = i;
          break;
        case 2:
          localaik.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62557);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new yh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaik.jBw.add(paramArrayOfObject);
          }
          AppMethodBeat.o(62557);
          paramInt = i;
          break;
        case 4:
          localaik.wov = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62557);
          paramInt = i;
          break;
        case 5:
          localaik.wow = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62557);
          paramInt = i;
          break;
        case 6:
          localaik.wox = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62557);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62557);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aik
 * JD-Core Version:    0.6.2
 */