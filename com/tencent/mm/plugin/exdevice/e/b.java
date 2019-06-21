package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends j
{
  public com.tencent.mm.bt.b luR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(19419);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lvk == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(19419);
        throw paramArrayOfObject;
      }
      if (this.luR == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: AesSessionKey");
        AppMethodBeat.o(19419);
        throw paramArrayOfObject;
      }
      if (this.lvk != null)
      {
        paramArrayOfObject.iy(1, this.lvk.computeSize());
        this.lvk.writeFields(paramArrayOfObject);
      }
      if (this.luR != null)
        paramArrayOfObject.c(2, this.luR);
      AppMethodBeat.o(19419);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lvk == null)
        break label495;
    label495: for (i = e.a.a.a.ix(1, this.lvk.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.luR != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.luR);
      AppMethodBeat.o(19419);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = j.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = j.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.lvk == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(19419);
          throw paramArrayOfObject;
        }
        if (this.luR == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: AesSessionKey");
          AppMethodBeat.o(19419);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(19419);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(19419);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, j.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.lvk = ((e)localObject1);
          }
          AppMethodBeat.o(19419);
          paramInt = i;
          break;
        case 2:
          localb.luR = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(19419);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(19419);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.b
 * JD-Core Version:    0.6.2
 */