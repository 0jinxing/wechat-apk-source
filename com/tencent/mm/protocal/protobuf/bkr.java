package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bkr extends com.tencent.mm.bt.a
{
  public String guP;
  public String guW;
  public float vRp;
  public float vRq;
  public String wNK;
  public String wNL;
  public long wNM;
  public String wxQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124333);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wNK != null)
        paramArrayOfObject.e(1, this.wNK);
      if (this.guW != null)
        paramArrayOfObject.e(2, this.guW);
      if (this.guP != null)
        paramArrayOfObject.e(3, this.guP);
      if (this.wxQ != null)
        paramArrayOfObject.e(4, this.wxQ);
      paramArrayOfObject.r(5, this.vRq);
      paramArrayOfObject.r(6, this.vRp);
      if (this.wNL != null)
        paramArrayOfObject.e(7, this.wNL);
      paramArrayOfObject.ai(8, this.wNM);
      AppMethodBeat.o(124333);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wNK == null)
        break label626;
    label626: for (paramInt = e.a.a.b.b.a.f(1, this.wNK) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.guW);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.guP);
      i = paramInt;
      if (this.wxQ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wxQ);
      i = i + (e.a.a.b.b.a.fv(5) + 4) + (e.a.a.b.b.a.fv(6) + 4);
      paramInt = i;
      if (this.wNL != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wNL);
      paramInt += e.a.a.b.b.a.o(8, this.wNM);
      AppMethodBeat.o(124333);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124333);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bkr localbkr = (bkr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124333);
          break;
        case 1:
          localbkr.wNK = locala.BTU.readString();
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 2:
          localbkr.guW = locala.BTU.readString();
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 3:
          localbkr.guP = locala.BTU.readString();
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 4:
          localbkr.wxQ = locala.BTU.readString();
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 5:
          localbkr.vRq = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 6:
          localbkr.vRp = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 7:
          localbkr.wNL = locala.BTU.readString();
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        case 8:
          localbkr.wNM = locala.BTU.ve();
          AppMethodBeat.o(124333);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124333);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkr
 * JD-Core Version:    0.6.2
 */