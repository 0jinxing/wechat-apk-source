package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnr extends btd
{
  public int cRh;
  public int kdT;
  public String kdU;
  public String tgu;
  public int wJb;
  public String wPv;
  public String wPx;
  public xg wQA;
  public bbh wQB;
  public String wQC;
  public int wQD;
  public String wQE;
  public int wQF;
  public boolean wQG;
  public String wQH;
  public String wQI;
  public LinkedList<bdy> wQJ;
  public String wQK;
  public String wQL;
  public String wQM;
  public String wQN;
  public bdy wQO;
  public axi wQP;
  public axi wQQ;
  public String wQR;
  public String wQS;
  public acd wQT;
  public String wQp;
  public String wQr;
  public String wQs;
  public String wQt;
  public int wQu;
  public LinkedList<xg> wQv;
  public int wQw;
  public LinkedList<xg> wQx;
  public xg wQy;
  public LinkedList<xg> wQz;
  public int wao;

  public bnr()
  {
    AppMethodBeat.i(56941);
    this.wQv = new LinkedList();
    this.wQx = new LinkedList();
    this.wQz = new LinkedList();
    this.wQJ = new LinkedList();
    AppMethodBeat.o(56941);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56942);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56942);
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
      paramArrayOfObject.iz(4, this.wJb);
      if (this.wQr != null)
        paramArrayOfObject.e(5, this.wQr);
      if (this.wQs != null)
        paramArrayOfObject.e(6, this.wQs);
      if (this.wQt != null)
        paramArrayOfObject.e(7, this.wQt);
      paramArrayOfObject.iz(8, this.wQu);
      paramArrayOfObject.e(9, 8, this.wQv);
      paramArrayOfObject.iz(10, this.cRh);
      paramArrayOfObject.iz(11, this.wQw);
      paramArrayOfObject.e(12, 8, this.wQx);
      if (this.wPv != null)
        paramArrayOfObject.e(13, this.wPv);
      if (this.wQy != null)
      {
        paramArrayOfObject.iy(14, this.wQy.computeSize());
        this.wQy.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(15, 8, this.wQz);
      if (this.wQA != null)
      {
        paramArrayOfObject.iy(16, this.wQA.computeSize());
        this.wQA.writeFields(paramArrayOfObject);
      }
      if (this.wQB != null)
      {
        paramArrayOfObject.iy(17, this.wQB.computeSize());
        this.wQB.writeFields(paramArrayOfObject);
      }
      if (this.wQC != null)
        paramArrayOfObject.e(18, this.wQC);
      paramArrayOfObject.iz(19, this.wQD);
      if (this.wQE != null)
        paramArrayOfObject.e(20, this.wQE);
      if (this.wQp != null)
        paramArrayOfObject.e(21, this.wQp);
      paramArrayOfObject.iz(22, this.wQF);
      paramArrayOfObject.aO(23, this.wQG);
      paramArrayOfObject.iz(24, this.wao);
      if (this.wPx != null)
        paramArrayOfObject.e(25, this.wPx);
      if (this.wQH != null)
        paramArrayOfObject.e(26, this.wQH);
      if (this.wQI != null)
        paramArrayOfObject.e(27, this.wQI);
      paramArrayOfObject.e(28, 8, this.wQJ);
      if (this.wQK != null)
        paramArrayOfObject.e(29, this.wQK);
      if (this.wQL != null)
        paramArrayOfObject.e(30, this.wQL);
      if (this.wQM != null)
        paramArrayOfObject.e(31, this.wQM);
      if (this.wQN != null)
        paramArrayOfObject.e(32, this.wQN);
      if (this.wQO != null)
      {
        paramArrayOfObject.iy(33, this.wQO.computeSize());
        this.wQO.writeFields(paramArrayOfObject);
      }
      if (this.wQP != null)
      {
        paramArrayOfObject.iy(34, this.wQP.computeSize());
        this.wQP.writeFields(paramArrayOfObject);
      }
      if (this.wQQ != null)
      {
        paramArrayOfObject.iy(35, this.wQQ.computeSize());
        this.wQQ.writeFields(paramArrayOfObject);
      }
      if (this.wQR != null)
        paramArrayOfObject.e(36, this.wQR);
      if (this.wQS != null)
        paramArrayOfObject.e(37, this.wQS);
      if (this.wQT != null)
      {
        paramArrayOfObject.iy(38, this.wQT.computeSize());
        this.wQT.writeFields(paramArrayOfObject);
      }
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56942);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label3813;
    label3813: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      paramInt += e.a.a.b.b.a.bs(4, this.wJb);
      i = paramInt;
      if (this.wQr != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wQr);
      paramInt = i;
      if (this.wQs != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wQs);
      i = paramInt;
      if (this.wQt != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wQt);
      i = i + e.a.a.b.b.a.bs(8, this.wQu) + e.a.a.a.c(9, 8, this.wQv) + e.a.a.b.b.a.bs(10, this.cRh) + e.a.a.b.b.a.bs(11, this.wQw) + e.a.a.a.c(12, 8, this.wQx);
      paramInt = i;
      if (this.wPv != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wPv);
      i = paramInt;
      if (this.wQy != null)
        i = paramInt + e.a.a.a.ix(14, this.wQy.computeSize());
      paramInt = i + e.a.a.a.c(15, 8, this.wQz);
      i = paramInt;
      if (this.wQA != null)
        i = paramInt + e.a.a.a.ix(16, this.wQA.computeSize());
      paramInt = i;
      if (this.wQB != null)
        paramInt = i + e.a.a.a.ix(17, this.wQB.computeSize());
      i = paramInt;
      if (this.wQC != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.wQC);
      i += e.a.a.b.b.a.bs(19, this.wQD);
      paramInt = i;
      if (this.wQE != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.wQE);
      i = paramInt;
      if (this.wQp != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.wQp);
      paramInt = i + e.a.a.b.b.a.bs(22, this.wQF) + (e.a.a.b.b.a.fv(23) + 1) + e.a.a.b.b.a.bs(24, this.wao);
      i = paramInt;
      if (this.wPx != null)
        i = paramInt + e.a.a.b.b.a.f(25, this.wPx);
      paramInt = i;
      if (this.wQH != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.wQH);
      i = paramInt;
      if (this.wQI != null)
        i = paramInt + e.a.a.b.b.a.f(27, this.wQI);
      i += e.a.a.a.c(28, 8, this.wQJ);
      paramInt = i;
      if (this.wQK != null)
        paramInt = i + e.a.a.b.b.a.f(29, this.wQK);
      i = paramInt;
      if (this.wQL != null)
        i = paramInt + e.a.a.b.b.a.f(30, this.wQL);
      int j = i;
      if (this.wQM != null)
        j = i + e.a.a.b.b.a.f(31, this.wQM);
      paramInt = j;
      if (this.wQN != null)
        paramInt = j + e.a.a.b.b.a.f(32, this.wQN);
      i = paramInt;
      if (this.wQO != null)
        i = paramInt + e.a.a.a.ix(33, this.wQO.computeSize());
      paramInt = i;
      if (this.wQP != null)
        paramInt = i + e.a.a.a.ix(34, this.wQP.computeSize());
      i = paramInt;
      if (this.wQQ != null)
        i = paramInt + e.a.a.a.ix(35, this.wQQ.computeSize());
      paramInt = i;
      if (this.wQR != null)
        paramInt = i + e.a.a.b.b.a.f(36, this.wQR);
      i = paramInt;
      if (this.wQS != null)
        i = paramInt + e.a.a.b.b.a.f(37, this.wQS);
      paramInt = i;
      if (this.wQT != null)
        paramInt = i + e.a.a.a.ix(38, this.wQT.computeSize());
      i = paramInt;
      if (this.tgu != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56942);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wQv.clear();
        this.wQx.clear();
        this.wQz.clear();
        this.wQJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56942);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56942);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnr localbnr = (bnr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56942);
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
            localbnr.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 2:
          localbnr.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 3:
          localbnr.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 4:
          localbnr.wJb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 5:
          localbnr.wQr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 6:
          localbnr.wQs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 7:
          localbnr.wQt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 8:
          localbnr.wQu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQv.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 10:
          localbnr.cRh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 11:
          localbnr.wQw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQx.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 13:
          localbnr.wPv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQy = paramArrayOfObject;
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQz.add(localObject1);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQA = paramArrayOfObject;
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bbh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQB = ((bbh)localObject1);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 18:
          localbnr.wQC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 19:
          localbnr.wQD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 20:
          localbnr.wQE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 21:
          localbnr.wQp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 22:
          localbnr.wQF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 23:
          localbnr.wQG = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 24:
          localbnr.wao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 25:
          localbnr.wPx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 26:
          localbnr.wQH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 27:
          localbnr.wQI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 28:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQJ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 29:
          localbnr.wQK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 30:
          localbnr.wQL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 31:
          localbnr.wQM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 32:
          localbnr.wQN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 33:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQO = paramArrayOfObject;
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 34:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQP = ((axi)localObject1);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 35:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQQ = paramArrayOfObject;
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 36:
          localbnr.wQR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 37:
          localbnr.wQS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 38:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new acd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((acd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnr.wQT = ((acd)localObject1);
          }
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        case 100:
          localbnr.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56942);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56942);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnr
 * JD-Core Version:    0.6.2
 */