package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ye extends com.tencent.mm.bt.a
{
  public int Scene;
  public int vIK;
  public LinkedList<ckw> wdV;
  public int wdW;
  public boolean wdX;

  public ye()
  {
    AppMethodBeat.i(62527);
    this.wdV = new LinkedList();
    this.wdX = false;
    this.vIK = 0;
    AppMethodBeat.o(62527);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62528);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.wdV);
      paramArrayOfObject.iz(2, this.wdW);
      paramArrayOfObject.aO(3, this.wdX);
      paramArrayOfObject.iz(4, this.vIK);
      paramArrayOfObject.iz(5, this.Scene);
      AppMethodBeat.o(62528);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 8, this.wdV) + 0 + e.a.a.b.b.a.bs(2, this.wdW) + (e.a.a.b.b.a.fv(3) + 1) + e.a.a.b.b.a.bs(4, this.vIK) + e.a.a.b.b.a.bs(5, this.Scene);
        AppMethodBeat.o(62528);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wdV.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62528);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ye localye = (ye)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62528);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ckw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ckw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localye.wdV.add(localObject1);
          }
          AppMethodBeat.o(62528);
          paramInt = 0;
          break;
        case 2:
          localye.wdW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62528);
          paramInt = 0;
          break;
        case 3:
          localye.wdX = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(62528);
          paramInt = 0;
          break;
        case 4:
          localye.vIK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62528);
          paramInt = 0;
          break;
        case 5:
          localye.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62528);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62528);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ye
 * JD-Core Version:    0.6.2
 */