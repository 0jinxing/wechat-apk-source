package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cvi extends com.tencent.mm.bt.a
{
  public String lvA;
  public String lvz;
  public String phw;
  public String qVw;
  public String source;
  public String thumbUrl;
  public String uaa;
  public String uab;
  public String uac;
  public String uad;
  public long uae;
  public String uaf;
  public String uag;
  public String uah;
  public String uai;
  public String uaj;
  public String uak;
  public String ual;
  public long uam;
  public String uan;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55714);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.uaa != null)
        paramArrayOfObject.e(1, this.uaa);
      if (this.uab != null)
        paramArrayOfObject.e(2, this.uab);
      if (this.uac != null)
        paramArrayOfObject.e(3, this.uac);
      if (this.uad != null)
        paramArrayOfObject.e(4, this.uad);
      paramArrayOfObject.ai(5, this.uae);
      if (this.uai != null)
        paramArrayOfObject.e(6, this.uai);
      if (this.lvz != null)
        paramArrayOfObject.e(7, this.lvz);
      if (this.lvA != null)
        paramArrayOfObject.e(8, this.lvA);
      if (this.qVw != null)
        paramArrayOfObject.e(9, this.qVw);
      if (this.uaf != null)
        paramArrayOfObject.e(10, this.uaf);
      if (this.uag != null)
        paramArrayOfObject.e(11, this.uag);
      if (this.uah != null)
        paramArrayOfObject.e(12, this.uah);
      if (this.source != null)
        paramArrayOfObject.e(13, this.source);
      if (this.phw != null)
        paramArrayOfObject.e(14, this.phw);
      if (this.uaj != null)
        paramArrayOfObject.e(15, this.uaj);
      if (this.uak != null)
        paramArrayOfObject.e(16, this.uak);
      if (this.ual != null)
        paramArrayOfObject.e(17, this.ual);
      paramArrayOfObject.ai(18, this.uam);
      if (this.thumbUrl != null)
        paramArrayOfObject.e(19, this.thumbUrl);
      if (this.uan != null)
        paramArrayOfObject.e(20, this.uan);
      AppMethodBeat.o(55714);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.uaa == null)
        break label1428;
    label1428: for (i = e.a.a.b.b.a.f(1, this.uaa) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.uab != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.uab);
      i = paramInt;
      if (this.uac != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.uac);
      paramInt = i;
      if (this.uad != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.uad);
      paramInt += e.a.a.b.b.a.o(5, this.uae);
      i = paramInt;
      if (this.uai != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.uai);
      paramInt = i;
      if (this.lvz != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.lvz);
      i = paramInt;
      if (this.lvA != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.lvA);
      paramInt = i;
      if (this.qVw != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.qVw);
      i = paramInt;
      if (this.uaf != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.uaf);
      paramInt = i;
      if (this.uag != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.uag);
      int j = paramInt;
      if (this.uah != null)
        j = paramInt + e.a.a.b.b.a.f(12, this.uah);
      i = j;
      if (this.source != null)
        i = j + e.a.a.b.b.a.f(13, this.source);
      paramInt = i;
      if (this.phw != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.phw);
      i = paramInt;
      if (this.uaj != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.uaj);
      paramInt = i;
      if (this.uak != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.uak);
      i = paramInt;
      if (this.ual != null)
        i = paramInt + e.a.a.b.b.a.f(17, this.ual);
      i += e.a.a.b.b.a.o(18, this.uam);
      paramInt = i;
      if (this.thumbUrl != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.thumbUrl);
      i = paramInt;
      if (this.uan != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.uan);
      AppMethodBeat.o(55714);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55714);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cvi localcvi = (cvi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55714);
          break;
        case 1:
          localcvi.uaa = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 2:
          localcvi.uab = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 3:
          localcvi.uac = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 4:
          localcvi.uad = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 5:
          localcvi.uae = locala.BTU.ve();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 6:
          localcvi.uai = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 7:
          localcvi.lvz = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 8:
          localcvi.lvA = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 9:
          localcvi.qVw = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 10:
          localcvi.uaf = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 11:
          localcvi.uag = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 12:
          localcvi.uah = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 13:
          localcvi.source = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 14:
          localcvi.phw = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 15:
          localcvi.uaj = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 16:
          localcvi.uak = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 17:
          localcvi.ual = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 18:
          localcvi.uam = locala.BTU.ve();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 19:
          localcvi.thumbUrl = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        case 20:
          localcvi.uan = locala.BTU.readString();
          AppMethodBeat.o(55714);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55714);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cvi
 * JD-Core Version:    0.6.2
 */