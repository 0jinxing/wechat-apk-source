package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cty extends com.tencent.mm.bt.a
{
  public long vIs;
  public String xqA;
  public LinkedList<ctz> xqB;
  public long xqz;

  public cty()
  {
    AppMethodBeat.i(28735);
    this.xqB = new LinkedList();
    AppMethodBeat.o(28735);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28736);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xqA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: TotalMsg");
        AppMethodBeat.o(28736);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.xqz);
      paramArrayOfObject.ai(2, this.vIs);
      if (this.xqA != null)
        paramArrayOfObject.e(3, this.xqA);
      paramArrayOfObject.e(4, 8, this.xqB);
      AppMethodBeat.o(28736);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.xqz) + 0 + e.a.a.b.b.a.o(2, this.vIs);
        paramInt = i;
        if (this.xqA != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.xqA);
        paramInt += e.a.a.a.c(4, 8, this.xqB);
        AppMethodBeat.o(28736);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xqB.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xqA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: TotalMsg");
          AppMethodBeat.o(28736);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28736);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cty localcty = (cty)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28736);
          break;
        case 1:
          localcty.xqz = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28736);
          paramInt = 0;
          break;
        case 2:
          localcty.vIs = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28736);
          paramInt = 0;
          break;
        case 3:
          localcty.xqA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28736);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ctz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ctz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcty.xqB.add(localObject1);
          }
          AppMethodBeat.o(28736);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28736);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cty
 * JD-Core Version:    0.6.2
 */