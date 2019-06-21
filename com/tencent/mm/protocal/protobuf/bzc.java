package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzc extends com.tencent.mm.bt.a
{
  public String Title;
  public String URL;
  public String ndb;
  public String vEA;
  public String wdO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28653);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.URL != null)
        paramArrayOfObject.e(1, this.URL);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.vEA != null)
        paramArrayOfObject.e(3, this.vEA);
      if (this.ndb != null)
        paramArrayOfObject.e(4, this.ndb);
      if (this.wdO != null)
        paramArrayOfObject.e(5, this.wdO);
      AppMethodBeat.o(28653);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.URL == null)
        break label494;
    label494: for (i = e.a.a.b.b.a.f(1, this.URL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.vEA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vEA);
      paramInt = i;
      if (this.ndb != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ndb);
      i = paramInt;
      if (this.wdO != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wdO);
      AppMethodBeat.o(28653);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28653);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzc localbzc = (bzc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28653);
          break;
        case 1:
          localbzc.URL = locala.BTU.readString();
          AppMethodBeat.o(28653);
          paramInt = i;
          break;
        case 2:
          localbzc.Title = locala.BTU.readString();
          AppMethodBeat.o(28653);
          paramInt = i;
          break;
        case 3:
          localbzc.vEA = locala.BTU.readString();
          AppMethodBeat.o(28653);
          paramInt = i;
          break;
        case 4:
          localbzc.ndb = locala.BTU.readString();
          AppMethodBeat.o(28653);
          paramInt = i;
          break;
        case 5:
          localbzc.wdO = locala.BTU.readString();
          AppMethodBeat.o(28653);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28653);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzc
 * JD-Core Version:    0.6.2
 */