package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bt extends com.tencent.mm.bt.a
{
  public String Title;
  public String mZm;
  public String naq;
  public String ncC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111626);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ncC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: LogoURL");
        AppMethodBeat.o(111626);
        throw paramArrayOfObject;
      }
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111626);
        throw paramArrayOfObject;
      }
      if (this.naq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Detail");
        AppMethodBeat.o(111626);
        throw paramArrayOfObject;
      }
      if (this.mZm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: WebURL");
        AppMethodBeat.o(111626);
        throw paramArrayOfObject;
      }
      if (this.ncC != null)
        paramArrayOfObject.e(1, this.ncC);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.naq != null)
        paramArrayOfObject.e(3, this.naq);
      if (this.mZm != null)
        paramArrayOfObject.e(4, this.mZm);
      AppMethodBeat.o(111626);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ncC == null)
        break label612;
    label612: for (paramInt = e.a.a.b.b.a.f(1, this.ncC) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      paramInt = i;
      if (this.naq != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.naq);
      i = paramInt;
      if (this.mZm != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZm);
      AppMethodBeat.o(111626);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ncC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: LogoURL");
          AppMethodBeat.o(111626);
          throw paramArrayOfObject;
        }
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111626);
          throw paramArrayOfObject;
        }
        if (this.naq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Detail");
          AppMethodBeat.o(111626);
          throw paramArrayOfObject;
        }
        if (this.mZm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: WebURL");
          AppMethodBeat.o(111626);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111626);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bt localbt = (bt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111626);
          break;
        case 1:
          localbt.ncC = locala.BTU.readString();
          AppMethodBeat.o(111626);
          paramInt = i;
          break;
        case 2:
          localbt.Title = locala.BTU.readString();
          AppMethodBeat.o(111626);
          paramInt = i;
          break;
        case 3:
          localbt.naq = locala.BTU.readString();
          AppMethodBeat.o(111626);
          paramInt = i;
          break;
        case 4:
          localbt.mZm = locala.BTU.readString();
          AppMethodBeat.o(111626);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111626);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bt
 * JD-Core Version:    0.6.2
 */