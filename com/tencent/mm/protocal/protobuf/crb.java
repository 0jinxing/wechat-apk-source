package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crb extends com.tencent.mm.bt.a
{
  public String cso;
  public String csp;
  public long timestamp;
  public String xoK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102411);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cso != null)
        paramArrayOfObject.e(1, this.cso);
      if (this.csp != null)
        paramArrayOfObject.e(2, this.csp);
      if (this.xoK != null)
        paramArrayOfObject.e(3, this.xoK);
      paramArrayOfObject.ai(4, this.timestamp);
      AppMethodBeat.o(102411);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cso == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.cso) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csp != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csp);
      i = paramInt;
      if (this.xoK != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xoK);
      paramInt = i + e.a.a.b.b.a.o(4, this.timestamp);
      AppMethodBeat.o(102411);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102411);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crb localcrb = (crb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102411);
          break;
        case 1:
          localcrb.cso = locala.BTU.readString();
          AppMethodBeat.o(102411);
          paramInt = i;
          break;
        case 2:
          localcrb.csp = locala.BTU.readString();
          AppMethodBeat.o(102411);
          paramInt = i;
          break;
        case 3:
          localcrb.xoK = locala.BTU.readString();
          AppMethodBeat.o(102411);
          paramInt = i;
          break;
        case 4:
          localcrb.timestamp = locala.BTU.ve();
          AppMethodBeat.o(102411);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102411);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crb
 * JD-Core Version:    0.6.2
 */