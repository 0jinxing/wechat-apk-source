package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cre extends com.tencent.mm.bt.a
{
  public LinkedList<cra> xoN;
  public String xot;

  public cre()
  {
    AppMethodBeat.i(102414);
    this.xoN = new LinkedList();
    AppMethodBeat.o(102414);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102415);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xot != null)
        paramArrayOfObject.e(1, this.xot);
      paramArrayOfObject.e(2, 8, this.xoN);
      AppMethodBeat.o(102415);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xot == null)
        break label374;
    label374: for (paramInt = e.a.a.b.b.a.f(1, this.xot) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.xoN);
      AppMethodBeat.o(102415);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xoN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102415);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cre localcre = (cre)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(102415);
          paramInt = -1;
          break;
        case 1:
          localcre.xot = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102415);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cra();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcre.xoN.add(paramArrayOfObject);
          }
          AppMethodBeat.o(102415);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(102415);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cre
 * JD-Core Version:    0.6.2
 */