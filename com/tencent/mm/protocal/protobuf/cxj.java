package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxj extends com.tencent.mm.bt.a
{
  public int wzp;
  public String wzy;
  public String xsK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96343);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wzy != null)
        paramArrayOfObject.e(1, this.wzy);
      paramArrayOfObject.iz(2, this.wzp);
      if (this.xsK != null)
        paramArrayOfObject.e(3, this.xsK);
      AppMethodBeat.o(96343);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wzy == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.wzy) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wzp);
      paramInt = i;
      if (this.xsK != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xsK);
      AppMethodBeat.o(96343);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96343);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxj localcxj = (cxj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96343);
          break;
        case 1:
          localcxj.wzy = locala.BTU.readString();
          AppMethodBeat.o(96343);
          paramInt = i;
          break;
        case 2:
          localcxj.wzp = locala.BTU.vd();
          AppMethodBeat.o(96343);
          paramInt = i;
          break;
        case 3:
          localcxj.xsK = locala.BTU.readString();
          AppMethodBeat.o(96343);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96343);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxj
 * JD-Core Version:    0.6.2
 */