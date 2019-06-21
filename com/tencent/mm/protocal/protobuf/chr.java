package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chr extends com.tencent.mm.bt.a
{
  public int Scene;
  public int nbk;
  public String ncM;
  public int vFH;
  public int vGB;
  public String wDM;
  public String wUo;
  public String wbI;
  public String xgs;
  public String xgw;
  public String xgx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124369);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wUo != null)
        paramArrayOfObject.e(1, this.wUo);
      if (this.xgx != null)
        paramArrayOfObject.e(2, this.xgx);
      paramArrayOfObject.iz(3, this.nbk);
      if (this.xgs != null)
        paramArrayOfObject.e(4, this.xgs);
      if (this.ncM != null)
        paramArrayOfObject.e(5, this.ncM);
      paramArrayOfObject.iz(6, this.Scene);
      if (this.wDM != null)
        paramArrayOfObject.e(7, this.wDM);
      paramArrayOfObject.iz(8, this.vGB);
      if (this.wbI != null)
        paramArrayOfObject.e(9, this.wbI);
      if (this.xgw != null)
        paramArrayOfObject.e(10, this.xgw);
      paramArrayOfObject.iz(11, this.vFH);
      AppMethodBeat.o(124369);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wUo == null)
        break label805;
    label805: for (paramInt = e.a.a.b.b.a.f(1, this.wUo) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xgx != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xgx);
      i += e.a.a.b.b.a.bs(3, this.nbk);
      paramInt = i;
      if (this.xgs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xgs);
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.ncM);
      i += e.a.a.b.b.a.bs(6, this.Scene);
      paramInt = i;
      if (this.wDM != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wDM);
      i = paramInt + e.a.a.b.b.a.bs(8, this.vGB);
      paramInt = i;
      if (this.wbI != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wbI);
      i = paramInt;
      if (this.xgw != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.xgw);
      paramInt = i + e.a.a.b.b.a.bs(11, this.vFH);
      AppMethodBeat.o(124369);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124369);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chr localchr = (chr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124369);
          break;
        case 1:
          localchr.wUo = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 2:
          localchr.xgx = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 3:
          localchr.nbk = locala.BTU.vd();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 4:
          localchr.xgs = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 5:
          localchr.ncM = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 6:
          localchr.Scene = locala.BTU.vd();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 7:
          localchr.wDM = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 8:
          localchr.vGB = locala.BTU.vd();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 9:
          localchr.wbI = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 10:
          localchr.xgw = locala.BTU.readString();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        case 11:
          localchr.vFH = locala.BTU.vd();
          AppMethodBeat.o(124369);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124369);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chr
 * JD-Core Version:    0.6.2
 */