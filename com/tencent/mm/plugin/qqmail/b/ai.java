package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ai extends com.tencent.mm.bt.a
{
  public String name;
  public String path;
  public long pvG;
  public String pvH;
  public long size;
  public int state;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(68075);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.path == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: path");
        AppMethodBeat.o(68075);
        throw paramArrayOfObject;
      }
      if (this.name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: name");
        AppMethodBeat.o(68075);
        throw paramArrayOfObject;
      }
      if (this.path != null)
        paramArrayOfObject.e(1, this.path);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      paramArrayOfObject.ai(3, this.size);
      paramArrayOfObject.iz(4, this.state);
      paramArrayOfObject.ai(5, this.pvG);
      if (this.pvH != null)
        paramArrayOfObject.e(6, this.pvH);
      AppMethodBeat.o(68075);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.path == null)
        break label590;
    label590: for (paramInt = e.a.a.b.b.a.f(1, this.path) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.name != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.name);
      i = i + e.a.a.b.b.a.o(3, this.size) + e.a.a.b.b.a.bs(4, this.state) + e.a.a.b.b.a.o(5, this.pvG);
      paramInt = i;
      if (this.pvH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.pvH);
      AppMethodBeat.o(68075);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.path == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: path");
          AppMethodBeat.o(68075);
          throw paramArrayOfObject;
        }
        if (this.name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: name");
          AppMethodBeat.o(68075);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(68075);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ai localai = (ai)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(68075);
          break;
        case 1:
          localai.path = locala.BTU.readString();
          AppMethodBeat.o(68075);
          paramInt = i;
          break;
        case 2:
          localai.name = locala.BTU.readString();
          AppMethodBeat.o(68075);
          paramInt = i;
          break;
        case 3:
          localai.size = locala.BTU.ve();
          AppMethodBeat.o(68075);
          paramInt = i;
          break;
        case 4:
          localai.state = locala.BTU.vd();
          AppMethodBeat.o(68075);
          paramInt = i;
          break;
        case 5:
          localai.pvG = locala.BTU.ve();
          AppMethodBeat.o(68075);
          paramInt = i;
          break;
        case 6:
          localai.pvH = locala.BTU.readString();
          AppMethodBeat.o(68075);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(68075);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ai
 * JD-Core Version:    0.6.2
 */