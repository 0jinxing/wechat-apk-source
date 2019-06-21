package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cex extends com.tencent.mm.bt.a
{
  public int jCt;
  public long vQE;
  public cey xex;
  public cey xey;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56543);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xex == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SyncMsgDetail");
        AppMethodBeat.o(56543);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQE);
      paramArrayOfObject.iz(2, this.jCt);
      if (this.xex != null)
      {
        paramArrayOfObject.iy(3, this.xex.computeSize());
        this.xex.writeFields(paramArrayOfObject);
      }
      if (this.xey != null)
      {
        paramArrayOfObject.iy(4, this.xey.computeSize());
        this.xey.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56543);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQE) + 0 + e.a.a.b.b.a.bs(2, this.jCt);
        paramInt = i;
        if (this.xex != null)
          paramInt = i + e.a.a.a.ix(3, this.xex.computeSize());
        i = paramInt;
        if (this.xey != null)
          i = paramInt + e.a.a.a.ix(4, this.xey.computeSize());
        AppMethodBeat.o(56543);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xex == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SyncMsgDetail");
          AppMethodBeat.o(56543);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56543);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cex localcex = (cex)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56543);
          break;
        case 1:
          localcex.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56543);
          paramInt = 0;
          break;
        case 2:
          localcex.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56543);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cey();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcex.xex = paramArrayOfObject;
          }
          AppMethodBeat.o(56543);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cey();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cey)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcex.xey = ((cey)localObject1);
          }
          AppMethodBeat.o(56543);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56543);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cex
 * JD-Core Version:    0.6.2
 */