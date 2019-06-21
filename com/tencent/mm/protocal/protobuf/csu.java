package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class csu extends bsr
{
  public int jCt;
  public int vOq;
  public String vQg;
  public int wCu;
  public int wCv = 2;
  public double wCw;
  public double wCx;
  public String wCy;
  public int wOI;
  public String wol;
  public String xqb;
  public String xqc;
  public String xqd;
  public int xqe;
  public String xqf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93809);
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
      paramArrayOfObject.iz(9, this.jCt);
      paramArrayOfObject.iz(10, this.wOI);
      if (this.wCy != null)
        paramArrayOfObject.e(99, this.wCy);
      if (this.xqb != null)
        paramArrayOfObject.e(100, this.xqb);
      if (this.xqc != null)
        paramArrayOfObject.e(101, this.xqc);
      if (this.xqd != null)
        paramArrayOfObject.e(102, this.xqd);
      paramArrayOfObject.iz(103, this.xqe);
      if (this.xqf != null)
        paramArrayOfObject.e(104, this.xqf);
      AppMethodBeat.o(93809);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1218;
    label1218: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wol != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wol);
      i = i + e.a.a.b.b.a.bs(3, this.vOq) + e.a.a.b.b.a.bs(4, this.wCu);
      paramInt = i;
      if (this.vQg != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vQg);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wCv) + (e.a.a.b.b.a.fv(7) + 8) + (e.a.a.b.b.a.fv(8) + 8) + e.a.a.b.b.a.bs(9, this.jCt) + e.a.a.b.b.a.bs(10, this.wOI);
      paramInt = i;
      if (this.wCy != null)
        paramInt = i + e.a.a.b.b.a.f(99, this.wCy);
      i = paramInt;
      if (this.xqb != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.xqb);
      paramInt = i;
      if (this.xqc != null)
        paramInt = i + e.a.a.b.b.a.f(101, this.xqc);
      i = paramInt;
      if (this.xqd != null)
        i = paramInt + e.a.a.b.b.a.f(102, this.xqd);
      i += e.a.a.b.b.a.bs(103, this.xqe);
      paramInt = i;
      if (this.xqf != null)
        paramInt = i + e.a.a.b.b.a.f(104, this.xqf);
      AppMethodBeat.o(93809);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93809);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        csu localcsu = (csu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93809);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcsu.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 2:
          localcsu.wol = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 3:
          localcsu.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 4:
          localcsu.wCu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 5:
          localcsu.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 6:
          localcsu.wCv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 7:
          localcsu.wCw = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 8:
          localcsu.wCx = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 9:
          localcsu.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 10:
          localcsu.wOI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 99:
          localcsu.wCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 100:
          localcsu.xqb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 101:
          localcsu.xqc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 102:
          localcsu.xqd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 103:
          localcsu.xqe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        case 104:
          localcsu.xqf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93809);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93809);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csu
 * JD-Core Version:    0.6.2
 */