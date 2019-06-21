package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class acq extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public String mZW;
  public int vAO;
  public String vEn;
  public String vLo;
  public String vYQ;
  public String wkr;
  public String wks;
  public String wkt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28414);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEn != null)
        paramArrayOfObject.e(1, this.vEn);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      if (this.mZW != null)
        paramArrayOfObject.e(4, this.mZW);
      if (this.wkr != null)
        paramArrayOfObject.e(5, this.wkr);
      if (this.wks != null)
        paramArrayOfObject.e(6, this.wks);
      if (this.vLo != null)
        paramArrayOfObject.e(7, this.vLo);
      if (this.vYQ != null)
        paramArrayOfObject.e(8, this.vYQ);
      if (this.wkt != null)
        paramArrayOfObject.e(9, this.wkt);
      paramArrayOfObject.iz(10, this.vAO);
      AppMethodBeat.o(28414);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEn == null)
        break label810;
    label810: for (paramInt = e.a.a.b.b.a.f(1, this.vEn) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCH);
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.jBB);
      i = paramInt;
      if (this.mZW != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZW);
      int j = i;
      if (this.wkr != null)
        j = i + e.a.a.b.b.a.f(5, this.wkr);
      paramInt = j;
      if (this.wks != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.wks);
      i = paramInt;
      if (this.vLo != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vLo);
      paramInt = i;
      if (this.vYQ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vYQ);
      i = paramInt;
      if (this.wkt != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wkt);
      paramInt = i + e.a.a.b.b.a.bs(10, this.vAO);
      AppMethodBeat.o(28414);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28414);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acq localacq = (acq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28414);
          break;
        case 1:
          localacq.vEn = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 2:
          localacq.jCH = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 3:
          localacq.jBB = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 4:
          localacq.mZW = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 5:
          localacq.wkr = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 6:
          localacq.wks = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 7:
          localacq.vLo = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 8:
          localacq.vYQ = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 9:
          localacq.wkt = locala.BTU.readString();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        case 10:
          localacq.vAO = locala.BTU.vd();
          AppMethodBeat.o(28414);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28414);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acq
 * JD-Core Version:    0.6.2
 */