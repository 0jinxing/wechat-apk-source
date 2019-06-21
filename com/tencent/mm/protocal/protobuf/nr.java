package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nr extends com.tencent.mm.bt.a
{
  public String vSL;
  public String vSM;
  public String vSN;
  public int vSO;
  public ny vSP;
  public int vSQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89024);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vSL != null)
        paramArrayOfObject.e(1, this.vSL);
      if (this.vSM != null)
        paramArrayOfObject.e(2, this.vSM);
      if (this.vSN != null)
        paramArrayOfObject.e(3, this.vSN);
      paramArrayOfObject.iz(4, this.vSO);
      if (this.vSP != null)
      {
        paramArrayOfObject.iy(5, this.vSP.computeSize());
        this.vSP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vSQ);
      AppMethodBeat.o(89024);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vSL == null)
        break label611;
    label611: for (i = e.a.a.b.b.a.f(1, this.vSL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vSM != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vSM);
      i = paramInt;
      if (this.vSN != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vSN);
      i += e.a.a.b.b.a.bs(4, this.vSO);
      paramInt = i;
      if (this.vSP != null)
        paramInt = i + e.a.a.a.ix(5, this.vSP.computeSize());
      paramInt += e.a.a.b.b.a.bs(6, this.vSQ);
      AppMethodBeat.o(89024);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89024);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        nr localnr = (nr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89024);
          break;
        case 1:
          localnr.vSL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89024);
          paramInt = i;
          break;
        case 2:
          localnr.vSM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89024);
          paramInt = i;
          break;
        case 3:
          localnr.vSN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89024);
          paramInt = i;
          break;
        case 4:
          localnr.vSO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89024);
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
            localnr.vSP = ((ny)localObject1);
          }
          AppMethodBeat.o(89024);
          paramInt = i;
          break;
        case 6:
          localnr.vSQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89024);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89024);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nr
 * JD-Core Version:    0.6.2
 */