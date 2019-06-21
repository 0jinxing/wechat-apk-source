package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class hc extends com.tencent.mm.bt.a
{
  public String vJF;
  public LinkedList<bqr> vJL;

  public hc()
  {
    AppMethodBeat.i(56710);
    this.vJL = new LinkedList();
    AppMethodBeat.o(56710);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56711);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJF != null)
        paramArrayOfObject.e(1, this.vJF);
      paramArrayOfObject.e(2, 8, this.vJL);
      AppMethodBeat.o(56711);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJF == null)
        break label374;
    label374: for (paramInt = e.a.a.b.b.a.f(1, this.vJF) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.vJL);
      AppMethodBeat.o(56711);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vJL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56711);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        hc localhc = (hc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(56711);
          paramInt = -1;
          break;
        case 1:
          localhc.vJF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56711);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bqr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhc.vJL.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56711);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56711);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hc
 * JD-Core Version:    0.6.2
 */