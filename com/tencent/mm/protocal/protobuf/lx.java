package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import d.a.a.c;
import e.a.a.b;
import java.util.LinkedList;

public final class lx extends btd
{
  public int kdT;
  public String kdU;
  public c tBw;
  public long tBy;
  public long vPQ;
  public LinkedList<String> vPR;
  public int vPS;
  public int vPT;
  public String vPU;

  public lx()
  {
    AppMethodBeat.i(56727);
    this.vPR = new LinkedList();
    AppMethodBeat.o(56727);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56728);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56728);
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
      paramArrayOfObject.ai(4, this.tBy);
      if (this.tBw != null)
      {
        paramArrayOfObject.iy(5, this.tBw.computeSize());
        this.tBw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.vPQ);
      paramArrayOfObject.e(7, 1, this.vPR);
      paramArrayOfObject.iz(8, this.vPS);
      paramArrayOfObject.iz(9, this.vPT);
      if (this.vPU != null)
        paramArrayOfObject.e(10, this.vPU);
      AppMethodBeat.o(56728);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label958;
    label958: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.b.b.a.o(4, this.tBy);
      paramInt = i;
      if (this.tBw != null)
        paramInt = i + e.a.a.a.ix(5, this.tBw.computeSize());
      i = paramInt + e.a.a.b.b.a.o(6, this.vPQ) + e.a.a.a.c(7, 1, this.vPR) + e.a.a.b.b.a.bs(8, this.vPS) + e.a.a.b.b.a.bs(9, this.vPT);
      paramInt = i;
      if (this.vPU != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vPU);
      AppMethodBeat.o(56728);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vPR.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56728);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56728);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lx locallx = (lx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56728);
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
            locallx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 2:
          locallx.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 3:
          locallx.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 4:
          locallx.tBy = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new c();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallx.tBw = paramArrayOfObject;
          }
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 6:
          locallx.vPQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 7:
          locallx.vPR.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 8:
          locallx.vPS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 9:
          locallx.vPT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        case 10:
          locallx.vPU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56728);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56728);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lx
 * JD-Core Version:    0.6.2
 */