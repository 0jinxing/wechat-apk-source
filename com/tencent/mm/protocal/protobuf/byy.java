package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class byy extends com.tencent.mm.bt.a
{
  public String cMC;
  public int kfy;
  public int vWx;
  public long wYf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89141);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC != null)
        paramArrayOfObject.e(1, this.cMC);
      paramArrayOfObject.iz(2, this.kfy);
      paramArrayOfObject.iz(3, this.vWx);
      paramArrayOfObject.ai(4, this.wYf);
      AppMethodBeat.o(89141);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cMC == null)
        break label364;
    label364: for (paramInt = e.a.a.b.b.a.f(1, this.cMC) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.kfy) + e.a.a.b.b.a.bs(3, this.vWx) + e.a.a.b.b.a.o(4, this.wYf);
      AppMethodBeat.o(89141);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89141);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        byy localbyy = (byy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89141);
          break;
        case 1:
          localbyy.cMC = locala.BTU.readString();
          AppMethodBeat.o(89141);
          paramInt = i;
          break;
        case 2:
          localbyy.kfy = locala.BTU.vd();
          AppMethodBeat.o(89141);
          paramInt = i;
          break;
        case 3:
          localbyy.vWx = locala.BTU.vd();
          AppMethodBeat.o(89141);
          paramInt = i;
          break;
        case 4:
          localbyy.wYf = locala.BTU.ve();
          AppMethodBeat.o(89141);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89141);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byy
 * JD-Core Version:    0.6.2
 */