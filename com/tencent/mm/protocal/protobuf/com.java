package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class com extends btd
{
  public int vIN;
  public LinkedList<coj> vIO;
  public int wem;
  public long wen;
  public int xlS;
  public cpr xlT;
  public int xlU;
  public int xlV;
  public int xlW;
  public int xlX;
  public SKBuiltinBuffer_t xlY;
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

  public com()
  {
    AppMethodBeat.i(5231);
    this.vIO = new LinkedList();
    this.xme = new LinkedList();
    AppMethodBeat.o(5231);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5232);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5232);
        throw paramArrayOfObject;
      }
      if (this.xlT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RelayData");
        AppMethodBeat.o(5232);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vIN);
      paramArrayOfObject.e(3, 8, this.vIO);
      paramArrayOfObject.iz(4, this.wem);
      paramArrayOfObject.ai(5, this.wen);
      paramArrayOfObject.iz(6, this.xlS);
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
      paramArrayOfObject.iz(14, this.xmj);
      paramArrayOfObject.iz(15, this.xmk);
      paramArrayOfObject.iz(16, this.xlU);
      paramArrayOfObject.iz(17, this.xml);
      paramArrayOfObject.iz(18, this.xmm);
      paramArrayOfObject.iz(19, this.xlV);
      paramArrayOfObject.iz(20, this.xmn);
      paramArrayOfObject.iz(21, this.xmo);
      paramArrayOfObject.iz(22, this.xmp);
      paramArrayOfObject.iz(23, this.xmq);
      paramArrayOfObject.iz(24, this.xlW);
      paramArrayOfObject.iz(25, this.xlX);
      paramArrayOfObject.iz(26, this.xmr);
      paramArrayOfObject.iz(27, this.xms);
      if (this.xlY != null)
      {
        paramArrayOfObject.iy(28, this.xlY.computeSize());
        this.xlY.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5232);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2140;
    label2140: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vIN) + e.a.a.a.c(3, 8, this.vIO) + e.a.a.b.b.a.bs(4, this.wem) + e.a.a.b.b.a.o(5, this.wen) + e.a.a.b.b.a.bs(6, this.xlS);
      paramInt = i;
      if (this.xlT != null)
        paramInt = i + e.a.a.a.ix(7, this.xlT.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.xmd) + e.a.a.a.c(9, 8, this.xme) + e.a.a.b.b.a.bs(10, this.xmf) + e.a.a.b.b.a.bs(11, this.xmg) + e.a.a.b.b.a.bs(12, this.xmh) + e.a.a.b.b.a.bs(13, this.xmi) + e.a.a.b.b.a.bs(14, this.xmj) + e.a.a.b.b.a.bs(15, this.xmk) + e.a.a.b.b.a.bs(16, this.xlU) + e.a.a.b.b.a.bs(17, this.xml) + e.a.a.b.b.a.bs(18, this.xmm) + e.a.a.b.b.a.bs(19, this.xlV) + e.a.a.b.b.a.bs(20, this.xmn) + e.a.a.b.b.a.bs(21, this.xmo) + e.a.a.b.b.a.bs(22, this.xmp) + e.a.a.b.b.a.bs(23, this.xmq) + e.a.a.b.b.a.bs(24, this.xlW) + e.a.a.b.b.a.bs(25, this.xlX) + e.a.a.b.b.a.bs(26, this.xmr) + e.a.a.b.b.a.bs(27, this.xms);
      paramInt = i;
      if (this.xlY != null)
        paramInt = i + e.a.a.a.ix(28, this.xlY.computeSize());
      AppMethodBeat.o(5232);
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
          AppMethodBeat.o(5232);
          throw paramArrayOfObject;
        }
        if (this.xlT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RelayData");
          AppMethodBeat.o(5232);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5232);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        com localcom = (com)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5232);
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
            localcom.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 2:
          localcom.vIN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((coj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcom.vIO.add(localObject1);
          }
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 4:
          localcom.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 5:
          localcom.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 6:
          localcom.xlS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
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
            localcom.xlT = paramArrayOfObject;
          }
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 8:
          localcom.xmd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
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
            localcom.xme.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 10:
          localcom.xmf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 11:
          localcom.xmg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 12:
          localcom.xmh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 13:
          localcom.xmi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 14:
          localcom.xmj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 15:
          localcom.xmk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 16:
          localcom.xlU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 17:
          localcom.xml = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 18:
          localcom.xmm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 19:
          localcom.xlV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 20:
          localcom.xmn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 21:
          localcom.xmo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 22:
          localcom.xmp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 23:
          localcom.xmq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 24:
          localcom.xlW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 25:
          localcom.xlX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 26:
          localcom.xmr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 27:
          localcom.xms = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        case 28:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcom.xlY = paramArrayOfObject;
          }
          AppMethodBeat.o(5232);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5232);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.com
 * JD-Core Version:    0.6.2
 */