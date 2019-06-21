package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class akg extends btd
{
  public String cMD;
  public String color;
  public String kbU;
  public String kbV;
  public String kbW;
  public String kbX;
  public int kbZ;
  public String kdg;
  public int qsq;
  public String qsr;
  public String qss;
  public String qst;
  public String qsv;
  public boolean qsw;
  public String title;
  public boolean wpH;
  public boolean wpI;
  public String wpJ;
  public String wpK;
  public int wpL;
  public String wpM;
  public int wpN;
  public String wpO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28444);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28444);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.wpH);
      paramArrayOfObject.aO(3, this.wpI);
      if (this.wpJ != null)
        paramArrayOfObject.e(4, this.wpJ);
      if (this.wpK != null)
        paramArrayOfObject.e(5, this.wpK);
      paramArrayOfObject.iz(6, this.wpL);
      if (this.wpM != null)
        paramArrayOfObject.e(7, this.wpM);
      paramArrayOfObject.iz(8, this.wpN);
      if (this.kbU != null)
        paramArrayOfObject.e(9, this.kbU);
      if (this.cMD != null)
        paramArrayOfObject.e(10, this.cMD);
      if (this.title != null)
        paramArrayOfObject.e(11, this.title);
      if (this.kbW != null)
        paramArrayOfObject.e(12, this.kbW);
      if (this.kbX != null)
        paramArrayOfObject.e(13, this.kbX);
      if (this.kdg != null)
        paramArrayOfObject.e(14, this.kdg);
      if (this.kbV != null)
        paramArrayOfObject.e(15, this.kbV);
      if (this.color != null)
        paramArrayOfObject.e(16, this.color);
      paramArrayOfObject.iz(17, this.qsq);
      if (this.qsr != null)
        paramArrayOfObject.e(18, this.qsr);
      if (this.qss != null)
        paramArrayOfObject.e(19, this.qss);
      if (this.qst != null)
        paramArrayOfObject.e(20, this.qst);
      paramArrayOfObject.iz(21, this.kbZ);
      if (this.qsv != null)
        paramArrayOfObject.e(22, this.qsv);
      if (this.wpO != null)
        paramArrayOfObject.e(23, this.wpO);
      paramArrayOfObject.aO(24, this.qsw);
      AppMethodBeat.o(28444);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1771;
    label1771: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 1) + (e.a.a.b.b.a.fv(3) + 1);
      paramInt = i;
      if (this.wpJ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wpJ);
      i = paramInt;
      if (this.wpK != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wpK);
      i += e.a.a.b.b.a.bs(6, this.wpL);
      paramInt = i;
      if (this.wpM != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wpM);
      paramInt += e.a.a.b.b.a.bs(8, this.wpN);
      i = paramInt;
      if (this.kbU != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.kbU);
      paramInt = i;
      if (this.cMD != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.cMD);
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.title);
      paramInt = i;
      if (this.kbW != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.kbW);
      i = paramInt;
      if (this.kbX != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.kbX);
      paramInt = i;
      if (this.kdg != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.kdg);
      i = paramInt;
      if (this.kbV != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.kbV);
      paramInt = i;
      if (this.color != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.color);
      paramInt += e.a.a.b.b.a.bs(17, this.qsq);
      i = paramInt;
      if (this.qsr != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.qsr);
      paramInt = i;
      if (this.qss != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.qss);
      i = paramInt;
      if (this.qst != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.qst);
      i += e.a.a.b.b.a.bs(21, this.kbZ);
      paramInt = i;
      if (this.qsv != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.qsv);
      i = paramInt;
      if (this.wpO != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.wpO);
      paramInt = i + (e.a.a.b.b.a.fv(24) + 1);
      AppMethodBeat.o(28444);
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
          AppMethodBeat.o(28444);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28444);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akg localakg = (akg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28444);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakg.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 2:
          localakg.wpH = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 3:
          localakg.wpI = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 4:
          localakg.wpJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 5:
          localakg.wpK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 6:
          localakg.wpL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 7:
          localakg.wpM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 8:
          localakg.wpN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 9:
          localakg.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 10:
          localakg.cMD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 11:
          localakg.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 12:
          localakg.kbW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 13:
          localakg.kbX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 14:
          localakg.kdg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 15:
          localakg.kbV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 16:
          localakg.color = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 17:
          localakg.qsq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 18:
          localakg.qsr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 19:
          localakg.qss = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 20:
          localakg.qst = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 21:
          localakg.kbZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 22:
          localakg.qsv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 23:
          localakg.wpO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        case 24:
          localakg.qsw = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28444);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28444);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akg
 * JD-Core Version:    0.6.2
 */