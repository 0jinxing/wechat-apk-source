package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ar extends com.tencent.mm.bt.a
{
  public String guS;
  public String jBB;
  public int jBT;
  public String jCH;
  public int vCf;
  public String vCg;
  public String vCh;
  public int vCi;
  public int vCj;
  public String vCk;
  public int vCl;
  public String vCm;
  public String vCn;
  public int vCo;
  public String vCp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58883);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      paramArrayOfObject.iz(3, this.vCf);
      if (this.vCg != null)
        paramArrayOfObject.e(4, this.vCg);
      if (this.vCh != null)
        paramArrayOfObject.e(5, this.vCh);
      if (this.guS != null)
        paramArrayOfObject.e(6, this.guS);
      paramArrayOfObject.iz(8, this.jBT);
      paramArrayOfObject.iz(9, this.vCi);
      paramArrayOfObject.iz(10, this.vCj);
      if (this.vCk != null)
        paramArrayOfObject.e(11, this.vCk);
      paramArrayOfObject.iz(12, this.vCl);
      if (this.vCm != null)
        paramArrayOfObject.e(13, this.vCm);
      if (this.vCn != null)
        paramArrayOfObject.e(14, this.vCn);
      paramArrayOfObject.iz(15, this.vCo);
      if (this.vCp != null)
        paramArrayOfObject.e(16, this.vCp);
      AppMethodBeat.o(58883);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label1033;
    label1033: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCH);
      paramInt = i + e.a.a.b.b.a.bs(3, this.vCf);
      i = paramInt;
      if (this.vCg != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vCg);
      paramInt = i;
      if (this.vCh != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vCh);
      i = paramInt;
      if (this.guS != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.guS);
      i = i + e.a.a.b.b.a.bs(8, this.jBT) + e.a.a.b.b.a.bs(9, this.vCi) + e.a.a.b.b.a.bs(10, this.vCj);
      paramInt = i;
      if (this.vCk != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vCk);
      i = paramInt + e.a.a.b.b.a.bs(12, this.vCl);
      paramInt = i;
      if (this.vCm != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.vCm);
      i = paramInt;
      if (this.vCn != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.vCn);
      i += e.a.a.b.b.a.bs(15, this.vCo);
      paramInt = i;
      if (this.vCp != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.vCp);
      AppMethodBeat.o(58883);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58883);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ar localar = (ar)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 7:
        default:
          paramInt = -1;
          AppMethodBeat.o(58883);
          break;
        case 1:
          localar.jBB = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 2:
          localar.jCH = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 3:
          localar.vCf = locala.BTU.vd();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 4:
          localar.vCg = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 5:
          localar.vCh = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 6:
          localar.guS = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 8:
          localar.jBT = locala.BTU.vd();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 9:
          localar.vCi = locala.BTU.vd();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 10:
          localar.vCj = locala.BTU.vd();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 11:
          localar.vCk = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 12:
          localar.vCl = locala.BTU.vd();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 13:
          localar.vCm = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 14:
          localar.vCn = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 15:
          localar.vCo = locala.BTU.vd();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        case 16:
          localar.vCp = locala.BTU.readString();
          AppMethodBeat.o(58883);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58883);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ar
 * JD-Core Version:    0.6.2
 */