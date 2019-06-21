package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class dl extends com.tencent.mm.bt.a
{
  public String ndG;
  public String ndH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111679);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(111679);
        throw paramArrayOfObject;
      }
      if (this.ndH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: TimeDesc");
        AppMethodBeat.o(111679);
        throw paramArrayOfObject;
      }
      if (this.ndG != null)
        paramArrayOfObject.e(1, this.ndG);
      if (this.ndH != null)
        paramArrayOfObject.e(2, this.ndH);
      AppMethodBeat.o(111679);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndG == null)
        break label386;
    label386: for (i = e.a.a.b.b.a.f(1, this.ndG) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ndH);
      AppMethodBeat.o(111679);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ndG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(111679);
          throw paramArrayOfObject;
        }
        if (this.ndH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: TimeDesc");
          AppMethodBeat.o(111679);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111679);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dl localdl = (dl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111679);
          paramInt = -1;
          break;
        case 1:
          localdl.ndG = locala.BTU.readString();
          AppMethodBeat.o(111679);
          paramInt = i;
          break;
        case 2:
          localdl.ndH = locala.BTU.readString();
          AppMethodBeat.o(111679);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111679);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dl
 * JD-Core Version:    0.6.2
 */