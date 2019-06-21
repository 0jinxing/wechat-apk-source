package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class r extends com.tencent.mm.bt.a
{
  public String ID;
  public long jBS;
  public int jBV;
  public int jBW;
  public int jBX;
  public long jBY;
  public long jBZ;
  public LinkedList<t> jCk;
  public LinkedList<t> jCl;

  public r()
  {
    AppMethodBeat.i(18065);
    this.jCk = new LinkedList();
    this.jCl = new LinkedList();
    AppMethodBeat.o(18065);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18066);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ID");
        AppMethodBeat.o(18066);
        throw paramArrayOfObject;
      }
      if (this.ID != null)
        paramArrayOfObject.e(1, this.ID);
      paramArrayOfObject.iz(2, this.jBV);
      paramArrayOfObject.iz(3, this.jBW);
      paramArrayOfObject.iz(4, this.jBX);
      paramArrayOfObject.ai(5, this.jBS);
      paramArrayOfObject.ai(6, this.jBY);
      paramArrayOfObject.ai(7, this.jBZ);
      paramArrayOfObject.e(8, 8, this.jCk);
      paramArrayOfObject.e(9, 8, this.jCl);
      AppMethodBeat.o(18066);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ID == null)
        break label859;
    label859: for (paramInt = e.a.a.b.b.a.f(1, this.ID) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jBV) + e.a.a.b.b.a.bs(3, this.jBW) + e.a.a.b.b.a.bs(4, this.jBX) + e.a.a.b.b.a.o(5, this.jBS) + e.a.a.b.b.a.o(6, this.jBY) + e.a.a.b.b.a.o(7, this.jBZ) + e.a.a.a.c(8, 8, this.jCk) + e.a.a.a.c(9, 8, this.jCl);
      AppMethodBeat.o(18066);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jCk.clear();
        this.jCl.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ID");
          AppMethodBeat.o(18066);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18066);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        r localr = (r)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18066);
          break;
        case 1:
          localr.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 2:
          localr.jBV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 3:
          localr.jBW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 4:
          localr.jBX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 5:
          localr.jBS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 6:
          localr.jBY = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 7:
          localr.jBZ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localr.jCk.add(paramArrayOfObject);
          }
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localr.jCl.add(localObject1);
          }
          AppMethodBeat.o(18066);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18066);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.r
 * JD-Core Version:    0.6.2
 */