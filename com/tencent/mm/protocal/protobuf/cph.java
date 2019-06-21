package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cph extends com.tencent.mm.bt.a
{
  public int luF;
  public int pXC;
  public SKBuiltinBuffer_t vJd;
  public int wat;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5239);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJd == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buffer");
        AppMethodBeat.o(5239);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wat);
      paramArrayOfObject.iz(2, this.luF);
      paramArrayOfObject.iz(3, this.pXC);
      if (this.vJd != null)
      {
        paramArrayOfObject.iy(4, this.vJd.computeSize());
        this.vJd.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5239);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wat) + 0 + e.a.a.b.b.a.bs(2, this.luF) + e.a.a.b.b.a.bs(3, this.pXC);
        paramInt = i;
        if (this.vJd != null)
          paramInt = i + e.a.a.a.ix(4, this.vJd.computeSize());
        AppMethodBeat.o(5239);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vJd == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buffer");
          AppMethodBeat.o(5239);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5239);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cph localcph = (cph)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5239);
          break;
        case 1:
          localcph.wat = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5239);
          paramInt = 0;
          break;
        case 2:
          localcph.luF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5239);
          paramInt = 0;
          break;
        case 3:
          localcph.pXC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5239);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcph.vJd = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5239);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5239);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cph
 * JD-Core Version:    0.6.2
 */