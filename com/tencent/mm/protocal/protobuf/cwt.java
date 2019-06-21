package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cwt extends com.tencent.mm.bt.a
{
  public int cOq;
  public String cOr;
  public String fKh;
  public String iBB;
  public int iBG;
  public int jCt;
  public int lvf;
  public int pXC;
  public int pXD;
  public int ugc;
  public String vGA;
  public String xso;
  public String xsp;
  public int xsq;
  public String xsr;
  public int xss;
  public String xst;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96330);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCt);
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.xso != null)
        paramArrayOfObject.e(3, this.xso);
      paramArrayOfObject.iz(4, this.pXC);
      paramArrayOfObject.iz(5, this.lvf);
      paramArrayOfObject.iz(6, this.pXD);
      if (this.xsp != null)
        paramArrayOfObject.e(7, this.xsp);
      paramArrayOfObject.iz(8, this.xsq);
      if (this.vGA != null)
        paramArrayOfObject.e(9, this.vGA);
      if (this.xsr != null)
        paramArrayOfObject.e(10, this.xsr);
      paramArrayOfObject.iz(11, this.ugc);
      paramArrayOfObject.iz(12, this.xss);
      if (this.xst != null)
        paramArrayOfObject.e(13, this.xst);
      if (this.iBB != null)
        paramArrayOfObject.e(14, this.iBB);
      paramArrayOfObject.iz(15, this.cOq);
      if (this.cOr != null)
        paramArrayOfObject.e(16, this.cOr);
      paramArrayOfObject.iz(17, this.iBG);
      AppMethodBeat.o(96330);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jCt) + 0;
        paramInt = i;
        if (this.fKh != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
        i = paramInt;
        if (this.xso != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xso);
        i = i + e.a.a.b.b.a.bs(4, this.pXC) + e.a.a.b.b.a.bs(5, this.lvf) + e.a.a.b.b.a.bs(6, this.pXD);
        paramInt = i;
        if (this.xsp != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.xsp);
        i = paramInt + e.a.a.b.b.a.bs(8, this.xsq);
        paramInt = i;
        if (this.vGA != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.vGA);
        i = paramInt;
        if (this.xsr != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.xsr);
        i = i + e.a.a.b.b.a.bs(11, this.ugc) + e.a.a.b.b.a.bs(12, this.xss);
        paramInt = i;
        if (this.xst != null)
          paramInt = i + e.a.a.b.b.a.f(13, this.xst);
        i = paramInt;
        if (this.iBB != null)
          i = paramInt + e.a.a.b.b.a.f(14, this.iBB);
        i += e.a.a.b.b.a.bs(15, this.cOq);
        paramInt = i;
        if (this.cOr != null)
          paramInt = i + e.a.a.b.b.a.f(16, this.cOr);
        paramInt += e.a.a.b.b.a.bs(17, this.iBG);
        AppMethodBeat.o(96330);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96330);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwt localcwt = (cwt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96330);
          break;
        case 1:
          localcwt.jCt = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 2:
          localcwt.fKh = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 3:
          localcwt.xso = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 4:
          localcwt.pXC = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 5:
          localcwt.lvf = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 6:
          localcwt.pXD = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 7:
          localcwt.xsp = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 8:
          localcwt.xsq = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 9:
          localcwt.vGA = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 10:
          localcwt.xsr = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 11:
          localcwt.ugc = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 12:
          localcwt.xss = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 13:
          localcwt.xst = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 14:
          localcwt.iBB = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 15:
          localcwt.cOq = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 16:
          localcwt.cOr = locala.BTU.readString();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        case 17:
          localcwt.iBG = locala.BTU.vd();
          AppMethodBeat.o(96330);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96330);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwt
 * JD-Core Version:    0.6.2
 */