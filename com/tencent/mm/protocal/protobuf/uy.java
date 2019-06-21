package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class uy extends com.tencent.mm.bt.a
{
  public int gvb;
  public String gvc;
  public String gvd;
  public String gve;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60028);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.gvb);
      if (this.gvc != null)
        paramArrayOfObject.e(2, this.gvc);
      if (this.gvd != null)
        paramArrayOfObject.e(3, this.gvd);
      if (this.gve != null)
        paramArrayOfObject.e(4, this.gve);
      AppMethodBeat.o(60028);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.gvb) + 0;
        paramInt = i;
        if (this.gvc != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.gvc);
        i = paramInt;
        if (this.gvd != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.gvd);
        paramInt = i;
        if (this.gve != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.gve);
        AppMethodBeat.o(60028);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60028);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        uy localuy = (uy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60028);
          break;
        case 1:
          localuy.gvb = locala.BTU.vd();
          AppMethodBeat.o(60028);
          paramInt = 0;
          break;
        case 2:
          localuy.gvc = locala.BTU.readString();
          AppMethodBeat.o(60028);
          paramInt = 0;
          break;
        case 3:
          localuy.gvd = locala.BTU.readString();
          AppMethodBeat.o(60028);
          paramInt = 0;
          break;
        case 4:
          localuy.gve = locala.BTU.readString();
          AppMethodBeat.o(60028);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60028);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uy
 * JD-Core Version:    0.6.2
 */