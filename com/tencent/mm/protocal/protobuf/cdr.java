package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cdr extends com.tencent.mm.bt.a
{
  public String ThumbUrl;
  public String jBB;
  public String nbr;
  public long xdq;
  public int xdr;
  public int xds;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56499);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      paramArrayOfObject.ai(2, this.xdq);
      paramArrayOfObject.iz(3, this.xdr);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(4, this.ThumbUrl);
      paramArrayOfObject.iz(5, this.xds);
      if (this.nbr != null)
        paramArrayOfObject.e(6, this.nbr);
      AppMethodBeat.o(56499);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label494;
    label494: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.xdq) + e.a.a.b.b.a.bs(3, this.xdr);
      paramInt = i;
      if (this.ThumbUrl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ThumbUrl);
      i = paramInt + e.a.a.b.b.a.bs(5, this.xds);
      paramInt = i;
      if (this.nbr != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.nbr);
      AppMethodBeat.o(56499);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56499);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdr localcdr = (cdr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56499);
          break;
        case 1:
          localcdr.jBB = locala.BTU.readString();
          AppMethodBeat.o(56499);
          paramInt = i;
          break;
        case 2:
          localcdr.xdq = locala.BTU.ve();
          AppMethodBeat.o(56499);
          paramInt = i;
          break;
        case 3:
          localcdr.xdr = locala.BTU.vd();
          AppMethodBeat.o(56499);
          paramInt = i;
          break;
        case 4:
          localcdr.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(56499);
          paramInt = i;
          break;
        case 5:
          localcdr.xds = locala.BTU.vd();
          AppMethodBeat.o(56499);
          paramInt = i;
          break;
        case 6:
          localcdr.nbr = locala.BTU.readString();
          AppMethodBeat.o(56499);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56499);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdr
 * JD-Core Version:    0.6.2
 */