package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ag extends com.tencent.mm.bt.a
{
  public int vBo;
  public int vBp;
  public int vBq;
  public LinkedList<ae> vBr;
  public int vBs;
  public LinkedList<ae> vBt;

  public ag()
  {
    AppMethodBeat.i(72839);
    this.vBr = new LinkedList();
    this.vBt = new LinkedList();
    AppMethodBeat.o(72839);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72840);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vBo);
      paramArrayOfObject.iz(2, this.vBq);
      paramArrayOfObject.e(3, 8, this.vBr);
      paramArrayOfObject.iz(4, this.vBp);
      paramArrayOfObject.iz(5, this.vBs);
      paramArrayOfObject.e(6, 8, this.vBt);
      AppMethodBeat.o(72840);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vBo) + 0 + e.a.a.b.b.a.bs(2, this.vBq) + e.a.a.a.c(3, 8, this.vBr) + e.a.a.b.b.a.bs(4, this.vBp) + e.a.a.b.b.a.bs(5, this.vBs) + e.a.a.a.c(6, 8, this.vBt);
        AppMethodBeat.o(72840);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vBr.clear();
        this.vBt.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72840);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ag localag = (ag)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int i;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72840);
          break;
        case 1:
          localag.vBo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72840);
          paramInt = 0;
          break;
        case 2:
          localag.vBq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72840);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ae();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localag.vBr.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72840);
          paramInt = 0;
          break;
        case 4:
          localag.vBp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72840);
          paramInt = 0;
          break;
        case 5:
          localag.vBs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72840);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ae();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ae)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localag.vBt.add(localObject1);
          }
          AppMethodBeat.o(72840);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72840);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ag
 * JD-Core Version:    0.6.2
 */