package com.tencent.mm.protocal.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public String bzH;
  public int id;
  public String title;
  public LinkedList<a> vzI;

  public b()
  {
    AppMethodBeat.i(105577);
    this.vzI = new LinkedList();
    AppMethodBeat.o(105577);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105578);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.id);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      if (this.bzH != null)
        paramArrayOfObject.e(3, this.bzH);
      paramArrayOfObject.e(4, 8, this.vzI);
      AppMethodBeat.o(105578);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.id) + 0;
        paramInt = i;
        if (this.title != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.title);
        i = paramInt;
        if (this.bzH != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.bzH);
        paramInt = i + e.a.a.a.c(4, 8, this.vzI);
        AppMethodBeat.o(105578);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzI.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(105578);
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
          AppMethodBeat.o(105578);
          break;
        case 1:
          localb.id = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105578);
          paramInt = 0;
          break;
        case 2:
          localb.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105578);
          paramInt = 0;
          break;
        case 3:
          localb.bzH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105578);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((a)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.vzI.add(localObject1);
          }
          AppMethodBeat.o(105578);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(105578);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.b.a.b
 * JD-Core Version:    0.6.2
 */