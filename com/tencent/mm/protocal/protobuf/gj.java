package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class gj extends com.tencent.mm.bt.a
{
  public String guQ;
  public String jBB;
  public String jCH;
  public int mAk;
  public String vEn;
  public int vID;
  public String vIE;
  public String vIF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28323);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEn != null)
        paramArrayOfObject.e(1, this.vEn);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      paramArrayOfObject.iz(4, this.vID);
      if (this.vIE != null)
        paramArrayOfObject.e(5, this.vIE);
      if (this.guQ != null)
        paramArrayOfObject.e(6, this.guQ);
      if (this.vIF != null)
        paramArrayOfObject.e(7, this.vIF);
      paramArrayOfObject.iz(8, this.mAk);
      AppMethodBeat.o(28323);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEn == null)
        break label658;
    label658: for (i = e.a.a.b.b.a.f(1, this.vEn) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jCH);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBB);
      i += e.a.a.b.b.a.bs(4, this.vID);
      paramInt = i;
      if (this.vIE != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vIE);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.guQ);
      paramInt = i;
      if (this.vIF != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vIF);
      paramInt += e.a.a.b.b.a.bs(8, this.mAk);
      AppMethodBeat.o(28323);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28323);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        gj localgj = (gj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28323);
          break;
        case 1:
          localgj.vEn = locala.BTU.readString();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 2:
          localgj.jCH = locala.BTU.readString();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 3:
          localgj.jBB = locala.BTU.readString();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 4:
          localgj.vID = locala.BTU.vd();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 5:
          localgj.vIE = locala.BTU.readString();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 6:
          localgj.guQ = locala.BTU.readString();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 7:
          localgj.vIF = locala.BTU.readString();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        case 8:
          localgj.mAk = locala.BTU.vd();
          AppMethodBeat.o(28323);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28323);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gj
 * JD-Core Version:    0.6.2
 */