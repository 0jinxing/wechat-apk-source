package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abo extends com.tencent.mm.bt.a
{
  public String desc;
  public String info;
  public String thumbUrl;
  public String title;
  public boolean wfS = false;
  public boolean wfT = false;
  public boolean wiq = false;
  public boolean wir = false;

  public final abo alM(String paramString)
  {
    this.title = paramString;
    this.wfS = true;
    return this;
  }

  public final abo alN(String paramString)
  {
    this.desc = paramString;
    this.wfT = true;
    return this;
  }

  public final abo alO(String paramString)
  {
    this.thumbUrl = paramString;
    this.wiq = true;
    return this;
  }

  public final abo alP(String paramString)
  {
    this.info = paramString;
    this.wir = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51415);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.thumbUrl != null)
        paramArrayOfObject.e(3, this.thumbUrl);
      if (this.info != null)
        paramArrayOfObject.e(4, this.info);
      AppMethodBeat.o(51415);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label444;
    label444: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      paramInt = i;
      if (this.thumbUrl != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.thumbUrl);
      i = paramInt;
      if (this.info != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.info);
      AppMethodBeat.o(51415);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51415);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abo localabo = (abo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51415);
          break;
        case 1:
          localabo.title = locala.BTU.readString();
          localabo.wfS = true;
          AppMethodBeat.o(51415);
          paramInt = i;
          break;
        case 2:
          localabo.desc = locala.BTU.readString();
          localabo.wfT = true;
          AppMethodBeat.o(51415);
          paramInt = i;
          break;
        case 3:
          localabo.thumbUrl = locala.BTU.readString();
          localabo.wiq = true;
          AppMethodBeat.o(51415);
          paramInt = i;
          break;
        case 4:
          localabo.info = locala.BTU.readString();
          localabo.wir = true;
          AppMethodBeat.o(51415);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51415);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abo
 * JD-Core Version:    0.6.2
 */