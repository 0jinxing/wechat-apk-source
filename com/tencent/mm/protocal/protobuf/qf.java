package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class qf extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public String vXl;
  public String vXm;
  public String vXn;
  public int vXo;
  public String vXp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60027);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.vXl != null)
        paramArrayOfObject.e(3, this.vXl);
      if (this.vXm != null)
        paramArrayOfObject.e(4, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(5, this.vXn);
      paramArrayOfObject.iz(6, this.vXo);
      if (this.vXp != null)
        paramArrayOfObject.e(7, this.vXp);
      AppMethodBeat.o(60027);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label593;
    label593: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jCH);
      i = paramInt;
      if (this.vXl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vXl);
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vXn);
      i += e.a.a.b.b.a.bs(6, this.vXo);
      paramInt = i;
      if (this.vXp != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vXp);
      AppMethodBeat.o(60027);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60027);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        qf localqf = (qf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60027);
          break;
        case 1:
          localqf.jBB = locala.BTU.readString();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        case 2:
          localqf.jCH = locala.BTU.readString();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        case 3:
          localqf.vXl = locala.BTU.readString();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        case 4:
          localqf.vXm = locala.BTU.readString();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        case 5:
          localqf.vXn = locala.BTU.readString();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        case 6:
          localqf.vXo = locala.BTU.vd();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        case 7:
          localqf.vXp = locala.BTU.readString();
          AppMethodBeat.o(60027);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60027);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qf
 * JD-Core Version:    0.6.2
 */