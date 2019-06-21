package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cah extends com.tencent.mm.bt.a
{
  public int vFH;
  public bts wZq;
  public bts wZs;
  public int wZt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94557);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZq != null)
      {
        paramArrayOfObject.iy(1, this.wZq.computeSize());
        this.wZq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vFH);
      if (this.wZs != null)
      {
        paramArrayOfObject.iy(3, this.wZs.computeSize());
        this.wZs.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wZt);
      AppMethodBeat.o(94557);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wZq == null)
        break label577;
    label577: for (paramInt = e.a.a.a.ix(1, this.wZq.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vFH);
      paramInt = i;
      if (this.wZs != null)
        paramInt = i + e.a.a.a.ix(3, this.wZs.computeSize());
      paramInt += e.a.a.b.b.a.bs(4, this.wZt);
      AppMethodBeat.o(94557);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94557);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cah localcah = (cah)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94557);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcah.wZq = paramArrayOfObject;
          }
          AppMethodBeat.o(94557);
          paramInt = i;
          break;
        case 2:
          localcah.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94557);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcah.wZs = ((bts)localObject1);
          }
          AppMethodBeat.o(94557);
          paramInt = i;
          break;
        case 4:
          localcah.wZt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94557);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94557);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cah
 * JD-Core Version:    0.6.2
 */