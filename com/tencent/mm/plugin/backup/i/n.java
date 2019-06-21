package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class n extends com.tencent.mm.bt.a
{
  public String ID;
  public long jBL;
  public long jBM;
  public long jBN;
  public m jBO;
  public long jBP;
  public int jBQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18061);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ID");
        AppMethodBeat.o(18061);
        throw paramArrayOfObject;
      }
      if (this.ID != null)
        paramArrayOfObject.e(1, this.ID);
      paramArrayOfObject.ai(2, this.jBL);
      paramArrayOfObject.ai(3, this.jBM);
      paramArrayOfObject.ai(4, this.jBN);
      if (this.jBO != null)
      {
        paramArrayOfObject.iy(5, this.jBO.computeSize());
        this.jBO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.jBP);
      paramArrayOfObject.iz(7, this.jBQ);
      AppMethodBeat.o(18061);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ID == null)
        break label683;
    label683: for (paramInt = e.a.a.b.b.a.f(1, this.ID) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.jBL) + e.a.a.b.b.a.o(3, this.jBM) + e.a.a.b.b.a.o(4, this.jBN);
      paramInt = i;
      if (this.jBO != null)
        paramInt = i + e.a.a.a.ix(5, this.jBO.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.o(6, this.jBP) + e.a.a.b.b.a.bs(7, this.jBQ);
      AppMethodBeat.o(18061);
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
          AppMethodBeat.o(18061);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18061);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18061);
          break;
        case 1:
          localn.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        case 2:
          localn.jBL = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        case 3:
          localn.jBM = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        case 4:
          localn.jBN = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((m)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localn.jBO = ((m)localObject1);
          }
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        case 6:
          localn.jBP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        case 7:
          localn.jBQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18061);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18061);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.n
 * JD-Core Version:    0.6.2
 */