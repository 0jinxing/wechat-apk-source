package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ccy extends com.tencent.mm.bt.a
{
  public int xcC;
  public int xcD;
  public int xcE;
  public int xcg;
  public coj xch;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5223);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xch == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Addr");
        AppMethodBeat.o(5223);
        throw paramArrayOfObject;
      }
      if (this.xch != null)
      {
        paramArrayOfObject.iy(1, this.xch.computeSize());
        this.xch.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.xcg);
      paramArrayOfObject.iz(3, this.xcC);
      paramArrayOfObject.iz(4, this.xcD);
      paramArrayOfObject.iz(5, this.xcE);
      AppMethodBeat.o(5223);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xch == null)
        break label566;
    label566: for (paramInt = e.a.a.a.ix(1, this.xch.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.xcg) + e.a.a.b.b.a.bs(3, this.xcC) + e.a.a.b.b.a.bs(4, this.xcD) + e.a.a.b.b.a.bs(5, this.xcE);
      AppMethodBeat.o(5223);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xch == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Addr");
          AppMethodBeat.o(5223);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5223);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccy localccy = (ccy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5223);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccy.xch = paramArrayOfObject;
          }
          AppMethodBeat.o(5223);
          paramInt = i;
          break;
        case 2:
          localccy.xcg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5223);
          paramInt = i;
          break;
        case 3:
          localccy.xcC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5223);
          paramInt = i;
          break;
        case 4:
          localccy.xcD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5223);
          paramInt = i;
          break;
        case 5:
          localccy.xcE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5223);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5223);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccy
 * JD-Core Version:    0.6.2
 */