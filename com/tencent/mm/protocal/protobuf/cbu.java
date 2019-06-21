package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cbu extends com.tencent.mm.bt.a
{
  public int wUX;
  public int xbg;
  public LinkedList<cbb> xbh;
  public int xbi;
  public int xbj;

  public cbu()
  {
    AppMethodBeat.i(94600);
    this.xbh = new LinkedList();
    AppMethodBeat.o(94600);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94601);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xbg);
      paramArrayOfObject.e(2, 8, this.xbh);
      paramArrayOfObject.iz(3, this.xbi);
      paramArrayOfObject.iz(4, this.wUX);
      paramArrayOfObject.iz(5, this.xbj);
      AppMethodBeat.o(94601);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.xbg) + 0 + e.a.a.a.c(2, 8, this.xbh) + e.a.a.b.b.a.bs(3, this.xbi) + e.a.a.b.b.a.bs(4, this.wUX) + e.a.a.b.b.a.bs(5, this.xbj);
        AppMethodBeat.o(94601);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xbh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94601);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cbu localcbu = (cbu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94601);
          break;
        case 1:
          localcbu.xbg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94601);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cbb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcbu.xbh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94601);
          paramInt = 0;
          break;
        case 3:
          localcbu.xbi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94601);
          paramInt = 0;
          break;
        case 4:
          localcbu.wUX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94601);
          paramInt = 0;
          break;
        case 5:
          localcbu.xbj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94601);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94601);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbu
 * JD-Core Version:    0.6.2
 */