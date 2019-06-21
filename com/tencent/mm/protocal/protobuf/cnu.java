package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnu extends com.tencent.mm.bt.a
{
  public ue xkY;
  public boolean xkZ = true;
  public cnq xla;
  public String xlb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124376);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xkY != null)
      {
        paramArrayOfObject.iy(1, this.xkY.computeSize());
        this.xkY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.xkZ);
      if (this.xla != null)
      {
        paramArrayOfObject.iy(3, this.xla.computeSize());
        this.xla.writeFields(paramArrayOfObject);
      }
      if (this.xlb != null)
        paramArrayOfObject.e(4, this.xlb);
      AppMethodBeat.o(124376);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xkY == null)
        break label594;
    label594: for (paramInt = e.a.a.a.ix(1, this.xkY.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 1);
      paramInt = i;
      if (this.xla != null)
        paramInt = i + e.a.a.a.ix(3, this.xla.computeSize());
      i = paramInt;
      if (this.xlb != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xlb);
      AppMethodBeat.o(124376);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124376);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnu localcnu = (cnu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124376);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ue();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ue)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnu.xkY = ((ue)localObject1);
          }
          AppMethodBeat.o(124376);
          paramInt = i;
          break;
        case 2:
          localcnu.xkZ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(124376);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cnq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cnq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnu.xla = ((cnq)localObject1);
          }
          AppMethodBeat.o(124376);
          paramInt = i;
          break;
        case 4:
          localcnu.xlb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124376);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124376);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnu
 * JD-Core Version:    0.6.2
 */