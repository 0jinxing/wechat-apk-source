package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class atb extends com.tencent.mm.bt.a
{
  public int cuu;
  public String materialId;
  public String wwP;
  public atc wwQ;
  public String wwR;
  public int wwS;
  public int wwT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56843);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wwP != null)
        paramArrayOfObject.e(1, this.wwP);
      paramArrayOfObject.iz(2, this.cuu);
      if (this.materialId != null)
        paramArrayOfObject.e(3, this.materialId);
      if (this.wwQ != null)
      {
        paramArrayOfObject.iy(4, this.wwQ.computeSize());
        this.wwQ.writeFields(paramArrayOfObject);
      }
      if (this.wwR != null)
        paramArrayOfObject.e(5, this.wwR);
      paramArrayOfObject.iz(6, this.wwS);
      paramArrayOfObject.iz(7, this.wwT);
      AppMethodBeat.o(56843);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wwP == null)
        break label657;
    label657: for (paramInt = e.a.a.b.b.a.f(1, this.wwP) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.cuu);
      i = paramInt;
      if (this.materialId != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.materialId);
      paramInt = i;
      if (this.wwQ != null)
        paramInt = i + e.a.a.a.ix(4, this.wwQ.computeSize());
      i = paramInt;
      if (this.wwR != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wwR);
      paramInt = i + e.a.a.b.b.a.bs(6, this.wwS) + e.a.a.b.b.a.bs(7, this.wwT);
      AppMethodBeat.o(56843);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56843);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        atb localatb = (atb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56843);
          break;
        case 1:
          localatb.wwP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        case 2:
          localatb.cuu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        case 3:
          localatb.materialId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new atc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatb.wwQ = paramArrayOfObject;
          }
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        case 5:
          localatb.wwR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        case 6:
          localatb.wwS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        case 7:
          localatb.wwT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56843);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56843);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atb
 * JD-Core Version:    0.6.2
 */