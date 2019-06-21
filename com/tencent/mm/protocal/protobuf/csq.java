package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class csq extends com.tencent.mm.bt.a
{
  public int Scene;
  public int gtF;
  public String pdu;
  public String wDM;
  public String wUo;
  public String xpS;
  public String xpT;
  public String xpU;
  public String xpV;
  public String xpW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93804);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpS != null)
        paramArrayOfObject.e(1, this.xpS);
      if (this.xpT != null)
        paramArrayOfObject.e(2, this.xpT);
      if (this.wDM != null)
        paramArrayOfObject.e(3, this.wDM);
      if (this.wUo != null)
        paramArrayOfObject.e(4, this.wUo);
      paramArrayOfObject.iz(5, this.gtF);
      if (this.pdu != null)
        paramArrayOfObject.e(6, this.pdu);
      if (this.xpU != null)
        paramArrayOfObject.e(7, this.xpU);
      if (this.xpV != null)
        paramArrayOfObject.e(8, this.xpV);
      paramArrayOfObject.iz(9, this.Scene);
      if (this.xpW != null)
        paramArrayOfObject.e(19, this.xpW);
      AppMethodBeat.o(93804);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpS == null)
        break label810;
    label810: for (i = e.a.a.b.b.a.f(1, this.xpS) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xpT != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xpT);
      i = paramInt;
      if (this.wDM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wDM);
      paramInt = i;
      if (this.wUo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wUo);
      paramInt += e.a.a.b.b.a.bs(5, this.gtF);
      i = paramInt;
      if (this.pdu != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.pdu);
      paramInt = i;
      if (this.xpU != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.xpU);
      i = paramInt;
      if (this.xpV != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.xpV);
      i += e.a.a.b.b.a.bs(9, this.Scene);
      paramInt = i;
      if (this.xpW != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.xpW);
      AppMethodBeat.o(93804);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93804);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csq localcsq = (csq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        default:
          paramInt = -1;
          AppMethodBeat.o(93804);
          break;
        case 1:
          localcsq.xpS = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 2:
          localcsq.xpT = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 3:
          localcsq.wDM = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 4:
          localcsq.wUo = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 5:
          localcsq.gtF = locala.BTU.vd();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 6:
          localcsq.pdu = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 7:
          localcsq.xpU = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 8:
          localcsq.xpV = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 9:
          localcsq.Scene = locala.BTU.vd();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        case 19:
          localcsq.xpW = locala.BTU.readString();
          AppMethodBeat.o(93804);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93804);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csq
 * JD-Core Version:    0.6.2
 */