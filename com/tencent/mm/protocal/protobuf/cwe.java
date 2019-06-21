package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cwe extends com.tencent.mm.bt.a
{
  public String wsL;
  public SKBuiltinBuffer_t wsO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58942);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wsO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: VerifyBuff");
        AppMethodBeat.o(58942);
        throw paramArrayOfObject;
      }
      if (this.wsL != null)
        paramArrayOfObject.e(1, this.wsL);
      if (this.wsO != null)
      {
        paramArrayOfObject.iy(2, this.wsO.computeSize());
        this.wsO.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58942);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wsL == null)
        break label434;
    label434: for (i = e.a.a.b.b.a.f(1, this.wsL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wsO != null)
        paramInt = i + e.a.a.a.ix(2, this.wsO.computeSize());
      AppMethodBeat.o(58942);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wsO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: VerifyBuff");
          AppMethodBeat.o(58942);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58942);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cwe localcwe = (cwe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58942);
          paramInt = -1;
          break;
        case 1:
          localcwe.wsL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58942);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwe.wsO = paramArrayOfObject;
          }
          AppMethodBeat.o(58942);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(58942);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwe
 * JD-Core Version:    0.6.2
 */