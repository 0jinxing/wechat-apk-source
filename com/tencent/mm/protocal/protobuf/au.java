package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class au extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String Name;
  public int jCt;
  public String ncM;
  public String phA;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56696);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      if (this.phA != null)
        paramArrayOfObject.e(2, this.phA);
      paramArrayOfObject.iz(3, this.jCt);
      if (this.ncM != null)
        paramArrayOfObject.e(4, this.ncM);
      if (this.IconUrl != null)
        paramArrayOfObject.e(5, this.IconUrl);
      AppMethodBeat.o(56696);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label467;
    label467: for (paramInt = e.a.a.b.b.a.f(1, this.Name) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.phA != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.phA);
      i += e.a.a.b.b.a.bs(3, this.jCt);
      paramInt = i;
      if (this.ncM != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ncM);
      i = paramInt;
      if (this.IconUrl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.IconUrl);
      AppMethodBeat.o(56696);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56696);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        au localau = (au)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56696);
          break;
        case 1:
          localau.Name = locala.BTU.readString();
          AppMethodBeat.o(56696);
          paramInt = i;
          break;
        case 2:
          localau.phA = locala.BTU.readString();
          AppMethodBeat.o(56696);
          paramInt = i;
          break;
        case 3:
          localau.jCt = locala.BTU.vd();
          AppMethodBeat.o(56696);
          paramInt = i;
          break;
        case 4:
          localau.ncM = locala.BTU.readString();
          AppMethodBeat.o(56696);
          paramInt = i;
          break;
        case 5:
          localau.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(56696);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56696);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.au
 * JD-Core Version:    0.6.2
 */