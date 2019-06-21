package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bel extends com.tencent.mm.bt.a
{
  public long lastUpdateTime;
  public int version;
  public LinkedList<nn> wbW;
  public int wbX;
  public int wbY;

  public bel()
  {
    AppMethodBeat.i(28560);
    this.wbW = new LinkedList();
    AppMethodBeat.o(28560);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28561);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.wbW);
      paramArrayOfObject.iz(2, this.version);
      paramArrayOfObject.iz(3, this.wbX);
      paramArrayOfObject.iz(4, this.wbY);
      paramArrayOfObject.ai(5, this.lastUpdateTime);
      AppMethodBeat.o(28561);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 8, this.wbW) + 0 + e.a.a.b.b.a.bs(2, this.version) + e.a.a.b.b.a.bs(3, this.wbX) + e.a.a.b.b.a.bs(4, this.wbY) + e.a.a.b.b.a.o(5, this.lastUpdateTime);
        AppMethodBeat.o(28561);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wbW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28561);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bel localbel = (bel)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28561);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new nn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((nn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbel.wbW.add(localObject1);
          }
          AppMethodBeat.o(28561);
          paramInt = 0;
          break;
        case 2:
          localbel.version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28561);
          paramInt = 0;
          break;
        case 3:
          localbel.wbX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28561);
          paramInt = 0;
          break;
        case 4:
          localbel.wbY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28561);
          paramInt = 0;
          break;
        case 5:
          localbel.lastUpdateTime = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28561);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28561);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bel
 * JD-Core Version:    0.6.2
 */