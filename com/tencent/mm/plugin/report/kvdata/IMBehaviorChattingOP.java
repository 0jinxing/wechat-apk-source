package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class IMBehaviorChattingOP extends com.tencent.mm.bt.a
{
  public int changeNotifyStatus;
  public int changeSaveAddress;
  public int changeTop;
  public int changeUnread;
  public int expose;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79150);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.changeUnread);
      paramArrayOfObject.iz(2, this.changeTop);
      paramArrayOfObject.iz(3, this.changeNotifyStatus);
      paramArrayOfObject.iz(4, this.changeSaveAddress);
      paramArrayOfObject.iz(5, this.expose);
      AppMethodBeat.o(79150);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.changeUnread) + 0 + e.a.a.b.b.a.bs(2, this.changeTop) + e.a.a.b.b.a.bs(3, this.changeNotifyStatus) + e.a.a.b.b.a.bs(4, this.changeSaveAddress) + e.a.a.b.b.a.bs(5, this.expose);
        AppMethodBeat.o(79150);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79150);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        IMBehaviorChattingOP localIMBehaviorChattingOP = (IMBehaviorChattingOP)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79150);
          break;
        case 1:
          localIMBehaviorChattingOP.changeUnread = locala.BTU.vd();
          AppMethodBeat.o(79150);
          paramInt = 0;
          break;
        case 2:
          localIMBehaviorChattingOP.changeTop = locala.BTU.vd();
          AppMethodBeat.o(79150);
          paramInt = 0;
          break;
        case 3:
          localIMBehaviorChattingOP.changeNotifyStatus = locala.BTU.vd();
          AppMethodBeat.o(79150);
          paramInt = 0;
          break;
        case 4:
          localIMBehaviorChattingOP.changeSaveAddress = locala.BTU.vd();
          AppMethodBeat.o(79150);
          paramInt = 0;
          break;
        case 5:
          localIMBehaviorChattingOP.expose = locala.BTU.vd();
          AppMethodBeat.o(79150);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79150);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.IMBehaviorChattingOP
 * JD-Core Version:    0.6.2
 */