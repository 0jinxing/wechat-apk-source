package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class o extends com.tencent.mm.bt.a
{
  public String ID;
  public long jBL;
  public m jBO;
  public int jBQ;
  public long jBR;
  public long jBS;
  public int jBT;
  public int jBU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18062);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ID");
        AppMethodBeat.o(18062);
        throw paramArrayOfObject;
      }
      if (this.ID != null)
        paramArrayOfObject.e(1, this.ID);
      paramArrayOfObject.ai(2, this.jBR);
      paramArrayOfObject.ai(3, this.jBS);
      paramArrayOfObject.iz(4, this.jBT);
      paramArrayOfObject.iz(5, this.jBU);
      paramArrayOfObject.ai(6, this.jBL);
      if (this.jBO != null)
      {
        paramArrayOfObject.iy(7, this.jBO.computeSize());
        this.jBO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.jBQ);
      AppMethodBeat.o(18062);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ID == null)
        break label730;
    label730: for (paramInt = e.a.a.b.b.a.f(1, this.ID) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.jBR) + e.a.a.b.b.a.o(3, this.jBS) + e.a.a.b.b.a.bs(4, this.jBT) + e.a.a.b.b.a.bs(5, this.jBU) + e.a.a.b.b.a.o(6, this.jBL);
      paramInt = i;
      if (this.jBO != null)
        paramInt = i + e.a.a.a.ix(7, this.jBO.computeSize());
      paramInt += e.a.a.b.b.a.bs(8, this.jBQ);
      AppMethodBeat.o(18062);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ID");
          AppMethodBeat.o(18062);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18062);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        o localo = (o)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18062);
          break;
        case 1:
          localo.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 2:
          localo.jBR = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 3:
          localo.jBS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 4:
          localo.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 5:
          localo.jBU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 6:
          localo.jBL = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localo.jBO = paramArrayOfObject;
          }
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        case 8:
          localo.jBQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18062);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18062);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.o
 * JD-Core Version:    0.6.2
 */