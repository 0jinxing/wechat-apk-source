package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zd extends com.tencent.mm.bt.a
{
  public int count;
  public String csB;
  public String iAa;
  public String iAb;
  public String iAc;
  public int iAd;
  public String iAe;
  public String izZ;
  public int position;
  public String username;
  public int wez;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134427);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.iz(2, this.count);
      if (this.izZ != null)
        paramArrayOfObject.e(3, this.izZ);
      if (this.iAa != null)
        paramArrayOfObject.e(4, this.iAa);
      paramArrayOfObject.iz(5, this.wez);
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
      AppMethodBeat.o(134427);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label805;
    label805: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.count);
      paramInt = i;
      if (this.izZ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.izZ);
      i = paramInt;
      if (this.iAa != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.iAa);
      paramInt = i + e.a.a.b.b.a.bs(5, this.wez);
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
      AppMethodBeat.o(134427);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134427);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zd localzd = (zd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134427);
          break;
        case 1:
          localzd.username = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 2:
          localzd.count = locala.BTU.vd();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 3:
          localzd.izZ = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 4:
          localzd.iAa = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 5:
          localzd.wez = locala.BTU.vd();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 6:
          localzd.csB = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 7:
          localzd.iAb = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 8:
          localzd.iAc = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 9:
          localzd.iAd = locala.BTU.vd();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 10:
          localzd.iAe = locala.BTU.readString();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        case 11:
          localzd.position = locala.BTU.vd();
          AppMethodBeat.o(134427);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134427);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zd
 * JD-Core Version:    0.6.2
 */