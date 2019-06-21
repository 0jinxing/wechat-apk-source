package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpr extends com.tencent.mm.bt.a
{
  public int nwQ;
  public cpx xlM;
  public cpx xlN;
  public SKBuiltinBuffer_t xnA;
  public int xnB;
  public String xnC;
  public int xnD;
  public LinkedList<cps> xnE;
  public int xnc;
  public cok xnd;
  public cok xne;
  public int xnf;
  public int xng;
  public int xnh;
  public int xni;
  public SKBuiltinBuffer_t xnj;
  public int xnk;
  public cok xnl;
  public int xnm;
  public int xnn;
  public int xno;
  public int xnp;
  public int xnq;
  public int xnr;
  public SKBuiltinBuffer_t xns;
  public SKBuiltinBuffer_t xnt;
  public int xnu;
  public SKBuiltinBuffer_t xnv;
  public int xnw;
  public int xnx;
  public int xny;
  public awi xnz;

  public cpr()
  {
    AppMethodBeat.i(5253);
    this.xnE = new LinkedList();
    AppMethodBeat.o(5253);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5254);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xlM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PeerId");
        AppMethodBeat.o(5254);
        throw paramArrayOfObject;
      }
      if (this.xlN == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CapInfo");
        AppMethodBeat.o(5254);
        throw paramArrayOfObject;
      }
      if (this.xlM != null)
      {
        paramArrayOfObject.iy(1, this.xlM.computeSize());
        this.xlM.writeFields(paramArrayOfObject);
      }
      if (this.xlN != null)
      {
        paramArrayOfObject.iy(2, this.xlN.computeSize());
        this.xlN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.xnc);
      if (this.xnd != null)
      {
        paramArrayOfObject.iy(4, this.xnd.computeSize());
        this.xnd.writeFields(paramArrayOfObject);
      }
      if (this.xne != null)
      {
        paramArrayOfObject.iy(5, this.xne.computeSize());
        this.xne.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.xnf);
      paramArrayOfObject.iz(7, this.xng);
      paramArrayOfObject.iz(8, this.xnh);
      paramArrayOfObject.iz(9, this.xni);
      if (this.xnj != null)
      {
        paramArrayOfObject.iy(10, this.xnj.computeSize());
        this.xnj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.xnk);
      if (this.xnl != null)
      {
        paramArrayOfObject.iy(12, this.xnl.computeSize());
        this.xnl.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(13, this.xnm);
      paramArrayOfObject.iz(14, this.xnn);
      paramArrayOfObject.iz(15, this.xno);
      paramArrayOfObject.iz(16, this.xnp);
      paramArrayOfObject.iz(17, this.xnq);
      paramArrayOfObject.iz(18, this.nwQ);
      paramArrayOfObject.iz(19, this.xnr);
      if (this.xns != null)
      {
        paramArrayOfObject.iy(20, this.xns.computeSize());
        this.xns.writeFields(paramArrayOfObject);
      }
      if (this.xnt != null)
      {
        paramArrayOfObject.iy(21, this.xnt.computeSize());
        this.xnt.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(22, this.xnu);
      if (this.xnv != null)
      {
        paramArrayOfObject.iy(23, this.xnv.computeSize());
        this.xnv.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(24, this.xnw);
      paramArrayOfObject.iz(25, this.xnx);
      paramArrayOfObject.iz(26, this.xny);
      if (this.xnz != null)
      {
        paramArrayOfObject.iy(27, this.xnz.computeSize());
        this.xnz.writeFields(paramArrayOfObject);
      }
      if (this.xnA != null)
      {
        paramArrayOfObject.iy(28, this.xnA.computeSize());
        this.xnA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(29, this.xnB);
      if (this.xnC != null)
        paramArrayOfObject.e(30, this.xnC);
      paramArrayOfObject.iz(31, this.xnD);
      paramArrayOfObject.e(32, 8, this.xnE);
      AppMethodBeat.o(5254);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xlM == null)
        break label3166;
    label3166: for (paramInt = e.a.a.a.ix(1, this.xlM.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xlN != null)
        i = paramInt + e.a.a.a.ix(2, this.xlN.computeSize());
      i += e.a.a.b.b.a.bs(3, this.xnc);
      paramInt = i;
      if (this.xnd != null)
        paramInt = i + e.a.a.a.ix(4, this.xnd.computeSize());
      i = paramInt;
      if (this.xne != null)
        i = paramInt + e.a.a.a.ix(5, this.xne.computeSize());
      i = i + e.a.a.b.b.a.bs(6, this.xnf) + e.a.a.b.b.a.bs(7, this.xng) + e.a.a.b.b.a.bs(8, this.xnh) + e.a.a.b.b.a.bs(9, this.xni);
      paramInt = i;
      if (this.xnj != null)
        paramInt = i + e.a.a.a.ix(10, this.xnj.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(11, this.xnk);
      paramInt = i;
      if (this.xnl != null)
        paramInt = i + e.a.a.a.ix(12, this.xnl.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(13, this.xnm) + e.a.a.b.b.a.bs(14, this.xnn) + e.a.a.b.b.a.bs(15, this.xno) + e.a.a.b.b.a.bs(16, this.xnp) + e.a.a.b.b.a.bs(17, this.xnq) + e.a.a.b.b.a.bs(18, this.nwQ) + e.a.a.b.b.a.bs(19, this.xnr);
      paramInt = i;
      if (this.xns != null)
        paramInt = i + e.a.a.a.ix(20, this.xns.computeSize());
      i = paramInt;
      if (this.xnt != null)
        i = paramInt + e.a.a.a.ix(21, this.xnt.computeSize());
      i += e.a.a.b.b.a.bs(22, this.xnu);
      paramInt = i;
      if (this.xnv != null)
        paramInt = i + e.a.a.a.ix(23, this.xnv.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(24, this.xnw) + e.a.a.b.b.a.bs(25, this.xnx) + e.a.a.b.b.a.bs(26, this.xny);
      paramInt = i;
      if (this.xnz != null)
        paramInt = i + e.a.a.a.ix(27, this.xnz.computeSize());
      i = paramInt;
      if (this.xnA != null)
        i = paramInt + e.a.a.a.ix(28, this.xnA.computeSize());
      i += e.a.a.b.b.a.bs(29, this.xnB);
      paramInt = i;
      if (this.xnC != null)
        paramInt = i + e.a.a.b.b.a.f(30, this.xnC);
      paramInt = paramInt + e.a.a.b.b.a.bs(31, this.xnD) + e.a.a.a.c(32, 8, this.xnE);
      AppMethodBeat.o(5254);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xnE.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xlM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PeerId");
          AppMethodBeat.o(5254);
          throw paramArrayOfObject;
        }
        if (this.xlN == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CapInfo");
          AppMethodBeat.o(5254);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5254);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpr localcpr = (cpr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5254);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cpx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xlM = ((cpx)localObject1);
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xlN = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 3:
          localcpr.xnc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cok();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnd = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cok();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xne = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 6:
          localcpr.xnf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 7:
          localcpr.xng = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 8:
          localcpr.xnh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 9:
          localcpr.xni = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnj = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 11:
          localcpr.xnk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cok();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnl = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 13:
          localcpr.xnm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 14:
          localcpr.xnn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 15:
          localcpr.xno = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 16:
          localcpr.xnp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 17:
          localcpr.xnq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 18:
          localcpr.nwQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 19:
          localcpr.xnr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xns = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 21:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnt = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 22:
          localcpr.xnu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 23:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnv = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 24:
          localcpr.xnw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 25:
          localcpr.xnx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 26:
          localcpr.xny = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 27:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new awi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((awi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnz = ((awi)localObject1);
          }
          AppMethodBeat.o(5254);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnA = paramArrayOfObject;
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 29:
          localcpr.xnB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 30:
          localcpr.xnC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 31:
          localcpr.xnD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        case 32:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cps();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cps)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpr.xnE.add(localObject1);
          }
          AppMethodBeat.o(5254);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5254);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpr
 * JD-Core Version:    0.6.2
 */