package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class k extends i
{
  public com.tencent.mm.bt.b jBi;
  public int jCt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(19426);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBi == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Data");
        AppMethodBeat.o(19426);
        throw paramArrayOfObject;
      }
      if (this.lvj != null)
      {
        paramArrayOfObject.iy(1, this.lvj.computeSize());
        this.lvj.writeFields(paramArrayOfObject);
      }
      if (this.jBi != null)
        paramArrayOfObject.c(2, this.jBi);
      paramArrayOfObject.iz(3, this.jCt);
      AppMethodBeat.o(19426);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lvj == null)
        break label495;
    label495: for (paramInt = e.a.a.a.ix(1, this.lvj.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBi != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.jBi);
      paramInt = i + e.a.a.b.b.a.bs(3, this.jCt);
      AppMethodBeat.o(19426);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = i.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = i.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBi == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Data");
          AppMethodBeat.o(19426);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(19426);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(19426);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, i.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localk.lvj = ((d)localObject1);
          }
          AppMethodBeat.o(19426);
          paramInt = i;
          break;
        case 2:
          localk.jBi = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19426);
          paramInt = i;
          break;
        case 3:
          localk.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19426);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(19426);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.k
 * JD-Core Version:    0.6.2
 */