package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aru extends com.tencent.mm.bt.a
{
  public int Ret;
  public String jBB;
  public String jCH;
  public String vLf;
  public String wlF;
  public String wvL;
  public String wvM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73720);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLf != null)
        paramArrayOfObject.e(1, this.vLf);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.wvL != null)
        paramArrayOfObject.e(3, this.wvL);
      if (this.wvM != null)
        paramArrayOfObject.e(4, this.wvM);
      paramArrayOfObject.iz(5, this.Ret);
      if (this.jCH != null)
        paramArrayOfObject.e(6, this.jCH);
      if (this.wlF != null)
        paramArrayOfObject.e(7, this.wlF);
      AppMethodBeat.o(73720);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vLf == null)
        break label597;
    label597: for (i = e.a.a.b.b.a.f(1, this.vLf) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
      i = paramInt;
      if (this.wvL != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wvL);
      paramInt = i;
      if (this.wvM != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wvM);
      i = paramInt + e.a.a.b.b.a.bs(5, this.Ret);
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.jCH);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wlF);
      AppMethodBeat.o(73720);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73720);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aru localaru = (aru)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73720);
          break;
        case 1:
          localaru.vLf = locala.BTU.readString();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        case 2:
          localaru.jBB = locala.BTU.readString();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        case 3:
          localaru.wvL = locala.BTU.readString();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        case 4:
          localaru.wvM = locala.BTU.readString();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        case 5:
          localaru.Ret = locala.BTU.vd();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        case 6:
          localaru.jCH = locala.BTU.readString();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        case 7:
          localaru.wlF = locala.BTU.readString();
          AppMethodBeat.o(73720);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73720);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aru
 * JD-Core Version:    0.6.2
 */