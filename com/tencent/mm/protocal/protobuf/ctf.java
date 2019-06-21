package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ctf extends com.tencent.mm.bt.a
{
  public String jBF;
  public String vIk;
  public String vOA;
  public String vOB;
  public String vOC;
  public String vOz;
  public String xqm;
  public String xqn;
  public String xqo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55729);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIk != null)
        paramArrayOfObject.e(1, this.vIk);
      if (this.vOA != null)
        paramArrayOfObject.e(2, this.vOA);
      if (this.vOz != null)
        paramArrayOfObject.e(3, this.vOz);
      if (this.jBF != null)
        paramArrayOfObject.e(4, this.jBF);
      if (this.xqm != null)
        paramArrayOfObject.e(5, this.xqm);
      if (this.vOB != null)
        paramArrayOfObject.e(6, this.vOB);
      if (this.vOC != null)
        paramArrayOfObject.e(7, this.vOC);
      if (this.xqn != null)
        paramArrayOfObject.e(8, this.xqn);
      if (this.xqo != null)
        paramArrayOfObject.e(9, this.xqo);
      AppMethodBeat.o(55729);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vIk == null)
        break label739;
    label739: for (paramInt = e.a.a.b.b.a.f(1, this.vIk) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vOA != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vOA);
      paramInt = i;
      if (this.vOz != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vOz);
      i = paramInt;
      if (this.jBF != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.jBF);
      paramInt = i;
      if (this.xqm != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xqm);
      i = paramInt;
      if (this.vOB != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vOB);
      paramInt = i;
      if (this.vOC != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vOC);
      i = paramInt;
      if (this.xqn != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.xqn);
      paramInt = i;
      if (this.xqo != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.xqo);
      AppMethodBeat.o(55729);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55729);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctf localctf = (ctf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55729);
          break;
        case 1:
          localctf.vIk = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 2:
          localctf.vOA = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 3:
          localctf.vOz = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 4:
          localctf.jBF = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 5:
          localctf.xqm = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 6:
          localctf.vOB = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 7:
          localctf.vOC = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 8:
          localctf.xqn = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        case 9:
          localctf.xqo = locala.BTU.readString();
          AppMethodBeat.o(55729);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55729);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctf
 * JD-Core Version:    0.6.2
 */