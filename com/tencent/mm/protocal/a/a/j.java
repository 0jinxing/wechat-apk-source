package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class j extends com.tencent.mm.bt.a
{
  public int ret;
  public int vyT;
  public int vyU;
  public o vyV;
  public o vyW;
  public int vyX;
  public int vyY;
  public int vzh;
  public o vzi;
  public int vzm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72828);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ret);
      paramArrayOfObject.iz(2, this.vyT);
      paramArrayOfObject.iz(3, this.vyU);
      paramArrayOfObject.iz(4, this.vzh);
      if (this.vyV != null)
      {
        paramArrayOfObject.iy(5, this.vyV.computeSize());
        this.vyV.writeFields(paramArrayOfObject);
      }
      if (this.vyW != null)
      {
        paramArrayOfObject.iy(6, this.vyW.computeSize());
        this.vyW.writeFields(paramArrayOfObject);
      }
      if (this.vzi != null)
      {
        paramArrayOfObject.iy(7, this.vzi.computeSize());
        this.vzi.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.vyX);
      paramArrayOfObject.iz(9, this.vzm);
      paramArrayOfObject.iz(10, this.vyY);
      AppMethodBeat.o(72828);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ret) + 0 + e.a.a.b.b.a.bs(2, this.vyT) + e.a.a.b.b.a.bs(3, this.vyU) + e.a.a.b.b.a.bs(4, this.vzh);
        paramInt = i;
        if (this.vyV != null)
          paramInt = i + e.a.a.a.ix(5, this.vyV.computeSize());
        i = paramInt;
        if (this.vyW != null)
          i = paramInt + e.a.a.a.ix(6, this.vyW.computeSize());
        paramInt = i;
        if (this.vzi != null)
          paramInt = i + e.a.a.a.ix(7, this.vzi.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(8, this.vyX) + e.a.a.b.b.a.bs(9, this.vzm) + e.a.a.b.b.a.bs(10, this.vyY);
        AppMethodBeat.o(72828);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72828);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72828);
          break;
        case 1:
          localj.ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 2:
          localj.vyT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 3:
          localj.vyU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 4:
          localj.vzh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.vyV = paramArrayOfObject;
          }
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.vyW = paramArrayOfObject;
          }
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new o();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.vzi = paramArrayOfObject;
          }
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 8:
          localj.vyX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 9:
          localj.vzm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        case 10:
          localj.vyY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72828);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72828);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.j
 * JD-Core Version:    0.6.2
 */