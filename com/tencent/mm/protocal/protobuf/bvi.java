package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bvi extends com.tencent.mm.bt.a
{
  public int Scene;
  public String luQ;
  public axy wDI;
  public String wWv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124357);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wWv != null)
        paramArrayOfObject.e(1, this.wWv);
      paramArrayOfObject.iz(2, this.Scene);
      if (this.luQ != null)
        paramArrayOfObject.e(3, this.luQ);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(4, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(124357);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wWv == null)
        break label501;
    label501: for (paramInt = e.a.a.b.b.a.f(1, this.wWv) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.Scene);
      paramInt = i;
      if (this.luQ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.luQ);
      i = paramInt;
      if (this.wDI != null)
        i = paramInt + e.a.a.a.ix(4, this.wDI.computeSize());
      AppMethodBeat.o(124357);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124357);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvi localbvi = (bvi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124357);
          break;
        case 1:
          localbvi.wWv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124357);
          paramInt = i;
          break;
        case 2:
          localbvi.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124357);
          paramInt = i;
          break;
        case 3:
          localbvi.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124357);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((axy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvi.wDI = ((axy)localObject1);
          }
          AppMethodBeat.o(124357);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124357);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvi
 * JD-Core Version:    0.6.2
 */