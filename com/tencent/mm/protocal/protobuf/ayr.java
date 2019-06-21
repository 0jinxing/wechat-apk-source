package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class ayr extends bsr
{
  public int vOq;
  public String vQg;
  public b wCA;
  public int wCu;
  public int wCv = 2;
  public double wCw;
  public double wCx;
  public String wCy;
  public b wCz;
  public String wol;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124321);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wol != null)
        paramArrayOfObject.e(2, this.wol);
      paramArrayOfObject.iz(3, this.vOq);
      paramArrayOfObject.iz(4, this.wCu);
      if (this.vQg != null)
        paramArrayOfObject.e(5, this.vQg);
      paramArrayOfObject.iz(6, this.wCv);
      paramArrayOfObject.f(7, this.wCw);
      paramArrayOfObject.f(8, this.wCx);
      if (this.wCy != null)
        paramArrayOfObject.e(9, this.wCy);
      if (this.wCz != null)
        paramArrayOfObject.c(11, this.wCz);
      if (this.wCA != null)
        paramArrayOfObject.c(12, this.wCA);
      AppMethodBeat.o(124321);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label888;
    label888: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wol != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wol);
      i = i + e.a.a.b.b.a.bs(3, this.vOq) + e.a.a.b.b.a.bs(4, this.wCu);
      paramInt = i;
      if (this.vQg != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vQg);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wCv) + (e.a.a.b.b.a.fv(7) + 8) + (e.a.a.b.b.a.fv(8) + 8);
      paramInt = i;
      if (this.wCy != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wCy);
      i = paramInt;
      if (this.wCz != null)
        i = paramInt + e.a.a.b.b.a.b(11, this.wCz);
      paramInt = i;
      if (this.wCA != null)
        paramInt = i + e.a.a.b.b.a.b(12, this.wCA);
      AppMethodBeat.o(124321);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124321);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ayr localayr = (ayr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 10:
        default:
          paramInt = -1;
          AppMethodBeat.o(124321);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayr.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 2:
          localayr.wol = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 3:
          localayr.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 4:
          localayr.wCu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 5:
          localayr.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 6:
          localayr.wCv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 7:
          localayr.wCw = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 8:
          localayr.wCx = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 9:
          localayr.wCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 11:
          localayr.wCz = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        case 12:
          localayr.wCA = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124321);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124321);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayr
 * JD-Core Version:    0.6.2
 */