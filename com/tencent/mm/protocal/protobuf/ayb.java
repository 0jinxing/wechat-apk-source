package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ayb extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public String vXm;
  public String vXn;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118275);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.vXm != null)
        paramArrayOfObject.e(3, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(4, this.vXn);
      if (this.wlF != null)
        paramArrayOfObject.e(5, this.wlF);
      AppMethodBeat.o(118275);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jCH);
      i = paramInt;
      if (this.vXm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vXm);
      paramInt = i;
      if (this.vXn != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vXn);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wlF);
      AppMethodBeat.o(118275);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(118275);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ayb localayb = (ayb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118275);
          break;
        case 1:
          localayb.jBB = locala.BTU.readString();
          AppMethodBeat.o(118275);
          paramInt = i;
          break;
        case 2:
          localayb.jCH = locala.BTU.readString();
          AppMethodBeat.o(118275);
          paramInt = i;
          break;
        case 3:
          localayb.vXm = locala.BTU.readString();
          AppMethodBeat.o(118275);
          paramInt = i;
          break;
        case 4:
          localayb.vXn = locala.BTU.readString();
          AppMethodBeat.o(118275);
          paramInt = i;
          break;
        case 5:
          localayb.wlF = locala.BTU.readString();
          AppMethodBeat.o(118275);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118275);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayb
 * JD-Core Version:    0.6.2
 */