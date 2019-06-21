package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class j extends com.tencent.mm.bt.a
{
  public String Desc;
  public String IconUrl;
  public String Title;
  public String mZL;
  public int mZN;
  public String mZj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111550);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.IconUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconUrl");
        AppMethodBeat.o(111550);
        throw paramArrayOfObject;
      }
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111550);
        throw paramArrayOfObject;
      }
      if (this.mZj == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: JumpUrl");
        AppMethodBeat.o(111550);
        throw paramArrayOfObject;
      }
      if (this.IconUrl != null)
        paramArrayOfObject.e(1, this.IconUrl);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(3, this.Desc);
      if (this.mZj != null)
        paramArrayOfObject.e(4, this.mZj);
      paramArrayOfObject.iz(5, this.mZN);
      if (this.mZL != null)
        paramArrayOfObject.e(6, this.mZL);
      AppMethodBeat.o(111550);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.IconUrl == null)
        break label674;
    label674: for (paramInt = e.a.a.b.b.a.f(1, this.IconUrl) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Desc);
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZj);
      i += e.a.a.b.b.a.bs(5, this.mZN);
      paramInt = i;
      if (this.mZL != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.mZL);
      AppMethodBeat.o(111550);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.IconUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconUrl");
          AppMethodBeat.o(111550);
          throw paramArrayOfObject;
        }
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111550);
          throw paramArrayOfObject;
        }
        if (this.mZj == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: JumpUrl");
          AppMethodBeat.o(111550);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111550);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111550);
          break;
        case 1:
          localj.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(111550);
          paramInt = i;
          break;
        case 2:
          localj.Title = locala.BTU.readString();
          AppMethodBeat.o(111550);
          paramInt = i;
          break;
        case 3:
          localj.Desc = locala.BTU.readString();
          AppMethodBeat.o(111550);
          paramInt = i;
          break;
        case 4:
          localj.mZj = locala.BTU.readString();
          AppMethodBeat.o(111550);
          paramInt = i;
          break;
        case 5:
          localj.mZN = locala.BTU.vd();
          AppMethodBeat.o(111550);
          paramInt = i;
          break;
        case 6:
          localj.mZL = locala.BTU.readString();
          AppMethodBeat.o(111550);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111550);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.j
 * JD-Core Version:    0.6.2
 */