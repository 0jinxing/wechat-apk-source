package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class fo extends com.tencent.mm.bt.a
{
  public String cxb;
  public String geY;
  public bgc vHx;
  public LinkedList<bgc> vHy;

  public fo()
  {
    AppMethodBeat.i(80020);
    this.vHy = new LinkedList();
    AppMethodBeat.o(80020);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80021);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geY != null)
        paramArrayOfObject.e(1, this.geY);
      if (this.vHx != null)
      {
        paramArrayOfObject.iy(2, this.vHx.computeSize());
        this.vHx.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.vHy);
      if (this.cxb != null)
        paramArrayOfObject.e(4, this.cxb);
      AppMethodBeat.o(80021);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geY == null)
        break label596;
    label596: for (paramInt = e.a.a.b.b.a.f(1, this.geY) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vHx != null)
        i = paramInt + e.a.a.a.ix(2, this.vHx.computeSize());
      i += e.a.a.a.c(3, 8, this.vHy);
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.cxb);
      AppMethodBeat.o(80021);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vHy.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80021);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fo localfo = (fo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80021);
          break;
        case 1:
          localfo.geY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80021);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bgc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfo.vHx = paramArrayOfObject;
          }
          AppMethodBeat.o(80021);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bgc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfo.vHy.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80021);
          paramInt = i;
          break;
        case 4:
          localfo.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80021);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80021);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fo
 * JD-Core Version:    0.6.2
 */