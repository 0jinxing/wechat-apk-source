package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public e mZk;
  public String mZl;
  public String mZm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111543);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZl == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: AdURL");
        AppMethodBeat.o(111543);
        throw paramArrayOfObject;
      }
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(1, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      if (this.mZl != null)
        paramArrayOfObject.e(2, this.mZl);
      if (this.mZm != null)
        paramArrayOfObject.e(3, this.mZm);
      AppMethodBeat.o(111543);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZk == null)
        break label502;
    label502: for (i = e.a.a.a.ix(1, this.mZk.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZl);
      i = paramInt;
      if (this.mZm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZm);
      AppMethodBeat.o(111543);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZl == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: AdURL");
          AppMethodBeat.o(111543);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111543);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111543);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.mZk = ((e)localObject1);
          }
          AppMethodBeat.o(111543);
          paramInt = i;
          break;
        case 2:
          localb.mZl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111543);
          paramInt = i;
          break;
        case 3:
          localb.mZm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111543);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111543);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.b
 * JD-Core Version:    0.6.2
 */