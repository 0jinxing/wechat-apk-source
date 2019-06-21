package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class np extends com.tencent.mm.bt.a
{
  public String vSs;
  public String vSt;
  public String vSu;
  public int vSv;
  public ny vSw;
  public int vSx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89021);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vSs != null)
        paramArrayOfObject.e(1, this.vSs);
      if (this.vSt != null)
        paramArrayOfObject.e(2, this.vSt);
      if (this.vSu != null)
        paramArrayOfObject.e(3, this.vSu);
      paramArrayOfObject.iz(4, this.vSv);
      if (this.vSw != null)
      {
        paramArrayOfObject.iy(5, this.vSw.computeSize());
        this.vSw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vSx);
      AppMethodBeat.o(89021);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vSs == null)
        break label611;
    label611: for (i = e.a.a.b.b.a.f(1, this.vSs) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vSt != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vSt);
      i = paramInt;
      if (this.vSu != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vSu);
      i += e.a.a.b.b.a.bs(4, this.vSv);
      paramInt = i;
      if (this.vSw != null)
        paramInt = i + e.a.a.a.ix(5, this.vSw.computeSize());
      paramInt += e.a.a.b.b.a.bs(6, this.vSx);
      AppMethodBeat.o(89021);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89021);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        np localnp = (np)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89021);
          break;
        case 1:
          localnp.vSs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89021);
          paramInt = i;
          break;
        case 2:
          localnp.vSt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89021);
          paramInt = i;
          break;
        case 3:
          localnp.vSu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89021);
          paramInt = i;
          break;
        case 4:
          localnp.vSv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89021);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ny)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localnp.vSw = ((ny)localObject1);
          }
          AppMethodBeat.o(89021);
          paramInt = i;
          break;
        case 6:
          localnp.vSx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89021);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89021);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.np
 * JD-Core Version:    0.6.2
 */