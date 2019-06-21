package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cmk extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String jBF;
  public String ncH;
  public String vIk;
  public String wLX;
  public String wbq;
  public String wwn;
  public long xkn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28694);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wbq != null)
        paramArrayOfObject.e(1, this.wbq);
      if (this.vIk != null)
        paramArrayOfObject.e(2, this.vIk);
      if (this.wLX != null)
        paramArrayOfObject.e(3, this.wLX);
      if (this.ncH != null)
        paramArrayOfObject.e(4, this.ncH);
      if (this.jBF != null)
        paramArrayOfObject.e(5, this.jBF);
      if (this.IconUrl != null)
        paramArrayOfObject.e(6, this.IconUrl);
      if (this.wwn != null)
        paramArrayOfObject.e(7, this.wwn);
      paramArrayOfObject.ai(8, this.xkn);
      AppMethodBeat.o(28694);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wbq == null)
        break label678;
    label678: for (i = e.a.a.b.b.a.f(1, this.wbq) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIk != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vIk);
      i = paramInt;
      if (this.wLX != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wLX);
      int j = i;
      if (this.ncH != null)
        j = i + e.a.a.b.b.a.f(4, this.ncH);
      paramInt = j;
      if (this.jBF != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.jBF);
      i = paramInt;
      if (this.IconUrl != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.IconUrl);
      paramInt = i;
      if (this.wwn != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wwn);
      paramInt += e.a.a.b.b.a.o(8, this.xkn);
      AppMethodBeat.o(28694);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28694);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmk localcmk = (cmk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28694);
          break;
        case 1:
          localcmk.wbq = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 2:
          localcmk.vIk = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 3:
          localcmk.wLX = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 4:
          localcmk.ncH = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 5:
          localcmk.jBF = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 6:
          localcmk.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 7:
          localcmk.wwn = locala.BTU.readString();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        case 8:
          localcmk.xkn = locala.BTU.ve();
          AppMethodBeat.o(28694);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28694);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmk
 * JD-Core Version:    0.6.2
 */