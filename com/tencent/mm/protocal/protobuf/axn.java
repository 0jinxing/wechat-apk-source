package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axn extends com.tencent.mm.bt.a
{
  public int vAS;
  public String wBu;
  public boolean wBv;
  public String wBw;
  public String wup;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96272);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vAS);
      if (this.wBu != null)
        paramArrayOfObject.e(2, this.wBu);
      paramArrayOfObject.aO(3, this.wBv);
      if (this.wBw != null)
        paramArrayOfObject.e(4, this.wBw);
      if (this.wup != null)
        paramArrayOfObject.e(5, this.wup);
      AppMethodBeat.o(96272);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vAS) + 0;
        paramInt = i;
        if (this.wBu != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wBu);
        i = paramInt + (e.a.a.b.b.a.fv(3) + 1);
        paramInt = i;
        if (this.wBw != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wBw);
        i = paramInt;
        if (this.wup != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.wup);
        AppMethodBeat.o(96272);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96272);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axn localaxn = (axn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96272);
          break;
        case 1:
          localaxn.vAS = locala.BTU.vd();
          AppMethodBeat.o(96272);
          paramInt = 0;
          break;
        case 2:
          localaxn.wBu = locala.BTU.readString();
          AppMethodBeat.o(96272);
          paramInt = 0;
          break;
        case 3:
          localaxn.wBv = locala.BTU.ehX();
          AppMethodBeat.o(96272);
          paramInt = 0;
          break;
        case 4:
          localaxn.wBw = locala.BTU.readString();
          AppMethodBeat.o(96272);
          paramInt = 0;
          break;
        case 5:
          localaxn.wup = locala.BTU.readString();
          AppMethodBeat.o(96272);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96272);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axn
 * JD-Core Version:    0.6.2
 */