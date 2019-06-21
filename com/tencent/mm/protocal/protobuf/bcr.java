package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bcr extends com.tencent.mm.bt.a
{
  public int guN;
  public String guO;
  public String guP;
  public String guQ;
  public int guR;
  public String guS;
  public int guT;
  public int guU;
  public String guV;
  public String guW;
  public int jBT;
  public int vCf;
  public int vCi;
  public int wBT;
  public String wBU;
  public String wBV;
  public String wBW;
  public int wBX;
  public xe wGB;
  public int wGO;
  public int wGT;
  public com.tencent.mm.bt.b wGU;
  public int wGW;
  public bts wGX;
  public bts wGY;
  public int wGZ;
  public int wGh;
  public int wHa;
  public int wHb;
  public int wHc;
  public int wHd;
  public arr wHe;
  public int wHf;
  public String wHg;
  public bts wcB;
  public long wfm;
  public String wfn;
  public bts wyX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60051);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: UserName");
        AppMethodBeat.o(60051);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: NickName");
        AppMethodBeat.o(60051);
        throw paramArrayOfObject;
      }
      if (this.wGX == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BindEmail");
        AppMethodBeat.o(60051);
        throw paramArrayOfObject;
      }
      if (this.wGY == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BindMobile");
        AppMethodBeat.o(60051);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wGW);
      if (this.wcB != null)
      {
        paramArrayOfObject.iy(2, this.wcB.computeSize());
        this.wcB.writeFields(paramArrayOfObject);
      }
      if (this.wyX != null)
      {
        paramArrayOfObject.iy(3, this.wyX.computeSize());
        this.wyX.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vCf);
      if (this.wGX != null)
      {
        paramArrayOfObject.iy(5, this.wGX.computeSize());
        this.wGX.writeFields(paramArrayOfObject);
      }
      if (this.wGY != null)
      {
        paramArrayOfObject.iy(6, this.wGY.computeSize());
        this.wGY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.jBT);
      paramArrayOfObject.iz(8, this.wGT);
      if (this.wGU != null)
        paramArrayOfObject.c(9, this.wGU);
      paramArrayOfObject.iz(10, this.guN);
      if (this.guO != null)
        paramArrayOfObject.e(11, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(12, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(13, this.guQ);
      paramArrayOfObject.iz(14, this.guR);
      if (this.wGB != null)
      {
        paramArrayOfObject.iy(15, this.wGB.computeSize());
        this.wGB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(16, this.vCi);
      paramArrayOfObject.iz(17, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(18, this.wBU);
      paramArrayOfObject.iz(19, this.wGZ);
      paramArrayOfObject.iz(20, this.wHa);
      paramArrayOfObject.iz(21, this.wGh);
      paramArrayOfObject.iz(22, this.wHb);
      paramArrayOfObject.iz(23, this.wHc);
      if (this.wBV != null)
        paramArrayOfObject.e(24, this.wBV);
      paramArrayOfObject.iz(25, this.wHd);
      if (this.wHe != null)
      {
        paramArrayOfObject.iy(26, this.wHe.computeSize());
        this.wHe.writeFields(paramArrayOfObject);
      }
      if (this.guS != null)
        paramArrayOfObject.e(27, this.guS);
      if (this.wBW != null)
        paramArrayOfObject.e(28, this.wBW);
      paramArrayOfObject.iz(29, this.wBX);
      paramArrayOfObject.iz(30, this.wHf);
      paramArrayOfObject.ai(31, this.wfm);
      if (this.wfn != null)
        paramArrayOfObject.e(32, this.wfn);
      paramArrayOfObject.iz(33, this.guU);
      paramArrayOfObject.iz(34, this.guT);
      if (this.guV != null)
        paramArrayOfObject.e(35, this.guV);
      paramArrayOfObject.iz(36, this.wGO);
      if (this.wHg != null)
        paramArrayOfObject.e(37, this.wHg);
      if (this.guW != null)
        paramArrayOfObject.e(38, this.guW);
      AppMethodBeat.o(60051);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wGW) + 0;
        paramInt = i;
        if (this.wcB != null)
          paramInt = i + e.a.a.a.ix(2, this.wcB.computeSize());
        i = paramInt;
        if (this.wyX != null)
          i = paramInt + e.a.a.a.ix(3, this.wyX.computeSize());
        i += e.a.a.b.b.a.bs(4, this.vCf);
        paramInt = i;
        if (this.wGX != null)
          paramInt = i + e.a.a.a.ix(5, this.wGX.computeSize());
        i = paramInt;
        if (this.wGY != null)
          i = paramInt + e.a.a.a.ix(6, this.wGY.computeSize());
        i = i + e.a.a.b.b.a.bs(7, this.jBT) + e.a.a.b.b.a.bs(8, this.wGT);
        paramInt = i;
        if (this.wGU != null)
          paramInt = i + e.a.a.b.b.a.b(9, this.wGU);
        i = paramInt + e.a.a.b.b.a.bs(10, this.guN);
        paramInt = i;
        if (this.guO != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.guO);
        i = paramInt;
        if (this.guP != null)
          i = paramInt + e.a.a.b.b.a.f(12, this.guP);
        paramInt = i;
        if (this.guQ != null)
          paramInt = i + e.a.a.b.b.a.f(13, this.guQ);
        i = paramInt + e.a.a.b.b.a.bs(14, this.guR);
        paramInt = i;
        if (this.wGB != null)
          paramInt = i + e.a.a.a.ix(15, this.wGB.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(16, this.vCi) + e.a.a.b.b.a.bs(17, this.wBT);
        paramInt = i;
        if (this.wBU != null)
          paramInt = i + e.a.a.b.b.a.f(18, this.wBU);
        i = paramInt + e.a.a.b.b.a.bs(19, this.wGZ) + e.a.a.b.b.a.bs(20, this.wHa) + e.a.a.b.b.a.bs(21, this.wGh) + e.a.a.b.b.a.bs(22, this.wHb) + e.a.a.b.b.a.bs(23, this.wHc);
        paramInt = i;
        if (this.wBV != null)
          paramInt = i + e.a.a.b.b.a.f(24, this.wBV);
        paramInt += e.a.a.b.b.a.bs(25, this.wHd);
        i = paramInt;
        if (this.wHe != null)
          i = paramInt + e.a.a.a.ix(26, this.wHe.computeSize());
        paramInt = i;
        if (this.guS != null)
          paramInt = i + e.a.a.b.b.a.f(27, this.guS);
        i = paramInt;
        if (this.wBW != null)
          i = paramInt + e.a.a.b.b.a.f(28, this.wBW);
        i = i + e.a.a.b.b.a.bs(29, this.wBX) + e.a.a.b.b.a.bs(30, this.wHf) + e.a.a.b.b.a.o(31, this.wfm);
        paramInt = i;
        if (this.wfn != null)
          paramInt = i + e.a.a.b.b.a.f(32, this.wfn);
        i = paramInt + e.a.a.b.b.a.bs(33, this.guU) + e.a.a.b.b.a.bs(34, this.guT);
        paramInt = i;
        if (this.guV != null)
          paramInt = i + e.a.a.b.b.a.f(35, this.guV);
        i = paramInt + e.a.a.b.b.a.bs(36, this.wGO);
        paramInt = i;
        if (this.wHg != null)
          paramInt = i + e.a.a.b.b.a.f(37, this.wHg);
        i = paramInt;
        if (this.guW != null)
          i = paramInt + e.a.a.b.b.a.f(38, this.guW);
        AppMethodBeat.o(60051);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: UserName");
          AppMethodBeat.o(60051);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: NickName");
          AppMethodBeat.o(60051);
          throw paramArrayOfObject;
        }
        if (this.wGX == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BindEmail");
          AppMethodBeat.o(60051);
          throw paramArrayOfObject;
        }
        if (this.wGY == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BindMobile");
          AppMethodBeat.o(60051);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60051);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bcr localbcr = (bcr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60051);
          break;
        case 1:
          localbcr.wGW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcr.wcB = paramArrayOfObject;
          }
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcr.wyX = paramArrayOfObject;
          }
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 4:
          localbcr.vCf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcr.wGX = ((bts)localObject1);
          }
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcr.wGY = ((bts)localObject1);
          }
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 7:
          localbcr.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 8:
          localbcr.wGT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 9:
          localbcr.wGU = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 10:
          localbcr.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 11:
          localbcr.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 12:
          localbcr.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 13:
          localbcr.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 14:
          localbcr.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcr.wGB = paramArrayOfObject;
          }
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 16:
          localbcr.vCi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 17:
          localbcr.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 18:
          localbcr.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 19:
          localbcr.wGZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 20:
          localbcr.wHa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 21:
          localbcr.wGh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 22:
          localbcr.wHb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 23:
          localbcr.wHc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 24:
          localbcr.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 25:
          localbcr.wHd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 26:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new arr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((arr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbcr.wHe = ((arr)localObject1);
          }
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 27:
          localbcr.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 28:
          localbcr.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 29:
          localbcr.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 30:
          localbcr.wHf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 31:
          localbcr.wfm = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 32:
          localbcr.wfn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 33:
          localbcr.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 34:
          localbcr.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 35:
          localbcr.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 36:
          localbcr.wGO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 37:
          localbcr.wHg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        case 38:
          localbcr.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60051);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60051);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bcr
 * JD-Core Version:    0.6.2
 */