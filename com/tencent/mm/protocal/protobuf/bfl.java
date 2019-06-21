package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bfl extends com.tencent.mm.bt.a
{
  public int FileSize;
  public String fMd;
  public int vPb;
  public int vZF;
  public int wJn;
  public int wJo;
  public String wJp;
  public int wJq;
  public String wJr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28563);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fMd != null)
        paramArrayOfObject.e(1, this.fMd);
      paramArrayOfObject.iz(2, this.wJn);
      paramArrayOfObject.iz(3, this.wJo);
      paramArrayOfObject.iz(4, this.vPb);
      if (this.wJp != null)
        paramArrayOfObject.e(5, this.wJp);
      paramArrayOfObject.iz(6, this.FileSize);
      paramArrayOfObject.iz(7, this.wJq);
      paramArrayOfObject.iz(8, this.vZF);
      if (this.wJr != null)
        paramArrayOfObject.e(9, this.wJr);
      AppMethodBeat.o(28563);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fMd == null)
        break label650;
    label650: for (paramInt = e.a.a.b.b.a.f(1, this.fMd) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wJn) + e.a.a.b.b.a.bs(3, this.wJo) + e.a.a.b.b.a.bs(4, this.vPb);
      paramInt = i;
      if (this.wJp != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wJp);
      i = paramInt + e.a.a.b.b.a.bs(6, this.FileSize) + e.a.a.b.b.a.bs(7, this.wJq) + e.a.a.b.b.a.bs(8, this.vZF);
      paramInt = i;
      if (this.wJr != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wJr);
      AppMethodBeat.o(28563);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28563);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bfl localbfl = (bfl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28563);
          break;
        case 1:
          localbfl.fMd = locala.BTU.readString();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 2:
          localbfl.wJn = locala.BTU.vd();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 3:
          localbfl.wJo = locala.BTU.vd();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 4:
          localbfl.vPb = locala.BTU.vd();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 5:
          localbfl.wJp = locala.BTU.readString();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 6:
          localbfl.FileSize = locala.BTU.vd();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 7:
          localbfl.wJq = locala.BTU.vd();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 8:
          localbfl.vZF = locala.BTU.vd();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        case 9:
          localbfl.wJr = locala.BTU.readString();
          AppMethodBeat.o(28563);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28563);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfl
 * JD-Core Version:    0.6.2
 */