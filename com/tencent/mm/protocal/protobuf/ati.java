package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ati extends com.tencent.mm.bt.a
{
  public String cIY;
  public int iAd;
  public String kdf;
  public String vYh;
  public long wch;
  public String wpp;
  public int wxp;
  public long wxq;
  public long wxr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48870);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vYh != null)
        paramArrayOfObject.e(1, this.vYh);
      paramArrayOfObject.ai(2, this.wch);
      paramArrayOfObject.iz(3, this.wxp);
      paramArrayOfObject.ai(4, this.wxq);
      paramArrayOfObject.ai(5, this.wxr);
      if (this.wpp != null)
        paramArrayOfObject.e(6, this.wpp);
      if (this.kdf != null)
        paramArrayOfObject.e(7, this.kdf);
      paramArrayOfObject.iz(8, this.iAd);
      if (this.cIY != null)
        paramArrayOfObject.e(9, this.cIY);
      AppMethodBeat.o(48870);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vYh == null)
        break label655;
    label655: for (paramInt = e.a.a.b.b.a.f(1, this.vYh) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.wch) + e.a.a.b.b.a.bs(3, this.wxp) + e.a.a.b.b.a.o(4, this.wxq) + e.a.a.b.b.a.o(5, this.wxr);
      paramInt = i;
      if (this.wpp != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wpp);
      i = paramInt;
      if (this.kdf != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.kdf);
      i += e.a.a.b.b.a.bs(8, this.iAd);
      paramInt = i;
      if (this.cIY != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.cIY);
      AppMethodBeat.o(48870);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48870);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ati localati = (ati)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48870);
          break;
        case 1:
          localati.vYh = locala.BTU.readString();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 2:
          localati.wch = locala.BTU.ve();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 3:
          localati.wxp = locala.BTU.vd();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 4:
          localati.wxq = locala.BTU.ve();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 5:
          localati.wxr = locala.BTU.ve();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 6:
          localati.wpp = locala.BTU.readString();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 7:
          localati.kdf = locala.BTU.readString();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 8:
          localati.iAd = locala.BTU.vd();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        case 9:
          localati.cIY = locala.BTU.readString();
          AppMethodBeat.o(48870);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48870);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ati
 * JD-Core Version:    0.6.2
 */