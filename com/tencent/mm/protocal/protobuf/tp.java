package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class tp extends com.tencent.mm.bt.a
{
  public String content;
  public String vGs;
  public int vGu;
  public int vNm;
  public int waH;
  public String waI;
  public int waJ;
  public int waK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14724);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.content != null)
        paramArrayOfObject.e(1, this.content);
      if (this.vGs != null)
        paramArrayOfObject.e(3, this.vGs);
      paramArrayOfObject.iz(4, this.vNm);
      paramArrayOfObject.iz(5, this.vGu);
      paramArrayOfObject.iz(6, this.waH);
      if (this.waI != null)
        paramArrayOfObject.e(7, this.waI);
      paramArrayOfObject.iz(8, this.waJ);
      paramArrayOfObject.iz(9, this.waK);
      AppMethodBeat.o(14724);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.content == null)
        break label610;
    label610: for (paramInt = e.a.a.b.b.a.f(1, this.content) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vGs != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vGs);
      i = i + e.a.a.b.b.a.bs(4, this.vNm) + e.a.a.b.b.a.bs(5, this.vGu) + e.a.a.b.b.a.bs(6, this.waH);
      paramInt = i;
      if (this.waI != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.waI);
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.waJ) + e.a.a.b.b.a.bs(9, this.waK);
      AppMethodBeat.o(14724);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14724);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        tp localtp = (tp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 2:
        default:
          AppMethodBeat.o(14724);
          paramInt = -1;
          break;
        case 1:
          localtp.content = locala.BTU.readString();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 3:
          localtp.vGs = locala.BTU.readString();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 4:
          localtp.vNm = locala.BTU.vd();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 5:
          localtp.vGu = locala.BTU.vd();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 6:
          localtp.waH = locala.BTU.vd();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 7:
          localtp.waI = locala.BTU.readString();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 8:
          localtp.waJ = locala.BTU.vd();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        case 9:
          localtp.waK = locala.BTU.vd();
          AppMethodBeat.o(14724);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14724);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.tp
 * JD-Core Version:    0.6.2
 */