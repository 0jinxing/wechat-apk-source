package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class azx extends com.tencent.mm.bt.a
{
  public int Scene;
  public String luQ;
  public int wDH;
  public axy wDI;
  public int wDJ;
  public long wDK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124325);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Scene);
      paramArrayOfObject.iz(2, this.wDH);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(3, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wDJ);
      if (this.luQ != null)
        paramArrayOfObject.e(5, this.luQ);
      paramArrayOfObject.ai(6, this.wDK);
      AppMethodBeat.o(124325);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Scene) + 0 + e.a.a.b.b.a.bs(2, this.wDH);
        paramInt = i;
        if (this.wDI != null)
          paramInt = i + e.a.a.a.ix(3, this.wDI.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(4, this.wDJ);
        paramInt = i;
        if (this.luQ != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.luQ);
        paramInt += e.a.a.b.b.a.o(6, this.wDK);
        AppMethodBeat.o(124325);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124325);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        azx localazx = (azx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124325);
          break;
        case 1:
          localazx.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124325);
          paramInt = 0;
          break;
        case 2:
          localazx.wDH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124325);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((axy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localazx.wDI = ((axy)localObject1);
          }
          AppMethodBeat.o(124325);
          paramInt = 0;
          break;
        case 4:
          localazx.wDJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124325);
          paramInt = 0;
          break;
        case 5:
          localazx.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124325);
          paramInt = 0;
          break;
        case 6:
          localazx.wDK = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124325);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124325);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azx
 * JD-Core Version:    0.6.2
 */