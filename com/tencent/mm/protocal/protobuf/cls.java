package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cls extends bsr
{
  public String ndF;
  public String ndG;
  public String vEG;
  public String vFF;
  public int vFH;
  public String vRw;
  public int vRx;
  public int vRy;
  public int vRz;
  public int wEs;
  public int wEt;
  public SKBuiltinBuffer_t wEu;
  public int wEv;
  public int wWT;
  public int wYj;
  public int wdW;
  public int wdl;
  public String wxU;
  public String wxW;
  public String xjA;
  public String xjB;
  public String xjC;
  public String xjD;
  public String xjE;
  public int xjg;
  public int xjh;
  public int xji;
  public int xjo;
  public int xjp;
  public SKBuiltinBuffer_t xjq;
  public int xjr;
  public String xjs;
  public int xjt;
  public String xju;
  public String xjv;
  public int xjw;
  public String xjx;
  public String xjy;
  public String xjz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51008);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wEu == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbData");
        AppMethodBeat.o(51008);
        throw paramArrayOfObject;
      }
      if (this.xjq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: VideoData");
        AppMethodBeat.o(51008);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vFF != null)
        paramArrayOfObject.e(2, this.vFF);
      if (this.ndG != null)
        paramArrayOfObject.e(3, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(4, this.ndF);
      paramArrayOfObject.iz(5, this.wEs);
      paramArrayOfObject.iz(6, this.wEt);
      if (this.wEu != null)
      {
        paramArrayOfObject.iy(7, this.wEu.computeSize());
        this.wEu.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.xjo);
      paramArrayOfObject.iz(9, this.xjp);
      if (this.xjq != null)
      {
        paramArrayOfObject.iy(10, this.xjq.computeSize());
        this.xjq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.wYj);
      paramArrayOfObject.iz(12, this.wdl);
      paramArrayOfObject.iz(13, this.wEv);
      paramArrayOfObject.iz(14, this.xjr);
      if (this.vEG != null)
        paramArrayOfObject.e(15, this.vEG);
      if (this.xjs != null)
        paramArrayOfObject.e(16, this.xjs);
      if (this.vRw != null)
        paramArrayOfObject.e(17, this.vRw);
      paramArrayOfObject.iz(18, this.vRx);
      if (this.wxU != null)
        paramArrayOfObject.e(19, this.wxU);
      paramArrayOfObject.iz(20, this.xjg);
      paramArrayOfObject.iz(21, this.xjh);
      paramArrayOfObject.iz(22, this.xji);
      if (this.wxW != null)
        paramArrayOfObject.e(23, this.wxW);
      paramArrayOfObject.iz(24, this.xjt);
      paramArrayOfObject.iz(25, this.wdW);
      if (this.xju != null)
        paramArrayOfObject.e(26, this.xju);
      if (this.xjv != null)
        paramArrayOfObject.e(27, this.xjv);
      paramArrayOfObject.iz(28, this.xjw);
      if (this.xjx != null)
        paramArrayOfObject.e(29, this.xjx);
      if (this.xjy != null)
        paramArrayOfObject.e(30, this.xjy);
      if (this.xjz != null)
        paramArrayOfObject.e(31, this.xjz);
      if (this.xjA != null)
        paramArrayOfObject.e(32, this.xjA);
      if (this.xjB != null)
        paramArrayOfObject.e(33, this.xjB);
      if (this.xjC != null)
        paramArrayOfObject.e(34, this.xjC);
      if (this.xjD != null)
        paramArrayOfObject.e(35, this.xjD);
      paramArrayOfObject.iz(36, this.wWT);
      if (this.xjE != null)
        paramArrayOfObject.e(37, this.xjE);
      paramArrayOfObject.iz(38, this.vRy);
      paramArrayOfObject.iz(39, this.vRz);
      paramArrayOfObject.iz(40, this.vFH);
      AppMethodBeat.o(51008);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label2818;
    label2818: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFF);
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ndF);
      i = i + e.a.a.b.b.a.bs(5, this.wEs) + e.a.a.b.b.a.bs(6, this.wEt);
      paramInt = i;
      if (this.wEu != null)
        paramInt = i + e.a.a.a.ix(7, this.wEu.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.xjo) + e.a.a.b.b.a.bs(9, this.xjp);
      paramInt = i;
      if (this.xjq != null)
        paramInt = i + e.a.a.a.ix(10, this.xjq.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(11, this.wYj) + e.a.a.b.b.a.bs(12, this.wdl) + e.a.a.b.b.a.bs(13, this.wEv) + e.a.a.b.b.a.bs(14, this.xjr);
      i = paramInt;
      if (this.vEG != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.vEG);
      paramInt = i;
      if (this.xjs != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.xjs);
      i = paramInt;
      if (this.vRw != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.vRw);
      i += e.a.a.b.b.a.bs(18, this.vRx);
      paramInt = i;
      if (this.wxU != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.wxU);
      i = paramInt + e.a.a.b.b.a.bs(20, this.xjg) + e.a.a.b.b.a.bs(21, this.xjh) + e.a.a.b.b.a.bs(22, this.xji);
      paramInt = i;
      if (this.wxW != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.wxW);
      i = paramInt + e.a.a.b.b.a.bs(24, this.xjt) + e.a.a.b.b.a.bs(25, this.wdW);
      paramInt = i;
      if (this.xju != null)
        paramInt = i + e.a.a.b.b.a.f(26, this.xju);
      i = paramInt;
      if (this.xjv != null)
        i = paramInt + e.a.a.b.b.a.f(27, this.xjv);
      i += e.a.a.b.b.a.bs(28, this.xjw);
      paramInt = i;
      if (this.xjx != null)
        paramInt = i + e.a.a.b.b.a.f(29, this.xjx);
      i = paramInt;
      if (this.xjy != null)
        i = paramInt + e.a.a.b.b.a.f(30, this.xjy);
      paramInt = i;
      if (this.xjz != null)
        paramInt = i + e.a.a.b.b.a.f(31, this.xjz);
      i = paramInt;
      if (this.xjA != null)
        i = paramInt + e.a.a.b.b.a.f(32, this.xjA);
      int j = i;
      if (this.xjB != null)
        j = i + e.a.a.b.b.a.f(33, this.xjB);
      paramInt = j;
      if (this.xjC != null)
        paramInt = j + e.a.a.b.b.a.f(34, this.xjC);
      i = paramInt;
      if (this.xjD != null)
        i = paramInt + e.a.a.b.b.a.f(35, this.xjD);
      i += e.a.a.b.b.a.bs(36, this.wWT);
      paramInt = i;
      if (this.xjE != null)
        paramInt = i + e.a.a.b.b.a.f(37, this.xjE);
      paramInt = paramInt + e.a.a.b.b.a.bs(38, this.vRy) + e.a.a.b.b.a.bs(39, this.vRz) + e.a.a.b.b.a.bs(40, this.vFH);
      AppMethodBeat.o(51008);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wEu == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbData");
          AppMethodBeat.o(51008);
          throw paramArrayOfObject;
        }
        if (this.xjq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: VideoData");
          AppMethodBeat.o(51008);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51008);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cls localcls = (cls)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51008);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcls.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 2:
          localcls.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 3:
          localcls.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 4:
          localcls.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 5:
          localcls.wEs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 6:
          localcls.wEt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcls.wEu = paramArrayOfObject;
          }
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 8:
          localcls.xjo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 9:
          localcls.xjp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcls.xjq = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 11:
          localcls.wYj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 12:
          localcls.wdl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 13:
          localcls.wEv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 14:
          localcls.xjr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 15:
          localcls.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 16:
          localcls.xjs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 17:
          localcls.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 18:
          localcls.vRx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 19:
          localcls.wxU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 20:
          localcls.xjg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 21:
          localcls.xjh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 22:
          localcls.xji = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 23:
          localcls.wxW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 24:
          localcls.xjt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 25:
          localcls.wdW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 26:
          localcls.xju = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 27:
          localcls.xjv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 28:
          localcls.xjw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 29:
          localcls.xjx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 30:
          localcls.xjy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 31:
          localcls.xjz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 32:
          localcls.xjA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 33:
          localcls.xjB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 34:
          localcls.xjC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 35:
          localcls.xjD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 36:
          localcls.wWT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 37:
          localcls.xjE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 38:
          localcls.vRy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 39:
          localcls.vRz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        case 40:
          localcls.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51008);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51008);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cls
 * JD-Core Version:    0.6.2
 */