package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cjg extends com.tencent.mm.bt.a
{
  public String kbV;
  public String nuL;
  public String pbn;
  public String pbo;
  public String vJC;
  public String vJD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48977);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pbn != null)
        paramArrayOfObject.e(1, this.pbn);
      if (this.kbV != null)
        paramArrayOfObject.e(2, this.kbV);
      if (this.nuL != null)
        paramArrayOfObject.e(3, this.nuL);
      if (this.pbo != null)
        paramArrayOfObject.e(4, this.pbo);
      if (this.vJC != null)
        paramArrayOfObject.e(5, this.vJC);
      if (this.vJD != null)
        paramArrayOfObject.e(6, this.vJD);
      AppMethodBeat.o(48977);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pbn == null)
        break label546;
    label546: for (paramInt = e.a.a.b.b.a.f(1, this.pbn) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kbV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kbV);
      paramInt = i;
      if (this.nuL != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nuL);
      i = paramInt;
      if (this.pbo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pbo);
      paramInt = i;
      if (this.vJC != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vJC);
      i = paramInt;
      if (this.vJD != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vJD);
      AppMethodBeat.o(48977);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48977);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cjg localcjg = (cjg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48977);
          break;
        case 1:
          localcjg.pbn = locala.BTU.readString();
          AppMethodBeat.o(48977);
          paramInt = i;
          break;
        case 2:
          localcjg.kbV = locala.BTU.readString();
          AppMethodBeat.o(48977);
          paramInt = i;
          break;
        case 3:
          localcjg.nuL = locala.BTU.readString();
          AppMethodBeat.o(48977);
          paramInt = i;
          break;
        case 4:
          localcjg.pbo = locala.BTU.readString();
          AppMethodBeat.o(48977);
          paramInt = i;
          break;
        case 5:
          localcjg.vJC = locala.BTU.readString();
          AppMethodBeat.o(48977);
          paramInt = i;
          break;
        case 6:
          localcjg.vJD = locala.BTU.readString();
          AppMethodBeat.o(48977);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48977);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cjg
 * JD-Core Version:    0.6.2
 */