package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class sp extends com.tencent.mm.bt.a
{
  public String csB;
  public String iAa;
  public String iAb;
  public String iAc;
  public int iAd;
  public String iAe;
  public String izZ;
  public int position;
  public String username;
  public int wad;
  public int wae;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134425);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.izZ != null)
        paramArrayOfObject.e(2, this.izZ);
      paramArrayOfObject.iz(3, this.wad);
      paramArrayOfObject.iz(4, this.wae);
      if (this.iAa != null)
        paramArrayOfObject.e(5, this.iAa);
      if (this.csB != null)
        paramArrayOfObject.e(6, this.csB);
      if (this.iAb != null)
        paramArrayOfObject.e(7, this.iAb);
      if (this.iAc != null)
        paramArrayOfObject.e(8, this.iAc);
      paramArrayOfObject.iz(9, this.iAd);
      if (this.iAe != null)
        paramArrayOfObject.e(10, this.iAe);
      paramArrayOfObject.iz(11, this.position);
      AppMethodBeat.o(134425);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label805;
    label805: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.izZ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.izZ);
      i = i + e.a.a.b.b.a.bs(3, this.wad) + e.a.a.b.b.a.bs(4, this.wae);
      paramInt = i;
      if (this.iAa != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.iAa);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.csB);
      paramInt = i;
      if (this.iAb != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.iAb);
      i = paramInt;
      if (this.iAc != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.iAc);
      i += e.a.a.b.b.a.bs(9, this.iAd);
      paramInt = i;
      if (this.iAe != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.iAe);
      paramInt += e.a.a.b.b.a.bs(11, this.position);
      AppMethodBeat.o(134425);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134425);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        sp localsp = (sp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134425);
          break;
        case 1:
          localsp.username = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 2:
          localsp.izZ = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 3:
          localsp.wad = locala.BTU.vd();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 4:
          localsp.wae = locala.BTU.vd();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 5:
          localsp.iAa = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 6:
          localsp.csB = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 7:
          localsp.iAb = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 8:
          localsp.iAc = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 9:
          localsp.iAd = locala.BTU.vd();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 10:
          localsp.iAe = locala.BTU.readString();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        case 11:
          localsp.position = locala.BTU.vd();
          AppMethodBeat.o(134425);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134425);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sp
 * JD-Core Version:    0.6.2
 */