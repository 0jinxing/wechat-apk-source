package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnb extends btd
{
  public String csB;
  public String fhH;
  public LinkedList<bew> wIK;
  public String wIL;
  public boolean wPP;
  public LinkedList<bet> wPQ;
  public boolean wPR;
  public int wPS;
  public int wPT;
  public String wPU;
  public String wPV;

  public bnb()
  {
    AppMethodBeat.i(10232);
    this.wIK = new LinkedList();
    this.wPQ = new LinkedList();
    AppMethodBeat.o(10232);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10233);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10233);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.wPP);
      paramArrayOfObject.e(3, 8, this.wIK);
      if (this.csB != null)
        paramArrayOfObject.e(4, this.csB);
      if (this.fhH != null)
        paramArrayOfObject.e(5, this.fhH);
      if (this.wIL != null)
        paramArrayOfObject.e(6, this.wIL);
      paramArrayOfObject.e(7, 8, this.wPQ);
      paramArrayOfObject.aO(8, this.wPR);
      paramArrayOfObject.iz(9, this.wPS);
      paramArrayOfObject.iz(10, this.wPT);
      if (this.wPU != null)
        paramArrayOfObject.e(11, this.wPU);
      if (this.wPV != null)
        paramArrayOfObject.e(12, this.wPV);
      AppMethodBeat.o(10233);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1187;
    label1187: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + (e.a.a.b.b.a.fv(2) + 1) + e.a.a.a.c(3, 8, this.wIK);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.csB);
      paramInt = i;
      if (this.fhH != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.fhH);
      i = paramInt;
      if (this.wIL != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wIL);
      i = i + e.a.a.a.c(7, 8, this.wPQ) + (e.a.a.b.b.a.fv(8) + 1) + e.a.a.b.b.a.bs(9, this.wPS) + e.a.a.b.b.a.bs(10, this.wPT);
      paramInt = i;
      if (this.wPU != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wPU);
      i = paramInt;
      if (this.wPV != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wPV);
      AppMethodBeat.o(10233);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wIK.clear();
        this.wPQ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(10233);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10233);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnb localbnb = (bnb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10233);
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
            localbnb.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 2:
          localbnb.wPP = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bew();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnb.wIK.add(paramArrayOfObject);
          }
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 4:
          localbnb.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 5:
          localbnb.fhH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 6:
          localbnb.wIL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bet();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnb.wPQ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 8:
          localbnb.wPR = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 9:
          localbnb.wPS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 10:
          localbnb.wPT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 11:
          localbnb.wPU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        case 12:
          localbnb.wPV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10233);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10233);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnb
 * JD-Core Version:    0.6.2
 */