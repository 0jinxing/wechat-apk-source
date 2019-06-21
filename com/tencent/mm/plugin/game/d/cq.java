package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cq extends com.tencent.mm.bt.a
{
  public String ncB;
  public LinkedList<cr> ndk;
  public String ndl;

  public cq()
  {
    AppMethodBeat.i(111654);
    this.ndk = new LinkedList();
    AppMethodBeat.o(111654);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111655);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.ndk);
      if (this.ncB != null)
        paramArrayOfObject.e(2, this.ncB);
      if (this.ndl != null)
        paramArrayOfObject.e(3, this.ndl);
      AppMethodBeat.o(111655);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.ndk) + 0;
        paramInt = i;
        if (this.ncB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ncB);
        i = paramInt;
        if (this.ndl != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ndl);
        AppMethodBeat.o(111655);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ndk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111655);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cq localcq = (cq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111655);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcq.ndk.add(localObject1);
          }
          AppMethodBeat.o(111655);
          paramInt = 0;
          break;
        case 2:
          localcq.ncB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111655);
          paramInt = 0;
          break;
        case 3:
          localcq.ndl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111655);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(111655);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cq
 * JD-Core Version:    0.6.2
 */