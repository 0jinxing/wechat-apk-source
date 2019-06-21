package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnx extends com.tencent.mm.bt.a
{
  public bif wVz;
  public bam xlt;
  public int xlu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48987);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wVz != null)
      {
        paramArrayOfObject.iy(1, this.wVz.computeSize());
        this.wVz.writeFields(paramArrayOfObject);
      }
      if (this.xlt != null)
      {
        paramArrayOfObject.iy(2, this.xlt.computeSize());
        this.xlt.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.xlu);
      AppMethodBeat.o(48987);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wVz == null)
        break label529;
    label529: for (paramInt = e.a.a.a.ix(1, this.wVz.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xlt != null)
        i = paramInt + e.a.a.a.ix(2, this.xlt.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.xlu);
      AppMethodBeat.o(48987);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48987);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnx localcnx = (cnx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48987);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bif();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnx.wVz = paramArrayOfObject;
          }
          AppMethodBeat.o(48987);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bam();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnx.xlt = paramArrayOfObject;
          }
          AppMethodBeat.o(48987);
          paramInt = i;
          break;
        case 3:
          localcnx.xlu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48987);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48987);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnx
 * JD-Core Version:    0.6.2
 */