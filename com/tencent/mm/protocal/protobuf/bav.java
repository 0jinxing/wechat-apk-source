package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bav extends com.tencent.mm.bt.a
{
  public String cMm;
  public int cRU;
  public String cvF;
  public int eRu;
  public String ptv;
  public String token;
  public int wEJ;
  public int wFd;
  public int wFe;
  public LinkedList<ayq> wFf;
  public LinkedList<cco> wFg;
  public int wFh;
  public long wFi;
  public int wFj;
  public LinkedList<Long> wFk;
  public int wFl;
  public int wFm;
  public String wFn;
  public int wFo;
  public LinkedList<bts> wFp;
  public cbp wFq;
  public LinkedList<cbv> wFr;
  public String wFs;
  public long wFt;
  public String wFu;
  public boolean wFv;
  public cap wFw;
  public String wdB;

  public bav()
  {
    AppMethodBeat.i(94540);
    this.wFf = new LinkedList();
    this.wFg = new LinkedList();
    this.wFk = new LinkedList();
    this.wFp = new LinkedList();
    this.wFr = new LinkedList();
    AppMethodBeat.o(94540);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94541);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wFd);
      paramArrayOfObject.iz(2, this.wFe);
      paramArrayOfObject.iz(3, this.wEJ);
      if (this.ptv != null)
        paramArrayOfObject.e(4, this.ptv);
      paramArrayOfObject.e(5, 8, this.wFf);
      paramArrayOfObject.e(6, 8, this.wFg);
      paramArrayOfObject.iz(7, this.wFh);
      paramArrayOfObject.iz(8, this.eRu);
      paramArrayOfObject.ai(9, this.wFi);
      paramArrayOfObject.iz(10, this.wFj);
      paramArrayOfObject.e(11, 3, this.wFk);
      paramArrayOfObject.iz(12, this.wFl);
      paramArrayOfObject.iz(13, this.wFm);
      if (this.token != null)
        paramArrayOfObject.e(14, this.token);
      if (this.wFn != null)
        paramArrayOfObject.e(15, this.wFn);
      paramArrayOfObject.iz(16, this.wFo);
      paramArrayOfObject.e(17, 8, this.wFp);
      if (this.wFq != null)
      {
        paramArrayOfObject.iy(18, this.wFq.computeSize());
        this.wFq.writeFields(paramArrayOfObject);
      }
      if (this.cMm != null)
        paramArrayOfObject.e(19, this.cMm);
      paramArrayOfObject.e(20, 8, this.wFr);
      if (this.cvF != null)
        paramArrayOfObject.e(21, this.cvF);
      if (this.wFs != null)
        paramArrayOfObject.e(22, this.wFs);
      if (this.wdB != null)
        paramArrayOfObject.e(23, this.wdB);
      paramArrayOfObject.iz(24, this.cRU);
      paramArrayOfObject.ai(25, this.wFt);
      if (this.wFu != null)
        paramArrayOfObject.e(26, this.wFu);
      paramArrayOfObject.aO(27, this.wFv);
      if (this.wFw != null)
      {
        paramArrayOfObject.iy(28, this.wFw.computeSize());
        this.wFw.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94541);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wFd) + 0 + e.a.a.b.b.a.bs(2, this.wFe) + e.a.a.b.b.a.bs(3, this.wEJ);
        paramInt = i;
        if (this.ptv != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.ptv);
        i = paramInt + e.a.a.a.c(5, 8, this.wFf) + e.a.a.a.c(6, 8, this.wFg) + e.a.a.b.b.a.bs(7, this.wFh) + e.a.a.b.b.a.bs(8, this.eRu) + e.a.a.b.b.a.o(9, this.wFi) + e.a.a.b.b.a.bs(10, this.wFj) + e.a.a.a.c(11, 3, this.wFk) + e.a.a.b.b.a.bs(12, this.wFl) + e.a.a.b.b.a.bs(13, this.wFm);
        paramInt = i;
        if (this.token != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.token);
        i = paramInt;
        if (this.wFn != null)
          i = paramInt + e.a.a.b.b.a.f(15, this.wFn);
        i = i + e.a.a.b.b.a.bs(16, this.wFo) + e.a.a.a.c(17, 8, this.wFp);
        paramInt = i;
        if (this.wFq != null)
          paramInt = i + e.a.a.a.ix(18, this.wFq.computeSize());
        i = paramInt;
        if (this.cMm != null)
          i = paramInt + e.a.a.b.b.a.f(19, this.cMm);
        paramInt = i + e.a.a.a.c(20, 8, this.wFr);
        i = paramInt;
        if (this.cvF != null)
          i = paramInt + e.a.a.b.b.a.f(21, this.cvF);
        paramInt = i;
        if (this.wFs != null)
          paramInt = i + e.a.a.b.b.a.f(22, this.wFs);
        i = paramInt;
        if (this.wdB != null)
          i = paramInt + e.a.a.b.b.a.f(23, this.wdB);
        i = i + e.a.a.b.b.a.bs(24, this.cRU) + e.a.a.b.b.a.o(25, this.wFt);
        paramInt = i;
        if (this.wFu != null)
          paramInt = i + e.a.a.b.b.a.f(26, this.wFu);
        i = paramInt + (e.a.a.b.b.a.fv(27) + 1);
        paramInt = i;
        if (this.wFw != null)
          paramInt = i + e.a.a.a.ix(28, this.wFw.computeSize());
        AppMethodBeat.o(94541);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wFf.clear();
        this.wFg.clear();
        this.wFk.clear();
        this.wFp.clear();
        this.wFr.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94541);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bav localbav = (bav)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94541);
          break;
        case 1:
          localbav.wFd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 2:
          localbav.wFe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 3:
          localbav.wEJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 4:
          localbav.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ayq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbav.wFf.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cco();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cco)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbav.wFg.add(localObject1);
          }
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 7:
          localbav.wFh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 8:
          localbav.eRu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 9:
          localbav.wFi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 10:
          localbav.wFj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 11:
          localbav.wFk.add(Long.valueOf(((e.a.a.a.a)localObject1).BTU.ve()));
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 12:
          localbav.wFl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 13:
          localbav.wFm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 14:
          localbav.token = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 15:
          localbav.wFn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 16:
          localbav.wFo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbav.wFp.add(localObject1);
          }
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 18:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbav.wFq = paramArrayOfObject;
          }
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 19:
          localbav.cMm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cbv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbav.wFr.add(localObject1);
          }
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 21:
          localbav.cvF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 22:
          localbav.wFs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 23:
          localbav.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 24:
          localbav.cRU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 25:
          localbav.wFt = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 26:
          localbav.wFu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 27:
          localbav.wFv = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        case 28:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cap();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cap)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbav.wFw = ((cap)localObject1);
          }
          AppMethodBeat.o(94541);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94541);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bav
 * JD-Core Version:    0.6.2
 */