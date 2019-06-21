package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class ahi extends com.tencent.mm.bt.a
{
  public int vZG;
  public int vZH;
  public int vZI;
  public b vZK;
  public atd vZL;
  public int wnO;
  public int wnP;
  public int wnQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72849);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vZG);
      paramArrayOfObject.iz(2, this.vZH);
      paramArrayOfObject.iz(3, this.vZI);
      if (this.vZK != null)
        paramArrayOfObject.c(4, this.vZK);
      paramArrayOfObject.iz(5, this.wnO);
      paramArrayOfObject.iz(6, this.wnP);
      paramArrayOfObject.iz(7, this.wnQ);
      if (this.vZL != null)
      {
        paramArrayOfObject.iy(8, this.vZL.computeSize());
        this.vZL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(72849);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vZG) + 0 + e.a.a.b.b.a.bs(2, this.vZH) + e.a.a.b.b.a.bs(3, this.vZI);
        paramInt = i;
        if (this.vZK != null)
          paramInt = i + e.a.a.b.b.a.b(4, this.vZK);
        i = paramInt + e.a.a.b.b.a.bs(5, this.wnO) + e.a.a.b.b.a.bs(6, this.wnP) + e.a.a.b.b.a.bs(7, this.wnQ);
        paramInt = i;
        if (this.vZL != null)
          paramInt = i + e.a.a.a.ix(8, this.vZL.computeSize());
        AppMethodBeat.o(72849);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72849);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahi localahi = (ahi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72849);
          break;
        case 1:
          localahi.vZG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 2:
          localahi.vZH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 3:
          localahi.vZI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 4:
          localahi.vZK = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 5:
          localahi.wnO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 6:
          localahi.wnP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 7:
          localahi.wnQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new atd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahi.vZL = paramArrayOfObject;
          }
          AppMethodBeat.o(72849);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72849);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahi
 * JD-Core Version:    0.6.2
 */