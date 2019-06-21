package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aor extends btd
{
  public int jBv;
  public LinkedList<bts> jBw;
  public String wsL;
  public SKBuiltinBuffer_t wsO;
  public int wsP;

  public aor()
  {
    AppMethodBeat.i(73717);
    this.jBw = new LinkedList();
    AppMethodBeat.o(73717);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73718);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(73718);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBv);
      paramArrayOfObject.e(3, 8, this.jBw);
      if (this.wsL != null)
        paramArrayOfObject.e(4, this.wsL);
      if (this.wsO != null)
      {
        paramArrayOfObject.iy(5, this.wsO.computeSize());
        this.wsO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.wsP);
      AppMethodBeat.o(73718);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label832;
    label832: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jBv) + e.a.a.a.c(3, 8, this.jBw);
      paramInt = i;
      if (this.wsL != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wsL);
      i = paramInt;
      if (this.wsO != null)
        i = paramInt + e.a.a.a.ix(5, this.wsO.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(6, this.wsP);
      AppMethodBeat.o(73718);
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
          AppMethodBeat.o(73718);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73718);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aor localaor = (aor)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73718);
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
            localaor.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(73718);
          paramInt = i;
          break;
        case 2:
          localaor.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73718);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaor.jBw.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73718);
          paramInt = i;
          break;
        case 4:
          localaor.wsL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73718);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaor.wsO = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(73718);
          paramInt = i;
          break;
        case 6:
          localaor.wsP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73718);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73718);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aor
 * JD-Core Version:    0.6.2
 */