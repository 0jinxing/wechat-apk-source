package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class IMBehavior extends com.tencent.mm.bt.a
{
  public IMBehaviorChattingOP chattingOp;
  public IMBehaviorMsgOP msgOp;
  public int opType;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79149);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.opType);
      if (this.chattingOp != null)
      {
        paramArrayOfObject.iy(2, this.chattingOp.computeSize());
        this.chattingOp.writeFields(paramArrayOfObject);
      }
      if (this.msgOp != null)
      {
        paramArrayOfObject.iy(3, this.msgOp.computeSize());
        this.msgOp.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(79149);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.opType) + 0;
        paramInt = i;
        if (this.chattingOp != null)
          paramInt = i + e.a.a.a.ix(2, this.chattingOp.computeSize());
        i = paramInt;
        if (this.msgOp != null)
          i = paramInt + e.a.a.a.ix(3, this.msgOp.computeSize());
        AppMethodBeat.o(79149);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79149);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        IMBehavior localIMBehavior = (IMBehavior)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79149);
          break;
        case 1:
          localIMBehavior.opType = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79149);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new IMBehaviorChattingOP();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((IMBehaviorChattingOP)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localIMBehavior.chattingOp = ((IMBehaviorChattingOP)localObject1);
          }
          AppMethodBeat.o(79149);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new IMBehaviorMsgOP();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localIMBehavior.msgOp = paramArrayOfObject;
          }
          AppMethodBeat.o(79149);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79149);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.IMBehavior
 * JD-Core Version:    0.6.2
 */