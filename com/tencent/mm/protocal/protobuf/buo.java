package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buo extends btd
{
  public String fhH;
  public String vGi;
  public LinkedList<bew> wIK;
  public String wIL;
  public boolean wIM;
  public boolean wIN;
  public boolean wIO;
  public LinkedList<bet> wPQ;
  public boolean wPR;
  public int wPS;
  public int wPT;
  public String wPU;
  public String wPV;
  public boolean wWf;

  public buo()
  {
    AppMethodBeat.i(10238);
    this.wIK = new LinkedList();
    this.wPQ = new LinkedList();
    AppMethodBeat.o(10238);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10239);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10239);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.wIK);
      if (this.fhH != null)
        paramArrayOfObject.e(4, this.fhH);
      if (this.wIL != null)
        paramArrayOfObject.e(5, this.wIL);
      if (this.vGi != null)
        paramArrayOfObject.e(6, this.vGi);
      paramArrayOfObject.aO(8, this.wIM);
      paramArrayOfObject.aO(9, this.wIN);
      paramArrayOfObject.aO(10, this.wIO);
      paramArrayOfObject.e(11, 8, this.wPQ);
      paramArrayOfObject.aO(12, this.wWf);
      paramArrayOfObject.aO(13, this.wPR);
      paramArrayOfObject.iz(14, this.wPS);
      paramArrayOfObject.iz(15, this.wPT);
      if (this.wPU != null)
        paramArrayOfObject.e(16, this.wPU);
      if (this.wPV != null)
        paramArrayOfObject.e(17, this.wPV);
      AppMethodBeat.o(10239);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1335;
    label1335: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(3, 8, this.wIK);
      paramInt = i;
      if (this.fhH != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fhH);
      i = paramInt;
      if (this.wIL != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wIL);
      paramInt = i;
      if (this.vGi != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vGi);
      i = paramInt + (e.a.a.b.b.a.fv(8) + 1) + (e.a.a.b.b.a.fv(9) + 1) + (e.a.a.b.b.a.fv(10) + 1) + e.a.a.a.c(11, 8, this.wPQ) + (e.a.a.b.b.a.fv(12) + 1) + (e.a.a.b.b.a.fv(13) + 1) + e.a.a.b.b.a.bs(14, this.wPS) + e.a.a.b.b.a.bs(15, this.wPT);
      paramInt = i;
      if (this.wPU != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.wPU);
      i = paramInt;
      if (this.wPV != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.wPV);
      AppMethodBeat.o(10239);
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
          AppMethodBeat.o(10239);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10239);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buo localbuo = (buo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 2:
        case 7:
        default:
          paramInt = -1;
          AppMethodBeat.o(10239);
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
            localbuo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(10239);
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
            localbuo.wIK.add(paramArrayOfObject);
          }
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 4:
          localbuo.fhH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 5:
          localbuo.wIL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 6:
          localbuo.vGi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 8:
          localbuo.wIM = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 9:
          localbuo.wIN = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 10:
          localbuo.wIO = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bet();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bet)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuo.wPQ.add(localObject1);
          }
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 12:
          localbuo.wWf = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 13:
          localbuo.wPR = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 14:
          localbuo.wPS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 15:
          localbuo.wPT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 16:
          localbuo.wPU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        case 17:
          localbuo.wPV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10239);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10239);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buo
 * JD-Core Version:    0.6.2
 */