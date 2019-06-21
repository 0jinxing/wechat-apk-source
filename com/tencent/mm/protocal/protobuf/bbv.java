package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bbv extends com.tencent.mm.bt.a
{
  public String duq;
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
  public String ndT;
  public String vEA;
  public SKBuiltinBuffer_t vEF;
  public int vFH;
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
  public bts wGf;
  public int wGg;
  public int wGh;
  public String wGi;
  public String wGj;
  public String wGk;
  public String wGl;
  public String wGm;
  public String wGn;
  public String wGo;
  public String wGp;
  public cw wGq;
  public int wGr;
  public int wGs;
  public int wGt;
  public int wGu;
  public String wGv;
  public bkg wGw;
  public int wGx;
  public int wGy;
  public int wGz;
  public int wbA;
  public int wbB;
  public LinkedList<btp> wbC;
  public int wbE;
  public int wbF;
  public int wbu;
  public int wbv;
  public bts wcB;
  public int wcC;
  public String wcD;
  public bts wce;
  public bts wcf;
  public qe wnN;
  public String wsM;
  public bts wyX;

  public bbv()
  {
    AppMethodBeat.i(60046);
    this.wbC = new LinkedList();
    AppMethodBeat.o(60046);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60047);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(60047);
        throw paramArrayOfObject;
      }
      if (this.wyX == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NickName");
        AppMethodBeat.o(60047);
        throw paramArrayOfObject;
      }
      if (this.wce == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PYInitial");
        AppMethodBeat.o(60047);
        throw paramArrayOfObject;
      }
      if (this.wcf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QuanPin");
        AppMethodBeat.o(60047);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(60047);
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
      paramArrayOfObject.iz(7, this.wbu);
      paramArrayOfObject.iz(8, this.wbv);
      paramArrayOfObject.iz(9, this.wGb);
      if (this.wFK != null)
      {
        paramArrayOfObject.iy(10, this.wFK.computeSize());
        this.wFK.writeFields(paramArrayOfObject);
      }
      if (this.wFL != null)
      {
        paramArrayOfObject.iy(11, this.wFL.computeSize());
        this.wFL.writeFields(paramArrayOfObject);
      }
      if (this.wFM != null)
      {
        paramArrayOfObject.iy(12, this.wFM.computeSize());
        this.wFM.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(13, this.wbA);
      paramArrayOfObject.iz(14, this.wbB);
      paramArrayOfObject.e(15, 8, this.wbC);
      if (this.wGf != null)
      {
        paramArrayOfObject.iy(16, this.wGf.computeSize());
        this.wGf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(17, this.wbE);
      paramArrayOfObject.iz(18, this.wbF);
      if (this.guO != null)
        paramArrayOfObject.e(19, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(20, this.guP);
      if (this.guQ != null)
        paramArrayOfObject.e(21, this.guQ);
      paramArrayOfObject.iz(22, this.guR);
      paramArrayOfObject.iz(23, this.wGg);
      paramArrayOfObject.iz(24, this.wBT);
      if (this.wBU != null)
        paramArrayOfObject.e(25, this.wBU);
      paramArrayOfObject.iz(26, this.wGh);
      paramArrayOfObject.iz(27, this.vFH);
      if (this.wBV != null)
        paramArrayOfObject.e(28, this.wBV);
      if (this.wsM != null)
        paramArrayOfObject.e(29, this.wsM);
      if (this.guS != null)
        paramArrayOfObject.e(30, this.guS);
      if (this.wGi != null)
        paramArrayOfObject.e(31, this.wGi);
      if (this.wBW != null)
        paramArrayOfObject.e(32, this.wBW);
      paramArrayOfObject.iz(33, this.wBX);
      paramArrayOfObject.iz(34, this.guU);
      paramArrayOfObject.iz(35, this.guT);
      if (this.guV != null)
        paramArrayOfObject.e(36, this.guV);
      if (this.wBZ != null)
      {
        paramArrayOfObject.iy(37, this.wBZ.computeSize());
        this.wBZ.writeFields(paramArrayOfObject);
      }
      if (this.guW != null)
        paramArrayOfObject.e(38, this.guW);
      if (this.vXm != null)
        paramArrayOfObject.e(39, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(40, this.vXn);
      if (this.guX != null)
        paramArrayOfObject.e(41, this.guX);
      if (this.wCa != null)
      {
        paramArrayOfObject.iy(42, this.wCa.computeSize());
        this.wCa.writeFields(paramArrayOfObject);
      }
      if (this.wGj != null)
        paramArrayOfObject.e(43, this.wGj);
      if (this.wGk != null)
        paramArrayOfObject.e(44, this.wGk);
      if (this.wGl != null)
        paramArrayOfObject.e(45, this.wGl);
      if (this.wGm != null)
        paramArrayOfObject.e(46, this.wGm);
      if (this.wGn != null)
        paramArrayOfObject.e(47, this.wGn);
      if (this.wGo != null)
        paramArrayOfObject.e(48, this.wGo);
      if (this.wGp != null)
        paramArrayOfObject.e(49, this.wGp);
      if (this.wGq != null)
      {
        paramArrayOfObject.iy(50, this.wGq.computeSize());
        this.wGq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(53, this.wGr);
      if (this.ndT != null)
        paramArrayOfObject.e(54, this.ndT);
      paramArrayOfObject.iz(55, this.wGs);
      paramArrayOfObject.iz(56, this.wGt);
      if (this.wnN != null)
      {
        paramArrayOfObject.iy(57, this.wnN.computeSize());
        this.wnN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(58, this.wGu);
      if (this.vEA != null)
        paramArrayOfObject.e(59, this.vEA);
      if (this.wGv != null)
        paramArrayOfObject.e(60, this.wGv);
      if (this.wcD != null)
        paramArrayOfObject.e(61, this.wcD);
      if (this.wGw != null)
      {
        paramArrayOfObject.iy(62, this.wGw.computeSize());
        this.wGw.writeFields(paramArrayOfObject);
      }
      if (this.duq != null)
        paramArrayOfObject.e(63, this.duq);
      paramArrayOfObject.iz(64, this.wGx);
      paramArrayOfObject.iz(65, this.wcC);
      paramArrayOfObject.iz(66, this.wGy);
      paramArrayOfObject.iz(67, this.wGz);
      AppMethodBeat.o(60047);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wcB == null)
        break label5632;
    label5632: for (i = e.a.a.a.ix(1, this.wcB.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wyX != null)
        paramInt = i + e.a.a.a.ix(2, this.wyX.computeSize());
      i = paramInt;
      if (this.wce != null)
        i = paramInt + e.a.a.a.ix(3, this.wce.computeSize());
      paramInt = i;
      if (this.wcf != null)
        paramInt = i + e.a.a.a.ix(4, this.wcf.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.guN);
      paramInt = i;
      if (this.vEF != null)
        paramInt = i + e.a.a.a.ix(6, this.vEF.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(7, this.wbu) + e.a.a.b.b.a.bs(8, this.wbv) + e.a.a.b.b.a.bs(9, this.wGb);
      paramInt = i;
      if (this.wFK != null)
        paramInt = i + e.a.a.a.ix(10, this.wFK.computeSize());
      i = paramInt;
      if (this.wFL != null)
        i = paramInt + e.a.a.a.ix(11, this.wFL.computeSize());
      paramInt = i;
      if (this.wFM != null)
        paramInt = i + e.a.a.a.ix(12, this.wFM.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(13, this.wbA) + e.a.a.b.b.a.bs(14, this.wbB) + e.a.a.a.c(15, 8, this.wbC);
      paramInt = i;
      if (this.wGf != null)
        paramInt = i + e.a.a.a.ix(16, this.wGf.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(17, this.wbE) + e.a.a.b.b.a.bs(18, this.wbF);
      i = paramInt;
      if (this.guO != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.guO);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.guP);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.guQ);
      i = i + e.a.a.b.b.a.bs(22, this.guR) + e.a.a.b.b.a.bs(23, this.wGg) + e.a.a.b.b.a.bs(24, this.wBT);
      paramInt = i;
      if (this.wBU != null)
        paramInt = i + e.a.a.b.b.a.f(25, this.wBU);
      i = paramInt + e.a.a.b.b.a.bs(26, this.wGh) + e.a.a.b.b.a.bs(27, this.vFH);
      paramInt = i;
      if (this.wBV != null)
        paramInt = i + e.a.a.b.b.a.f(28, this.wBV);
      i = paramInt;
      if (this.wsM != null)
        i = paramInt + e.a.a.b.b.a.f(29, this.wsM);
      paramInt = i;
      if (this.guS != null)
        paramInt = i + e.a.a.b.b.a.f(30, this.guS);
      i = paramInt;
      if (this.wGi != null)
        i = paramInt + e.a.a.b.b.a.f(31, this.wGi);
      paramInt = i;
      if (this.wBW != null)
        paramInt = i + e.a.a.b.b.a.f(32, this.wBW);
      i = paramInt + e.a.a.b.b.a.bs(33, this.wBX) + e.a.a.b.b.a.bs(34, this.guU) + e.a.a.b.b.a.bs(35, this.guT);
      paramInt = i;
      if (this.guV != null)
        paramInt = i + e.a.a.b.b.a.f(36, this.guV);
      i = paramInt;
      if (this.wBZ != null)
        i = paramInt + e.a.a.a.ix(37, this.wBZ.computeSize());
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(38, this.guW);
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(39, this.vXm);
      int j = i;
      if (this.vXn != null)
        j = i + e.a.a.b.b.a.f(40, this.vXn);
      paramInt = j;
      if (this.guX != null)
        paramInt = j + e.a.a.b.b.a.f(41, this.guX);
      i = paramInt;
      if (this.wCa != null)
        i = paramInt + e.a.a.a.ix(42, this.wCa.computeSize());
      paramInt = i;
      if (this.wGj != null)
        paramInt = i + e.a.a.b.b.a.f(43, this.wGj);
      i = paramInt;
      if (this.wGk != null)
        i = paramInt + e.a.a.b.b.a.f(44, this.wGk);
      paramInt = i;
      if (this.wGl != null)
        paramInt = i + e.a.a.b.b.a.f(45, this.wGl);
      j = paramInt;
      if (this.wGm != null)
        j = paramInt + e.a.a.b.b.a.f(46, this.wGm);
      i = j;
      if (this.wGn != null)
        i = j + e.a.a.b.b.a.f(47, this.wGn);
      paramInt = i;
      if (this.wGo != null)
        paramInt = i + e.a.a.b.b.a.f(48, this.wGo);
      i = paramInt;
      if (this.wGp != null)
        i = paramInt + e.a.a.b.b.a.f(49, this.wGp);
      paramInt = i;
      if (this.wGq != null)
        paramInt = i + e.a.a.a.ix(50, this.wGq.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(53, this.wGr);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(54, this.ndT);
      i = paramInt + e.a.a.b.b.a.bs(55, this.wGs) + e.a.a.b.b.a.bs(56, this.wGt);
      paramInt = i;
      if (this.wnN != null)
        paramInt = i + e.a.a.a.ix(57, this.wnN.computeSize());
      paramInt += e.a.a.b.b.a.bs(58, this.wGu);
      i = paramInt;
      if (this.vEA != null)
        i = paramInt + e.a.a.b.b.a.f(59, this.vEA);
      paramInt = i;
      if (this.wGv != null)
        paramInt = i + e.a.a.b.b.a.f(60, this.wGv);
      i = paramInt;
      if (this.wcD != null)
        i = paramInt + e.a.a.b.b.a.f(61, this.wcD);
      paramInt = i;
      if (this.wGw != null)
        paramInt = i + e.a.a.a.ix(62, this.wGw.computeSize());
      i = paramInt;
      if (this.duq != null)
        i = paramInt + e.a.a.b.b.a.f(63, this.duq);
      paramInt = i + e.a.a.b.b.a.bs(64, this.wGx) + e.a.a.b.b.a.bs(65, this.wcC) + e.a.a.b.b.a.bs(66, this.wGy) + e.a.a.b.b.a.bs(67, this.wGz);
      AppMethodBeat.o(60047);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wbC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(60047);
          throw paramArrayOfObject;
        }
        if (this.wyX == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NickName");
          AppMethodBeat.o(60047);
          throw paramArrayOfObject;
        }
        if (this.wce == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PYInitial");
          AppMethodBeat.o(60047);
          throw paramArrayOfObject;
        }
        if (this.wcf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QuanPin");
          AppMethodBeat.o(60047);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(60047);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60047);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bbv localbbv = (bbv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 51:
        case 52:
        default:
          paramInt = -1;
          AppMethodBeat.o(60047);
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
            localbbv.wcB = ((bts)localObject1);
          }
          AppMethodBeat.o(60047);
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
            localbbv.wyX = paramArrayOfObject;
          }
          AppMethodBeat.o(60047);
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
            localbbv.wce = ((bts)localObject1);
          }
          AppMethodBeat.o(60047);
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
            localbbv.wcf = ((bts)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 5:
          localbbv.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
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
            localbbv.vEF = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 7:
          localbbv.wbu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 8:
          localbbv.wbv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 9:
          localbbv.wGb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wFK = ((bts)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wFL = paramArrayOfObject;
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wFM = paramArrayOfObject;
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 13:
          localbbv.wbA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 14:
          localbbv.wbB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wbC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wGf = ((bts)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 17:
          localbbv.wbE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 18:
          localbbv.wbF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 19:
          localbbv.guO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 20:
          localbbv.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 21:
          localbbv.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 22:
          localbbv.guR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 23:
          localbbv.wGg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 24:
          localbbv.wBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 25:
          localbbv.wBU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 26:
          localbbv.wGh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 27:
          localbbv.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 28:
          localbbv.wBV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 29:
          localbbv.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 30:
          localbbv.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 31:
          localbbv.wGi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 32:
          localbbv.wBW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 33:
          localbbv.wBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 34:
          localbbv.guU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 35:
          localbbv.guT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 36:
          localbbv.guV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 37:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ccl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wBZ = ((ccl)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 38:
          localbbv.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 39:
          localbbv.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 40:
          localbbv.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 41:
          localbbv.guX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 42:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new uy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wCa = paramArrayOfObject;
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 43:
          localbbv.wGj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 44:
          localbbv.wGk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 45:
          localbbv.wGl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 46:
          localbbv.wGm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 47:
          localbbv.wGn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 48:
          localbbv.wGo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 49:
          localbbv.wGp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 50:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wGq = ((cw)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 53:
          localbbv.wGr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 54:
          localbbv.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 55:
          localbbv.wGs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 56:
          localbbv.wGt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 57:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new qe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qe)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wnN = ((qe)localObject1);
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 58:
          localbbv.wGu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 59:
          localbbv.vEA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 60:
          localbbv.wGv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 61:
          localbbv.wcD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 62:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bkg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbbv.wGw = paramArrayOfObject;
          }
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 63:
          localbbv.duq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 64:
          localbbv.wGx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 65:
          localbbv.wcC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 66:
          localbbv.wGy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        case 67:
          localbbv.wGz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60047);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60047);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbv
 * JD-Core Version:    0.6.2
 */