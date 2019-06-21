package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class h extends com.tencent.mm.bt.a
{
  public int ret;
  public int vyT;
  public int vyU;
  public o vyV;
  public o vyW;
  public int vyX;
  public int vyY;
  public int vzm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72825);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ret);
      paramArrayOfObject.iz(2, this.vyT);
      paramArrayOfObject.iz(3, this.vyU);
      if (this.vyV != null)
      {
        paramArrayOfObject.iy(4, this.vyV.computeSize());
        this.vyV.writeFields(paramArrayOfObject);
      }
      if (this.vyW != null)
      {
        paramArrayOfObject.iy(5, this.vyW.computeSize());
        this.vyW.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vyX);
      paramArrayOfObject.iz(7, this.vzm);
      paramArrayOfObject.iz(8, this.vyY);
      AppMethodBeat.o(72825);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ret) + 0 + e.a.a.b.b.a.bs(2, this.vyT) + e.a.a.b.b.a.bs(3, this.vyU);
        paramInt = i;
        if (this.vyV != null)
          paramInt = i + e.a.a.a.ix(4, this.vyV.computeSize());
        i = paramInt;
        if (this.vyW != null)
          i = paramInt + e.a.a.a.ix(5, this.vyW.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(6, this.vyX) + e.a.a.b.b.a.bs(7, this.vzm) + e.a.a.b.b.a.bs(8, this.vyY);
        AppMethodBeat.o(72825);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72825);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72825);
          break;
        case 1:
          localh.ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 2:
          localh.vyT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 3:
          localh.vyU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.vyV = paramArrayOfObject;
          }
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((o)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.vyW = ((o)localObject1);
          }
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 6:
          localh.vyX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 7:
          localh.vzm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        case 8:
          localh.vyY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72825);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72825);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.h
 * JD-Core Version:    0.6.2
 */