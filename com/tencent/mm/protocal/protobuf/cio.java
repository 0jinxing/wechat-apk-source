package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cio extends com.tencent.mm.bt.a
{
  public String nuL;
  public String pLH;
  public String pMd;
  public String pMe;
  public String pMf;
  public String pMg;
  public String pbn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48974);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pMd != null)
        paramArrayOfObject.e(1, this.pMd);
      if (this.pMe != null)
        paramArrayOfObject.e(2, this.pMe);
      if (this.pLH != null)
        paramArrayOfObject.e(3, this.pLH);
      if (this.nuL != null)
        paramArrayOfObject.e(4, this.nuL);
      if (this.pbn != null)
        paramArrayOfObject.e(5, this.pbn);
      if (this.pMf != null)
        paramArrayOfObject.e(6, this.pMf);
      if (this.pMg != null)
        paramArrayOfObject.e(7, this.pMg);
      AppMethodBeat.o(48974);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pMd == null)
        break label617;
    label617: for (paramInt = e.a.a.b.b.a.f(1, this.pMd) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.pMe != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.pMe);
      paramInt = i;
      if (this.pLH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pLH);
      int j = paramInt;
      if (this.nuL != null)
        j = paramInt + e.a.a.b.b.a.f(4, this.nuL);
      i = j;
      if (this.pbn != null)
        i = j + e.a.a.b.b.a.f(5, this.pbn);
      paramInt = i;
      if (this.pMf != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.pMf);
      i = paramInt;
      if (this.pMg != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.pMg);
      AppMethodBeat.o(48974);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48974);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cio localcio = (cio)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48974);
          break;
        case 1:
          localcio.pMd = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        case 2:
          localcio.pMe = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        case 3:
          localcio.pLH = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        case 4:
          localcio.nuL = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        case 5:
          localcio.pbn = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        case 6:
          localcio.pMf = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        case 7:
          localcio.pMg = locala.BTU.readString();
          AppMethodBeat.o(48974);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48974);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cio
 * JD-Core Version:    0.6.2
 */