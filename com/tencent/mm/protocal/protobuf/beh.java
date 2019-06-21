package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class beh extends btd
{
  public String jBB;
  public int jBT;
  public int luF;
  public String luH;
  public String vAN;
  public String vCg;
  public int vCj;
  public String vCm;
  public String vCn;
  public int vCo;
  public String vCp;
  public String vHO;
  public bzr vHR;
  public int vHW;
  public ato vLK;
  public lm vLL;
  public bdu vLM;
  public mw vMl;
  public mw vMm;
  public mw vMn;
  public String wIh;
  public int wIi;
  public String wIj;
  public int wIk;
  public bkq wIl;
  public int wIm;
  public String wIn;
  public String wIo;
  public bvv wIp;
  public String wsL;
  public SKBuiltinBuffer_t wsO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58921);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(58921);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.luF);
      if (this.vAN != null)
        paramArrayOfObject.e(3, this.vAN);
      if (this.vCm != null)
        paramArrayOfObject.e(4, this.vCm);
      if (this.vCn != null)
        paramArrayOfObject.e(5, this.vCn);
      if (this.wIh != null)
        paramArrayOfObject.e(6, this.wIh);
      if (this.vCg != null)
        paramArrayOfObject.e(7, this.vCg);
      paramArrayOfObject.iz(8, this.vCo);
      paramArrayOfObject.iz(9, this.wIi);
      if (this.wIj != null)
        paramArrayOfObject.e(10, this.wIj);
      if (this.vLL != null)
      {
        paramArrayOfObject.iy(14, this.vLL.computeSize());
        this.vLL.writeFields(paramArrayOfObject);
      }
      if (this.vCp != null)
        paramArrayOfObject.e(15, this.vCp);
      if (this.jBB != null)
        paramArrayOfObject.e(16, this.jBB);
      paramArrayOfObject.iz(17, this.jBT);
      if (this.vLM != null)
      {
        paramArrayOfObject.iy(18, this.vLM.computeSize());
        this.vLM.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(19, this.wIk);
      paramArrayOfObject.iz(20, this.vCj);
      if (this.vHO != null)
        paramArrayOfObject.e(21, this.vHO);
      if (this.wIl != null)
      {
        paramArrayOfObject.iy(22, this.wIl.computeSize());
        this.wIl.writeFields(paramArrayOfObject);
      }
      if (this.luH != null)
        paramArrayOfObject.e(23, this.luH);
      paramArrayOfObject.iz(24, this.wIm);
      if (this.vLK != null)
      {
        paramArrayOfObject.iy(25, this.vLK.computeSize());
        this.vLK.writeFields(paramArrayOfObject);
      }
      if (this.wIn != null)
        paramArrayOfObject.e(26, this.wIn);
      if (this.vMl != null)
      {
        paramArrayOfObject.iy(27, this.vMl.computeSize());
        this.vMl.writeFields(paramArrayOfObject);
      }
      if (this.wIo != null)
        paramArrayOfObject.e(28, this.wIo);
      if (this.wsL != null)
        paramArrayOfObject.e(29, this.wsL);
      if (this.wsO != null)
      {
        paramArrayOfObject.iy(30, this.wsO.computeSize());
        this.wsO.writeFields(paramArrayOfObject);
      }
      if (this.vHR != null)
      {
        paramArrayOfObject.iy(31, this.vHR.computeSize());
        this.vHR.writeFields(paramArrayOfObject);
      }
      if (this.vMm != null)
      {
        paramArrayOfObject.iy(32, this.vMm.computeSize());
        this.vMm.writeFields(paramArrayOfObject);
      }
      if (this.vMn != null)
      {
        paramArrayOfObject.iy(33, this.vMn.computeSize());
        this.vMn.writeFields(paramArrayOfObject);
      }
      if (this.wIp != null)
      {
        paramArrayOfObject.iy(34, this.wIp.computeSize());
        this.wIp.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(35, this.vHW);
      AppMethodBeat.o(58921);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label3220;
    label3220: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.luF);
      paramInt = i;
      if (this.vAN != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vAN);
      i = paramInt;
      if (this.vCm != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vCm);
      int j = i;
      if (this.vCn != null)
        j = i + e.a.a.b.b.a.f(5, this.vCn);
      paramInt = j;
      if (this.wIh != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.wIh);
      i = paramInt;
      if (this.vCg != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vCg);
      paramInt = i + e.a.a.b.b.a.bs(8, this.vCo) + e.a.a.b.b.a.bs(9, this.wIi);
      i = paramInt;
      if (this.wIj != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wIj);
      paramInt = i;
      if (this.vLL != null)
        paramInt = i + e.a.a.a.ix(14, this.vLL.computeSize());
      i = paramInt;
      if (this.vCp != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.vCp);
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.jBB);
      i = paramInt + e.a.a.b.b.a.bs(17, this.jBT);
      paramInt = i;
      if (this.vLM != null)
        paramInt = i + e.a.a.a.ix(18, this.vLM.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(19, this.wIk) + e.a.a.b.b.a.bs(20, this.vCj);
      i = paramInt;
      if (this.vHO != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.vHO);
      paramInt = i;
      if (this.wIl != null)
        paramInt = i + e.a.a.a.ix(22, this.wIl.computeSize());
      i = paramInt;
      if (this.luH != null)
        i = paramInt + e.a.a.b.b.a.f(23, this.luH);
      i += e.a.a.b.b.a.bs(24, this.wIm);
      paramInt = i;
      if (this.vLK != null)
        paramInt = i + e.a.a.a.ix(25, this.vLK.computeSize());
      i = paramInt;
      if (this.wIn != null)
        i = paramInt + e.a.a.b.b.a.f(26, this.wIn);
      j = i;
      if (this.vMl != null)
        j = i + e.a.a.a.ix(27, this.vMl.computeSize());
      paramInt = j;
      if (this.wIo != null)
        paramInt = j + e.a.a.b.b.a.f(28, this.wIo);
      i = paramInt;
      if (this.wsL != null)
        i = paramInt + e.a.a.b.b.a.f(29, this.wsL);
      paramInt = i;
      if (this.wsO != null)
        paramInt = i + e.a.a.a.ix(30, this.wsO.computeSize());
      j = paramInt;
      if (this.vHR != null)
        j = paramInt + e.a.a.a.ix(31, this.vHR.computeSize());
      i = j;
      if (this.vMm != null)
        i = j + e.a.a.a.ix(32, this.vMm.computeSize());
      paramInt = i;
      if (this.vMn != null)
        paramInt = i + e.a.a.a.ix(33, this.vMn.computeSize());
      i = paramInt;
      if (this.wIp != null)
        i = paramInt + e.a.a.a.ix(34, this.wIp.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(35, this.vHW);
      AppMethodBeat.o(58921);
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
          AppMethodBeat.o(58921);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58921);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        beh localbeh = (beh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 11:
        case 12:
        case 13:
        default:
          paramInt = -1;
          AppMethodBeat.o(58921);
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
            localbeh.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 2:
          localbeh.luF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 3:
          localbeh.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 4:
          localbeh.vCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 5:
          localbeh.vCn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 6:
          localbeh.wIh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 7:
          localbeh.vCg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 8:
          localbeh.vCo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 9:
          localbeh.wIi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 10:
          localbeh.wIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new lm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((lm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vLL = ((lm)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 15:
          localbeh.vCp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 16:
          localbeh.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 17:
          localbeh.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 18:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vLM = paramArrayOfObject;
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 19:
          localbeh.wIk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 20:
          localbeh.vCj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 21:
          localbeh.vHO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bkq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.wIl = paramArrayOfObject;
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 23:
          localbeh.luH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 24:
          localbeh.wIm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 25:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ato();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ato)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vLK = ((ato)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 26:
          localbeh.wIn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 27:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vMl = ((mw)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 28:
          localbeh.wIo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 29:
          localbeh.wsL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 30:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.wsO = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 31:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vHR = ((bzr)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 32:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vMm = paramArrayOfObject;
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 33:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.vMn = ((mw)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 34:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bvv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bvv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeh.wIp = ((bvv)localObject1);
          }
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        case 35:
          localbeh.vHW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58921);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58921);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.beh
 * JD-Core Version:    0.6.2
 */