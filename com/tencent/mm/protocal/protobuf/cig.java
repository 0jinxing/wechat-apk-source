package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cig extends com.tencent.mm.bt.a
{
  public String AesKey;
  public String vRA;
  public int xhn;
  public int xho;
  public long xhp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51437);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xhn);
      if (this.vRA != null)
        paramArrayOfObject.e(2, this.vRA);
      if (this.AesKey != null)
        paramArrayOfObject.e(3, this.AesKey);
      paramArrayOfObject.iz(4, this.xho);
      paramArrayOfObject.ai(5, this.xhp);
      AppMethodBeat.o(51437);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xhn) + 0;
        paramInt = i;
        if (this.vRA != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vRA);
        i = paramInt;
        if (this.AesKey != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.AesKey);
        paramInt = i + e.a.a.b.b.a.bs(4, this.xho) + e.a.a.b.b.a.o(5, this.xhp);
        AppMethodBeat.o(51437);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51437);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cig localcig = (cig)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51437);
          break;
        case 1:
          localcig.xhn = locala.BTU.vd();
          AppMethodBeat.o(51437);
          paramInt = 0;
          break;
        case 2:
          localcig.vRA = locala.BTU.readString();
          AppMethodBeat.o(51437);
          paramInt = 0;
          break;
        case 3:
          localcig.AesKey = locala.BTU.readString();
          AppMethodBeat.o(51437);
          paramInt = 0;
          break;
        case 4:
          localcig.xho = locala.BTU.vd();
          AppMethodBeat.o(51437);
          paramInt = 0;
          break;
        case 5:
          localcig.xhp = locala.BTU.ve();
          AppMethodBeat.o(51437);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51437);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cig
 * JD-Core Version:    0.6.2
 */