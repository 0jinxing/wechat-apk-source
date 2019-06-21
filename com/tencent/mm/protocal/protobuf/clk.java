package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class clk extends bsr
{
  public String Md5;
  public String fKh;
  public String fKk;
  public int nao;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;
  public String vCs;
  public String vCt;
  public String vCu;
  public bts vEB;
  public bts vEC;
  public String vEG;
  public String vRw;
  public int vRx;
  public int vRy;
  public int vRz;
  public int vZF;
  public int wWT;
  public int wdW;
  public int wqw;
  public String wxW;
  public int xbN;
  public bts xja;
  public String xjb;
  public String xjc;
  public int xjd;
  public int xje;
  public String xjf;
  public int xjg;
  public int xjh;
  public int xji;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80203);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xja == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ClientImgId");
        AppMethodBeat.o(80203);
        throw paramArrayOfObject;
      }
      if (this.vEB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(80203);
        throw paramArrayOfObject;
      }
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(80203);
        throw paramArrayOfObject;
      }
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(80203);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xja != null)
      {
        paramArrayOfObject.iy(2, this.xja.computeSize());
        this.xja.writeFields(paramArrayOfObject);
      }
      if (this.vEB != null)
      {
        paramArrayOfObject.iy(3, this.vEB.computeSize());
        this.vEB.writeFields(paramArrayOfObject);
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(4, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.ptw);
      paramArrayOfObject.iz(6, this.ptx);
      paramArrayOfObject.iz(7, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(8, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.nao);
      if (this.vEG != null)
        paramArrayOfObject.e(10, this.vEG);
      paramArrayOfObject.iz(11, this.wqw);
      paramArrayOfObject.iz(12, this.vZF);
      paramArrayOfObject.iz(13, this.xbN);
      if (this.fKk != null)
        paramArrayOfObject.e(14, this.fKk);
      if (this.xjb != null)
        paramArrayOfObject.e(15, this.xjb);
      if (this.xjc != null)
        paramArrayOfObject.e(16, this.xjc);
      if (this.vRw != null)
        paramArrayOfObject.e(17, this.vRw);
      paramArrayOfObject.iz(18, this.vRx);
      paramArrayOfObject.iz(19, this.xjd);
      paramArrayOfObject.iz(20, this.xje);
      if (this.xjf != null)
        paramArrayOfObject.e(21, this.xjf);
      paramArrayOfObject.iz(22, this.xjg);
      paramArrayOfObject.iz(23, this.xjh);
      paramArrayOfObject.iz(24, this.xji);
      if (this.wxW != null)
        paramArrayOfObject.e(25, this.wxW);
      paramArrayOfObject.iz(26, this.wdW);
      if (this.Md5 != null)
        paramArrayOfObject.e(27, this.Md5);
      paramArrayOfObject.iz(28, this.vRy);
      paramArrayOfObject.iz(29, this.vRz);
      paramArrayOfObject.iz(30, this.wWT);
      if (this.fKh != null)
        paramArrayOfObject.e(31, this.fKh);
      if (this.vCu != null)
        paramArrayOfObject.e(32, this.vCu);
      if (this.vCt != null)
        paramArrayOfObject.e(33, this.vCt);
      if (this.vCs != null)
        paramArrayOfObject.e(34, this.vCs);
      AppMethodBeat.o(80203);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label2739;
    label2739: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xja != null)
        i = paramInt + e.a.a.a.ix(2, this.xja.computeSize());
      paramInt = i;
      if (this.vEB != null)
        paramInt = i + e.a.a.a.ix(3, this.vEB.computeSize());
      i = paramInt;
      if (this.vEC != null)
        i = paramInt + e.a.a.a.ix(4, this.vEC.computeSize());
      i = i + e.a.a.b.b.a.bs(5, this.ptw) + e.a.a.b.b.a.bs(6, this.ptx) + e.a.a.b.b.a.bs(7, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(8, this.ptz.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(9, this.nao);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vEG);
      i = paramInt + e.a.a.b.b.a.bs(11, this.wqw) + e.a.a.b.b.a.bs(12, this.vZF) + e.a.a.b.b.a.bs(13, this.xbN);
      paramInt = i;
      if (this.fKk != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.fKk);
      i = paramInt;
      if (this.xjb != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.xjb);
      paramInt = i;
      if (this.xjc != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.xjc);
      i = paramInt;
      if (this.vRw != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.vRw);
      i = i + e.a.a.b.b.a.bs(18, this.vRx) + e.a.a.b.b.a.bs(19, this.xjd) + e.a.a.b.b.a.bs(20, this.xje);
      paramInt = i;
      if (this.xjf != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.xjf);
      i = paramInt + e.a.a.b.b.a.bs(22, this.xjg) + e.a.a.b.b.a.bs(23, this.xjh) + e.a.a.b.b.a.bs(24, this.xji);
      paramInt = i;
      if (this.wxW != null)
        paramInt = i + e.a.a.b.b.a.f(25, this.wxW);
      i = paramInt + e.a.a.b.b.a.bs(26, this.wdW);
      paramInt = i;
      if (this.Md5 != null)
        paramInt = i + e.a.a.b.b.a.f(27, this.Md5);
      i = paramInt + e.a.a.b.b.a.bs(28, this.vRy) + e.a.a.b.b.a.bs(29, this.vRz) + e.a.a.b.b.a.bs(30, this.wWT);
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(31, this.fKh);
      i = paramInt;
      if (this.vCu != null)
        i = paramInt + e.a.a.b.b.a.f(32, this.vCu);
      paramInt = i;
      if (this.vCt != null)
        paramInt = i + e.a.a.b.b.a.f(33, this.vCt);
      i = paramInt;
      if (this.vCs != null)
        i = paramInt + e.a.a.b.b.a.f(34, this.vCs);
      AppMethodBeat.o(80203);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xja == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ClientImgId");
          AppMethodBeat.o(80203);
          throw paramArrayOfObject;
        }
        if (this.vEB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(80203);
          throw paramArrayOfObject;
        }
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(80203);
          throw paramArrayOfObject;
        }
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(80203);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80203);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        clk localclk = (clk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80203);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclk.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80203);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclk.xja = paramArrayOfObject;
          }
          AppMethodBeat.o(80203);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclk.vEB = paramArrayOfObject;
          }
          AppMethodBeat.o(80203);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclk.vEC = paramArrayOfObject;
          }
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 5:
          localclk.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 6:
          localclk.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 7:
          localclk.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclk.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 9:
          localclk.nao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 10:
          localclk.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 11:
          localclk.wqw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 12:
          localclk.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 13:
          localclk.xbN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 14:
          localclk.fKk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 15:
          localclk.xjb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 16:
          localclk.xjc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 17:
          localclk.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 18:
          localclk.vRx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 19:
          localclk.xjd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 20:
          localclk.xje = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 21:
          localclk.xjf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 22:
          localclk.xjg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 23:
          localclk.xjh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 24:
          localclk.xji = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 25:
          localclk.wxW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 26:
          localclk.wdW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 27:
          localclk.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 28:
          localclk.vRy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 29:
          localclk.vRz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 30:
          localclk.wWT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 31:
          localclk.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 32:
          localclk.vCu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 33:
          localclk.vCt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        case 34:
          localclk.vCs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80203);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80203);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clk
 * JD-Core Version:    0.6.2
 */