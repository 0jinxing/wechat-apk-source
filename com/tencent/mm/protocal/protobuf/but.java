package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class but extends com.tencent.mm.bt.a
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
  public int wWh;
  public bts wcB;
  public bts wce;
  public bts wcf;
  public String wlF;
  public bts wyX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80175);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(80175);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(80175);
        throw paramArrayOfObject;
      }
      if (this.wce == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PYInitial");
        AppMethodBeat.o(80175);
        throw paramArrayOfObject;
      }
      if (this.wcf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QuanPin");
        AppMethodBeat.o(80175);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(80175);
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
      if (this.guO != null)
        paramArrayOfObject.e(7, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(8, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(9, this.guQ);
      paramArrayOfObject.iz(10, this.guR);
      paramArrayOfObject.iz(11, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(12, this.wBU);
      if (this.wBV != null)
        paramArrayOfObject.e(13, this.wBV);
      if (this.guS != null)
        paramArrayOfObject.e(14, this.guS);
      if (this.wBW != null)
        paramArrayOfObject.e(15, this.wBW);
      paramArrayOfObject.iz(16, this.wBX);
      paramArrayOfObject.iz(17, this.guU);
      paramArrayOfObject.iz(18, this.guT);
      if (this.guV != null)
        paramArrayOfObject.e(19, this.guV);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(20, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(21, this.guW);
      if (this.guX != null)
        paramArrayOfObject.e(22, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(23, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.vXm != null)
        paramArrayOfObject.e(24, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(25, this.vXn);
      if (this.wlF != null)
        paramArrayOfObject.e(26, this.wlF);
      paramArrayOfObject.iz(27, this.wWh);
      AppMethodBeat.o(80175);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label2698;
    label2698: for (paramInt = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; paramInt = 0)
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
      paramInt = i + e.a.a.b.b.a.bs(5, this.guN);
      i = paramInt;
      if (this.vEF != null)
        i = paramInt + e.a.a.a.ix(6, this.vEF.computeSize());
      paramInt = i;
      if (this.guO != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.guO);
      i = paramInt;
      if (this.guP != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.guP);
      paramInt = i;
      if (this.guQ != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.guQ);
      i = paramInt + e.a.a.b.b.a.bs(10, this.guR) + e.a.a.b.b.a.bs(11, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wBU);
      i = paramInt;
      if (this.wBV != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.wBV);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.guS);
      i = paramInt;
      if (this.wBW != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.wBW);
      i = i + e.a.a.b.b.a.bs(16, this.wBX) + e.a.a.b.b.a.bs(17, this.guU) + e.a.a.b.b.a.bs(18, this.guT);
      paramInt = i;
      if (this.guV != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.guV);
      i = paramInt;
      if (this.wBZ != null)
        i = paramInt + e.a.a.a.ix(20, this.wBZ.computeSize());
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.guW);
      i = paramInt;
      if (this.guX != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.guX);
      paramInt = i;
      if (this.wCa != null)
        paramInt = i + e.a.a.a.ix(23, this.wCa.computeSize());
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(24, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(25, this.vXn);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(26, this.wlF);
      paramInt = i + e.a.a.b.b.a.bs(27, this.wWh);
      AppMethodBeat.o(80175);
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
          AppMethodBeat.o(80175);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(80175);
          throw paramArrayOfObject;
        }
        if (this.wce == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PYInitial");
          AppMethodBeat.o(80175);
          throw paramArrayOfObject;
        }
        if (this.wcf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QuanPin");
          AppMethodBeat.o(80175);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(80175);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80175);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        but localbut = (but)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80175);
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
            localbut.wcB = ((bts)localObject1);
          }
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbut.wyX = paramArrayOfObject;
          }
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbut.wce = ((bts)localObject1);
          }
          AppMethodBeat.o(80175);
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
            localbut.wcf = ((bts)localObject1);
          }
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 5:
          localbut.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
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
            localbut.vEF = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 7:
          localbut.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 8:
          localbut.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 9:
          localbut.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 10:
          localbut.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 11:
          localbut.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 12:
          localbut.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 13:
          localbut.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 14:
          localbut.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 15:
          localbut.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 16:
          localbut.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 17:
          localbut.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 18:
          localbut.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 19:
          localbut.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbut.wBZ = ((ccl)localObject1);
          }
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 21:
          localbut.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 22:
          localbut.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 23:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbut.wCa = paramArrayOfObject;
          }
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 24:
          localbut.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 25:
          localbut.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 26:
          localbut.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        case 27:
          localbut.wWh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80175);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80175);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.but
 * JD-Core Version:    0.6.2
 */