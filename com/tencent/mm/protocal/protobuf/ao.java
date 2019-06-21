package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ao extends btd
{
  public String color;
  public String content;
  public String kbU;
  public LinkedList<ap> kcO;
  public LinkedList<aq> kcP;
  public String kcQ;
  public int kcR;
  public String kcS;
  public String kcT;
  public String kcU;
  public String kcV;
  public String vBE;
  public String vBF;
  public String vBG;
  public String vBH;
  public String vBI;
  public String vBJ;
  public String vBK;
  public String vBL;
  public String vBM;
  public String vBN;
  public String vBO;
  public String vBP;
  public boolean vBQ;
  public int vBR;
  public int vBS;
  public int vBT;
  public String vBU;
  public String vBV;
  public int vBW;
  public String vBX;
  public String vBY;
  public String vBZ;
  public String vCa;
  public String vCb;
  public String vCc;
  public String vCd;
  public String vCe;

  public ao()
  {
    AppMethodBeat.i(88999);
    this.vBQ = false;
    this.kcO = new LinkedList();
    this.kcP = new LinkedList();
    AppMethodBeat.o(88999);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89000);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vBE != null)
        paramArrayOfObject.e(2, this.vBE);
      if (this.vBF != null)
        paramArrayOfObject.e(3, this.vBF);
      if (this.vBG != null)
        paramArrayOfObject.e(4, this.vBG);
      if (this.content != null)
        paramArrayOfObject.e(5, this.content);
      if (this.vBH != null)
        paramArrayOfObject.e(6, this.vBH);
      if (this.vBI != null)
        paramArrayOfObject.e(7, this.vBI);
      if (this.vBJ != null)
        paramArrayOfObject.e(8, this.vBJ);
      if (this.vBK != null)
        paramArrayOfObject.e(9, this.vBK);
      if (this.vBL != null)
        paramArrayOfObject.e(10, this.vBL);
      if (this.vBM != null)
        paramArrayOfObject.e(11, this.vBM);
      if (this.vBN != null)
        paramArrayOfObject.e(12, this.vBN);
      if (this.vBO != null)
        paramArrayOfObject.e(13, this.vBO);
      if (this.kcU != null)
        paramArrayOfObject.e(14, this.kcU);
      if (this.kcV != null)
        paramArrayOfObject.e(15, this.kcV);
      if (this.vBP != null)
        paramArrayOfObject.e(16, this.vBP);
      paramArrayOfObject.aO(17, this.vBQ);
      paramArrayOfObject.iz(18, this.vBR);
      paramArrayOfObject.iz(19, this.vBS);
      paramArrayOfObject.iz(20, this.vBT);
      if (this.color != null)
        paramArrayOfObject.e(21, this.color);
      if (this.vBU != null)
        paramArrayOfObject.e(22, this.vBU);
      if (this.vBV != null)
        paramArrayOfObject.e(23, this.vBV);
      paramArrayOfObject.iz(24, this.vBW);
      if (this.vBX != null)
        paramArrayOfObject.e(25, this.vBX);
      if (this.vBY != null)
        paramArrayOfObject.e(26, this.vBY);
      if (this.vBZ != null)
        paramArrayOfObject.e(27, this.vBZ);
      if (this.vCa != null)
        paramArrayOfObject.e(28, this.vCa);
      if (this.vCb != null)
        paramArrayOfObject.e(29, this.vCb);
      if (this.vCc != null)
        paramArrayOfObject.e(30, this.vCc);
      if (this.vCd != null)
        paramArrayOfObject.e(31, this.vCd);
      if (this.kbU != null)
        paramArrayOfObject.e(32, this.kbU);
      if (this.vCe != null)
        paramArrayOfObject.e(33, this.vCe);
      paramArrayOfObject.e(34, 8, this.kcO);
      paramArrayOfObject.e(35, 8, this.kcP);
      if (this.kcQ != null)
        paramArrayOfObject.e(36, this.kcQ);
      paramArrayOfObject.iz(37, this.kcR);
      if (this.kcS != null)
        paramArrayOfObject.e(38, this.kcS);
      if (this.kcT != null)
        paramArrayOfObject.e(39, this.kcT);
      AppMethodBeat.o(89000);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2850;
    label2850: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vBE != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vBE);
      paramInt = i;
      if (this.vBF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vBF);
      i = paramInt;
      if (this.vBG != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vBG);
      paramInt = i;
      if (this.content != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.content);
      i = paramInt;
      if (this.vBH != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vBH);
      paramInt = i;
      if (this.vBI != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vBI);
      i = paramInt;
      if (this.vBJ != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vBJ);
      paramInt = i;
      if (this.vBK != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vBK);
      int j = paramInt;
      if (this.vBL != null)
        j = paramInt + e.a.a.b.b.a.f(10, this.vBL);
      i = j;
      if (this.vBM != null)
        i = j + e.a.a.b.b.a.f(11, this.vBM);
      paramInt = i;
      if (this.vBN != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vBN);
      i = paramInt;
      if (this.vBO != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.vBO);
      paramInt = i;
      if (this.kcU != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.kcU);
      i = paramInt;
      if (this.kcV != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.kcV);
      paramInt = i;
      if (this.vBP != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vBP);
      paramInt = paramInt + (e.a.a.b.b.a.fv(17) + 1) + e.a.a.b.b.a.bs(18, this.vBR) + e.a.a.b.b.a.bs(19, this.vBS) + e.a.a.b.b.a.bs(20, this.vBT);
      i = paramInt;
      if (this.color != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.color);
      paramInt = i;
      if (this.vBU != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.vBU);
      i = paramInt;
      if (this.vBV != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.vBV);
      i += e.a.a.b.b.a.bs(24, this.vBW);
      paramInt = i;
      if (this.vBX != null)
        paramInt = i + e.a.a.b.b.a.f(25, this.vBX);
      j = paramInt;
      if (this.vBY != null)
        j = paramInt + e.a.a.b.b.a.f(26, this.vBY);
      i = j;
      if (this.vBZ != null)
        i = j + e.a.a.b.b.a.f(27, this.vBZ);
      paramInt = i;
      if (this.vCa != null)
        paramInt = i + e.a.a.b.b.a.f(28, this.vCa);
      i = paramInt;
      if (this.vCb != null)
        i = paramInt + e.a.a.b.b.a.f(29, this.vCb);
      paramInt = i;
      if (this.vCc != null)
        paramInt = i + e.a.a.b.b.a.f(30, this.vCc);
      i = paramInt;
      if (this.vCd != null)
        i = paramInt + e.a.a.b.b.a.f(31, this.vCd);
      paramInt = i;
      if (this.kbU != null)
        paramInt = i + e.a.a.b.b.a.f(32, this.kbU);
      i = paramInt;
      if (this.vCe != null)
        i = paramInt + e.a.a.b.b.a.f(33, this.vCe);
      i = i + e.a.a.a.c(34, 8, this.kcO) + e.a.a.a.c(35, 8, this.kcP);
      paramInt = i;
      if (this.kcQ != null)
        paramInt = i + e.a.a.b.b.a.f(36, this.kcQ);
      i = paramInt + e.a.a.b.b.a.bs(37, this.kcR);
      paramInt = i;
      if (this.kcS != null)
        paramInt = i + e.a.a.b.b.a.f(38, this.kcS);
      i = paramInt;
      if (this.kcT != null)
        i = paramInt + e.a.a.b.b.a.f(39, this.kcT);
      AppMethodBeat.o(89000);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.kcO.clear();
        this.kcP.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89000);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ao localao = (ao)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89000);
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
            localao.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 2:
          localao.vBE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 3:
          localao.vBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 4:
          localao.vBG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 5:
          localao.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 6:
          localao.vBH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 7:
          localao.vBI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 8:
          localao.vBJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 9:
          localao.vBK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 10:
          localao.vBL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 11:
          localao.vBM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 12:
          localao.vBN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 13:
          localao.vBO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 14:
          localao.kcU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 15:
          localao.kcV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 16:
          localao.vBP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 17:
          localao.vBQ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 18:
          localao.vBR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 19:
          localao.vBS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 20:
          localao.vBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 21:
          localao.color = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 22:
          localao.vBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 23:
          localao.vBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 24:
          localao.vBW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 25:
          localao.vBX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 26:
          localao.vBY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 27:
          localao.vBZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 28:
          localao.vCa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 29:
          localao.vCb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 30:
          localao.vCc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 31:
          localao.vCd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 32:
          localao.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 33:
          localao.vCe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 34:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ap();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ap)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localao.kcO.add(localObject1);
          }
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 35:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localao.kcP.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 36:
          localao.kcQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 37:
          localao.kcR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 38:
          localao.kcS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        case 39:
          localao.kcT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89000);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89000);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ao
 * JD-Core Version:    0.6.2
 */