package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class sk extends com.tencent.mm.bt.a
{
  public int vZG;
  public int vZH;
  public int vZI;
  public LinkedList<sj> vZJ;
  public b vZK;
  public atd vZL;

  public sk()
  {
    AppMethodBeat.i(72843);
    this.vZJ = new LinkedList();
    AppMethodBeat.o(72843);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72844);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vZG);
      paramArrayOfObject.iz(2, this.vZH);
      paramArrayOfObject.iz(3, this.vZI);
      paramArrayOfObject.e(4, 8, this.vZJ);
      if (this.vZK != null)
        paramArrayOfObject.c(5, this.vZK);
      if (this.vZL != null)
      {
        paramArrayOfObject.iy(6, this.vZL.computeSize());
        this.vZL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(72844);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vZG) + 0 + e.a.a.b.b.a.bs(2, this.vZH) + e.a.a.b.b.a.bs(3, this.vZI) + e.a.a.a.c(4, 8, this.vZJ);
        paramInt = i;
        if (this.vZK != null)
          paramInt = i + e.a.a.b.b.a.b(5, this.vZK);
        i = paramInt;
        if (this.vZL != null)
          i = paramInt + e.a.a.a.ix(6, this.vZL.computeSize());
        AppMethodBeat.o(72844);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72844);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sk localsk = (sk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72844);
          break;
        case 1:
          localsk.vZG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72844);
          paramInt = 0;
          break;
        case 2:
          localsk.vZH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72844);
          paramInt = 0;
          break;
        case 3:
          localsk.vZI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72844);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new sj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsk.vZJ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72844);
          paramInt = 0;
          break;
        case 5:
          localsk.vZK = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(72844);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new atd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsk.vZL = paramArrayOfObject;
          }
          AppMethodBeat.o(72844);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72844);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sk
 * JD-Core Version:    0.6.2
 */