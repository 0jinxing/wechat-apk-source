package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class lv extends btd
{
  public String cBT;
  public int kdT;
  public String kdU;
  public int pPG = 0;
  public String pPH;
  public String pPI;
  public String pPJ;
  public String pPK;
  public String vFb;
  public String vFc;
  public String vFd;
  public String vPA;
  public bzp vPB;
  public String vPC;
  public String vPD;
  public int vPE;
  public int vPF;
  public int vPG;
  public chl vPH;
  public String vPI;
  public int vPJ;
  public int vPK;
  public int vPL;
  public com.tencent.mm.bt.b vPM;
  public int vPN;
  public int vPO;
  public int vPP;
  public String vPo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56725);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56725);
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
      if (this.cBT != null)
        paramArrayOfObject.e(4, this.cBT);
      if (this.vPA != null)
        paramArrayOfObject.e(5, this.vPA);
      if (this.vPB != null)
      {
        paramArrayOfObject.iy(6, this.vPB.computeSize());
        this.vPB.writeFields(paramArrayOfObject);
      }
      if (this.vFb != null)
        paramArrayOfObject.e(7, this.vFb);
      if (this.vFd != null)
        paramArrayOfObject.e(8, this.vFd);
      if (this.vPC != null)
        paramArrayOfObject.e(9, this.vPC);
      if (this.vPD != null)
        paramArrayOfObject.e(10, this.vPD);
      paramArrayOfObject.iz(11, this.vPE);
      if (this.vFc != null)
        paramArrayOfObject.e(12, this.vFc);
      if (this.vPo != null)
        paramArrayOfObject.e(13, this.vPo);
      paramArrayOfObject.iz(14, this.vPF);
      paramArrayOfObject.iz(15, this.vPG);
      if (this.vPH != null)
      {
        paramArrayOfObject.iy(16, this.vPH.computeSize());
        this.vPH.writeFields(paramArrayOfObject);
      }
      if (this.vPI != null)
        paramArrayOfObject.e(17, this.vPI);
      paramArrayOfObject.iz(18, this.vPJ);
      paramArrayOfObject.iz(19, this.vPK);
      paramArrayOfObject.iz(20, this.vPL);
      if (this.vPM != null)
        paramArrayOfObject.c(21, this.vPM);
      paramArrayOfObject.iz(22, this.vPN);
      paramArrayOfObject.iz(23, this.pPG);
      if (this.pPH != null)
        paramArrayOfObject.e(24, this.pPH);
      if (this.pPI != null)
        paramArrayOfObject.e(25, this.pPI);
      paramArrayOfObject.iz(26, this.vPO);
      if (this.pPJ != null)
        paramArrayOfObject.e(27, this.pPJ);
      if (this.pPK != null)
        paramArrayOfObject.e(28, this.pPK);
      paramArrayOfObject.iz(29, this.vPP);
      AppMethodBeat.o(56725);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2192;
    label2192: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kdT);
      i = paramInt;
      if (this.kdU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kdU);
      paramInt = i;
      if (this.cBT != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.cBT);
      i = paramInt;
      if (this.vPA != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vPA);
      int j = i;
      if (this.vPB != null)
        j = i + e.a.a.a.ix(6, this.vPB.computeSize());
      paramInt = j;
      if (this.vFb != null)
        paramInt = j + e.a.a.b.b.a.f(7, this.vFb);
      i = paramInt;
      if (this.vFd != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vFd);
      paramInt = i;
      if (this.vPC != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vPC);
      i = paramInt;
      if (this.vPD != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vPD);
      i += e.a.a.b.b.a.bs(11, this.vPE);
      paramInt = i;
      if (this.vFc != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vFc);
      i = paramInt;
      if (this.vPo != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.vPo);
      i = i + e.a.a.b.b.a.bs(14, this.vPF) + e.a.a.b.b.a.bs(15, this.vPG);
      paramInt = i;
      if (this.vPH != null)
        paramInt = i + e.a.a.a.ix(16, this.vPH.computeSize());
      i = paramInt;
      if (this.vPI != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.vPI);
      i = i + e.a.a.b.b.a.bs(18, this.vPJ) + e.a.a.b.b.a.bs(19, this.vPK) + e.a.a.b.b.a.bs(20, this.vPL);
      paramInt = i;
      if (this.vPM != null)
        paramInt = i + e.a.a.b.b.a.b(21, this.vPM);
      i = paramInt + e.a.a.b.b.a.bs(22, this.vPN) + e.a.a.b.b.a.bs(23, this.pPG);
      paramInt = i;
      if (this.pPH != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.pPH);
      i = paramInt;
      if (this.pPI != null)
        i = paramInt + e.a.a.b.b.a.f(25, this.pPI);
      i += e.a.a.b.b.a.bs(26, this.vPO);
      paramInt = i;
      if (this.pPJ != null)
        paramInt = i + e.a.a.b.b.a.f(27, this.pPJ);
      i = paramInt;
      if (this.pPK != null)
        i = paramInt + e.a.a.b.b.a.f(28, this.pPK);
      paramInt = i + e.a.a.b.b.a.bs(29, this.vPP);
      AppMethodBeat.o(56725);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56725);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56725);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lv locallv = (lv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56725);
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
            locallv.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 2:
          locallv.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 3:
          locallv.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 4:
          locallv.cBT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 5:
          locallv.vPA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallv.vPB = paramArrayOfObject;
          }
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 7:
          locallv.vFb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 8:
          locallv.vFd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 9:
          locallv.vPC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 10:
          locallv.vPD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 11:
          locallv.vPE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 12:
          locallv.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 13:
          locallv.vPo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 14:
          locallv.vPF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 15:
          locallv.vPG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new chl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallv.vPH = paramArrayOfObject;
          }
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 17:
          locallv.vPI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 18:
          locallv.vPJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 19:
          locallv.vPK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 20:
          locallv.vPL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 21:
          locallv.vPM = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 22:
          locallv.vPN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 23:
          locallv.pPG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 24:
          locallv.pPH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 25:
          locallv.pPI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 26:
          locallv.vPO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 27:
          locallv.pPJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 28:
          locallv.pPK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        case 29:
          locallv.vPP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56725);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56725);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lv
 * JD-Core Version:    0.6.2
 */