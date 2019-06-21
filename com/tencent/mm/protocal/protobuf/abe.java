package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abe extends com.tencent.mm.bt.a
{
  public String desc;
  public String info;
  public String thumbUrl;
  public String title;
  public int type;
  public boolean wfS = false;
  public boolean wfT = false;
  public boolean wiq = false;
  public boolean wir = false;
  public boolean wis = false;

  public final abe LK(int paramInt)
  {
    this.type = paramInt;
    this.wis = true;
    return this;
  }

  public final abe alw(String paramString)
  {
    this.title = paramString;
    this.wfS = true;
    return this;
  }

  public final abe alx(String paramString)
  {
    this.desc = paramString;
    this.wfT = true;
    return this;
  }

  public final abe aly(String paramString)
  {
    this.thumbUrl = paramString;
    this.wiq = true;
    return this;
  }

  public final abe alz(String paramString)
  {
    this.info = paramString;
    this.wir = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51403);
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
      if (this.wis == true)
        paramArrayOfObject.iz(5, this.type);
      AppMethodBeat.o(51403);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label513;
    label513: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.desc);
      i = paramInt;
      if (this.thumbUrl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.thumbUrl);
      paramInt = i;
      if (this.info != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.info);
      i = paramInt;
      if (this.wis == true)
        i = paramInt + e.a.a.b.b.a.bs(5, this.type);
      AppMethodBeat.o(51403);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51403);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abe localabe = (abe)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51403);
          break;
        case 1:
          localabe.title = locala.BTU.readString();
          localabe.wfS = true;
          AppMethodBeat.o(51403);
          paramInt = i;
          break;
        case 2:
          localabe.desc = locala.BTU.readString();
          localabe.wfT = true;
          AppMethodBeat.o(51403);
          paramInt = i;
          break;
        case 3:
          localabe.thumbUrl = locala.BTU.readString();
          localabe.wiq = true;
          AppMethodBeat.o(51403);
          paramInt = i;
          break;
        case 4:
          localabe.info = locala.BTU.readString();
          localabe.wir = true;
          AppMethodBeat.o(51403);
          paramInt = i;
          break;
        case 5:
          localabe.type = locala.BTU.vd();
          localabe.wis = true;
          AppMethodBeat.o(51403);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51403);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abe
 * JD-Core Version:    0.6.2
 */