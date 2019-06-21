package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class td extends com.tencent.mm.bt.a
{
  public String wav;
  public String waw;
  public LinkedList<bbg> wax;

  public td()
  {
    AppMethodBeat.i(2538);
    this.wax = new LinkedList();
    AppMethodBeat.o(2538);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2539);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wav != null)
        paramArrayOfObject.e(1, this.wav);
      if (this.waw != null)
        paramArrayOfObject.e(2, this.waw);
      paramArrayOfObject.e(3, 8, this.wax);
      AppMethodBeat.o(2539);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wav == null)
        break label446;
    label446: for (paramInt = e.a.a.b.b.a.f(1, this.wav) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.waw != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.waw);
      paramInt = i + e.a.a.a.c(3, 8, this.wax);
      AppMethodBeat.o(2539);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wax.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2539);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        td localtd = (td)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2539);
          break;
        case 1:
          localtd.wav = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2539);
          paramInt = i;
          break;
        case 2:
          localtd.waw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2539);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bbg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localtd.wax.add(paramArrayOfObject);
          }
          AppMethodBeat.o(2539);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(2539);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.td
 * JD-Core Version:    0.6.2
 */