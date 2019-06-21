package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cug extends com.tencent.mm.bt.a
{
  public String Title;
  public String ncM;
  public int ndE;
  public int wXt;
  public String wyw;
  public boolean xqI;
  public boolean xqJ;
  public boolean xqK;
  public com.tencent.mm.bt.b xqr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28746);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
        AppMethodBeat.o(28746);
        throw paramArrayOfObject;
      }
      if (this.Title == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Title");
        AppMethodBeat.o(28746);
        throw paramArrayOfObject;
      }
      if (this.ncM == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Content");
        AppMethodBeat.o(28746);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ndE);
      if (this.wyw != null)
        paramArrayOfObject.e(2, this.wyw);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      if (this.ncM != null)
        paramArrayOfObject.e(4, this.ncM);
      paramArrayOfObject.iz(5, this.wXt);
      if (this.xqr != null)
        paramArrayOfObject.c(6, this.xqr);
      paramArrayOfObject.aO(7, this.xqI);
      paramArrayOfObject.aO(8, this.xqJ);
      paramArrayOfObject.aO(9, this.xqK);
      AppMethodBeat.o(28746);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.ndE) + 0;
        paramInt = i;
        if (this.wyw != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wyw);
        i = paramInt;
        if (this.Title != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.Title);
        paramInt = i;
        if (this.ncM != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.ncM);
        i = paramInt + e.a.a.b.b.a.bs(5, this.wXt);
        paramInt = i;
        if (this.xqr != null)
          paramInt = i + e.a.a.b.b.a.b(6, this.xqr);
        paramInt = paramInt + (e.a.a.b.b.a.fv(7) + 1) + (e.a.a.b.b.a.fv(8) + 1) + (e.a.a.b.b.a.fv(9) + 1);
        AppMethodBeat.o(28746);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyw == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
          AppMethodBeat.o(28746);
          throw paramArrayOfObject;
        }
        if (this.Title == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Title");
          AppMethodBeat.o(28746);
          throw paramArrayOfObject;
        }
        if (this.ncM == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Content");
          AppMethodBeat.o(28746);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28746);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cug localcug = (cug)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28746);
          break;
        case 1:
          localcug.ndE = locala.BTU.vd();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 2:
          localcug.wyw = locala.BTU.readString();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 3:
          localcug.Title = locala.BTU.readString();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 4:
          localcug.ncM = locala.BTU.readString();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 5:
          localcug.wXt = locala.BTU.vd();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 6:
          localcug.xqr = locala.BTU.emu();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 7:
          localcug.xqI = locala.BTU.ehX();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 8:
          localcug.xqJ = locala.BTU.ehX();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        case 9:
          localcug.xqK = locala.BTU.ehX();
          AppMethodBeat.o(28746);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28746);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cug
 * JD-Core Version:    0.6.2
 */