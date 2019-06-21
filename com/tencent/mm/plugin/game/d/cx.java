package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cx extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String fKh;
  public String mZL;
  public String mZi;
  public String mZj;
  public String ncH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111664);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ncH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppName");
        AppMethodBeat.o(111664);
        throw paramArrayOfObject;
      }
      if (this.ncH != null)
        paramArrayOfObject.e(1, this.ncH);
      if (this.mZi != null)
        paramArrayOfObject.e(2, this.mZi);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.mZL != null)
        paramArrayOfObject.e(5, this.mZL);
      if (this.mZj != null)
        paramArrayOfObject.e(6, this.mZj);
      if (this.fKh != null)
        paramArrayOfObject.e(7, this.fKh);
      AppMethodBeat.o(111664);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ncH == null)
        break label665;
    label665: for (paramInt = e.a.a.b.b.a.f(1, this.ncH) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZi != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZi);
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Title);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Desc);
      int j = i;
      if (this.mZL != null)
        j = i + e.a.a.b.b.a.f(5, this.mZL);
      paramInt = j;
      if (this.mZj != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.mZj);
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.fKh);
      AppMethodBeat.o(111664);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ncH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppName");
          AppMethodBeat.o(111664);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111664);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cx localcx = (cx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111664);
          break;
        case 1:
          localcx.ncH = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        case 2:
          localcx.mZi = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        case 3:
          localcx.Title = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        case 4:
          localcx.Desc = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        case 5:
          localcx.mZL = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        case 6:
          localcx.mZj = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        case 7:
          localcx.fKh = locala.BTU.readString();
          AppMethodBeat.o(111664);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111664);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cx
 * JD-Core Version:    0.6.2
 */