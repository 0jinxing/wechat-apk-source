package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctx extends com.tencent.mm.bt.a
{
  public String Title;
  public String ncM;
  public long vIs;
  public String wyw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28734);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Talker");
        AppMethodBeat.o(28734);
        throw paramArrayOfObject;
      }
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(28734);
        throw paramArrayOfObject;
      }
      if (this.ncM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Content");
        AppMethodBeat.o(28734);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.ncM != null)
        paramArrayOfObject.e(3, this.ncM);
      paramArrayOfObject.ai(4, this.vIs);
      AppMethodBeat.o(28734);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label562;
    label562: for (i = e.a.a.b.b.a.f(1, this.wyw) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ncM);
      paramInt = i + e.a.a.b.b.a.o(4, this.vIs);
      AppMethodBeat.o(28734);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Talker");
          AppMethodBeat.o(28734);
          throw paramArrayOfObject;
        }
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(28734);
          throw paramArrayOfObject;
        }
        if (this.ncM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Content");
          AppMethodBeat.o(28734);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28734);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctx localctx = (ctx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28734);
          break;
        case 1:
          localctx.wyw = locala.BTU.readString();
          AppMethodBeat.o(28734);
          paramInt = i;
          break;
        case 2:
          localctx.Title = locala.BTU.readString();
          AppMethodBeat.o(28734);
          paramInt = i;
          break;
        case 3:
          localctx.ncM = locala.BTU.readString();
          AppMethodBeat.o(28734);
          paramInt = i;
          break;
        case 4:
          localctx.vIs = locala.BTU.ve();
          AppMethodBeat.o(28734);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28734);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctx
 * JD-Core Version:    0.6.2
 */