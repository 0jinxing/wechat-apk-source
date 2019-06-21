package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cel extends com.tencent.mm.bt.a
{
  public String cvZ;
  public int eRu;
  public String ptv;
  public int wFD;
  public long wFi;
  public int wFm;
  public int xei;
  public cej xej;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56528);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptv != null)
        paramArrayOfObject.e(1, this.ptv);
      paramArrayOfObject.iz(2, this.eRu);
      paramArrayOfObject.ai(3, this.wFi);
      paramArrayOfObject.iz(4, this.wFm);
      if (this.cvZ != null)
        paramArrayOfObject.e(5, this.cvZ);
      paramArrayOfObject.iz(6, this.wFD);
      paramArrayOfObject.iz(7, this.xei);
      if (this.xej != null)
      {
        paramArrayOfObject.iy(8, this.xej.computeSize());
        this.xej.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56528);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ptv == null)
        break label685;
    label685: for (paramInt = e.a.a.b.b.a.f(1, this.ptv) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.eRu) + e.a.a.b.b.a.o(3, this.wFi) + e.a.a.b.b.a.bs(4, this.wFm);
      paramInt = i;
      if (this.cvZ != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cvZ);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wFD) + e.a.a.b.b.a.bs(7, this.xei);
      paramInt = i;
      if (this.xej != null)
        paramInt = i + e.a.a.a.ix(8, this.xej.computeSize());
      AppMethodBeat.o(56528);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56528);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cel localcel = (cel)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56528);
          break;
        case 1:
          localcel.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 2:
          localcel.eRu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 3:
          localcel.wFi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 4:
          localcel.wFm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 5:
          localcel.cvZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 6:
          localcel.wFD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 7:
          localcel.xei = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cej();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cej)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcel.xej = ((cej)localObject1);
          }
          AppMethodBeat.o(56528);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56528);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cel
 * JD-Core Version:    0.6.2
 */