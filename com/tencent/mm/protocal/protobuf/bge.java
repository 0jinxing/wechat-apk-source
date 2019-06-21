package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bge extends com.tencent.mm.bt.a
{
  public String appId;
  public String bCu;
  public String eoz;
  public String userName;
  public int wKg;
  public String wKh;
  public String wKi;
  public String wcj;
  public String wck;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80131);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.userName != null)
        paramArrayOfObject.e(1, this.userName);
      if (this.bCu != null)
        paramArrayOfObject.e(2, this.bCu);
      if (this.eoz != null)
        paramArrayOfObject.e(3, this.eoz);
      if (this.wcj != null)
        paramArrayOfObject.e(4, this.wcj);
      if (this.wck != null)
        paramArrayOfObject.e(5, this.wck);
      paramArrayOfObject.iz(6, this.wKg);
      if (this.appId != null)
        paramArrayOfObject.e(7, this.appId);
      if (this.wKh != null)
        paramArrayOfObject.e(8, this.wKh);
      if (this.wKi != null)
        paramArrayOfObject.e(9, this.wKi);
      AppMethodBeat.o(80131);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.userName == null)
        break label723;
    label723: for (i = e.a.a.b.b.a.f(1, this.userName) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.bCu != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.bCu);
      i = paramInt;
      if (this.eoz != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.eoz);
      paramInt = i;
      if (this.wcj != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wcj);
      i = paramInt;
      if (this.wck != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wck);
      i += e.a.a.b.b.a.bs(6, this.wKg);
      paramInt = i;
      if (this.appId != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.appId);
      i = paramInt;
      if (this.wKh != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wKh);
      paramInt = i;
      if (this.wKi != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wKi);
      AppMethodBeat.o(80131);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80131);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bge localbge = (bge)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80131);
          break;
        case 1:
          localbge.userName = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 2:
          localbge.bCu = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 3:
          localbge.eoz = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 4:
          localbge.wcj = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 5:
          localbge.wck = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 6:
          localbge.wKg = locala.BTU.vd();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 7:
          localbge.appId = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 8:
          localbge.wKh = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        case 9:
          localbge.wKi = locala.BTU.readString();
          AppMethodBeat.o(80131);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80131);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bge
 * JD-Core Version:    0.6.2
 */