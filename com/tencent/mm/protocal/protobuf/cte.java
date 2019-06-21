package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cte extends com.tencent.mm.bt.a
{
  public String Desc;
  public LinkedList<acc> xqk;
  public String xql;

  public cte()
  {
    AppMethodBeat.i(63691);
    this.xqk = new LinkedList();
    AppMethodBeat.o(63691);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63692);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xql == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Charset");
        AppMethodBeat.o(63692);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.e(1, 8, this.xqk);
      if (this.xql != null)
        paramArrayOfObject.e(2, this.xql);
      if (this.Desc != null)
        paramArrayOfObject.e(3, this.Desc);
      AppMethodBeat.o(63692);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.xqk) + 0;
        paramInt = i;
        if (this.xql != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xql);
        i = paramInt;
        if (this.Desc != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.Desc);
        AppMethodBeat.o(63692);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xqk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xql == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Charset");
          AppMethodBeat.o(63692);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63692);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cte localcte = (cte)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63692);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new acc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcte.xqk.add(paramArrayOfObject);
          }
          AppMethodBeat.o(63692);
          paramInt = 0;
          break;
        case 2:
          localcte.xql = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63692);
          paramInt = 0;
          break;
        case 3:
          localcte.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63692);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(63692);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cte
 * JD-Core Version:    0.6.2
 */