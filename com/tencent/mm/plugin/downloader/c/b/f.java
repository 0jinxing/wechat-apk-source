package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class f extends com.tencent.mm.bt.a
{
  public b kLn;
  public i kLo;
  public boolean kLp;
  public int kLq;
  public boolean kLr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35532);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kLn != null)
      {
        paramArrayOfObject.iy(1, this.kLn.computeSize());
        this.kLn.writeFields(paramArrayOfObject);
      }
      if (this.kLo != null)
      {
        paramArrayOfObject.iy(2, this.kLo.computeSize());
        this.kLo.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(3, this.kLp);
      paramArrayOfObject.iz(4, this.kLq);
      paramArrayOfObject.aO(5, this.kLr);
      AppMethodBeat.o(35532);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kLn == null)
        break label616;
    label616: for (paramInt = e.a.a.a.ix(1, this.kLn.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kLo != null)
        i = paramInt + e.a.a.a.ix(2, this.kLo.computeSize());
      paramInt = i + (e.a.a.b.b.a.fv(3) + 1) + e.a.a.b.b.a.bs(4, this.kLq) + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(35532);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35532);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        f localf = (f)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35532);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new b();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((b)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localf.kLn = ((b)localObject1);
          }
          AppMethodBeat.o(35532);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new i();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localf.kLo = paramArrayOfObject;
          }
          AppMethodBeat.o(35532);
          paramInt = i;
          break;
        case 3:
          localf.kLp = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(35532);
          paramInt = i;
          break;
        case 4:
          localf.kLq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(35532);
          paramInt = i;
          break;
        case 5:
          localf.kLr = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(35532);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35532);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.f
 * JD-Core Version:    0.6.2
 */