package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chl extends com.tencent.mm.bt.a
{
  public String kmr;
  public String sign;
  public String wmb;
  public String xgh;
  public int xgi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56989);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xgh != null)
        paramArrayOfObject.e(4, this.xgh);
      if (this.sign != null)
        paramArrayOfObject.e(5, this.sign);
      if (this.kmr != null)
        paramArrayOfObject.e(6, this.kmr);
      paramArrayOfObject.iz(7, this.xgi);
      if (this.wmb != null)
        paramArrayOfObject.e(8, this.wmb);
      AppMethodBeat.o(56989);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xgh == null)
        break label471;
    label471: for (i = e.a.a.b.b.a.f(4, this.xgh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.sign != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.sign);
      i = paramInt;
      if (this.kmr != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.kmr);
      i += e.a.a.b.b.a.bs(7, this.xgi);
      paramInt = i;
      if (this.wmb != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wmb);
      AppMethodBeat.o(56989);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56989);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chl localchl = (chl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(56989);
          paramInt = -1;
          break;
        case 4:
          localchl.xgh = locala.BTU.readString();
          AppMethodBeat.o(56989);
          paramInt = i;
          break;
        case 5:
          localchl.sign = locala.BTU.readString();
          AppMethodBeat.o(56989);
          paramInt = i;
          break;
        case 6:
          localchl.kmr = locala.BTU.readString();
          AppMethodBeat.o(56989);
          paramInt = i;
          break;
        case 7:
          localchl.xgi = locala.BTU.vd();
          AppMethodBeat.o(56989);
          paramInt = i;
          break;
        case 8:
          localchl.wmb = locala.BTU.readString();
          AppMethodBeat.o(56989);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56989);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chl
 * JD-Core Version:    0.6.2
 */