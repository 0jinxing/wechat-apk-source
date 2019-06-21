package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class xb extends com.tencent.mm.bt.a
{
  public String content;
  public String title;
  public LinkedList<xc> wct;

  public xb()
  {
    AppMethodBeat.i(48837);
    this.wct = new LinkedList();
    AppMethodBeat.o(48837);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48838);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.wct);
      if (this.content != null)
        paramArrayOfObject.e(2, this.content);
      if (this.title != null)
        paramArrayOfObject.e(3, this.title);
      AppMethodBeat.o(48838);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.wct) + 0;
        paramInt = i;
        if (this.content != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.content);
        i = paramInt;
        if (this.title != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.title);
        AppMethodBeat.o(48838);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wct.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48838);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xb localxb = (xb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48838);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((xc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxb.wct.add(localObject1);
          }
          AppMethodBeat.o(48838);
          paramInt = 0;
          break;
        case 2:
          localxb.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48838);
          paramInt = 0;
          break;
        case 3:
          localxb.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48838);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48838);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xb
 * JD-Core Version:    0.6.2
 */