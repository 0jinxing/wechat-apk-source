package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class IMBehaviorMsgOP extends com.tencent.mm.bt.a
{
  public int appMsgInnerType;
  public int count;
  public int msgOpType;
  public int msgType;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79151);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.msgType);
      paramArrayOfObject.iz(2, this.msgOpType);
      paramArrayOfObject.iz(3, this.appMsgInnerType);
      paramArrayOfObject.iz(4, this.count);
      AppMethodBeat.o(79151);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.msgType) + 0 + e.a.a.b.b.a.bs(2, this.msgOpType) + e.a.a.b.b.a.bs(3, this.appMsgInnerType) + e.a.a.b.b.a.bs(4, this.count);
        AppMethodBeat.o(79151);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79151);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        IMBehaviorMsgOP localIMBehaviorMsgOP = (IMBehaviorMsgOP)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79151);
          break;
        case 1:
          localIMBehaviorMsgOP.msgType = locala.BTU.vd();
          AppMethodBeat.o(79151);
          paramInt = 0;
          break;
        case 2:
          localIMBehaviorMsgOP.msgOpType = locala.BTU.vd();
          AppMethodBeat.o(79151);
          paramInt = 0;
          break;
        case 3:
          localIMBehaviorMsgOP.appMsgInnerType = locala.BTU.vd();
          AppMethodBeat.o(79151);
          paramInt = 0;
          break;
        case 4:
          localIMBehaviorMsgOP.count = locala.BTU.vd();
          AppMethodBeat.o(79151);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79151);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.IMBehaviorMsgOP
 * JD-Core Version:    0.6.2
 */