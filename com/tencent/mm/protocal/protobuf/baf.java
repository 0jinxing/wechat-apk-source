package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class baf extends bsr
{
  public String guQ;
  public String jBF;
  public String luP;
  public String luQ;
  public int nbj;
  public String nqc;
  public int vAM;
  public hh vIg;
  public String vIh;
  public int vIi;
  public String vIj;
  public String vIk;
  public SKBuiltinBuffer_t vIl;
  public String vOA;
  public String vOz;
  public String wDX;
  public String wDY;
  public String wDZ;
  public int wEa;
  public String wdz;
  public String wlq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58912);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vIg != null)
      {
        paramArrayOfObject.iy(2, this.vIg.computeSize());
        this.vIg.writeFields(paramArrayOfObject);
      }
      if (this.nqc != null)
        paramArrayOfObject.e(3, this.nqc);
      if (this.vIh != null)
        paramArrayOfObject.e(4, this.vIh);
      paramArrayOfObject.iz(5, this.vIi);
      if (this.vIj != null)
        paramArrayOfObject.e(6, this.vIj);
      if (this.guQ != null)
        paramArrayOfObject.e(7, this.guQ);
      if (this.jBF != null)
        paramArrayOfObject.e(8, this.jBF);
      if (this.vIk != null)
        paramArrayOfObject.e(9, this.vIk);
      if (this.luQ != null)
        paramArrayOfObject.e(10, this.luQ);
      if (this.luP != null)
        paramArrayOfObject.e(11, this.luP);
      paramArrayOfObject.iz(13, this.vAM);
      paramArrayOfObject.iz(14, this.nbj);
      if (this.vOA != null)
        paramArrayOfObject.e(15, this.vOA);
      if (this.vOz != null)
        paramArrayOfObject.e(16, this.vOz);
      if (this.wDX != null)
        paramArrayOfObject.e(17, this.wDX);
      if (this.wdz != null)
        paramArrayOfObject.e(18, this.wdz);
      if (this.wlq != null)
        paramArrayOfObject.e(19, this.wlq);
      if (this.wDY != null)
        paramArrayOfObject.e(20, this.wDY);
      if (this.wDZ != null)
        paramArrayOfObject.e(21, this.wDZ);
      paramArrayOfObject.iz(22, this.wEa);
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(23, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58912);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1811;
    label1811: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIg != null)
        paramInt = i + e.a.a.a.ix(2, this.vIg.computeSize());
      i = paramInt;
      if (this.nqc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nqc);
      paramInt = i;
      if (this.vIh != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vIh);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vIi);
      paramInt = i;
      if (this.vIj != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vIj);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.guQ);
      paramInt = i;
      if (this.jBF != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.jBF);
      i = paramInt;
      if (this.vIk != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vIk);
      paramInt = i;
      if (this.luQ != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.luQ);
      i = paramInt;
      if (this.luP != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.luP);
      i = i + e.a.a.b.b.a.bs(13, this.vAM) + e.a.a.b.b.a.bs(14, this.nbj);
      paramInt = i;
      if (this.vOA != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.vOA);
      i = paramInt;
      if (this.vOz != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.vOz);
      paramInt = i;
      if (this.wDX != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wDX);
      int j = paramInt;
      if (this.wdz != null)
        j = paramInt + e.a.a.b.b.a.f(18, this.wdz);
      i = j;
      if (this.wlq != null)
        i = j + e.a.a.b.b.a.f(19, this.wlq);
      paramInt = i;
      if (this.wDY != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.wDY);
      i = paramInt;
      if (this.wDZ != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.wDZ);
      i += e.a.a.b.b.a.bs(22, this.wEa);
      paramInt = i;
      if (this.vIl != null)
        paramInt = i + e.a.a.a.ix(23, this.vIl.computeSize());
      AppMethodBeat.o(58912);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58912);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        baf localbaf = (baf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 12:
        default:
          paramInt = -1;
          AppMethodBeat.o(58912);
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
            localbaf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaf.vIg = ((hh)localObject1);
          }
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 3:
          localbaf.nqc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 4:
          localbaf.vIh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 5:
          localbaf.vIi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 6:
          localbaf.vIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 7:
          localbaf.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 8:
          localbaf.jBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 9:
          localbaf.vIk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 10:
          localbaf.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 11:
          localbaf.luP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 13:
          localbaf.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 14:
          localbaf.nbj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 15:
          localbaf.vOA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 16:
          localbaf.vOz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 17:
          localbaf.wDX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 18:
          localbaf.wdz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 19:
          localbaf.wlq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 20:
          localbaf.wDY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 21:
          localbaf.wDZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        case 22:
          localbaf.wEa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58912);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbaf.vIl = paramArrayOfObject;
          }
          AppMethodBeat.o(58912);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58912);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.baf
 * JD-Core Version:    0.6.2
 */