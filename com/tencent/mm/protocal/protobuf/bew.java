package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bew extends com.tencent.mm.bt.a
{
  public String desc;
  public String iyZ;
  public String scope;
  public int wIR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10227);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.scope != null)
        paramArrayOfObject.e(1, this.scope);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      paramArrayOfObject.iz(3, this.wIR);
      if (this.iyZ != null)
        paramArrayOfObject.e(4, this.iyZ);
      AppMethodBeat.o(10227);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.scope == null)
        break label410;
    label410: for (paramInt = e.a.a.b.b.a.f(1, this.scope) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      i += e.a.a.b.b.a.bs(3, this.wIR);
      paramInt = i;
      if (this.iyZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.iyZ);
      AppMethodBeat.o(10227);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10227);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bew localbew = (bew)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10227);
          break;
        case 1:
          localbew.scope = locala.BTU.readString();
          AppMethodBeat.o(10227);
          paramInt = i;
          break;
        case 2:
          localbew.desc = locala.BTU.readString();
          AppMethodBeat.o(10227);
          paramInt = i;
          break;
        case 3:
          localbew.wIR = locala.BTU.vd();
          AppMethodBeat.o(10227);
          paramInt = i;
          break;
        case 4:
          localbew.iyZ = locala.BTU.readString();
          AppMethodBeat.o(10227);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10227);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bew
 * JD-Core Version:    0.6.2
 */