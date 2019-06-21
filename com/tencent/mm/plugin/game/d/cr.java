package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cr extends com.tencent.mm.bt.a
{
  public e mZk;
  public String mZo;
  public boolean mZy;
  public LinkedList<String> mZz;

  public cr()
  {
    AppMethodBeat.i(111656);
    this.mZz = new LinkedList();
    AppMethodBeat.o(111656);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111657);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppItem");
        AppMethodBeat.o(111657);
        throw paramArrayOfObject;
      }
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(1, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      if (this.mZo != null)
        paramArrayOfObject.e(2, this.mZo);
      paramArrayOfObject.aO(3, this.mZy);
      paramArrayOfObject.e(4, 1, this.mZz);
      AppMethodBeat.o(111657);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZk == null)
        break label540;
    label540: for (paramInt = e.a.a.a.ix(1, this.mZk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZo != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZo);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 1) + e.a.a.a.c(4, 1, this.mZz);
      AppMethodBeat.o(111657);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.mZz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppItem");
          AppMethodBeat.o(111657);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111657);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cr localcr = (cr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111657);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcr.mZk = paramArrayOfObject;
          }
          AppMethodBeat.o(111657);
          paramInt = i;
          break;
        case 2:
          localcr.mZo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111657);
          paramInt = i;
          break;
        case 3:
          localcr.mZy = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111657);
          paramInt = i;
          break;
        case 4:
          localcr.mZz.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111657);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111657);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cr
 * JD-Core Version:    0.6.2
 */