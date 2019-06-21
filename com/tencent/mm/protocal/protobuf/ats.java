package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ats extends com.tencent.mm.bt.a
{
  public String Md5;
  public String Name;
  public String Type;
  public String Url;
  public int jCo;
  public String vRA;
  public String vRw;
  public String wxO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28525);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Type != null)
        paramArrayOfObject.e(1, this.Type);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      paramArrayOfObject.iz(3, this.jCo);
      if (this.Md5 != null)
        paramArrayOfObject.e(4, this.Md5);
      if (this.vRA != null)
        paramArrayOfObject.e(5, this.vRA);
      if (this.vRw != null)
        paramArrayOfObject.e(6, this.vRw);
      if (this.Url != null)
        paramArrayOfObject.e(7, this.Url);
      if (this.wxO != null)
        paramArrayOfObject.e(8, this.wxO);
      AppMethodBeat.o(28525);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Type == null)
        break label678;
    label678: for (paramInt = e.a.a.b.b.a.f(1, this.Type) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Name != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Name);
      i += e.a.a.b.b.a.bs(3, this.jCo);
      paramInt = i;
      if (this.Md5 != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Md5);
      i = paramInt;
      if (this.vRA != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vRA);
      int j = i;
      if (this.vRw != null)
        j = i + e.a.a.b.b.a.f(6, this.vRw);
      paramInt = j;
      if (this.Url != null)
        paramInt = j + e.a.a.b.b.a.f(7, this.Url);
      i = paramInt;
      if (this.wxO != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wxO);
      AppMethodBeat.o(28525);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28525);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ats localats = (ats)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28525);
          break;
        case 1:
          localats.Type = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 2:
          localats.Name = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 3:
          localats.jCo = locala.BTU.vd();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 4:
          localats.Md5 = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 5:
          localats.vRA = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 6:
          localats.vRw = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 7:
          localats.Url = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        case 8:
          localats.wxO = locala.BTU.readString();
          AppMethodBeat.o(28525);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28525);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ats
 * JD-Core Version:    0.6.2
 */