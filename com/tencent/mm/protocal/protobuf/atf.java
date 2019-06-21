package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atf extends com.tencent.mm.bt.a
{
  public String pLH;
  public int state;
  public String title;
  public String vPX;
  public String wxf;
  public long wxg;
  public String wxh;
  public String wxi;
  public String wxj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48866);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vPX != null)
        paramArrayOfObject.e(1, this.vPX);
      paramArrayOfObject.iz(2, this.state);
      if (this.title != null)
        paramArrayOfObject.e(3, this.title);
      if (this.wxf != null)
        paramArrayOfObject.e(4, this.wxf);
      paramArrayOfObject.ai(5, this.wxg);
      if (this.wxh != null)
        paramArrayOfObject.e(6, this.wxh);
      if (this.pLH != null)
        paramArrayOfObject.e(7, this.pLH);
      if (this.wxi != null)
        paramArrayOfObject.e(8, this.wxi);
      if (this.wxj != null)
        paramArrayOfObject.e(9, this.wxj);
      AppMethodBeat.o(48866);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vPX == null)
        break label707;
    label707: for (paramInt = e.a.a.b.b.a.f(1, this.vPX) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.state);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.title);
      i = paramInt;
      if (this.wxf != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wxf);
      paramInt = i + e.a.a.b.b.a.o(5, this.wxg);
      i = paramInt;
      if (this.wxh != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wxh);
      paramInt = i;
      if (this.pLH != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pLH);
      i = paramInt;
      if (this.wxi != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wxi);
      paramInt = i;
      if (this.wxj != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wxj);
      AppMethodBeat.o(48866);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48866);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atf localatf = (atf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48866);
          break;
        case 1:
          localatf.vPX = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 2:
          localatf.state = locala.BTU.vd();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 3:
          localatf.title = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 4:
          localatf.wxf = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 5:
          localatf.wxg = locala.BTU.ve();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 6:
          localatf.wxh = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 7:
          localatf.pLH = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 8:
          localatf.wxi = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        case 9:
          localatf.wxj = locala.BTU.readString();
          AppMethodBeat.o(48866);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48866);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atf
 * JD-Core Version:    0.6.2
 */