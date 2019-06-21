package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atk extends com.tencent.mm.bt.a
{
  public int iAd;
  public String kKZ;
  public int kbK;
  public String kdf;
  public String nSd;
  public String pMg;
  public int state;
  public String vAh;
  public int vNm;
  public String wpp;
  public long wxq;
  public String wxs;
  public int wxu;
  public int wxv;
  public String wxw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48872);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wpp != null)
        paramArrayOfObject.e(1, this.wpp);
      if (this.vAh != null)
        paramArrayOfObject.e(2, this.vAh);
      paramArrayOfObject.ai(3, this.wxq);
      paramArrayOfObject.iz(4, this.state);
      paramArrayOfObject.iz(5, this.vNm);
      paramArrayOfObject.iz(6, this.kbK);
      paramArrayOfObject.iz(7, this.wxu);
      paramArrayOfObject.iz(8, this.wxv);
      if (this.wxw != null)
        paramArrayOfObject.e(9, this.wxw);
      if (this.kdf != null)
        paramArrayOfObject.e(10, this.kdf);
      if (this.nSd != null)
        paramArrayOfObject.e(11, this.nSd);
      if (this.kKZ != null)
        paramArrayOfObject.e(12, this.kKZ);
      if (this.pMg != null)
        paramArrayOfObject.e(13, this.pMg);
      if (this.wxs != null)
        paramArrayOfObject.e(14, this.wxs);
      paramArrayOfObject.iz(15, this.iAd);
      AppMethodBeat.o(48872);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wpp == null)
        break label1009;
    label1009: for (paramInt = e.a.a.b.b.a.f(1, this.wpp) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vAh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vAh);
      i = i + e.a.a.b.b.a.o(3, this.wxq) + e.a.a.b.b.a.bs(4, this.state) + e.a.a.b.b.a.bs(5, this.vNm) + e.a.a.b.b.a.bs(6, this.kbK) + e.a.a.b.b.a.bs(7, this.wxu) + e.a.a.b.b.a.bs(8, this.wxv);
      paramInt = i;
      if (this.wxw != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wxw);
      i = paramInt;
      if (this.kdf != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.kdf);
      paramInt = i;
      if (this.nSd != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.nSd);
      i = paramInt;
      if (this.kKZ != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.kKZ);
      paramInt = i;
      if (this.pMg != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.pMg);
      i = paramInt;
      if (this.wxs != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wxs);
      paramInt = i + e.a.a.b.b.a.bs(15, this.iAd);
      AppMethodBeat.o(48872);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48872);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atk localatk = (atk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48872);
          break;
        case 1:
          localatk.wpp = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 2:
          localatk.vAh = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 3:
          localatk.wxq = locala.BTU.ve();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 4:
          localatk.state = locala.BTU.vd();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 5:
          localatk.vNm = locala.BTU.vd();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 6:
          localatk.kbK = locala.BTU.vd();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 7:
          localatk.wxu = locala.BTU.vd();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 8:
          localatk.wxv = locala.BTU.vd();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 9:
          localatk.wxw = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 10:
          localatk.kdf = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 11:
          localatk.nSd = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 12:
          localatk.kKZ = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 13:
          localatk.pMg = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 14:
          localatk.wxs = locala.BTU.readString();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        case 15:
          localatk.iAd = locala.BTU.vd();
          AppMethodBeat.o(48872);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48872);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atk
 * JD-Core Version:    0.6.2
 */