package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dc extends com.tencent.mm.bt.a
{
  public int bJt;
  public String cEh;
  public String kCs;
  public String nZb;
  public String nZc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48772);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.bJt);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      if (this.nZb != null)
        paramArrayOfObject.e(3, this.nZb);
      if (this.nZc != null)
        paramArrayOfObject.e(4, this.nZc);
      if (this.kCs != null)
        paramArrayOfObject.e(5, this.kCs);
      AppMethodBeat.o(48772);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.bJt) + 0;
        paramInt = i;
        if (this.cEh != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.cEh);
        i = paramInt;
        if (this.nZb != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.nZb);
        paramInt = i;
        if (this.nZc != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.nZc);
        i = paramInt;
        if (this.kCs != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.kCs);
        AppMethodBeat.o(48772);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48772);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dc localdc = (dc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48772);
          break;
        case 1:
          localdc.bJt = locala.BTU.vd();
          AppMethodBeat.o(48772);
          paramInt = 0;
          break;
        case 2:
          localdc.cEh = locala.BTU.readString();
          AppMethodBeat.o(48772);
          paramInt = 0;
          break;
        case 3:
          localdc.nZb = locala.BTU.readString();
          AppMethodBeat.o(48772);
          paramInt = 0;
          break;
        case 4:
          localdc.nZc = locala.BTU.readString();
          AppMethodBeat.o(48772);
          paramInt = 0;
          break;
        case 5:
          localdc.kCs = locala.BTU.readString();
          AppMethodBeat.o(48772);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48772);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dc
 * JD-Core Version:    0.6.2
 */