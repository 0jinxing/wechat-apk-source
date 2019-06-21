package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class fe extends com.tencent.mm.bt.a
{
  public int vHa;
  public int vHb;
  public int vHi;
  public ff vHj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28316);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vHa);
      paramArrayOfObject.iz(2, this.vHb);
      paramArrayOfObject.iz(3, this.vHi);
      if (this.vHj != null)
      {
        paramArrayOfObject.iy(4, this.vHj.computeSize());
        this.vHj.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28316);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vHa) + 0 + e.a.a.b.b.a.bs(2, this.vHb) + e.a.a.b.b.a.bs(3, this.vHi);
        paramInt = i;
        if (this.vHj != null)
          paramInt = i + e.a.a.a.ix(4, this.vHj.computeSize());
        AppMethodBeat.o(28316);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28316);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fe localfe = (fe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28316);
          break;
        case 1:
          localfe.vHa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28316);
          paramInt = 0;
          break;
        case 2:
          localfe.vHb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28316);
          paramInt = 0;
          break;
        case 3:
          localfe.vHi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28316);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ff();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ff)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfe.vHj = ((ff)localObject1);
          }
          AppMethodBeat.o(28316);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28316);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fe
 * JD-Core Version:    0.6.2
 */