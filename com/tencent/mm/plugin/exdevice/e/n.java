package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class n extends com.tencent.mm.bt.a
{
  public c lvi;
  public int lvm;
  public int lvn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(19429);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lvi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BasePush");
        AppMethodBeat.o(19429);
        throw paramArrayOfObject;
      }
      if (this.lvi != null)
      {
        paramArrayOfObject.iy(1, this.lvi.computeSize());
        this.lvi.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.lvm);
      paramArrayOfObject.iz(3, this.lvn);
      AppMethodBeat.o(19429);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lvi == null)
        break label474;
    label474: for (paramInt = e.a.a.a.ix(1, this.lvi.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.lvm) + e.a.a.b.b.a.bs(3, this.lvn);
      AppMethodBeat.o(19429);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.lvi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BasePush");
          AppMethodBeat.o(19429);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(19429);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(19429);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new c();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localn.lvi = paramArrayOfObject;
          }
          AppMethodBeat.o(19429);
          paramInt = i;
          break;
        case 2:
          localn.lvm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19429);
          paramInt = i;
          break;
        case 3:
          localn.lvn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(19429);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(19429);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.n
 * JD-Core Version:    0.6.2
 */