package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class jp extends btd
{
  public String cxb;
  public int vCl;
  public bzr vHR;
  public String vHS;
  public int vHW;
  public String vHl;
  public int vLC;
  public String vLD;
  public String vLH;
  public int vLI;
  public String vLJ;
  public ato vLK;
  public lm vLL;
  public bdu vLM;
  public String vLN;
  public int vLO;
  public btv vLP;
  public String vLQ;
  public String vLR;
  public String vLS;
  public String vLT;
  public int vLU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123507);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(123507);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.cxb != null)
        paramArrayOfObject.e(2, this.cxb);
      if (this.vLH != null)
        paramArrayOfObject.e(3, this.vLH);
      paramArrayOfObject.iz(4, this.vLI);
      if (this.vLJ != null)
        paramArrayOfObject.e(5, this.vLJ);
      if (this.vHl != null)
        paramArrayOfObject.e(6, this.vHl);
      if (this.vLK != null)
      {
        paramArrayOfObject.iy(7, this.vLK.computeSize());
        this.vLK.writeFields(paramArrayOfObject);
      }
      if (this.vLL != null)
      {
        paramArrayOfObject.iy(8, this.vLL.computeSize());
        this.vLL.writeFields(paramArrayOfObject);
      }
      if (this.vLM != null)
      {
        paramArrayOfObject.iy(9, this.vLM.computeSize());
        this.vLM.writeFields(paramArrayOfObject);
      }
      if (this.vHS != null)
        paramArrayOfObject.e(10, this.vHS);
      paramArrayOfObject.iz(11, this.vCl);
      if (this.vLN != null)
        paramArrayOfObject.e(12, this.vLN);
      paramArrayOfObject.iz(13, this.vLO);
      if (this.vLP != null)
      {
        paramArrayOfObject.iy(14, this.vLP.computeSize());
        this.vLP.writeFields(paramArrayOfObject);
      }
      if (this.vLQ != null)
        paramArrayOfObject.e(15, this.vLQ);
      if (this.vLR != null)
        paramArrayOfObject.e(16, this.vLR);
      if (this.vHR != null)
      {
        paramArrayOfObject.iy(17, this.vHR.computeSize());
        this.vHR.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(18, this.vHW);
      if (this.vLS != null)
        paramArrayOfObject.e(19, this.vLS);
      if (this.vLT != null)
        paramArrayOfObject.e(20, this.vLT);
      paramArrayOfObject.iz(21, this.vLC);
      if (this.vLD != null)
        paramArrayOfObject.e(22, this.vLD);
      paramArrayOfObject.iz(23, this.vLU);
      AppMethodBeat.o(123507);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2172;
    label2172: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cxb);
      i = paramInt;
      if (this.vLH != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLH);
      paramInt = i + e.a.a.b.b.a.bs(4, this.vLI);
      i = paramInt;
      if (this.vLJ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vLJ);
      paramInt = i;
      if (this.vHl != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vHl);
      i = paramInt;
      if (this.vLK != null)
        i = paramInt + e.a.a.a.ix(7, this.vLK.computeSize());
      paramInt = i;
      if (this.vLL != null)
        paramInt = i + e.a.a.a.ix(8, this.vLL.computeSize());
      i = paramInt;
      if (this.vLM != null)
        i = paramInt + e.a.a.a.ix(9, this.vLM.computeSize());
      paramInt = i;
      if (this.vHS != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vHS);
      i = paramInt + e.a.a.b.b.a.bs(11, this.vCl);
      paramInt = i;
      if (this.vLN != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vLN);
      paramInt += e.a.a.b.b.a.bs(13, this.vLO);
      i = paramInt;
      if (this.vLP != null)
        i = paramInt + e.a.a.a.ix(14, this.vLP.computeSize());
      paramInt = i;
      if (this.vLQ != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.vLQ);
      i = paramInt;
      if (this.vLR != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.vLR);
      paramInt = i;
      if (this.vHR != null)
        paramInt = i + e.a.a.a.ix(17, this.vHR.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(18, this.vHW);
      paramInt = i;
      if (this.vLS != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.vLS);
      i = paramInt;
      if (this.vLT != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.vLT);
      i += e.a.a.b.b.a.bs(21, this.vLC);
      paramInt = i;
      if (this.vLD != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.vLD);
      paramInt += e.a.a.b.b.a.bs(23, this.vLU);
      AppMethodBeat.o(123507);
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
          AppMethodBeat.o(123507);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(123507);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jp localjp = (jp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123507);
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
            localjp.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 2:
          localjp.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 3:
          localjp.vLH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 4:
          localjp.vLI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 5:
          localjp.vLJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 6:
          localjp.vHl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ato();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ato)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjp.vLK = ((ato)localObject1);
          }
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new lm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((lm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjp.vLL = ((lm)localObject1);
          }
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjp.vLM = paramArrayOfObject;
          }
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 10:
          localjp.vHS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 11:
          localjp.vCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 12:
          localjp.vLN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 13:
          localjp.vLO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjp.vLP = paramArrayOfObject;
          }
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 15:
          localjp.vLQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 16:
          localjp.vLR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjp.vHR = ((bzr)localObject1);
          }
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 18:
          localjp.vHW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 19:
          localjp.vLS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 20:
          localjp.vLT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 21:
          localjp.vLC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 22:
          localjp.vLD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        case 23:
          localjp.vLU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123507);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123507);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jp
 * JD-Core Version:    0.6.2
 */