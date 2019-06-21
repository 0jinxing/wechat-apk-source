package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bsj extends com.tencent.mm.bt.a
{
  public int Scene;
  public long vQd;
  public int vZW;
  public String wDM;
  public long wOP;
  public String wUn;
  public String wUo;
  public int wUp;
  public int wUq;
  public int wUr;
  public String wUs;
  public String wUt;
  public String wUu;
  public int wyk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124342);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Scene);
      if (this.wDM != null)
        paramArrayOfObject.e(2, this.wDM);
      if (this.wUn != null)
        paramArrayOfObject.e(3, this.wUn);
      paramArrayOfObject.ai(4, this.vQd);
      if (this.wUo != null)
        paramArrayOfObject.e(5, this.wUo);
      paramArrayOfObject.iz(6, this.wUp);
      paramArrayOfObject.iz(7, this.wUq);
      paramArrayOfObject.iz(8, this.wUr);
      paramArrayOfObject.ai(9, this.wOP);
      paramArrayOfObject.iz(10, this.wyk);
      if (this.wUs != null)
        paramArrayOfObject.e(11, this.wUs);
      paramArrayOfObject.iz(12, this.vZW);
      if (this.wUt != null)
        paramArrayOfObject.e(13, this.wUt);
      if (this.wUu != null)
        paramArrayOfObject.e(14, this.wUu);
      AppMethodBeat.o(124342);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.Scene) + 0;
        paramInt = i;
        if (this.wDM != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wDM);
        i = paramInt;
        if (this.wUn != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wUn);
        i += e.a.a.b.b.a.o(4, this.vQd);
        paramInt = i;
        if (this.wUo != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wUo);
        i = paramInt + e.a.a.b.b.a.bs(6, this.wUp) + e.a.a.b.b.a.bs(7, this.wUq) + e.a.a.b.b.a.bs(8, this.wUr) + e.a.a.b.b.a.o(9, this.wOP) + e.a.a.b.b.a.bs(10, this.wyk);
        paramInt = i;
        if (this.wUs != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.wUs);
        i = paramInt + e.a.a.b.b.a.bs(12, this.vZW);
        paramInt = i;
        if (this.wUt != null)
          paramInt = i + e.a.a.b.b.a.f(13, this.wUt);
        i = paramInt;
        if (this.wUu != null)
          i = paramInt + e.a.a.b.b.a.f(14, this.wUu);
        AppMethodBeat.o(124342);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124342);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bsj localbsj = (bsj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124342);
          break;
        case 1:
          localbsj.Scene = locala.BTU.vd();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 2:
          localbsj.wDM = locala.BTU.readString();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 3:
          localbsj.wUn = locala.BTU.readString();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 4:
          localbsj.vQd = locala.BTU.ve();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 5:
          localbsj.wUo = locala.BTU.readString();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 6:
          localbsj.wUp = locala.BTU.vd();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 7:
          localbsj.wUq = locala.BTU.vd();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 8:
          localbsj.wUr = locala.BTU.vd();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 9:
          localbsj.wOP = locala.BTU.ve();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 10:
          localbsj.wyk = locala.BTU.vd();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 11:
          localbsj.wUs = locala.BTU.readString();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 12:
          localbsj.vZW = locala.BTU.vd();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 13:
          localbsj.wUt = locala.BTU.readString();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        case 14:
          localbsj.wUu = locala.BTU.readString();
          AppMethodBeat.o(124342);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124342);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsj
 * JD-Core Version:    0.6.2
 */