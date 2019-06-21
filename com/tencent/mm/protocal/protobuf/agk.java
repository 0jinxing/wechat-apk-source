package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class agk extends btd
{
  public String color;
  public String content;
  public String kbU;
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
  public boolean vBQ = false;
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

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89076);
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
      AppMethodBeat.o(89076);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2320;
    label2320: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
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
      int j = paramInt;
      if (this.vBH != null)
        j = paramInt + e.a.a.b.b.a.f(6, this.vBH);
      i = j;
      if (this.vBI != null)
        i = j + e.a.a.b.b.a.f(7, this.vBI);
      paramInt = i;
      if (this.vBJ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vBJ);
      i = paramInt;
      if (this.vBK != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vBK);
      paramInt = i;
      if (this.vBL != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vBL);
      i = paramInt;
      if (this.vBM != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vBM);
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
      i = paramInt + (e.a.a.b.b.a.fv(17) + 1) + e.a.a.b.b.a.bs(18, this.vBR) + e.a.a.b.b.a.bs(19, this.vBS) + e.a.a.b.b.a.bs(20, this.vBT);
      paramInt = i;
      if (this.color != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.color);
      i = paramInt;
      if (this.vBU != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.vBU);
      paramInt = i;
      if (this.vBV != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.vBV);
      i = paramInt + e.a.a.b.b.a.bs(24, this.vBW);
      paramInt = i;
      if (this.vBX != null)
        paramInt = i + e.a.a.b.b.a.f(25, this.vBX);
      i = paramInt;
      if (this.vBY != null)
        i = paramInt + e.a.a.b.b.a.f(26, this.vBY);
      paramInt = i;
      if (this.vBZ != null)
        paramInt = i + e.a.a.b.b.a.f(27, this.vBZ);
      j = paramInt;
      if (this.vCa != null)
        j = paramInt + e.a.a.b.b.a.f(28, this.vCa);
      i = j;
      if (this.vCb != null)
        i = j + e.a.a.b.b.a.f(29, this.vCb);
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
      AppMethodBeat.o(89076);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89076);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agk localagk = (agk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89076);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 2:
          localagk.vBE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 3:
          localagk.vBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 4:
          localagk.vBG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 5:
          localagk.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 6:
          localagk.vBH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 7:
          localagk.vBI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 8:
          localagk.vBJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 9:
          localagk.vBK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 10:
          localagk.vBL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 11:
          localagk.vBM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 12:
          localagk.vBN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 13:
          localagk.vBO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 14:
          localagk.kcU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 15:
          localagk.kcV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 16:
          localagk.vBP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 17:
          localagk.vBQ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 18:
          localagk.vBR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 19:
          localagk.vBS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 20:
          localagk.vBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 21:
          localagk.color = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 22:
          localagk.vBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 23:
          localagk.vBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 24:
          localagk.vBW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 25:
          localagk.vBX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 26:
          localagk.vBY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 27:
          localagk.vBZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 28:
          localagk.vCa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 29:
          localagk.vCb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 30:
          localagk.vCc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 31:
          localagk.vCd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 32:
          localagk.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        case 33:
          localagk.vCe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89076);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89076);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agk
 * JD-Core Version:    0.6.2
 */