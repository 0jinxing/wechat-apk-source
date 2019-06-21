package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class can extends com.tencent.mm.bt.a
{
  public int jCt;
  public String ncM;
  public int pcX;
  public int vFH;
  public brf vFa;
  public String wPm;
  public String wZD;
  public String wZE;
  public int wZF;
  public int wZG;
  public int wZH;
  public long wZI;
  public long wZJ;
  public SKBuiltinBuffer_t wZK;
  public int wZL;
  public String wel;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94563);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wPm != null)
        paramArrayOfObject.e(1, this.wPm);
      if (this.wel != null)
        paramArrayOfObject.e(2, this.wel);
      if (this.wZD != null)
        paramArrayOfObject.e(3, this.wZD);
      if (this.wZE != null)
        paramArrayOfObject.e(4, this.wZE);
      paramArrayOfObject.iz(5, this.jCt);
      paramArrayOfObject.iz(6, this.vFH);
      paramArrayOfObject.iz(7, this.pcX);
      if (this.ncM != null)
        paramArrayOfObject.e(8, this.ncM);
      paramArrayOfObject.iz(9, this.wZF);
      paramArrayOfObject.iz(10, this.wZG);
      paramArrayOfObject.iz(11, this.wZH);
      paramArrayOfObject.ai(12, this.wZI);
      paramArrayOfObject.ai(13, this.wZJ);
      if (this.wZK != null)
      {
        paramArrayOfObject.iy(14, this.wZK.computeSize());
        this.wZK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(15, this.wZL);
      if (this.vFa != null)
      {
        paramArrayOfObject.iy(16, this.vFa.computeSize());
        this.vFa.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94563);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wPm == null)
        break label1228;
    label1228: for (i = e.a.a.b.b.a.f(1, this.wPm) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wel != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wel);
      i = paramInt;
      if (this.wZD != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wZD);
      paramInt = i;
      if (this.wZE != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wZE);
      i = paramInt + e.a.a.b.b.a.bs(5, this.jCt) + e.a.a.b.b.a.bs(6, this.vFH) + e.a.a.b.b.a.bs(7, this.pcX);
      paramInt = i;
      if (this.ncM != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.ncM);
      i = paramInt + e.a.a.b.b.a.bs(9, this.wZF) + e.a.a.b.b.a.bs(10, this.wZG) + e.a.a.b.b.a.bs(11, this.wZH) + e.a.a.b.b.a.o(12, this.wZI) + e.a.a.b.b.a.o(13, this.wZJ);
      paramInt = i;
      if (this.wZK != null)
        paramInt = i + e.a.a.a.ix(14, this.wZK.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(15, this.wZL);
      paramInt = i;
      if (this.vFa != null)
        paramInt = i + e.a.a.a.ix(16, this.vFa.computeSize());
      AppMethodBeat.o(94563);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94563);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        can localcan = (can)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94563);
          break;
        case 1:
          localcan.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 2:
          localcan.wel = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 3:
          localcan.wZD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 4:
          localcan.wZE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 5:
          localcan.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 6:
          localcan.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 7:
          localcan.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 8:
          localcan.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 9:
          localcan.wZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 10:
          localcan.wZG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 11:
          localcan.wZH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 12:
          localcan.wZI = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 13:
          localcan.wZJ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 14:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcan.wZK = paramArrayOfObject;
          }
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 15:
          localcan.wZL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        case 16:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new brf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcan.vFa = paramArrayOfObject;
          }
          AppMethodBeat.o(94563);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94563);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.can
 * JD-Core Version:    0.6.2
 */