package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class mo extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b vQB;
  public com.tencent.mm.bt.b vQC;
  public LinkedList<bxh> vQD;

  public mo()
  {
    AppMethodBeat.i(124301);
    this.vQD = new LinkedList();
    AppMethodBeat.o(124301);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124302);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vQB == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Title");
        AppMethodBeat.o(124302);
        throw paramArrayOfObject;
      }
      if (this.vQC == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: ServiceUrl");
        AppMethodBeat.o(124302);
        throw paramArrayOfObject;
      }
      if (this.vQB != null)
        paramArrayOfObject.c(1, this.vQB);
      if (this.vQC != null)
        paramArrayOfObject.c(2, this.vQC);
      paramArrayOfObject.e(3, 8, this.vQD);
      AppMethodBeat.o(124302);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vQB == null)
        break label534;
    label534: for (paramInt = e.a.a.b.b.a.b(1, this.vQB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vQC != null)
        i = paramInt + e.a.a.b.b.a.b(2, this.vQC);
      paramInt = i + e.a.a.a.c(3, 8, this.vQD);
      AppMethodBeat.o(124302);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vQD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vQB == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Title");
          AppMethodBeat.o(124302);
          throw paramArrayOfObject;
        }
        if (this.vQC == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: ServiceUrl");
          AppMethodBeat.o(124302);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124302);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mo localmo = (mo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124302);
          break;
        case 1:
          localmo.vQB = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124302);
          paramInt = i;
          break;
        case 2:
          localmo.vQC = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124302);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bxh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bxh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmo.vQD.add(localObject1);
          }
          AppMethodBeat.o(124302);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124302);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mo
 * JD-Core Version:    0.6.2
 */