package com.tencent.mm.protocal.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends com.tencent.mm.bt.a
{
  public int cKc;
  public String desc;
  public String mjO;
  public String thumbPath;
  public String title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111122);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.thumbPath != null)
        paramArrayOfObject.e(3, this.thumbPath);
      paramArrayOfObject.iz(4, this.cKc);
      if (this.mjO != null)
        paramArrayOfObject.e(5, this.mjO);
      AppMethodBeat.o(111122);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label463;
    label463: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.desc);
      i = paramInt;
      if (this.thumbPath != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.thumbPath);
      i += e.a.a.b.b.a.bs(4, this.cKc);
      paramInt = i;
      if (this.mjO != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.mjO);
      AppMethodBeat.o(111122);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111122);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111122);
          break;
        case 1:
          locald.title = locala.BTU.readString();
          AppMethodBeat.o(111122);
          paramInt = i;
          break;
        case 2:
          locald.desc = locala.BTU.readString();
          AppMethodBeat.o(111122);
          paramInt = i;
          break;
        case 3:
          locald.thumbPath = locala.BTU.readString();
          AppMethodBeat.o(111122);
          paramInt = i;
          break;
        case 4:
          locald.cKc = locala.BTU.vd();
          AppMethodBeat.o(111122);
          paramInt = i;
          break;
        case 5:
          locald.mjO = locala.BTU.readString();
          AppMethodBeat.o(111122);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111122);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.b.a.d
 * JD-Core Version:    0.6.2
 */