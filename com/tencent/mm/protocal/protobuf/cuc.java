package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cuc extends com.tencent.mm.bt.a
{
  public int nao;
  public String ncM;
  public long vIs;
  public long vIv;
  public String wCW;
  public String wyw;
  public boolean xqD;
  public com.tencent.mm.bt.b xqE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28740);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wCW == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Nickname");
        AppMethodBeat.o(28740);
        throw paramArrayOfObject;
      }
      if (this.ncM == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Content");
        AppMethodBeat.o(28740);
        throw paramArrayOfObject;
      }
      if (this.wyw == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
        AppMethodBeat.o(28740);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vIs);
      if (this.wCW != null)
        paramArrayOfObject.e(2, this.wCW);
      if (this.ncM != null)
        paramArrayOfObject.e(3, this.ncM);
      paramArrayOfObject.iz(4, this.nao);
      if (this.wyw != null)
        paramArrayOfObject.e(5, this.wyw);
      paramArrayOfObject.ai(6, this.vIv);
      paramArrayOfObject.aO(7, this.xqD);
      if (this.xqE != null)
        paramArrayOfObject.c(8, this.xqE);
      AppMethodBeat.o(28740);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vIs) + 0;
        paramInt = i;
        if (this.wCW != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wCW);
        i = paramInt;
        if (this.ncM != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ncM);
        i += e.a.a.b.b.a.bs(4, this.nao);
        paramInt = i;
        if (this.wyw != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wyw);
        i = paramInt + e.a.a.b.b.a.o(6, this.vIv) + (e.a.a.b.b.a.fv(7) + 1);
        paramInt = i;
        if (this.xqE != null)
          paramInt = i + e.a.a.b.b.a.b(8, this.xqE);
        AppMethodBeat.o(28740);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wCW == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Nickname");
          AppMethodBeat.o(28740);
          throw paramArrayOfObject;
        }
        if (this.ncM == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Content");
          AppMethodBeat.o(28740);
          throw paramArrayOfObject;
        }
        if (this.wyw == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
          AppMethodBeat.o(28740);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28740);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cuc localcuc = (cuc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28740);
          break;
        case 1:
          localcuc.vIs = locala.BTU.ve();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 2:
          localcuc.wCW = locala.BTU.readString();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 3:
          localcuc.ncM = locala.BTU.readString();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 4:
          localcuc.nao = locala.BTU.vd();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 5:
          localcuc.wyw = locala.BTU.readString();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 6:
          localcuc.vIv = locala.BTU.ve();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 7:
          localcuc.xqD = locala.BTU.ehX();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        case 8:
          localcuc.xqE = locala.BTU.emu();
          AppMethodBeat.o(28740);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28740);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cuc
 * JD-Core Version:    0.6.2
 */