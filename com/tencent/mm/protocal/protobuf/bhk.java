package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bhk extends btd
{
  public long cSh;
  public int nSb;
  public int nSc;
  public String nSd;
  public String nSe;
  public String nSf;
  public bpt vWf;
  public int vzO;
  public int wKA;
  public long wKB;
  public long wKC;
  public LinkedList<ash> wKD;
  public String wKE;
  public String wKF;
  public String wKG;
  public int wKH;
  public int wKI;
  public String wKJ;
  public int wKy;
  public int wKz;

  public bhk()
  {
    AppMethodBeat.i(56874);
    this.wKD = new LinkedList();
    AppMethodBeat.o(56874);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56875);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56875);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wKy);
      paramArrayOfObject.iz(3, this.wKz);
      paramArrayOfObject.iz(4, this.nSb);
      paramArrayOfObject.ai(5, this.cSh);
      paramArrayOfObject.iz(6, this.wKA);
      paramArrayOfObject.ai(7, this.wKB);
      paramArrayOfObject.iz(8, this.vzO);
      paramArrayOfObject.ai(9, this.wKC);
      paramArrayOfObject.iz(10, this.nSc);
      paramArrayOfObject.e(11, 8, this.wKD);
      if (this.nSd != null)
        paramArrayOfObject.e(12, this.nSd);
      if (this.wKE != null)
        paramArrayOfObject.e(13, this.wKE);
      if (this.wKF != null)
        paramArrayOfObject.e(14, this.wKF);
      if (this.wKG != null)
        paramArrayOfObject.e(15, this.wKG);
      paramArrayOfObject.iz(16, this.wKH);
      if (this.nSf != null)
        paramArrayOfObject.e(17, this.nSf);
      paramArrayOfObject.iz(18, this.wKI);
      if (this.nSe != null)
        paramArrayOfObject.e(19, this.nSe);
      if (this.vWf != null)
      {
        paramArrayOfObject.iy(20, this.vWf.computeSize());
        this.vWf.writeFields(paramArrayOfObject);
      }
      if (this.wKJ != null)
        paramArrayOfObject.e(21, this.wKJ);
      AppMethodBeat.o(56875);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1649;
    label1649: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wKy) + e.a.a.b.b.a.bs(3, this.wKz) + e.a.a.b.b.a.bs(4, this.nSb) + e.a.a.b.b.a.o(5, this.cSh) + e.a.a.b.b.a.bs(6, this.wKA) + e.a.a.b.b.a.o(7, this.wKB) + e.a.a.b.b.a.bs(8, this.vzO) + e.a.a.b.b.a.o(9, this.wKC) + e.a.a.b.b.a.bs(10, this.nSc) + e.a.a.a.c(11, 8, this.wKD);
      paramInt = i;
      if (this.nSd != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.nSd);
      i = paramInt;
      if (this.wKE != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wKE);
      paramInt = i;
      if (this.wKF != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.wKF);
      i = paramInt;
      if (this.wKG != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.wKG);
      i += e.a.a.b.b.a.bs(16, this.wKH);
      paramInt = i;
      if (this.nSf != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.nSf);
      paramInt += e.a.a.b.b.a.bs(18, this.wKI);
      i = paramInt;
      if (this.nSe != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.nSe);
      paramInt = i;
      if (this.vWf != null)
        paramInt = i + e.a.a.a.ix(20, this.vWf.computeSize());
      i = paramInt;
      if (this.wKJ != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.wKJ);
      AppMethodBeat.o(56875);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wKD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56875);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56875);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bhk localbhk = (bhk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56875);
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
            localbhk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 2:
          localbhk.wKy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 3:
          localbhk.wKz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 4:
          localbhk.nSb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 5:
          localbhk.cSh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 6:
          localbhk.wKA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 7:
          localbhk.wKB = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 8:
          localbhk.vzO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 9:
          localbhk.wKC = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 10:
          localbhk.nSc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ash();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhk.wKD.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 12:
          localbhk.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 13:
          localbhk.wKE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 14:
          localbhk.wKF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 15:
          localbhk.wKG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 16:
          localbhk.wKH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 17:
          localbhk.nSf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 18:
          localbhk.wKI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 19:
          localbhk.nSe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bpt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhk.vWf = ((bpt)localObject1);
          }
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        case 21:
          localbhk.wKJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56875);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56875);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhk
 * JD-Core Version:    0.6.2
 */