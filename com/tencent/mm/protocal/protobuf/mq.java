package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class mq extends com.tencent.mm.bt.a
{
  public String cIY;
  public String title;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28348);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      if (this.cIY != null)
        paramArrayOfObject.e(3, this.cIY);
      AppMethodBeat.o(28348);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.f(1, this.url) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.title);
      i = paramInt;
      if (this.cIY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cIY);
      AppMethodBeat.o(28348);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28348);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mq localmq = (mq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28348);
          break;
        case 1:
          localmq.url = locala.BTU.readString();
          AppMethodBeat.o(28348);
          paramInt = i;
          break;
        case 2:
          localmq.title = locala.BTU.readString();
          AppMethodBeat.o(28348);
          paramInt = i;
          break;
        case 3:
          localmq.cIY = locala.BTU.readString();
          AppMethodBeat.o(28348);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28348);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mq
 * JD-Core Version:    0.6.2
 */