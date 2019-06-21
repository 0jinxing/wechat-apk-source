package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class bqd extends com.tencent.mm.bt.a
{
  public String iAa;
  public String iAb;
  public String iAc;
  public int iAd;
  public String iAe;
  public String izZ;
  public String kLg;
  public double score;
  public int wSp;
  public String wSq;
  public String wSr;
  public String wSs;
  public String wSt;
  public String wSu;
  public ars wSv;
  public String wSw;
  public String wSx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(134439);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.iAd);
      paramArrayOfObject.iz(2, this.wSp);
      if (this.wSq != null)
        paramArrayOfObject.e(3, this.wSq);
      if (this.iAb != null)
        paramArrayOfObject.e(4, this.iAb);
      if (this.iAc != null)
        paramArrayOfObject.e(5, this.iAc);
      if (this.wSr != null)
        paramArrayOfObject.e(6, this.wSr);
      if (this.kLg != null)
        paramArrayOfObject.e(7, this.kLg);
      if (this.wSs != null)
        paramArrayOfObject.e(8, this.wSs);
      if (this.wSt != null)
        paramArrayOfObject.e(9, this.wSt);
      paramArrayOfObject.f(10, this.score);
      if (this.wSu != null)
        paramArrayOfObject.e(11, this.wSu);
      if (this.izZ != null)
        paramArrayOfObject.e(12, this.izZ);
      if (this.wSv != null)
      {
        paramArrayOfObject.iy(14, this.wSv.computeSize());
        this.wSv.writeFields(paramArrayOfObject);
      }
      if (this.iAa != null)
        paramArrayOfObject.e(15, this.iAa);
      if (this.wSw != null)
        paramArrayOfObject.e(16, this.wSw);
      if (this.wSx != null)
        paramArrayOfObject.e(17, this.wSx);
      if (this.iAe != null)
        paramArrayOfObject.e(18, this.iAe);
      AppMethodBeat.o(134439);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.iAd) + 0 + e.a.a.b.b.a.bs(2, this.wSp);
        paramInt = i;
        if (this.wSq != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.wSq);
        i = paramInt;
        if (this.iAb != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.iAb);
        paramInt = i;
        if (this.iAc != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.iAc);
        i = paramInt;
        if (this.wSr != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.wSr);
        paramInt = i;
        if (this.kLg != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.kLg);
        i = paramInt;
        if (this.wSs != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.wSs);
        paramInt = i;
        if (this.wSt != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.wSt);
        i = paramInt + (e.a.a.b.b.a.fv(10) + 8);
        paramInt = i;
        if (this.wSu != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.wSu);
        i = paramInt;
        if (this.izZ != null)
          i = paramInt + e.a.a.b.b.a.f(12, this.izZ);
        paramInt = i;
        if (this.wSv != null)
          paramInt = i + e.a.a.a.ix(14, this.wSv.computeSize());
        i = paramInt;
        if (this.iAa != null)
          i = paramInt + e.a.a.b.b.a.f(15, this.iAa);
        paramInt = i;
        if (this.wSw != null)
          paramInt = i + e.a.a.b.b.a.f(16, this.wSw);
        i = paramInt;
        if (this.wSx != null)
          i = paramInt + e.a.a.b.b.a.f(17, this.wSx);
        paramInt = i;
        if (this.iAe != null)
          paramInt = i + e.a.a.b.b.a.f(18, this.iAe);
        AppMethodBeat.o(134439);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134439);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqd localbqd = (bqd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 13:
        default:
          paramInt = -1;
          AppMethodBeat.o(134439);
          break;
        case 1:
          localbqd.iAd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 2:
          localbqd.wSp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 3:
          localbqd.wSq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 4:
          localbqd.iAb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 5:
          localbqd.iAc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 6:
          localbqd.wSr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 7:
          localbqd.kLg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 8:
          localbqd.wSs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 9:
          localbqd.wSt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 10:
          localbqd.score = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 11:
          localbqd.wSu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 12:
          localbqd.izZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ars();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ars)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqd.wSv = ((ars)localObject1);
          }
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 15:
          localbqd.iAa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 16:
          localbqd.wSw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 17:
          localbqd.wSx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        case 18:
          localbqd.iAe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134439);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(134439);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqd
 * JD-Core Version:    0.6.2
 */