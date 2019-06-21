package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class d extends com.tencent.mm.bt.a
{
  public String ID;
  public h jBj;
  public int jBk;
  public int jBl;
  public int jBm;
  public int jBn;
  public int jBo;
  public int jBp;
  public int jBq;
  public int jBr;
  public int jBs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18047);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ID");
        AppMethodBeat.o(18047);
        throw paramArrayOfObject;
      }
      if (this.ID != null)
        paramArrayOfObject.e(1, this.ID);
      if (this.jBj != null)
      {
        paramArrayOfObject.iy(2, this.jBj.computeSize());
        this.jBj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.jBk);
      paramArrayOfObject.iz(4, this.jBl);
      paramArrayOfObject.iz(5, this.jBm);
      paramArrayOfObject.iz(6, this.jBn);
      paramArrayOfObject.iz(7, this.jBo);
      paramArrayOfObject.iz(8, this.jBp);
      paramArrayOfObject.iz(9, this.jBq);
      paramArrayOfObject.iz(10, this.jBr);
      paramArrayOfObject.iz(11, this.jBs);
      AppMethodBeat.o(18047);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ID == null)
        break label874;
    label874: for (paramInt = e.a.a.b.b.a.f(1, this.ID) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBj != null)
        i = paramInt + e.a.a.a.ix(2, this.jBj.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.jBk) + e.a.a.b.b.a.bs(4, this.jBl) + e.a.a.b.b.a.bs(5, this.jBm) + e.a.a.b.b.a.bs(6, this.jBn) + e.a.a.b.b.a.bs(7, this.jBo) + e.a.a.b.b.a.bs(8, this.jBp) + e.a.a.b.b.a.bs(9, this.jBq) + e.a.a.b.b.a.bs(10, this.jBr) + e.a.a.b.b.a.bs(11, this.jBs);
      AppMethodBeat.o(18047);
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
          AppMethodBeat.o(18047);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18047);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18047);
          break;
        case 1:
          locald.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new h();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.jBj = paramArrayOfObject;
          }
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 3:
          locald.jBk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 4:
          locald.jBl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 5:
          locald.jBm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 6:
          locald.jBn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 7:
          locald.jBo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 8:
          locald.jBp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 9:
          locald.jBq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 10:
          locald.jBr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        case 11:
          locald.jBs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18047);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18047);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.d
 * JD-Core Version:    0.6.2
 */