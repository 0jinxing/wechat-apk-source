package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class csj extends com.tencent.mm.bt.a
{
  public String xpI;
  public nb xpJ;
  public boolean xpK;
  public String xpL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56999);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpI != null)
        paramArrayOfObject.e(1, this.xpI);
      if (this.xpJ != null)
      {
        paramArrayOfObject.iy(2, this.xpJ.computeSize());
        this.xpJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(3, this.xpK);
      if (this.xpL != null)
        paramArrayOfObject.e(4, this.xpL);
      AppMethodBeat.o(56999);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpI == null)
        break label497;
    label497: for (paramInt = e.a.a.b.b.a.f(1, this.xpI) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xpJ != null)
        i = paramInt + e.a.a.a.ix(2, this.xpJ.computeSize());
      i += e.a.a.b.b.a.fv(3) + 1;
      paramInt = i;
      if (this.xpL != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xpL);
      AppMethodBeat.o(56999);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56999);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        csj localcsj = (csj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56999);
          break;
        case 1:
          localcsj.xpI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56999);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new nb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((nb)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcsj.xpJ = ((nb)localObject1);
          }
          AppMethodBeat.o(56999);
          paramInt = i;
          break;
        case 3:
          localcsj.xpK = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56999);
          paramInt = i;
          break;
        case 4:
          localcsj.xpL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56999);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56999);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csj
 * JD-Core Version:    0.6.2
 */