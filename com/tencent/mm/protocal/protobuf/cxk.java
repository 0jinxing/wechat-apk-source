package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxk extends com.tencent.mm.bt.a
{
  public String nSa;
  public String nickname;
  public int vNm;
  public boolean xsL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(115012);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vNm);
      if (this.nSa != null)
        paramArrayOfObject.e(2, this.nSa);
      if (this.nickname != null)
        paramArrayOfObject.e(3, this.nickname);
      paramArrayOfObject.aO(4, this.xsL);
      AppMethodBeat.o(115012);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vNm) + 0;
        paramInt = i;
        if (this.nSa != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.nSa);
        i = paramInt;
        if (this.nickname != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.nickname);
        paramInt = i + (e.a.a.b.b.a.fv(4) + 1);
        AppMethodBeat.o(115012);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115012);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxk localcxk = (cxk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115012);
          break;
        case 1:
          localcxk.vNm = locala.BTU.vd();
          AppMethodBeat.o(115012);
          paramInt = 0;
          break;
        case 2:
          localcxk.nSa = locala.BTU.readString();
          AppMethodBeat.o(115012);
          paramInt = 0;
          break;
        case 3:
          localcxk.nickname = locala.BTU.readString();
          AppMethodBeat.o(115012);
          paramInt = 0;
          break;
        case 4:
          localcxk.xsL = locala.BTU.ehX();
          AppMethodBeat.o(115012);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(115012);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxk
 * JD-Core Version:    0.6.2
 */