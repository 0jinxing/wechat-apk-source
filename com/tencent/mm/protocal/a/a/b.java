package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public int nettype;
  public int uin;
  public int vyR;
  public LinkedList<a> vyS;

  public b()
  {
    AppMethodBeat.i(72816);
    this.vyS = new LinkedList();
    AppMethodBeat.o(72816);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72817);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.uin);
      paramArrayOfObject.iz(2, this.vyR);
      paramArrayOfObject.e(3, 8, this.vyS);
      paramArrayOfObject.iz(4, this.nettype);
      AppMethodBeat.o(72817);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.uin) + 0 + e.a.a.b.b.a.bs(2, this.vyR) + e.a.a.a.c(3, 8, this.vyS) + e.a.a.b.b.a.bs(4, this.nettype);
        AppMethodBeat.o(72817);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vyS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72817);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72817);
          break;
        case 1:
          localb.uin = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72817);
          paramInt = 0;
          break;
        case 2:
          localb.vyR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72817);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.vyS.add(paramArrayOfObject);
          }
          AppMethodBeat.o(72817);
          paramInt = 0;
          break;
        case 4:
          localb.nettype = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72817);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72817);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.b
 * JD-Core Version:    0.6.2
 */