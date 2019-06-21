package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class oj extends com.tencent.mm.bt.a
{
  public String code;
  public String csB;
  public String kbU;
  public String vUJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89044);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kbU != null)
        paramArrayOfObject.e(1, this.kbU);
      if (this.code != null)
        paramArrayOfObject.e(2, this.code);
      if (this.vUJ != null)
        paramArrayOfObject.e(3, this.vUJ);
      if (this.csB != null)
        paramArrayOfObject.e(4, this.csB);
      AppMethodBeat.o(89044);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kbU == null)
        break label416;
    label416: for (i = e.a.a.b.b.a.f(1, this.kbU) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.code != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.code);
      i = paramInt;
      if (this.vUJ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vUJ);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.csB);
      AppMethodBeat.o(89044);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89044);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        oj localoj = (oj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89044);
          break;
        case 1:
          localoj.kbU = locala.BTU.readString();
          AppMethodBeat.o(89044);
          paramInt = i;
          break;
        case 2:
          localoj.code = locala.BTU.readString();
          AppMethodBeat.o(89044);
          paramInt = i;
          break;
        case 3:
          localoj.vUJ = locala.BTU.readString();
          AppMethodBeat.o(89044);
          paramInt = i;
          break;
        case 4:
          localoj.csB = locala.BTU.readString();
          AppMethodBeat.o(89044);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89044);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oj
 * JD-Core Version:    0.6.2
 */