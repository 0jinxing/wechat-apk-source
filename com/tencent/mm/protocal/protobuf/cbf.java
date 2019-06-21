package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cbf extends com.tencent.mm.bt.a
{
  public int pcX;
  public LinkedList<cba> vFk;
  public String vHl;
  public long vQE;
  public String wCW;
  public LinkedList<bts> wFp;
  public int wGu;
  public int wGz;
  public int wHG;
  public int wZH;
  public int xaA;
  public LinkedList<bts> xaB;
  public int xaC;
  public SKBuiltinBuffer_t xaD;
  public cbu xaE;
  public bld xaF;
  public cap xaG;
  public SKBuiltinBuffer_t xam;
  public int xan;
  public int xao;
  public int xap;
  public LinkedList<cat> xaq;
  public int xar;
  public int xas;
  public LinkedList<cat> xat;
  public int xau;
  public int xav;
  public LinkedList<cat> xaw;
  public int xax;
  public String xay;
  public long xaz;

  public cbf()
  {
    AppMethodBeat.i(94581);
    this.xaq = new LinkedList();
    this.xat = new LinkedList();
    this.xaw = new LinkedList();
    this.vFk = new LinkedList();
    this.xaB = new LinkedList();
    this.wFp = new LinkedList();
    AppMethodBeat.o(94581);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94582);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xam == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ObjectDesc");
        AppMethodBeat.o(94582);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQE);
      if (this.vHl != null)
        paramArrayOfObject.e(2, this.vHl);
      if (this.wCW != null)
        paramArrayOfObject.e(3, this.wCW);
      paramArrayOfObject.iz(4, this.pcX);
      if (this.xam != null)
      {
        paramArrayOfObject.iy(5, this.xam.computeSize());
        this.xam.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.xan);
      paramArrayOfObject.iz(7, this.xao);
      paramArrayOfObject.iz(8, this.xap);
      paramArrayOfObject.e(9, 8, this.xaq);
      paramArrayOfObject.iz(10, this.xar);
      paramArrayOfObject.iz(11, this.xas);
      paramArrayOfObject.e(12, 8, this.xat);
      paramArrayOfObject.iz(13, this.xau);
      paramArrayOfObject.iz(14, this.xav);
      paramArrayOfObject.e(15, 8, this.xaw);
      paramArrayOfObject.iz(16, this.wGz);
      paramArrayOfObject.iz(17, this.xax);
      paramArrayOfObject.iz(18, this.wHG);
      paramArrayOfObject.e(19, 8, this.vFk);
      paramArrayOfObject.iz(20, this.wZH);
      if (this.xay != null)
        paramArrayOfObject.e(21, this.xay);
      paramArrayOfObject.ai(22, this.xaz);
      paramArrayOfObject.iz(23, this.xaA);
      paramArrayOfObject.e(24, 8, this.xaB);
      paramArrayOfObject.iz(25, this.wGu);
      paramArrayOfObject.iz(26, this.xaC);
      paramArrayOfObject.e(27, 8, this.wFp);
      if (this.xaD != null)
      {
        paramArrayOfObject.iy(28, this.xaD.computeSize());
        this.xaD.writeFields(paramArrayOfObject);
      }
      if (this.xaE != null)
      {
        paramArrayOfObject.iy(29, this.xaE.computeSize());
        this.xaE.writeFields(paramArrayOfObject);
      }
      if (this.xaF != null)
      {
        paramArrayOfObject.iy(30, this.xaF.computeSize());
        this.xaF.writeFields(paramArrayOfObject);
      }
      if (this.xaG != null)
      {
        paramArrayOfObject.iy(31, this.xaG.computeSize());
        this.xaG.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94582);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQE) + 0;
        paramInt = i;
        if (this.vHl != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vHl);
        i = paramInt;
        if (this.wCW != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wCW);
        i += e.a.a.b.b.a.bs(4, this.pcX);
        paramInt = i;
        if (this.xam != null)
          paramInt = i + e.a.a.a.ix(5, this.xam.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(6, this.xan) + e.a.a.b.b.a.bs(7, this.xao) + e.a.a.b.b.a.bs(8, this.xap) + e.a.a.a.c(9, 8, this.xaq) + e.a.a.b.b.a.bs(10, this.xar) + e.a.a.b.b.a.bs(11, this.xas) + e.a.a.a.c(12, 8, this.xat) + e.a.a.b.b.a.bs(13, this.xau) + e.a.a.b.b.a.bs(14, this.xav) + e.a.a.a.c(15, 8, this.xaw) + e.a.a.b.b.a.bs(16, this.wGz) + e.a.a.b.b.a.bs(17, this.xax) + e.a.a.b.b.a.bs(18, this.wHG) + e.a.a.a.c(19, 8, this.vFk) + e.a.a.b.b.a.bs(20, this.wZH);
        paramInt = i;
        if (this.xay != null)
          paramInt = i + e.a.a.b.b.a.f(21, this.xay);
        paramInt = paramInt + e.a.a.b.b.a.o(22, this.xaz) + e.a.a.b.b.a.bs(23, this.xaA) + e.a.a.a.c(24, 8, this.xaB) + e.a.a.b.b.a.bs(25, this.wGu) + e.a.a.b.b.a.bs(26, this.xaC) + e.a.a.a.c(27, 8, this.wFp);
        i = paramInt;
        if (this.xaD != null)
          i = paramInt + e.a.a.a.ix(28, this.xaD.computeSize());
        paramInt = i;
        if (this.xaE != null)
          paramInt = i + e.a.a.a.ix(29, this.xaE.computeSize());
        i = paramInt;
        if (this.xaF != null)
          i = paramInt + e.a.a.a.ix(30, this.xaF.computeSize());
        paramInt = i;
        if (this.xaG != null)
          paramInt = i + e.a.a.a.ix(31, this.xaG.computeSize());
        AppMethodBeat.o(94582);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xaq.clear();
        this.xat.clear();
        this.xaw.clear();
        this.vFk.clear();
        this.xaB.clear();
        this.wFp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xam == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ObjectDesc");
          AppMethodBeat.o(94582);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94582);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cbf localcbf = (cbf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94582);
          break;
        case 1:
          localcbf.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 2:
          localcbf.vHl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 3:
          localcbf.wCW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 4:
          localcbf.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xam = paramArrayOfObject;
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 6:
          localcbf.xan = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 7:
          localcbf.xao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 8:
          localcbf.xap = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cat();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaq.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 10:
          localcbf.xar = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 11:
          localcbf.xas = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cat();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xat.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 13:
          localcbf.xau = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 14:
          localcbf.xav = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cat();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaw.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 16:
          localcbf.wGz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 17:
          localcbf.xax = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 18:
          localcbf.wHG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 19:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cba();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cba)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.vFk.add(localObject1);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 20:
          localcbf.wZH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 21:
          localcbf.xay = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 22:
          localcbf.xaz = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 23:
          localcbf.xaA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 24:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 25:
          localcbf.wGu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 26:
          localcbf.xaC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 27:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.wFp.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 28:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaD = paramArrayOfObject;
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 29:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaE = paramArrayOfObject;
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 30:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bld();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaF = paramArrayOfObject;
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        case 31:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cap();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cap)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbf.xaG = ((cap)localObject1);
          }
          AppMethodBeat.o(94582);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94582);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbf
 * JD-Core Version:    0.6.2
 */