package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpq extends btd
{
  public int vIN;
  public LinkedList<coj> vIO;
  public int wPb;
  public int wem;
  public long wen;
  public cpr xlT;
  public int xlU;
  public int xlV;
  public int xlW;
  public int xlX;
  public SKBuiltinBuffer_t xlY;
  public int xmZ;
  public int xmd;
  public LinkedList<cpt> xme;
  public int xmf;
  public int xmg;
  public int xmh;
  public int xmi;
  public int xmj;
  public int xmk;
  public int xml;
  public int xmm;
  public int xmn;
  public int xmo;
  public int xmp;
  public int xmq;
  public int xmr;
  public int xms;
  public int xna;
  public int xnb;

  public cpq()
  {
    AppMethodBeat.i(5251);
    this.vIO = new LinkedList();
    this.xme = new LinkedList();
    AppMethodBeat.o(5251);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5252);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5252);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.iz(3, this.vIN);
      paramArrayOfObject.e(4, 8, this.vIO);
      paramArrayOfObject.ai(5, this.wen);
      paramArrayOfObject.iz(6, this.wPb);
      if (this.xlT != null)
      {
        paramArrayOfObject.iy(7, this.xlT.computeSize());
        this.xlT.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.xmd);
      paramArrayOfObject.e(9, 8, this.xme);
      paramArrayOfObject.iz(10, this.xmf);
      paramArrayOfObject.iz(11, this.xmg);
      paramArrayOfObject.iz(12, this.xmh);
      paramArrayOfObject.iz(13, this.xmi);
      paramArrayOfObject.iz(14, this.xmZ);
      paramArrayOfObject.iz(15, this.xmj);
      paramArrayOfObject.iz(16, this.xmk);
      paramArrayOfObject.iz(17, this.xlU);
      paramArrayOfObject.iz(18, this.xml);
      paramArrayOfObject.iz(19, this.xmm);
      paramArrayOfObject.iz(20, this.xlV);
      paramArrayOfObject.iz(21, this.xmn);
      paramArrayOfObject.iz(22, this.xmo);
      paramArrayOfObject.iz(23, this.xmp);
      paramArrayOfObject.iz(24, this.xna);
      paramArrayOfObject.iz(25, this.xmq);
      paramArrayOfObject.iz(26, this.xnb);
      paramArrayOfObject.iz(27, this.xlW);
      paramArrayOfObject.iz(28, this.xlX);
      paramArrayOfObject.iz(29, this.xmr);
      paramArrayOfObject.iz(30, this.xms);
      if (this.xlY != null)
      {
        paramArrayOfObject.iy(31, this.xlY.computeSize());
        this.xlY.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5252);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2235;
    label2235: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.bs(3, this.vIN) + e.a.a.a.c(4, 8, this.vIO) + e.a.a.b.b.a.o(5, this.wen) + e.a.a.b.b.a.bs(6, this.wPb);
      paramInt = i;
      if (this.xlT != null)
        paramInt = i + e.a.a.a.ix(7, this.xlT.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.xmd) + e.a.a.a.c(9, 8, this.xme) + e.a.a.b.b.a.bs(10, this.xmf) + e.a.a.b.b.a.bs(11, this.xmg) + e.a.a.b.b.a.bs(12, this.xmh) + e.a.a.b.b.a.bs(13, this.xmi) + e.a.a.b.b.a.bs(14, this.xmZ) + e.a.a.b.b.a.bs(15, this.xmj) + e.a.a.b.b.a.bs(16, this.xmk) + e.a.a.b.b.a.bs(17, this.xlU) + e.a.a.b.b.a.bs(18, this.xml) + e.a.a.b.b.a.bs(19, this.xmm) + e.a.a.b.b.a.bs(20, this.xlV) + e.a.a.b.b.a.bs(21, this.xmn) + e.a.a.b.b.a.bs(22, this.xmo) + e.a.a.b.b.a.bs(23, this.xmp) + e.a.a.b.b.a.bs(24, this.xna) + e.a.a.b.b.a.bs(25, this.xmq) + e.a.a.b.b.a.bs(26, this.xnb) + e.a.a.b.b.a.bs(27, this.xlW) + e.a.a.b.b.a.bs(28, this.xlX) + e.a.a.b.b.a.bs(29, this.xmr) + e.a.a.b.b.a.bs(30, this.xms);
      paramInt = i;
      if (this.xlY != null)
        paramInt = i + e.a.a.a.ix(31, this.xlY.computeSize());
      AppMethodBeat.o(5252);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIO.clear();
        this.xme.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(5252);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5252);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpq localcpq = (cpq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5252);
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
            localcpq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 2:
          localcpq.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 3:
          localcpq.vIN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpq.vIO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 5:
          localcpq.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 6:
          localcpq.wPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpq.xlT = paramArrayOfObject;
          }
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 8:
          localcpq.xmd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpq.xme.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 10:
          localcpq.xmf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 11:
          localcpq.xmg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 12:
          localcpq.xmh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 13:
          localcpq.xmi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 14:
          localcpq.xmZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 15:
          localcpq.xmj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 16:
          localcpq.xmk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 17:
          localcpq.xlU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 18:
          localcpq.xml = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 19:
          localcpq.xmm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 20:
          localcpq.xlV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 21:
          localcpq.xmn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 22:
          localcpq.xmo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 23:
          localcpq.xmp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 24:
          localcpq.xna = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 25:
          localcpq.xmq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 26:
          localcpq.xnb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 27:
          localcpq.xlW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 28:
          localcpq.xlX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 29:
          localcpq.xmr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 30:
          localcpq.xms = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        case 31:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpq.xlY = paramArrayOfObject;
          }
          AppMethodBeat.o(5252);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5252);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpq
 * JD-Core Version:    0.6.2
 */