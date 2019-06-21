package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cl extends com.tencent.mm.bt.a
{
  public String vEA;
  public String vEy;
  public int vEz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51018);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEy != null)
        paramArrayOfObject.e(1, this.vEy);
      paramArrayOfObject.iz(2, this.vEz);
      if (this.vEA != null)
        paramArrayOfObject.e(3, this.vEA);
      AppMethodBeat.o(51018);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEy == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.vEy) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vEz);
      paramInt = i;
      if (this.vEA != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vEA);
      AppMethodBeat.o(51018);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51018);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cl localcl = (cl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51018);
          break;
        case 1:
          localcl.vEy = locala.BTU.readString();
          AppMethodBeat.o(51018);
          paramInt = i;
          break;
        case 2:
          localcl.vEz = locala.BTU.vd();
          AppMethodBeat.o(51018);
          paramInt = i;
          break;
        case 3:
          localcl.vEA = locala.BTU.readString();
          AppMethodBeat.o(51018);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51018);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cl
 * JD-Core Version:    0.6.2
 */