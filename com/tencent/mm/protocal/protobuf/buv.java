package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buv extends btd
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
  public SKBuiltinBuffer_t wWj;
  public String wWk;
  public String wWl;
  public int wWm;
  public LinkedList<bvk> wWn;
  public bts wcB;
  public bts wce;
  public bts wcf;
  public String wlF;
  public int wod;
  public LinkedList<but> woe;
  public bts wyX;

  public buv()
  {
    AppMethodBeat.i(80177);
    this.woe = new LinkedList();
    this.wWn = new LinkedList();
    AppMethodBeat.o(80177);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80178);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80178);
        throw paramArrayOfObject;
      }
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(80178);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(80178);
        throw paramArrayOfObject;
      }
      if (this.wce == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PYInitial");
        AppMethodBeat.o(80178);
        throw paramArrayOfObject;
      }
      if (this.wcf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QuanPin");
        AppMethodBeat.o(80178);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(80178);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
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
      if (this.wce != null)
      {
        paramArrayOfObject.iy(4, this.wce.computeSize());
        this.wce.writeFields(paramArrayOfObject);
      }
      if (this.wcf != null)
      {
        paramArrayOfObject.iy(5, this.wcf.computeSize());
        this.wcf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.guN);
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(7, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      if (this.guO != null)
        paramArrayOfObject.e(8, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(9, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(10, this.guQ);
      paramArrayOfObject.iz(11, this.guR);
      paramArrayOfObject.iz(12, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(13, this.wBU);
      if (this.wBV != null)
        paramArrayOfObject.e(14, this.wBV);
      if (this.guS != null)
        paramArrayOfObject.e(15, this.guS);
      if (this.wBW != null)
        paramArrayOfObject.e(16, this.wBW);
      paramArrayOfObject.iz(17, this.wBX);
      paramArrayOfObject.iz(18, this.guU);
      paramArrayOfObject.iz(19, this.guT);
      if (this.guV != null)
        paramArrayOfObject.e(20, this.guV);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(21, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(22, this.guW);
      if (this.guX != null)
        paramArrayOfObject.e(23, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(24, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(25, this.wod);
      paramArrayOfObject.e(26, 8, this.woe);
      if (this.vXm != null)
        paramArrayOfObject.e(27, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(28, this.vXn);
      if (this.wWj != null)
      {
        paramArrayOfObject.iy(29, this.wWj.computeSize());
        this.wWj.writeFields(paramArrayOfObject);
      }
      if (this.wlF != null)
        paramArrayOfObject.e(30, this.wlF);
      if (this.wWk != null)
        paramArrayOfObject.e(31, this.wWk);
      paramArrayOfObject.iz(32, this.wWh);
      if (this.wWl != null)
        paramArrayOfObject.e(33, this.wWl);
      paramArrayOfObject.iz(34, this.wWm);
      paramArrayOfObject.e(35, 8, this.wWn);
      AppMethodBeat.o(80178);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label3580;
    label3580: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wcB != null)
        paramInt = i + e.a.a.a.ix(2, this.wcB.computeSize());
      i = paramInt;
      if (this.wyX != null)
        i = paramInt + e.a.a.a.ix(3, this.wyX.computeSize());
      paramInt = i;
      if (this.wce != null)
        paramInt = i + e.a.a.a.ix(4, this.wce.computeSize());
      i = paramInt;
      if (this.wcf != null)
        i = paramInt + e.a.a.a.ix(5, this.wcf.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(6, this.guN);
      i = paramInt;
      if (this.vEF != null)
        i = paramInt + e.a.a.a.ix(7, this.vEF.computeSize());
      paramInt = i;
      if (this.guO != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.guO);
      i = paramInt;
      if (this.guP != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.guP);
      paramInt = i;
      if (this.guQ != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.guQ);
      i = paramInt + e.a.a.b.b.a.bs(11, this.guR) + e.a.a.b.b.a.bs(12, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.wBU);
      i = paramInt;
      if (this.wBV != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wBV);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.guS);
      i = paramInt;
      if (this.wBW != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.wBW);
      i = i + e.a.a.b.b.a.bs(17, this.wBX) + e.a.a.b.b.a.bs(18, this.guU) + e.a.a.b.b.a.bs(19, this.guT);
      paramInt = i;
      if (this.guV != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.guV);
      i = paramInt;
      if (this.wBZ != null)
        i = paramInt + e.a.a.a.ix(21, this.wBZ.computeSize());
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(22, this.guW);
      i = paramInt;
      if (this.guX != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.guX);
      paramInt = i;
      if (this.wCa != null)
        paramInt = i + e.a.a.a.ix(24, this.wCa.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(25, this.wod) + e.a.a.a.c(26, 8, this.woe);
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(27, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(28, this.vXn);
      i = paramInt;
      if (this.wWj != null)
        i = paramInt + e.a.a.a.ix(29, this.wWj.computeSize());
      paramInt = i;
      if (this.wlF != null)
        paramInt = i + e.a.a.b.b.a.f(30, this.wlF);
      i = paramInt;
      if (this.wWk != null)
        i = paramInt + e.a.a.b.b.a.f(31, this.wWk);
      i += e.a.a.b.b.a.bs(32, this.wWh);
      paramInt = i;
      if (this.wWl != null)
        paramInt = i + e.a.a.b.b.a.f(33, this.wWl);
      paramInt = paramInt + e.a.a.b.b.a.bs(34, this.wWm) + e.a.a.a.c(35, 8, this.wWn);
      AppMethodBeat.o(80178);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.woe.clear();
        this.wWn.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(80178);
          throw paramArrayOfObject;
        }
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(80178);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(80178);
          throw paramArrayOfObject;
        }
        if (this.wce == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PYInitial");
          AppMethodBeat.o(80178);
          throw paramArrayOfObject;
        }
        if (this.wcf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QuanPin");
          AppMethodBeat.o(80178);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(80178);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80178);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buv localbuv = (buv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80178);
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
            localbuv.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80178);
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
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wcB = ((bts)localObject1);
          }
          AppMethodBeat.o(80178);
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
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wyX = ((bts)localObject1);
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wce = paramArrayOfObject;
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wcf = ((bts)localObject1);
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 6:
          localbuv.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.vEF = paramArrayOfObject;
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 8:
          localbuv.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 9:
          localbuv.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 10:
          localbuv.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 11:
          localbuv.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 12:
          localbuv.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 13:
          localbuv.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 14:
          localbuv.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 15:
          localbuv.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 16:
          localbuv.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 17:
          localbuv.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 18:
          localbuv.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 19:
          localbuv.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 20:
          localbuv.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 21:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wBZ = paramArrayOfObject;
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 22:
          localbuv.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 23:
          localbuv.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 24:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((uy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wCa = ((uy)localObject1);
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 25:
          localbuv.wod = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 26:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new but();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((but)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.woe.add(localObject1);
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 27:
          localbuv.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 28:
          localbuv.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 29:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wWj = paramArrayOfObject;
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 30:
          localbuv.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 31:
          localbuv.wWk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 32:
          localbuv.wWh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 33:
          localbuv.wWl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 34:
          localbuv.wWm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        case 35:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bvk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bvk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuv.wWn.add(localObject1);
          }
          AppMethodBeat.o(80178);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80178);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buv
 * JD-Core Version:    0.6.2
 */