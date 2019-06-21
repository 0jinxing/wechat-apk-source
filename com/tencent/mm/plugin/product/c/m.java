package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class m extends com.tencent.mm.bt.a
{
  public String phX;
  public String phY;
  public LinkedList<h> phZ;

  public m()
  {
    AppMethodBeat.i(56637);
    this.phZ = new LinkedList();
    AppMethodBeat.o(56637);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56638);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.phX != null)
        paramArrayOfObject.e(1, this.phX);
      if (this.phY != null)
        paramArrayOfObject.e(2, this.phY);
      paramArrayOfObject.e(3, 8, this.phZ);
      AppMethodBeat.o(56638);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.phX == null)
        break label437;
    label437: for (paramInt = e.a.a.b.b.a.f(1, this.phX) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.phY != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.phY);
      paramInt = i + e.a.a.a.c(3, 8, this.phZ);
      AppMethodBeat.o(56638);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.phZ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56638);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56638);
          break;
        case 1:
          localm.phX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56638);
          paramInt = i;
          break;
        case 2:
          localm.phY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56638);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new h();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localm.phZ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56638);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56638);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.m
 * JD-Core Version:    0.6.2
 */