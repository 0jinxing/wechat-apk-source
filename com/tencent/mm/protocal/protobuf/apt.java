package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class apt extends btd
{
  public String fha;
  public boolean lvU;
  public LinkedList<ach> vEx;
  public LinkedList<String> wtG;
  public String wtH;
  public String wtI;
  public boolean wtK;
  public LinkedList<cyi> wtN;
  public LinkedList<cyj> wtO;
  public String wtP;
  public String wtQ;
  public String wtR;
  public String wtS;
  public boolean wtT;
  public int wtU;
  public String wtV;

  public apt()
  {
    AppMethodBeat.i(28482);
    this.wtN = new LinkedList();
    this.wtO = new LinkedList();
    this.wtG = new LinkedList();
    this.vEx = new LinkedList();
    AppMethodBeat.o(28482);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28483);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28483);
        throw paramArrayOfObject;
      }
      if (this.wtP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: championcoverurl");
        AppMethodBeat.o(28483);
        throw paramArrayOfObject;
      }
      if (this.wtQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: championmotto");
        AppMethodBeat.o(28483);
        throw paramArrayOfObject;
      }
      if (this.fha == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rankid");
        AppMethodBeat.o(28483);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wtN);
      paramArrayOfObject.e(3, 8, this.wtO);
      paramArrayOfObject.e(4, 1, this.wtG);
      if (this.wtP != null)
        paramArrayOfObject.e(5, this.wtP);
      if (this.wtQ != null)
        paramArrayOfObject.e(6, this.wtQ);
      if (this.fha != null)
        paramArrayOfObject.e(7, this.fha);
      if (this.wtR != null)
        paramArrayOfObject.e(8, this.wtR);
      if (this.wtH != null)
        paramArrayOfObject.e(9, this.wtH);
      paramArrayOfObject.aO(10, this.lvU);
      if (this.wtI != null)
        paramArrayOfObject.e(11, this.wtI);
      paramArrayOfObject.e(12, 8, this.vEx);
      paramArrayOfObject.aO(13, this.wtK);
      if (this.wtS != null)
        paramArrayOfObject.e(14, this.wtS);
      paramArrayOfObject.aO(15, this.wtT);
      paramArrayOfObject.iz(16, this.wtU);
      if (this.wtV != null)
        paramArrayOfObject.e(17, this.wtV);
      AppMethodBeat.o(28483);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1738;
    label1738: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.wtN) + e.a.a.a.c(3, 8, this.wtO) + e.a.a.a.c(4, 1, this.wtG);
      i = paramInt;
      if (this.wtP != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wtP);
      paramInt = i;
      if (this.wtQ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wtQ);
      i = paramInt;
      if (this.fha != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.fha);
      paramInt = i;
      if (this.wtR != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wtR);
      i = paramInt;
      if (this.wtH != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wtH);
      i += e.a.a.b.b.a.fv(10) + 1;
      paramInt = i;
      if (this.wtI != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wtI);
      i = paramInt + e.a.a.a.c(12, 8, this.vEx) + (e.a.a.b.b.a.fv(13) + 1);
      paramInt = i;
      if (this.wtS != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.wtS);
      i = paramInt + (e.a.a.b.b.a.fv(15) + 1) + e.a.a.b.b.a.bs(16, this.wtU);
      paramInt = i;
      if (this.wtV != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wtV);
      AppMethodBeat.o(28483);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtN.clear();
        this.wtO.clear();
        this.wtG.clear();
        this.vEx.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28483);
          throw paramArrayOfObject;
        }
        if (this.wtP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: championcoverurl");
          AppMethodBeat.o(28483);
          throw paramArrayOfObject;
        }
        if (this.wtQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: championmotto");
          AppMethodBeat.o(28483);
          throw paramArrayOfObject;
        }
        if (this.fha == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rankid");
          AppMethodBeat.o(28483);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28483);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apt localapt = (apt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28483);
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
            localapt.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cyi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapt.wtN.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cyj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapt.wtO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 4:
          localapt.wtG.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 5:
          localapt.wtP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 6:
          localapt.wtQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 7:
          localapt.fha = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 8:
          localapt.wtR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 9:
          localapt.wtH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 10:
          localapt.lvU = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 11:
          localapt.wtI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ach();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapt.vEx.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 13:
          localapt.wtK = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 14:
          localapt.wtS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 15:
          localapt.wtT = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 16:
          localapt.wtU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        case 17:
          localapt.wtV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28483);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28483);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apt
 * JD-Core Version:    0.6.2
 */