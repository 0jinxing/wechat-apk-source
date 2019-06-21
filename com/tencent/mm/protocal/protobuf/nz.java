package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class nz extends com.tencent.mm.bt.a
{
  public int qsz;
  public String text;
  public int type;
  public String url;
  public int vNm;
  public String vTr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89036);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.text != null)
        paramArrayOfObject.e(2, this.text);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      paramArrayOfObject.iz(4, this.qsz);
      paramArrayOfObject.iz(5, this.vNm);
      if (this.vTr != null)
        paramArrayOfObject.e(6, this.vTr);
      AppMethodBeat.o(89036);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.text != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.text);
        i = paramInt;
        if (this.url != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.url);
        i = i + e.a.a.b.b.a.bs(4, this.qsz) + e.a.a.b.b.a.bs(5, this.vNm);
        paramInt = i;
        if (this.vTr != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vTr);
        AppMethodBeat.o(89036);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89036);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        nz localnz = (nz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89036);
          break;
        case 1:
          localnz.type = locala.BTU.vd();
          AppMethodBeat.o(89036);
          paramInt = 0;
          break;
        case 2:
          localnz.text = locala.BTU.readString();
          AppMethodBeat.o(89036);
          paramInt = 0;
          break;
        case 3:
          localnz.url = locala.BTU.readString();
          AppMethodBeat.o(89036);
          paramInt = 0;
          break;
        case 4:
          localnz.qsz = locala.BTU.vd();
          AppMethodBeat.o(89036);
          paramInt = 0;
          break;
        case 5:
          localnz.vNm = locala.BTU.vd();
          AppMethodBeat.o(89036);
          paramInt = 0;
          break;
        case 6:
          localnz.vTr = locala.BTU.readString();
          AppMethodBeat.o(89036);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(89036);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nz
 * JD-Core Version:    0.6.2
 */