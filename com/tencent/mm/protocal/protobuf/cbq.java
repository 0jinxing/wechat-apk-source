package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cbq extends bsr
{
  public String ptv;
  public SKBuiltinBuffer_t vIl;
  public int wFe;
  public LinkedList<cba> wFk;
  public LinkedList<bts> wFp;
  public cbp wFq;
  public int wHG;
  public civ wNQ;
  public int xaA;
  public LinkedList<bts> xaB;
  public int xaC;
  public cbu xaE;
  public int xaU;
  public int xaV;
  public int xaW;
  public cbo xaX;
  public SKBuiltinBuffer_t xaY;
  public String xaZ;
  public SKBuiltinBuffer_t xam;
  public int xav;
  public LinkedList<bts> xaw;
  public long xaz;
  public nl xba;
  public int xbb;
  public LinkedList<bas> xbc;
  public cap xbd;

  public cbq()
  {
    AppMethodBeat.i(94595);
    this.xaw = new LinkedList();
    this.wFk = new LinkedList();
    this.xaB = new LinkedList();
    this.wFp = new LinkedList();
    this.xbc = new LinkedList();
    AppMethodBeat.o(94595);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94596);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xam == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ObjectDesc");
        AppMethodBeat.o(94596);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xam != null)
      {
        paramArrayOfObject.iy(2, this.xam.computeSize());
        this.xam.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.xav);
      paramArrayOfObject.e(4, 8, this.xaw);
      paramArrayOfObject.iz(5, this.xaU);
      paramArrayOfObject.iz(6, this.wFe);
      if (this.ptv != null)
        paramArrayOfObject.e(7, this.ptv);
      paramArrayOfObject.iz(8, this.xaV);
      paramArrayOfObject.iz(9, this.wHG);
      paramArrayOfObject.e(10, 8, this.wFk);
      paramArrayOfObject.iz(11, this.xaW);
      paramArrayOfObject.ai(12, this.xaz);
      paramArrayOfObject.iz(13, this.xaA);
      paramArrayOfObject.e(14, 8, this.xaB);
      if (this.wNQ != null)
      {
        paramArrayOfObject.iy(15, this.wNQ.computeSize());
        this.wNQ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(16, this.xaC);
      paramArrayOfObject.e(17, 8, this.wFp);
      if (this.xaX != null)
      {
        paramArrayOfObject.iy(18, this.xaX.computeSize());
        this.xaX.writeFields(paramArrayOfObject);
      }
      if (this.wFq != null)
      {
        paramArrayOfObject.iy(19, this.wFq.computeSize());
        this.wFq.writeFields(paramArrayOfObject);
      }
      if (this.xaE != null)
      {
        paramArrayOfObject.iy(20, this.xaE.computeSize());
        this.xaE.writeFields(paramArrayOfObject);
      }
      if (this.xaY != null)
      {
        paramArrayOfObject.iy(21, this.xaY.computeSize());
        this.xaY.writeFields(paramArrayOfObject);
      }
      if (this.xaZ != null)
        paramArrayOfObject.e(22, this.xaZ);
      if (this.xba != null)
      {
        paramArrayOfObject.iy(23, this.xba.computeSize());
        this.xba.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(24, this.xbb);
      paramArrayOfObject.e(25, 8, this.xbc);
      if (this.xbd != null)
      {
        paramArrayOfObject.iy(26, this.xbd.computeSize());
        this.xbd.writeFields(paramArrayOfObject);
      }
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(27, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94596);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label3129;
    label3129: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xam != null)
        i = paramInt + e.a.a.a.ix(2, this.xam.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.xav) + e.a.a.a.c(4, 8, this.xaw) + e.a.a.b.b.a.bs(5, this.xaU) + e.a.a.b.b.a.bs(6, this.wFe);
      paramInt = i;
      if (this.ptv != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.ptv);
      i = paramInt + e.a.a.b.b.a.bs(8, this.xaV) + e.a.a.b.b.a.bs(9, this.wHG) + e.a.a.a.c(10, 8, this.wFk) + e.a.a.b.b.a.bs(11, this.xaW) + e.a.a.b.b.a.o(12, this.xaz) + e.a.a.b.b.a.bs(13, this.xaA) + e.a.a.a.c(14, 8, this.xaB);
      paramInt = i;
      if (this.wNQ != null)
        paramInt = i + e.a.a.a.ix(15, this.wNQ.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(16, this.xaC) + e.a.a.a.c(17, 8, this.wFp);
      paramInt = i;
      if (this.xaX != null)
        paramInt = i + e.a.a.a.ix(18, this.xaX.computeSize());
      int j = paramInt;
      if (this.wFq != null)
        j = paramInt + e.a.a.a.ix(19, this.wFq.computeSize());
      i = j;
      if (this.xaE != null)
        i = j + e.a.a.a.ix(20, this.xaE.computeSize());
      paramInt = i;
      if (this.xaY != null)
        paramInt = i + e.a.a.a.ix(21, this.xaY.computeSize());
      i = paramInt;
      if (this.xaZ != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.xaZ);
      paramInt = i;
      if (this.xba != null)
        paramInt = i + e.a.a.a.ix(23, this.xba.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(24, this.xbb) + e.a.a.a.c(25, 8, this.xbc);
      paramInt = i;
      if (this.xbd != null)
        paramInt = i + e.a.a.a.ix(26, this.xbd.computeSize());
      i = paramInt;
      if (this.vIl != null)
        i = paramInt + e.a.a.a.ix(27, this.vIl.computeSize());
      AppMethodBeat.o(94596);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xaw.clear();
        this.wFk.clear();
        this.xaB.clear();
        this.wFp.clear();
        this.xbc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xam == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ObjectDesc");
          AppMethodBeat.o(94596);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94596);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cbq localcbq = (cbq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94596);
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
            localcbq.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xam = paramArrayOfObject;
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 3:
          localcbq.xav = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
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
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xaw.add(localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 5:
          localcbq.xaU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 6:
          localcbq.wFe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 7:
          localcbq.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 8:
          localcbq.xaV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 9:
          localcbq.wHG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cba();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cba)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.wFk.add(localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 11:
          localcbq.xaW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 12:
          localcbq.xaz = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 13:
          localcbq.xaA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xaB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new civ();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.wNQ = paramArrayOfObject;
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 16:
          localcbq.xaC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.wFp.add(localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 18:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xaX = paramArrayOfObject;
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 19:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cbp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.wFq = ((cbp)localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cbu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xaE = ((cbu)localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 21:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xaY = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 22:
          localcbq.xaZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 23:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xba = paramArrayOfObject;
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 24:
          localcbq.xbb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 25:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bas();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bas)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xbc.add(localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 26:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cap();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.xbd = paramArrayOfObject;
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        case 27:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbq.vIl = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94596);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94596);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbq
 * JD-Core Version:    0.6.2
 */