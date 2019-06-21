package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class beg extends bsr
{
  public String guS;
  public String jBB;
  public String jCH;
  public String luP;
  public String luQ;
  public int vCf;
  public String vCg;
  public String vCh;
  public int vIi;
  public String vIj;
  public SKBuiltinBuffer_t vIl;
  public xu vIr;
  public int vLC;
  public String vLD;
  public String vLJ;
  public int vLw;
  public SKBuiltinBuffer_t vLz;
  public String wDY;
  public int wHV;
  public int wHW;
  public int wHX;
  public String wHY;
  public String wHZ;
  public String wIa;
  public String wIb;
  public String wIc;
  public String wId;
  public int wIe;
  public String wIf;
  public String wIg;
  public String wdB;
  public String wdz;
  public String wfH;
  public String wlq;
  public String wsL;
  public String wsM;
  public int wsN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58920);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.vLJ != null)
        paramArrayOfObject.e(3, this.vLJ);
      if (this.jCH != null)
        paramArrayOfObject.e(4, this.jCH);
      paramArrayOfObject.iz(5, this.vCf);
      if (this.vCg != null)
        paramArrayOfObject.e(6, this.vCg);
      if (this.vCh != null)
        paramArrayOfObject.e(7, this.vCh);
      if (this.wdB != null)
        paramArrayOfObject.e(8, this.wdB);
      paramArrayOfObject.iz(12, this.vIi);
      paramArrayOfObject.iz(13, this.wHV);
      paramArrayOfObject.iz(14, this.wsN);
      if (this.luP != null)
        paramArrayOfObject.e(15, this.luP);
      if (this.luQ != null)
        paramArrayOfObject.e(16, this.luQ);
      paramArrayOfObject.iz(17, this.vLw);
      if (this.wdz != null)
        paramArrayOfObject.e(18, this.wdz);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(19, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      if (this.guS != null)
        paramArrayOfObject.e(20, this.guS);
      if (this.wsL != null)
        paramArrayOfObject.e(21, this.wsL);
      if (this.wsM != null)
        paramArrayOfObject.e(22, this.wsM);
      paramArrayOfObject.iz(23, this.wHW);
      paramArrayOfObject.iz(24, this.wHX);
      if (this.vIj != null)
        paramArrayOfObject.e(31, this.vIj);
      if (this.wDY != null)
        paramArrayOfObject.e(32, this.wDY);
      if (this.wHY != null)
        paramArrayOfObject.e(33, this.wHY);
      if (this.wfH != null)
        paramArrayOfObject.e(34, this.wfH);
      if (this.wHZ != null)
        paramArrayOfObject.e(35, this.wHZ);
      if (this.wIa != null)
        paramArrayOfObject.e(36, this.wIa);
      if (this.vIr != null)
      {
        paramArrayOfObject.iy(37, this.vIr.computeSize());
        this.vIr.writeFields(paramArrayOfObject);
      }
      if (this.wIb != null)
        paramArrayOfObject.e(38, this.wIb);
      if (this.wlq != null)
        paramArrayOfObject.e(39, this.wlq);
      if (this.wIc != null)
        paramArrayOfObject.e(40, this.wIc);
      if (this.wId != null)
        paramArrayOfObject.e(41, this.wId);
      paramArrayOfObject.iz(42, this.wIe);
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(43, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(44, this.vLC);
      if (this.vLD != null)
        paramArrayOfObject.e(45, this.vLD);
      if (this.wIf != null)
        paramArrayOfObject.e(46, this.wIf);
      if (this.wIg != null)
        paramArrayOfObject.e(47, this.wIg);
      AppMethodBeat.o(58920);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label2897;
    label2897: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      paramInt = i;
      if (this.vLJ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vLJ);
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.jCH);
      paramInt = i + e.a.a.b.b.a.bs(5, this.vCf);
      i = paramInt;
      if (this.vCg != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vCg);
      paramInt = i;
      if (this.vCh != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vCh);
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wdB);
      i = i + e.a.a.b.b.a.bs(12, this.vIi) + e.a.a.b.b.a.bs(13, this.wHV) + e.a.a.b.b.a.bs(14, this.wsN);
      paramInt = i;
      if (this.luP != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.luP);
      i = paramInt;
      if (this.luQ != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.luQ);
      i += e.a.a.b.b.a.bs(17, this.vLw);
      paramInt = i;
      if (this.wdz != null)
        paramInt = i + e.a.a.b.b.a.f(18, this.wdz);
      int j = paramInt;
      if (this.vLz != null)
        j = paramInt + e.a.a.a.ix(19, this.vLz.computeSize());
      i = j;
      if (this.guS != null)
        i = j + e.a.a.b.b.a.f(20, this.guS);
      paramInt = i;
      if (this.wsL != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.wsL);
      i = paramInt;
      if (this.wsM != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.wsM);
      i = i + e.a.a.b.b.a.bs(23, this.wHW) + e.a.a.b.b.a.bs(24, this.wHX);
      paramInt = i;
      if (this.vIj != null)
        paramInt = i + e.a.a.b.b.a.f(31, this.vIj);
      i = paramInt;
      if (this.wDY != null)
        i = paramInt + e.a.a.b.b.a.f(32, this.wDY);
      paramInt = i;
      if (this.wHY != null)
        paramInt = i + e.a.a.b.b.a.f(33, this.wHY);
      i = paramInt;
      if (this.wfH != null)
        i = paramInt + e.a.a.b.b.a.f(34, this.wfH);
      paramInt = i;
      if (this.wHZ != null)
        paramInt = i + e.a.a.b.b.a.f(35, this.wHZ);
      i = paramInt;
      if (this.wIa != null)
        i = paramInt + e.a.a.b.b.a.f(36, this.wIa);
      paramInt = i;
      if (this.vIr != null)
        paramInt = i + e.a.a.a.ix(37, this.vIr.computeSize());
      i = paramInt;
      if (this.wIb != null)
        i = paramInt + e.a.a.b.b.a.f(38, this.wIb);
      paramInt = i;
      if (this.wlq != null)
        paramInt = i + e.a.a.b.b.a.f(39, this.wlq);
      i = paramInt;
      if (this.wIc != null)
        i = paramInt + e.a.a.b.b.a.f(40, this.wIc);
      paramInt = i;
      if (this.wId != null)
        paramInt = i + e.a.a.b.b.a.f(41, this.wId);
      i = paramInt + e.a.a.b.b.a.bs(42, this.wIe);
      paramInt = i;
      if (this.vIl != null)
        paramInt = i + e.a.a.a.ix(43, this.vIl.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(44, this.vLC);
      paramInt = i;
      if (this.vLD != null)
        paramInt = i + e.a.a.b.b.a.f(45, this.vLD);
      i = paramInt;
      if (this.wIf != null)
        i = paramInt + e.a.a.b.b.a.f(46, this.wIf);
      paramInt = i;
      if (this.wIg != null)
        paramInt = i + e.a.a.b.b.a.f(47, this.wIg);
      AppMethodBeat.o(58920);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58920);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        beg localbeg = (beg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 9:
        case 10:
        case 11:
        case 25:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        default:
          paramInt = -1;
          AppMethodBeat.o(58920);
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
            localbeg.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 2:
          localbeg.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 3:
          localbeg.vLJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 4:
          localbeg.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 5:
          localbeg.vCf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 6:
          localbeg.vCg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 7:
          localbeg.vCh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 8:
          localbeg.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 12:
          localbeg.vIi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 13:
          localbeg.wHV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 14:
          localbeg.wsN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 15:
          localbeg.luP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 16:
          localbeg.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 17:
          localbeg.vLw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 18:
          localbeg.wdz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 19:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeg.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 20:
          localbeg.guS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 21:
          localbeg.wsL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 22:
          localbeg.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 23:
          localbeg.wHW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 24:
          localbeg.wHX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 31:
          localbeg.vIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 32:
          localbeg.wDY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 33:
          localbeg.wHY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 34:
          localbeg.wfH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 35:
          localbeg.wHZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 36:
          localbeg.wIa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 37:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeg.vIr = ((xu)localObject1);
          }
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 38:
          localbeg.wIb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 39:
          localbeg.wlq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 40:
          localbeg.wIc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 41:
          localbeg.wId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 42:
          localbeg.wIe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 43:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbeg.vIl = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 44:
          localbeg.vLC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 45:
          localbeg.vLD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 46:
          localbeg.wIf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        case 47:
          localbeg.wIg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58920);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58920);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.beg
 * JD-Core Version:    0.6.2
 */