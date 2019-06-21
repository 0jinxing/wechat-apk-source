package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class jy extends com.tencent.mm.bt.a
{
  public long jVD;
  public int jVE;
  public String url;
  public String vGE;
  public long vGH;
  public long vMM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11695);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vGE != null)
        paramArrayOfObject.e(1, this.vGE);
      paramArrayOfObject.ai(2, this.jVD);
      paramArrayOfObject.ai(3, this.vGH);
      paramArrayOfObject.ai(4, this.vMM);
      paramArrayOfObject.iz(5, this.jVE);
      if (this.url != null)
        paramArrayOfObject.e(6, this.url);
      AppMethodBeat.o(11695);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vGE == null)
        break label486;
    label486: for (paramInt = e.a.a.b.b.a.f(1, this.vGE) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.jVD) + e.a.a.b.b.a.o(3, this.vGH) + e.a.a.b.b.a.o(4, this.vMM) + e.a.a.b.b.a.bs(5, this.jVE);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.url);
      AppMethodBeat.o(11695);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11695);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        jy localjy = (jy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11695);
          break;
        case 1:
          localjy.vGE = locala.BTU.readString();
          AppMethodBeat.o(11695);
          paramInt = i;
          break;
        case 2:
          localjy.jVD = locala.BTU.ve();
          AppMethodBeat.o(11695);
          paramInt = i;
          break;
        case 3:
          localjy.vGH = locala.BTU.ve();
          AppMethodBeat.o(11695);
          paramInt = i;
          break;
        case 4:
          localjy.vMM = locala.BTU.ve();
          AppMethodBeat.o(11695);
          paramInt = i;
          break;
        case 5:
          localjy.jVE = locala.BTU.vd();
          AppMethodBeat.o(11695);
          paramInt = i;
          break;
        case 6:
          localjy.url = locala.BTU.readString();
          AppMethodBeat.o(11695);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11695);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jy
 * JD-Core Version:    0.6.2
 */