package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class add extends com.tencent.mm.bt.a
{
  public String Desc;
  public String ThumbUrl;
  public String Title;
  public String fKh;
  public String ncH;
  public int vNm;
  public String wkC;
  public int wkX;
  public int wkY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112434);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(112434);
        throw paramArrayOfObject;
      }
      if (this.Desc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Desc");
        AppMethodBeat.o(112434);
        throw paramArrayOfObject;
      }
      if (this.ThumbUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbUrl");
        AppMethodBeat.o(112434);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(3, this.ThumbUrl);
      if (this.wkC != null)
        paramArrayOfObject.e(4, this.wkC);
      paramArrayOfObject.iz(5, this.wkX);
      paramArrayOfObject.iz(6, this.wkY);
      if (this.fKh != null)
        paramArrayOfObject.e(7, this.fKh);
      paramArrayOfObject.iz(8, this.vNm);
      if (this.ncH != null)
        paramArrayOfObject.e(9, this.ncH);
      AppMethodBeat.o(112434);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label835;
    label835: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Desc);
      paramInt = i;
      if (this.ThumbUrl != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ThumbUrl);
      i = paramInt;
      if (this.wkC != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wkC);
      i = i + e.a.a.b.b.a.bs(5, this.wkX) + e.a.a.b.b.a.bs(6, this.wkY);
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.fKh);
      i = paramInt + e.a.a.b.b.a.bs(8, this.vNm);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.ncH);
      AppMethodBeat.o(112434);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(112434);
          throw paramArrayOfObject;
        }
        if (this.Desc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Desc");
          AppMethodBeat.o(112434);
          throw paramArrayOfObject;
        }
        if (this.ThumbUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbUrl");
          AppMethodBeat.o(112434);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(112434);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        add localadd = (add)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112434);
          break;
        case 1:
          localadd.Title = locala.BTU.readString();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 2:
          localadd.Desc = locala.BTU.readString();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 3:
          localadd.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 4:
          localadd.wkC = locala.BTU.readString();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 5:
          localadd.wkX = locala.BTU.vd();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 6:
          localadd.wkY = locala.BTU.vd();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 7:
          localadd.fKh = locala.BTU.readString();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 8:
          localadd.vNm = locala.BTU.vd();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        case 9:
          localadd.ncH = locala.BTU.readString();
          AppMethodBeat.o(112434);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112434);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.add
 * JD-Core Version:    0.6.2
 */