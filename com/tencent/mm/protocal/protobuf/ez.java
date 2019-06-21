package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ez extends com.tencent.mm.bt.a
{
  public String mZr;
  public String nbm;
  public int vGY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80018);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      paramArrayOfObject.iz(2, this.vGY);
      if (this.nbm != null)
        paramArrayOfObject.e(3, this.nbm);
      AppMethodBeat.o(80018);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.mZr) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vGY);
      paramInt = i;
      if (this.nbm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nbm);
      AppMethodBeat.o(80018);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80018);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ez localez = (ez)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80018);
          break;
        case 1:
          localez.mZr = locala.BTU.readString();
          AppMethodBeat.o(80018);
          paramInt = i;
          break;
        case 2:
          localez.vGY = locala.BTU.vd();
          AppMethodBeat.o(80018);
          paramInt = i;
          break;
        case 3:
          localez.nbm = locala.BTU.readString();
          AppMethodBeat.o(80018);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80018);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ez
 * JD-Core Version:    0.6.2
 */