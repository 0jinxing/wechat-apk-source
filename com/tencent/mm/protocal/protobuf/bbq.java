package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bbq extends com.tencent.mm.bt.a
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
  public String guX;
  public SKBuiltinBuffer_t vEF;
  public String vXm;
  public String vXn;
  public int wBT;
  public String wBU;
  public String wBV;
  public String wBW;
  public int wBX;
  public ccl wBZ;
  public uy wCa;
  public bts wFK;
  public bts wFL;
  public bts wFM;
  public int wGb;
  public int wbA;
  public bts wcB;
  public bts wce;
  public bts wcf;
  public String wsM;
  public bts wyX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5595);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wce == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PYInitial");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wcf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QuanPin");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wFK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Remark");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wFL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RemarkPYInitial");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wFM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RemarkQuanPin");
        AppMethodBeat.o(5595);
        throw paramArrayOfObject;
      }
      if (this.wcB != null)
      {
        paramArrayOfObject.iy(1, this.wcB.computeSize());
        this.wcB.writeFields(paramArrayOfObject);
      }
      if (this.wyX != null)
      {
        paramArrayOfObject.iy(2, this.wyX.computeSize());
        this.wyX.writeFields(paramArrayOfObject);
      }
      if (this.wce != null)
      {
        paramArrayOfObject.iy(3, this.wce.computeSize());
        this.wce.writeFields(paramArrayOfObject);
      }
      if (this.wcf != null)
      {
        paramArrayOfObject.iy(4, this.wcf.computeSize());
        this.wcf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.guN);
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(6, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.wGb);
      if (this.wFK != null)
      {
        paramArrayOfObject.iy(8, this.wFK.computeSize());
        this.wFK.writeFields(paramArrayOfObject);
      }
      if (this.wFL != null)
      {
        paramArrayOfObject.iy(9, this.wFL.computeSize());
        this.wFL.writeFields(paramArrayOfObject);
      }
      if (this.wFM != null)
      {
        paramArrayOfObject.iy(10, this.wFM.computeSize());
        this.wFM.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.wbA);
      if (this.guO != null)
        paramArrayOfObject.e(12, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(13, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(14, this.guQ);
      paramArrayOfObject.iz(15, this.guR);
      paramArrayOfObject.iz(16, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(17, this.wBU);
      if (this.wBV != null)
        paramArrayOfObject.e(18, this.wBV);
      if (this.wsM != null)
        paramArrayOfObject.e(19, this.wsM);
      if (this.wBW != null)
        paramArrayOfObject.e(20, this.wBW);
      paramArrayOfObject.iz(21, this.wBX);
      paramArrayOfObject.iz(22, this.guU);
      paramArrayOfObject.iz(23, this.guT);
      if (this.guV != null)
        paramArrayOfObject.e(24, this.guV);
      if (this.guS != null)
        paramArrayOfObject.e(25, this.guS);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(26, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(27, this.guW);
      if (this.vXm != null)
        paramArrayOfObject.e(28, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(29, this.vXn);
      if (this.guX != null)
        paramArrayOfObject.e(30, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(31, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5595);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label3424;
    label3424: for (paramInt = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wyX != null)
        i = paramInt + e.a.a.a.ix(2, this.wyX.computeSize());
      paramInt = i;
      if (this.wce != null)
        paramInt = i + e.a.a.a.ix(3, this.wce.computeSize());
      i = paramInt;
      if (this.wcf != null)
        i = paramInt + e.a.a.a.ix(4, this.wcf.computeSize());
      i += e.a.a.b.b.a.bs(5, this.guN);
      paramInt = i;
      if (this.vEF != null)
        paramInt = i + e.a.a.a.ix(6, this.vEF.computeSize());
      paramInt += e.a.a.b.b.a.bs(7, this.wGb);
      i = paramInt;
      if (this.wFK != null)
        i = paramInt + e.a.a.a.ix(8, this.wFK.computeSize());
      paramInt = i;
      if (this.wFL != null)
        paramInt = i + e.a.a.a.ix(9, this.wFL.computeSize());
      i = paramInt;
      if (this.wFM != null)
        i = paramInt + e.a.a.a.ix(10, this.wFM.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(11, this.wbA);
      i = paramInt;
      if (this.guO != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.guO);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.guP);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.guQ);
      i = i + e.a.a.b.b.a.bs(15, this.guR) + e.a.a.b.b.a.bs(16, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wBU);
      i = paramInt;
      if (this.wBV != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.wBV);
      paramInt = i;
      if (this.wsM != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.wsM);
      i = paramInt;
      if (this.wBW != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.wBW);
      i = i + e.a.a.b.b.a.bs(21, this.wBX) + e.a.a.b.b.a.bs(22, this.guU) + e.a.a.b.b.a.bs(23, this.guT);
      paramInt = i;
      if (this.guV != null)
        paramInt = i + e.a.a.b.b.a.f(24, this.guV);
      i = paramInt;
      if (this.guS != null)
        i = paramInt + e.a.a.b.b.a.f(25, this.guS);
      paramInt = i;
      if (this.wBZ != null)
        paramInt = i + e.a.a.a.ix(26, this.wBZ.computeSize());
      int j = paramInt;
      if (this.guW != null)
        j = paramInt + e.a.a.b.b.a.f(27, this.guW);
      i = j;
      if (this.vXm != null)
        i = j + e.a.a.b.b.a.f(28, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(29, this.vXn);
      i = paramInt;
      if (this.guX != null)
        i = paramInt + e.a.a.b.b.a.f(30, this.guX);
      paramInt = i;
      if (this.wCa != null)
        paramInt = i + e.a.a.a.ix(31, this.wCa.computeSize());
      AppMethodBeat.o(5595);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.wce == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PYInitial");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.wcf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QuanPin");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.wFK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Remark");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.wFL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RemarkPYInitial");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        if (this.wFM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RemarkQuanPin");
          AppMethodBeat.o(5595);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5595);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bbq localbbq = (bbq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5595);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wcB = ((bts)localObject1);
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wyX = ((bts)localObject1);
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wce = paramArrayOfObject;
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wcf = ((bts)localObject1);
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 5:
          localbbq.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.vEF = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 7:
          localbbq.wGb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wFK = paramArrayOfObject;
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wFL = ((bts)localObject1);
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wFM = paramArrayOfObject;
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 11:
          localbbq.wbA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 12:
          localbbq.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 13:
          localbbq.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 14:
          localbbq.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 15:
          localbbq.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 16:
          localbbq.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 17:
          localbbq.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 18:
          localbbq.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 19:
          localbbq.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 20:
          localbbq.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 21:
          localbbq.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 22:
          localbbq.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 23:
          localbbq.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 24:
          localbbq.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 25:
          localbbq.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 26:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wBZ = paramArrayOfObject;
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 27:
          localbbq.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 28:
          localbbq.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 29:
          localbbq.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 30:
          localbbq.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        case 31:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbq.wCa = ((uy)localObject1);
          }
          AppMethodBeat.o(5595);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5595);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbq
 * JD-Core Version:    0.6.2
 */