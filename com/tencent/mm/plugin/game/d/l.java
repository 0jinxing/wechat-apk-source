package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class l extends com.tencent.mm.bt.a
{
  public String Name;
  public int mZU;
  public String mZm;
  public String mZs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111552);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Name");
        AppMethodBeat.o(111552);
        throw paramArrayOfObject;
      }
      if (this.mZs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconURL");
        AppMethodBeat.o(111552);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.mZU);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      if (this.mZs != null)
        paramArrayOfObject.e(3, this.mZs);
      if (this.mZm != null)
        paramArrayOfObject.e(4, this.mZm);
      AppMethodBeat.o(111552);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.mZU) + 0;
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Name);
        i = paramInt;
        if (this.mZs != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.mZs);
        paramInt = i;
        if (this.mZm != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.mZm);
        AppMethodBeat.o(111552);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Name");
          AppMethodBeat.o(111552);
          throw paramArrayOfObject;
        }
        if (this.mZs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconURL");
          AppMethodBeat.o(111552);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111552);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        l locall = (l)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111552);
          break;
        case 1:
          locall.mZU = locala.BTU.vd();
          AppMethodBeat.o(111552);
          paramInt = 0;
          break;
        case 2:
          locall.Name = locala.BTU.readString();
          AppMethodBeat.o(111552);
          paramInt = 0;
          break;
        case 3:
          locall.mZs = locala.BTU.readString();
          AppMethodBeat.o(111552);
          paramInt = 0;
          break;
        case 4:
          locall.mZm = locala.BTU.readString();
          AppMethodBeat.o(111552);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(111552);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.l
 * JD-Core Version:    0.6.2
 */