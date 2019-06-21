package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cir extends com.tencent.mm.bt.a
{
  public int Scene;
  public SKBuiltinBuffer_t wlw;
  public int xhA;
  public String xhB;
  public String xhC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28674);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xhA);
      if (this.xhB != null)
        paramArrayOfObject.e(2, this.xhB);
      if (this.xhC != null)
        paramArrayOfObject.e(3, this.xhC);
      paramArrayOfObject.iz(4, this.Scene);
      if (this.wlw != null)
      {
        paramArrayOfObject.iy(5, this.wlw.computeSize());
        this.wlw.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28674);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.xhA) + 0;
        paramInt = i;
        if (this.xhB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xhB);
        i = paramInt;
        if (this.xhC != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xhC);
        i += e.a.a.b.b.a.bs(4, this.Scene);
        paramInt = i;
        if (this.wlw != null)
          paramInt = i + e.a.a.a.ix(5, this.wlw.computeSize());
        AppMethodBeat.o(28674);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28674);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cir localcir = (cir)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28674);
          break;
        case 1:
          localcir.xhA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28674);
          paramInt = 0;
          break;
        case 2:
          localcir.xhB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28674);
          paramInt = 0;
          break;
        case 3:
          localcir.xhC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28674);
          paramInt = 0;
          break;
        case 4:
          localcir.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28674);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcir.wlw = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28674);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28674);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cir
 * JD-Core Version:    0.6.2
 */