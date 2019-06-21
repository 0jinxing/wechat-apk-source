package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bc extends com.tencent.mm.bt.a
{
  public String cEh;
  public String cIY;
  public String tID;
  public int tIE;
  public String title;
  public String ttg;
  public String tzW;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56698);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      if (this.cIY != null)
        paramArrayOfObject.e(3, this.cIY);
      if (this.tID != null)
        paramArrayOfObject.e(4, this.tID);
      if (this.title != null)
        paramArrayOfObject.e(5, this.title);
      if (this.tzW != null)
        paramArrayOfObject.e(6, this.tzW);
      if (this.ttg != null)
        paramArrayOfObject.e(7, this.ttg);
      paramArrayOfObject.iz(8, this.tIE);
      AppMethodBeat.o(56698);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label664;
    label664: for (paramInt = e.a.a.b.b.a.f(1, this.url) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cEh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cEh);
      paramInt = i;
      if (this.cIY != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.cIY);
      int j = paramInt;
      if (this.tID != null)
        j = paramInt + e.a.a.b.b.a.f(4, this.tID);
      i = j;
      if (this.title != null)
        i = j + e.a.a.b.b.a.f(5, this.title);
      paramInt = i;
      if (this.tzW != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.tzW);
      i = paramInt;
      if (this.ttg != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.ttg);
      paramInt = i + e.a.a.b.b.a.bs(8, this.tIE);
      AppMethodBeat.o(56698);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56698);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bc localbc = (bc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56698);
          break;
        case 1:
          localbc.url = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 2:
          localbc.cEh = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 3:
          localbc.cIY = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 4:
          localbc.tID = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 5:
          localbc.title = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 6:
          localbc.tzW = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 7:
          localbc.ttg = locala.BTU.readString();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        case 8:
          localbc.tIE = locala.BTU.vd();
          AppMethodBeat.o(56698);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56698);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bc
 * JD-Core Version:    0.6.2
 */