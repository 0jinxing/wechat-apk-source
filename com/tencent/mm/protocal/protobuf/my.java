package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class my extends bsr
{
  public int Scene;
  public String fKh;
  public String ndF;
  public String ndG;
  public String vCs;
  public String vCt;
  public String vCu;
  public String vEG;
  public int vFH;
  public String vRl;
  public int vRm;
  public int vRn;
  public SKBuiltinBuffer_t vRo;
  public float vRp;
  public float vRq;
  public String vRr;
  public int vRs;
  public int vRt;
  public int vRu;
  public int vRv;
  public String vRw;
  public int vRx;
  public int vRy;
  public int vRz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80031);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vRl != null)
        paramArrayOfObject.e(1, this.vRl);
      if (this.ndG != null)
        paramArrayOfObject.e(2, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      paramArrayOfObject.iz(4, this.vRm);
      paramArrayOfObject.iz(5, this.vRn);
      if (this.vEG != null)
        paramArrayOfObject.e(6, this.vEG);
      if (this.vRo != null)
      {
        paramArrayOfObject.iy(7, this.vRo.computeSize());
        this.vRo.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.Scene);
      paramArrayOfObject.r(9, this.vRp);
      paramArrayOfObject.r(10, this.vRq);
      if (this.vRr != null)
        paramArrayOfObject.e(11, this.vRr);
      paramArrayOfObject.iz(12, this.vRs);
      paramArrayOfObject.iz(13, this.vRt);
      paramArrayOfObject.iz(14, this.vRu);
      paramArrayOfObject.iz(15, this.vRv);
      if (this.vRw != null)
        paramArrayOfObject.e(16, this.vRw);
      paramArrayOfObject.iz(17, this.vRx);
      paramArrayOfObject.iz(18, this.vRy);
      paramArrayOfObject.iz(19, this.vRz);
      paramArrayOfObject.iz(20, this.vFH);
      if (this.fKh != null)
        paramArrayOfObject.e(21, this.fKh);
      if (this.vCu != null)
        paramArrayOfObject.e(22, this.vCu);
      if (this.vCt != null)
        paramArrayOfObject.e(23, this.vCt);
      if (this.vCs != null)
        paramArrayOfObject.e(24, this.vCs);
      AppMethodBeat.o(80031);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vRl == null)
        break label1591;
    label1591: for (i = e.a.a.b.b.a.f(1, this.vRl) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndF);
      i = i + e.a.a.b.b.a.bs(4, this.vRm) + e.a.a.b.b.a.bs(5, this.vRn);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vEG);
      i = paramInt;
      if (this.vRo != null)
        i = paramInt + e.a.a.a.ix(7, this.vRo.computeSize());
      i = i + e.a.a.b.b.a.bs(8, this.Scene) + (e.a.a.b.b.a.fv(9) + 4) + (e.a.a.b.b.a.fv(10) + 4);
      paramInt = i;
      if (this.vRr != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vRr);
      i = paramInt + e.a.a.b.b.a.bs(12, this.vRs) + e.a.a.b.b.a.bs(13, this.vRt) + e.a.a.b.b.a.bs(14, this.vRu) + e.a.a.b.b.a.bs(15, this.vRv);
      paramInt = i;
      if (this.vRw != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vRw);
      i = paramInt + e.a.a.b.b.a.bs(17, this.vRx) + e.a.a.b.b.a.bs(18, this.vRy) + e.a.a.b.b.a.bs(19, this.vRz) + e.a.a.b.b.a.bs(20, this.vFH);
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.fKh);
      i = paramInt;
      if (this.vCu != null)
        i = paramInt + e.a.a.b.b.a.f(22, this.vCu);
      paramInt = i;
      if (this.vCt != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.vCt);
      i = paramInt;
      if (this.vCs != null)
        i = paramInt + e.a.a.b.b.a.f(24, this.vCs);
      AppMethodBeat.o(80031);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80031);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        my localmy = (my)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80031);
          break;
        case 1:
          localmy.vRl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 2:
          localmy.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 3:
          localmy.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 4:
          localmy.vRm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 5:
          localmy.vRn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 6:
          localmy.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmy.vRo = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 8:
          localmy.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 9:
          localmy.vRp = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 10:
          localmy.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 11:
          localmy.vRr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 12:
          localmy.vRs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 13:
          localmy.vRt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 14:
          localmy.vRu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 15:
          localmy.vRv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 16:
          localmy.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 17:
          localmy.vRx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 18:
          localmy.vRy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 19:
          localmy.vRz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 20:
          localmy.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 21:
          localmy.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 22:
          localmy.vCu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 23:
          localmy.vCt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        case 24:
          localmy.vCs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80031);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80031);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.my
 * JD-Core Version:    0.6.2
 */