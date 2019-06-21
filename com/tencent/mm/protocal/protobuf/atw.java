package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atw extends com.tencent.mm.bt.a
{
  public String Md5;
  public String Name;
  public String Type;
  public String Url;
  public int jCo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28529);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Type != null)
        paramArrayOfObject.e(1, this.Type);
      paramArrayOfObject.iz(2, this.jCo);
      if (this.Md5 != null)
        paramArrayOfObject.e(3, this.Md5);
      if (this.Url != null)
        paramArrayOfObject.e(4, this.Url);
      if (this.Name != null)
        paramArrayOfObject.e(5, this.Name);
      AppMethodBeat.o(28529);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Type == null)
        break label474;
    label474: for (paramInt = e.a.a.b.b.a.f(1, this.Type) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCo);
      paramInt = i;
      if (this.Md5 != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Md5);
      i = paramInt;
      if (this.Url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Url);
      paramInt = i;
      if (this.Name != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.Name);
      AppMethodBeat.o(28529);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28529);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atw localatw = (atw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28529);
          break;
        case 1:
          localatw.Type = locala.BTU.readString();
          AppMethodBeat.o(28529);
          paramInt = i;
          break;
        case 2:
          localatw.jCo = locala.BTU.vd();
          AppMethodBeat.o(28529);
          paramInt = i;
          break;
        case 3:
          localatw.Md5 = locala.BTU.readString();
          AppMethodBeat.o(28529);
          paramInt = i;
          break;
        case 4:
          localatw.Url = locala.BTU.readString();
          AppMethodBeat.o(28529);
          paramInt = i;
          break;
        case 5:
          localatw.Name = locala.BTU.readString();
          AppMethodBeat.o(28529);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28529);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atw
 * JD-Core Version:    0.6.2
 */