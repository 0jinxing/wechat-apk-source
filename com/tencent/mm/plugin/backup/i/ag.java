package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ag extends com.tencent.mm.bt.a
{
  public String jBt;
  public LinkedList<Long> jCP;
  public LinkedList<String> jCQ;
  public LinkedList<String> jCR;

  public ag()
  {
    AppMethodBeat.i(18083);
    this.jCP = new LinkedList();
    this.jCQ = new LinkedList();
    this.jCR = new LinkedList();
    AppMethodBeat.o(18083);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18084);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BakChatName");
        AppMethodBeat.o(18084);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.e(1, 3, this.jCP);
      paramArrayOfObject.e(2, 1, this.jCQ);
      paramArrayOfObject.e(3, 1, this.jCR);
      if (this.jBt != null)
        paramArrayOfObject.e(4, this.jBt);
      AppMethodBeat.o(18084);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.a.c(1, 3, this.jCP) + 0 + e.a.a.a.c(2, 1, this.jCQ) + e.a.a.a.c(3, 1, this.jCR);
        paramInt = i;
        if (this.jBt != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.jBt);
        AppMethodBeat.o(18084);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.jCP.clear();
        this.jCQ.clear();
        this.jCR.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BakChatName");
          AppMethodBeat.o(18084);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18084);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ag localag = (ag)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18084);
          break;
        case 1:
          localag.jCP.add(Long.valueOf(locala.BTU.ve()));
          AppMethodBeat.o(18084);
          paramInt = 0;
          break;
        case 2:
          localag.jCQ.add(locala.BTU.readString());
          AppMethodBeat.o(18084);
          paramInt = 0;
          break;
        case 3:
          localag.jCR.add(locala.BTU.readString());
          AppMethodBeat.o(18084);
          paramInt = 0;
          break;
        case 4:
          localag.jBt = locala.BTU.readString();
          AppMethodBeat.o(18084);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18084);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.ag
 * JD-Core Version:    0.6.2
 */