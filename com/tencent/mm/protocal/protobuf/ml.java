package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ml extends com.tencent.mm.bt.a
{
  public String Title;
  public String Url;
  public String vQl;
  public String vQm;
  public int vQn;
  public String vQo;
  public int vQp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124298);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(124298);
        throw paramArrayOfObject;
      }
      if (this.Url == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Url");
        AppMethodBeat.o(124298);
        throw paramArrayOfObject;
      }
      if (this.vQl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Position");
        AppMethodBeat.o(124298);
        throw paramArrayOfObject;
      }
      if (this.vQm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DetailInfo");
        AppMethodBeat.o(124298);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Url != null)
        paramArrayOfObject.e(2, this.Url);
      if (this.vQl != null)
        paramArrayOfObject.e(3, this.vQl);
      if (this.vQm != null)
        paramArrayOfObject.e(4, this.vQm);
      paramArrayOfObject.iz(5, this.vQn);
      if (this.vQo != null)
        paramArrayOfObject.e(6, this.vQo);
      paramArrayOfObject.iz(7, this.vQp);
      AppMethodBeat.o(124298);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label769;
    label769: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Url);
      i = paramInt;
      if (this.vQl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vQl);
      paramInt = i;
      if (this.vQm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vQm);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vQn);
      paramInt = i;
      if (this.vQo != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vQo);
      paramInt += e.a.a.b.b.a.bs(7, this.vQp);
      AppMethodBeat.o(124298);
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
          AppMethodBeat.o(124298);
          throw paramArrayOfObject;
        }
        if (this.Url == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Url");
          AppMethodBeat.o(124298);
          throw paramArrayOfObject;
        }
        if (this.vQl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Position");
          AppMethodBeat.o(124298);
          throw paramArrayOfObject;
        }
        if (this.vQm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DetailInfo");
          AppMethodBeat.o(124298);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124298);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ml localml = (ml)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124298);
          break;
        case 1:
          localml.Title = locala.BTU.readString();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        case 2:
          localml.Url = locala.BTU.readString();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        case 3:
          localml.vQl = locala.BTU.readString();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        case 4:
          localml.vQm = locala.BTU.readString();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        case 5:
          localml.vQn = locala.BTU.vd();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        case 6:
          localml.vQo = locala.BTU.readString();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        case 7:
          localml.vQp = locala.BTU.vd();
          AppMethodBeat.o(124298);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124298);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ml
 * JD-Core Version:    0.6.2
 */